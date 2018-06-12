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

public final class wa
  extends c
{
  private final int height = 13;
  private final int width = 22;
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 22;
      return 13;
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
      ((Paint)localObject3).setColor(-1);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -1097.0F, 0.0F, 1.0F, -2690.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject4 = c.a((float[])localObject2, 1.0F, 0.0F, 988.0F, 0.0F, 1.0F, 2659.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject4);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((Paint)localObject3, paramVarArgs);
      localObject3 = c.a((float[])localObject4, 0.70710677F, 0.70710677F, 11.626389F, -0.70710677F, 0.70710677F, 94.94632F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localObject1 = c.j(paramVarArgs);
      ((Path)localObject1).moveTo(115.736046F, 38.224194F);
      ((Path)localObject1).lineTo(115.736046F, 35.24749F);
      ((Path)localObject1).lineTo(115.736046F, 27.069532F);
      ((Path)localObject1).cubicTo(115.736046F, 26.204807F, 115.03649F, 25.504086F, 114.173546F, 25.504086F);
      ((Path)localObject1).cubicTo(113.30458F, 25.504086F, 112.611046F, 26.20479F, 112.611046F, 27.069153F);
      ((Path)localObject1).lineTo(112.611046F, 39.180725F);
      ((Path)localObject1).cubicTo(112.53231F, 39.367065F, 112.48876F, 39.571815F, 112.48876F, 39.786694F);
      ((Path)localObject1).cubicTo(112.48876F, 40.57306F, 113.06137F, 41.215767F, 113.80943F, 41.33084F);
      ((Path)localObject1).cubicTo(113.92626F, 41.358826F, 114.04818F, 41.37365F, 114.173546F, 41.37365F);
      ((Path)localObject1).cubicTo(114.268715F, 41.37365F, 114.36178F, 41.365265F, 114.45206F, 41.349194F);
      ((Path)localObject1).lineTo(118.61492F, 41.349194F);
      ((Path)localObject1).lineTo(126.79288F, 41.349194F);
      ((Path)localObject1).cubicTo(127.65761F, 41.349194F, 128.35832F, 40.64964F, 128.35832F, 39.786694F);
      ((Path)localObject1).cubicTo(128.35832F, 38.917732F, 127.65762F, 38.224194F, 126.79326F, 38.224194F);
      ((Path)localObject1).lineTo(115.736046F, 38.224194F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/wa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */