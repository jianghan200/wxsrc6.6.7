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

public final class ame
  extends c
{
  private final int height = 30;
  private final int width = 42;
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 42;
      return 30;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject1 = c.f(paramVarArgs);
      Object localObject3 = c.e(paramVarArgs);
      Object localObject2 = c.i(paramVarArgs);
      ((Paint)localObject2).setFlags(385);
      ((Paint)localObject2).setStyle(Paint.Style.FILL);
      Paint localPaint = c.i(paramVarArgs);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.STROKE);
      ((Paint)localObject2).setColor(-16777216);
      localPaint.setStrokeWidth(1.0F);
      localPaint.setStrokeCap(Paint.Cap.BUTT);
      localPaint.setStrokeJoin(Paint.Join.MITER);
      localPaint.setStrokeMiter(4.0F);
      localPaint.setPathEffect(null);
      c.a(localPaint, paramVarArgs).setStrokeWidth(1.0F);
      localObject2 = c.a((Paint)localObject2, paramVarArgs);
      ((Paint)localObject2).setColor(-1);
      localCanvas.save();
      localObject3 = c.a((float[])localObject3, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 3.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramVarArgs);
      localObject3 = c.j(paramVarArgs);
      ((Path)localObject3).moveTo(3.0F, 21.0F);
      ((Path)localObject3).lineTo(25.0F, 21.0F);
      ((Path)localObject3).lineTo(25.0F, 3.0F);
      ((Path)localObject3).lineTo(3.0F, 3.0F);
      ((Path)localObject3).lineTo(3.0F, 21.0F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(0.0F, 2.0049467F);
      ((Path)localObject3).cubicTo(0.0F, 0.8976452F, 0.8998975F, 0.0F, 1.9912443F, 0.0F);
      ((Path)localObject3).lineTo(26.008757F, 0.0F);
      ((Path)localObject3).cubicTo(27.10849F, 0.0F, 28.0F, 0.89702624F, 28.0F, 2.0049467F);
      ((Path)localObject3).lineTo(28.0F, 21.995054F);
      ((Path)localObject3).cubicTo(28.0F, 23.102354F, 27.100103F, 24.0F, 26.008757F, 24.0F);
      ((Path)localObject3).lineTo(1.9912443F, 24.0F);
      ((Path)localObject3).cubicTo(0.8915104F, 24.0F, 0.0F, 23.102974F, 0.0F, 21.995054F);
      ((Path)localObject3).lineTo(0.0F, 2.0049467F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramVarArgs);
      localObject2 = c.j(paramVarArgs);
      ((Path)localObject2).moveTo(34.0F, 14.914493F);
      ((Path)localObject2).lineTo(39.0F, 18.323584F);
      ((Path)localObject2).lineTo(39.0F, 5.6764164F);
      ((Path)localObject2).lineTo(34.0F, 9.085507F);
      ((Path)localObject2).lineTo(34.0F, 14.914493F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(31.0F, 7.5F);
      ((Path)localObject2).lineTo(39.51767F, 1.692498F);
      ((Path)localObject2).cubicTo(40.888622F, 0.7577572F, 42.0F, 1.3417706F, 42.0F, 2.9910905F);
      ((Path)localObject2).lineTo(42.0F, 21.00891F);
      ((Path)localObject2).cubicTo(42.0F, 22.660843F, 40.884727F, 23.239586F, 39.51767F, 22.307503F);
      ((Path)localObject2).lineTo(31.0F, 16.5F);
      ((Path)localObject2).lineTo(31.0F, 7.5F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/ame.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */