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

public final class lu
  extends c
{
  private final int height = 78;
  private final int width = 78;
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 78;
      return 78;
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
      localCanvas.save();
      localObject2 = c.a((Paint)localObject2, paramVarArgs);
      ((Paint)localObject2).setStrokeWidth(1.0F);
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, -291.0F, 0.0F, 1.0F, -1375.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 291.0F, 0.0F, 1.0F, 1375.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localObject1 = c.j(paramVarArgs);
      ((Path)localObject1).moveTo(38.926277F, 0.0F);
      ((Path)localObject1).cubicTo(60.424667F, 0.0F, 77.852554F, 17.427887F, 77.852554F, 38.926277F);
      ((Path)localObject1).cubicTo(77.852554F, 60.424667F, 60.424667F, 77.852554F, 38.926277F, 77.852554F);
      ((Path)localObject1).cubicTo(17.427887F, 77.852554F, 0.0F, 60.424667F, 0.0F, 38.926277F);
      ((Path)localObject1).cubicTo(0.0F, 17.427887F, 17.427887F, 0.0F, 38.926277F, 0.0F);
      ((Path)localObject1).close();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramVarArgs);
      ((Paint)localObject1).setColor(-5066062);
      ((Paint)localObject1).setStrokeWidth(4.0F);
      localObject2 = c.j(paramVarArgs);
      ((Path)localObject2).moveTo(38.926277F, 2.0F);
      ((Path)localObject2).cubicTo(59.3201F, 2.0F, 75.852554F, 18.532457F, 75.852554F, 38.926277F);
      ((Path)localObject2).cubicTo(75.852554F, 59.3201F, 59.3201F, 75.852554F, 38.926277F, 75.852554F);
      ((Path)localObject2).cubicTo(18.532457F, 75.852554F, 2.0F, 59.3201F, 2.0F, 38.926277F);
      ((Path)localObject2).cubicTo(2.0F, 18.532457F, 18.532457F, 2.0F, 38.926277F, 2.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint, paramVarArgs);
      ((Paint)localObject1).setColor(-5066062);
      localObject2 = c.j(paramVarArgs);
      ((Path)localObject2).moveTo(27.0F, 30.0F);
      ((Path)localObject2).lineTo(46.0F, 30.0F);
      ((Path)localObject2).cubicTo(47.10457F, 30.0F, 48.0F, 30.89543F, 48.0F, 32.0F);
      ((Path)localObject2).lineTo(48.0F, 47.0F);
      ((Path)localObject2).cubicTo(48.0F, 48.10457F, 47.10457F, 49.0F, 46.0F, 49.0F);
      ((Path)localObject2).lineTo(27.0F, 49.0F);
      ((Path)localObject2).cubicTo(25.89543F, 49.0F, 25.0F, 48.10457F, 25.0F, 47.0F);
      ((Path)localObject2).lineTo(25.0F, 32.0F);
      ((Path)localObject2).cubicTo(25.0F, 30.89543F, 25.89543F, 30.0F, 27.0F, 30.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 1);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-5066062);
      localObject1 = c.j(paramVarArgs);
      ((Path)localObject1).moveTo(49.0F, 40.87935F);
      ((Path)localObject1).cubicTo(51.016678F, 42.67975F, 55.407413F, 46.634834F, 56.0F, 47.0F);
      ((Path)localObject1).cubicTo(56.36772F, 47.168457F, 57.0F, 46.719242F, 57.0F, 46.0F);
      ((Path)localObject1).cubicTo(57.0F, 45.650093F, 57.0F, 32.528694F, 57.0F, 32.0F);
      ((Path)localObject1).cubicTo(57.0F, 31.189203F, 56.300804F, 30.866331F, 56.0F, 31.0F);
      ((Path)localObject1).cubicTo(55.26521F, 31.426785F, 50.978527F, 35.26523F, 49.0F, 37.070236F);
      ((Path)localObject1).lineTo(49.0F, 40.87935F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 1);
      localCanvas.drawPath((Path)localObject1, localPaint);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/lu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */