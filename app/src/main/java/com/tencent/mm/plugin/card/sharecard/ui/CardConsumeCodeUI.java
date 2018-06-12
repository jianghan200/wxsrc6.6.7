package com.tencent.mm.plugin.card.sharecard.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.plugin.card.a.b;
import com.tencent.mm.plugin.card.a.c;
import com.tencent.mm.plugin.card.a.d;
import com.tencent.mm.plugin.card.a.e;
import com.tencent.mm.plugin.card.a.g;
import com.tencent.mm.plugin.card.b.c;
import com.tencent.mm.plugin.card.b.c.a;
import com.tencent.mm.plugin.card.b.d.a;
import com.tencent.mm.plugin.card.b.j;
import com.tencent.mm.plugin.card.b.j.b;
import com.tencent.mm.plugin.card.d.m;
import com.tencent.mm.plugin.card.model.am;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.c.lf;
import com.tencent.mm.protocal.c.pr;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;
import com.tencent.mm.ui.statusbar.DrawStatusBarActivity;

public class CardConsumeCodeUI
  extends DrawStatusBarActivity
  implements View.OnClickListener, c.a, d.a
{
  private final String TAG = "MicroMsg.CardConsumeCodeUI";
  private Vibrator hni;
  private int hop = 3;
  private com.tencent.mm.plugin.card.base.b htQ;
  private String hyZ;
  private int hza = 3;
  private int hzb = 0;
  private a hzc;
  private TextView hzd;
  private TextView hze;
  private LinearLayout hzf;
  private ImageView hzg;
  private View hzh;
  private LinearLayout hzi;
  private View hzj;
  private TextView hzk;
  private TextView hzl;
  private TextView hzm;
  private boolean hzn = false;
  
  public final void awE()
  {
    this.hzc.axM();
  }
  
  public final void awJ()
  {
    this.hni.vibrate(300L);
  }
  
  public final void awK()
  {
    x.i("MicroMsg.CardConsumeCodeUI", "onFinishUI");
    finish();
  }
  
  public final void f(com.tencent.mm.plugin.card.base.b paramb)
  {
    x.i("MicroMsg.CardConsumeCodeUI", "onDataChange");
    if ((paramb != null) && (paramb.awq() != null) && (paramb.awq().equals(this.htQ.awq())))
    {
      this.htQ = paramb;
      this.hzc.htQ = this.htQ;
      this.hzc.axM();
    }
  }
  
  protected final int getLayoutId()
  {
    return a.e.card_consume_code_ui;
  }
  
  protected final void initView()
  {
    Object localObject1;
    label420:
    int i;
    if (this.htQ.avT())
    {
      if (!TextUtils.isEmpty(this.htQ.awm().hwg)) {
        setMMTitle(getString(a.g.card_consume_code_ui_title, new Object[] { this.htQ.awm().hwg }));
      }
    }
    else
    {
      setBackBtn(new CardConsumeCodeUI.1(this));
      if (this.hzc == null)
      {
        this.hzc = new a(this, this.mController.contentView);
        localObject1 = this.hzc;
        ((a)localObject1).hyW = ((a)localObject1).gKS.getWindow().getAttributes().screenBrightness;
        localObject1 = this.hzc;
        ((a)localObject1).hyP = ((TextView)((a)localObject1).hyK.findViewById(a.d.card_notice));
        ((a)localObject1).hyQ = ((TextView)((a)localObject1).hyK.findViewById(a.d.card_pay_and_qrcode_notice));
        ((a)localObject1).hyR = ((CheckBox)((a)localObject1).hyK.findViewById(a.d.notify_checkbox));
        ((a)localObject1).hyR.setChecked(true);
        ((a)localObject1).hyR.setOnClickListener(((a)localObject1).eZF);
        if (((a)localObject1).hyW < 0.8F) {
          ((a)localObject1).ag(0.8F);
        }
        this.hzc.hyV = new a.a()
        {
          public final void nO(int paramAnonymousInt)
          {
            am.axu().H(CardConsumeCodeUI.a(CardConsumeCodeUI.this).awq(), paramAnonymousInt, 1);
          }
        };
      }
      this.hzc.htQ = this.htQ;
      this.hzc.hyU = true;
      Object localObject2;
      if (this.htQ.avS())
      {
        localObject1 = this.hzc;
        localObject2 = this.hyZ;
        ((a)localObject1).hyT = 1;
        ((a)localObject1).hyS = ((String)localObject2);
      }
      this.hni = ((Vibrator)getSystemService("vibrator"));
      this.hzd = ((TextView)findViewById(a.d.brand_name));
      this.hze = ((TextView)findViewById(a.d.title));
      this.hzf = ((LinearLayout)findViewById(a.d.app_logo_layout));
      this.hzg = ((ImageView)findViewById(a.d.app_logo));
      this.hzh = findViewById(a.d.dash_line);
      this.hzi = ((LinearLayout)findViewById(a.d.code_layout));
      if (!this.htQ.avT()) {
        break label1012;
      }
      findViewById(a.d.card_consumed_code_ui).setBackgroundColor(getResources().getColor(com.tencent.mm.plugin.card.a.a.card_bg_color));
      m.d(this);
      com.tencent.mm.ui.statusbar.a.c(this.mController.contentView, -1, true);
      if ((!this.htQ.avT()) || (TextUtils.isEmpty(this.htQ.awm().huW))) {
        break label1062;
      }
      this.hzf.setVisibility(0);
      this.hzd.setVisibility(8);
      this.hze.setVisibility(8);
      this.hzh.setVisibility(8);
      i = getResources().getDimensionPixelSize(a.b.card_coupon_widget_logo_size);
      m.a(this.hzg, this.htQ.awm().huW, i, a.c.my_card_package_defaultlogo, true);
      label520:
      if (this.htQ.awm().rok != null)
      {
        localObject1 = this.htQ.awm().rok;
        if (!TextUtils.isEmpty(((pr)localObject1).title))
        {
          if (this.hzj == null) {
            this.hzj = ((ViewStub)findViewById(a.d.card_pay_and_qrcode_stub)).inflate();
          }
          this.hzj.setOnClickListener(this);
          this.hzk = ((TextView)this.hzj.findViewById(a.d.card_pay_and_qrcode_title));
          this.hzl = ((TextView)this.hzj.findViewById(a.d.card_pay_and_qrcode_sub_title));
          this.hzm = ((TextView)this.hzj.findViewById(a.d.card_pay_and_qrcode_aux_title));
          this.hzk.setVisibility(0);
          this.hzk.setText(((pr)localObject1).title);
          localObject2 = getResources().getDrawable(a.c.card_continue_arrow);
          ((Drawable)localObject2).setBounds(0, 0, ((Drawable)localObject2).getMinimumWidth(), ((Drawable)localObject2).getMinimumHeight());
          ((Drawable)localObject2).setColorFilter(com.tencent.mm.plugin.card.d.l.xV(this.htQ.awm().dxh), PorterDuff.Mode.SRC_IN);
          this.hzk.setCompoundDrawables(null, null, (Drawable)localObject2, null);
          this.hzk.setTextColor(com.tencent.mm.plugin.card.d.l.xV(this.htQ.awm().dxh));
          this.hzk.setOnClickListener(this);
          if (TextUtils.isEmpty(((pr)localObject1).huX)) {
            break label1103;
          }
          this.hzl.setVisibility(0);
          this.hzl.setText(((pr)localObject1).huX);
        }
      }
    }
    for (;;)
    {
      if (!TextUtils.isEmpty(((pr)localObject1).huY))
      {
        this.hzm.setVisibility(0);
        this.hzm.setText(((pr)localObject1).huY);
      }
      localObject1 = this.hzg.getLayoutParams();
      ((ViewGroup.LayoutParams)localObject1).height = getResources().getDimensionPixelSize(a.b.card_coupon_widget_small_logo_size);
      ((ViewGroup.LayoutParams)localObject1).width = getResources().getDimensionPixelSize(a.b.card_coupon_widget_small_logo_size);
      this.hzg.setLayoutParams((ViewGroup.LayoutParams)localObject1);
      localObject1 = this.hzf.getLayoutParams();
      ((ViewGroup.LayoutParams)localObject1).height = com.tencent.mm.bp.a.fromDPToPix(this, 54);
      ((ViewGroup.LayoutParams)localObject1).width = com.tencent.mm.bp.a.fromDPToPix(this, 54);
      this.hzf.setLayoutParams((ViewGroup.LayoutParams)localObject1);
      i = getResources().getDimensionPixelSize(a.b.card_coupon_widget_small_logo_size);
      m.a(this.hzg, this.htQ.awm().huW, i, a.c.my_card_package_defaultlogo, true);
      this.hzi.setPadding(0, com.tencent.mm.bp.a.fromDPToPix(this, 10), 0, com.tencent.mm.bp.a.fromDPToPix(this, 30));
      am.axt().a(this);
      if (this.htQ.awg())
      {
        am.axv().a(this);
        if (am.axv().isEmpty()) {
          break label1128;
        }
        am.axv().awC();
      }
      return;
      setMMTitle(getString(a.g.card_consume_code_ui_title, new Object[] { getString(a.g.card_membership) }));
      break;
      label1012:
      i = com.tencent.mm.plugin.card.d.l.xV(this.htQ.awm().dxh);
      findViewById(a.d.card_consumed_code_ui).setBackgroundColor(i);
      m.a(this, this.htQ);
      com.tencent.mm.ui.statusbar.a.c(this.mController.contentView, i, true);
      break label420;
      label1062:
      this.hzd.setText(this.htQ.awm().hwh);
      this.hze.setText(this.htQ.awm().title);
      break label520;
      label1103:
      this.hzl.setVisibility(0);
      this.hzl.setText(getString(a.g.card_membership_continue_tip));
    }
    label1128:
    x.i("MicroMsg.CardConsumeCodeUI", "registerListener doGetCardCodes");
    am.axv().xc(this.htQ.awq());
  }
  
  public void onClick(View paramView)
  {
    if ((paramView.getId() == a.d.card_pay_and_qrcode_title) || (paramView.getId() == a.d.card_pay_and_qrcode))
    {
      if (!this.htQ.awf()) {
        break label62;
      }
      paramView = new j.b();
      com.tencent.mm.plugin.card.d.b.a(this, paramView.huK, paramView.huL, false, this.htQ);
    }
    for (;;)
    {
      finish();
      return;
      label62:
      Object localObject = this.htQ.awm().rok;
      if ((!com.tencent.mm.plugin.card.d.b.a(this.htQ.awq(), (pr)localObject, this.hza, this.hzb)) && (localObject != null) && (!TextUtils.isEmpty(((pr)localObject).url)))
      {
        com.tencent.mm.plugin.card.d.b.a(this, com.tencent.mm.plugin.card.d.l.x(((pr)localObject).url, ((pr)localObject).roL), 1);
        h.mEJ.h(11941, new Object[] { Integer.valueOf(9), this.htQ.awq(), this.htQ.awr(), "", ((pr)localObject).title });
        if (com.tencent.mm.plugin.card.d.l.a((pr)localObject, this.htQ.awq()))
        {
          paramView = this.htQ.awq();
          localObject = ((pr)localObject).title;
          com.tencent.mm.plugin.card.d.l.yb(paramView);
          com.tencent.mm.plugin.card.d.b.a(this, this.htQ.awm().hwh);
        }
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    x.i("MicroMsg.CardConsumeCodeUI", "onCreate()");
    setResult(0);
    this.htQ = ((com.tencent.mm.plugin.card.base.b)getIntent().getParcelableExtra("key_card_info_data"));
    this.hop = getIntent().getIntExtra("key_from_scene", 3);
    this.hza = getIntent().getIntExtra("key_previous_scene", 3);
    this.hyZ = getIntent().getStringExtra("key_mark_user");
    this.hzb = getIntent().getIntExtra("key_from_appbrand_type", 0);
    if ((this.htQ == null) || (this.htQ.awm() == null) || (this.htQ.awn() == null))
    {
      x.e("MicroMsg.CardConsumeCodeUI", "mCardInfo == null or mCardInfo.getCardTpInfo() == null or mCardInfo.getDataInfo() == null");
      finish();
      return;
    }
    initView();
    am.axo().p("", "", 3);
  }
  
  protected void onDestroy()
  {
    a locala = this.hzc;
    locala.ag(locala.hyW);
    com.tencent.mm.plugin.card.d.l.x(locala.eZA);
    com.tencent.mm.plugin.card.d.l.x(locala.hyO);
    locala.hyV = null;
    locala.gKS = null;
    am.axt().c(this);
    am.axt().b(this);
    if (this.htQ.awg())
    {
      am.axv().b(this);
      am.axv().awD();
    }
    this.hni.cancel();
    super.onDestroy();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      x.e("MicroMsg.CardConsumeCodeUI", "onKeyDown finishUI");
      setResult(-1);
      finish();
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  protected void onPause()
  {
    am.axt().a(this, false);
    super.onPause();
  }
  
  protected void onResume()
  {
    this.hzc.axM();
    am.axt().a(this, true);
    super.onResume();
  }
  
  public final void onSuccess()
  {
    this.hzc.axM();
  }
  
  public final void xb(String paramString)
  {
    com.tencent.mm.plugin.card.d.d.a(this, paramString, true);
  }
  
  public final void xe(String paramString)
  {
    x.i("MicroMsg.CardConsumeCodeUI", "onStartConsumedSuccUI");
    if (this.hzn)
    {
      x.e("MicroMsg.CardConsumeCodeUI", "has start CardConsumeSuccessUI!");
      return;
    }
    x.i("MicroMsg.CardConsumeCodeUI", "startConsumedSuccUI() ");
    this.hzn = true;
    Intent localIntent = new Intent(this, CardConsumeSuccessUI.class);
    localIntent.putExtra("KEY_CARD_ID", this.htQ.awq());
    localIntent.putExtra("KEY_CARD_CONSUMED_JSON", paramString);
    localIntent.putExtra("KEY_CARD_COLOR", this.htQ.awm().dxh);
    localIntent.putExtra("key_stastic_scene", this.hop);
    localIntent.putExtra("key_from_scene", 0);
    startActivity(localIntent);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/card/sharecard/ui/CardConsumeCodeUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */