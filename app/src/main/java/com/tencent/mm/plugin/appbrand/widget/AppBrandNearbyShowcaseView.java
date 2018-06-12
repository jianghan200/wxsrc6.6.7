package com.tencent.mm.plugin.appbrand.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import com.tencent.mm.bp.a;

public final class AppBrandNearbyShowcaseView
  extends FrameLayout
{
  private int bi = a.fromDPToPix(getContext(), 25);
  private int gEf = a.fromDPToPix(getContext(), 19);
  
  public AppBrandNearbyShowcaseView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public AppBrandNearbyShowcaseView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  private void aoS()
  {
    if (getChildCount() > 0)
    {
      int i = getChildCount() - 1;
      while (i >= 0)
      {
        View localView = getChildAt(i);
        Object localObject = localView.getLayoutParams();
        ViewGroup.LayoutParams localLayoutParams = localView.getLayoutParams();
        int j = this.bi;
        localLayoutParams.height = j;
        ((ViewGroup.LayoutParams)localObject).width = j;
        localObject = (FrameLayout.LayoutParams)localView.getLayoutParams();
        ((FrameLayout.LayoutParams)localObject).gravity |= 0x5;
        ((FrameLayout.LayoutParams)localView.getLayoutParams()).rightMargin = (this.gEf * i);
        i -= 1;
      }
      requestLayout();
      invalidate();
    }
  }
  
  public final void aoT()
  {
    if (getChildCount() > 1)
    {
      int i = getChildCount() - 1;
      while (i >= 0)
      {
        View localView = getChildAt(i);
        localView.setTranslationX(((FrameLayout.LayoutParams)localView.getLayoutParams()).rightMargin);
        i -= 1;
      }
    }
  }
  
  public final void aoU()
  {
    int i = 1;
    if (getChildCount() > 1)
    {
      int j = 200;
      while (i < getChildCount())
      {
        getChildAt(i).animate().setDuration(j).translationX(0.0F).start();
        j += 50;
        i += 1;
      }
    }
  }
  
  public final int getExpandDuration()
  {
    if (getChildCount() <= 1) {
      return 0;
    }
    return (getChildCount() - 2) * 50 + 200;
  }
  
  public final ImageView lT(int paramInt)
  {
    return (ImageView)getChildAt(getChildCount() - 1 - paramInt);
  }
  
  public final void setIconGap(int paramInt)
  {
    if ((paramInt >= 0) && (this.gEf != paramInt))
    {
      this.gEf = paramInt;
      aoS();
    }
  }
  
  public final void setIconLayerCount(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt != getChildCount()))
    {
      if (paramInt > getChildCount())
      {
        int j = getChildCount();
        int i = 0;
        while (i < paramInt - j)
        {
          ImageView localImageView = new ImageView(getContext());
          FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(this.bi, this.bi);
          localLayoutParams.gravity = 16;
          addViewInLayout(localImageView, 0, localLayoutParams, true);
          i += 1;
        }
      }
      if (paramInt < getChildCount()) {
        removeViewsInLayout(0, getChildCount() - paramInt);
      }
      aoS();
    }
  }
  
  public final void setIconSize(int paramInt)
  {
    if ((paramInt > 0) && (paramInt != this.bi))
    {
      this.bi = paramInt;
      aoS();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/AppBrandNearbyShowcaseView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */