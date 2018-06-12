package com.tencent.mm.plugin.clean.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

public class PieView
  extends View
{
  private int bUw = 0;
  private int fHo = 6;
  private Paint hRB;
  private Paint hRC;
  private Paint hRD;
  private Paint hRE;
  private Paint hRF;
  private Paint hRG;
  private Paint hRH;
  private int hRI;
  private int hRJ;
  private int hRK;
  private int hRL;
  private int hRM;
  private int hRN;
  private int hRO = 0;
  private int hRP = -90;
  
  public PieView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    initView();
  }
  
  public PieView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    initView();
  }
  
  private static int F(int paramInt1, int paramInt2, int paramInt3)
  {
    int i;
    if (paramInt2 - paramInt1 >= paramInt3) {
      i = paramInt1 + paramInt3;
    }
    do
    {
      return i;
      i = paramInt2;
    } while (paramInt1 - paramInt2 <= paramInt3);
    return paramInt1 - paramInt3;
  }
  
  private void initView()
  {
    this.hRB = ol(-1);
    this.hRC = ol(-657931);
    this.hRD = ol(-2565928);
    this.hRE = ol(-15223279);
    this.hRF = ol(-7876878);
    this.hRG = ol(-7876878);
    this.hRH = ol(-1644567);
  }
  
  private static Paint ol(int paramInt)
  {
    Paint localPaint = new Paint();
    localPaint.setAntiAlias(true);
    localPaint.setStyle(Paint.Style.FILL);
    localPaint.setColor(paramInt);
    return localPaint;
  }
  
  public void draw(Canvas paramCanvas)
  {
    float f1 = getMeasuredWidth() / 2;
    float f2 = getMeasuredHeight() / 2 + getTop();
    float f3 = getMeasuredHeight() / 3 + 15;
    RectF localRectF1 = new RectF(f1 - f3, f2 - f3, f1 + f3, f2 + f3);
    if (this.bUw == 0)
    {
      paramCanvas.drawCircle(f1, f2, f3, this.hRC);
      paramCanvas.drawArc(localRectF1, this.hRP, 45.0F, true, this.hRD);
      paramCanvas.drawCircle(f1, f2, f3 - 15.0F, this.hRB);
      this.hRP += 4;
      this.hRP %= 360;
    }
    RectF localRectF2;
    int i;
    int j;
    if (this.bUw == 1)
    {
      f3 = 10.0F + f3;
      localRectF2 = new RectF(f1 - f3, f2 - f3, f1 + f3, f3 + f2);
      this.hRI = F(this.hRI, this.hRM, this.fHo);
      paramCanvas.drawArc(localRectF2, -90.0F, this.hRI, true, this.hRE);
      if (this.hRO > 0) {
        break label351;
      }
      if (this.hRI == this.hRM)
      {
        this.hRK = F(this.hRK, this.hRN, this.fHo);
        paramCanvas.drawArc(localRectF1, this.hRM - 90, this.hRK, true, this.hRF);
      }
      if (this.hRK == this.hRN)
      {
        i = this.hRM;
        j = this.hRN;
        this.hRJ = F(this.hRJ, 360 - i - j, this.fHo);
        paramCanvas.drawArc(localRectF1, this.hRM - 90 + this.hRN, this.hRJ, true, this.hRG);
      }
    }
    for (;;)
    {
      invalidate();
      return;
      label351:
      if (this.hRI == this.hRM)
      {
        this.hRL = F(this.hRL, this.hRO, this.fHo);
        paramCanvas.drawArc(localRectF2, this.hRM - 90, this.hRL, true, this.hRH);
      }
      if (this.hRL == this.hRO)
      {
        this.hRK = F(this.hRK, this.hRN, this.fHo);
        paramCanvas.drawArc(localRectF1, this.hRO - 90 + this.hRM, this.hRK, true, this.hRF);
      }
      if (this.hRK == this.hRN)
      {
        i = this.hRM;
        j = this.hRN;
        int k = this.hRO;
        this.hRJ = F(this.hRJ, 360 - i - j - k, this.fHo);
        paramCanvas.drawArc(localRectF1, this.hRM - 90 + this.hRN + this.hRO, this.hRJ, true, this.hRG);
      }
    }
  }
  
  public void setDeepGrayTargetAngle(int paramInt)
  {
    this.hRN = paramInt;
  }
  
  public void setGreenTargetAngle(int paramInt)
  {
    this.hRM = paramInt;
  }
  
  public void setOtherAccTargetAngle(int paramInt)
  {
    this.hRO = paramInt;
  }
  
  public void setStage(int paramInt)
  {
    this.bUw = paramInt;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/clean/ui/PieView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */