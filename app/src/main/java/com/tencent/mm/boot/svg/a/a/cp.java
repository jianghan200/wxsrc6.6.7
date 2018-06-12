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

public final class cp
  extends c
{
  private final int height = 90;
  private final int width = 90;
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 90;
      return 90;
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
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 11.0F, 0.0F, 1.0F, 0.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      ((Paint)localObject1).setColor(-1710619);
      localObject2 = c.j(paramVarArgs);
      ((Path)localObject2).moveTo(46.0F, 0.0F);
      ((Path)localObject2).lineTo(68.0F, 22.0F);
      ((Path)localObject2).lineTo(68.0F, 87.0F);
      ((Path)localObject2).cubicTo(68.0F, 88.65685F, 66.65685F, 90.0F, 65.0F, 90.0F);
      ((Path)localObject2).lineTo(3.0F, 90.0F);
      ((Path)localObject2).cubicTo(1.3431457F, 90.0F, 2.0290612E-16F, 88.65685F, 0.0F, 87.0F);
      ((Path)localObject2).lineTo(0.0F, 3.0F);
      ((Path)localObject2).cubicTo(-2.0290612E-16F, 1.3431457F, 1.3431457F, 3.043592E-16F, 3.0F, 0.0F);
      ((Path)localObject2).lineTo(46.0F, 0.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      ((Paint)localObject1).setColor(-2434342);
      localObject2 = c.j(paramVarArgs);
      ((Path)localObject2).moveTo(68.0F, 22.0F);
      ((Path)localObject2).lineTo(49.0F, 22.0F);
      ((Path)localObject2).cubicTo(47.343147F, 22.0F, 46.0F, 20.656855F, 46.0F, 19.0F);
      ((Path)localObject2).lineTo(46.0F, 0.0F);
      ((Path)localObject2).lineTo(68.0F, 22.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-5723992);
      localObject1 = c.j(paramVarArgs);
      ((Path)localObject1).moveTo(26.177734F, 50.26172F);
      ((Path)localObject1).cubicTo(26.371094F, 46.464844F, 28.902344F, 43.441406F, 33.841797F, 43.441406F);
      ((Path)localObject1).cubicTo(38.271484F, 43.441406F, 41.29492F, 46.183594F, 41.29492F, 49.804688F);
      ((Path)localObject1).cubicTo(41.29492F, 52.564453F, 39.871094F, 54.515625F, 37.621094F, 55.86914F);
      ((Path)localObject1).cubicTo(35.38867F, 57.1875F, 34.75586F, 58.171875F, 34.75586F, 60.01758F);
      ((Path)localObject1).lineTo(34.75586F, 61.160156F);
      ((Path)localObject1).lineTo(31.679688F, 61.160156F);
      ((Path)localObject1).lineTo(31.679688F, 59.54297F);
      ((Path)localObject1).cubicTo(31.66211F, 57.222656F, 32.78711F, 55.640625F, 35.195312F, 54.19922F);
      ((Path)localObject1).cubicTo(37.234375F, 52.95117F, 38.02539F, 51.84375F, 38.02539F, 49.96289F);
      ((Path)localObject1).cubicTo(38.02539F, 47.783203F, 36.33789F, 46.183594F, 33.71875F, 46.183594F);
      ((Path)localObject1).cubicTo(31.064453F, 46.183594F, 29.376953F, 47.748047F, 29.183594F, 50.26172F);
      ((Path)localObject1).lineTo(26.177734F, 50.26172F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(33.226562F, 69.17578F);
      ((Path)localObject1).cubicTo(32.101562F, 69.17578F, 31.222656F, 68.296875F, 31.222656F, 67.171875F);
      ((Path)localObject1).cubicTo(31.222656F, 66.0293F, 32.101562F, 65.16797F, 33.226562F, 65.16797F);
      ((Path)localObject1).cubicTo(34.36914F, 65.16797F, 35.23047F, 66.0293F, 35.23047F, 67.171875F);
      ((Path)localObject1).cubicTo(35.23047F, 68.296875F, 34.36914F, 69.17578F, 33.226562F, 69.17578F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/cp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */