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

public final class ti
  extends c
{
  private final int height = 120;
  private final int width = 120;
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 120;
      return 120;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject1 = c.f(paramVarArgs);
      float[] arrayOfFloat = c.e(paramVarArgs);
      Object localObject2 = c.i(paramVarArgs);
      ((Paint)localObject2).setFlags(385);
      ((Paint)localObject2).setStyle(Paint.Style.FILL);
      Object localObject3 = c.i(paramVarArgs);
      ((Paint)localObject3).setFlags(385);
      ((Paint)localObject3).setStyle(Paint.Style.STROKE);
      ((Paint)localObject2).setColor(-16777216);
      ((Paint)localObject3).setStrokeWidth(1.0F);
      ((Paint)localObject3).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject3).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject3).setStrokeMiter(4.0F);
      ((Paint)localObject3).setPathEffect(null);
      c.a((Paint)localObject3, paramVarArgs).setStrokeWidth(1.0F);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 15.0F, 0.0F, 1.0F, 0.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localObject3 = c.a((Paint)localObject2, paramVarArgs);
      ((Paint)localObject3).setColor(-1);
      localCanvas.save();
      localObject3 = c.a((Paint)localObject3, paramVarArgs);
      Object localObject4 = c.j(paramVarArgs);
      ((Path)localObject4).moveTo(60.0F, 0.0F);
      ((Path)localObject4).lineTo(90.0F, 30.0F);
      ((Path)localObject4).lineTo(90.0F, 116.0F);
      ((Path)localObject4).cubicTo(90.0F, 118.20914F, 88.20914F, 120.0F, 86.0F, 120.0F);
      ((Path)localObject4).lineTo(4.0F, 120.0F);
      ((Path)localObject4).cubicTo(1.790861F, 120.0F, 2.705415E-16F, 118.20914F, 0.0F, 116.0F);
      ((Path)localObject4).lineTo(0.0F, 4.0F);
      ((Path)localObject4).cubicTo(-2.705415E-16F, 1.790861F, 1.790861F, 4.0581224E-16F, 4.0F, 0.0F);
      ((Path)localObject4).lineTo(60.0F, 0.0F);
      ((Path)localObject4).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject4, 2);
      localCanvas.drawPath((Path)localObject4, (Paint)localObject3);
      localCanvas.restore();
      localObject3 = c.a((Paint)localObject2, paramVarArgs);
      ((Paint)localObject3).setColor(201326592);
      localCanvas.save();
      localObject3 = c.a((Paint)localObject3, paramVarArgs);
      localObject4 = c.j(paramVarArgs);
      ((Path)localObject4).moveTo(60.0F, 0.0F);
      ((Path)localObject4).lineTo(90.0F, 30.0F);
      ((Path)localObject4).lineTo(90.0F, 116.0F);
      ((Path)localObject4).cubicTo(90.0F, 118.20914F, 88.20914F, 120.0F, 86.0F, 120.0F);
      ((Path)localObject4).lineTo(4.0F, 120.0F);
      ((Path)localObject4).cubicTo(1.790861F, 120.0F, 2.705415E-16F, 118.20914F, 0.0F, 116.0F);
      ((Path)localObject4).lineTo(0.0F, 4.0F);
      ((Path)localObject4).cubicTo(-2.705415E-16F, 1.790861F, 1.790861F, 4.0581224E-16F, 4.0F, 0.0F);
      ((Path)localObject4).lineTo(60.0F, 0.0F);
      ((Path)localObject4).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject4, 2);
      localCanvas.drawPath((Path)localObject4, (Paint)localObject3);
      localCanvas.restore();
      localObject4 = c.a((Paint)localObject2, paramVarArgs);
      ((Paint)localObject4).setColor(-16777216);
      localObject3 = c.j(paramVarArgs);
      ((Path)localObject3).moveTo(90.0F, 30.0F);
      ((Path)localObject3).lineTo(64.0F, 30.0F);
      ((Path)localObject3).cubicTo(61.79086F, 30.0F, 60.0F, 28.209139F, 60.0F, 26.0F);
      ((Path)localObject3).lineTo(60.0F, 0.0F);
      ((Path)localObject3).lineTo(90.0F, 30.0F);
      ((Path)localObject3).close();
      localCanvas.saveLayerAlpha(null, 25, 4);
      localObject4 = c.a((Paint)localObject4, paramVarArgs);
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject4);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a((Paint)localObject2, paramVarArgs);
      ((Paint)localObject2).setColor(-10461088);
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 21.0F, 0.0F, 1.0F, 58.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.saveLayerAlpha(null, 204, 4);
      localCanvas.save();
      localObject3 = c.a((Paint)localObject2, paramVarArgs);
      localObject4 = c.j(paramVarArgs);
      ((Path)localObject4).moveTo(-3.5527137E-15F, 13.20906F);
      ((Path)localObject4).lineTo(13.891402F, 3.9411764F);
      ((Path)localObject4).lineTo(13.891402F, 7.1200304F);
      ((Path)localObject4).lineTo(3.5791855F, 14.0F);
      ((Path)localObject4).lineTo(13.891402F, 20.87997F);
      ((Path)localObject4).lineTo(13.891402F, 24.058823F);
      ((Path)localObject4).lineTo(-1.5543122E-15F, 14.79094F);
      ((Path)localObject4).lineTo(0.0F, 13.20906F);
      ((Path)localObject4).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject4, 2);
      localCanvas.drawPath((Path)localObject4, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.save();
      localObject3 = c.a((Paint)localObject2, paramVarArgs);
      arrayOfFloat = c.a(arrayOfFloat, -1.0F, 0.0F, 76.23529F, 0.0F, 1.0F, 0.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localObject1 = c.j(paramVarArgs);
      ((Path)localObject1).moveTo(31.235294F, 13.20906F);
      ((Path)localObject1).lineTo(45.126698F, 3.9411764F);
      ((Path)localObject1).lineTo(45.126698F, 7.1200304F);
      ((Path)localObject1).lineTo(34.81448F, 14.0F);
      ((Path)localObject1).lineTo(45.126698F, 20.87997F);
      ((Path)localObject1).lineTo(45.126698F, 24.058823F);
      ((Path)localObject1).lineTo(31.235294F, 14.79094F);
      ((Path)localObject1).lineTo(31.235294F, 13.20906F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramVarArgs);
      localObject2 = c.j(paramVarArgs);
      ((Path)localObject2).moveTo(26.200712F, 0.0F);
      ((Path)localObject2).lineTo(29.377182F, 0.0F);
      ((Path)localObject2).lineTo(19.588236F, 28.0F);
      ((Path)localObject2).lineTo(16.411764F, 28.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 1);
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/ti.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */