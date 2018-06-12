package com.tencent.mm.ui.base;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.mm.w.a.h;

public class AlphabetScrollBar
  extends VerticalScrollBar
{
  public AlphabetScrollBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public void aAV()
  {
    this.kuW = new String[] { "↑", "☆", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "#" };
    this.kuU = 1.3F;
    this.kuV = 79;
  }
  
  protected int getToastLayoutId()
  {
    return a.h.show_head_toast;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/ui/base/AlphabetScrollBar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */