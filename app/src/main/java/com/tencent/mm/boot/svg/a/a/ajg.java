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

public final class ajg
  extends c
{
  private final int height = 144;
  private final int width = 144;
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 144;
      return 144;
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
      ((Paint)localObject).setColor(-1710619);
      Path localPath = c.j(paramVarArgs);
      localPath.moveTo(0.0F, 0.0F);
      localPath.lineTo(144.0F, 0.0F);
      localPath.lineTo(144.0F, 146.0F);
      localPath.lineTo(0.0F, 146.0F);
      localPath.lineTo(0.0F, 0.0F);
      localPath.close();
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-16777216);
      localObject = c.j(paramVarArgs);
      ((Path)localObject).moveTo(67.462845F, 72.00018F);
      ((Path)localObject).lineTo(49.3112F, 53.848534F);
      ((Path)localObject).cubicTo(48.899487F, 53.43682F, 48.89414F, 52.760975F, 49.30799F, 52.347126F);
      ((Path)localObject).lineTo(52.346096F, 49.30795F);
      ((Path)localObject).cubicTo(52.7546F, 48.899445F, 53.432587F, 48.896236F, 53.848576F, 49.312225F);
      ((Path)localObject).lineTo(72.00022F, 67.46281F);
      ((Path)localObject).lineTo(90.1508F, 49.312225F);
      ((Path)localObject).cubicTo(90.56358F, 48.899445F, 91.239426F, 48.89517F, 91.65435F, 49.30795F);
      ((Path)localObject).lineTo(94.69138F, 52.347126F);
      ((Path)localObject).cubicTo(95.09989F, 52.75456F, 95.104164F, 53.433613F, 94.68818F, 53.848534F);
      ((Path)localObject).lineTo(76.53653F, 72.00018F);
      ((Path)localObject).lineTo(94.68818F, 90.151825F);
      ((Path)localObject).cubicTo(95.09989F, 90.56354F, 95.10523F, 91.23939F, 94.69138F, 91.654305F);
      ((Path)localObject).lineTo(91.65435F, 94.69241F);
      ((Path)localObject).cubicTo(91.244774F, 95.100914F, 90.56679F, 95.104126F, 90.1508F, 94.68921F);
      ((Path)localObject).lineTo(72.00022F, 76.53649F);
      ((Path)localObject).lineTo(53.848576F, 94.68921F);
      ((Path)localObject).cubicTo(53.436863F, 95.100914F, 52.759945F, 95.105194F, 52.346096F, 94.69241F);
      ((Path)localObject).lineTo(49.30799F, 91.654305F);
      ((Path)localObject).cubicTo(48.899487F, 91.244736F, 48.89628F, 90.56675F, 49.3112F, 90.151825F);
      ((Path)localObject).lineTo(67.462845F, 72.00018F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/ajg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */