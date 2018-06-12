package com.tencent.mm.plugin.game.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.widget.HorizontalScrollView;

public class BouncyHScrollView
  extends HorizontalScrollView
{
  private int kgK;
  private Context mContext;
  
  public BouncyHScrollView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.mContext = paramContext;
  }
  
  public BouncyHScrollView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.mContext = paramContext;
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.kgK = ((int)(this.mContext.getResources().getDisplayMetrics().density * 300.0F));
    setOverScrollMode(0);
    setSmoothScrollingEnabled(true);
    setHorizontalFadingEdgeEnabled(false);
  }
  
  protected boolean overScrollBy(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, boolean paramBoolean)
  {
    return super.overScrollBy(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, this.kgK, paramInt8, paramBoolean);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/game/widget/BouncyHScrollView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */