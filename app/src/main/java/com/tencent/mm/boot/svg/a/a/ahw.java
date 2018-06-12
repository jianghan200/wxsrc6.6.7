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

public final class ahw
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
      localPaint.setColor(-1);
      localCanvas.save();
      localObject = c.a(localPaint, paramVarArgs);
      Path localPath = c.j(paramVarArgs);
      localPath.moveTo(59.0F, 65.0F);
      localPath.lineTo(73.0F, 65.0F);
      localPath.lineTo(73.0F, 56.0F);
      localPath.lineTo(78.0F, 56.0F);
      localPath.lineTo(78.0F, 40.0F);
      localPath.lineTo(73.0F, 40.0F);
      localPath.lineTo(73.0F, 31.0F);
      localPath.lineTo(59.0F, 31.0F);
      localPath.lineTo(59.0F, 25.0F);
      localPath.lineTo(38.0F, 25.0F);
      localPath.lineTo(38.0F, 31.0F);
      localPath.lineTo(23.0F, 31.0F);
      localPath.lineTo(23.0F, 40.0F);
      localPath.lineTo(18.0F, 40.0F);
      localPath.lineTo(18.0F, 56.0F);
      localPath.lineTo(23.0F, 56.0F);
      localPath.lineTo(23.0F, 65.0F);
      localPath.lineTo(38.0F, 65.0F);
      localPath.lineTo(38.0F, 71.0F);
      localPath.lineTo(59.0F, 71.0F);
      localPath.lineTo(59.0F, 65.0F);
      localPath.close();
      localPath.moveTo(18.0F, 28.000444F);
      localPath.cubicTo(18.0F, 26.343344F, 19.337309F, 25.0F, 20.995937F, 25.0F);
      localPath.lineTo(75.00406F, 25.0F);
      localPath.cubicTo(76.658676F, 25.0F, 78.0F, 26.35178F, 78.0F, 28.000444F);
      localPath.lineTo(78.0F, 67.99956F);
      localPath.cubicTo(78.0F, 69.656654F, 76.66269F, 71.0F, 75.00406F, 71.0F);
      localPath.lineTo(20.995937F, 71.0F);
      localPath.cubicTo(19.341328F, 71.0F, 18.0F, 69.64822F, 18.0F, 67.99956F);
      localPath.lineTo(18.0F, 28.000444F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.j(paramVarArgs);
      ((Path)localObject).moveTo(37.75862F, 45.672413F);
      ((Path)localObject).lineTo(36.0F, 49.189655F);
      ((Path)localObject).lineTo(43.91379F, 58.86207F);
      ((Path)localObject).lineTo(61.5F, 37.75862F);
      ((Path)localObject).lineTo(59.74138F, 36.0F);
      ((Path)localObject).lineTo(43.91379F, 50.948277F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 1);
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/ahw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */