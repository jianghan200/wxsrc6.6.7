package com.tencent.mm.ui.appbrand;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;

public class GyroView
  extends View
{
  private float To = 20.0F * getResources().getDisplayMetrics().density;
  private Paint cN = new Paint(1);
  private float trp = 0.0F;
  private float trq = 0.0F;
  private float trr = 100.0F * getResources().getDisplayMetrics().density;
  private float trs = 40.0F * getResources().getDisplayMetrics().density;
  private float trt = 10.0F * getResources().getDisplayMetrics().density;
  private float tru = 6.0F * getResources().getDisplayMetrics().density;
  private boolean trv = false;
  
  public GyroView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.cN.setStyle(Paint.Style.FILL);
    this.cN.setColor(-4737097);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    float f1 = getMeasuredWidth() / 2.0F;
    float f2 = getMeasuredHeight() / 2.0F;
    if (this.trq > 0.0F)
    {
      paramCanvas.drawCircle(f1, f2, this.trt / 2.0F - this.trq * (this.trt - this.tru) / 2.0F, this.cN);
      paramCanvas.drawCircle(f1 - this.trq * this.To, f2, this.tru / 2.0F, this.cN);
      paramCanvas.drawCircle(f1 + this.trq * this.To, f2, this.tru / 2.0F, this.cN);
      return;
    }
    paramCanvas.drawCircle(f1, f2, this.trp * this.trt / 2.0F, this.cN);
  }
  
  public void setVerticalScroll(float paramFloat)
  {
    float f2 = (paramFloat - this.trs) / (this.trr - this.trs);
    float f1 = f2;
    if (this.trv) {
      f1 = 1.0F - f2;
    }
    this.trq = Math.max(0.0F, Math.min(f1, 1.0F));
    f1 = paramFloat / this.trs;
    paramFloat = f1;
    if (this.trv) {
      paramFloat = 1.0F - f1;
    }
    this.trp = Math.max(0.0F, Math.min(paramFloat, 1.0F));
    postInvalidate();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/ui/appbrand/GyroView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */