package com.tencent.mm.plugin.appbrand.widget.actionbar;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.mm.plugin.appbrand.page.a.a;
import com.tencent.mm.plugin.appbrand.s.d;
import com.tencent.mm.plugin.appbrand.s.e;
import com.tencent.mm.plugin.appbrand.s.f;
import com.tencent.mm.plugin.appbrand.s.g;
import com.tencent.mm.plugin.appbrand.s.h;
import com.tencent.mm.plugin.appbrand.s.i;
import com.tencent.mm.plugin.appbrand.ui.j;
import com.tencent.mm.plugin.appbrand.widget.CircleProgressDrawable;
import com.tencent.mm.plugin.appbrand.widget.CircleProgressDrawable.a;
import com.tencent.mm.plugin.appbrand.widget.CircleProgressDrawable.b;
import com.tencent.mm.plugin.appbrand.widget.CircleProgressDrawable.c;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.y;
import java.util.ArrayList;

public final class a
  extends LinearLayout
  implements c
{
  private int AC;
  private View gEZ;
  private TextView gFa;
  private TextView gFb;
  private ImageView gFc;
  private View gFd;
  private ImageButton gFe;
  private AppBrandOptionButton gFf;
  private AppBrandCapsuleHomeButton gFg;
  private ProgressBar gFh;
  private CircleProgressDrawable gFi;
  private LinearLayout gFj;
  private ImageView gFk;
  private int gFl;
  private double gFm;
  private View.OnClickListener gFn = null;
  private View.OnClickListener gFo = null;
  private long gFp = 0L;
  
  public a(Context paramContext)
  {
    super(paramContext);
    setLayoutParams(new LinearLayout.LayoutParams(-1, getActionBarHeight()));
    setGravity(19);
    setBackgroundResource(s.d.action_bar_color);
    addView(y.gq(getContext()).inflate(s.h.app_brand_action_bar, this, false));
    this.gFl = -1;
    this.AC = getResources().getColor(s.d.action_bar_color);
    this.gFm = 1.0D;
    this.gEZ = findViewById(s.g.actionbar_title_area);
    this.gFa = ((TextView)findViewById(s.g.actionbar_title_main));
    this.gFb = ((TextView)findViewById(s.g.actionbar_title_sub));
    this.gFc = ((ImageView)findViewById(s.g.actionbar_nav_btn));
    this.gFd = findViewById(s.g.actionbar_nav_area);
    this.gFe = ((ImageButton)findViewById(s.g.actionbar_home_btn));
    this.gFf = ((AppBrandOptionButton)findViewById(s.g.actionbar_capsule_option_btn));
    this.gFg = ((AppBrandCapsuleHomeButton)findViewById(s.g.actionbar_capsule_home_btn));
    this.gFh = ((ProgressBar)findViewById(s.g.actionbar_loading_icon));
    this.gFj = ((LinearLayout)findViewById(s.g.actionbar_capsule_area));
    this.gFk = ((ImageView)findViewById(s.g.actionbar_capsule_divider));
    this.gFi = new CircleProgressDrawable();
    this.gFd.setOnClickListener(new a.1(this));
    this.gFg.setOnClickListener(new a.2(this));
  }
  
  private void apa()
  {
    this.gFc.setImageResource(s.i.actionbar_icon_dark_back);
    this.gFc.setColorFilter(this.gFl, PorterDuff.Mode.SRC_ATOP);
    this.gFa.setTextColor(this.gFl);
    this.gFb.setTextColor(this.gFl);
    this.gFe.setImageDrawable(j.d(getContext(), s.i.app_brand_action_bar_homebtn, this.gFl));
    CircleProgressDrawable localCircleProgressDrawable = this.gFi;
    localCircleProgressDrawable.jV = this.gFl;
    localCircleProgressDrawable.invalidateSelf();
    this.gFh.setLayerType(1, null);
    this.gFh.setIndeterminateDrawable(this.gFi);
    apb();
    if (this.gFl == -1)
    {
      this.gFk.setImageResource(s.d.app_brand_capsule_divider_dark);
      this.gFj.setBackgroundResource(s.f.app_brand_game_capsule_dark_background);
      return;
    }
    this.gFk.setImageResource(s.d.app_brand_capsule_divider_light);
    this.gFj.setBackgroundResource(s.f.app_brand_game_capsule_light_background);
  }
  
  private void apb()
  {
    if (this.gFl == -1)
    {
      this.gFf.setColor(-1);
      this.gFg.setColor(-1);
      return;
    }
    this.gFf.setColor(-16777216);
    this.gFg.setColor(-16777216);
  }
  
  private int getActionBarHeight()
  {
    return com.tencent.mm.plugin.appbrand.widget.a.cM(getContext());
  }
  
  public final void aoZ()
  {
    this.gFf.reset();
    this.gFg.reset();
    apb();
  }
  
  public final void dk(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.gFj.setVisibility(0);
      if (!paramBoolean) {
        break label49;
      }
      this.gFf.setVisibility(0);
    }
    for (;;)
    {
      if (!paramBoolean) {
        break label61;
      }
      this.gFg.setVisibility(0);
      return;
      this.gFj.setVisibility(8);
      break;
      label49:
      this.gFf.setVisibility(8);
    }
    label61:
    this.gFg.setVisibility(8);
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
    return this.gFa.getText();
  }
  
  public final void setBackButtonClickListener(View.OnClickListener paramOnClickListener)
  {
    this.gFn = paramOnClickListener;
  }
  
  public final void setBackgroundAlpha(double paramDouble)
  {
    this.gFm = paramDouble;
    super.getBackground().setAlpha((int)(255.0D * paramDouble));
  }
  
  public final void setBackgroundColor(int paramInt)
  {
    this.AC = paramInt;
    super.setBackgroundColor(paramInt);
    setBackgroundAlpha(this.gFm);
  }
  
  public final void setBackgroundColor(String paramString)
  {
    this.AC = j.aO(paramString, this.AC);
    setBackgroundColor(this.AC);
  }
  
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
  
  public final void setHomeButtonClickListener(View.OnClickListener paramOnClickListener)
  {
    this.gFe.setOnClickListener(paramOnClickListener);
  }
  
  public final void setLoadingIconVisibility(boolean paramBoolean)
  {
    Object localObject1 = this.gFh;
    if (paramBoolean) {}
    for (int i = 0;; i = 8)
    {
      ((ProgressBar)localObject1).setVisibility(i);
      if (!paramBoolean) {
        break;
      }
      localObject1 = this.gFi;
      ((CircleProgressDrawable)localObject1).jC.clear();
      ArrayList localArrayList = ((CircleProgressDrawable)localObject1).jC;
      Object localObject2 = ((CircleProgressDrawable)localObject1).gEK;
      ObjectAnimator localObjectAnimator1 = ObjectAnimator.ofFloat(localObject2, "trimPathStart", new float[] { 0.0F, 0.75F });
      localObjectAnimator1.setDuration(1333L);
      localObjectAnimator1.setInterpolator(CircleProgressDrawable.c.gEM);
      localObjectAnimator1.setRepeatCount(-1);
      ObjectAnimator localObjectAnimator2 = ObjectAnimator.ofFloat(localObject2, "trimPathEnd", new float[] { 0.0F, 0.75F });
      localObjectAnimator2.setDuration(1333L);
      localObjectAnimator2.setInterpolator(CircleProgressDrawable.b.gEM);
      localObjectAnimator2.setRepeatCount(-1);
      localObject2 = ObjectAnimator.ofFloat(localObject2, "trimPathOffset", new float[] { 0.0F, 0.25F });
      ((ObjectAnimator)localObject2).setDuration(1333L);
      ((ObjectAnimator)localObject2).setInterpolator(CircleProgressDrawable.a.gEM);
      ((ObjectAnimator)localObject2).setRepeatCount(-1);
      AnimatorSet localAnimatorSet = new AnimatorSet();
      localAnimatorSet.playTogether(new Animator[] { localObjectAnimator1, localObjectAnimator2, localObject2 });
      localArrayList.add(localAnimatorSet);
      localArrayList = ((CircleProgressDrawable)localObject1).jC;
      localObject1 = ObjectAnimator.ofFloat(((CircleProgressDrawable)localObject1).gEL, "rotation", new float[] { 0.0F, 720.0F });
      ((ObjectAnimator)localObject1).setDuration(6665L);
      ((ObjectAnimator)localObject1).setInterpolator(CircleProgressDrawable.a.gEM);
      ((ObjectAnimator)localObject1).setRepeatCount(-1);
      localArrayList.add(localObject1);
      this.gFi.start();
      return;
    }
    this.gFi.stop();
  }
  
  public final void setMainTitle(String paramString)
  {
    this.gFa.setText(paramString);
  }
  
  public final void setNavBackOrClose(boolean paramBoolean)
  {
    apa();
  }
  
  public final void setNavHidden(boolean paramBoolean)
  {
    View localView = this.gFd;
    if (paramBoolean)
    {
      i = 8;
      localView.setVisibility(i);
      localView = this.gEZ;
      if (!paramBoolean) {
        break label54;
      }
    }
    label54:
    for (int i = getContext().getResources().getDimensionPixelSize(s.e.LargePadding);; i = 0)
    {
      localView.setPadding(i, 0, 0, 0);
      return;
      i = 0;
      break;
    }
  }
  
  public final void setOptionBtnStatus(a.a parama)
  {
    this.gFf.a(parama, this.gFl);
  }
  
  public final void setOptionButtonClickListener(View.OnClickListener paramOnClickListener)
  {
    this.gFf.setOnClickListener(paramOnClickListener);
  }
  
  public final void setSubTitle(String paramString)
  {
    if (bi.oW(paramString)) {
      this.gFb.setVisibility(8);
    }
    for (;;)
    {
      this.gFb.clearAnimation();
      return;
      this.gFb.setVisibility(0);
      this.gFb.setText(paramString);
    }
  }
  
  public final void setTitleAreaOnDoubleClickListener(View.OnClickListener paramOnClickListener)
  {
    this.gEZ.setOnClickListener(new a.3(this, paramOnClickListener));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/actionbar/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */