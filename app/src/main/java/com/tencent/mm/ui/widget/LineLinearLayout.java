package com.tencent.mm.ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.tencent.mm.bp.a;

public class LineLinearLayout
  extends LinearLayout
{
  private Paint cN;
  private Rect cO;
  private int uFZ;
  
  public LineLinearLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public LineLinearLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setWillNotDraw(false);
    this.cO = new Rect();
    this.cN = new Paint();
    this.cN.setStyle(Paint.Style.STROKE);
    this.cN.setColor(-571543826);
    this.cN.setStrokeWidth(Math.round(a.getDensity(getContext()) * 0.5F));
    this.uFZ = a.fromDPToPix(paramContext, 44);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    int j = getMeasuredHeight();
    Paint localPaint = this.cN;
    int i = 1;
    while (this.uFZ * i < j)
    {
      paramCanvas.drawLine(0.0F, this.uFZ * i, getMeasuredWidth(), this.uFZ * i, localPaint);
      i += 1;
    }
    super.onDraw(paramCanvas);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ui/widget/LineLinearLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */