package com.tencent.xweb.extension.video;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.mm.sdk.platformtools.x;
import org.xwalk.core.R.drawable;
import org.xwalk.core.R.layout;

public class VideoDotPercentIndicator
  extends LinearLayout
{
  private LayoutInflater Bc;
  private int fZR;
  
  public VideoDotPercentIndicator(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init(paramContext);
  }
  
  public VideoDotPercentIndicator(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init(paramContext);
  }
  
  private void init(Context paramContext)
  {
    this.Bc = LayoutInflater.from(paramContext);
    setDotsNum(0);
  }
  
  public void setDotsNum(int paramInt)
  {
    if (paramInt > 1) {}
    for (;;)
    {
      this.fZR = paramInt;
      removeAllViews();
      paramInt = 0;
      while (paramInt < this.fZR)
      {
        addView((ImageView)this.Bc.inflate(R.layout.xweb_dot_percent_indicator_dot, this, false));
        paramInt += 1;
      }
      paramInt = 8;
    }
  }
  
  public void setProgress(float paramFloat)
  {
    float f1 = 1.0F;
    float f2 = 0.0F;
    paramFloat /= 100.0F;
    if (paramFloat < 0.0F)
    {
      paramFloat = f2;
      if (paramFloat <= 1.0F) {
        break label119;
      }
      paramFloat = f1;
    }
    int j;
    label119:
    for (;;)
    {
      int k = (int)Math.rint(this.fZR * paramFloat);
      x.v("MicroMsg.AppBrandDotPercentIndicator", "setPercent percent:%s dotsOnNum:%d", new Object[] { Float.valueOf(paramFloat), Integer.valueOf(k) });
      int i = 0;
      for (;;)
      {
        j = i;
        if (i >= k) {
          break;
        }
        j = i;
        if (i >= getChildCount()) {
          break;
        }
        ((ImageView)getChildAt(i)).setImageResource(R.drawable.xweb_video_percent_indicator_dot_on_shape);
        i += 1;
      }
      break;
    }
    while (j < getChildCount())
    {
      ((ImageView)getChildAt(j)).setImageResource(R.drawable.xweb_video_percent_indicator_dot_off_shape);
      j += 1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/xweb/extension/video/VideoDotPercentIndicator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */