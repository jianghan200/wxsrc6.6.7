package com.tencent.mm.svg.a;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.Gravity;
import android.view.View;
import com.tencent.mm.svg.b.c;

public abstract class b
  extends Drawable
{
  protected View iUA;
  public long mDuration = 0L;
  protected final Rect rD = new Rect();
  protected int teS = 0;
  protected boolean teT = false;
  protected Paint teU = new Paint();
  protected int teV = 0;
  protected int teW = 0;
  protected int teX = 0;
  protected int teY = 0;
  protected float teZ;
  
  public b(int paramInt1, int paramInt2, int paramInt3)
  {
    this.teX = paramInt1;
    this.teY = paramInt2;
    this.teZ = 1.0F;
    this.teV = this.teX;
    this.teW = this.teY;
    setLevel(10000);
    this.teS = paramInt3;
  }
  
  private void coj()
  {
    this.iUA = a.t(this);
    if (this.iUA != null) {
      a.b(this.iUA, this.teU);
    }
  }
  
  protected final void coh()
  {
    this.rD.set(0, 0, getIntrinsicWidth(), getIntrinsicHeight());
  }
  
  protected final void coi()
  {
    if (this.teT)
    {
      Rect localRect = getBounds();
      Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), localRect, this.rD);
    }
    this.teT = false;
  }
  
  public int getIntrinsicHeight()
  {
    return this.teW;
  }
  
  public int getIntrinsicWidth()
  {
    return this.teV;
  }
  
  public int getOpacity()
  {
    if ((this.iUA != null) && (this.iUA.getAlpha() < 1.0F)) {}
    while ((this.teU != null) && (this.teU.getAlpha() < 255)) {
      return -3;
    }
    return 0;
  }
  
  protected final void j(Canvas paramCanvas)
  {
    if (com.tencent.mm.svg.b.b.col())
    {
      int i = this.rD.height() / 3;
      paramCanvas.save();
      Paint localPaint = new Paint();
      localPaint.setStyle(Paint.Style.FILL);
      localPaint.setColor(-12303292);
      localPaint.setAlpha(127);
      localPaint.setTextSize(i);
      localPaint.setStrokeWidth(1.0F);
      float f = localPaint.measureText("SVG");
      paramCanvas.translate(this.rD.width() - f, this.rD.height() * 2 / 3);
      paramCanvas.drawText("SVG", 0.0F, i, localPaint);
      paramCanvas.restore();
    }
  }
  
  protected void onBoundsChange(Rect paramRect)
  {
    super.onBoundsChange(paramRect);
    this.teT = true;
  }
  
  protected boolean onLevelChange(int paramInt)
  {
    coj();
    return super.onLevelChange(paramInt);
  }
  
  @TargetApi(17)
  public void setAlpha(int paramInt)
  {
    this.teU.setAlpha(paramInt);
    if ((this.iUA != null) && (Build.VERSION.SDK_INT >= 17)) {}
    try
    {
      this.iUA.setLayerPaint(this.teU);
      return;
    }
    catch (NoSuchMethodError localNoSuchMethodError)
    {
      c.printErrStackTrace("MicroMsg.SVGDrawable", localNoSuchMethodError, "samsung", new Object[0]);
    }
  }
  
  @TargetApi(17)
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    this.teU.setColorFilter(paramColorFilter);
    if ((this.iUA != null) && (Build.VERSION.SDK_INT >= 17)) {}
    try
    {
      this.iUA.setLayerPaint(this.teU);
      return;
    }
    catch (NoSuchMethodError paramColorFilter)
    {
      c.printErrStackTrace("MicroMsg.SVGDrawable", paramColorFilter, "samsung", new Object[0]);
    }
  }
  
  public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2)
  {
    coj();
    return super.setVisible(paramBoolean1, paramBoolean2);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/svg/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */