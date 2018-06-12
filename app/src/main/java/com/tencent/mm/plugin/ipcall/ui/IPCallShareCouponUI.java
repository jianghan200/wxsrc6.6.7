package com.tencent.mm.plugin.ipcall.ui;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.Spannable;
import android.text.Spannable.Factory;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.ipcall.a.e.i;
import com.tencent.mm.protocal.c.akc;
import com.tencent.mm.protocal.c.ccg;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.s;
import java.util.Iterator;
import java.util.LinkedList;

public class IPCallShareCouponUI
  extends MMActivity
  implements com.tencent.mm.ab.e
{
  private String cZG = null;
  private String cZH = null;
  private com.tencent.mm.sdk.b.c kup = new IPCallShareCouponUI.1(this);
  private ProgressDialog kuy;
  private String kxW = null;
  private String kxX = null;
  private String kxY = null;
  private String kxZ = null;
  private LinearLayout kyA;
  private ImageView kyB;
  private LinearLayout kyC;
  private ImageView kyD;
  private TextView kyE;
  private TextView kyF;
  private TextView kyG;
  private ImageView kyH;
  private TextView kyI;
  private TextView kyJ;
  private View kyK;
  private IPCallDynamicTextView kyL;
  private com.tencent.mm.plugin.ipcall.a.e.b kyM = new com.tencent.mm.plugin.ipcall.a.e.b();
  private LinkedList<ccg> kyN = null;
  private boolean kyO = false;
  private String kya = null;
  private String kyb = null;
  private String kyc = null;
  private String kyd = null;
  private RelativeLayout kyr;
  private TextView kys;
  private ImageView kyt;
  private RelativeLayout kyu;
  private TextView kyv;
  private ImageView kyw;
  private LinearLayout kyx;
  private LinearLayout kyy;
  private LinearLayout kyz;
  
  private void a(akc paramakc)
  {
    this.kxW = paramakc.rMH;
    this.cZG = paramakc.jOS;
    this.kxX = paramakc.rMI;
    this.cZH = paramakc.bHD;
    this.kxY = paramakc.ksB;
    this.kxZ = paramakc.rMJ;
    this.kyb = paramakc.rMK;
    this.kyc = paramakc.rML;
    this.kyd = paramakc.rMM;
    this.kyN = paramakc.rMv;
  }
  
  private void aoV()
  {
    if (!bi.oW(this.kyb))
    {
      if (this.kya == null)
      {
        this.kyL.setValue(this.kyb, this.kyb);
        this.kya = this.kyb;
      }
    }
    else
    {
      this.kyI.getText();
      this.kyI.setText(this.kyc);
      if (!bi.oW(this.kyc)) {
        break label181;
      }
      this.kyI.setVisibility(8);
    }
    StringBuffer localStringBuffer;
    for (;;)
    {
      localStringBuffer = new StringBuffer("");
      if ((this.kyN == null) || (this.kyN.size() <= 0)) {
        break label192;
      }
      Iterator localIterator = this.kyN.iterator();
      while (localIterator.hasNext())
      {
        ccg localccg = (ccg)localIterator.next();
        if ((localccg != null) && (!bi.oW(localccg.syk))) {
          localStringBuffer.append(localccg.syk).append('\n');
        }
      }
      this.kyL.setValue(this.kya, this.kyb);
      break;
      label181:
      this.kyI.setVisibility(0);
    }
    label192:
    if (!bi.oW(localStringBuffer.toString()))
    {
      if (localStringBuffer.charAt(localStringBuffer.length() - 1) == '\n') {
        localStringBuffer.deleteCharAt(localStringBuffer.length() - 1);
      }
      this.kyJ.setText(localStringBuffer.toString());
      this.kyJ.setVisibility(0);
    }
    while ((this.kyI.getVisibility() == 0) && (this.kyJ.getVisibility() == 0))
    {
      this.kyK.setVisibility(0);
      return;
      this.kyJ.setText("");
      this.kyJ.setVisibility(8);
    }
    this.kyK.setVisibility(8);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if ((paraml instanceof com.tencent.mm.plugin.ipcall.a.d.g))
    {
      if ((paramInt1 != 0) || (paramInt2 != 0)) {
        break label57;
      }
      a(((com.tencent.mm.plugin.ipcall.a.d.g)paraml).krt);
      aoV();
      if ((this.kuy != null) && (this.kuy.isShowing())) {
        this.kuy.dismiss();
      }
    }
    label57:
    while ((this.kuy == null) || (!this.kuy.isShowing())) {
      return;
    }
    this.kuy.dismiss();
    h.a(this.mController.tml, getString(R.l.ip_call_load_error_tip), getString(R.l.ip_call_func_name), new IPCallShareCouponUI.7(this));
  }
  
  protected final int getForceOrientation()
  {
    return 1;
  }
  
  protected final int getLayoutId()
  {
    return R.i.ip_call_coupons_ui;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    au.DF().a(257, this);
    a.sFg.b(this.kup);
    setMMTitle(R.l.ip_calladdress_account);
    setBackBtn(new IPCallShareCouponUI.8(this));
    this.mController.removeAllOptionMenu();
    addIconOptionMenu(0, R.g.mm_title_btn_menu, new IPCallShareCouponUI.6(this));
    this.kyL = ((IPCallDynamicTextView)findViewById(R.h.balance));
    this.kyr = ((RelativeLayout)findViewById(R.h.rechargeLayout));
    this.kys = ((TextView)findViewById(R.h.recharge_info_tv));
    this.kyt = ((ImageView)findViewById(R.h.recharge_dot));
    au.HU();
    if (((Boolean)com.tencent.mm.model.c.DT().get(aa.a.sRc, Boolean.valueOf(false))).booleanValue()) {
      this.kyt.setVisibility(0);
    }
    au.HU();
    paramBundle = (String)com.tencent.mm.model.c.DT().get(aa.a.sRb, "");
    this.kys.setText(paramBundle);
    this.kyu = ((RelativeLayout)findViewById(R.h.purchase_package_rl));
    this.kyv = ((TextView)findViewById(R.h.package_info_tv));
    this.kyw = ((ImageView)findViewById(R.h.package_dot));
    au.HU();
    paramBundle = (String)com.tencent.mm.model.c.DT().get(aa.a.sRd, "");
    this.kyv.setText(paramBundle);
    this.kyI = ((TextView)findViewById(R.h.coupons_time));
    this.kyJ = ((TextView)findViewById(R.h.package_desc_tv));
    this.kyK = findViewById(R.h.small_divider);
    this.kyx = ((LinearLayout)findViewById(R.h.exchange_records));
    this.kyH = ((ImageView)findViewById(R.h.new_dot));
    au.HU();
    if (((Boolean)com.tencent.mm.model.c.DT().get(aa.a.sRe, Boolean.valueOf(false))).booleanValue()) {
      this.kyH.setVisibility(0);
    }
    this.kyE = ((TextView)findViewById(R.h.normal_question));
    this.kyF = ((TextView)findViewById(R.h.agreement));
    this.kyG = ((TextView)findViewById(R.h.stop_tip_tv));
    this.kyy = ((LinearLayout)findViewById(R.h.share_coupon));
    this.kyz = ((LinearLayout)findViewById(R.h.my_gift_card));
    this.kyC = ((LinearLayout)findViewById(R.h.see_price));
    this.kyD = ((ImageView)findViewById(R.h.see_price_new_dot));
    this.kyA = ((LinearLayout)findViewById(R.h.msg_center));
    this.kyB = ((ImageView)findViewById(R.h.msg_center_new_dot));
    au.HU();
    if (((Boolean)com.tencent.mm.model.c.DT().get(aa.a.sRk, Boolean.valueOf(false))).booleanValue()) {
      this.kyB.setVisibility(0);
    }
    int i;
    label557:
    label585:
    label591:
    label612:
    label777:
    Object localObject1;
    Object localObject2;
    if (com.tencent.mm.plugin.ipcall.b.c.aYC())
    {
      i = 1;
      if (i != 0) {
        this.kyr.setVisibility(8);
      }
      if ((com.tencent.mm.plugin.ipcall.b.c.aYC()) || (com.tencent.mm.k.g.AT().getInt("WCOPackagePurchaseSwitch", 0) == 0)) {
        break label1051;
      }
      i = 1;
      if (i != 0) {
        this.kyu.setVisibility(0);
      }
      if (com.tencent.mm.k.g.AT().getInt("WCOAccountDetailSwitch", 0) != 1) {
        break label1056;
      }
      i = 1;
      if (i == 0) {
        break label1061;
      }
      i = 1;
      if (i != 0) {
        this.kyx.setVisibility(8);
      }
      if (!com.tencent.mm.plugin.ipcall.b.c.aYC()) {
        break label1066;
      }
      i = 1;
      if (i != 0) {
        this.kyy.setVisibility(8);
      }
      this.kyE.setOnClickListener(new IPCallShareCouponUI.9(this));
      this.kyF.setOnClickListener(new IPCallShareCouponUI.10(this));
      this.kyx.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          IPCallShareCouponUI.f(IPCallShareCouponUI.this);
        }
      });
      this.kyy.setOnClickListener(new IPCallShareCouponUI.12(this));
      this.kyA.setOnClickListener(new IPCallShareCouponUI.13(this));
      this.kyz.setOnClickListener(new IPCallShareCouponUI.14(this));
      this.kyr.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          au.HU();
          if (((Boolean)com.tencent.mm.model.c.DT().get(aa.a.sRc, Boolean.valueOf(false))).booleanValue() == true) {
            i.M(3, -1, -1);
          }
          au.HU();
          com.tencent.mm.model.c.DT().a(aa.a.sRc, Boolean.valueOf(false));
          IPCallShareCouponUI.a(IPCallShareCouponUI.this).setVisibility(8);
          paramAnonymousView = new Intent();
          paramAnonymousView.setClass(IPCallShareCouponUI.this.mController.tml, IPCallRechargeUI.class);
          IPCallShareCouponUI.this.startActivity(paramAnonymousView);
        }
      });
      this.kyu.setOnClickListener(new IPCallShareCouponUI.2(this));
      this.kyC.setOnClickListener(new IPCallShareCouponUI.3(this));
      paramBundle = com.tencent.mm.plugin.ipcall.b.c.aYD();
      if (paramBundle == null) {
        break label1101;
      }
      a(paramBundle);
      aoV();
      if (!com.tencent.mm.plugin.ipcall.b.c.aYC()) {
        break label1176;
      }
      paramBundle = getString(R.l.ipcall_stop_tip);
      localObject1 = getString(R.l.ipcall_stop_see_detail);
      localObject2 = paramBundle + (String)localObject1;
      localObject1 = new IPCallShareCouponUI.5(this);
      localObject2 = Spannable.Factory.getInstance().newSpannable((CharSequence)localObject2);
      i = paramBundle.length();
      int j = ((Spannable)localObject2).length();
      if ((i < 0) || (i >= j) || (j < 0) || (j > ((Spannable)localObject2).length())) {
        break label1154;
      }
      ((Spannable)localObject2).setSpan(localObject1, i, j, 33);
      label891:
      this.kyG.setText((CharSequence)localObject2);
      this.kyG.setMovementMethod(LinkMovementMethod.getInstance());
      this.kyG.setVisibility(0);
    }
    for (;;)
    {
      paramBundle = (LinearLayout)findViewById(R.h.layoutRechargeAndPackage);
      if ((paramBundle != null) && (this.kyr.getVisibility() == 8) && (this.kyu.getVisibility() == 8)) {
        paramBundle.setVisibility(8);
      }
      paramBundle = (LinearLayout)findViewById(R.h.layoutShareAndCard);
      if ((paramBundle != null) && (this.kyy.getVisibility() == 8) && (this.kyz.getVisibility() == 8)) {
        paramBundle.setVisibility(8);
      }
      this.kyM.start();
      return;
      if (com.tencent.mm.k.g.AT().getInt("WCOPurchaseSwitch", 0) == 1) {}
      for (i = 1;; i = 0)
      {
        if (i == 0) {
          break label1046;
        }
        i = 1;
        break;
      }
      label1046:
      i = 0;
      break;
      label1051:
      i = 0;
      break label557;
      label1056:
      i = 0;
      break label585;
      label1061:
      i = 0;
      break label591;
      label1066:
      if (com.tencent.mm.k.g.AT().getInt("WCOInviteFriend", 0) == 1) {}
      for (i = 1;; i = 0)
      {
        if (i == 0) {
          break label1096;
        }
        i = 1;
        break;
      }
      label1096:
      i = 0;
      break label612;
      label1101:
      this.kyL.setText("0");
      paramBundle = this.mController.tml;
      getString(R.l.app_tip);
      this.kuy = h.a(paramBundle, getString(R.l.ip_call_loading_tip), true, new IPCallShareCouponUI.4(this));
      break label777;
      label1154:
      ((Spannable)localObject2).setSpan(localObject1, 0, ((Spannable)localObject2).length(), 33);
      break label891;
      label1176:
      this.kyG.setVisibility(8);
    }
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    au.DF().b(257, this);
    a.sFg.c(this.kup);
    this.kyM.krL = bi.VF();
    this.kyM.finish();
  }
  
  protected void onResume()
  {
    super.onResume();
    com.tencent.mm.plugin.ipcall.a.f.b.aXT().fY(false);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */