package com.tencent.mm.pluginsdk.ui.emoji;

import android.content.Context;
import android.util.AttributeSet;

public class PreViewEmojiView
  extends MMEmojiView
{
  private int fi = 0;
  
  public PreViewEmojiView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public PreViewEmojiView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if (this.fi > 0) {
      setMeasuredDimension(this.fi, this.fi);
    }
  }
  
  public void setSize(int paramInt)
  {
    this.fi = paramInt;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/pluginsdk/ui/emoji/PreViewEmojiView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */