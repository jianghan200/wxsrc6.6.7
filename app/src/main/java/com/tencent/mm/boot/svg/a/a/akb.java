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

public final class akb
  extends c
{
  private final int height = 54;
  private final int width = 54;
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 54;
      return 54;
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
      localPaint.setColor(-8683387);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.j(paramVarArgs);
      ((Path)localObject).moveTo(22.908676F, 30.950693F);
      ((Path)localObject).cubicTo(27.023159F, 35.1021F, 30.232687F, 36.895073F, 32.456608F, 36.895073F);
      ((Path)localObject).cubicTo(34.680527F, 36.895073F, 37.381214F, 34.49798F, 39.075436F, 34.45544F);
      ((Path)localObject).cubicTo(40.475136F, 34.420296F, 45.419086F, 37.832767F, 45.94186F, 38.32456F);
      ((Path)localObject).cubicTo(46.464634F, 38.816353F, 47.099957F, 39.55505F, 46.986763F, 40.05478F);
      ((Path)localObject).cubicTo(46.87357F, 40.55451F, 44.11331F, 47.862286F, 38.14088F, 46.915455F);
      ((Path)localObject).cubicTo(32.16845F, 45.968628F, 23.842045F, 39.47246F, 19.097456F, 34.797325F);
      ((Path)localObject).lineTo(22.908676F, 30.950693F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(16.985262F, 21.787113F);
      ((Path)localObject).cubicTo(17.054878F, 19.63332F, 19.520647F, 16.662056F, 19.493423F, 14.951664F);
      ((Path)localObject).cubicTo(19.463087F, 13.04565F, 16.725452F, 8.970869F, 15.613527F, 7.9975863F);
      ((Path)localObject).cubicTo(14.5016F, 7.024304F, 14.318393F, 6.923723F, 13.703174F, 7.037072F);
      ((Path)localObject).cubicTo(13.0879545F, 7.150421F, 6.1487045F, 9.55696F, 7.0871115F, 15.582992F);
      ((Path)localObject).cubicTo(8.025518F, 21.609024F, 14.463901F, 30.010153F, 19.097456F, 34.797325F);
      ((Path)localObject).lineTo(22.911219F, 30.946669F);
      ((Path)localObject).cubicTo(18.796738F, 26.79526F, 16.915646F, 23.940908F, 16.985262F, 21.787113F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/akb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */