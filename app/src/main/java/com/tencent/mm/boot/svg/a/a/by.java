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

public final class by
  extends c
{
  private final int height = 90;
  private final int width = 90;
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 90;
      return 90;
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
      localPaint.setColor(-2049700);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.j(paramVarArgs);
      ((Path)localObject).moveTo(86.25F, 32.25337F);
      ((Path)localObject).lineTo(86.25F, 28.75F);
      ((Path)localObject).cubicTo(86.25F, 26.678932F, 84.57107F, 25.0F, 82.5F, 25.0F);
      ((Path)localObject).lineTo(7.5F, 25.0F);
      ((Path)localObject).cubicTo(5.428932F, 25.0F, 3.75F, 26.678932F, 3.75F, 28.75F);
      ((Path)localObject).lineTo(3.75F, 32.25337F);
      ((Path)localObject).cubicTo(4.8531504F, 31.615229F, 6.133923F, 31.25F, 7.5F, 31.25F);
      ((Path)localObject).lineTo(82.5F, 31.25F);
      ((Path)localObject).cubicTo(83.86607F, 31.25F, 85.14685F, 31.615229F, 86.25F, 32.25337F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(3.75F, 10.0F);
      ((Path)localObject).lineTo(29.6967F, 10.0F);
      ((Path)localObject).cubicTo(30.691261F, 10.0F, 31.645088F, 10.395088F, 32.34835F, 11.09835F);
      ((Path)localObject).lineTo(37.65165F, 16.40165F);
      ((Path)localObject).cubicTo(38.35491F, 17.104912F, 39.30874F, 17.5F, 40.303303F, 17.5F);
      ((Path)localObject).lineTo(86.25F, 17.5F);
      ((Path)localObject).cubicTo(88.32107F, 17.5F, 90.0F, 19.178932F, 90.0F, 21.25F);
      ((Path)localObject).lineTo(90.0F, 76.25F);
      ((Path)localObject).cubicTo(90.0F, 78.32107F, 88.32107F, 80.0F, 86.25F, 80.0F);
      ((Path)localObject).lineTo(3.75F, 80.0F);
      ((Path)localObject).cubicTo(1.6789322F, 80.0F, 2.5363266E-16F, 78.32107F, 0.0F, 76.25F);
      ((Path)localObject).lineTo(-8.881784E-16F, 13.75F);
      ((Path)localObject).cubicTo(-1.1418111E-15F, 11.678932F, 1.6789322F, 10.0F, 3.75F, 10.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/by.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */