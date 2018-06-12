package com.tencent.mm.plugin.emoji.ui.v2;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import com.tencent.mm.plugin.gif.MMAnimateView;

public class EmojiStoreV2RewardBannerView
  extends MMAnimateView
{
  private float dD = 0.75F;
  
  public EmojiStoreV2RewardBannerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public EmojiStoreV2RewardBannerView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    paramInt2 = getRight() - getLeft() - getPaddingRight() - getPaddingLeft();
    int i = (int)(paramInt2 * this.dD);
    if (paramInt2 != 0)
    {
      paramInt1 = i;
      if (i != 0) {}
    }
    else
    {
      paramInt2 = getContext().getResources().getDisplayMetrics().widthPixels;
      paramInt1 = (int)(paramInt2 * this.dD);
    }
    setMeasuredDimension(paramInt2, paramInt1);
  }
  
  public void setScale(float paramFloat)
  {
    this.dD = paramFloat;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2RewardBannerView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */