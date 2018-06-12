package com.tencent.mm.plugin.appbrand.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import com.tencent.mm.plugin.appbrand.config.a;
import com.tencent.mm.plugin.appbrand.config.a.b;
import com.tencent.mm.plugin.appbrand.config.a.d;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.s.j;
import com.tencent.mm.plugin.appbrand.widget.actionbar.c;
import com.tencent.mm.plugin.appbrand.widget.actionbar.c.a;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.ui.statusbar.b;

@SuppressLint({"ViewConstructor"})
final class d
  extends b
  implements l
{
  private g fdO;
  private c gnn;
  private Runnable guV;
  
  public d(Context paramContext, g paramg)
  {
    super(paramContext);
    this.fdO = paramg;
    this.gnn = c.a.c(getContext(), this.fdO);
    addView(this.gnn.getActionView());
    this.gnn.dk(false);
    paramContext = new d.1(this);
    this.gnn.setCloseButtonClickListener(paramContext);
    this.gnn.setBackButtonClickListener(paramContext);
    p(ad.getContext().getString(s.j.app_brand_action_plugin_splash_loading), -1, "black");
    setBackgroundColor(-1);
  }
  
  private void p(String paramString1, int paramInt, String paramString2)
  {
    this.gnn.setMainTitle(paramString1);
    this.gnn.setBackgroundColor(paramInt);
    this.gnn.setForegroundStyle(paramString2);
    this.gnn.setNavBackOrClose(true);
    this.gnn.setLoadingIconVisibility(true);
    ar(paramInt, "black".equals(paramString2));
  }
  
  public final void a(a.d paramd)
  {
    if (this.fdO.fcv.foN.adV()) {
      return;
    }
    p(paramd.fpf, j.aO(paramd.fpj, -1), paramd.fpg);
    setBackgroundColor(j.aO(paramd.fpc, -1));
  }
  
  public final void anm()
  {
    removeCallbacks(this.guV);
    post(new d.3(this));
  }
  
  public final void ann()
  {
    this.gnn.setNavHidden(true);
  }
  
  public final void bL(String paramString1, String paramString2)
  {
    this.gnn.setMainTitle(ad.getContext().getString(s.j.app_brand_action_plugin_splash_loading));
  }
  
  public final View getView()
  {
    return this;
  }
  
  protected final void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    if (this.guV == null)
    {
      this.guV = new d.2(this);
      postDelayed(this.guV, 1500L);
    }
  }
  
  protected final void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    removeCallbacks(this.guV);
  }
  
  public final void setProgress(int paramInt) {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/appbrand/ui/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */