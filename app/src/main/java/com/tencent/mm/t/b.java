package com.tencent.mm.t;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Path;
import com.tencent.mm.bx.a;

public final class b
  implements Cloneable
{
  private static Paint dnG;
  private float dD = 1.0F;
  private float jW = a.aH(5.0F);
  private Path ks;
  public int pN;
  
  static
  {
    Paint localPaint = new Paint();
    dnG = localPaint;
    localPaint.setAntiAlias(true);
    dnG.setStyle(Paint.Style.STROKE);
    dnG.setStrokeCap(Paint.Cap.ROUND);
  }
  
  public b(Path paramPath, float paramFloat, int paramInt)
  {
    this.ks = paramPath;
    this.dD = paramFloat;
    this.pN = paramInt;
  }
  
  public final void draw(Canvas paramCanvas)
  {
    dnG.setColor(this.pN);
    dnG.setStrokeWidth(this.jW * this.dD);
    if (!this.ks.isEmpty()) {
      paramCanvas.drawPath(this.ks, dnG);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/t/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */