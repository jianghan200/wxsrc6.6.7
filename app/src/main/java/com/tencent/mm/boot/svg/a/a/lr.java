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

public final class lr
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
      Object localObject3 = c.e(paramVarArgs);
      Object localObject2 = c.i(paramVarArgs);
      ((Paint)localObject2).setFlags(385);
      ((Paint)localObject2).setStyle(Paint.Style.FILL);
      Paint localPaint = c.i(paramVarArgs);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.STROKE);
      ((Paint)localObject2).setColor(-16777216);
      localPaint.setStrokeWidth(1.0F);
      localPaint.setStrokeCap(Paint.Cap.BUTT);
      localPaint.setStrokeJoin(Paint.Join.MITER);
      localPaint.setStrokeMiter(4.0F);
      localPaint.setPathEffect(null);
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setStrokeWidth(1.0F);
      localCanvas.save();
      localObject3 = c.a((float[])localObject3, 1.0F, 0.0F, -90.0F, 0.0F, 1.0F, -561.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-1);
      localPaint.setStrokeWidth(6.0F);
      localObject3 = c.a((float[])localObject3, 1.0F, 0.0F, 90.0F, 0.0F, 1.0F, 561.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      Path localPath = c.j(paramVarArgs);
      localPath.moveTo(57.391304F, 3.0F);
      localPath.cubicTo(87.43079F, 3.0F, 111.78261F, 27.351814F, 111.78261F, 57.391304F);
      localPath.cubicTo(111.78261F, 87.43079F, 87.43079F, 111.78261F, 57.391304F, 111.78261F);
      localPath.cubicTo(27.351814F, 111.78261F, 3.0F, 87.43079F, 3.0F, 57.391304F);
      localPath.cubicTo(3.0F, 27.351814F, 27.351814F, 3.0F, 57.391304F, 3.0F);
      localPath.close();
      localCanvas.drawPath(localPath, localPaint);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a((Paint)localObject2, paramVarArgs);
      ((Paint)localObject2).setColor(-1);
      localObject3 = c.a((float[])localObject3, 1.0F, 0.0F, 125.0F, 0.0F, 1.0F, 604.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject3 = c.a((float[])localObject3, 1.0F, 0.0F, 0.872F, 0.0F, 1.0F, 0.8736F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramVarArgs);
      localObject3 = c.j(paramVarArgs);
      ((Path)localObject3).moveTo(2.88F, 2.8072181E-14F);
      ((Path)localObject3).lineTo(31.220352F, 1.589265E-14F);
      ((Path)localObject3).lineTo(31.220352F, 1.4654944E-14F);
      ((Path)localObject3).cubicTo(32.810932F, 1.436276E-14F, 34.100353F, 1.2894199F, 34.100353F, 2.88F);
      ((Path)localObject3).lineTo(34.100353F, 24.905472F);
      ((Path)localObject3).lineTo(34.100353F, 24.905472F);
      ((Path)localObject3).cubicTo(34.100353F, 26.496052F, 32.810932F, 27.785473F, 31.220352F, 27.785473F);
      ((Path)localObject3).lineTo(2.88F, 27.785473F);
      ((Path)localObject3).lineTo(2.88F, 27.785473F);
      ((Path)localObject3).cubicTo(1.2894199F, 27.785473F, 1.4008289E-13F, 26.496052F, 1.398881E-13F, 24.905472F);
      ((Path)localObject3).lineTo(2.6364292E-13F, 2.88F);
      ((Path)localObject3).lineTo(2.793321E-13F, 2.88F);
      ((Path)localObject3).cubicTo(2.8690727E-13F, 1.2894199F, 1.2894199F, 4.6033374E-14F, 2.88F, 4.574119E-14F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramVarArgs);
      localObject2 = c.j(paramVarArgs);
      ((Path)localObject2).moveTo(35.0F, 16.154066F);
      ((Path)localObject2).cubicTo(38.160763F, 19.019035F, 44.07001F, 24.414022F, 44.533333F, 24.923437F);
      ((Path)localObject2).cubicTo(45.535843F, 25.16433F, 46.44F, 24.521954F, 46.44F, 23.970104F);
      ((Path)localObject2).cubicTo(46.44F, 22.993073F, 46.44F, 4.2294707F, 46.44F, 2.9967713F);
      ((Path)localObject2).cubicTo(46.44F, 2.3139985F, 45.440147F, 1.8522905F, 44.533333F, 2.043438F);
      ((Path)localObject2).cubicTo(43.86385F, 2.6392634F, 38.086887F, 7.8850446F, 35.0F, 10.734522F);
      ((Path)localObject2).lineTo(35.0F, 16.154066F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/lr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */