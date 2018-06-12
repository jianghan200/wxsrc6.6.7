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

public final class aoy
  extends c
{
  private final int height = 96;
  private final int width = 96;
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 96;
      return 96;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject1 = c.f(paramVarArgs);
      Object localObject3 = c.e(paramVarArgs);
      Object localObject2 = c.i(paramVarArgs);
      ((Paint)localObject2).setFlags(385);
      ((Paint)localObject2).setStyle(Paint.Style.FILL);
      Object localObject4 = c.i(paramVarArgs);
      ((Paint)localObject4).setFlags(385);
      ((Paint)localObject4).setStyle(Paint.Style.STROKE);
      ((Paint)localObject2).setColor(-16777216);
      ((Paint)localObject4).setStrokeWidth(1.0F);
      ((Paint)localObject4).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject4).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject4).setStrokeMiter(4.0F);
      ((Paint)localObject4).setPathEffect(null);
      c.a((Paint)localObject4, paramVarArgs).setStrokeWidth(1.0F);
      localCanvas.saveLayerAlpha(null, 204, 4);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a((Paint)localObject2, paramVarArgs);
      ((Paint)localObject2).setColor(-1);
      localObject4 = c.a((float[])localObject3, 1.0F, 0.0F, 12.0F, 0.0F, 1.0F, 12.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject4);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.saveLayerAlpha(null, 76, 4);
      localCanvas.save();
      localObject3 = c.a((Paint)localObject2, paramVarArgs);
      localObject4 = c.a((float[])localObject4, 1.0F, 0.0F, 0.0F, 0.0F, -1.0F, 53.63604F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject4);
      localCanvas.concat((Matrix)localObject1);
      localObject1 = c.j(paramVarArgs);
      ((Path)localObject1).moveTo(37.79998F, 15.784549F);
      ((Path)localObject1).lineTo(37.79998F, 43.5F);
      ((Path)localObject1).lineTo(34.19998F, 43.5F);
      ((Path)localObject1).lineTo(34.19998F, 15.784586F);
      ((Path)localObject1).lineTo(27.938982F, 22.045584F);
      ((Path)localObject1).lineTo(25.393398F, 19.5F);
      ((Path)localObject1).lineTo(33.87868F, 11.014719F);
      ((Path)localObject1).cubicTo(35.05025F, 9.843145F, 36.94975F, 9.843145F, 38.12132F, 11.014719F);
      ((Path)localObject1).lineTo(38.545586F, 11.438983F);
      ((Path)localObject1).lineTo(46.6066F, 19.5F);
      ((Path)localObject1).lineTo(44.061016F, 22.045584F);
      ((Path)localObject1).lineTo(37.79998F, 15.784549F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 1);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramVarArgs);
      localObject2 = c.j(paramVarArgs);
      ((Path)localObject2).moveTo(56.4F, 24.6F);
      ((Path)localObject2).lineTo(48.0F, 24.6F);
      ((Path)localObject2).lineTo(48.0F, 21.0F);
      ((Path)localObject2).lineTo(57.00313F, 21.0F);
      ((Path)localObject2).cubicTo(58.65261F, 21.0F, 60.0F, 22.337517F, 60.0F, 23.987425F);
      ((Path)localObject2).lineTo(60.0F, 63.012573F);
      ((Path)localObject2).cubicTo(60.0F, 64.65324F, 58.662483F, 66.0F, 57.012573F, 66.0F);
      ((Path)localObject2).lineTo(14.987426F, 66.0F);
      ((Path)localObject2).cubicTo(13.346761F, 66.0F, 12.0F, 64.66248F, 12.0F, 63.012573F);
      ((Path)localObject2).lineTo(12.0F, 23.987425F);
      ((Path)localObject2).cubicTo(12.0F, 22.34676F, 13.341744F, 21.0F, 14.99687F, 21.0F);
      ((Path)localObject2).lineTo(24.0F, 21.0F);
      ((Path)localObject2).lineTo(24.0F, 24.6F);
      ((Path)localObject2).lineTo(15.6F, 24.6F);
      ((Path)localObject2).lineTo(15.6F, 62.4F);
      ((Path)localObject2).lineTo(56.4F, 62.4F);
      ((Path)localObject2).lineTo(56.4F, 24.6F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 1);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/aoy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */