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

public final class di
  extends c
{
  private final int height = 18;
  private final int width = 56;
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 56;
      return 18;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject1 = c.f(paramVarArgs);
      Object localObject2 = c.e(paramVarArgs);
      Object localObject3 = c.i(paramVarArgs);
      ((Paint)localObject3).setFlags(385);
      ((Paint)localObject3).setStyle(Paint.Style.FILL);
      Object localObject4 = c.i(paramVarArgs);
      ((Paint)localObject4).setFlags(385);
      ((Paint)localObject4).setStyle(Paint.Style.STROKE);
      ((Paint)localObject3).setColor(-16777216);
      ((Paint)localObject4).setStrokeWidth(1.0F);
      ((Paint)localObject4).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject4).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject4).setStrokeMiter(4.0F);
      ((Paint)localObject4).setPathEffect(null);
      c.a((Paint)localObject4, paramVarArgs).setStrokeWidth(1.0F);
      localCanvas.save();
      localObject3 = c.a((Paint)localObject3, paramVarArgs);
      ((Paint)localObject3).setColor(-16777216);
      localObject4 = c.a((float[])localObject2, 1.0F, 0.0F, -586.0F, 0.0F, 1.0F, -423.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject4);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((Paint)localObject3, paramVarArgs);
      localObject3 = c.a((float[])localObject4, 6.123234E-17F, -1.0F, 1046.0F, 1.0F, 6.123234E-17F, -182.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localObject1 = c.j(paramVarArgs);
      ((Path)localObject1).moveTo(614.0F, 404.0F);
      ((Path)localObject1).cubicTo(616.7558F, 404.0F, 619.0F, 406.2386F, 619.0F, 409.0F);
      ((Path)localObject1).cubicTo(619.0F, 411.7558F, 616.7614F, 414.0F, 614.0F, 414.0F);
      ((Path)localObject1).cubicTo(611.2442F, 414.0F, 609.0F, 411.7614F, 609.0F, 409.0F);
      ((Path)localObject1).cubicTo(609.0F, 406.2442F, 611.2386F, 404.0F, 614.0F, 404.0F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(614.0F, 423.0F);
      ((Path)localObject1).cubicTo(618.9717F, 423.0F, 623.0F, 427.02945F, 623.0F, 432.0F);
      ((Path)localObject1).cubicTo(623.0F, 436.97165F, 618.9706F, 441.0F, 614.0F, 441.0F);
      ((Path)localObject1).cubicTo(609.0283F, 441.0F, 605.0F, 436.97055F, 605.0F, 432.0F);
      ((Path)localObject1).cubicTo(605.0F, 427.02835F, 609.0294F, 423.0F, 614.0F, 423.0F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(614.0F, 450.0F);
      ((Path)localObject1).cubicTo(616.7558F, 450.0F, 619.0F, 452.2386F, 619.0F, 455.0F);
      ((Path)localObject1).cubicTo(619.0F, 457.7558F, 616.7614F, 460.0F, 614.0F, 460.0F);
      ((Path)localObject1).cubicTo(611.2442F, 460.0F, 609.0F, 457.7614F, 609.0F, 455.0F);
      ((Path)localObject1).cubicTo(609.0F, 452.2442F, 611.2386F, 450.0F, 614.0F, 450.0F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/di.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */