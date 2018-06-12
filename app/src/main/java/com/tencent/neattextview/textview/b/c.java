package com.tencent.neattextview.textview.b;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class c
  extends b<ClickableSpan>
{
  public boolean lmQ;
  
  public c(int paramInt1, int paramInt2, ClickableSpan paramClickableSpan)
  {
    super(paramInt1, paramInt2, paramClickableSpan);
  }
  
  public final void a(Canvas paramCanvas, TextPaint paramTextPaint, List<com.tencent.neattextview.textview.layout.c> paramList)
  {
    ee(paramList);
    if (this.lmQ)
    {
      int i = paramTextPaint.getColor();
      int j = paramTextPaint.bgColor;
      boolean bool = paramTextPaint.isUnderlineText();
      ((ClickableSpan)this.vab).updateDrawState(paramTextPaint);
      paramTextPaint.setColor(paramTextPaint.bgColor);
      paramList = this.vaa.iterator();
      while (paramList.hasNext()) {
        paramCanvas.drawRect((RectF)paramList.next(), paramTextPaint);
      }
      paramTextPaint.setColor(i);
      paramTextPaint.setUnderlineText(bool);
      paramTextPaint.bgColor = j;
      this.lmQ = false;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/neattextview/textview/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */