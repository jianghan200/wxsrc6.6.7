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

public final class jm
  extends c
{
  private final int height = 144;
  private final int width = 144;
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 144;
      return 144;
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
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-9276814);
      localObject = c.j(paramVarArgs);
      ((Path)localObject).moveTo(18.0F, 118.0F);
      ((Path)localObject).lineTo(18.0F, 48.0F);
      ((Path)localObject).lineTo(37.602036F, 48.0F);
      ((Path)localObject).cubicTo(40.250168F, 42.636612F, 43.392544F, 37.607285F, 46.872543F, 34.0F);
      ((Path)localObject).lineTo(10.101695F, 34.0F);
      ((Path)localObject).cubicTo(6.7315254F, 34.00932F, 4.0F, 36.740845F, 4.0F, 40.0F);
      ((Path)localObject).lineTo(4.0F, 125.89831F);
      ((Path)localObject).cubicTo(4.0F, 129.26848F, 6.7315254F, 132.0F, 10.101695F, 132.0F);
      ((Path)localObject).lineTo(119.932205F, 132.0F);
      ((Path)localObject).cubicTo(123.30034F, 132.0F, 126.0339F, 129.26848F, 126.0F, 125.89831F);
      ((Path)localObject).lineTo(126.0F, 81.6F);
      ((Path)localObject).lineTo(112.0F, 93.62034F);
      ((Path)localObject).lineTo(112.0F, 118.0F);
      ((Path)localObject).lineTo(18.0F, 118.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(95.0F, 34.411526F);
      ((Path)localObject).cubicTo(92.118645F, 34.389153F, 88.57559F, 34.372883F, 85.355934F, 34.372883F);
      ((Path)localObject).cubicTo(57.560677F, 34.372883F, 38.688137F, 61.49085F, 38.688137F, 97.42373F);
      ((Path)localObject).cubicTo(48.178307F, 75.376274F, 57.458984F, 64.881355F, 95.0F, 64.881355F);
      ((Path)localObject).lineTo(95.0F, 87.254234F);
      ((Path)localObject).lineTo(140.27118F, 49.627117F);
      ((Path)localObject).lineTo(95.0F, 12.0F);
      ((Path)localObject).lineTo(95.0F, 34.411526F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/jm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */