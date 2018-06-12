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

public final class aoz
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
      Object localObject2 = c.e(paramVarArgs);
      Paint localPaint = c.i(paramVarArgs);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.FILL);
      Object localObject3 = c.i(paramVarArgs);
      ((Paint)localObject3).setFlags(385);
      ((Paint)localObject3).setStyle(Paint.Style.STROKE);
      localPaint.setColor(-16777216);
      ((Paint)localObject3).setStrokeWidth(1.0F);
      ((Paint)localObject3).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject3).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject3).setStrokeMiter(4.0F);
      ((Paint)localObject3).setPathEffect(null);
      c.a((Paint)localObject3, paramVarArgs).setStrokeWidth(1.0F);
      localObject3 = c.a(localPaint, paramVarArgs);
      ((Paint)localObject3).setColor(-14046139);
      Path localPath = c.j(paramVarArgs);
      localPath.moveTo(0.0F, 0.0F);
      localPath.lineTo(96.0F, 0.0F);
      localPath.lineTo(96.0F, 96.0F);
      localPath.lineTo(0.0F, 96.0F);
      localPath.lineTo(0.0F, 0.0F);
      localPath.close();
      localCanvas.saveLayerAlpha(null, 0, 4);
      localCanvas.drawPath(localPath, c.a((Paint)localObject3, paramVarArgs));
      localCanvas.restore();
      localCanvas.saveLayerAlpha(null, 204, 4);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-1);
      localObject3 = c.a((float[])localObject2, 1.0F, 0.0F, 12.0F, 0.0F, 1.0F, 12.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.saveLayerAlpha(null, 204, 4);
      localCanvas.save();
      localObject2 = c.a(localPaint, paramVarArgs);
      localObject3 = c.a((float[])localObject3, 1.0F, 0.0F, 0.0F, 0.0F, -1.0F, 53.63604F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
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
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint, paramVarArgs);
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


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/aoz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */