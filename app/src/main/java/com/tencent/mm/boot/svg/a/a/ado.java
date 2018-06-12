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

public final class ado
  extends c
{
  private final int height = 38;
  private final int width = 24;
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 24;
      return 38;
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
      localPaint.setColor(-3684404);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.j(paramVarArgs);
      ((Path)localObject).moveTo(24.0F, 18.928122F);
      ((Path)localObject).cubicTo(17.76F, 25.30391F, 11.27F, 31.564438F, 5.0F, 37.856243F);
      ((Path)localObject).cubicTo(3.9782472F, 37.015377F, 0.34215337F, 33.172558F, 0.0F, 32.87516F);
      ((Path)localObject).cubicTo(4.52F, 28.130583F, 10.31F, 23.60038F, 15.0F, 18.928122F);
      ((Path)localObject).cubicTo(10.89F, 14.514881F, 0.0F, 3.9848678F, 0.0F, 3.9848678F);
      ((Path)localObject).cubicTo(0.046293356F, 3.965954F, 3.7586608F, 0.9880148F, 5.0F, 0.0F);
      ((Path)localObject).cubicTo(5.0F, 0.0F, 18.55F, 13.568475F, 24.0F, 18.928122F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/ado.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */