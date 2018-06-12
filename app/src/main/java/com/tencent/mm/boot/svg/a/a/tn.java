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

public final class tn
  extends c
{
  private final int height = 46;
  private final int width = 66;
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 66;
      return 46;
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
      localPaint.setColor(-4547478);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.j(paramVarArgs);
      ((Path)localObject).moveTo(12.0F, 31.470589F);
      ((Path)localObject).lineTo(12.0F, 46.0F);
      ((Path)localObject).lineTo(66.0F, 46.0F);
      ((Path)localObject).lineTo(66.0F, 0.0F);
      ((Path)localObject).lineTo(12.0F, 0.0F);
      ((Path)localObject).lineTo(12.0F, 14.529412F);
      ((Path)localObject).lineTo(0.0F, 23.0F);
      ((Path)localObject).lineTo(12.0F, 31.470589F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(27.0F, 29.0F);
      ((Path)localObject).cubicTo(30.31371F, 29.0F, 33.0F, 26.31371F, 33.0F, 23.0F);
      ((Path)localObject).cubicTo(33.0F, 19.68629F, 30.31371F, 17.0F, 27.0F, 17.0F);
      ((Path)localObject).cubicTo(23.68629F, 17.0F, 21.0F, 19.68629F, 21.0F, 23.0F);
      ((Path)localObject).cubicTo(21.0F, 26.31371F, 23.68629F, 29.0F, 27.0F, 29.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(51.0F, 29.0F);
      ((Path)localObject).cubicTo(54.31371F, 29.0F, 57.0F, 26.31371F, 57.0F, 23.0F);
      ((Path)localObject).cubicTo(57.0F, 19.68629F, 54.31371F, 17.0F, 51.0F, 17.0F);
      ((Path)localObject).cubicTo(47.68629F, 17.0F, 45.0F, 19.68629F, 45.0F, 23.0F);
      ((Path)localObject).cubicTo(45.0F, 26.31371F, 47.68629F, 29.0F, 51.0F, 29.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/tn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */