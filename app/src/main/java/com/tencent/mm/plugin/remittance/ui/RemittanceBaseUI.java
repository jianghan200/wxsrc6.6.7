package com.tencent.mm.plugin.remittance.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.tencent.mm.aa.f;
import com.tencent.mm.aa.f.c;
import com.tencent.mm.aa.k;
import com.tencent.mm.ab.l;
import com.tencent.mm.bg.d;
import com.tencent.mm.g.a.fo;
import com.tencent.mm.g.a.fo.a;
import com.tencent.mm.g.a.fp;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.am.a;
import com.tencent.mm.model.am.b;
import com.tencent.mm.plugin.remittance.model.ab;
import com.tencent.mm.plugin.remittance.model.ac;
import com.tencent.mm.plugin.remittance.model.t;
import com.tencent.mm.plugin.wallet_core.c.ae;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;
import com.tencent.mm.ui.widget.a.c.a;
import com.tencent.mm.wallet_core.c.u;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import com.tenpay.android.wechat.MyKeyboardWindow;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

@com.tencent.mm.ui.base.a(19)
public abstract class RemittanceBaseUI
  extends WalletBaseUI
  implements f.c
{
  public String cYO;
  protected String cZG;
  private final int eCE = com.tencent.mm.bp.a.fromDPToPix(com.tencent.mm.sdk.platformtools.ad.getContext(), 270);
  protected Button eWk;
  public int fdx;
  protected WalletFormView hXD;
  private int kTw;
  protected ScrollView klj;
  private double mxI;
  protected com.tencent.mm.plugin.wallet.a myP = null;
  public double myQ;
  protected String myR;
  protected String myS;
  protected String myT;
  public int myU;
  public String myV;
  protected ImageView myW;
  protected TextView myX;
  protected TextView myY;
  protected TextView myZ;
  protected TextView mza;
  protected TextView mzb;
  private TextView mzc;
  private TextView mzd;
  protected TextView mze;
  private LinearLayout mzf;
  private LinearLayout mzg;
  protected String mzh;
  private String mzi;
  private String mzj;
  protected String mzk;
  protected String mzl = null;
  protected String mzm = null;
  protected int mzn;
  private int mzo;
  protected String mzp;
  private Map<String, a> mzq = new HashMap();
  private String mzr;
  protected boolean mzs = false;
  private boolean mzt = false;
  private boolean mzu = false;
  private boolean mzv = false;
  private boolean mzw = false;
  private com.tencent.mm.sdk.b.c mzx = new RemittanceBaseUI.11(this);
  private com.tencent.mm.sdk.b.c<fp> mzy = new RemittanceBaseUI.14(this);
  
  private void a(boolean paramBoolean, Intent paramIntent)
  {
    if (paramBoolean)
    {
      if (this.mzs) {
        com.tencent.mm.plugin.report.service.h.mEJ.h(15386, new Object[] { Integer.valueOf(3), Integer.valueOf(1) });
      }
      paramIntent = paramIntent.getStringExtra("key_trans_id");
      if (bi.oW(this.mzr)) {
        this.mzr = paramIntent;
      }
      if ((this.myU != 33) && (this.myU != 32))
      {
        paramIntent = this.cYO;
        if (!bi.oW(paramIntent))
        {
          Object localObject = ac.brg();
          com.tencent.mm.sdk.platformtools.x.d("Micromsg.RemittanceLogic", "cur friendsListStr=" + (String)localObject);
          StringBuilder localStringBuilder = new StringBuilder();
          if (!bi.oW((String)localObject))
          {
            localObject = ((String)localObject).split(",");
            if (localObject != null)
            {
              int i = 0;
              int k;
              for (int j = 0; i < localObject.length; j = k)
              {
                k = j;
                if (!paramIntent.equals(localObject[i]))
                {
                  localStringBuilder.append(localObject[i]);
                  localStringBuilder.append(",");
                  k = j + 1;
                  if (k >= 4) {
                    break;
                  }
                }
                i += 1;
              }
            }
          }
          localStringBuilder.insert(0, ",");
          localStringBuilder.insert(0, paramIntent);
          localStringBuilder.deleteCharAt(localStringBuilder.length() - 1);
          com.tencent.mm.sdk.platformtools.x.d("Micromsg.RemittanceLogic", "new friendsListStr=" + localStringBuilder.toString());
          g.Ek();
          g.Ei().DT().set(327733, localStringBuilder.toString());
          g.Ek();
          g.Ei().DT().lm(true);
        }
      }
      if (this.mxI == 0.0D)
      {
        if (this.fdx != 1) {
          break label363;
        }
        com.tencent.mm.plugin.report.service.h.mEJ.h(12689, new Object[] { Integer.valueOf(17), Integer.valueOf(1) });
      }
      for (;;)
      {
        finish();
        return;
        label363:
        com.tencent.mm.plugin.report.service.h.mEJ.h(12689, new Object[] { Integer.valueOf(8), Integer.valueOf(1) });
      }
    }
    if (this.fdx == 1)
    {
      com.tencent.mm.plugin.report.service.h.mEJ.h(12689, new Object[] { Integer.valueOf(16), Integer.valueOf(1) });
      return;
    }
    com.tencent.mm.plugin.report.service.h.mEJ.h(12689, new Object[] { Integer.valueOf(7), Integer.valueOf(1) });
  }
  
  private boolean a(final com.tencent.mm.plugin.remittance.model.v paramv)
  {
    boolean bool2 = false;
    boolean bool1;
    label174:
    double d;
    Object localObject;
    if (!this.mzt)
    {
      if (!bi.oW(paramv.mxC))
      {
        this.mzt = true;
        com.tencent.mm.ui.base.h.a(this, paramv.mxC, getString(a.i.app_remind), getString(a.i.remittance_continue), getString(a.i.app_cancel), new RemittanceBaseUI.6(this, paramv), new RemittanceBaseUI.7(this));
        bool2 = true;
      }
    }
    else
    {
      bool1 = bool2;
      if (!bool2)
      {
        bool1 = bool2;
        if (!this.mzu)
        {
          if (paramv.mxB <= 0) {
            break label607;
          }
          this.mzu = true;
          com.tencent.mm.ui.base.h.a(this, getString(a.i.remittance_remind_desc, new Object[] { Integer.valueOf(paramv.mxB) }), getString(a.i.app_remind), getString(a.i.remittance_continue), getString(a.i.remittance_open_order_history_action), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              if (!RemittanceBaseUI.a(RemittanceBaseUI.this, paramv)) {
                RemittanceBaseUI.this.a(paramv.bQa, RemittanceBaseUI.this.cYO, RemittanceBaseUI.this.mzk, paramv);
              }
            }
          }, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              com.tencent.mm.wallet_core.a.b(RemittanceBaseUI.this, "ShowOrdersInfoProcess", null);
            }
          });
          bool1 = true;
        }
      }
      bool2 = bool1;
      if (!bool1)
      {
        bool2 = bool1;
        if (!this.mzv)
        {
          if (!paramv.mxH) {
            break label613;
          }
          this.mzv = true;
          int i = this.fdx;
          d = paramv.mxL / 100.0D;
          localObject = paramv.mxJ;
          b.a(this, i, d, paramv.mxK / 100.0D, paramv.mxE / 100.0D, paramv.mxG, new RemittanceBaseUI.10(this, paramv));
          bool2 = true;
        }
      }
      label267:
      bool1 = bool2;
      if (!bool2)
      {
        bool1 = bool2;
        if (!this.mzw) {
          bool1 = b(paramv);
        }
      }
      bool2 = bool1;
      if (!bool1)
      {
        bool2 = bool1;
        if (!bi.oW(paramv.mxQ))
        {
          bool2 = bool1;
          if (!bi.oW(paramv.mxR))
          {
            localObject = com.tencent.mm.wallet_core.ui.e.dx(com.tencent.mm.wallet_core.ui.e.gT(this.cYO), 10);
            if (bi.oW(this.mzk)) {
              break label619;
            }
            localObject = getString(a.i.remittance_collect_block, new Object[] { localObject, this.mzk });
          }
        }
      }
    }
    label607:
    label613:
    label619:
    for (;;)
    {
      String str1 = paramv.bQa;
      String str2 = paramv.mxR;
      String str3 = paramv.mxQ;
      View localView = LayoutInflater.from(this).inflate(a.g.remittance_second_alert_ui, null);
      TextView localTextView1 = (TextView)localView.findViewById(a.f.rsau_title);
      TextView localTextView2 = (TextView)localView.findViewById(a.f.rsau_payee);
      TextView localTextView3 = (TextView)localView.findViewById(a.f.rsau_money);
      localTextView1.setText(str2);
      localTextView2.setText(com.tencent.mm.pluginsdk.ui.d.j.a(this, (CharSequence)localObject, localTextView2.getTextSize()));
      d = bi.getDouble(str3, 0.0D);
      localTextView3.setText(String.format("%s%.2f", new Object[] { com.tencent.mm.wallet_core.c.v.cDm(), Double.valueOf(Double.valueOf(d).doubleValue() / 100.0D) }));
      localObject = new c.a(this);
      ((c.a)localObject).mF(false);
      ((c.a)localObject).Gq(a.i.remittance_second_alert_title);
      ((c.a)localObject).dR(localView);
      ((c.a)localObject).Gt(a.i.remittance_continue);
      ((c.a)localObject).Gu(a.i.button_cancel);
      ((c.a)localObject).a(new RemittanceBaseUI.13(this, str1, paramv));
      ((c.a)localObject).anj().show();
      bool2 = true;
      return bool2;
      bool2 = false;
      break;
      bool1 = false;
      break label174;
      bool2 = false;
      break label267;
    }
  }
  
  private boolean b(com.tencent.mm.plugin.remittance.model.v paramv)
  {
    if ((paramv.cao != null) && (paramv.cao.bOq()))
    {
      this.mzw = true;
      com.tencent.mm.ui.base.h.a(this, paramv.cao.bSc, "", paramv.cao.kRv, paramv.cao.kRu, new RemittanceBaseUI.4(this, paramv), new RemittanceBaseUI.5(this));
      return true;
    }
    return false;
  }
  
  private void brq()
  {
    if ((brv()) && (!bi.oW(this.mzm)) && (this.mzo != 0) && (this.mzn == 1))
    {
      addIconOptionMenu(0, a.e.wallet_qanda_icon, new RemittanceBaseUI.17(this));
      return;
    }
    this.mController.removeAllOptionMenu();
  }
  
  private void brr()
  {
    if ((!bi.oW(this.mzl)) && (this.mzo != 0))
    {
      int i;
      if (this.mzo == 1) {
        i = 2;
      }
      try
      {
        for (;;)
        {
          this.myZ.setText(String.format(this.mzl, new Object[] { Integer.valueOf(i) }));
          this.myZ.setVisibility(0);
          return;
          i = 24;
        }
      }
      catch (Exception localException)
      {
        for (;;)
        {
          com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.RemittanceBaseUI", localException, "", new Object[0]);
          this.myZ.setText(getString(a.i.remittance_hardcode_tips, new Object[] { Integer.valueOf(i) }));
        }
      }
    }
    this.myZ.setText("");
    this.myZ.setVisibility(8);
  }
  
  private void bru()
  {
    ah.A(new RemittanceBaseUI.19(this));
  }
  
  public abstract void a(String paramString1, String paramString2, String paramString3, fo paramfo);
  
  protected final void a(String paramString1, String paramString2, String paramString3, com.tencent.mm.plugin.remittance.model.v paramv)
  {
    Object localObject;
    if (this.myU == 31)
    {
      localObject = this.mzj;
      if (TextUtils.isEmpty((CharSequence)localObject)) {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.RemittanceBaseUI", "msgxml is null");
      }
    }
    else
    {
      localObject = new PayInfo();
      ((PayInfo)localObject).bOd = paramString1;
      ((PayInfo)localObject).bVY = this.myU;
      if (this.kTw > 0) {
        ((PayInfo)localObject).bVU = this.kTw;
      }
      if ((this.fdx != 2) && (this.fdx != 5)) {
        break label746;
      }
    }
    label746:
    for (boolean bool = true;; bool = false)
    {
      paramString1 = new Bundle();
      paramString1.putString("extinfo_key_1", paramString2);
      paramString1.putString("extinfo_key_2", getIntent().getStringExtra("receiver_true_name"));
      paramString1.putString("extinfo_key_3", this.mzh);
      paramString1.putBoolean("extinfo_key_4", bool);
      paramString1.putString("extinfo_key_5", getIntent().getStringExtra("receiver_tips"));
      paramString1.putString("extinfo_key_6", getIntent().getStringExtra("payer_desc"));
      paramString1.putString("extinfo_key_7", this.cZG);
      paramString1.putString("extinfo_key_8", getIntent().getStringExtra("rcvr_new_desc"));
      paramString1.putString("extinfo_key_16", this.mzr);
      if (paramv != null) {
        paramString1.putString("extinfo_key_19", paramv.mxZ);
      }
      if ((this.fdx == 1) && (paramv != null))
      {
        paramString1.putString("extinfo_key_11", paramv.mxN);
        paramString1.putInt("extinfo_key_12", paramv.mxT);
        paramString1.putString("extinfo_key_13", paramv.mxU);
        paramString1.putString("extinfo_key_14", paramv.mxV);
        paramString1.putString("extinfo_key_17", paramv.mxX);
        paramString1.putString("extinfo_key_18", paramv.mxY);
      }
      for (int i = paramv.mxW;; i = 0)
      {
        if (paramv != null) {
          paramString1.putInt("extinfo_key_15", paramv.amount);
        }
        ((PayInfo)localObject).qUL = paramString1;
        paramString1 = new Intent();
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.RemittanceBaseUI", "dynamic code flag: %s", new Object[] { Integer.valueOf(i) });
        if (i == 1)
        {
          paramString1.putExtra("key_pay_info", (Parcelable)localObject);
          paramString1.putExtra("key_rcvr_open_id", this.mzp);
          paramString1.putExtra("key_mch_info", this.myT);
          paramString1.putExtra("from_patch_ui", true);
          paramString1.putExtra("get_dynamic_code_sign", paramv.mxX);
          paramString1.putExtra("get_dynamic_code_extend", paramv.mxY);
          paramString1.putExtra("dynamic_code_spam_wording", paramv.mya);
          paramString1.putExtra("show_paying_wording", paramv.mxZ);
          paramString1.putExtra("key_transfer_qrcode_id", this.myV);
          com.tencent.mm.plugin.report.service.h.mEJ.h(15386, new Object[] { Integer.valueOf(2), Integer.valueOf(1) });
          this.mzx.cht();
          d.b(this, "wallet_payu", ".create.ui.WalletPayUVerifyCodeUI", paramString1, 5);
          return;
          localObject = URLDecoder.decode((String)localObject);
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.RemittanceBaseUI", "helios:" + (String)localObject);
          String str = (String)bl.z((String)localObject, "msg").get(".msg.appmsg.wcpayinfo.transferid");
          if (TextUtils.isEmpty(str))
          {
            com.tencent.mm.sdk.platformtools.x.e("MicroMsg.RemittanceBaseUI", "paymsgid count't be null in appmsg");
            break;
          }
          ab localab = com.tencent.mm.plugin.remittance.a.b.bqQ().bqT();
          if ((bi.oW(str)) || (bi.oW((String)localObject)))
          {
            com.tencent.mm.sdk.platformtools.x.e(ab.TAG, "saveMsgContent param error");
            break;
          }
          localab.myF.put(str, localObject);
          break;
        }
        com.tencent.mm.plugin.wallet.a.a(this.myP, paramString1);
        if ((paramv.mxl != null) && (paramv.mxl.bNX.bOb != null))
        {
          com.tencent.mm.pluginsdk.wallet.h.a(paramv.mxl.bNX.bOb, false, "", (PayInfo)localObject, paramString3, paramString1, paramv.mxl.bNX.bNZ);
          return;
        }
        com.tencent.mm.pluginsdk.wallet.h.a(this, false, "", (PayInfo)localObject, paramString3, paramString1, 1);
        return;
      }
    }
  }
  
  public abstract void brm();
  
  public void brn()
  {
    t localt = new t(this.cYO, this.myV);
    localt.dox = "RemittanceProcess";
    a(localt, true, true);
  }
  
  public void bro() {}
  
  public abstract void brp();
  
  public abstract void brs();
  
  protected final void brt()
  {
    Object localObject1 = com.tencent.mm.wallet_core.ui.e.dx(com.tencent.mm.wallet_core.ui.e.gT(this.cYO), 10);
    Object localObject2 = localObject1;
    if (!bi.oW(this.mzk)) {
      localObject2 = getString(a.i.remittance_collect_block, new Object[] { localObject1, this.mzk });
    }
    if (this.fdx == 1)
    {
      localObject2 = getIntent().getStringExtra("receiver_tips");
      this.myX.setTextColor(getResources().getColor(a.c.black));
      this.myY.setVisibility(0);
      if (bi.oW(this.cYO))
      {
        localObject1 = getString(a.i.remittance_collect_pay_wrords_nick_tip_withdout_username, new Object[] { this.mzk });
        this.myY.setText(com.tencent.mm.pluginsdk.ui.d.j.a(this, (CharSequence)localObject1, this.myY.getTextSize()));
        localObject1 = localObject2;
        label152:
        this.myX.setText(com.tencent.mm.pluginsdk.ui.d.j.a(this, (CharSequence)localObject1, this.myX.getTextSize()));
        this.myW.setImageResource(a.e.default_avatar);
        if (!g.Eg().Dx()) {
          break label388;
        }
        localObject1 = com.tencent.mm.aa.q.KH();
        if ((localObject1 == null) || (bi.oW(this.cYO))) {
          break label388;
        }
        localObject1 = ((k)localObject1).kc(this.cYO);
        if ((localObject1 != null) && (!bi.oW(((com.tencent.mm.aa.j)localObject1).Ky()))) {
          break label388;
        }
        long l = bi.VF();
        am.a.dBr.a(this.cYO, "", new RemittanceBaseUI.18(this, l));
      }
    }
    label388:
    for (int i = 1;; i = 0)
    {
      if (i == 0) {
        bru();
      }
      return;
      localObject1 = getString(a.i.remittance_collect_pay_wrords_nick_tip, new Object[] { com.tencent.mm.wallet_core.ui.e.dx(com.tencent.mm.wallet_core.ui.e.gT(this.cYO), 10), this.mzk });
      break;
      localObject1 = localObject2;
      if (this.fdx != 6) {
        break label152;
      }
      localObject1 = getIntent().getStringExtra("receiver_tips");
      if (bi.oW((String)localObject1))
      {
        localObject1 = getString(a.i.remittance_collect_pay_wrords, new Object[] { localObject2 });
        break label152;
      }
      localObject1 = bi.q((String)localObject1, new Object[] { localObject2 });
      break label152;
    }
  }
  
  protected final boolean brv()
  {
    return (this.fdx == 0) || (this.fdx == 2);
  }
  
  protected void brw()
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("recent_remittance_contact_list", ac.brg());
    localIntent.setClass(this.mController.tml, SelectRemittanceContactUI.class);
    startActivityForResult(localIntent, 2);
  }
  
  public boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if ((paraml instanceof com.tencent.mm.plugin.remittance.model.v))
      {
        paramString = (com.tencent.mm.plugin.remittance.model.v)paraml;
        u.j(this.myU, paramString.bQa, paramInt2);
        this.mzj = paramString.mxD;
        if (!bi.oW(paramString.mxM)) {
          this.mzk = paramString.mxM;
        }
        if ((this.myU == 32) || (this.myU == 33))
        {
          this.mzr = paramString.hTI;
          if (this.myP != null) {
            this.myP.i(10000, new Object[] { Integer.valueOf(this.myU), this.cYO, Double.valueOf(paramString.mxP) });
          }
          if (!a(paramString)) {
            a(paramString.bQa, this.cYO, this.mzk, paramString);
          }
          paraml = new a(paramString.mxN, paramString.hTI, paramString.hVy, paramString.mxO, paramString.amount, paramString.bXz, paramString.bOe, paramString.mxS, bi.getLong(paramString.mxQ, 0L));
          this.mzq.put(paramString.bQa, paraml);
        }
      }
      for (;;)
      {
        return true;
        this.mzr = paramString.bXz;
        break;
        if ((paraml instanceof com.tencent.mm.plugin.wallet_core.c.ad))
        {
          paramString = (com.tencent.mm.plugin.wallet_core.c.ad)paraml;
          if (!bi.oW(paramString.pjH))
          {
            ((TextView)findViewById(a.f.remittance_tip)).setText(paramString.pjH);
            paraml = findViewById(a.f.tip_container);
            paraml.setVisibility(0);
            paraml.setOnClickListener(new RemittanceBaseUI.3(this));
          }
          this.mzi = paramString.mzi;
          this.mxI = paramString.mxI;
          if (this.mxI == 0.0D) {
            if (this.fdx == 1) {
              com.tencent.mm.plugin.report.service.h.mEJ.h(12689, new Object[] { Integer.valueOf(14), Integer.valueOf(1) });
            } else {
              com.tencent.mm.plugin.report.service.h.mEJ.h(12689, new Object[] { Integer.valueOf(5), Integer.valueOf(1) });
            }
          }
        }
        else if ((paraml instanceof ae))
        {
          this.mzl = ((ae)paraml).pjJ;
          this.mzm = ((ae)paraml).pjN;
          this.mzn = ((ae)paraml).pjO;
          brr();
          brq();
        }
      }
    }
    if ((paraml instanceof ae))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.RemittanceBaseUI", "net error, use hardcode wording");
      this.myZ.setText("");
      this.myZ.setVisibility(8);
    }
    do
    {
      do
      {
        return false;
      } while (!(paraml instanceof com.tencent.mm.plugin.remittance.model.v));
      u.j(this.myU, "", paramInt2);
    } while (!b((com.tencent.mm.plugin.remittance.model.v)paraml));
    return true;
  }
  
  protected final int getForceOrientation()
  {
    return 1;
  }
  
  protected int getLayoutId()
  {
    if ((this.myU == 33) || (this.myU == 32)) {
      return a.g.remittance_new_ui_f2f;
    }
    return a.g.remittance_new_ui;
  }
  
  protected final void initView()
  {
    if ((this.myU == 33) || (this.myU == 32))
    {
      setMMTitle(a.i.remittance_busi_pay);
      setBackBtn(new RemittanceBaseUI.1(this));
      this.mKeyboard = ((MyKeyboardWindow)findViewById(a.f.tenpay_num_keyboard));
      this.kMk = findViewById(a.f.tenpay_keyboard_layout);
      this.klj = ((ScrollView)findViewById(a.f.root_view));
      this.myW = ((ImageView)findViewById(a.f.remittance_receiver_avatar));
      this.myX = ((TextView)findViewById(a.f.remittance_receiver_display_name));
      this.myY = ((TextView)findViewById(a.f.remittance_receiver_display_name_tip));
      this.myY.setVisibility(8);
      this.mzg = ((LinearLayout)findViewById(a.f.remittance_edit_layout));
      this.mzf = ((LinearLayout)findViewById(a.f.remittance_ftf_desc_layout));
      this.mzd = ((TextView)findViewById(a.f.remittance_fixed_amount_fee));
      this.mze = ((TextView)findViewById(a.f.remittance_fixed_amount_fee_currency));
      this.mzc = ((TextView)findViewById(a.f.remittance_fixed_amount_desc));
      brt();
      this.hXD = ((WalletFormView)findViewById(a.f.money_ev));
      if (this.myU != 33) {
        break label579;
      }
      this.mzd.setText(com.tencent.mm.wallet_core.ui.e.A(this.myQ));
      this.mze.setText(com.tencent.mm.wallet_core.c.v.cDm());
      this.mzh = getIntent().getStringExtra("desc");
      if (bi.oW(this.mzh)) {
        break label567;
      }
      this.mzc.setText(com.tencent.mm.pluginsdk.ui.d.j.a(this.mController.tml, this.mzh, this.mzc.getTextSize()));
      this.mzc.setVisibility(0);
      label308:
      this.mzf.setVisibility(0);
      this.mzg.setVisibility(8);
      label325:
      this.eWk = ((Button)findViewById(a.f.next_btn));
      this.eWk.setOnClickListener(new RemittanceBaseUI.12(this));
      this.mza = ((TextView)findViewById(a.f.remittance_desc));
      this.mzb = ((TextView)findViewById(a.f.add_remittance_desc));
      if ((this.fdx != 1) && (this.fdx != 6)) {
        break label700;
      }
      this.mzb.setText(a.i.remittance_add_f2f_desc_link);
    }
    for (;;)
    {
      if (!com.tencent.mm.model.q.GS()) {
        findViewById(a.f.remittance_desc_container).setOnClickListener(new RemittanceBaseUI.15(this));
      }
      if (this.fdx == 1)
      {
        g.Ek();
        if (((String)g.Ei().DT().get(327732, "0")).equals("0"))
        {
          com.tencent.mm.ui.base.h.a(this.mController.tml, a.i.remittance_first_ftf_pay_tips, a.i.remittance_first_ftf_pay_tips_title, new RemittanceBaseUI.16(this));
          g.Ek();
          g.Ei().DT().set(327732, "1");
          g.Ek();
          g.Ei().DT().lm(true);
        }
      }
      this.myZ = ((TextView)findViewById(a.f.placeholder));
      brr();
      brs();
      brq();
      return;
      setMMTitle(a.i.remittance_title);
      break;
      label567:
      this.mzc.setVisibility(8);
      break label308;
      label579:
      this.hXD.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          RemittanceBaseUI.this.Wq();
        }
      });
      this.hXD.getTitleTv().setText(String.format(getString(a.i.remittance_fee_tips), new Object[] { "¥" }));
      this.hXD.a(new TextWatcher()
      {
        public final void afterTextChanged(Editable paramAnonymousEditable)
        {
          if (paramAnonymousEditable.toString().startsWith(".")) {
            paramAnonymousEditable.insert(0, "0");
          }
          String str = paramAnonymousEditable.toString();
          int i = str.indexOf(".");
          int j = str.length();
          if ((i >= 0) && (j - i > 2)) {
            paramAnonymousEditable.delete(i + 3, j);
          }
        }
        
        public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3) {}
        
        public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3) {}
      });
      d(this.hXD, 2, false);
      findViewById(a.f.placeholder);
      findViewById(a.f.remittance_main_ui).setVisibility(0);
      this.mzf.setVisibility(8);
      this.mzg.setVisibility(0);
      this.kTx = new RemittanceBaseUI.2(this);
      break label325;
      label700:
      this.mzb.setText(a.i.remittance_add_desc_link);
    }
  }
  
  public void jX(String paramString)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.RemittanceBaseUI", "onGet");
    if (bi.oV(paramString).length() <= 0) {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.RemittanceBaseUI", "notifyChanged: user = " + paramString);
    }
    while (!paramString.equals(this.cYO)) {
      return;
    }
    bru();
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    boolean bool2 = true;
    boolean bool1 = true;
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.RemittanceBaseUI", "reqcode=" + paramInt1 + ", resultCode=" + paramInt2 + ", username=" + this.cYO);
    switch (paramInt1)
    {
    }
    for (;;)
    {
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      return;
      if (paramInt2 == -1) {}
      for (;;)
      {
        a(bool1, paramIntent);
        break;
        bool1 = false;
      }
      if (paramInt2 == -1) {}
      for (bool1 = bool2;; bool1 = false)
      {
        a(bool1, paramIntent);
        break;
      }
      if ((paramInt2 == -1) && (paramIntent != null))
      {
        String str = paramIntent.getStringExtra("Select_Conv_User");
        if (!bi.oW(str))
        {
          this.cYO = str;
          brt();
        }
        else
        {
          finish();
        }
      }
      else
      {
        finish();
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    this.fdx = getIntent().getIntExtra("scene", 0);
    this.myU = getIntent().getIntExtra("pay_scene", 31);
    super.onCreate(paramBundle);
    this.myP = com.tencent.mm.plugin.wallet.a.ac(getIntent());
    this.myV = getIntent().getStringExtra("scan_remittance_id");
    this.myQ = getIntent().getDoubleExtra("fee", 0.0D);
    this.cYO = getIntent().getStringExtra("receiver_name");
    this.myS = getIntent().getStringExtra("receiver_nick_name");
    this.mzk = getIntent().getStringExtra("receiver_true_name");
    this.myR = getIntent().getStringExtra("mch_name");
    this.myT = getIntent().getStringExtra("mch_info");
    this.kTw = getIntent().getIntExtra("pay_channel", 0);
    this.mzp = bi.aG(getIntent().getStringExtra("rcvr_open_id"), "");
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.RemittanceBaseUI", "mUserName %s", new Object[] { this.cYO });
    g.Ek();
    long l = ((Long)g.Ei().DT().get(147457, Long.valueOf(0L))).longValue();
    if ((0x10 & l) != 0L) {
      this.mzo = 1;
    }
    for (;;)
    {
      brm();
      com.tencent.mm.aa.q.Kp().a(this);
      initView();
      this.mzy.cht();
      return;
      if ((l & 0x20) != 0L) {
        this.mzo = 2;
      } else {
        this.mzo = 0;
      }
    }
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    com.tencent.mm.aa.q.Kp().b(this);
    this.mzy.dead();
    this.mzx.dead();
  }
  
  private static final class a
  {
    int amount;
    String bOe;
    String bXz;
    String hTI;
    String hVy;
    String mxN;
    String mxO;
    String mxS;
    long mzF;
    
    a(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt, String paramString5, String paramString6, String paramString7, long paramLong)
    {
      this.mxN = paramString1;
      this.hTI = paramString2;
      this.hVy = paramString3;
      this.mxO = paramString4;
      this.amount = paramInt;
      this.bXz = paramString5;
      this.bOe = paramString6;
      this.mxS = paramString7;
      this.mzF = paramLong;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/remittance/ui/RemittanceBaseUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */