package com.tencent.mm.plugin.wallet_core.ui;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.tencent.mm.ab.l;
import com.tencent.mm.plugin.wallet_core.c.y;
import com.tencent.mm.plugin.wallet_core.e.c;
import com.tencent.mm.plugin.wallet_core.model.Authen;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.ElementQuery;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.o;
import com.tencent.mm.plugin.wallet_core.model.q;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.plugin.wxpay.a.j;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.ui.s;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.ui.MMScrollView;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.e;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView.a;

public class WalletCardImportUI
  extends WalletBaseUI
  implements TextView.OnEditorActionListener, WalletFormView.a
{
  private static final String[] pup = { "ABC_DEBIT", "ABC_CREDIT", "CITIC_CREDIT", "CMBC_DEBIT", "HSBC_DEBIT" };
  private Button eUb;
  private String kJy;
  private String kJz;
  private Orders mCZ = null;
  private PayInfo mCn = null;
  private com.tencent.mm.sdk.platformtools.ag mHandler = new com.tencent.mm.sdk.platformtools.ag();
  private Dialog nt = null;
  private Authen pfc = new Authen();
  private WalletFormView phM;
  private int phQ = 1;
  private ElementQuery pkA = new ElementQuery();
  private WalletFormView psR;
  private WalletFormView ptJ;
  private WalletFormView ptK;
  private WalletFormView ptL;
  private WalletFormView ptM;
  private WalletFormView ptP;
  private WalletFormView ptQ;
  private WalletFormView ptR;
  private WalletFormView ptS;
  private WalletFormView ptT;
  private WalletFormView ptU;
  private WalletFormView ptV;
  private WalletFormView ptY = null;
  private WalletFormView ptZ;
  private CheckBox pud;
  private String pue;
  private WalletFormView pui;
  private TextView puq;
  private MMScrollView pur;
  private Bankcard pus = null;
  private CheckBox put;
  private BaseAdapter puu = new WalletCardImportUI.9(this);
  
  private boolean ZB()
  {
    if (!this.put.isChecked()) {}
    for (boolean bool = false;; bool = true)
    {
      if (bool)
      {
        this.eUb.setEnabled(true);
        this.eUb.setClickable(true);
        return bool;
      }
      this.eUb.setEnabled(false);
      this.eUb.setClickable(false);
      return bool;
    }
  }
  
  private void aL()
  {
    Object localObject1;
    label86:
    Object localObject2;
    label189:
    Object localObject3;
    if (this.pus != null)
    {
      findViewById(a.f.wallet_card_safeguard_tip).setVisibility(0);
      if (bi.oW(this.sy.getString("key_bank_username"))) {
        break label543;
      }
      localObject1 = this.sy.getString("key_recommand_desc");
      if (!bi.oW((String)localObject1)) {
        break label532;
      }
      this.pud.setText(getString(a.i.wallet_card_follow_bank_tips, new Object[] { this.pus.field_bankName }));
      this.pud.setVisibility(0);
      this.ptP.setVisibility(8);
      this.ptQ.setVisibility(8);
      this.ptR.setVisibility(8);
      this.ptS.setVisibility(8);
      this.ptT.setVisibility(8);
      this.ptU.setVisibility(8);
      this.ptV.setVisibility(8);
      if ((bi.oW(this.pus.field_bankcardTail)) || (!b(this.ptZ, this.pus.plR))) {
        break label555;
      }
      localObject1 = this.ptZ;
      localObject2 = this.ptZ;
      if (!this.pus.bOu()) {
        break label571;
      }
      localObject3 = getString(a.i.wallet_credit_card);
      label207:
      if ((bi.oW(this.pus.field_bankName)) || (!b(this.pui, this.pus.field_bankName + " " + (String)localObject3))) {
        break label582;
      }
      localObject2 = localObject1;
      if (localObject1 == null) {
        localObject2 = this.pui;
      }
      localObject3 = this.pui;
    }
    for (;;)
    {
      localObject1 = localObject2;
      if (b(this.psR, this.pus.field_trueName))
      {
        localObject1 = localObject2;
        if (localObject2 == null) {
          localObject1 = this.psR;
        }
        localObject3 = this.psR;
      }
      localObject2 = localObject1;
      if (b(this.ptL, o.bPe().Q(this.mController.tml, this.pus.pll)))
      {
        localObject2 = localObject1;
        if (localObject1 == null) {
          localObject2 = this.ptL;
        }
        localObject3 = this.ptL;
      }
      localObject1 = localObject2;
      if (b(this.phM, this.pus.plQ))
      {
        localObject1 = localObject2;
        if (localObject2 == null) {
          localObject1 = this.phM;
        }
        localObject3 = this.phM;
      }
      localObject2 = localObject1;
      if (b(this.ptM, this.pus.field_mobile))
      {
        localObject2 = localObject1;
        if (localObject1 == null) {
          localObject2 = this.ptM;
        }
        localObject3 = this.ptM;
      }
      localObject1 = localObject2;
      if (b(this.ptK, this.pus.pln))
      {
        localObject1 = localObject2;
        if (localObject2 == null) {
          localObject1 = this.ptK;
        }
        localObject3 = this.ptK;
      }
      localObject2 = localObject1;
      if (b(this.ptJ, this.pus.plS))
      {
        localObject2 = localObject1;
        if (localObject1 == null) {
          localObject2 = this.ptJ;
        }
        localObject3 = this.ptJ;
      }
      ((WalletFormView)localObject2).setBackgroundResource(a.e.comm_list_item_selector);
      ((WalletFormView)localObject3).setBackgroundResource(a.e.comm_list_item_selector);
      if (!o.bOW().bPp()) {
        break label598;
      }
      this.eUb.setText(a.i.wallet_card_import_first);
      return;
      label532:
      this.pud.setText((CharSequence)localObject1);
      break;
      label543:
      this.pud.setVisibility(8);
      break label86;
      label555:
      this.ptZ.setVisibility(8);
      localObject2 = null;
      localObject1 = null;
      break label189;
      label571:
      localObject3 = getString(a.i.wallet_deposit_card);
      break label207;
      label582:
      this.pui.setVisibility(8);
      localObject3 = localObject2;
      localObject2 = localObject1;
    }
    label598:
    this.eUb.setText(a.i.wallet_card_import);
  }
  
  private static boolean b(WalletFormView paramWalletFormView, String paramString)
  {
    if (!bi.oW(paramString))
    {
      KeyListener localKeyListener = paramWalletFormView.getKeyListener();
      paramWalletFormView.setKeyListener(null);
      paramWalletFormView.setEnabled(false);
      paramWalletFormView.setClickable(false);
      paramWalletFormView.setText(paramString);
      paramWalletFormView.setKeyListener(localKeyListener);
      paramWalletFormView.setVisibility(0);
      return true;
    }
    paramWalletFormView.setVisibility(8);
    return false;
  }
  
  private void bQc()
  {
    if (ZB())
    {
      c.bQW();
      this.pfc = new Authen();
      this.sy.putBoolean("key_is_follow_bank_username", this.pud.isChecked());
      if ((this.pus != null) && (!bi.oW(this.pus.pmb)))
      {
        this.pfc.pcx = this.pus.pmb;
        this.pfc.lMW = this.pus.field_bindSerial;
        this.pfc.lMV = this.pus.field_bankcardType;
        this.pfc.pll = this.pus.pll;
        this.pfc.pli = this.sy.getString("key_pwd1");
        this.pfc.token = this.sy.getString("kreq_token");
        com.tencent.mm.wallet_core.a.af(this);
        if (!cDL().m(new Object[] { this.pfc, this.mCZ })) {
          break label591;
        }
        x.i("MicroMsg.WalletCardElmentUI", "process controller deal with!!!");
      }
    }
    else
    {
      return;
    }
    Object localObject = this.sy.getString("key_card_id");
    if (this.ptZ.getVisibility() == 0) {
      localObject = this.ptZ.getText();
    }
    for (;;)
    {
      this.pfc.mpb = ((PayInfo)this.sy.getParcelable("key_pay_info"));
      this.pfc.plm = ((String)localObject);
      this.pfc.lMV = this.pkA.lMV;
      this.pfc.pll = this.phQ;
      this.pfc.pli = this.sy.getString("key_pwd1");
      if (!bi.oW(this.ptK.getText())) {
        this.pfc.pln = this.ptK.getText();
      }
      this.pfc.pjw = this.ptM.getText();
      this.pfc.plr = this.ptP.getText();
      this.pfc.pls = this.ptQ.getText();
      this.pfc.country = this.pue;
      this.pfc.csK = this.kJy;
      this.pfc.csL = this.kJz;
      this.pfc.dRH = this.ptS.getText();
      this.pfc.knG = this.ptT.getText();
      this.pfc.eXM = this.ptU.getText();
      this.pfc.csD = this.ptV.getText();
      localObject = e.aca(this.pfc.pjw);
      this.sy.putString("key_mobile", (String)localObject);
      localObject = this.sy;
      if (this.pkA.pjA == 2) {}
      for (boolean bool = true;; bool = false)
      {
        ((Bundle)localObject).putBoolean("key_is_oversea", bool);
        this.pfc.plk = this.phM.getText();
        this.pfc.plj = this.psR.getText();
        this.pfc.plo = this.ptJ.getText();
        x.d("MicroMsg.WalletCardElmentUI", "payInfo " + this.pfc.mpb + " elemt.bankcardTag : " + this.pkA.pjA);
        break;
      }
      label591:
      x.e("MicroMsg.WalletCardElmentUI", "error process in the tenpay!!");
      return;
    }
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    x.d("MicroMsg.WalletCardElmentUI", " errCode: " + paramInt2 + " errMsg :" + paramString);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramString = this.sy;
      x.d("MicroMsg.WalletCardElmentUI", "PayInfo  " + this.mCn);
      if ((paraml instanceof y))
      {
        paramString.putBoolean("intent_bind_end", true);
        com.tencent.mm.wallet_core.a.j(this, paramString);
        h.bA(this, getString(a.i.wallet_bank_card_bind_success_tips));
        return true;
      }
      return false;
    }
    return false;
  }
  
  public final void fE(boolean paramBoolean)
  {
    ZB();
  }
  
  protected final int getLayoutId()
  {
    return a.g.wallet_card_import_ui;
  }
  
  protected final void initView()
  {
    this.ptZ = ((WalletFormView)findViewById(a.f.wallet_card_forgot_id));
    com.tencent.mm.wallet_core.ui.formview.a.b(this.ptZ);
    this.ptM = ((WalletFormView)findViewById(a.f.mobile_et));
    com.tencent.mm.wallet_core.ui.formview.a.c(this, this.ptM);
    this.psR = ((WalletFormView)findViewById(a.f.name_et));
    com.tencent.mm.wallet_core.ui.formview.a.e(this, this.psR);
    this.ptL = ((WalletFormView)findViewById(a.f.wallet_cre_type));
    this.phM = ((WalletFormView)findViewById(a.f.identity_et));
    com.tencent.mm.wallet_core.ui.formview.a.d(this.phM);
    this.pui = ((WalletFormView)findViewById(a.f.wallet_card_type));
    this.ptK = ((WalletFormView)findViewById(a.f.cvv_et));
    com.tencent.mm.wallet_core.ui.formview.a.b(this, this.ptK);
    this.ptJ = ((WalletFormView)findViewById(a.f.date_et));
    com.tencent.mm.wallet_core.ui.formview.a.a(this, this.ptJ);
    this.puq = ((TextView)findViewById(a.f.wallet_power_by_tenpay));
    this.ptP = ((WalletFormView)findViewById(a.f.first_name_et));
    this.ptQ = ((WalletFormView)findViewById(a.f.last_name_et));
    this.ptR = ((WalletFormView)findViewById(a.f.area_et));
    this.ptS = ((WalletFormView)findViewById(a.f.address_et));
    this.ptT = ((WalletFormView)findViewById(a.f.phone_et));
    this.ptU = ((WalletFormView)findViewById(a.f.post_et));
    this.ptV = ((WalletFormView)findViewById(a.f.email_et));
    com.tencent.mm.wallet_core.ui.formview.a.e(this.ptV);
    this.put = ((CheckBox)findViewById(a.f.agree_wx_cb));
    this.pud = ((CheckBox)findViewById(a.f.agree_follow_bank_cb));
    this.eUb = ((Button)findViewById(a.f.next_btn));
    this.pur = ((MMScrollView)findViewById(a.f.wallet_sv));
    MMScrollView localMMScrollView = this.pur;
    localMMScrollView.a(localMMScrollView, localMMScrollView);
    this.pur.setOnSizeChangeListener(new WalletCardImportUI.1(this));
    this.psR.setOnInputValidChangeListener(this);
    this.ptZ.setOnInputValidChangeListener(this);
    this.ptL.setOnInputValidChangeListener(this);
    this.phM.setOnInputValidChangeListener(this);
    this.ptM.setOnInputValidChangeListener(this);
    this.ptK.setOnInputValidChangeListener(this);
    this.ptJ.setOnInputValidChangeListener(this);
    this.ptP.setOnInputValidChangeListener(this);
    this.ptQ.setOnInputValidChangeListener(this);
    this.ptR.setOnInputValidChangeListener(this);
    this.ptS.setOnInputValidChangeListener(this);
    this.ptT.setOnInputValidChangeListener(this);
    this.ptU.setOnInputValidChangeListener(this);
    this.ptV.setOnInputValidChangeListener(this);
    this.psR.setOnEditorActionListener(this);
    this.ptZ.setOnEditorActionListener(this);
    this.ptL.setOnEditorActionListener(this);
    this.phM.setOnEditorActionListener(this);
    this.ptM.setOnEditorActionListener(this);
    this.ptK.setOnEditorActionListener(this);
    this.ptJ.setOnEditorActionListener(this);
    this.ptP.setOnEditorActionListener(this);
    this.ptQ.setOnEditorActionListener(this);
    this.ptR.setOnEditorActionListener(this);
    this.ptS.setOnEditorActionListener(this);
    this.ptT.setOnEditorActionListener(this);
    this.ptU.setOnEditorActionListener(this);
    this.ptV.setOnEditorActionListener(this);
    this.pui.setOnClickListener(new WalletCardImportUI.2(this));
    this.ptL.setOnClickListener(new WalletCardImportUI.3(this));
    this.put.setChecked(true);
    this.put.setOnCheckedChangeListener(new WalletCardImportUI.4(this));
    this.pud.setChecked(true);
    findViewById(a.f.agree_btn).setOnClickListener(new WalletCardImportUI.5(this));
    this.ptR.setOnClickListener(new WalletCardImportUI.6(this));
    this.eUb.setOnClickListener(new WalletCardImportUI.7(this));
    aL();
    ZB();
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    x.i("MicroMsg.WalletCardElmentUI", "onAcvityResult requestCode:" + paramInt1);
    if (paramInt2 != -1) {
      return;
    }
    switch (paramInt1)
    {
    }
    for (;;)
    {
      ZB();
      return;
      this.pkA = ((ElementQuery)paramIntent.getParcelableExtra("elemt_query"));
      aL();
      continue;
      String str1 = paramIntent.getStringExtra("CountryName");
      String str2 = paramIntent.getStringExtra("Country");
      this.pue = (str1 + "|" + str2);
      String str3 = paramIntent.getStringExtra("ProviceName");
      String str4 = paramIntent.getStringExtra("CityName");
      if (!bi.oW(paramIntent.getStringExtra("Contact_City")))
      {
        this.kJy = (str3 + "|" + paramIntent.getStringExtra("Contact_Province"));
        this.kJz = (str4 + "|" + paramIntent.getStringExtra("Contact_City"));
        this.ptR.setText(str1 + " " + str4);
      }
      for (;;)
      {
        if ((!"US".equals(str2)) && (!"CA".equals(str2)) && (!this.pkA.pnG)) {
          break label406;
        }
        this.ptU.setVisibility(0);
        break;
        if (!bi.oW(paramIntent.getStringExtra("Contact_Province")))
        {
          this.kJz = (str3 + "|" + paramIntent.getStringExtra("Contact_Province"));
          this.ptR.setText(str1 + " " + str3);
        }
        else
        {
          this.kJz = this.pue;
          this.ptR.setText(str1);
        }
      }
      label406:
      this.ptU.setVisibility(8);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setMMTitle(a.i.wallet_elment_title);
    this.pkA = ((ElementQuery)this.sy.getParcelable("elemt_query"));
    this.mCZ = ((Orders)this.sy.getParcelable("key_orders"));
    this.mCn = ((PayInfo)this.sy.getParcelable("key_pay_info"));
    this.pus = ((Bankcard)this.sy.getParcelable("key_import_bankcard"));
    if (this.mCn == null) {
      this.mCn = new PayInfo();
    }
    x.d("MicroMsg.WalletCardElmentUI", "mPayInfo " + this.mCn);
    initView();
    this.pur.pageScroll(33);
    c.b(this, this.sy, 3);
  }
  
  protected Dialog onCreateDialog(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return super.onCreateDialog(paramInt);
    }
    i locali = new i(this, a.j.SelectorDialog);
    locali.setContentView(a.g.wallet_list_dialog);
    ListView localListView = (ListView)locali.findViewById(a.f.address_contactlist);
    localListView.setAdapter(this.puu);
    localListView.setOnItemClickListener(new WalletCardImportUI.8(this));
    return locali;
  }
  
  public void onDestroy()
  {
    if ((this.nt != null) && (this.nt.isShowing()))
    {
      this.nt.dismiss();
      this.nt = null;
    }
    super.onDestroy();
  }
  
  public boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
  {
    x.d("MicroMsg.WalletCardElmentUI", "onEditorAction actionId : " + paramInt);
    switch (paramInt)
    {
    default: 
      if (this.ptY == null) {
        bQc();
      }
      return false;
    }
    if (this.ptY != null) {
      if ((this.ptY.isEnabled()) && (!this.ptY.isClickable()) && (this.ptY.cDT())) {
        this.ptY.cDV();
      }
    }
    for (;;)
    {
      return true;
      this.ptY.performClick();
      continue;
      bQc();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/ui/WalletCardImportUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */