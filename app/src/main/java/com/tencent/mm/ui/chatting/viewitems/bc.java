package com.tencent.mm.ui.chatting.viewitems;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import com.tencent.mm.ui.base.a.a;

abstract class bc
  extends ClickableSpan
  implements a
{
  private boolean ugB;
  private int ugC;
  private int ugD;
  
  public bc(int paramInt1, int paramInt2)
  {
    this.ugC = paramInt1;
    this.ugD = paramInt2;
  }
  
  public final void kT(boolean paramBoolean)
  {
    this.ugB = paramBoolean;
  }
  
  public void updateDrawState(TextPaint paramTextPaint)
  {
    super.updateDrawState(paramTextPaint);
    if (this.ugB) {}
    for (int i = this.ugD;; i = this.ugC)
    {
      paramTextPaint.setColor(i);
      paramTextPaint.setUnderlineText(false);
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/ui/chatting/viewitems/bc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */