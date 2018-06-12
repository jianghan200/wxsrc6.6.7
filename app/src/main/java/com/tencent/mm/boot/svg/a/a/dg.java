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

public final class dg
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
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -238.0F, 0.0F, 1.0F, -408.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 238.0F, 0.0F, 1.0F, 408.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.j(paramVarArgs);
      ((Path)localObject2).moveTo(85.0F, 62.0F);
      ((Path)localObject2).lineTo(85.0F, 35.0F);
      ((Path)localObject2).cubicTo(85.0F, 33.81324F, 84.190865F, 33.0F, 83.0F, 33.0F);
      ((Path)localObject2).lineTo(49.0F, 33.0F);
      ((Path)localObject2).cubicTo(47.811264F, 33.0F, 47.0F, 33.81639F, 47.0F, 35.0F);
      ((Path)localObject2).lineTo(47.0F, 62.0F);
      ((Path)localObject2).cubicTo(47.0F, 63.18676F, 47.809135F, 64.0F, 49.0F, 64.0F);
      ((Path)localObject2).lineTo(83.0F, 64.0F);
      ((Path)localObject2).cubicTo(84.188736F, 64.0F, 85.0F, 63.18361F, 85.0F, 62.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(89.0F, 43.0F);
      ((Path)localObject2).cubicTo(93.40946F, 38.83027F, 99.615555F, 32.798397F, 100.0F, 32.0F);
      ((Path)localObject2).cubicTo(101.65531F, 31.724306F, 103.0F, 32.390232F, 103.0F, 34.0F);
      ((Path)localObject2).lineTo(103.0F, 63.0F);
      ((Path)localObject2).cubicTo(103.0F, 64.42094F, 101.78401F, 65.34744F, 100.0F, 65.0F);
      ((Path)localObject2).cubicTo(99.861565F, 64.30614F, 93.517F, 58.096F, 89.0F, 53.0F);
      ((Path)localObject2).lineTo(89.0F, 43.0F);
      ((Path)localObject2).lineTo(89.0F, 43.0F);
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


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/dg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */