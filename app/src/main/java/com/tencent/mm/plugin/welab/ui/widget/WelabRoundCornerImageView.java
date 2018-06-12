package com.tencent.mm.plugin.welab.ui.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.support.v4.b.a.i;
import android.support.v4.b.a.k;
import android.util.AttributeSet;
import android.widget.ImageView;

public class WelabRoundCornerImageView
  extends ImageView
{
  private float qns;
  
  public WelabRoundCornerImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public WelabRoundCornerImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public Bitmap getDisplayingBitmap()
  {
    Drawable localDrawable = getDrawable();
    if ((localDrawable == null) || (!(localDrawable instanceof i))) {
      return null;
    }
    return ((i)localDrawable).mBitmap;
  }
  
  public void setCornerRadiusPercent(float paramFloat)
  {
    this.qns = paramFloat;
  }
  
  public void setImageBitmap(Bitmap paramBitmap)
  {
    if ((paramBitmap == null) || (paramBitmap.isRecycled()) || (paramBitmap.getWidth() < 0) || (paramBitmap.getHeight() < 0))
    {
      super.setImageBitmap(paramBitmap);
      return;
    }
    if (this.qns <= 0.0F)
    {
      super.setImageBitmap(paramBitmap);
      return;
    }
    i locali = k.a(getResources(), paramBitmap);
    float f = Math.min(paramBitmap.getWidth() * this.qns, paramBitmap.getHeight() * this.qns);
    if (locali.go != f)
    {
      locali.rG = false;
      if (!i.r(f)) {
        break label127;
      }
      locali.cN.setShader(locali.rB);
    }
    for (;;)
    {
      locali.go = f;
      locali.invalidateSelf();
      super.setImageDrawable(locali);
      return;
      label127:
      locali.cN.setShader(null);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/welab/ui/widget/WelabRoundCornerImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */