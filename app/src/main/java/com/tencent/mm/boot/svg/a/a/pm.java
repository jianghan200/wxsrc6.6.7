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

public final class pm
  extends c
{
  private final int height = 108;
  private final int width = 108;
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 108;
      return 108;
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
      ((Paint)localObject).setColor(-14187817);
      Path localPath = c.j(paramVarArgs);
      localPath.moveTo(0.0F, 0.0F);
      localPath.lineTo(108.0F, 0.0F);
      localPath.lineTo(108.0F, 108.0F);
      localPath.lineTo(0.0F, 108.0F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 1);
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-1);
      localObject = c.j(paramVarArgs);
      ((Path)localObject).moveTo(44.842228F, 55.012318F);
      ((Path)localObject).cubicTo(48.8724F, 61.21774F, 42.65363F, 63.91184F, 39.652912F, 65.62255F);
      ((Path)localObject).cubicTo(28.882536F, 71.76532F, 24.0F, 74.14615F, 24.0F, 77.34148F);
      ((Path)localObject).lineTo(24.0F, 81.33677F);
      ((Path)localObject).cubicTo(24.0F, 82.823204F, 25.016039F, 84.0F, 26.608969F, 84.0F);
      ((Path)localObject).lineTo(81.39103F, 84.0F);
      ((Path)localObject).cubicTo(82.98396F, 84.0F, 84.0F, 82.823204F, 84.0F, 81.33677F);
      ((Path)localObject).lineTo(84.0F, 77.34148F);
      ((Path)localObject).cubicTo(84.0F, 74.14615F, 79.11746F, 71.76532F, 68.347084F, 65.62255F);
      ((Path)localObject).cubicTo(65.346375F, 63.91184F, 59.1276F, 61.21774F, 63.157772F, 55.012318F);
      ((Path)localObject).cubicTo(66.19963F, 50.327835F, 68.79518F, 48.31566F, 68.79518F, 40.414963F);
      ((Path)localObject).cubicTo(68.79518F, 32.215527F, 62.99678F, 24.0F, 54.0F, 24.0F);
      ((Path)localObject).cubicTo(45.00322F, 24.0F, 39.20482F, 32.215527F, 39.20482F, 40.414963F);
      ((Path)localObject).cubicTo(39.20482F, 48.31566F, 41.80037F, 50.327835F, 44.842228F, 55.012318F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(49.0F, 76.71384F);
      ((Path)localObject).lineTo(54.0F, 83.0F);
      ((Path)localObject).lineTo(59.0F, 76.71384F);
      ((Path)localObject).lineTo(54.0F, 61.0F);
      ((Path)localObject).lineTo(49.0F, 76.71384F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/pm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */