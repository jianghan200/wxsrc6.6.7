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

public final class vl
  extends c
{
  private final int height = 111;
  private final int width = 111;
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 111;
      return 111;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject1 = c.f(paramVarArgs);
      Object localObject2 = c.e(paramVarArgs);
      Object localObject4 = c.i(paramVarArgs);
      ((Paint)localObject4).setFlags(385);
      ((Paint)localObject4).setStyle(Paint.Style.FILL);
      Object localObject3 = c.i(paramVarArgs);
      ((Paint)localObject3).setFlags(385);
      ((Paint)localObject3).setStyle(Paint.Style.STROKE);
      ((Paint)localObject4).setColor(-16777216);
      ((Paint)localObject3).setStrokeWidth(1.0F);
      ((Paint)localObject3).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject3).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject3).setStrokeMiter(4.0F);
      ((Paint)localObject3).setPathEffect(null);
      localObject3 = c.a((Paint)localObject3, paramVarArgs);
      ((Paint)localObject3).setStrokeWidth(1.0F);
      localObject4 = c.a((Paint)localObject4, paramVarArgs);
      ((Paint)localObject4).setColor(49462);
      localCanvas.save();
      localObject4 = c.a((Paint)localObject4, paramVarArgs);
      Path localPath = c.j(paramVarArgs);
      localPath.moveTo(55.5F, 0.0F);
      localPath.cubicTo(86.15181F, 0.0F, 111.0F, 24.848194F, 111.0F, 55.5F);
      localPath.cubicTo(111.0F, 86.15181F, 86.15181F, 111.0F, 55.5F, 111.0F);
      localPath.cubicTo(24.848194F, 111.0F, 0.0F, 86.15181F, 0.0F, 55.5F);
      localPath.cubicTo(0.0F, 24.848194F, 24.848194F, 0.0F, 55.5F, 0.0F);
      localPath.close();
      localCanvas.drawPath(localPath, (Paint)localObject4);
      localCanvas.restore();
      localCanvas.save();
      localObject3 = c.a((Paint)localObject3, paramVarArgs);
      ((Paint)localObject3).setColor(-1);
      ((Paint)localObject3).setStrokeWidth(3.0F);
      localObject4 = c.a((float[])localObject2, 1.0F, 0.0F, 6.0F, 0.0F, 1.0F, 15.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject4);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((Paint)localObject3, paramVarArgs);
      localObject4 = c.a((float[])localObject4, 0.89879405F, -0.43837115F, 23.489042F, 0.43837115F, 0.89879405F, -15.173922F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject4);
      localCanvas.concat((Matrix)localObject1);
      localPath = c.j(paramVarArgs);
      localPath.moveTo(22.994629F, 17.339851F);
      localPath.cubicTo(22.39213F, 17.121492F, 21.726933F, 17.43036F, 21.509315F, 18.025713F);
      localPath.lineTo(10.605188F, 47.85707F);
      localPath.cubicTo(10.388678F, 48.4494F, 10.695863F, 49.10536F, 11.295349F, 49.322624F);
      localPath.lineTo(66.219894F, 69.228455F);
      localPath.cubicTo(66.822395F, 69.446815F, 67.487595F, 69.13795F, 67.70521F, 68.542595F);
      localPath.lineTo(78.60934F, 38.711235F);
      localPath.cubicTo(78.82584F, 38.118908F, 78.51866F, 37.46295F, 77.919174F, 37.245686F);
      localPath.lineTo(22.994629F, 17.339851F);
      localPath.close();
      localCanvas.drawPath(localPath, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a((Paint)localObject3, paramVarArgs);
      ((Paint)localObject2).setStrokeCap(Paint.Cap.ROUND);
      ((Paint)localObject2).setStrokeJoin(Paint.Join.MITER);
      localObject3 = c.a((float[])localObject4, 1.0F, 0.0F, 13.269231F, 0.0F, 1.0F, 10.468085F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((Paint)localObject2, paramVarArgs);
      localObject3 = c.a((float[])localObject3, 0.9975641F, 0.06975647F, -1.867919F, -0.06975647F, 0.9975641F, 2.5683162F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localObject1 = c.j(paramVarArgs);
      ((Path)localObject1).moveTo(39.538136F, 6.3106236F);
      ((Path)localObject1).cubicTo(43.65822F, 4.154688F, 48.062016F, 2.915408F, 52.74952F, 2.5927842F);
      ((Path)localObject1).cubicTo(59.98247F, 2.5454812F, 65.71933F, 4.7730365F, 68.3616F, 9.330113F);
      ((Path)localObject1).cubicTo(73.88385F, 18.854218F, 63.797997F, 34.946922F, 45.83423F, 45.274174F);
      ((Path)localObject1).cubicTo(27.870462F, 55.60143F, 8.831288F, 56.25251F, 3.3090456F, 46.728405F);
      ((Path)localObject1).cubicTo(2.6508272F, 45.59319F, 2.2143564F, 44.36465F, 1.9865427F, 43.06368F);
      ((Path)localObject1).cubicTo(1.6337932F, 40.273342F, 1.7985677F, 37.926987F, 2.4808657F, 36.02461F);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/vl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */