package com.tencent.mm.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.mm.memory.ui.QPictureView;

public class QFadeImageView
  extends QPictureView
{
  public String aAL;
  public long jEK;
  
  public QFadeImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public QFadeImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public String getImageKey()
  {
    return this.aAL;
  }
  
  public long getStartTimeMillis()
  {
    return this.jEK;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ui/widget/QFadeImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */