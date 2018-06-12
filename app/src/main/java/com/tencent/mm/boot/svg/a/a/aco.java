package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;

public final class aco
  extends c
{
  private final int height = 72;
  private final int width = 72;
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 72;
      return 72;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      c.f(paramVarArgs);
      c.e(paramVarArgs);
      Paint localPaint = c.i(paramVarArgs);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.FILL);
      Object localObject = c.i(paramVarArgs);
      ((Paint)localObject).setFlags(385);
      ((Paint)localObject).setStyle(Paint.Style.STROKE);
      localPaint.setColor(-16777216);
      ((Paint)localObject).setStrokeWidth(1.0F);
      ((Paint)localObject).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject).setStrokeMiter(4.0F);
      ((Paint)localObject).setPathEffect(null);
      c.a((Paint)localObject, paramVarArgs).setStrokeWidth(1.0F);
      localCanvas.save();
      localObject = c.a(localPaint, paramVarArgs);
      ((Paint)localObject).setColor(419430400);
      Path localPath = c.j(paramVarArgs);
      localPath.moveTo(36.0F, 1.5F);
      localPath.cubicTo(55.053825F, 1.5F, 70.5F, 16.946175F, 70.5F, 36.0F);
      localPath.cubicTo(70.5F, 55.053825F, 55.053825F, 70.5F, 36.0F, 70.5F);
      localPath.cubicTo(16.946175F, 70.5F, 1.5F, 55.053825F, 1.5F, 36.0F);
      localPath.cubicTo(1.5F, 16.946175F, 16.946175F, 1.5F, 36.0F, 1.5F);
      localPath.close();
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-1);
      localObject = c.j(paramVarArgs);
      ((Path)localObject).moveTo(36.0F, 72.0F);
      ((Path)localObject).cubicTo(55.88225F, 72.0F, 72.0F, 55.88225F, 72.0F, 36.0F);
      ((Path)localObject).cubicTo(72.0F, 16.117748F, 55.88225F, 0.0F, 36.0F, 0.0F);
      ((Path)localObject).cubicTo(16.117748F, 0.0F, 0.0F, 16.117748F, 0.0F, 36.0F);
      ((Path)localObject).cubicTo(0.0F, 55.88225F, 16.117748F, 72.0F, 36.0F, 72.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(36.0F, 67.5F);
      ((Path)localObject).cubicTo(53.39697F, 67.5F, 67.5F, 53.39697F, 67.5F, 36.0F);
      ((Path)localObject).cubicTo(67.5F, 18.603031F, 53.39697F, 4.5F, 36.0F, 4.5F);
      ((Path)localObject).cubicTo(18.603031F, 4.5F, 4.5F, 18.603031F, 4.5F, 36.0F);
      ((Path)localObject).cubicTo(4.5F, 53.39697F, 18.603031F, 67.5F, 36.0F, 67.5F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(27.0F, 48.223015F);
      ((Path)localObject).cubicTo(27.0F, 49.87877F, 28.177517F, 50.57029F, 29.625708F, 49.769974F);
      ((Path)localObject).lineTo(51.37429F, 37.75102F);
      ((Path)localObject).cubicTo(52.82443F, 36.949627F, 52.822483F, 35.64924F, 51.37429F, 34.848923F);
      ((Path)localObject).lineTo(29.625708F, 22.829967F);
      ((Path)localObject).cubicTo(28.17557F, 22.028574F, 27.0F, 22.719145F, 27.0F, 24.376926F);
      ((Path)localObject).lineTo(27.0F, 48.223015F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/aco.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */