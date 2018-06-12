package com.tencent.neattextview.textview.b;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.style.BackgroundColorSpan;
import android.text.style.CharacterStyle;
import com.tencent.neattextview.textview.layout.c;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class a
  extends b<BackgroundColorSpan>
{
  public a(int paramInt1, int paramInt2, CharacterStyle paramCharacterStyle)
  {
    super(paramInt1, paramInt2, paramCharacterStyle);
  }
  
  public final void a(Canvas paramCanvas, TextPaint paramTextPaint, List<c> paramList)
  {
    ee(paramList);
    int i = paramTextPaint.getColor();
    paramTextPaint.setColor(((BackgroundColorSpan)this.vab).getBackgroundColor());
    paramList = this.vaa.iterator();
    while (paramList.hasNext()) {
      paramCanvas.drawRect((RectF)paramList.next(), paramTextPaint);
    }
    paramTextPaint.setColor(i);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/neattextview/textview/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */