package com.tencent.mm.plugin.wallet.bind.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.mm.ab.l;
import com.tencent.mm.bg.d;
import com.tencent.mm.g.a.sy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.wallet.a.p;
import com.tencent.mm.plugin.wallet_core.b.b;
import com.tencent.mm.plugin.wallet_core.c.y;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.ae;
import com.tencent.mm.plugin.wallet_core.model.ag;
import com.tencent.mm.plugin.wallet_core.model.f;
import com.tencent.mm.plugin.wallet_core.model.k;
import com.tencent.mm.plugin.wallet_core.model.o;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.util.ArrayList;

public class WalletBankcardManageUI
  extends WalletBaseUI
{
  private ListView CU = null;
  private AdapterView.OnItemClickListener PY = new WalletBankcardManageUI.9(this);
  private View.OnClickListener eZF = new WalletBankcardManageUI.8(this);
  private com.tencent.mm.plugin.wallet_core.ui.q kZX = new com.tencent.mm.plugin.wallet_core.ui.q();
  public ArrayList<Bankcard> pcZ = new ArrayList();
  private ArrayList<Bankcard> pda = new ArrayList();
  protected ag pdb = null;
  private ListView pdc = null;
  private a pdd = null;
  private a pde = null;
  private TextView pdf;
  private View pdg;
  private View pdh;
  private View pdi;
  private CdnImageView pdj;
  private TextView pdk;
  private k pdl;
  
  private void aL()
  {
    label43:
    label68:
    Object localObject1;
    Object localObject2;
    int i;
    label166:
    label182:
    TextView localTextView;
    if (this.pdb.bPr())
    {
      this.pdf.setEnabled(false);
      if ((this.pcZ == null) || (this.pcZ.size() <= 0)) {
        break label310;
      }
      this.CU.setVisibility(0);
      if ((this.pda == null) || (this.pda.size() <= 0)) {
        break label322;
      }
      this.pdc.setVisibility(0);
      if ((this.pdl == null) || (this.pdl.field_is_show_entry != 1)) {
        break label455;
      }
      ((TextView)this.pdh.findViewById(a.f.wallet_entrance_loan_text)).setText(this.pdl.field_title);
      localObject1 = this.pdl;
      localObject2 = (TextView)findViewById(a.f.wallet_load_red_point);
      i = ((k)localObject1).field_red_dot_index;
      g.Ek();
      if ((((Integer)g.Ei().DT().get(aa.a.sRJ, Integer.valueOf(-1))).intValue() >= i) || (i <= 0)) {
        break label334;
      }
      i = 1;
      if (i == 0) {
        break label339;
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletBankcardManageUI", "red point update");
      ((TextView)localObject2).setVisibility(0);
      localTextView = (TextView)findViewById(a.f.wallet_entrance_loan_credits_tip);
      if (((k)localObject1).field_is_overdue != 1) {
        break label348;
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletBankcardManageUI", "loanEntryInfo.is_overdue = true");
      localTextView.setText(a.i.wallet_bankcard_manager_ui_loan_overdue);
      localTextView.setTextColor(getResources().getColor(a.c.red));
      label232:
      localTextView.setVisibility(0);
      label238:
      this.pdh.setVisibility(0);
    }
    for (;;)
    {
      this.pdd.P(this.pcZ);
      this.pdd.notifyDataSetChanged();
      this.pde.P(this.pda);
      this.pde.notifyDataSetChanged();
      this.pdf.setEnabled(true);
      return;
      this.pdb.bPp();
      this.pdf.setEnabled(true);
      break;
      label310:
      this.CU.setVisibility(8);
      break label43;
      label322:
      this.pdc.setVisibility(8);
      break label68;
      label334:
      i = 0;
      break label166;
      label339:
      ((TextView)localObject2).setVisibility(8);
      break label182;
      label348:
      if (!bi.oW(((k)localObject1).field_tips))
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletBankcardManageUI", "loanEntryInfo.tips not null");
        localTextView.setText(((k)localObject1).field_tips);
        break label232;
      }
      if (!bi.oW(((k)localObject1).field_available_otb))
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletBankcardManageUI", "loanEntryInfo.available_otb not null");
        i = ((k)localObject1).field_available_otb.indexOf(".");
        localObject2 = ((k)localObject1).field_available_otb;
        localObject1 = localObject2;
        if (i > 0) {
          localObject1 = ((String)localObject2).substring(0, i);
        }
        localTextView.setText(getString(a.i.wallet_bankcard_manager_ui_loan_available_otb, new Object[] { localObject1 }));
        break label232;
      }
      localTextView.setVisibility(8);
      break label238;
      label455:
      this.pdh.setVisibility(8);
    }
  }
  
  private void bNh()
  {
    g.Ek();
    f localf = f.OU((String)g.Ei().DT().get(aa.a.sYt, ""));
    if ((localf != null) && (!bi.oW(localf.pmy)))
    {
      if (!bi.oW(localf.pmz)) {
        this.pdj.setUrl(localf.pmz);
      }
      this.pdk.setText(localf.pmy);
      if (localf.pmu == 1)
      {
        this.pdi.setOnClickListener(new WalletBankcardManageUI.6(this, localf));
        this.pdi.setVisibility(0);
        return;
      }
      if (localf.pmu == 2)
      {
        this.pdi.setOnClickListener(new WalletBankcardManageUI.7(this, localf));
        this.pdi.setVisibility(0);
        return;
      }
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.WalletBankcardManageUI", "unknown type: %d", new Object[] { Integer.valueOf(localf.pmu) });
    }
    this.pdi.setVisibility(8);
  }
  
  public final void b(Bankcard paramBankcard)
  {
    g.Ek();
    String str = (String)g.Ei().DT().get(aa.a.sTa, "");
    if (!bi.oW(str))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletBankcardManageUI", "jumpToH5BankDetail :: url is not null");
      Intent localIntent = new Intent();
      paramBankcard = String.format("bank_type=%s&card_tail=%s&bind_serial=%s", new Object[] { paramBankcard.field_bankcardType, paramBankcard.field_bankcardTail, paramBankcard.field_bindSerial });
      if (str.contains("?")) {}
      for (paramBankcard = str + "&" + paramBankcard;; paramBankcard = str + "?" + paramBankcard)
      {
        localIntent.putExtra("rawUrl", paramBankcard);
        localIntent.putExtra("showShare", false);
        localIntent.putExtra("disable_bounce_scroll", true);
        d.b(this, "webview", ".ui.tools.WebViewUI", localIntent);
        return;
      }
    }
    com.tencent.mm.sdk.platformtools.x.e("MicroMsg.WalletBankcardManageUI", "jumpToH5BankDetail :: url is null");
  }
  
  public a bNi()
  {
    return new a(this, this.pcZ);
  }
  
  public void bNj()
  {
    Runnable local10 = new Runnable()
    {
      public final void run()
      {
        this.pdr.putInt("key_bind_scene", 15);
        this.pdr.putBoolean("key_bind_show_change_card", true);
        com.tencent.mm.wallet_core.a.a(WalletBankcardManageUI.this, b.class, this.pdr, null);
      }
    };
    ae localae = new ae();
    this.kZX.a(new WalletBankcardManageUI.2(this, local10), localae.bPo());
  }
  
  public final void bNk()
  {
    ux(0);
    this.pdb.f(this.pcZ, this.pda);
    aL();
    bNh();
  }
  
  public final boolean bbU()
  {
    return false;
  }
  
  public void c(Bankcard paramBankcard)
  {
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("key_bankcard", paramBankcard);
    com.tencent.mm.wallet_core.a.a(this, com.tencent.mm.plugin.wallet.bind.a.class, localBundle, null);
  }
  
  public boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletBankcardManageUI", "onSceneEnd");
    if ((paramInt1 == 0) && (paramInt2 == 0) && ((paraml instanceof y)))
    {
      this.pdl = o.bOW().prD;
      bNk();
      return true;
    }
    return false;
  }
  
  public void finish()
  {
    if (!getIntent().getBooleanExtra("intent_finish_self", false))
    {
      Intent localIntent = new Intent();
      localIntent.addFlags(67108864);
      d.b(this, "mall", ".ui.MallIndexUI", localIntent);
    }
    super.finish();
  }
  
  protected final int getLayoutId()
  {
    return a.g.wallet_bankcard_manage_ui;
  }
  
  protected final void initView()
  {
    setBackBtn(new WalletBankcardManageUI.3(this));
    this.pdf = ((TextView)findViewById(a.f.wallet_add_bankcard_for_empty));
    this.pdf.setOnClickListener(new WalletBankcardManageUI.4(this));
    this.CU = ((ListView)findViewById(a.f.bankcard_list));
    this.pdd = bNi();
    this.CU.setAdapter(this.pdd);
    this.CU.setOnItemClickListener(this.PY);
    this.pdc = ((ListView)findViewById(a.f.virtual_bankcard_list));
    this.pde = new a(this, this.pda);
    this.pdc.setAdapter(this.pde);
    this.pdc.setOnItemClickListener(this.PY);
    this.pdg = findViewById(a.f.wallet_entrance_add_bankcard);
    this.pdg.setOnClickListener(this.eZF);
    this.pdh = findViewById(a.f.wallet_entrance_loan);
    this.pdh.setOnClickListener(this.eZF);
    this.pdi = findViewById(a.f.wallet_entrance_apply_credit);
    this.pdj = ((CdnImageView)findViewById(a.f.wallet_entrance_apply_credit_icon_iv));
    this.pdk = ((TextView)findViewById(a.f.wallet_entrance_applay_credit_text_tv));
    bNh();
    findViewById(a.f.bank_card_help).setOnClickListener(this.eZF);
    sy localsy = new sy();
    localsy.cdO.buF = "4";
    localsy.bJX = new WalletBankcardManageUI.5(this, localsy);
    com.tencent.mm.sdk.b.a.sFg.m(localsy);
  }
  
  public void jk(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      a(new y(null, 12), true, false);
      return;
    }
    a(new y(null, 12), false, false);
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt1 == 1)
    {
      if (paramInt2 == -1) {
        this.kZX.bcc();
      }
    }
    else {
      return;
    }
    this.kZX.cancel();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    ux(4);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletBankcardManageUI", "index Oncreate");
    p.bNp();
    this.pdb = p.bNq();
    setMMTitle(a.i.wallet_index_ui_title);
    lF(this.mController.tml.getResources().getColor(a.c.dark_actionbar_color));
    cqh();
    initView();
    com.tencent.mm.wallet_core.c.q.fu(5, 0);
    com.tencent.mm.wallet_core.ui.e.He(27);
    this.pdl = o.bOW().prD;
    this.kZX.pzb = new WalletBankcardManageUI.1(this);
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    this.pdd.pcA.destory();
    this.pde.pcA.destory();
  }
  
  public void onPause()
  {
    super.onPause();
    this.kZX.onPause();
  }
  
  public void onResume()
  {
    if (!this.pdb.bPr())
    {
      this.pdb.f(this.pcZ, this.pda);
      if (this.pdb.paw != null) {
        ux(0);
      }
      jk(false);
    }
    for (;;)
    {
      this.kZX.onResume();
      aL();
      super.onResume();
      return;
      jk(true);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardManageUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */