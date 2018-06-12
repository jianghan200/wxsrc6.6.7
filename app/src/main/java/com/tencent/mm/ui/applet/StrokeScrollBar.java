package com.tencent.mm.ui.applet;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.mm.R.i;
import com.tencent.mm.ui.base.VerticalScrollBar;

public class StrokeScrollBar
  extends VerticalScrollBar
{
  public StrokeScrollBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  protected final void aAV()
  {
    this.kuW = new String[18];
    int i = 0;
    while (i < this.kuW.length)
    {
      this.kuW[i] = (Integer.toString(i + 3) + "劃");
      i += 1;
    }
    this.kuU = 2.0F;
    this.kuV = 79;
  }
  
  protected int getToastLayoutId()
  {
    return R.i.show_head_toast_stroke;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/ui/applet/StrokeScrollBar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */