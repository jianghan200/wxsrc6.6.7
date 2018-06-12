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

public final class gw
  extends c
{
  private final int height = 17;
  private final int width = 17;
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 17;
      return 17;
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
      c.a(localPaint2, paramVarArgs).setStrokeWidth(1.0F);
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-11048043);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 2.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.j(paramVarArgs);
      ((Path)localObject2).moveTo(0.37097725F, 3.9374971F);
      ((Path)localObject2).lineTo(3.945679F, 3.9374971F);
      ((Path)localObject2).lineTo(8.5F, 15.0F);
      ((Path)localObject2).lineTo(0.22602811F, 4.231666F);
      ((Path)localObject2).cubicTo(0.16451833F, 4.1516128F, 0.17955074F, 4.0368533F, 0.25960392F, 3.9753437F);
      ((Path)localObject2).cubicTo(0.2915445F, 3.9508018F, 0.33069694F, 3.9374971F, 0.37097725F, 3.9374971F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.j(paramVarArgs);
      ((Path)localObject2).moveTo(16.629023F, 3.9374971F);
      ((Path)localObject2).lineTo(13.138271F, 3.9374971F);
      ((Path)localObject2).lineTo(8.5F, 15.0F);
      ((Path)localObject2).lineTo(16.773972F, 4.231666F);
      ((Path)localObject2).cubicTo(16.835482F, 4.1516128F, 16.82045F, 4.0368533F, 16.740396F, 3.9753437F);
      ((Path)localObject2).cubicTo(16.708456F, 3.9508018F, 16.669304F, 3.9374971F, 16.629023F, 3.9374971F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.j(paramVarArgs);
      ((Path)localObject2).moveTo(5.1944447F, 3.9374971F);
      ((Path)localObject2).lineTo(11.805555F, 3.9374971F);
      ((Path)localObject2).lineTo(8.5F, 15.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 1);
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.j(paramVarArgs);
      ((Path)localObject2).moveTo(4.0353537F, 2.8125F);
      ((Path)localObject2).lineTo(6.611111F, 0.0F);
      ((Path)localObject2).lineTo(3.9231226F, 5.828671E-16F);
      ((Path)localObject2).cubicTo(3.8844628F, 6.929792E-16F, 3.8467984F, 0.012256962F, 3.815543F, 0.035009228F);
      ((Path)localObject2).lineTo(0.4541331F, 2.4819179F);
      ((Path)localObject2).cubicTo(0.37251288F, 2.5413325F, 0.35451177F, 2.655664F, 0.41392648F, 2.7372842F);
      ((Path)localObject2).cubicTo(0.4483286F, 2.7845438F, 0.50325805F, 2.8125F, 0.5617129F, 2.8125F);
      ((Path)localObject2).lineTo(4.0353537F, 2.8125F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.j(paramVarArgs);
      ((Path)localObject2).moveTo(7.5555553F, 0.0F);
      ((Path)localObject2).lineTo(9.444445F, 0.0F);
      ((Path)localObject2).lineTo(11.805555F, 2.8125F);
      ((Path)localObject2).lineTo(5.1944447F, 2.8125F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 1);
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localObject1 = c.j(paramVarArgs);
      ((Path)localObject1).moveTo(13.150493F, 2.8125F);
      ((Path)localObject1).lineTo(10.388889F, 0.0F);
      ((Path)localObject1).lineTo(13.17345F, -2.7755576E-17F);
      ((Path)localObject1).cubicTo(13.212875F, -2.0513277E-17F, 13.251245F, 0.012746517F, 13.282832F, 0.036337905F);
      ((Path)localObject1).lineTo(16.559143F, 2.4832466F);
      ((Path)localObject1).cubicTo(16.64003F, 2.5436563F, 16.65663F, 2.6581998F, 16.596218F, 2.7390862F);
      ((Path)localObject1).cubicTo(16.561712F, 2.7852888F, 16.507427F, 2.8125F, 16.44976F, 2.8125F);
      ((Path)localObject1).lineTo(13.150493F, 2.8125F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/gw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */