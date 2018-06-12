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

public final class lt
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
      Matrix localMatrix = c.f(paramVarArgs);
      float[] arrayOfFloat = c.e(paramVarArgs);
      Object localObject1 = c.i(paramVarArgs);
      ((Paint)localObject1).setFlags(385);
      ((Paint)localObject1).setStyle(Paint.Style.FILL);
      Object localObject2 = c.i(paramVarArgs);
      ((Paint)localObject2).setFlags(385);
      ((Paint)localObject2).setStyle(Paint.Style.STROKE);
      ((Paint)localObject1).setColor(-16777216);
      ((Paint)localObject2).setStrokeWidth(1.0F);
      ((Paint)localObject2).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject2).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject2).setStrokeMiter(4.0F);
      ((Paint)localObject2).setPathEffect(null);
      localObject2 = c.a((Paint)localObject2, paramVarArgs);
      ((Paint)localObject2).setStrokeWidth(1.0F);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, -569.0F, 0.0F, 1.0F, -597.0F);
      localMatrix.reset();
      localMatrix.setValues(arrayOfFloat);
      localCanvas.concat(localMatrix);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 569.0F, 0.0F, 1.0F, 597.0F);
      localMatrix.reset();
      localMatrix.setValues(arrayOfFloat);
      localCanvas.concat(localMatrix);
      Object localObject3 = c.a((Paint)localObject1, paramVarArgs);
      ((Paint)localObject3).setColor(1275068416);
      localCanvas.save();
      localObject3 = c.a((Paint)localObject3, paramVarArgs);
      Path localPath = c.j(paramVarArgs);
      localPath.moveTo(38.926277F, 0.0F);
      localPath.cubicTo(60.424667F, 0.0F, 77.852554F, 17.427887F, 77.852554F, 38.926277F);
      localPath.cubicTo(77.852554F, 60.424667F, 60.424667F, 77.852554F, 38.926277F, 77.852554F);
      localPath.cubicTo(17.427887F, 77.852554F, 0.0F, 60.424667F, 0.0F, 38.926277F);
      localPath.cubicTo(0.0F, 17.427887F, 17.427887F, 0.0F, 38.926277F, 0.0F);
      localPath.close();
      localCanvas.drawPath(localPath, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a((Paint)localObject2, paramVarArgs);
      ((Paint)localObject2).setColor(-1);
      ((Paint)localObject2).setStrokeWidth(4.0F);
      localObject3 = c.j(paramVarArgs);
      ((Path)localObject3).moveTo(38.926277F, 2.0F);
      ((Path)localObject3).cubicTo(59.3201F, 2.0F, 75.852554F, 18.532457F, 75.852554F, 38.926277F);
      ((Path)localObject3).cubicTo(75.852554F, 59.3201F, 59.3201F, 75.852554F, 38.926277F, 75.852554F);
      ((Path)localObject3).cubicTo(18.532457F, 75.852554F, 2.0F, 59.3201F, 2.0F, 38.926277F);
      ((Path)localObject3).cubicTo(2.0F, 18.532457F, 18.532457F, 2.0F, 38.926277F, 2.0F);
      ((Path)localObject3).close();
      localCanvas.drawPath((Path)localObject3, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a((Paint)localObject1, paramVarArgs);
      ((Paint)localObject2).setColor(-1);
      localObject3 = c.j(paramVarArgs);
      ((Path)localObject3).moveTo(27.0F, 30.0F);
      ((Path)localObject3).lineTo(46.0F, 30.0F);
      ((Path)localObject3).lineTo(46.0F, 30.0F);
      ((Path)localObject3).cubicTo(47.10457F, 30.0F, 48.0F, 30.89543F, 48.0F, 32.0F);
      ((Path)localObject3).lineTo(48.0F, 47.0F);
      ((Path)localObject3).lineTo(48.0F, 47.0F);
      ((Path)localObject3).cubicTo(48.0F, 48.10457F, 47.10457F, 49.0F, 46.0F, 49.0F);
      ((Path)localObject3).lineTo(27.0F, 49.0F);
      ((Path)localObject3).lineTo(27.0F, 49.0F);
      ((Path)localObject3).cubicTo(25.89543F, 49.0F, 25.0F, 48.10457F, 25.0F, 47.0F);
      ((Path)localObject3).lineTo(25.0F, 32.0F);
      ((Path)localObject3).lineTo(25.0F, 32.0F);
      ((Path)localObject3).cubicTo(25.0F, 30.89543F, 25.89543F, 30.0F, 27.0F, 30.0F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject1, paramVarArgs);
      ((Paint)localObject1).setColor(-1);
      localObject2 = c.j(paramVarArgs);
      ((Path)localObject2).moveTo(49.0F, 40.87935F);
      ((Path)localObject2).cubicTo(51.016678F, 42.67975F, 55.407413F, 46.634834F, 56.0F, 47.0F);
      ((Path)localObject2).cubicTo(56.36772F, 47.168457F, 57.0F, 46.719242F, 57.0F, 46.0F);
      ((Path)localObject2).cubicTo(57.0F, 45.650093F, 57.0F, 32.528694F, 57.0F, 32.0F);
      ((Path)localObject2).cubicTo(57.0F, 31.189203F, 56.300804F, 30.866331F, 56.0F, 31.0F);
      ((Path)localObject2).cubicTo(55.26521F, 31.426785F, 50.978527F, 35.26523F, 49.0F, 37.070236F);
      ((Path)localObject2).lineTo(49.0F, 40.87935F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(arrayOfFloat, 1.0F, 0.0F, 90.0F, 0.0F, 1.0F, 200.0F);
      localMatrix.reset();
      localMatrix.setValues((float[])localObject1);
      localCanvas.concat(localMatrix);
      localCanvas.restore();
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/lt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */