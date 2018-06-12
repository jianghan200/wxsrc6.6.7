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

public final class ai
  extends c
{
  private final int height = 72;
  private final int width = 72;
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 72;
      return 72;
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
      localPaint.setColor(-16777216);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.j(paramVarArgs);
      ((Path)localObject).moveTo(60.9F, 59.4F);
      ((Path)localObject).lineTo(60.9F, 57.94639F);
      ((Path)localObject).cubicTo(60.9F, 57.25818F, 60.19404F, 56.13006F, 59.57943F, 55.83026F);
      ((Path)localObject).lineTo(42.59837F, 47.54712F);
      ((Path)localObject).cubicTo(38.018623F, 45.31318F, 36.88672F, 39.90874F, 40.16801F, 36.019104F);
      ((Path)localObject).lineTo(41.25261F, 34.733425F);
      ((Path)localObject).cubicTo(42.906586F, 32.772804F, 44.4F, 28.693172F, 44.4F, 26.130558F);
      ((Path)localObject).lineTo(44.4F, 21.000622F);
      ((Path)localObject).cubicTo(44.4F, 16.364742F, 40.63677F, 12.6F, 36.0F, 12.6F);
      ((Path)localObject).cubicTo(31.368927F, 12.6F, 27.6F, 16.365608F, 27.6F, 20.998741F);
      ((Path)localObject).lineTo(27.6F, 26.127872F);
      ((Path)localObject).cubicTo(27.6F, 28.696991F, 29.08724F, 32.76145F, 30.747236F, 34.728935F);
      ((Path)localObject).lineTo(31.831833F, 36.01444F);
      ((Path)localObject).cubicTo(35.119907F, 39.91158F, 33.975643F, 45.31095F, 29.402159F, 47.54276F);
      ((Path)localObject).lineTo(12.421099F, 55.82933F);
      ((Path)localObject).cubicTo(11.811051F, 56.127026F, 11.1F, 57.26603F, 11.1F, 57.94639F);
      ((Path)localObject).lineTo(11.1F, 59.4F);
      ((Path)localObject).lineTo(60.9F, 59.4F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(7.5F, 60.0F);
      ((Path)localObject).lineTo(7.5F, 57.94639F);
      ((Path)localObject).cubicTo(7.5F, 55.891125F, 8.994452F, 53.495724F, 10.842293F, 52.593998F);
      ((Path)localObject).lineTo(27.823353F, 44.30743F);
      ((Path)localObject).cubicTo(30.28613F, 43.10562F, 30.858778F, 40.443787F, 29.080336F, 38.33592F);
      ((Path)localObject).lineTo(27.995739F, 37.050415F);
      ((Path)localObject).cubicTo(25.788954F, 34.434856F, 24.0F, 29.548489F, 24.0F, 26.127872F);
      ((Path)localObject).lineTo(24.0F, 20.998741F);
      ((Path)localObject).cubicTo(24.0F, 14.37202F, 29.386068F, 9.0F, 36.0F, 9.0F);
      ((Path)localObject).cubicTo(42.62742F, 9.0F, 48.0F, 14.378941F, 48.0F, 21.000622F);
      ((Path)localObject).lineTo(48.0F, 26.130558F);
      ((Path)localObject).cubicTo(48.0F, 29.547888F, 46.202797F, 34.44858F, 44.00426F, 37.054718F);
      ((Path)localObject).lineTo(42.919662F, 38.340397F);
      ((Path)localObject).cubicTo(41.151096F, 40.43685F, 41.703564F, 43.105194F, 44.176647F, 44.31153F);
      ((Path)localObject).lineTo(61.157707F, 52.594673F);
      ((Path)localObject).cubicTo(63.003605F, 53.49508F, 64.5F, 55.87551F, 64.5F, 57.94639F);
      ((Path)localObject).lineTo(64.5F, 60.0F);
      ((Path)localObject).cubicTo(64.5F, 61.656853F, 63.156853F, 63.0F, 61.5F, 63.0F);
      ((Path)localObject).lineTo(10.5F, 63.0F);
      ((Path)localObject).cubicTo(8.843145F, 63.0F, 7.5F, 61.656853F, 7.5F, 60.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 1);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */