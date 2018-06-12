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

public final class yg
  extends c
{
  private final int height = 93;
  private final int width = 93;
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 93;
      return 93;
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
      localPaint1.setColor(-1);
      localCanvas.save();
      localPaint2 = c.a(localPaint1, paramVarArgs);
      Path localPath = c.j(paramVarArgs);
      localPath.moveTo(79.564964F, 14.00827F);
      localPath.cubicTo(98.37848F, 31.740889F, 98.37848F, 61.25771F, 79.564964F, 78.99145F);
      localPath.cubicTo(61.702847F, 97.66952F, 31.972158F, 97.66952F, 14.110418F, 78.99145F);
      localPath.cubicTo(-4.7034726F, 61.25771F, -4.7034726F, 31.740889F, 14.110418F, 14.00827F);
      localPath.cubicTo(31.970652F, -4.669423F, 61.702847F, -4.669423F, 79.564964F, 14.00827F);
      localPath.close();
      localPath.moveTo(87.011604F, 47.88731F);
      localPath.cubicTo(87.011604F, 25.044458F, 69.258606F, 7.65122F, 48.775578F, 7.65122F);
      localPath.cubicTo(25.459192F, 7.65122F, 7.7072563F, 25.044458F, 7.7072563F, 47.88731F);
      localPath.cubicTo(7.7072563F, 67.95526F, 25.460253F, 85.3485F, 45.94328F, 85.3485F);
      localPath.cubicTo(69.258606F, 85.3485F, 87.011604F, 67.95526F, 87.011604F, 47.88731F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, localPaint2);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 23.0F, 0.0F, 1.0F, 29.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.j(paramVarArgs);
      ((Path)localObject2).moveTo(1.0201076F, 10.956513F);
      ((Path)localObject2).lineTo(10.898551F, 10.956513F);
      ((Path)localObject2).lineTo(23.47826F, 41.739132F);
      ((Path)localObject2).lineTo(0.61864334F, 11.767624F);
      ((Path)localObject2).cubicTo(0.4495329F, 11.545901F, 0.4921835F, 11.229069F, 0.7139061F, 11.059958F);
      ((Path)localObject2).cubicTo(0.80188197F, 10.992858F, 0.90946317F, 10.956513F, 1.0201076F, 10.956513F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.j(paramVarArgs);
      ((Path)localObject2).moveTo(45.936413F, 10.956513F);
      ((Path)localObject2).lineTo(36.289856F, 10.956513F);
      ((Path)localObject2).lineTo(23.47826F, 41.739132F);
      ((Path)localObject2).lineTo(46.33788F, 11.767624F);
      ((Path)localObject2).cubicTo(46.50699F, 11.545901F, 46.464336F, 11.229069F, 46.242615F, 11.059958F);
      ((Path)localObject2).cubicTo(46.15464F, 10.992858F, 46.04706F, 10.956513F, 45.936413F, 10.956513F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.j(paramVarArgs);
      ((Path)localObject2).moveTo(14.347826F, 10.956513F);
      ((Path)localObject2).lineTo(32.608696F, 10.956513F);
      ((Path)localObject2).lineTo(23.47826F, 41.739132F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 1);
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.j(paramVarArgs);
      ((Path)localObject2).moveTo(11.146245F, 7.826087F);
      ((Path)localObject2).lineTo(18.26087F, 0.0F);
      ((Path)localObject2).lineTo(10.837229F, -9.992007E-16F);
      ((Path)localObject2).cubicTo(10.729838F, -1.361002E-15F, 10.625245F, 0.034240846F, 10.538644F, 0.097747825F);
      ((Path)localObject2).lineTo(1.2437316F, 6.914017F);
      ((Path)localObject2).cubicTo(1.0188628F, 7.078921F, 0.97025156F, 7.394894F, 1.1351553F, 7.619763F);
      ((Path)localObject2).cubicTo(1.2302675F, 7.749461F, 1.3814809F, 7.826087F, 1.5423163F, 7.826087F);
      ((Path)localObject2).lineTo(11.146245F, 7.826087F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.j(paramVarArgs);
      ((Path)localObject2).moveTo(20.869566F, 0.0F);
      ((Path)localObject2).lineTo(26.086956F, 0.0F);
      ((Path)localObject2).lineTo(32.608696F, 7.826087F);
      ((Path)localObject2).lineTo(14.347826F, 7.826087F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 1);
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localObject1 = c.j(paramVarArgs);
      ((Path)localObject1).moveTo(36.32361F, 7.826087F);
      ((Path)localObject1).lineTo(28.695652F, 0.0F);
      ((Path)localObject1).lineTo(36.386032F, 1.2212453E-15F);
      ((Path)localObject1).cubicTo(36.49554F, 1.241362E-15F, 36.60208F, 0.03560397F, 36.68959F, 0.101443335F);
      ((Path)localObject1).lineTo(45.749187F, 6.9177127F);
      ((Path)localObject1).cubicTo(45.972015F, 7.085364F, 46.016747F, 7.40191F, 45.849094F, 7.6247377F);
      ((Path)localObject1).cubicTo(45.753708F, 7.7515154F, 45.604282F, 7.826087F, 45.44563F, 7.826087F);
      ((Path)localObject1).lineTo(36.32361F, 7.826087F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/yg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */