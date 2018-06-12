package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;

public final class kd
  extends c
{
  private final int height = 96;
  private final int width = 96;
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 96;
      return 96;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      c.f(paramVarArgs);
      c.e(paramVarArgs);
      Paint localPaint = c.i(paramVarArgs);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.FILL);
      Object localObject = c.i(paramVarArgs);
      ((Paint)localObject).setFlags(385);
      ((Paint)localObject).setStyle(Paint.Style.STROKE);
      localPaint.setColor(-16777216);
      ((Paint)localObject).setStrokeWidth(1.0F);
      ((Paint)localObject).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject).setStrokeMiter(4.0F);
      ((Paint)localObject).setPathEffect(null);
      c.a((Paint)localObject, paramVarArgs).setStrokeWidth(1.0F);
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-1);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.j(paramVarArgs);
      ((Path)localObject).moveTo(20.001331F, 33.0F);
      ((Path)localObject).cubicTo(17.239172F, 33.0F, 15.0F, 35.236286F, 15.0F, 38.00532F);
      ((Path)localObject).lineTo(15.0F, 67.994675F);
      ((Path)localObject).cubicTo(15.0F, 70.75904F, 17.233757F, 73.0F, 20.001331F, 73.0F);
      ((Path)localObject).lineTo(75.998665F, 73.0F);
      ((Path)localObject).cubicTo(78.760826F, 73.0F, 81.0F, 70.76372F, 81.0F, 67.994675F);
      ((Path)localObject).lineTo(81.0F, 38.00532F);
      ((Path)localObject).cubicTo(81.0F, 35.24096F, 78.76624F, 33.0F, 75.998665F, 33.0F);
      ((Path)localObject).lineTo(20.001331F, 33.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(41.230534F, 24.0F);
      ((Path)localObject).lineTo(48.0F, 24.0F);
      ((Path)localObject).lineTo(48.0F, 33.0F);
      ((Path)localObject).lineTo(27.74054F, 33.0F);
      ((Path)localObject).cubicTo(33.113003F, 33.0F, 35.999054F, 24.0F, 41.230534F, 24.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(68.25946F, 33.0F);
      ((Path)localObject).cubicTo(62.886997F, 33.0F, 60.000946F, 24.0F, 54.7683F, 24.0F);
      ((Path)localObject).lineTo(48.0F, 24.0F);
      ((Path)localObject).lineTo(48.0F, 33.0F);
      ((Path)localObject).lineTo(68.25946F, 33.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(48.0F, 36.0F);
      ((Path)localObject).cubicTo(56.83692F, 36.0F, 64.0F, 43.16308F, 64.0F, 52.0F);
      ((Path)localObject).cubicTo(64.0F, 60.83692F, 56.83692F, 68.0F, 48.0F, 68.0F);
      ((Path)localObject).cubicTo(39.16308F, 68.0F, 32.0F, 60.83692F, 32.0F, 52.0F);
      ((Path)localObject).cubicTo(32.0F, 43.16308F, 39.16308F, 36.0F, 48.0F, 36.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(58.0F, 52.0F);
      ((Path)localObject).cubicTo(58.0F, 57.523F, 53.523F, 62.0F, 48.0F, 62.0F);
      ((Path)localObject).cubicTo(42.477F, 62.0F, 38.0F, 57.523F, 38.0F, 52.0F);
      ((Path)localObject).cubicTo(38.0F, 46.477F, 42.477F, 42.0F, 48.0F, 42.0F);
      ((Path)localObject).cubicTo(53.523F, 42.0F, 58.0F, 46.477F, 58.0F, 52.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(18.0F, 27.0F);
      ((Path)localObject).lineTo(27.0F, 27.0F);
      ((Path)localObject).lineTo(27.0F, 30.0F);
      ((Path)localObject).lineTo(18.0F, 30.0F);
      ((Path)localObject).lineTo(18.0F, 27.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/kd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */