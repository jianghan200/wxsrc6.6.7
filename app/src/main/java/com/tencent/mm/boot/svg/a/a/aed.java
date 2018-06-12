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

public final class aed
  extends c
{
  private final int height = 165;
  private final int width = 165;
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 165;
      return 165;
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
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-4671304);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.j(paramVarArgs);
      ((Path)localObject).moveTo(165.0F, 83.51852F);
      ((Path)localObject).cubicTo(165.0F, 36.935555F, 128.06444F, 0.0F, 81.48148F, 0.0F);
      ((Path)localObject).cubicTo(36.935555F, 0.0F, 0.0F, 36.935555F, 0.0F, 83.51852F);
      ((Path)localObject).cubicTo(0.0F, 128.06444F, 36.935555F, 165.0F, 81.48148F, 165.0F);
      ((Path)localObject).cubicTo(128.06444F, 165.0F, 165.0F, 128.06444F, 165.0F, 83.51852F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(156.0F, 83.40741F);
      ((Path)localObject).cubicTo(156.0F, 41.906223F, 123.09378F, 9.0F, 81.59259F, 9.0F);
      ((Path)localObject).cubicTo(41.906223F, 9.0F, 9.0F, 41.906223F, 9.0F, 83.40741F);
      ((Path)localObject).cubicTo(9.0F, 123.09378F, 41.906223F, 156.0F, 81.59259F, 156.0F);
      ((Path)localObject).cubicTo(123.09378F, 156.0F, 156.0F, 123.09378F, 156.0F, 83.40741F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(81.06782F, 123.30645F);
      ((Path)localObject).cubicTo(79.40914F, 123.30645F, 78.03121F, 121.96418F, 77.99018F, 120.31069F);
      ((Path)localObject).lineTo(76.660355F, 66.71527F);
      ((Path)localObject).cubicTo(76.6193F, 65.06076F, 77.919846F, 63.719513F, 79.586006F, 63.719513F);
      ((Path)localObject).lineTo(85.413994F, 63.719513F);
      ((Path)localObject).cubicTo(87.07084F, 63.719513F, 88.38068F, 65.06178F, 88.339645F, 66.71527F);
      ((Path)localObject).lineTo(87.00982F, 120.31069F);
      ((Path)localObject).cubicTo(86.968765F, 121.9652F, 85.58817F, 123.30645F, 83.93218F, 123.30645F);
      ((Path)localObject).lineTo(81.06782F, 123.30645F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(82.5F, 41.693546F);
      ((Path)localObject).cubicTo(86.41944F, 41.693546F, 89.59677F, 44.87088F, 89.59677F, 48.79032F);
      ((Path)localObject).cubicTo(89.59677F, 52.709763F, 86.41944F, 55.887096F, 82.5F, 55.887096F);
      ((Path)localObject).cubicTo(78.58056F, 55.887096F, 75.40323F, 52.709763F, 75.40323F, 48.79032F);
      ((Path)localObject).cubicTo(75.40323F, 44.87088F, 78.58056F, 41.693546F, 82.5F, 41.693546F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/aed.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */