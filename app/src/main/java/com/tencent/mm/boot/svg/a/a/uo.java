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

public final class uo
  extends c
{
  private final int height = 20;
  private final int width = 15;
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 15;
      return 20;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject1 = c.f(paramVarArgs);
      float[] arrayOfFloat = c.e(paramVarArgs);
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
      localCanvas.save();
      c.a(localPaint, paramVarArgs).setStrokeWidth(1.0F);
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, -278.0F, 0.0F, 1.0F, -114.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramVarArgs);
      ((Paint)localObject1).setColor(-1);
      localObject2 = c.j(paramVarArgs);
      ((Path)localObject2).moveTo(286.1F, 115.882835F);
      ((Path)localObject2).lineTo(286.1F, 125.12132F);
      ((Path)localObject2).lineTo(284.9F, 125.12132F);
      ((Path)localObject2).lineTo(284.9F, 115.88285F);
      ((Path)localObject2).lineTo(282.813F, 117.96985F);
      ((Path)localObject2).lineTo(281.96448F, 117.12132F);
      ((Path)localObject2).lineTo(284.7929F, 114.29289F);
      ((Path)localObject2).cubicTo(285.1834F, 113.90237F, 285.8166F, 113.90237F, 286.2071F, 114.29289F);
      ((Path)localObject2).lineTo(286.34854F, 114.43432F);
      ((Path)localObject2).lineTo(289.03552F, 117.12132F);
      ((Path)localObject2).lineTo(288.187F, 117.96985F);
      ((Path)localObject2).lineTo(286.1F, 115.882835F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(281.0F, 118.62132F);
      ((Path)localObject2).lineTo(281.0F, 119.82132F);
      ((Path)localObject2).lineTo(279.2F, 119.82132F);
      ((Path)localObject2).lineTo(279.2F, 132.42133F);
      ((Path)localObject2).lineTo(291.8F, 132.42133F);
      ((Path)localObject2).lineTo(291.8F, 119.82132F);
      ((Path)localObject2).lineTo(290.0F, 119.82132F);
      ((Path)localObject2).lineTo(290.0F, 118.62132F);
      ((Path)localObject2).lineTo(292.00104F, 118.62132F);
      ((Path)localObject2).cubicTo(292.55087F, 118.62132F, 293.0F, 119.06716F, 293.0F, 119.61713F);
      ((Path)localObject2).lineTo(293.0F, 132.62552F);
      ((Path)localObject2).cubicTo(293.0F, 133.1724F, 292.55417F, 133.62132F, 292.00418F, 133.62132F);
      ((Path)localObject2).lineTo(278.99582F, 133.62132F);
      ((Path)localObject2).cubicTo(278.4489F, 133.62132F, 278.0F, 133.17548F, 278.0F, 132.62552F);
      ((Path)localObject2).lineTo(278.0F, 119.61713F);
      ((Path)localObject2).cubicTo(278.0F, 119.070244F, 278.44724F, 118.62132F, 278.99896F, 118.62132F);
      ((Path)localObject2).lineTo(281.0F, 118.62132F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 1);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/uo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */