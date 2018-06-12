package com.tencent.mm.plugin.appbrand.ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.modelappbrand.b.f;
import com.tencent.mm.plugin.appbrand.config.a.d;
import com.tencent.mm.plugin.appbrand.s.e;
import com.tencent.mm.plugin.appbrand.s.g;
import com.tencent.mm.plugin.appbrand.s.h;
import com.tencent.mm.plugin.appbrand.widget.actionbar.c;
import com.tencent.mm.plugin.appbrand.widget.actionbar.c.a;
import com.tencent.mm.ui.widget.ThreeDotsLoadingView;

@SuppressLint({"ViewConstructor"})
final class g
  extends com.tencent.mm.ui.statusbar.b
  implements l
{
  private com.tencent.mm.plugin.appbrand.g fdO;
  private ThreeDotsLoadingView gtb;
  private ImageView gum;
  private TextView guo;
  private LinearLayout gup;
  private c guq;
  private View gwH;
  private View gwI;
  
  public g(Context paramContext, com.tencent.mm.plugin.appbrand.g paramg)
  {
    super(paramContext);
    this.fdO = paramg;
    setClickable(true);
    setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    LayoutInflater.from(getContext()).inflate(s.h.app_brand_splash_ui, this);
    this.gum = ((ImageView)findViewById(s.g.app_brand_loading_avatar));
    this.gum.setImageDrawable(com.tencent.mm.modelappbrand.b.a.JZ());
    this.guo = ((TextView)findViewById(s.g.app_brand_loading_name));
    this.gtb = ((ThreeDotsLoadingView)findViewById(s.g.app_brand_loading_view));
    this.gup = ((LinearLayout)findViewById(s.g.app_brand_loading_fake_ab_container));
    this.gwI = findViewById(s.g.app_brand_loading_top_area);
    this.gwH = findViewById(s.g.app_brand_loading_root);
    this.guq = c.a.c(getContext(), this.fdO);
    paramContext = new LinearLayout.LayoutParams(-2, -2);
    paramContext.gravity = 21;
    paramContext.rightMargin = com.tencent.mm.bp.a.ae(getContext(), s.e.app_brand_game_mode_icon_margin_right);
    this.gup.addView(this.guq.getActionView(), paramContext);
    int i = com.tencent.mm.plugin.appbrand.widget.a.cM(getContext());
    this.guo.getLayoutParams().height = i;
    ar(-1, true);
    this.guq.setBackgroundColor(0);
    this.guq.setForegroundStyle("black");
    this.guq.setNavBackOrClose(false);
    paramContext = new g.2(this);
    this.guq.setCloseButtonClickListener(paramContext);
    this.guq.setBackButtonClickListener(paramContext);
    if ((this.guq instanceof com.tencent.mm.plugin.appbrand.widget.actionbar.b)) {
      ((com.tencent.mm.plugin.appbrand.widget.actionbar.b)this.guq).dl(true);
    }
    this.gtb.cAG();
  }
  
  public final void a(a.d paramd) {}
  
  public final void anm()
  {
    post(new g.1(this));
  }
  
  public final void ann()
  {
    this.guq.setNavHidden(true);
  }
  
  public final void bL(String paramString1, String paramString2)
  {
    com.tencent.mm.modelappbrand.b.b.Ka().a(this.gum, paramString1, null, f.dGr);
    this.guo.setText(paramString2);
  }
  
  public final View getView()
  {
    return this;
  }
  
  public final boolean hasOverlappingRendering()
  {
    return false;
  }
  
  protected final void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    if ((getContext() instanceof Activity)) {
      j.c(((Activity)getContext()).getWindow(), false);
    }
  }
  
  public final void setProgress(int paramInt) {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/ui/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */