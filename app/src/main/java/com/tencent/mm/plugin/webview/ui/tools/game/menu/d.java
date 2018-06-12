package com.tencent.mm.plugin.webview.ui.tools.game.menu;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.Window;
import com.tencent.mm.ui.base.l;

public final class d
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  private ViewTreeObserver Jd;
  private View eS;
  private Context mContext;
  private l ofr;
  private e qgE;
  public b.b qgF;
  private GameMenuView qgG;
  private f qgH;
  private boolean qgI = false;
  private boolean qgJ;
  public boolean qgK;
  public boolean qgL = false;
  
  public d(Context paramContext)
  {
    this.mContext = paramContext;
    if ((this.mContext instanceof Activity))
    {
      paramContext = (ViewGroup)((Activity)this.mContext).getWindow().getDecorView();
      if (paramContext.getChildCount() <= 0) {
        break label146;
      }
    }
    label146:
    for (this.eS = paramContext.getChildAt(0);; this.eS = paramContext)
    {
      paramContext = this.mContext;
      this.ofr = new l(paramContext);
      this.qgE = new e(paramContext);
      this.qgG = new GameMenuView(paramContext);
      this.qgH = new f(paramContext);
      this.qgG.setAdapter(this.qgH);
      this.qgI = bdK();
      this.qgE.setContentView(this.qgG);
      return;
    }
  }
  
  private boolean bdK()
  {
    DisplayMetrics localDisplayMetrics = this.mContext.getResources().getDisplayMetrics();
    return localDisplayMetrics.widthPixels > localDisplayMetrics.heightPixels;
  }
  
  private boolean isShowing()
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (this.qgE != null)
    {
      bool1 = bool2;
      if (this.qgE.isShowing()) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public final void a(b.c paramc)
  {
    if (this.qgG != null) {
      this.qgG.setGameMenuItemSelectedListener(paramc);
    }
  }
  
  public final void bXO()
  {
    int i = 0;
    this.qgI = bdK();
    if (this.qgF != null) {
      this.qgF.a(this.ofr);
    }
    if (this.qgE != null)
    {
      if (this.qgH != null)
      {
        f localf = this.qgH;
        localf.ofr = this.ofr;
        localf.notifyDataSetChanged();
      }
      if (Build.VERSION.SDK_INT >= 21) {
        this.qgE.getWindow().addFlags(Integer.MIN_VALUE);
      }
      if ((this.qgJ) && (Build.VERSION.SDK_INT >= 23) && (this.qgE != null))
      {
        this.qgE.getWindow().getDecorView().setSystemUiVisibility(9216);
        this.qgE.getWindow().setStatusBarColor(0);
      }
      if (this.qgK) {
        this.qgE.getWindow().addFlags(1024);
      }
      if (!this.qgL) {
        break label282;
      }
      this.qgE.getWindow().setFlags(8, 8);
      this.qgE.getWindow().addFlags(131200);
      this.qgE.getWindow().getDecorView().setSystemUiVisibility(6);
    }
    for (;;)
    {
      if (this.eS != null)
      {
        if (this.Jd == null) {
          i = 1;
        }
        this.Jd = this.eS.getViewTreeObserver();
        if (i != 0) {
          this.Jd.addOnGlobalLayoutListener(this);
        }
      }
      this.qgE.setOnDismissListener(new d.1(this));
      if (this.qgG != null) {
        this.qgG.setDismissListener(new b.a()
        {
          public final void onDismiss()
          {
            d.this.bzW();
          }
        });
      }
      this.qgE.show();
      return;
      label282:
      this.qgE.getWindow().clearFlags(8);
      this.qgE.getWindow().clearFlags(131072);
      this.qgE.getWindow().clearFlags(128);
      this.qgE.getWindow().getDecorView().setSystemUiVisibility(0);
    }
  }
  
  public final void bzW()
  {
    if (this.Jd != null)
    {
      if (!this.Jd.isAlive()) {
        this.Jd = this.eS.getViewTreeObserver();
      }
      this.Jd.removeGlobalOnLayoutListener(this);
      this.Jd = null;
    }
    if (this.qgE != null) {
      this.qgE.dismiss();
    }
  }
  
  public final void onGlobalLayout()
  {
    if (isShowing())
    {
      View localView = this.eS;
      if ((localView != null) && (localView.isShown())) {
        break label28;
      }
      bzW();
    }
    label28:
    while ((!isShowing()) || (this.qgI == bdK())) {
      return;
    }
    bzW();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/webview/ui/tools/game/menu/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */