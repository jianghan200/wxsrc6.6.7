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

public final class adl
  extends c
{
  private final int height = 90;
  private final int width = 90;
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 90;
      return 90;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject2 = c.f(paramVarArgs);
      Object localObject3 = c.e(paramVarArgs);
      Paint localPaint = c.i(paramVarArgs);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.FILL);
      Object localObject1 = c.i(paramVarArgs);
      ((Paint)localObject1).setFlags(385);
      ((Paint)localObject1).setStyle(Paint.Style.STROKE);
      localPaint.setColor(-16777216);
      ((Paint)localObject1).setStrokeWidth(1.0F);
      ((Paint)localObject1).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject1).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject1).setStrokeMiter(4.0F);
      ((Paint)localObject1).setPathEffect(null);
      localObject1 = c.a((Paint)localObject1, paramVarArgs);
      ((Paint)localObject1).setStrokeWidth(1.0F);
      localCanvas.save();
      localObject3 = c.a((float[])localObject3, 1.0F, 0.0F, -166.0F, 0.0F, 1.0F, -265.0F);
      ((Matrix)localObject2).reset();
      ((Matrix)localObject2).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject2);
      localCanvas.save();
      localObject3 = c.a((float[])localObject3, 1.0F, 0.0F, 166.0F, 0.0F, 1.0F, 265.0F);
      ((Matrix)localObject2).reset();
      ((Matrix)localObject2).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject2);
      localObject2 = c.a(localPaint, paramVarArgs);
      ((Paint)localObject2).setColor(838860800);
      localCanvas.save();
      localObject2 = c.a((Paint)localObject2, paramVarArgs);
      localObject3 = c.j(paramVarArgs);
      ((Path)localObject3).moveTo(45.0F, 0.0F);
      ((Path)localObject3).cubicTo(69.85281F, 0.0F, 90.0F, 20.147184F, 90.0F, 45.0F);
      ((Path)localObject3).cubicTo(90.0F, 69.85281F, 69.85281F, 90.0F, 45.0F, 90.0F);
      ((Path)localObject3).cubicTo(20.147184F, 90.0F, 0.0F, 69.85281F, 0.0F, 45.0F);
      ((Path)localObject3).cubicTo(0.0F, 20.147184F, 20.147184F, 0.0F, 45.0F, 0.0F);
      ((Path)localObject3).close();
      localCanvas.drawPath((Path)localObject3, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject1, paramVarArgs);
      ((Paint)localObject1).setColor(-1);
      ((Paint)localObject1).setStrokeWidth(6.0F);
      localObject2 = c.j(paramVarArgs);
      ((Path)localObject2).moveTo(45.0F, 3.0F);
      ((Path)localObject2).cubicTo(68.19596F, 3.0F, 87.0F, 21.804039F, 87.0F, 45.0F);
      ((Path)localObject2).cubicTo(87.0F, 68.19596F, 68.19596F, 87.0F, 45.0F, 87.0F);
      ((Path)localObject2).cubicTo(21.804039F, 87.0F, 3.0F, 68.19596F, 3.0F, 45.0F);
      ((Path)localObject2).cubicTo(3.0F, 21.804039F, 21.804039F, 3.0F, 45.0F, 3.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-1);
      localObject1 = c.j(paramVarArgs);
      ((Path)localObject1).moveTo(57.0F, 42.0F);
      ((Path)localObject1).lineTo(63.43934F, 35.56066F);
      ((Path)localObject1).cubicTo(64.02512F, 34.974873F, 64.97488F, 34.974873F, 65.56066F, 35.56066F);
      ((Path)localObject1).cubicTo(65.841965F, 35.841965F, 66.0F, 36.223495F, 66.0F, 36.62132F);
      ((Path)localObject1).lineTo(66.0F, 53.37868F);
      ((Path)localObject1).cubicTo(66.0F, 54.207108F, 65.32843F, 54.87868F, 64.5F, 54.87868F);
      ((Path)localObject1).cubicTo(64.10217F, 54.87868F, 63.720646F, 54.720646F, 63.43934F, 54.43934F);
      ((Path)localObject1).lineTo(57.0F, 48.0F);
      ((Path)localObject1).lineTo(57.0F, 42.0F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(26.208F, 33.0F);
      ((Path)localObject1).lineTo(51.792F, 33.0F);
      ((Path)localObject1).cubicTo(53.011444F, 33.0F, 54.0F, 33.988556F, 54.0F, 35.208F);
      ((Path)localObject1).lineTo(54.0F, 54.792F);
      ((Path)localObject1).cubicTo(54.0F, 56.011444F, 53.011444F, 57.0F, 51.792F, 57.0F);
      ((Path)localObject1).lineTo(26.208F, 57.0F);
      ((Path)localObject1).cubicTo(24.988556F, 57.0F, 24.0F, 56.011444F, 24.0F, 54.792F);
      ((Path)localObject1).lineTo(24.0F, 35.208F);
      ((Path)localObject1).cubicTo(24.0F, 33.988556F, 24.988556F, 33.0F, 26.208F, 33.0F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/adl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */