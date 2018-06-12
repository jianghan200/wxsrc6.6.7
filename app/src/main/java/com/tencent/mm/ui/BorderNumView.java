package com.tencent.mm.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.mm.platformtools.c.a;

public class BorderNumView
  extends View
{
  private static int tgX = 22;
  private static int tgY = 105;
  private static int tgZ = 100;
  private Paint cN;
  private Context context = null;
  private int tgW = 100;
  
  public BorderNumView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.context = paramContext;
    init();
  }
  
  public BorderNumView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.context = paramContext;
    init();
  }
  
  private void init()
  {
    this.cN = new Paint();
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if (this.tgW < 100) {
      tgX += 15;
    }
    if (this.tgW >= 1000) {
      tgZ -= 20;
    }
    float f1 = c.a.b(this.context, tgX);
    float f2 = c.a.b(this.context, tgY);
    String str = this.tgW;
    this.cN.setAntiAlias(true);
    this.cN.setTextSize(tgZ);
    this.cN.setColor(-11491572);
    this.cN.setStyle(Paint.Style.STROKE);
    this.cN.setStrokeWidth(8.0F);
    paramCanvas.drawText(str, f1, f2, this.cN);
    this.cN.setTextSize(tgZ);
    this.cN.setColor(-1770573);
    this.cN.setStyle(Paint.Style.FILL);
    this.cN.setStrokeWidth(8.0F);
    paramCanvas.drawText(str, f1, f2, this.cN);
  }
  
  public void setPaintNum(int paramInt)
  {
    this.tgW = paramInt;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ui/BorderNumView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */