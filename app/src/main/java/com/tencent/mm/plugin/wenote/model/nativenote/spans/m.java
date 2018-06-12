package com.tencent.mm.plugin.wenote.model.nativenote.spans;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;

public class m
  implements LeadingMarginSpan, f<Boolean>, g<Boolean>
{
  public static float qta = 0.0F;
  private float kgD = 10.0F;
  private final int qsP;
  public boolean qsQ;
  private final int qsY;
  private float qsZ;
  
  private m(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    this.qsY = paramInt1;
    this.qsP = paramInt2;
    this.qsQ = paramBoolean;
  }
  
  public m(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    this.qsY = paramInt1;
    this.qsP = paramInt2;
    if ((paramBoolean1) && (paramBoolean3) && (!paramBoolean2)) {}
    for (paramBoolean1 = true;; paramBoolean1 = false)
    {
      this.qsQ = paramBoolean1;
      return;
    }
  }
  
  public void drawLeadingMargin(Canvas paramCanvas, Paint paramPaint, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, CharSequence paramCharSequence, int paramInt6, int paramInt7, boolean paramBoolean, Layout paramLayout)
  {
    paramCharSequence = (Spanned)paramCharSequence;
    if ((!this.qsQ) && (paramCharSequence.getSpanStart(this) == paramInt6))
    {
      paramCharSequence = paramPaint.getStyle();
      float f = paramPaint.getTextSize();
      paramPaint.setStyle(Paint.Style.FILL);
      this.kgD = (paramInt4 - paramInt3);
      this.qsZ = paramPaint.measureText(this.qsY + ".");
      paramCanvas.drawText(this.qsY + ".", paramInt1, paramInt4, paramPaint);
      paramPaint.setStyle(paramCharSequence);
      paramPaint.setTextSize(f);
    }
  }
  
  public int getLeadingMargin(boolean paramBoolean)
  {
    if (this.qsZ + 2.0F > qta) {}
    for (float f = this.qsZ + 2.0F;; f = qta)
    {
      qta = Math.max(Math.round(f), this.qsP);
      if (!this.qsQ) {
        break;
      }
      return 0;
    }
    return (int)qta;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/wenote/model/nativenote/spans/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */