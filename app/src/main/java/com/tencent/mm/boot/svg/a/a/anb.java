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

public final class anb
  extends c
{
  private final int height = 60;
  private final int width = 60;
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 60;
      return 60;
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
      localCanvas.save();
      localPaint2 = c.a(localPaint1, paramVarArgs);
      localPaint2.setColor(-723724);
      Path localPath = c.j(paramVarArgs);
      localPath.moveTo(0.0F, 30.0F);
      localPath.cubicTo(0.0F, 13.4314575F, 13.4314575F, 0.0F, 30.0F, 0.0F);
      localPath.lineTo(30.0F, 0.0F);
      localPath.cubicTo(46.568542F, 0.0F, 60.0F, 13.4314575F, 60.0F, 30.0F);
      localPath.lineTo(60.0F, 30.0F);
      localPath.cubicTo(60.0F, 46.568542F, 46.568542F, 60.0F, 30.0F, 60.0F);
      localPath.lineTo(30.0F, 60.0F);
      localPath.cubicTo(13.4314575F, 60.0F, 0.0F, 46.568542F, 0.0F, 30.0F);
      localPath.lineTo(0.0F, 30.0F);
      localPath.close();
      localCanvas.drawPath(localPath, localPaint2);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-363518);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 11.0F, 0.0F, 1.0F, 13.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.j(paramVarArgs);
      ((Path)localObject2).moveTo(24.475742F, 18.70696F);
      ((Path)localObject2).cubicTo(23.12304F, 21.028156F, 19.575186F, 21.698137F, 16.551128F, 20.203268F);
      ((Path)localObject2).cubicTo(13.527069F, 18.70792F, 12.171762F, 15.61459F, 13.523946F, 13.292914F);
      ((Path)localObject2).cubicTo(14.876649F, 10.971719F, 18.425022F, 10.301737F, 21.449081F, 11.797086F);
      ((Path)localObject2).cubicTo(24.473139F, 13.291956F, 25.828445F, 16.385765F, 24.475742F, 18.70696F);
      ((Path)localObject2).moveTo(25.103931F, 10.635292F);
      ((Path)localObject2).cubicTo(18.385532F, 4.646929F, 8.63892F, 4.4326096F, 3.3347385F, 10.156823F);
      ((Path)localObject2).cubicTo(-1.969443F, 15.880552F, -0.82257956F, 25.375916F, 5.89582F, 31.364279F);
      ((Path)localObject2).cubicTo(12.614714F, 37.353127F, 22.360832F, 37.567448F, 27.665506F, 31.843233F);
      ((Path)localObject2).cubicTo(32.969196F, 26.119503F, 31.822824F, 16.62414F, 25.103931F, 10.635292F);
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.j(paramVarArgs);
      ((Path)localObject2).moveTo(30.503237F, 0.13884006F);
      ((Path)localObject2).cubicTo(33.136944F, -0.56668025F, 35.94263F, 1.4859271F, 36.76932F, 4.722692F);
      ((Path)localObject2).cubicTo(37.59601F, 7.959457F, 36.13047F, 11.156124F, 33.49676F, 11.861136F);
      ((Path)localObject2).cubicTo(30.86256F, 12.566657F, 28.05737F, 10.514557F, 27.230679F, 7.2772846F);
      ((Path)localObject2).cubicTo(26.40399F, 4.0405197F, 27.86953F, 0.84486794F, 30.503237F, 0.13884006F);
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/anb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */