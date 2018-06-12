package com.tencent.mm.plugin.appbrand.ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.modelappbrand.b.f;
import com.tencent.mm.plugin.appbrand.config.a.d;
import com.tencent.mm.plugin.appbrand.config.d;
import com.tencent.mm.plugin.appbrand.config.d.b;
import com.tencent.mm.plugin.appbrand.e;
import com.tencent.mm.plugin.appbrand.e.c;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.s.e;
import com.tencent.mm.plugin.appbrand.s.g;
import com.tencent.mm.plugin.appbrand.s.h;
import com.tencent.mm.plugin.appbrand.widget.actionbar.c;
import com.tencent.mm.plugin.appbrand.widget.actionbar.c.a;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.widget.ThreeDotsLoadingView;

@SuppressLint({"ViewConstructor"})
final class b
  extends com.tencent.mm.ui.statusbar.b
  implements l
{
  private g fdO;
  private ThreeDotsLoadingView gtb;
  private ImageView gum;
  private ImageView gun;
  private TextView guo;
  private LinearLayout gup;
  private c guq;
  private d.b gur = d.b.fpv;
  
  public b(Context paramContext, g paramg)
  {
    super(paramContext);
    this.fdO = paramg;
    x.i("MicroMsg.AppBrandGameUILoadingSplash", "init");
    setClickable(true);
    setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    LayoutInflater.from(getContext()).inflate(s.h.app_brand_splash_game_ui, this);
    this.gum = ((ImageView)findViewById(s.g.app_brand_game_loading_avatar));
    this.gum.setImageDrawable(com.tencent.mm.modelappbrand.b.a.JZ());
    this.guo = ((TextView)findViewById(s.g.app_brand_game_loading_name));
    this.gun = ((ImageView)findViewById(s.g.app_brand_game_wagame_name));
    this.gtb = ((ThreeDotsLoadingView)findViewById(s.g.app_brand_game_loading_view));
    this.gup = ((LinearLayout)findViewById(s.g.app_brand_game_loading_ab_container));
    paramContext = (RelativeLayout.LayoutParams)this.gtb.getLayoutParams();
    this.guq = c.a.c(getContext(), this.fdO);
    paramg = new LinearLayout.LayoutParams(-2, -2);
    paramg.gravity = 21;
    paramg.rightMargin = com.tencent.mm.bp.a.ae(getContext(), s.e.app_brand_game_mode_icon_margin_right);
    paramg.topMargin = com.tencent.mm.bp.a.ae(getContext(), s.e.app_brand_game_mode_icon_margin_top);
    this.gup.addView(this.guq.getActionView(), paramg);
    d.b(this.fdO.fcq);
    this.gur = d.cu(getContext());
    x.i("MicroMsg.AppBrandGameUILoadingSplash", "mLastDeviceOrientation :%s", new Object[] { this.gur });
    if (this.gur == d.b.fpw)
    {
      paramContext.topMargin = com.tencent.mm.bp.a.ae(getContext(), s.e.app_brand_game_splash_loading_landspace_top_margin);
      this.guo.setPadding(0, 0, 0, 0);
      this.gtb.setLayoutParams(paramContext);
      ar(-1, true);
      this.guq.setBackgroundColor(0);
      this.guq.setForegroundStyle("black");
      this.guq.setNavBackOrClose(false);
      paramContext = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          e.a(b.a(b.this).mAppId, e.c.fcf);
          b.a(b.this).finish();
        }
      };
      this.guq.setCloseButtonClickListener(paramContext);
      this.guq.setBackButtonClickListener(paramContext);
      if ((this.guq instanceof com.tencent.mm.plugin.appbrand.widget.actionbar.b)) {
        ((com.tencent.mm.plugin.appbrand.widget.actionbar.b)this.guq).dl(true);
      }
      if ((getContext() != null) && ((getContext() instanceof Activity))) {
        break label466;
      }
    }
    for (;;)
    {
      this.gtb.cAG();
      return;
      paramContext.topMargin = com.tencent.mm.bp.a.ae(getContext(), s.e.app_brand_game_splash_loading_portrait_top_margin);
      this.guo.setPadding(0, 0, 0, com.tencent.mm.bp.a.ae(getContext(), s.e.app_brand_game_splash_icon_portrait_top_padding));
      this.gtb.setLayoutParams(paramContext);
      break;
      label466:
      paramContext = ((Activity)getContext()).getWindow();
      if (paramContext != null) {
        j.c(paramContext, true);
      }
    }
  }
  
  public final void a(a.d paramd) {}
  
  public final void anm()
  {
    x.w("MicroMsg.AppBrandGameUILoadingSplash", "animateHide");
    post(new b.1(this));
  }
  
  public final void ann() {}
  
  public final void bL(String paramString1, String paramString2)
  {
    com.tencent.mm.modelappbrand.b.b.Ka().a(this.gum, paramString1, null, f.dGr);
    this.guo.setText(paramString2);
  }
  
  public final View getView()
  {
    return this;
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    x.i("MicroMsg.AppBrandGameUILoadingSplash", "onLayout changed:%s", new Object[] { Boolean.valueOf(paramBoolean) });
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    d.b(this.fdO.fcq);
    d.b localb = d.cu(getContext());
    x.i("MicroMsg.AppBrandGameUILoadingSplash", "curDeviceOrientation: %s,mLastDeviceOrientation: %s", new Object[] { localb, this.gur });
    RelativeLayout.LayoutParams localLayoutParams;
    if (localb != this.gur)
    {
      this.gur = localb;
      localLayoutParams = (RelativeLayout.LayoutParams)this.gtb.getLayoutParams();
      if (localb != d.b.fpw) {
        break label149;
      }
      localLayoutParams.topMargin = com.tencent.mm.bp.a.ae(getContext(), s.e.app_brand_game_splash_loading_landspace_top_margin);
      this.guo.setPadding(0, 0, 0, 0);
    }
    for (;;)
    {
      this.gtb.setLayoutParams(localLayoutParams);
      requestLayout();
      return;
      label149:
      localLayoutParams.topMargin = com.tencent.mm.bp.a.ae(getContext(), s.e.app_brand_game_splash_loading_portrait_top_margin);
      this.guo.setPadding(0, 0, 0, com.tencent.mm.bp.a.ae(getContext(), s.e.app_brand_game_splash_icon_portrait_top_padding));
    }
  }
  
  public final void setProgress(int paramInt) {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/ui/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */