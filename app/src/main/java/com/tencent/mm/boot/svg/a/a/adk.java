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

public final class adk
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
      localObject3 = c.a((float[])localObject3, 1.0F, 0.0F, -276.0F, 0.0F, 1.0F, -265.0F);
      ((Matrix)localObject2).reset();
      ((Matrix)localObject2).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject2);
      localCanvas.save();
      localObject3 = c.a((float[])localObject3, 1.0F, 0.0F, 276.0F, 0.0F, 1.0F, 265.0F);
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
      ((Path)localObject1).moveTo(59.248722F, 48.12048F);
      ((Path)localObject1).lineTo(39.167625F, 62.609314F);
      ((Path)localObject1).cubicTo(38.27261F, 63.25508F, 37.023556F, 63.053024F, 36.37779F, 62.15801F);
      ((Path)localObject1).cubicTo(36.13218F, 61.817604F, 36.0F, 61.408504F, 36.0F, 60.988743F);
      ((Path)localObject1).lineTo(36.0F, 32.011078F);
      ((Path)localObject1).cubicTo(36.0F, 30.907413F, 36.894695F, 30.012718F, 37.998356F, 30.012718F);
      ((Path)localObject1).cubicTo(38.418118F, 30.012718F, 38.82722F, 30.1449F, 39.167625F, 30.390507F);
      ((Path)localObject1).lineTo(59.248722F, 44.87934F);
      ((Path)localObject1).cubicTo(60.14374F, 45.52511F, 60.345795F, 46.774162F, 59.700027F, 47.669178F);
      ((Path)localObject1).cubicTo(59.57474F, 47.84282F, 59.422363F, 47.995193F, 59.248722F, 48.12048F);
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


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/adk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */