package com.tencent.mm.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.support.v4.view.z;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tencent.mm.w.a.g;
import com.tencent.mm.w.a.h;
import com.tencent.mm.w.a.m;

public class ThreeDotsLoadingView
  extends FrameLayout
{
  private int dotColor = -16777216;
  private boolean uIt = false;
  private ViewGroup uIu;
  private ImageView uIv;
  private ImageView uIw;
  private ImageView uIx;
  private final Runnable uIy = new Runnable()
  {
    public final void run()
    {
      ThreeDotsLoadingView.a(ThreeDotsLoadingView.this);
      ((AnimationDrawable)ThreeDotsLoadingView.b(ThreeDotsLoadingView.this).getDrawable()).start();
      ((AnimationDrawable)ThreeDotsLoadingView.c(ThreeDotsLoadingView.this).getDrawable()).start();
      ((AnimationDrawable)ThreeDotsLoadingView.d(ThreeDotsLoadingView.this).getDrawable()).start();
    }
  };
  private boolean yq = false;
  
  public ThreeDotsLoadingView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init(paramContext, paramAttributeSet);
  }
  
  public ThreeDotsLoadingView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init(paramContext, paramAttributeSet);
  }
  
  private void cAI()
  {
    this.uIv.setImageDrawable(g(this.dotColor, 0.5F));
    this.uIw.setImageDrawable(g(this.dotColor, 0.4F));
    this.uIx.setImageDrawable(g(this.dotColor, 0.3F));
  }
  
  private static AnimationDrawable d(int paramInt, float[] paramArrayOfFloat)
  {
    int i = 0;
    AnimationDrawable localAnimationDrawable = new AnimationDrawable();
    localAnimationDrawable.setOneShot(false);
    while (i < 3)
    {
      localAnimationDrawable.addFrame(g(paramInt, paramArrayOfFloat[i]), 300);
      i += 1;
    }
    return localAnimationDrawable;
  }
  
  private static Drawable g(int paramInt, float paramFloat)
  {
    ShapeDrawable localShapeDrawable = new ShapeDrawable(new OvalShape());
    localShapeDrawable.setIntrinsicHeight(32);
    localShapeDrawable.setIntrinsicWidth(32);
    localShapeDrawable.getPaint().setColor(paramInt);
    localShapeDrawable.getPaint().setAlpha((int)(255.0F * paramFloat));
    return localShapeDrawable;
  }
  
  private void init(Context paramContext, AttributeSet paramAttributeSet)
  {
    this.uIu = ((ViewGroup)LayoutInflater.from(paramContext).inflate(a.h.layout_three_dots_loading_view, this, true));
    this.uIv = ((ImageView)this.uIu.findViewById(a.g.loading_dot0));
    this.uIw = ((ImageView)this.uIu.findViewById(a.g.loading_dot1));
    this.uIx = ((ImageView)this.uIu.findViewById(a.g.loading_dot2));
    if (paramAttributeSet != null)
    {
      paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, a.m.ThreeDotsLoadingView);
      this.dotColor = paramContext.getColor(a.m.ThreeDotsLoadingView_dotColor, -16777216);
      paramContext.recycle();
    }
    cAI();
  }
  
  public final void cAG()
  {
    if (!z.ak(this)) {
      this.uIt = true;
    }
    while (this.yq) {
      return;
    }
    this.yq = true;
    cAI();
    postDelayed(this.uIy, 300L);
  }
  
  public final void cAH()
  {
    this.uIt = false;
    if (!this.yq) {}
    do
    {
      return;
      this.yq = false;
      removeCallbacks(this.uIy);
    } while (!(this.uIv.getDrawable() instanceof AnimationDrawable));
    ((AnimationDrawable)this.uIv.getDrawable()).stop();
    ((AnimationDrawable)this.uIw.getDrawable()).stop();
    ((AnimationDrawable)this.uIx.getDrawable()).stop();
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    if (this.uIt)
    {
      this.uIt = false;
      cAG();
    }
  }
  
  public void setAlpha(float paramFloat)
  {
    this.uIv.setAlpha(paramFloat);
    this.uIw.setAlpha(paramFloat);
    this.uIx.setAlpha(paramFloat);
    if (getBackground() != null) {
      getBackground().setAlpha(Math.round(255.0F * paramFloat));
    }
  }
  
  public void setVisibility(int paramInt)
  {
    if ((8 == paramInt) || (4 == paramInt)) {
      cAH();
    }
    super.setVisibility(paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/ui/widget/ThreeDotsLoadingView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */