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

public final class zm
  extends c
{
  private final int height = 150;
  private final int width = 150;
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 150;
      return 150;
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
      ((Paint)localObject).setColor(-921103);
      Path localPath = c.j(paramVarArgs);
      localPath.moveTo(0.0F, 0.0F);
      localPath.lineTo(150.0F, 0.0F);
      localPath.lineTo(150.0F, 150.0F);
      localPath.lineTo(0.0F, 150.0F);
      localPath.lineTo(0.0F, 0.0F);
      localPath.close();
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-3552823);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.j(paramVarArgs);
      ((Path)localObject).moveTo(88.629036F, 47.177418F);
      ((Path)localObject).cubicTo(85.16202F, 47.177418F, 81.93403F, 48.098953F, 79.19355F, 49.66629F);
      ((Path)localObject).cubicTo(74.166534F, 52.543064F, 70.80645F, 57.627743F, 70.80645F, 63.427418F);
      ((Path)localObject).lineTo(70.80645F, 87.54032F);
      ((Path)localObject).cubicTo(70.80645F, 91.882744F, 66.58145F, 95.40323F, 61.370968F, 95.40323F);
      ((Path)localObject).cubicTo(56.159435F, 95.40323F, 51.935482F, 91.882744F, 51.935482F, 87.54032F);
      ((Path)localObject).cubicTo(51.935482F, 84.44968F, 54.080482F, 81.78363F, 57.193146F, 80.49831F);
      ((Path)localObject).cubicTo(57.4175F, 80.40605F, 57.645F, 80.317986F, 57.87879F, 80.2404F);
      ((Path)localObject).cubicTo(59.838226F, 79.45411F, 61.51879F, 77.97798F, 62.142582F, 76.26387F);
      ((Path)localObject).cubicTo(63.064114F, 73.73306F, 61.348953F, 71.68242F, 58.312824F, 71.68242F);
      ((Path)localObject).cubicTo(57.555885F, 71.68242F, 56.788467F, 71.810326F, 56.048306F, 72.04097F);
      ((Path)localObject).cubicTo(56.045162F, 72.042015F, 56.042015F, 72.04307F, 56.037823F, 72.04411F);
      ((Path)localObject).cubicTo(51.648228F, 73.304276F, 47.98411F, 76.067825F, 45.784595F, 79.67742F);
      ((Path)localObject).cubicTo(44.364033F, 82.01008F, 43.548386F, 84.68871F, 43.548386F, 87.54032F);
      ((Path)localObject).cubicTo(43.548386F, 96.500885F, 51.54339F, 103.79032F, 61.370968F, 103.79032F);
      ((Path)localObject).cubicTo(64.83798F, 103.79032F, 68.06597F, 102.86879F, 70.80645F, 101.30145F);
      ((Path)localObject).cubicTo(75.833466F, 98.424675F, 79.19355F, 93.34F, 79.19355F, 87.54032F);
      ((Path)localObject).lineTo(79.19355F, 63.427418F);
      ((Path)localObject).cubicTo(79.19355F, 59.085F, 83.4175F, 55.564518F, 88.629036F, 55.564518F);
      ((Path)localObject).cubicTo(93.839516F, 55.564518F, 98.064514F, 59.085F, 98.064514F, 63.427418F);
      ((Path)localObject).cubicTo(98.064514F, 66.65016F, 95.738144F, 69.42F, 92.40742F, 70.63403F);
      ((Path)localObject).cubicTo(90.25928F, 71.35427F, 88.49903F, 72.909035F, 87.828064F, 74.751045F);
      ((Path)localObject).cubicTo(86.91177F, 77.26927F, 88.618546F, 79.31153F, 91.641045F, 79.31153F);
      ((Path)localObject).cubicTo(92.325645F, 79.31153F, 93.01758F, 79.194115F, 93.691696F, 79.0033F);
      ((Path)localObject).cubicTo(93.80177F, 78.9729F, 93.910805F, 78.939354F, 94.01984F, 78.90685F);
      ((Path)localObject).cubicTo(98.383224F, 77.63936F, 102.02532F, 74.88419F, 104.214355F, 71.29032F);
      ((Path)localObject).cubicTo(105.63597F, 68.95871F, 106.451614F, 66.27903F, 106.451614F, 63.427418F);
      ((Path)localObject).cubicTo(106.451614F, 54.466854F, 98.45661F, 47.177418F, 88.629036F, 47.177418F);
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 1);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/zm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */