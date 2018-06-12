package com.tencent.mm.ui.appbrand;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import com.tencent.mm.sdk.platformtools.x;

public class NewPullDownView
  extends View
{
  private float trp = 0.0F;
  private boolean trv = false;
  private float trw = 20.0F * getResources().getDisplayMetrics().density;
  private float trx = 14.0F * getResources().getDisplayMetrics().density - getResources().getDisplayMetrics().density * 4.0F;
  private Paint jdField_try = new Paint(1);
  private Paint trz;
  
  public NewPullDownView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.jdField_try.setStyle(Paint.Style.FILL);
    this.jdField_try.setColor(-4408132);
    this.trz = new Paint(1);
    this.trz.setStyle(Paint.Style.STROKE);
    this.trz.setColor(0);
    this.trz.setStrokeWidth(getResources().getDisplayMetrics().density * 4.0F);
    this.trz.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    float f1 = getMeasuredWidth() / 2;
    float f2 = getMeasuredHeight() / 2;
    paramCanvas.saveLayer(0.0F, 0.0F, paramCanvas.getWidth(), paramCanvas.getHeight(), null, 31);
    paramCanvas.drawCircle(f1, f2, this.trp * this.trw / 2.0F, this.jdField_try);
    if (this.trp >= 0.4F) {
      paramCanvas.drawCircle(f1, f2, (this.trp - 0.4F) / 0.6F * this.trx / 2.0F, this.trz);
    }
    paramCanvas.restore();
  }
  
  public void setVerticalScrollPercent(float paramFloat)
  {
    x.i("MicroMsg.PullDownView", "[setVerticalScrollPercent] percent:%s", new Object[] { Float.valueOf(paramFloat) });
    float f = paramFloat;
    if (this.trv) {
      f = 1.0F - paramFloat;
    }
    this.trp = Math.max(0.0F, Math.min(f, 1.0F));
    postInvalidate();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ui/appbrand/NewPullDownView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */