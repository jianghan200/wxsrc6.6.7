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

public final class ks
  extends c
{
  private final int height = 48;
  private final int width = 48;
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 48;
      return 48;
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
      localCanvas.saveLayerAlpha(null, 76, 4);
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-16777216);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.j(paramVarArgs);
      ((Path)localObject).moveTo(37.233665F, 33.873493F);
      ((Path)localObject).lineTo(44.40146F, 41.041286F);
      ((Path)localObject).lineTo(42.72137F, 42.72137F);
      ((Path)localObject).lineTo(9.600087F, 9.600086F);
      ((Path)localObject).lineTo(11.280172F, 7.92F);
      ((Path)localObject).lineTo(15.06498F, 11.704807F);
      ((Path)localObject).cubicTo(16.369446F, 10.304305F, 18.008224F, 9.2193365F, 19.854246F, 8.57697F);
      ((Path)localObject).cubicTo(19.818567F, 8.363288F, 19.8F, 8.143812F, 19.8F, 7.92F);
      ((Path)localObject).cubicTo(19.8F, 5.7329526F, 21.572952F, 3.96F, 23.76F, 3.96F);
      ((Path)localObject).cubicTo(25.947048F, 3.96F, 27.72F, 5.7329526F, 27.72F, 7.92F);
      ((Path)localObject).cubicTo(27.72F, 8.143812F, 27.701433F, 8.363288F, 27.665754F, 8.57697F);
      ((Path)localObject).cubicTo(32.30823F, 10.192428F, 35.64F, 14.607125F, 35.64F, 19.8F);
      ((Path)localObject).lineTo(35.64F, 27.72F);
      ((Path)localObject).cubicTo(35.64F, 29.771164F, 36.171223F, 31.822327F, 37.233665F, 33.873493F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(36.239826F, 39.6F);
      ((Path)localObject).lineTo(5.94F, 39.6F);
      ((Path)localObject).cubicTo(9.9F, 35.64F, 11.88F, 31.68F, 11.88F, 27.72F);
      ((Path)localObject).lineTo(11.88F, 19.8F);
      ((Path)localObject).cubicTo(11.88F, 18.432533F, 12.111043F, 17.11903F, 12.536222F, 15.896395F);
      ((Path)localObject).lineTo(36.239826F, 39.6F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(21.78F, 41.58F);
      ((Path)localObject).lineTo(25.74F, 41.58F);
      ((Path)localObject).lineTo(25.74F, 41.976F);
      ((Path)localObject).cubicTo(25.74F, 43.069523F, 24.853523F, 43.956F, 23.76F, 43.956F);
      ((Path)localObject).cubicTo(22.666475F, 43.956F, 21.78F, 43.069523F, 21.78F, 41.976F);
      ((Path)localObject).lineTo(21.78F, 41.58F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 1);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/ks.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */