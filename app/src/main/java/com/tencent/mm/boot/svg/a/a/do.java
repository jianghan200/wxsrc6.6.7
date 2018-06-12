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

public final class do
  extends c
{
  private final int height = 150;
  private final int width = 150;
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 150;
      return 150;
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
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -239.0F, 0.0F, 1.0F, -739.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 239.0F, 0.0F, 1.0F, 739.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      ((Paint)localObject1).setColor(-16139513);
      localObject2 = c.j(paramVarArgs);
      ((Path)localObject2).moveTo(75.0F, 0.0F);
      ((Path)localObject2).cubicTo(116.42136F, 0.0F, 150.0F, 33.57864F, 150.0F, 75.0F);
      ((Path)localObject2).cubicTo(150.0F, 116.42136F, 116.42136F, 150.0F, 75.0F, 150.0F);
      ((Path)localObject2).cubicTo(33.57864F, 150.0F, 0.0F, 116.42136F, 0.0F, 75.0F);
      ((Path)localObject2).cubicTo(0.0F, 33.57864F, 33.57864F, 0.0F, 75.0F, 0.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-1);
      localObject1 = c.j(paramVarArgs);
      ((Path)localObject1).moveTo(40.333332F, 110.27027F);
      ((Path)localObject1).cubicTo(37.63287F, 110.70741F, 36.316177F, 109.3305F, 37.133335F, 107.076164F);
      ((Path)localObject1).lineTo(41.4F, 94.29975F);
      ((Path)localObject1).cubicTo(37.380486F, 88.30855F, 35.0F, 83.169525F, 35.0F, 76.19984F);
      ((Path)localObject1).cubicTo(35.0F, 56.08848F, 52.9088F, 40.0F, 75.53333F, 40.0F);
      ((Path)localObject1).cubicTo(97.0912F, 40.0F, 115.0F, 56.08848F, 115.0F, 76.19984F);
      ((Path)localObject1).cubicTo(115.0F, 95.78047F, 97.0912F, 110.27027F, 75.53333F, 110.27027F);
      ((Path)localObject1).cubicTo(67.61395F, 110.27027F, 60.69544F, 108.47199F, 55.266666F, 104.94676F);
      ((Path)localObject1).lineTo(40.333332F, 110.27027F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/do.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */