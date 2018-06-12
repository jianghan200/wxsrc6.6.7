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

public final class aci
  extends c
{
  private final int height = 54;
  private final int width = 60;
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 60;
      return 54;
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
      localCanvas.saveLayerAlpha(null, 25, 4);
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-16777216);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.j(paramVarArgs);
      ((Path)localObject).moveTo(43.0F, 0.0F);
      ((Path)localObject).cubicTo(39.693F, 0.0F, 36.614F, 0.879F, 34.0F, 2.374F);
      ((Path)localObject).cubicTo(29.205F, 5.118F, 26.0F, 9.968F, 26.0F, 15.5F);
      ((Path)localObject).lineTo(26.0F, 38.5F);
      ((Path)localObject).cubicTo(26.0F, 42.642F, 21.97F, 46.0F, 17.0F, 46.0F);
      ((Path)localObject).cubicTo(12.029F, 46.0F, 8.0F, 42.642F, 8.0F, 38.5F);
      ((Path)localObject).cubicTo(8.0F, 35.552F, 10.046F, 33.009F, 13.015F, 31.783F);
      ((Path)localObject).cubicTo(13.229F, 31.695F, 13.446F, 31.611F, 13.669F, 31.537F);
      ((Path)localObject).cubicTo(15.538F, 30.787F, 17.141F, 29.379F, 17.736F, 27.744F);
      ((Path)localObject).cubicTo(18.615F, 25.33F, 16.979F, 23.374F, 14.083F, 23.374F);
      ((Path)localObject).cubicTo(13.361F, 23.374F, 12.629F, 23.496F, 11.923F, 23.716F);
      ((Path)localObject).cubicTo(11.92F, 23.717F, 11.917F, 23.718F, 11.913F, 23.719F);
      ((Path)localObject).cubicTo(7.726F, 24.921F, 4.231F, 27.557F, 2.133F, 31.0F);
      ((Path)localObject).cubicTo(0.778F, 33.225F, 0.0F, 35.78F, 0.0F, 38.5F);
      ((Path)localObject).cubicTo(0.0F, 47.047F, 7.626F, 54.0F, 17.0F, 54.0F);
      ((Path)localObject).cubicTo(20.307F, 54.0F, 23.386F, 53.121F, 26.0F, 51.626F);
      ((Path)localObject).cubicTo(30.795F, 48.882F, 34.0F, 44.032F, 34.0F, 38.5F);
      ((Path)localObject).lineTo(34.0F, 15.5F);
      ((Path)localObject).cubicTo(34.0F, 11.358F, 38.029F, 8.0F, 43.0F, 8.0F);
      ((Path)localObject).cubicTo(47.97F, 8.0F, 52.0F, 11.358F, 52.0F, 15.5F);
      ((Path)localObject).cubicTo(52.0F, 18.574F, 49.781F, 21.216F, 46.604F, 22.374F);
      ((Path)localObject).cubicTo(44.555F, 23.061F, 42.876F, 24.544F, 42.236F, 26.301F);
      ((Path)localObject).cubicTo(41.362F, 28.703F, 42.99F, 30.651F, 45.873F, 30.651F);
      ((Path)localObject).cubicTo(46.526F, 30.651F, 47.186F, 30.539F, 47.829F, 30.357F);
      ((Path)localObject).cubicTo(47.934F, 30.328F, 48.038F, 30.296F, 48.142F, 30.265F);
      ((Path)localObject).cubicTo(52.304F, 29.056F, 55.778F, 26.428F, 57.866F, 23.0F);
      ((Path)localObject).cubicTo(59.222F, 20.776F, 60.0F, 18.22F, 60.0F, 15.5F);
      ((Path)localObject).cubicTo(60.0F, 6.953F, 52.374F, 0.0F, 43.0F, 0.0F);
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 1);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/aci.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */