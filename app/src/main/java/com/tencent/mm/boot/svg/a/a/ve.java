package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.c;

public final class ve
  extends c
{
  private final int height = 216;
  private final int width = 216;
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 216;
      return 216;
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
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-5066062);
      localObject = c.j(paramVarArgs);
      ((Path)localObject).moveTo(0.0F, 40.0F);
      ((Path)localObject).cubicTo(0.0F, 17.90861F, 17.90861F, 0.0F, 40.0F, 0.0F);
      ((Path)localObject).lineTo(176.0F, 0.0F);
      ((Path)localObject).cubicTo(198.09138F, 0.0F, 216.0F, 17.90861F, 216.0F, 40.0F);
      ((Path)localObject).lineTo(216.0F, 176.0F);
      ((Path)localObject).cubicTo(216.0F, 198.09138F, 198.09138F, 216.0F, 176.0F, 216.0F);
      ((Path)localObject).lineTo(40.0F, 216.0F);
      ((Path)localObject).cubicTo(17.90861F, 216.0F, 0.0F, 198.09138F, 0.0F, 176.0F);
      ((Path)localObject).lineTo(0.0F, 40.0F);
      ((Path)localObject).close();
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/ve.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */