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

public final class vq
  extends c
{
  private final int height = 360;
  private final int width = 420;
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 420;
      return 360;
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
      localPaint.setColor(-1203649);
      localPaint.setStrokeWidth(6.0F);
      localObject3 = c.a((float[])localObject2, 1.0F, 0.0F, 30.0F, 0.0F, 1.0F, 36.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a(localPaint, paramVarArgs);
      localObject3 = c.a((float[])localObject3, 0.89879405F, -0.43837115F, 83.424065F, 0.43837115F, 0.89879405F, -56.94818F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      Path localPath = c.j(paramVarArgs);
      localPath.moveTo(85.9481F, 53.707603F);
      localPath.cubicTo(82.400116F, 52.420452F, 78.47858F, 54.243134F, 77.18978F, 57.772533F);
      localPath.lineTo(36.844513F, 168.25905F);
      localPath.cubicTo(35.557407F, 171.78381F, 37.38146F, 175.68275F, 40.924824F, 176.96823F);
      localPath.lineTo(244.14565F, 250.69354F);
      localPath.cubicTo(247.69362F, 251.98068F, 251.61516F, 250.158F, 252.90396F, 246.6286F);
      localPath.lineTo(293.24924F, 136.14209F);
      localPath.cubicTo(294.53632F, 132.61732F, 292.71228F, 128.71838F, 289.1689F, 127.43291F);
      localPath.lineTo(85.9481F, 53.707603F);
      localPath.close();
      localCanvas.drawPath(localPath, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setStrokeCap(Paint.Cap.ROUND);
      localPaint.setStrokeJoin(Paint.Join.MITER);
      localObject2 = c.a((float[])localObject3, 1.0F, 0.0F, 49.096153F, 0.0F, 1.0F, 30.659575F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject2 = c.a((float[])localObject2, 0.9975641F, 0.06975647F, -7.0905256F, -0.06975647F, 0.9975641F, 9.791511F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localObject1 = c.j(paramVarArgs);
      ((Path)localObject1).moveTo(150.75441F, 23.51803F);
      ((Path)localObject1).cubicTo(166.46516F, 15.288756F, 183.25778F, 10.558386F, 201.13225F, 9.3269205F);
      ((Path)localObject1).cubicTo(228.71304F, 9.146363F, 250.58891F, 17.649012F, 260.66446F, 35.04352F);
      ((Path)localObject1).cubicTo(281.722F, 71.39732F, 243.26247F, 132.82368F, 174.76277F, 172.24313F);
      ((Path)localObject1).cubicTo(106.26306F, 211.66258F, 33.662613F, 214.14778F, 12.605114F, 177.79398F);
      ((Path)localObject1).cubicTo(10.095186F, 173.46082F, 8.430829F, 168.77145F, 7.5621266F, 163.8056F);
      ((Path)localObject1).cubicTo(6.2170177F, 153.1548F, 6.845338F, 144.19868F, 9.447086F, 136.93726F);
      localCanvas.drawPath((Path)localObject1, localPaint);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/vq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */