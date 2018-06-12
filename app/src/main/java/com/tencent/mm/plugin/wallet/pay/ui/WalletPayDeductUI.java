package com.tencent.mm.plugin.wallet.pay.ui;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.ab.l;
import com.tencent.mm.kernel.b;
import com.tencent.mm.plugin.wallet.a.p;
import com.tencent.mm.plugin.wallet.pwd.a.c;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.plugin.wallet_core.model.Orders.DeductInfo;
import com.tencent.mm.plugin.wallet_core.model.Orders.DeductShowInfo;
import com.tencent.mm.plugin.wallet_core.model.ag;
import com.tencent.mm.plugin.wallet_core.ui.h;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.h;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.s;
import com.tencent.mm.ui.widget.MMSwitchBtn;
import com.tencent.mm.wallet_core.ui.WalletTextView;
import java.util.ArrayList;
import java.util.List;

public class WalletPayDeductUI
  extends MMPreference
  implements View.OnClickListener, com.tencent.mm.ab.e
{
  protected Button eWk;
  private Dialog eXG = null;
  protected f gua;
  private String hwH;
  private LinearLayout kkE;
  protected Orders mCZ;
  protected MMSwitchBtn pfU;
  protected ArrayList<Preference> pfV;
  protected TextView pfW;
  private TextView pfX;
  private TextView pfY;
  private String pfZ;
  private String pga;
  private Bankcard pgb;
  protected boolean pgc = false;
  private int pgd = 0;
  private String pge;
  
  private void bNH()
  {
    p.bNp();
    ag localag = p.bNq();
    if (this.pgb == null) {
      this.pgb = localag.a(null, null, true, true, true);
    }
    if (this.pgb == null)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletPayDeductUI", "no bank card!");
      finish();
      return;
    }
    SpannableString localSpannableString = new SpannableString(this.pgb.field_desc);
    h localh = new h(this.mController.tml);
    localh.pvm = new WalletPayDeductUI.3(this, localag.jl(true));
    localSpannableString.setSpan(localh, 0, localSpannableString.length(), 18);
    this.pfX.setText(localSpannableString);
    this.pfX.setMovementMethod(LinkMovementMethod.getInstance());
  }
  
  private void bNI()
  {
    if ((this.pfV == null) || (this.pfV.size() <= 0)) {
      return;
    }
    int j = this.pfV.size();
    int i = 0;
    while (i < j)
    {
      this.gua.bw(((Preference)this.pfV.get(i)).mKey, false);
      i += 1;
    }
    this.gua.notifyDataSetChanged();
  }
  
  private void cC(List<Orders.DeductShowInfo> paramList)
  {
    if ((paramList == null) || (paramList.size() == 0)) {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.WalletPayDeductUI", "showinfos is null or length is 0");
    }
    while (this.pfV != null) {
      return;
    }
    int j = paramList.size();
    this.pfV = new ArrayList();
    int i = 0;
    label48:
    Object localObject;
    com.tencent.mm.plugin.wallet_core.ui.d locald;
    if (i < j)
    {
      localObject = (Orders.DeductShowInfo)paramList.get(i);
      if ((localObject != null) && (!bi.oW(((Orders.DeductShowInfo)localObject).name)))
      {
        locald = new com.tencent.mm.plugin.wallet_core.ui.d(this);
        locald.setTitle(((Orders.DeductShowInfo)localObject).name);
        if (((Orders.DeductShowInfo)localObject).ppN <= 0) {
          break label228;
        }
        locald.lQm = getResources().getColor(a.c.link_color);
        String str = ((Orders.DeductShowInfo)localObject).value;
        localObject = new WalletPayDeductUI.4(this, (Orders.DeductShowInfo)localObject);
        locald.jNk = str;
        locald.jNo = true;
        locald.iFK = ((View.OnClickListener)localObject);
      }
    }
    for (;;)
    {
      locald.setKey("deduct_info_" + i);
      this.pfV.add(locald);
      this.gua.a(locald);
      this.gua.bw(locald.mKey, true);
      i += 1;
      break label48;
      break;
      label228:
      locald.jNk = ((Orders.DeductShowInfo)localObject).value;
      locald.jNo = false;
    }
  }
  
  public final int Ys()
  {
    return -1;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletPayDeductUI", "errType: %d, errCode: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if ((paraml instanceof c)) {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        com.tencent.mm.kernel.g.Ek();
        this.pga = ((String)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sTn, getString(a.i.wallet_pay_deduct_change_pay_way_tip)));
        com.tencent.mm.kernel.g.Ek();
        this.pfZ = ((String)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sTm, getString(a.i.wallet_pay_deduct_select_pay_way_label)));
        this.pfY.setText(this.pga);
        bNH();
      }
    }
    for (;;)
    {
      if (this.eXG != null) {
        this.eXG.dismiss();
      }
      return;
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.WalletPayDeductUI", "other tenpay scene");
    }
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    return false;
  }
  
  protected final int getLayoutId()
  {
    return a.g.wallet_pay_deduct_ui;
  }
  
  protected final void initView()
  {
    this.pfW = ((TextView)this.mController.contentView.findViewById(a.f.bindcard_tip_tv));
    this.eWk = ((Button)this.mController.contentView.findViewById(a.f.next_btn));
    this.kkE = ((LinearLayout)findViewById(a.f.pay_way_ll));
    ((TextView)findViewById(a.f.deduct_title)).setText(this.mCZ.ppk.title);
    ((TextView)findViewById(a.f.title)).setText(((Orders.Commodity)this.mCZ.ppf.get(0)).desc);
    Object localObject1 = (WalletTextView)findViewById(a.f.fee_type);
    ((WalletTextView)localObject1).setTypeface(0);
    ((WalletTextView)localObject1).setText(com.tencent.mm.wallet_core.ui.e.abX(this.mCZ.lNV));
    ((TextView)findViewById(a.f.fee)).setText(((Orders.Commodity)this.mCZ.ppf.get(0)).hUL);
    localObject1 = (TextView)findViewById(a.f.footer_tips);
    Object localObject2 = (TextView)findViewById(a.f.deduct_desc);
    boolean bool;
    if (!bi.oW(this.mCZ.ppk.ppL))
    {
      ((TextView)localObject2).setText(this.mCZ.ppk.ppL);
      if (!bi.oW(this.mCZ.ppk.ppM)) {
        ((TextView)localObject2).setTextColor(Color.parseColor(this.mCZ.ppk.ppM));
      }
      this.pfX = ((TextView)findViewById(a.f.default_bankCard_tv));
      this.pfY = ((TextView)findViewById(a.f.bankCard_tip_tv));
      if (this.mCZ.ppk.pgM != 1) {
        break label771;
      }
      bool = true;
      label313:
      this.pgc = bool;
      this.pgd = this.mCZ.ppk.pgd;
      this.hwH = this.mCZ.ppk.hwH;
      this.pge = this.mCZ.ppk.pge;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletPayDeductUI", "open: %s, show_type: %s", new Object[] { Boolean.valueOf(this.pgc), Integer.valueOf(this.pgd) });
      if (this.pgd != 0) {
        break label776;
      }
      this.pfU = ((MMSwitchBtn)findViewById(a.f.checkbox));
      this.pfU.setCheck(this.pgc);
      this.pfU.setSwitchListener(new WalletPayDeductUI.2(this));
      jn(this.pgc);
      label447:
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.WalletPayDeductUI", "show pay way layout: %d", new Object[] { Integer.valueOf(this.mCZ.ppk.ppK) });
      if (this.mCZ.ppk.ppK != 1) {
        break label863;
      }
      com.tencent.mm.kernel.g.Ek();
      this.pga = ((String)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sTn, ""));
      com.tencent.mm.kernel.g.Ek();
      this.pfZ = ((String)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sTm, ""));
      if ((!bi.oW(this.pfZ)) && (!bi.oW(this.pfZ))) {
        break label845;
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletPayDeductUI", "need do pay manager");
      this.eXG = com.tencent.mm.wallet_core.ui.g.a(this.mController.tml, false, null);
      localObject2 = new c();
      com.tencent.mm.kernel.g.Ek();
      com.tencent.mm.kernel.g.Eh().dpP.a((l)localObject2, 0);
      label609:
      if (bi.oW(this.mCZ.ppk.ppI)) {
        break label875;
      }
      Object localObject3 = getString(a.i.wallet_deduct_foot_tips_part1);
      localObject2 = getString(a.i.wallet_deduct_foot_tips_part2);
      localObject3 = j.a(this, getString(a.i.wallet_deduct_foot_tips, new Object[] { localObject3, localObject2 }));
      h localh = new h(this.mController.tml);
      SpannableString localSpannableString = new SpannableString((CharSequence)localObject3);
      localSpannableString.setSpan(localh, ((CharSequence)localObject3).length() - ((String)localObject2).length(), ((CharSequence)localObject3).length(), 33);
      ((TextView)localObject1).setTextColor(getResources().getColor(a.c.hint_text_color));
      ((TextView)localObject1).setText(localSpannableString);
      ((TextView)localObject1).setOnClickListener(this);
      ((TextView)localObject1).setVisibility(0);
    }
    for (;;)
    {
      this.eWk.setOnClickListener(this);
      return;
      ((TextView)localObject2).setVisibility(8);
      break;
      label771:
      bool = false;
      break label313;
      label776:
      if (!bi.oW(this.hwH)) {
        this.eWk.setText(this.hwH);
      }
      if (!bi.oW(this.pge))
      {
        this.pfW.setText(this.pge);
        this.pfW.setVisibility(0);
      }
      findViewById(a.f.deduct_checkbox_layout).setVisibility(8);
      bNI();
      break label447;
      label845:
      this.pfY.setText(this.pga);
      bNH();
      break label609;
      label863:
      this.kkE.setVisibility(8);
      break label609;
      label875:
      ((TextView)localObject1).setVisibility(8);
    }
  }
  
  protected final void jn(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      findViewById(16908298).setVisibility(0);
      if (this.mCZ.ppk.ppK == 1)
      {
        this.kkE.setVisibility(0);
        bNI();
        if (!com.tencent.mm.plugin.wallet_core.model.o.bOW().bPs()) {
          break label110;
        }
        this.pfW.setVisibility(8);
        this.eWk.setText(a.i.wallet_deduct_pay_open_button_txt);
      }
    }
    for (;;)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletPayDeductUI", "isCheck=" + this.pfU.uGQ);
      return;
      this.kkE.setVisibility(8);
      break;
      label110:
      this.pfW.setVisibility(0);
      this.pfW.setText(a.i.wallet_deduct_pay_need_bind_card_txt);
      this.eWk.setText(a.i.wallet_deduct_pay_bind_card_button_txt);
      continue;
      if ((this.pfV != null) && (this.pfV.size() > 0))
      {
        int j = this.pfV.size();
        int i = 0;
        while (i < j)
        {
          this.gua.bw(((Preference)this.pfV.get(i)).mKey, true);
          i += 1;
        }
      }
      findViewById(16908298).setVisibility(8);
      this.kkE.setVisibility(8);
      this.pfW.setVisibility(8);
      this.eWk.setText(a.i.wallet_deduct_pay_button_txt);
    }
  }
  
  public void onClick(View paramView)
  {
    int i = paramView.getId();
    if (i == a.f.next_btn)
    {
      paramView = new Intent();
      if (this.pgd == 0) {
        if (this.pfU.uGQ)
        {
          i = 1;
          paramView.putExtra("auto_deduct_flag", i);
          if (this.pgb != null)
          {
            paramView.putExtra("deduct_bank_type", this.pgb.field_bankcardType);
            paramView.putExtra("deduct_bind_serial", this.pgb.field_bindSerial);
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletPayDeductUI", "deduct bankType: %s", new Object[] { this.pgb.field_bankcardType });
          }
          setResult(-1, paramView);
          finish();
        }
      }
    }
    while ((i != a.f.footer_tips) || (bi.oW(this.mCZ.ppk.ppI))) {
      for (;;)
      {
        return;
        i = 0;
        continue;
        paramView.putExtra("auto_deduct_flag", this.mCZ.ppk.pgM);
      }
    }
    paramView = new Intent();
    paramView.putExtra("rawUrl", this.mCZ.ppk.ppI);
    paramView.putExtra("showShare", false);
    com.tencent.mm.bg.d.b(this, "webview", ".ui.tools.WebViewUI", paramView);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.gua = this.tCL;
    getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(a.c.white)));
    paramBundle = getSupportActionBar().getCustomView();
    if (paramBundle != null)
    {
      View localView = paramBundle.findViewById(a.f.divider);
      if (localView != null) {
        localView.setBackgroundColor(getResources().getColor(a.c.transparent));
      }
      paramBundle = paramBundle.findViewById(16908309);
      if ((paramBundle != null) && ((paramBundle instanceof TextView))) {
        ((TextView)paramBundle).setTextColor(getResources().getColor(a.c.white));
      }
    }
    if (Build.VERSION.SDK_INT >= 21)
    {
      paramBundle = getWindow();
      paramBundle.addFlags(Integer.MIN_VALUE);
      if (!com.tencent.mm.compatible.util.d.fR(23)) {
        break label188;
      }
      paramBundle.setStatusBarColor(getResources().getColor(a.c.wallet_deduct_status_bar_bg));
      getWindow().getDecorView().setSystemUiVisibility(8192);
    }
    for (;;)
    {
      paramBundle = getIntent();
      if (paramBundle != null) {
        break;
      }
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.WalletPayDeductUI", "intent is null");
      finish();
      return;
      label188:
      getWindow().setStatusBarColor(Color.parseColor("#E5E5E5"));
    }
    this.mCZ = ((Orders)paramBundle.getParcelableExtra("orders"));
    if ((this.mCZ == null) || (this.mCZ.ppk == null))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.WalletPayDeductUI", "Orders data or deductInfo is null   : " + this.mCZ);
      finish();
    }
    cC(this.mCZ.ppk.ppJ);
    setResult(0);
    setBackBtn(new WalletPayDeductUI.1(this), a.h.actionbar_icon_dark_back);
    com.tencent.mm.kernel.g.Ek();
    com.tencent.mm.kernel.g.Eh().dpP.a(385, this);
    initView();
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    com.tencent.mm.kernel.g.Ek();
    com.tencent.mm.kernel.g.Eh().dpP.b(385, this);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  protected void onResume()
  {
    super.onResume();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/wallet/pay/ui/WalletPayDeductUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */