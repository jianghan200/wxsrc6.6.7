package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.c;

public final class lk
  extends c
{
  private final int height = 115;
  private final int width = 115;
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 115;
      return 115;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject1 = c.f(paramVarArgs);
      float[] arrayOfFloat = c.e(paramVarArgs);
      Paint localPaint = c.i(paramVarArgs);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.FILL);
      Object localObject2 = c.i(paramVarArgs);
      ((Paint)localObject2).setFlags(385);
      ((Paint)localObject2).setStyle(Paint.Style.STROKE);
      localPaint.setColor(-16777216);
      ((Paint)localObject2).setStrokeWidth(1.0F);
      ((Paint)localObject2).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject2).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject2).setStrokeMiter(4.0F);
      ((Paint)localObject2).setPathEffect(null);
      localCanvas.save();
      localObject2 = c.a((Paint)localObject2, paramVarArgs);
      ((Paint)localObject2).setStrokeWidth(1.0F);
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, -513.0F, 0.0F, 1.0F, -1170.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 513.0F, 0.0F, 1.0F, 1170.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramVarArgs);
      ((Paint)localObject1).setColor(-5066062);
      ((Paint)localObject1).setStrokeWidth(6.0F);
      localObject2 = c.j(paramVarArgs);
      ((Path)localObject2).moveTo(57.5F, 3.0F);
      ((Path)localObject2).cubicTo(87.59952F, 3.0F, 112.0F, 27.40048F, 112.0F, 57.5F);
      ((Path)localObject2).cubicTo(112.0F, 87.59952F, 87.59952F, 112.0F, 57.5F, 112.0F);
      ((Path)localObject2).cubicTo(27.40048F, 112.0F, 3.0F, 87.59952F, 3.0F, 57.5F);
      ((Path)localObject2).cubicTo(3.0F, 27.40048F, 27.40048F, 3.0F, 57.5F, 3.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-5066062);
      localObject1 = c.j(paramVarArgs);
      ((Path)localObject1).moveTo(41.0F, 43.0F);
      ((Path)localObject1).cubicTo(41.0F, 41.89543F, 41.89543F, 41.0F, 43.0F, 41.0F);
      ((Path)localObject1).lineTo(72.0F, 41.0F);
      ((Path)localObject1).cubicTo(73.10457F, 41.0F, 74.0F, 41.89543F, 74.0F, 43.0F);
      ((Path)localObject1).lineTo(74.0F, 72.0F);
      ((Path)localObject1).cubicTo(74.0F, 73.10457F, 73.10457F, 74.0F, 72.0F, 74.0F);
      ((Path)localObject1).lineTo(43.0F, 74.0F);
      ((Path)localObject1).cubicTo(41.89543F, 74.0F, 41.0F, 73.10457F, 41.0F, 72.0F);
      ((Path)localObject1).lineTo(41.0F, 43.0F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, localPaint);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/lk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */