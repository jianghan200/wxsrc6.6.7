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

public final class ep
  extends c
{
  private final int height = 66;
  private final int width = 66;
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 66;
      return 66;
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
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -196.0F, 0.0F, 1.0F, -118.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 196.0F, 0.0F, 1.0F, 118.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      ((Paint)localObject1).setColor(-1686720);
      localObject2 = c.j(paramVarArgs);
      ((Path)localObject2).moveTo(33.0F, 66.0F);
      ((Path)localObject2).cubicTo(51.225395F, 66.0F, 66.0F, 51.225395F, 66.0F, 33.0F);
      ((Path)localObject2).cubicTo(66.0F, 14.774603F, 51.225395F, 0.0F, 33.0F, 0.0F);
      ((Path)localObject2).cubicTo(14.774603F, 0.0F, 0.0F, 14.774603F, 0.0F, 33.0F);
      ((Path)localObject2).cubicTo(0.0F, 51.225395F, 14.774603F, 66.0F, 33.0F, 66.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-1);
      localObject1 = c.j(paramVarArgs);
      ((Path)localObject1).moveTo(11.0F, 33.5F);
      ((Path)localObject1).cubicTo(11.0F, 31.567003F, 12.567003F, 30.0F, 14.5F, 30.0F);
      ((Path)localObject1).lineTo(51.5F, 30.0F);
      ((Path)localObject1).cubicTo(53.433F, 30.0F, 55.0F, 31.567003F, 55.0F, 33.5F);
      ((Path)localObject1).lineTo(55.0F, 33.5F);
      ((Path)localObject1).cubicTo(55.0F, 35.433F, 53.433F, 37.0F, 51.5F, 37.0F);
      ((Path)localObject1).lineTo(14.5F, 37.0F);
      ((Path)localObject1).cubicTo(12.567003F, 37.0F, 11.0F, 35.433F, 11.0F, 33.5F);
      ((Path)localObject1).lineTo(11.0F, 33.5F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/ep.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */