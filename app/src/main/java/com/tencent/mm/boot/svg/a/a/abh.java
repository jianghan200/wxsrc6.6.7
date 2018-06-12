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

public final class abh
  extends c
{
  private final int height = 63;
  private final int width = 63;
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 63;
      return 63;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject1 = c.f(paramVarArgs);
      Object localObject3 = c.e(paramVarArgs);
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
      localObject2 = c.a((Paint)localObject2, paramVarArgs);
      ((Paint)localObject2).setStrokeWidth(1.0F);
      localCanvas.save();
      localObject3 = c.a((float[])localObject3, 1.0F, 0.0F, 12.0F, 0.0F, 1.0F, 12.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localObject1 = c.a(localPaint, paramVarArgs);
      localObject2 = c.a((Paint)localObject2, paramVarArgs);
      ((Paint)localObject1).setColor(16777215);
      ((Paint)localObject2).setColor(-14624737);
      ((Paint)localObject2).setStrokeWidth(2.0F);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject1, paramVarArgs);
      localObject2 = c.a((Paint)localObject2, paramVarArgs);
      localObject3 = c.j(paramVarArgs);
      ((Path)localObject3).moveTo(0.0F, 1.5F);
      ((Path)localObject3).cubicTo(0.0F, 0.6715728F, 0.6715728F, 0.0F, 1.5F, 0.0F);
      ((Path)localObject3).lineTo(37.5F, 0.0F);
      ((Path)localObject3).cubicTo(38.328426F, 0.0F, 39.0F, 0.6715728F, 39.0F, 1.5F);
      ((Path)localObject3).lineTo(39.0F, 37.5F);
      ((Path)localObject3).cubicTo(39.0F, 38.328426F, 38.328426F, 39.0F, 37.5F, 39.0F);
      ((Path)localObject3).lineTo(1.5F, 39.0F);
      ((Path)localObject3).cubicTo(0.6715728F, 39.0F, 0.0F, 38.328426F, 0.0F, 37.5F);
      ((Path)localObject3).lineTo(0.0F, 1.5F);
      ((Path)localObject3).close();
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint, paramVarArgs);
      ((Paint)localObject1).setColor(-14624737);
      localObject2 = c.j(paramVarArgs);
      ((Path)localObject2).moveTo(0.0F, 0.0F);
      ((Path)localObject2).lineTo(20.0F, 0.0F);
      ((Path)localObject2).lineTo(20.0F, 20.0F);
      ((Path)localObject2).lineTo(0.0F, 20.0F);
      ((Path)localObject2).lineTo(0.0F, 0.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-14624737);
      localObject1 = c.j(paramVarArgs);
      ((Path)localObject1).moveTo(20.0F, 20.0F);
      ((Path)localObject1).lineTo(39.5F, 20.0F);
      ((Path)localObject1).lineTo(39.5F, 39.5F);
      ((Path)localObject1).lineTo(20.0F, 39.5F);
      ((Path)localObject1).lineTo(20.0F, 20.0F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, localPaint);
      localCanvas.restore();
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/abh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */