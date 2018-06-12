package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;

public final class dh
  extends c
{
  private final int height = 96;
  private final int width = 130;
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 130;
      return 96;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject1 = c.f(paramVarArgs);
      Object localObject2 = c.e(paramVarArgs);
      Paint localPaint1 = c.i(paramVarArgs);
      localPaint1.setFlags(385);
      localPaint1.setStyle(Paint.Style.FILL);
      Paint localPaint2 = c.i(paramVarArgs);
      localPaint2.setFlags(385);
      localPaint2.setStyle(Paint.Style.STROKE);
      localPaint1.setColor(-16777216);
      localPaint2.setStrokeWidth(1.0F);
      localPaint2.setStrokeCap(Paint.Cap.BUTT);
      localPaint2.setStrokeJoin(Paint.Join.MITER);
      localPaint2.setStrokeMiter(4.0F);
      localPaint2.setPathEffect(null);
      c.a(localPaint2, paramVarArgs).setStrokeWidth(1.0F);
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-16777216);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -238.0F, 0.0F, 1.0F, -292.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 238.0F, 0.0F, 1.0F, 292.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.j(paramVarArgs);
      ((Path)localObject2).moveTo(61.0F, 44.0F);
      ((Path)localObject2).lineTo(61.0F, 50.0F);
      ((Path)localObject2).cubicTo(61.0F, 58.22929F, 67.93958F, 65.0F, 77.0F, 65.0F);
      ((Path)localObject2).cubicTo(85.06042F, 65.0F, 92.0F, 58.22929F, 92.0F, 50.0F);
      ((Path)localObject2).lineTo(92.0F, 44.0F);
      ((Path)localObject2).lineTo(94.99676F, 44.0F);
      ((Path)localObject2).cubicTo(95.56201F, 44.0F, 96.0F, 44.45037F, 96.0F, 45.005928F);
      ((Path)localObject2).lineTo(96.0F, 50.25F);
      ((Path)localObject2).cubicTo(96.0F, 60.017532F, 88.3659F, 67.91314F, 79.0F, 68.89677F);
      ((Path)localObject2).lineTo(79.0F, 72.0F);
      ((Path)localObject2).lineTo(91.003685F, 72.0F);
      ((Path)localObject2).cubicTo(91.561775F, 72.0F, 92.0F, 72.45191F, 92.0F, 73.00937F);
      ((Path)localObject2).lineTo(92.0F, 74.99063F);
      ((Path)localObject2).cubicTo(92.0F, 75.55665F, 91.55393F, 76.0F, 91.003685F, 76.0F);
      ((Path)localObject2).lineTo(61.996315F, 76.0F);
      ((Path)localObject2).cubicTo(61.438225F, 76.0F, 61.0F, 75.54809F, 61.0F, 74.99063F);
      ((Path)localObject2).lineTo(61.0F, 73.00937F);
      ((Path)localObject2).cubicTo(61.0F, 72.44335F, 61.446064F, 72.0F, 61.996315F, 72.0F);
      ((Path)localObject2).lineTo(74.0F, 72.0F);
      ((Path)localObject2).lineTo(74.0F, 68.796776F);
      ((Path)localObject2).cubicTo(64.20818F, 67.464806F, 57.0F, 59.741146F, 57.0F, 50.25F);
      ((Path)localObject2).lineTo(57.0F, 44.997505F);
      ((Path)localObject2).cubicTo(57.0F, 44.447468F, 57.449165F, 44.0F, 58.003242F, 44.0F);
      ((Path)localObject2).lineTo(61.0F, 44.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(76.5F, 21.0F);
      ((Path)localObject2).cubicTo(82.30026F, 21.0F, 87.0F, 25.705276F, 87.0F, 31.50953F);
      ((Path)localObject2).lineTo(87.0F, 50.49047F);
      ((Path)localObject2).cubicTo(87.0F, 56.29387F, 82.29899F, 61.0F, 76.5F, 61.0F);
      ((Path)localObject2).cubicTo(70.69974F, 61.0F, 66.0F, 56.294724F, 66.0F, 50.49047F);
      ((Path)localObject2).lineTo(66.0F, 31.50953F);
      ((Path)localObject2).cubicTo(66.0F, 25.706133F, 70.70101F, 21.0F, 76.5F, 21.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/dh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */