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

public final class ya
  extends c
{
  private final int height = 93;
  private final int width = 93;
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 93;
      return 93;
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
      localCanvas.save();
      localObject3 = c.a((float[])localObject3, 1.0F, 0.0F, 31.0F, 0.0F, 1.0F, 31.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.restore();
      localObject1 = c.a((Paint)localObject2, paramVarArgs);
      ((Paint)localObject1).setColor(-1);
      localCanvas.save();
      localObject2 = c.a((Paint)localObject1, paramVarArgs);
      localObject3 = c.j(paramVarArgs);
      ((Path)localObject3).moveTo(78.991554F, 14.00827F);
      ((Path)localObject3).cubicTo(97.66948F, 31.740889F, 97.66948F, 61.25771F, 78.991554F, 78.99145F);
      ((Path)localObject3).cubicTo(61.258163F, 97.66952F, 31.741741F, 97.66952F, 14.008727F, 78.99145F);
      ((Path)localObject3).cubicTo(-4.6695757F, 61.25771F, -4.6695757F, 31.740889F, 14.008727F, 14.00827F);
      ((Path)localObject3).cubicTo(31.740246F, -4.669423F, 61.258163F, -4.669423F, 78.991554F, 14.00827F);
      ((Path)localObject3).close();
      ((Path)localObject3).moveTo(86.38453F, 48.423794F);
      ((Path)localObject3).cubicTo(86.38453F, 25.27637F, 68.759476F, 7.65122F, 48.42406F, 7.65122F);
      ((Path)localObject3).cubicTo(25.275711F, 7.65122F, 7.6517115F, 25.27637F, 7.6517115F, 48.423794F);
      ((Path)localObject3).cubicTo(7.6517115F, 68.759315F, 25.276764F, 86.38446F, 45.612175F, 86.38446F);
      ((Path)localObject3).cubicTo(68.759476F, 86.38446F, 86.38453F, 68.759315F, 86.38453F, 48.423794F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject1, paramVarArgs);
      localObject2 = c.j(paramVarArgs);
      ((Path)localObject2).moveTo(48.44434F, 43.142254F);
      ((Path)localObject2).lineTo(55.190773F, 29.0F);
      ((Path)localObject2).lineTo(61.51553F, 29.0F);
      ((Path)localObject2).lineTo(54.769096F, 43.142254F);
      ((Path)localObject2).lineTo(61.51553F, 43.142254F);
      ((Path)localObject2).lineTo(61.51553F, 48.44558F);
      ((Path)localObject2).lineTo(49.28777F, 48.44558F);
      ((Path)localObject2).lineTo(49.28777F, 53.306904F);
      ((Path)localObject2).lineTo(61.51553F, 53.306904F);
      ((Path)localObject2).lineTo(61.51553F, 58.61023F);
      ((Path)localObject2).lineTo(49.28777F, 58.61023F);
      ((Path)localObject2).lineTo(49.28777F, 66.565216F);
      ((Path)localObject2).lineTo(44.227966F, 66.565216F);
      ((Path)localObject2).lineTo(44.227966F, 58.61023F);
      ((Path)localObject2).lineTo(32.0F, 58.61023F);
      ((Path)localObject2).lineTo(32.0F, 53.306904F);
      ((Path)localObject2).lineTo(44.227966F, 53.306904F);
      ((Path)localObject2).lineTo(44.227966F, 48.44558F);
      ((Path)localObject2).lineTo(32.0F, 48.44558F);
      ((Path)localObject2).lineTo(32.0F, 43.142254F);
      ((Path)localObject2).lineTo(38.746433F, 43.142254F);
      ((Path)localObject2).lineTo(32.0F, 29.0F);
      ((Path)localObject2).lineTo(38.324757F, 29.0F);
      ((Path)localObject2).lineTo(45.07119F, 43.142254F);
      ((Path)localObject2).lineTo(48.44434F, 43.142254F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/ya.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */