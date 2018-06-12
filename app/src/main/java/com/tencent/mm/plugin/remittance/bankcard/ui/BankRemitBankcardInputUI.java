package com.tencent.mm.plugin.remittance.bankcard.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.widget.ListPopupWindow;
import android.widget.Button;
import android.widget.Filter.FilterListener;
import android.widget.Toast;
import com.tencent.mm.ab.l;
import com.tencent.mm.g.a.sy;
import com.tencent.mm.kernel.e;
import com.tencent.mm.plugin.remittance.bankcard.a.k;
import com.tencent.mm.plugin.remittance.bankcard.a.m;
import com.tencent.mm.plugin.remittance.bankcard.model.BankcardElemParcel;
import com.tencent.mm.plugin.remittance.bankcard.model.EnterTimeParcel;
import com.tencent.mm.plugin.remittance.bankcard.model.TransferRecordParcel;
import com.tencent.mm.plugin.remittance.bankcard.model.c;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.h;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.pluginsdk.ui.wallet.WalletIconImageView;
import com.tencent.mm.protocal.c.bec;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.wallet_core.c.h.a;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@com.tencent.mm.ui.base.a(1)
public class BankRemitBankcardInputUI
  extends BankRemitBaseUI
{
  private Button eWk;
  private com.tencent.mm.ui.widget.a.d laa;
  private WalletFormView muE;
  private WalletFormView muF;
  private WalletFormView muG;
  private WalletFormView muH;
  private ListPopupWindow muI;
  private c muJ;
  private Filter.FilterListener muK;
  private ArrayList<TransferRecordParcel> muL;
  private ArrayList<TransferRecordParcel> muM;
  private String muN;
  private String muO;
  private String muP;
  private String muQ;
  private String muR;
  private String muS;
  private EnterTimeParcel muT;
  private BankcardElemParcel muU;
  private TransferRecordParcel muV;
  private boolean muW = true;
  private boolean muX = false;
  private boolean muY = false;
  private boolean muZ = false;
  private CdnImageView mux;
  private com.tencent.mm.plugin.remittance.bankcard.a.g mva = null;
  private boolean mvb = false;
  private boolean mvc = false;
  private boolean mvd = true;
  
  private void U(String paramString1, String paramString2, String paramString3)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BankRemitBankcardInputUI", "do query bankinfo by seq: %s", new Object[] { paramString1 });
    a(new com.tencent.mm.plugin.remittance.bankcard.a.a(paramString1, paramString2, paramString3), false, false);
  }
  
  private static void a(TransferRecordParcel paramTransferRecordParcel, List<TransferRecordParcel> paramList)
  {
    int i;
    if (paramList != null) {
      i = paramList.size() - 1;
    }
    for (;;)
    {
      if (i >= 0)
      {
        TransferRecordParcel localTransferRecordParcel = (TransferRecordParcel)paramList.get(i);
        if (localTransferRecordParcel.muA.equals(paramTransferRecordParcel.muA)) {
          localTransferRecordParcel.muD = paramTransferRecordParcel.muD;
        }
      }
      else
      {
        return;
      }
      i -= 1;
    }
  }
  
  private void bqU()
  {
    if (this.muV != null)
    {
      this.muE.setText(this.muV.muC);
      this.muX = true;
      this.muF.setText(getString(a.i.bank_remit_bank_card_mask_text, new Object[] { this.muV.muB }));
      this.muG.setText(this.muV.knE);
      this.mux.setUrl(this.muV.mug);
      this.muF.bqm();
      this.muF.setContentEnabled(false);
      this.muY = true;
      this.muG.setClickable(false);
      this.muZ = true;
    }
  }
  
  private void bqV()
  {
    if (this.muU != null)
    {
      this.muG.setText(this.muU.knE);
      this.mux.setUrl(this.muU.mug);
    }
  }
  
  private void bqW()
  {
    if (this.muT != null)
    {
      if (!bi.oW(this.muT.dxh)) {
        this.muH.setContentTextColor(Color.parseColor(this.muT.dxh));
      }
      for (;;)
      {
        this.muH.setText(this.muT.muo);
        this.muH.setVisibility(0);
        return;
        this.muH.setContentTextColorRes(a.c.black);
      }
    }
    if (!bi.oW(this.muU.muj))
    {
      this.muH.setText(this.muU.muj);
      if (!bi.oW(this.muU.muk)) {
        this.muH.setContentTextColor(Color.parseColor(this.muU.muk));
      }
      for (;;)
      {
        this.muH.setVisibility(0);
        return;
        this.muH.setContentTextColorRes(a.c.black);
      }
    }
    this.muH.setVisibility(8);
  }
  
  private void bqX()
  {
    if (this.muH.getVisibility() == 0)
    {
      this.muG.setBackground(getResources().getDrawable(a.e.wallet_clickable_bg));
      return;
    }
    this.muG.setBackground(getResources().getDrawable(a.e.bank_remit_form_item_corner_bg));
  }
  
  private void bqY()
  {
    if ((!bi.oW(this.muE.getText())) && (!this.muE.getText().trim().isEmpty()) && (!bi.oW(this.muF.getText())) && (!this.muF.getText().trim().isEmpty()) && (this.muF.ZF()) && (!bi.oW(this.muG.getText())) && (this.muH.getVisibility() == 0) && (!bi.oW(this.muH.getText())) && (this.muU != null) && (bi.oW(this.muU.mul)))
    {
      this.eWk.setEnabled(true);
      return;
    }
    this.eWk.setEnabled(false);
  }
  
  private void bqZ()
  {
    if ((this.muU != null) && (!bi.oW(this.muU.muj))) {
      this.muT = null;
    }
    EnterTimeParcel localEnterTimeParcel;
    do
    {
      Iterator localIterator;
      do
      {
        return;
        while ((this.muU == null) || (this.muU.mum == null)) {}
        localIterator = this.muU.mum.iterator();
      } while (!localIterator.hasNext());
      localEnterTimeParcel = (EnterTimeParcel)localIterator.next();
    } while (localEnterTimeParcel.muq <= 0);
    this.muT = localEnterTimeParcel;
  }
  
  private void ho(boolean paramBoolean)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BankRemitBankcardInputUI", "do fetch transfer record: %s", new Object[] { Boolean.valueOf(paramBoolean) });
    if (paramBoolean)
    {
      a(new m(), true, false);
      return;
    }
    a(new m(), false, false);
  }
  
  private static void m(String paramString, List<TransferRecordParcel> paramList)
  {
    int i;
    if (paramList != null) {
      i = paramList.size() - 1;
    }
    for (;;)
    {
      if (i >= 0)
      {
        TransferRecordParcel localTransferRecordParcel = (TransferRecordParcel)paramList.get(i);
        if (localTransferRecordParcel.muA.equals(paramString)) {
          paramList.remove(localTransferRecordParcel);
        }
      }
      else
      {
        return;
      }
      i -= 1;
    }
  }
  
  public final boolean d(int paramInt1, int paramInt2, final String paramString, l paraml)
  {
    if ((paraml instanceof com.tencent.mm.plugin.remittance.bankcard.a.a))
    {
      paramString = (com.tencent.mm.plugin.remittance.bankcard.a.a)paraml;
      if (!paramString.mtT.equals(this.muV.muA))
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BankRemitBankcardInputUI", "outdated request: %s, %s", new Object[] { paramString.mtT, this.muP });
        return true;
      }
      paramString.a(new BankRemitBankcardInputUI.3(this, paramString)).b(new BankRemitBankcardInputUI.2(this, paramString)).c(new BankRemitBankcardInputUI.28(this));
    }
    for (;;)
    {
      return false;
      if ((paraml instanceof com.tencent.mm.plugin.remittance.bankcard.a.g))
      {
        paramString = (com.tencent.mm.plugin.remittance.bankcard.a.g)paraml;
        if (paramString == this.mva)
        {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BankRemitBankcardInputUI", "reset pending scene");
          this.mva = null;
        }
        if (!paramString.bKg.equals(this.muF.getMD5Value()))
        {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BankRemitBankcardInputUI", "outdated card request: %s, %s", new Object[] { paramString.bKg, this.muF.getMD5Value() });
          return true;
        }
        paramString.a(new BankRemitBankcardInputUI.6(this, paramString)).b(new BankRemitBankcardInputUI.5(this, paramString)).c(new BankRemitBankcardInputUI.4(this));
      }
      else if ((paraml instanceof m))
      {
        paramString = (m)paraml;
        this.mvc = true;
        paramString.a(new BankRemitBankcardInputUI.9(this, paramString)).b(new h.a()
        {
          public final void g(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, l paramAnonymousl)
          {
            com.tencent.mm.sdk.platformtools.x.e("MicroMsg.BankRemitBankcardInputUI", "records response error: %s, %s", new Object[] { Integer.valueOf(paramString.mue.hUm), paramString.mue.hUn });
            if (!bi.oW(paramString.mue.hUn)) {
              Toast.makeText(BankRemitBankcardInputUI.this, paramString.mue.hUn, 1).show();
            }
            BankRemitBankcardInputUI.b(BankRemitBankcardInputUI.this, true);
          }
        }).c(new BankRemitBankcardInputUI.7(this));
      }
      else if ((paraml instanceof com.tencent.mm.plugin.remittance.bankcard.a.d))
      {
        paramString = (com.tencent.mm.plugin.remittance.bankcard.a.d)paraml;
        paramString.a(new BankRemitBankcardInputUI.13(this, paramString)).b(new BankRemitBankcardInputUI.11(this, paramString)).c(new h.a()
        {
          public final void g(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, l paramAnonymousl)
          {
            com.tencent.mm.sdk.platformtools.x.e("MicroMsg.BankRemitBankcardInputUI", "net error: %s", new Object[] { paramAnonymousl });
          }
        });
      }
      else if ((paraml instanceof k))
      {
        paramString = (k)paraml;
        paramString.a(new BankRemitBankcardInputUI.16(this, paramString)).b(new BankRemitBankcardInputUI.15(this, paramString)).c(new BankRemitBankcardInputUI.14(this));
      }
    }
  }
  
  protected final int getLayoutId()
  {
    return a.g.bank_remit_bankcard_input_ui;
  }
  
  protected final void initView()
  {
    this.muE = ((WalletFormView)findViewById(a.f.brbi_name_et));
    this.muF = ((WalletFormView)findViewById(a.f.brbi_card_et));
    this.muG = ((WalletFormView)findViewById(a.f.brbi_bank_name_et));
    this.mux = ((CdnImageView)this.muG.findViewById(a.f.wallet_left_icon));
    this.muH = ((WalletFormView)findViewById(a.f.brbi_arrive_time_et));
    this.eWk = ((Button)findViewById(a.f.brbi_next_btn));
    this.muE.setFilterChar("\\x20\\t\\r\\n".toCharArray());
    this.muE.a(new BankRemitBankcardInputUI.22(this));
    this.muE.setOnEditorActionListener(new BankRemitBankcardInputUI.23(this));
    this.muE.cDV();
    com.tencent.mm.wallet_core.ui.formview.a.b(this.muF);
    a(this.muF, 2, false, true);
    this.muF.a(new BankRemitBankcardInputUI.24(this));
    this.muG.setOnClickListener(new BankRemitBankcardInputUI.25(this));
    this.muH.setOnClickListener(new BankRemitBankcardInputUI.26(this));
    this.eWk.setOnClickListener(new BankRemitBankcardInputUI.27(this));
    this.muE.getInfoIv().setVisibility(0);
    this.muE.getInfoIv().setClickable(true);
    this.muE.getInfoIv().setEnabled(true);
    this.muE.getInfoIv().setOnClickListener(new BankRemitBankcardInputUI.20(this));
    bqY();
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    Object localObject;
    if (paramInt1 == 1)
    {
      String str;
      Iterator localIterator;
      if (paramInt2 == -1)
      {
        this.muW = false;
        this.muP = paramIntent.getStringExtra("key_bank_card_seqno");
        str = this.muP;
        if (this.muL == null) {
          break label235;
        }
        localIterator = this.muL.iterator();
        do
        {
          if (!localIterator.hasNext()) {
            break;
          }
          localObject = (TransferRecordParcel)localIterator.next();
        } while (!((TransferRecordParcel)localObject).muA.equals(str));
      }
      for (;;)
      {
        this.muV = ((TransferRecordParcel)localObject);
        bqU();
        bqY();
        if (this.muV != null) {
          U(this.muV.muA, this.muO, this.muV.lMV);
        }
        ah.i(new BankRemitBankcardInputUI.17(this), 50L);
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BankRemitBankcardInputUI", "resultCode: %s", new Object[] { Integer.valueOf(paramInt2) });
        if (paramIntent == null) {
          break label435;
        }
        localObject = paramIntent.getStringArrayListExtra("key_delete_seq_no_list");
        paramIntent = paramIntent.getParcelableArrayListExtra("key_modified_record_list");
        if (localObject == null) {
          break;
        }
        localObject = ((ArrayList)localObject).iterator();
        while (((Iterator)localObject).hasNext())
        {
          str = (String)((Iterator)localObject).next();
          m(str, this.muL);
          m(str, this.muM);
        }
        label235:
        if (this.muM != null)
        {
          localIterator = this.muM.iterator();
          for (;;)
          {
            if (localIterator.hasNext())
            {
              localObject = (TransferRecordParcel)localIterator.next();
              if (((TransferRecordParcel)localObject).muA.equals(str)) {
                break;
              }
            }
          }
        }
        localObject = null;
      }
      if (paramIntent != null)
      {
        paramIntent = paramIntent.iterator();
        while (paramIntent.hasNext())
        {
          localObject = (TransferRecordParcel)paramIntent.next();
          a((TransferRecordParcel)localObject, this.muL);
          a((TransferRecordParcel)localObject, this.muM);
        }
      }
    }
    else
    {
      if (paramInt1 != 3) {
        break label458;
      }
      if (paramInt2 == -1)
      {
        paramInt1 = paramIntent.getIntExtra("key_enter_time_scene", -1);
        if ((this.muU == null) || (this.muU.mum == null)) {
          break label436;
        }
        paramIntent = this.muU.mum.iterator();
        while (paramIntent.hasNext())
        {
          localObject = (EnterTimeParcel)paramIntent.next();
          if (((EnterTimeParcel)localObject).mun == paramInt1)
          {
            this.muT = ((EnterTimeParcel)localObject);
            bqW();
            bqY();
          }
        }
      }
    }
    label435:
    label436:
    label458:
    do
    {
      return;
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.BankRemitBankcardInputUI", "can't find the right enter scene: %d", new Object[] { Integer.valueOf(paramInt1) });
      break;
      if (paramInt1 != 2) {
        break label503;
      }
    } while (paramInt2 != -1);
    this.muU = ((BankcardElemParcel)paramIntent.getParcelableExtra("key_bank_card_elem_parcel"));
    bqV();
    bqZ();
    bqW();
    bqX();
    bqY();
    return;
    label503:
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    cqh();
    initView();
    paramBundle = new sy();
    paramBundle.cdO.buF = "12";
    paramBundle.bJX = new BankRemitBankcardInputUI.1(this, paramBundle);
    com.tencent.mm.sdk.b.a.sFg.m(paramBundle);
    jr(1348);
    jr(1542);
    jr(1378);
    jr(1349);
    jr(1280);
    this.muS = ((String)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sZk, ""));
    ho(false);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BankRemitBankcardInputUI", "do operation");
    a(new k(), false, false);
    setMMTitle(a.i.bank_remit_title);
    addIconOptionMenu(0, a.h.actionbar_icon_dark_more, new BankRemitBankcardInputUI.12(this));
    com.tencent.mm.plugin.report.service.h.mEJ.h(14673, new Object[] { Integer.valueOf(1) });
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    js(1348);
    js(1542);
    js(1378);
    js(1349);
    js(1280);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/remittance/bankcard/ui/BankRemitBankcardInputUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */