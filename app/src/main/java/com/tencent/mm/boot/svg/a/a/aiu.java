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

public final class aiu
  extends c
{
  private final int height = 78;
  private final int width = 38;
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 38;
      return 78;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject = c.f(paramVarArgs);
      float[] arrayOfFloat = c.e(paramVarArgs);
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
      localPaint1.setColor(-16139513);
      localCanvas.save();
      localPaint2 = c.a(localPaint1, paramVarArgs);
      Path localPath = c.j(paramVarArgs);
      localPath.moveTo(0.0F, 14.0F);
      localPath.lineTo(38.0F, 14.0F);
      localPath.lineTo(38.0F, 17.0F);
      localPath.lineTo(0.0F, 17.0F);
      localPath.lineTo(0.0F, 14.0F);
      localPath.close();
      localCanvas.drawPath(localPath, localPaint2);
      localCanvas.restore();
      localCanvas.save();
      localPaint2 = c.a(localPaint1, paramVarArgs);
      localPath = c.j(paramVarArgs);
      localPath.moveTo(28.086956F, 36.567226F);
      localPath.lineTo(38.0F, 29.382353F);
      localPath.lineTo(0.0F, 29.382353F);
      localPath.lineTo(9.913043F, 36.567226F);
      localPath.lineTo(9.913043F, 78.0F);
      localPath.lineTo(28.086956F, 78.0F);
      localPath.lineTo(28.086956F, 36.567226F);
      localPath.close();
      localPath.moveTo(0.0F, 21.0F);
      localPath.lineTo(38.0F, 21.0F);
      localPath.lineTo(38.0F, 29.382353F);
      localPath.lineTo(0.0F, 29.382353F);
      localPath.lineTo(0.0F, 21.0F);
      localPath.close();
      localPath.moveTo(19.0F, 41.117645F);
      localPath.cubicTo(20.368706F, 41.117645F, 21.47826F, 39.991776F, 21.47826F, 38.60294F);
      localPath.cubicTo(21.47826F, 37.214108F, 20.368706F, 36.088234F, 19.0F, 36.088234F);
      localPath.cubicTo(17.631294F, 36.088234F, 16.52174F, 37.214108F, 16.52174F, 38.60294F);
      localPath.cubicTo(16.52174F, 39.991776F, 17.631294F, 41.117645F, 19.0F, 41.117645F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, localPaint2);
      localCanvas.restore();
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 3.257143F, 0.0F, 1.0F, 0.272208F);
      ((Matrix)localObject).reset();
      ((Matrix)localObject).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject);
      localCanvas.save();
      localPaint2 = c.a(localPaint1, paramVarArgs);
      localPath = c.j(paramVarArgs);
      localPath.moveTo(14.914286F, 0.0F);
      localPath.lineTo(16.571428F, 0.0F);
      localPath.lineTo(16.571428F, 8.339977F);
      localPath.lineTo(14.914286F, 8.339977F);
      localPath.lineTo(14.914286F, 0.0F);
      localPath.close();
      localCanvas.drawPath(localPath, localPaint2);
      localCanvas.restore();
      localCanvas.save();
      localPaint2 = c.a(localPaint1, paramVarArgs);
      arrayOfFloat = c.a(arrayOfFloat, -0.70710677F, -0.70710677F, 51.878563F, -0.70710677F, 0.70710677F, 21.488804F);
      ((Matrix)localObject).reset();
      ((Matrix)localObject).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject);
      localPath = c.j(paramVarArgs);
      localPath.moveTo(26.958014F, 2.9486272F);
      localPath.lineTo(28.615156F, 2.9486272F);
      localPath.lineTo(28.615156F, 9.620609F);
      localPath.lineTo(26.958014F, 9.620609F);
      localPath.lineTo(26.958014F, 2.9486272F);
      localPath.close();
      localCanvas.drawPath(localPath, localPaint2);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      arrayOfFloat = c.a(arrayOfFloat, 0.70710677F, 0.70710677F, -3.360446F, -0.70710677F, 0.70710677F, 4.4564013F);
      ((Matrix)localObject).reset();
      ((Matrix)localObject).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject);
      localObject = c.j(paramVarArgs);
      ((Path)localObject).moveTo(2.8705575F, 2.9486272F);
      ((Path)localObject).lineTo(4.5277004F, 2.9486272F);
      ((Path)localObject).lineTo(4.5277004F, 9.620609F);
      ((Path)localObject).lineTo(2.8705575F, 9.620609F);
      ((Path)localObject).lineTo(2.8705575F, 2.9486272F);
      ((Path)localObject).close();
      localCanvas.drawPath((Path)localObject, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/aiu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */