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

public final class tc
  extends c
{
  private final int height = 100;
  private final int width = 100;
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 100;
      return 100;
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
      localPaint.setColor(-1686720);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.j(paramVarArgs);
      ((Path)localObject).moveTo(51.515152F, 100.0F);
      ((Path)localObject).cubicTo(22.385763F, 100.0F, 0.0F, 77.614235F, 0.0F, 51.515152F);
      ((Path)localObject).cubicTo(0.0F, 22.385763F, 22.385763F, 0.0F, 51.515152F, 0.0F);
      ((Path)localObject).cubicTo(77.614235F, 0.0F, 100.0F, 22.385763F, 100.0F, 51.515152F);
      ((Path)localObject).cubicTo(100.0F, 77.614235F, 77.614235F, 100.0F, 51.515152F, 100.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(45.567917F, 25.108103F);
      ((Path)localObject).lineTo(47.272728F, 60.909092F);
      ((Path)localObject).lineTo(54.545456F, 60.909092F);
      ((Path)localObject).lineTo(56.250263F, 25.108103F);
      ((Path)localObject).cubicTo(56.309967F, 23.85433F, 55.341984F, 22.789549F, 54.08821F, 22.729845F);
      ((Path)localObject).cubicTo(54.052204F, 22.72813F, 54.01616F, 22.727272F, 53.98011F, 22.727272F);
      ((Path)localObject).lineTo(47.838074F, 22.727272F);
      ((Path)localObject).cubicTo(46.582882F, 22.727272F, 45.565346F, 23.744808F, 45.565346F, 25.0F);
      ((Path)localObject).cubicTo(45.565346F, 25.036049F, 45.566204F, 25.072094F, 45.567917F, 25.108103F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(50.909092F, 76.818184F);
      ((Path)localObject).cubicTo(53.921555F, 76.818184F, 56.363636F, 74.3761F, 56.363636F, 71.36364F);
      ((Path)localObject).cubicTo(56.363636F, 68.35117F, 53.921555F, 65.90909F, 50.909092F, 65.90909F);
      ((Path)localObject).cubicTo(47.89663F, 65.90909F, 45.454544F, 68.35117F, 45.454544F, 71.36364F);
      ((Path)localObject).cubicTo(45.454544F, 74.3761F, 47.89663F, 76.818184F, 50.909092F, 76.818184F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/tc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */