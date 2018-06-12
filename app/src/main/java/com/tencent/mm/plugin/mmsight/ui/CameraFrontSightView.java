package com.tencent.mm.plugin.mmsight.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;

public class CameraFrontSightView
  extends View
{
  Paint cN = new Paint();
  int gEH;
  boolean lnT = false;
  boolean lnU = false;
  boolean lnV = false;
  boolean lnW = false;
  long lnX = 0L;
  int lnY;
  int lnZ;
  ViewGroup.LayoutParams loa;
  public int mHeight;
  public int mWidth;
  
  public CameraFrontSightView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public CameraFrontSightView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public void draw(Canvas paramCanvas)
  {
    paramCanvas.translate(this.lnY / 2, this.lnZ / 2);
    long l = System.currentTimeMillis() - this.lnX;
    if (l > 200L)
    {
      this.lnT = false;
      this.lnU = true;
    }
    if (l > 800L)
    {
      this.lnU = false;
      this.lnV = true;
    }
    if (l > 1100L)
    {
      this.lnV = false;
      this.lnW = true;
    }
    if (l > 1300L)
    {
      this.lnW = false;
      setVisibility(8);
      return;
    }
    float f;
    if (this.lnT)
    {
      f = (float)(200L - l) / 200.0F + 1.0F;
      paramCanvas.scale(f, f, this.lnY / 2, this.lnZ / 2);
      this.cN.setAlpha((int)((2.0F - f) * 255.0F));
      if (!this.lnU) {
        break label476;
      }
      f = (float)((l - 200L) % 200L) / 200.0F * 2.0F;
      Paint localPaint = this.cN;
      if (f <= 1.0F) {
        break label469;
      }
      f -= 1.0F;
      label193:
      localPaint.setAlpha((int)(f * 128.0F + 127.0F));
    }
    for (;;)
    {
      if (this.lnW)
      {
        f = (float)(l - 1100L) / 200.0F;
        this.cN.setAlpha((int)((1.0F - f) * 255.0F));
      }
      paramCanvas.drawLine(0.0F, 0.0F, this.lnY, 0.0F, this.cN);
      paramCanvas.drawLine(0.0F, 0.0F, 0.0F, this.lnZ, this.cN);
      paramCanvas.drawLine(this.lnY, 0.0F, this.lnY, this.lnZ, this.cN);
      paramCanvas.drawLine(0.0F, this.lnZ, this.lnY, this.lnZ, this.cN);
      paramCanvas.drawLine(0.0F, this.lnZ / 2, this.lnY / 10, this.lnZ / 2, this.cN);
      paramCanvas.drawLine(this.lnY, this.lnZ / 2, this.lnY * 9 / 10, this.lnZ / 2, this.cN);
      paramCanvas.drawLine(this.lnY / 2, 0.0F, this.lnY / 2, this.lnZ / 10, this.cN);
      paramCanvas.drawLine(this.lnY / 2, this.lnZ, this.lnY / 2, this.lnZ * 9 / 10, this.cN);
      invalidate();
      return;
      paramCanvas.scale(1.0F, 1.0F);
      break;
      label469:
      f = 1.0F - f;
      break label193;
      label476:
      this.cN.setAlpha(255);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/mmsight/ui/CameraFrontSightView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */