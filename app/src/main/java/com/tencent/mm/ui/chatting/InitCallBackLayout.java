package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class InitCallBackLayout
  extends FrameLayout
{
  private boolean hasDrawed;
  private ap tqv;
  
  public InitCallBackLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if (!this.hasDrawed)
    {
      this.hasDrawed = true;
      if (this.tqv != null) {
        this.tqv.aRL();
      }
    }
  }
  
  public void setListener(ap paramap)
  {
    this.tqv = paramap;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/ui/chatting/InitCallBackLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */