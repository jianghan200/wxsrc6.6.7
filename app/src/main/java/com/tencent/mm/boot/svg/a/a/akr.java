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

public final class akr
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
      Matrix localMatrix = c.f(paramVarArgs);
      float[] arrayOfFloat = c.e(paramVarArgs);
      Paint localPaint1 = c.i(paramVarArgs);
      localPaint1.setFlags(385);
      localPaint1.setStyle(Paint.Style.FILL);
      Object localObject = c.i(paramVarArgs);
      ((Paint)localObject).setFlags(385);
      ((Paint)localObject).setStyle(Paint.Style.STROKE);
      localPaint1.setColor(-16777216);
      ((Paint)localObject).setStrokeWidth(1.0F);
      ((Paint)localObject).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject).setStrokeMiter(4.0F);
      ((Paint)localObject).setPathEffect(null);
      localPaint1 = c.a((Paint)localObject, paramVarArgs);
      localPaint1.setStrokeWidth(1.0F);
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setStrokeWidth(3.0F);
      localObject = c.j(paramVarArgs);
      ((Path)localObject).moveTo(45.0F, 11.0F);
      ((Path)localObject).cubicTo(63.225395F, 11.0F, 78.0F, 25.774603F, 78.0F, 44.0F);
      ((Path)localObject).cubicTo(78.0F, 62.225395F, 63.225395F, 77.0F, 45.0F, 77.0F);
      ((Path)localObject).cubicTo(26.774603F, 77.0F, 12.0F, 62.225395F, 12.0F, 44.0F);
      ((Path)localObject).cubicTo(12.0F, 25.774603F, 26.774603F, 11.0F, 45.0F, 11.0F);
      ((Path)localObject).close();
      Paint localPaint2 = c.i(paramVarArgs);
      localPaint2.setFlags(385);
      localPaint2.setStyle(Paint.Style.FILL);
      Paint localPaint3 = c.i(paramVarArgs);
      localPaint3.setFlags(385);
      localPaint3.setStyle(Paint.Style.STROKE);
      localPaint2.setColor(-16777216);
      localPaint3.setStrokeWidth(1.0F);
      localPaint3.setStrokeCap(Paint.Cap.BUTT);
      localPaint3.setStrokeJoin(Paint.Join.MITER);
      localPaint3.setStrokeMiter(4.0F);
      localPaint3.setPathEffect(null);
      arrayOfFloat = c.a(arrayOfFloat, 66.0F, 0.0F, 12.0F, 0.0F, 66.0F, 11.0F);
      localMatrix.reset();
      localMatrix.setValues(arrayOfFloat);
      WeChatSVGRenderC2Java.setLinearGradient(localPaint1, 0.5F, 0.0F, 0.5F, 1.0F, new int[] { -11019676, -5439996 }, new float[] { 0.0F, 1.0F }, localMatrix, 0);
      localCanvas.drawPath((Path)localObject, localPaint1);
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/akr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */