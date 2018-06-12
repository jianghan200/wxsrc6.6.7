package com.tencent.mm.plugin.appbrand.widget.actionbar;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.z;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.mm.plugin.appbrand.page.a.a;
import com.tencent.mm.plugin.appbrand.s.d;
import com.tencent.mm.plugin.appbrand.s.f;
import com.tencent.mm.plugin.appbrand.s.g;
import com.tencent.mm.plugin.appbrand.s.h;
import com.tencent.mm.plugin.appbrand.ui.j;
import com.tencent.mm.ui.statusbar.c.a;
import com.tencent.mm.ui.y;

public final class b
  extends LinearLayout
  implements c, c.a
{
  private int AC;
  private AppBrandCapsuleHomeButton gFg;
  private ImageView gFk;
  private int gFl;
  private double gFm;
  private View.OnClickListener gFn = null;
  private View.OnClickListener gFo = null;
  private AppBrandCapsuleOptionButton gFr;
  private LinearLayout gFs;
  private boolean gFt;
  
  public b(Context paramContext, boolean paramBoolean)
  {
    super(paramContext);
    this.gFt = paramBoolean;
    setLayoutParams(new ViewGroup.MarginLayoutParams(-1, getActionBarHeight()));
    setGravity(19);
    addView(y.gq(getContext()).inflate(s.h.app_brand_capsule_bar, this, false));
    this.gFl = -1;
    this.AC = getResources().getColor(s.d.action_bar_color);
    this.gFm = 1.0D;
    this.gFr = ((AppBrandCapsuleOptionButton)findViewById(s.g.capsulebar_capsule_option_btn));
    this.gFg = ((AppBrandCapsuleHomeButton)findViewById(s.g.capsulebar_capsule_home_btn));
    this.gFk = ((ImageView)findViewById(s.g.capsulebar_capsule_divider));
    this.gFs = ((LinearLayout)findViewById(s.g.capsulebar_capsule_area));
    this.gFg.setOnClickListener(new b.1(this));
    this.gFr.setVisibility(0);
    this.gFg.setVisibility(0);
  }
  
  private void apa()
  {
    apb();
    if (this.gFl == -1)
    {
      this.gFk.setImageResource(s.d.app_brand_capsule_divider_dark);
      this.gFs.setBackgroundResource(s.f.app_brand_game_capsule_dark_background);
      return;
    }
    this.gFk.setImageResource(s.d.app_brand_capsule_divider_light);
    this.gFs.setBackgroundResource(s.f.app_brand_game_capsule_light_background);
  }
  
  private void apb()
  {
    if (this.gFl == -1)
    {
      this.gFr.setColor(-1);
      this.gFg.setColor(-1);
      return;
    }
    this.gFr.setColor(-16777216);
    this.gFg.setColor(-16777216);
  }
  
  private void apc()
  {
    if (!z.ai(this))
    {
      post(new b.2(this));
      return;
    }
    if (this.gFt) {
      setPadding(0, 0, 0, 0);
    }
    for (;;)
    {
      requestLayout();
      return;
      setPadding(0, Math.max(com.tencent.mm.ui.statusbar.a.aa(j.cJ(getContext())), 0), 0, 0);
    }
  }
  
  private int getActionBarHeight()
  {
    return com.tencent.mm.plugin.appbrand.widget.a.cM(getContext());
  }
  
  public final void aoZ()
  {
    this.gFr.reset();
    this.gFg.reset();
    apb();
  }
  
  public final void dk(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.gFs.setVisibility(0);
      if (!paramBoolean) {
        break label49;
      }
      this.gFr.setVisibility(0);
    }
    for (;;)
    {
      if (!paramBoolean) {
        break label61;
      }
      this.gFg.setVisibility(0);
      return;
      this.gFs.setVisibility(8);
      break;
      label49:
      this.gFr.setVisibility(8);
    }
    label61:
    this.gFg.setVisibility(8);
  }
  
  public final void dl(boolean paramBoolean)
  {
    this.gFt = paramBoolean;
    apc();
  }
  
  public final View getActionView()
  {
    return this;
  }
  
  public final double getBackgroundAlpha()
  {
    return this.gFm;
  }
  
  public final int getBackgroundColor()
  {
    return this.AC;
  }
  
  public final int getForegroundColor()
  {
    return this.gFl;
  }
  
  public final CharSequence getMainTitle()
  {
    return null;
  }
  
  public final void lH(int paramInt)
  {
    apc();
  }
  
  protected final void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    com.tencent.mm.ui.statusbar.c.ab(j.cJ(getContext())).a(this);
    apc();
  }
  
  public final void setBackButtonClickListener(View.OnClickListener paramOnClickListener)
  {
    this.gFn = paramOnClickListener;
  }
  
  public final void setBackgroundAlpha(double paramDouble) {}
  
  public final void setBackgroundColor(int paramInt) {}
  
  public final void setBackgroundColor(String paramString) {}
  
  public final void setCapsuleHomeButtonLongClickListener(View.OnLongClickListener paramOnLongClickListener)
  {
    this.gFg.setOnLongClickListener(paramOnLongClickListener);
  }
  
  public final void setCloseButtonClickListener(View.OnClickListener paramOnClickListener)
  {
    this.gFo = paramOnClickListener;
  }
  
  public final void setForegroundColor(int paramInt)
  {
    this.gFl = paramInt;
    apa();
  }
  
  public final void setForegroundStyle(String paramString)
  {
    if ("white".equals(paramString)) {
      this.gFl = -1;
    }
    for (;;)
    {
      apa();
      return;
      if ("black".equals(paramString)) {
        this.gFl = -16777216;
      }
    }
  }
  
  public final void setLoadingIconVisibility(boolean paramBoolean) {}
  
  public final void setMainTitle(String paramString) {}
  
  public final void setNavBackOrClose(boolean paramBoolean) {}
  
  public final void setNavHidden(boolean paramBoolean) {}
  
  public final void setOptionBtnStatus(a.a parama)
  {
    this.gFr.a(parama, this.gFl);
  }
  
  public final void setOptionButtonClickListener(View.OnClickListener paramOnClickListener)
  {
    this.gFr.setOnClickListener(paramOnClickListener);
  }
  
  public final void setSubTitle(String paramString) {}
  
  public final void setTitleAreaOnDoubleClickListener(View.OnClickListener paramOnClickListener) {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/actionbar/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */