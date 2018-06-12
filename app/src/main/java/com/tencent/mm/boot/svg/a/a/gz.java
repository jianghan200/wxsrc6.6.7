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

public final class gz
  extends c
{
  private final int height = 120;
  private final int width = 120;
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 120;
      return 120;
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
      ((Paint)localObject).setColor(-564640);
      Path localPath = c.j(paramVarArgs);
      localPath.moveTo(115.8F, 60.68889F);
      localPath.cubicTo(115.8F, 29.181868F, 90.81813F, 4.2F, 59.31111F, 4.2F);
      localPath.cubicTo(29.181868F, 4.2F, 4.2F, 29.181868F, 4.2F, 60.68889F);
      localPath.cubicTo(4.2F, 90.81813F, 29.181868F, 115.8F, 59.31111F, 115.8F);
      localPath.cubicTo(90.81813F, 115.8F, 115.8F, 90.81813F, 115.8F, 60.68889F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-1);
      localObject = c.j(paramVarArgs);
      ((Path)localObject).moveTo(57.790684F, 34.2F);
      ((Path)localObject).lineTo(62.209316F, 34.2F);
      ((Path)localObject).cubicTo(63.301052F, 34.2F, 64.16696F, 35.09441F, 64.12621F, 36.197716F);
      ((Path)localObject).lineTo(62.836727F, 71.10812F);
      ((Path)localObject).cubicTo(62.816696F, 71.650375F, 62.35176F, 72.10244F, 61.798832F, 72.10244F);
      ((Path)localObject).lineTo(58.201168F, 72.10244F);
      ((Path)localObject).cubicTo(57.639423F, 72.10244F, 57.183556F, 71.65727F, 57.163273F, 71.10812F);
      ((Path)localObject).lineTo(55.87379F, 36.197716F);
      ((Path)localObject).cubicTo(55.833225F, 35.099537F, 56.691257F, 34.2F, 57.790684F, 34.2F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(60.0F, 85.8F);
      ((Path)localObject).cubicTo(57.680405F, 85.8F, 55.8F, 83.91959F, 55.8F, 81.6F);
      ((Path)localObject).cubicTo(55.8F, 79.2804F, 57.680405F, 77.4F, 60.0F, 77.4F);
      ((Path)localObject).cubicTo(62.319595F, 77.4F, 64.2F, 79.2804F, 64.2F, 81.6F);
      ((Path)localObject).cubicTo(64.2F, 83.91959F, 62.319595F, 85.8F, 60.0F, 85.8F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/gz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */