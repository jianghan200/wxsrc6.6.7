package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.c;

public final class vr
  extends c
{
  private final int height = 142;
  private final int width = 156;
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 156;
      return 142;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject1 = c.f(paramVarArgs);
      Object localObject2 = c.e(paramVarArgs);
      Paint localPaint = c.i(paramVarArgs);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.FILL);
      Object localObject3 = c.i(paramVarArgs);
      ((Paint)localObject3).setFlags(385);
      ((Paint)localObject3).setStyle(Paint.Style.STROKE);
      localPaint.setColor(-16777216);
      ((Paint)localObject3).setStrokeWidth(1.0F);
      ((Paint)localObject3).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject3).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject3).setStrokeMiter(4.0F);
      ((Paint)localObject3).setPathEffect(null);
      localPaint = c.a((Paint)localObject3, paramVarArgs);
      localPaint.setStrokeWidth(1.0F);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(49462);
      localPaint.setStrokeWidth(3.0F);
      localObject3 = c.a((float[])localObject2, 1.0F, 0.0F, -7.0F, 0.0F, 1.0F, 1.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a(localPaint, paramVarArgs);
      localObject3 = c.a((float[])localObject3, 0.89879405F, -0.43837115F, 38.56562F, 0.43837115F, 0.89879405F, -26.797539F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      Path localPath = c.j(paramVarArgs);
      localPath.moveTo(40.230236F, 23.916641F);
      localPath.cubicTo(38.61875F, 23.330109F, 36.836906F, 24.160997F, 36.250374F, 25.77248F);
      localPath.lineTo(17.349888F, 77.70114F);
      localPath.cubicTo(16.763355F, 79.31262F, 17.594244F, 81.09447F, 19.205727F, 81.681F);
      localPath.lineTo(114.40827F, 116.331894F);
      localPath.cubicTo(116.01976F, 116.91843F, 117.8016F, 116.08754F, 118.38813F, 114.47605F);
      localPath.lineTo(137.28862F, 62.547394F);
      localPath.cubicTo(137.87515F, 60.93591F, 137.04427F, 59.154068F, 135.43279F, 58.567535F);
      localPath.lineTo(40.230236F, 23.916641F);
      localPath.close();
      localCanvas.drawPath(localPath, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setStrokeCap(Paint.Cap.ROUND);
      localPaint.setStrokeJoin(Paint.Join.MITER);
      localObject2 = c.a((float[])localObject3, 1.0F, 0.0F, 23.0F, 0.0F, 1.0F, 13.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject2 = c.a((float[])localObject2, 0.9975641F, 0.06975647F, -3.3330553F, -0.06975647F, 0.9975641F, 4.58741F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localObject1 = c.j(paramVarArgs);
      ((Path)localObject1).moveTo(70.62369F, 11.053474F);
      ((Path)localObject1).cubicTo(77.98368F, 7.185715F, 85.850494F, 4.9624414F, 94.22412F, 4.3836527F);
      ((Path)localObject1).cubicTo(107.144844F, 4.298791F, 117.393005F, 8.295036F, 122.11308F, 16.470455F);
      ((Path)localObject1).cubicTo(131.97786F, 33.556744F, 113.96079F, 62.42713F, 81.87084F, 80.95428F);
      ((Path)localObject1).cubicTo(49.780895F, 99.481415F, 15.769872F, 100.64946F, 5.9050984F, 83.56317F);
      ((Path)localObject1).cubicTo(4.7292767F, 81.52658F, 3.9495778F, 79.32258F, 3.542618F, 76.98863F);
      ((Path)localObject1).cubicTo(2.9124768F, 71.98276F, 3.2068248F, 67.773384F, 4.425662F, 64.36051F);
      localCanvas.drawPath((Path)localObject1, localPaint);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/vr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */