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

public final class zz
  extends c
{
  private final int height = 240;
  private final int width = 240;
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 240;
      return 240;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject1 = c.f(paramVarArgs);
      Object localObject2 = c.e(paramVarArgs);
      Paint localPaint1 = c.i(paramVarArgs);
      localPaint1.setFlags(385);
      localPaint1.setStyle(Paint.Style.FILL);
      Paint localPaint2 = c.i(paramVarArgs);
      localPaint2.setFlags(385);
      localPaint2.setStyle(Paint.Style.STROKE);
      localPaint1.setColor(-16777216);
      localPaint2.setStrokeWidth(1.0F);
      localPaint2.setStrokeCap(Paint.Cap.BUTT);
      localPaint2.setStrokeJoin(Paint.Join.MITER);
      localPaint2.setStrokeMiter(4.0F);
      localPaint2.setPathEffect(null);
      c.a(localPaint2, paramVarArgs).setStrokeWidth(1.0F);
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-15028967);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 68.0F, 0.0F, 1.0F, 85.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.j(paramVarArgs);
      ((Path)localObject2).moveTo(13.540069F, 40.015434F);
      ((Path)localObject2).cubicTo(12.961421F, 39.417805F, 12.934421F, 38.432583F, 13.489049F, 37.804356F);
      ((Path)localObject2).lineTo(15.936921F, 35.03166F);
      ((Path)localObject2).cubicTo(16.48739F, 34.408142F, 17.474325F, 34.316227F, 18.125168F, 34.814026F);
      ((Path)localObject2).lineTo(37.615322F, 49.72111F);
      ((Path)localObject2).cubicTo(38.273388F, 50.224434F, 39.324657F, 50.21021F, 39.97293F, 49.68157F);
      ((Path)localObject2).lineTo(89.95811F, 8.920589F);
      ((Path)localObject2).cubicTo(90.60211F, 8.395429F, 91.602684F, 8.439274F, 92.19417F, 9.019729F);
      ((Path)localObject2).lineTo(93.4955F, 10.296785F);
      ((Path)localObject2).cubicTo(94.08643F, 10.876699F, 94.083435F, 11.820237F, 93.50139F, 12.391867F);
      ((Path)localObject2).lineTo(39.869316F, 65.06429F);
      ((Path)localObject2).cubicTo(39.28163F, 65.64146F, 38.337345F, 65.62612F, 37.75749F, 65.027245F);
      ((Path)localObject2).lineTo(13.540069F, 40.015434F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/zz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */