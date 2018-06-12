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

public final class ls
  extends c
{
  private final int height = 115;
  private final int width = 115;
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 115;
      return 115;
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
      localCanvas.save();
      localPaint2 = c.a(localPaint2, paramVarArgs);
      localPaint2.setStrokeWidth(1.0F);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -121.0F, 0.0F, 1.0F, -1345.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint2, paramVarArgs);
      ((Paint)localObject1).setColor(-5066062);
      ((Paint)localObject1).setStrokeWidth(6.0F);
      localObject2 = c.j(paramVarArgs);
      ((Path)localObject2).moveTo(178.3913F, 1348.0F);
      ((Path)localObject2).cubicTo(208.43079F, 1348.0F, 232.7826F, 1372.3518F, 232.7826F, 1402.3914F);
      ((Path)localObject2).cubicTo(232.7826F, 1432.4309F, 208.43079F, 1456.7827F, 178.3913F, 1456.7827F);
      ((Path)localObject2).cubicTo(148.3518F, 1456.7827F, 123.99999F, 1432.4309F, 123.99999F, 1402.3914F);
      ((Path)localObject2).cubicTo(123.99999F, 1372.3518F, 148.3518F, 1348.0F, 178.3913F, 1348.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      ((Paint)localObject1).setColor(-5066062);
      localObject2 = c.j(paramVarArgs);
      ((Path)localObject2).moveTo(159.752F, 1388.8737F);
      ((Path)localObject2).lineTo(188.09235F, 1388.8737F);
      ((Path)localObject2).cubicTo(189.68294F, 1388.8737F, 190.97235F, 1390.163F, 190.97235F, 1391.7535F);
      ((Path)localObject2).lineTo(190.97235F, 1413.779F);
      ((Path)localObject2).cubicTo(190.97235F, 1415.3696F, 189.68294F, 1416.659F, 188.09235F, 1416.659F);
      ((Path)localObject2).lineTo(159.752F, 1416.659F);
      ((Path)localObject2).cubicTo(158.16142F, 1416.659F, 156.872F, 1415.3696F, 156.872F, 1413.779F);
      ((Path)localObject2).lineTo(156.872F, 1391.7535F);
      ((Path)localObject2).cubicTo(156.872F, 1390.163F, 158.16142F, 1388.8737F, 159.752F, 1388.8737F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-5066062);
      localObject1 = c.j(paramVarArgs);
      ((Path)localObject1).moveTo(191.872F, 1405.0277F);
      ((Path)localObject1).lineTo(191.872F, 1399.6082F);
      ((Path)localObject1).cubicTo(194.9589F, 1396.7587F, 200.73586F, 1391.5128F, 201.40533F, 1390.917F);
      ((Path)localObject1).cubicTo(202.31215F, 1390.7258F, 203.312F, 1391.1876F, 203.312F, 1391.8704F);
      ((Path)localObject1).cubicTo(203.312F, 1393.103F, 203.312F, 1411.8667F, 203.312F, 1412.8438F);
      ((Path)localObject1).cubicTo(203.312F, 1413.3955F, 202.40784F, 1414.038F, 201.40533F, 1413.797F);
      ((Path)localObject1).cubicTo(200.94202F, 1413.2876F, 195.03276F, 1407.8926F, 191.872F, 1405.0277F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/ls.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */