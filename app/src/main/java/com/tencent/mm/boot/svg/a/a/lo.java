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

public final class lo
  extends c
{
  private final int height = 42;
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
      return 42;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject1 = c.f(paramVarArgs);
      float[] arrayOfFloat = c.e(paramVarArgs);
      Paint localPaint = c.i(paramVarArgs);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.FILL);
      Object localObject2 = c.i(paramVarArgs);
      ((Paint)localObject2).setFlags(385);
      ((Paint)localObject2).setStyle(Paint.Style.STROKE);
      localPaint.setColor(-16777216);
      ((Paint)localObject2).setStrokeWidth(1.0F);
      ((Paint)localObject2).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject2).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject2).setStrokeMiter(4.0F);
      ((Paint)localObject2).setPathEffect(null);
      localObject2 = c.a((Paint)localObject2, paramVarArgs);
      ((Paint)localObject2).setStrokeWidth(1.0F);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, -91.0F, 0.0F, 1.0F, -941.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 91.0F, 0.0F, 1.0F, 946.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramVarArgs);
      ((Paint)localObject1).setColor(-1);
      ((Paint)localObject1).setStrokeWidth(3.1751997F);
      localObject2 = c.j(paramVarArgs);
      ((Path)localObject2).moveTo(1.5875999F, 3.1751997F);
      ((Path)localObject2).cubicTo(1.5875999F, 2.2983925F, 2.2983925F, 1.5875999F, 3.1751997F, 1.5875999F);
      ((Path)localObject2).lineTo(38.8248F, 1.5875999F);
      ((Path)localObject2).cubicTo(39.701607F, 1.5875999F, 40.4124F, 2.2983925F, 40.4124F, 3.1751997F);
      ((Path)localObject2).lineTo(40.4124F, 28.8248F);
      ((Path)localObject2).cubicTo(40.4124F, 29.701607F, 39.701607F, 30.412401F, 38.8248F, 30.412401F);
      ((Path)localObject2).lineTo(3.1751997F, 30.412401F);
      ((Path)localObject2).cubicTo(2.2983925F, 30.412401F, 1.5875999F, 29.701607F, 1.5875999F, 28.8248F);
      ((Path)localObject2).lineTo(1.5875999F, 3.1751997F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-1);
      localObject1 = c.j(paramVarArgs);
      ((Path)localObject1).moveTo(31.32F, 15.56F);
      ((Path)localObject1).lineTo(26.1F, 20.735F);
      ((Path)localObject1).lineTo(28.188F, 24.875F);
      ((Path)localObject1).lineTo(13.572F, 11.42F);
      ((Path)localObject1).lineTo(0.0F, 23.84F);
      ((Path)localObject1).lineTo(0.0F, 30.05F);
      ((Path)localObject1).lineTo(40.716F, 30.05F);
      ((Path)localObject1).lineTo(40.716F, 23.84F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 1);
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/lo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */