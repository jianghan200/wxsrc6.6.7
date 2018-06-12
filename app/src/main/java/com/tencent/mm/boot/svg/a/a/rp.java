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

public final class rp
  extends c
{
  private final int height = 15;
  private final int width = 15;
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 15;
      return 15;
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
      localPaint2 = c.a(localPaint2, paramVarArgs);
      localPaint2.setStrokeWidth(1.0F);
      localCanvas.save();
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 1.0F, 0.0F, 1.0F, 1.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint2, paramVarArgs);
      ((Paint)localObject1).setColor(-4868683);
      ((Paint)localObject1).setStrokeWidth(0.95454544F);
      localObject2 = c.j(paramVarArgs);
      ((Path)localObject2).moveTo(13.193269F, 0.4773343F);
      ((Path)localObject2).lineTo(13.193239F, 0.4773343F);
      ((Path)localObject2).lineTo(8.75F, 0.4773343F);
      ((Path)localObject2).cubicTo(8.665613F, 0.4773343F, 8.584682F, 0.5108569F, 8.525011F, 0.57052755F);
      ((Path)localObject2).lineTo(0.57046604F, 8.525073F);
      ((Path)localObject2).cubicTo(0.4462083F, 8.649331F, 0.4462083F, 8.850792F, 0.57046705F, 8.975051F);
      ((Path)localObject2).lineTo(5.0136914F, 13.4183035F);
      ((Path)localObject2).cubicTo(5.13795F, 13.542562F, 5.3394117F, 13.54256F, 5.4636736F, 13.418298F);
      ((Path)localObject2).lineTo(13.417828F, 5.463724F);
      ((Path)localObject2).cubicTo(13.477489F, 5.40406F, 13.511009F, 5.3231416F, 13.511016F, 5.2387595F);
      ((Path)localObject2).lineTo(13.511421F, 0.7954792F);
      ((Path)localObject2).cubicTo(13.511435F, 0.61975574F, 13.369009F, 0.47732326F, 13.193269F, 0.4773343F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-4868683);
      localObject1 = c.j(paramVarArgs);
      ((Path)localObject1).moveTo(10.181818F, 2.8181818F);
      ((Path)localObject1).cubicTo(10.734103F, 2.8181818F, 11.181818F, 3.265897F, 11.181818F, 3.8181818F);
      ((Path)localObject1).cubicTo(11.181818F, 4.3704667F, 10.734103F, 4.818182F, 10.181818F, 4.818182F);
      ((Path)localObject1).cubicTo(9.629533F, 4.818182F, 9.181818F, 4.3704667F, 9.181818F, 3.8181818F);
      ((Path)localObject1).cubicTo(9.181818F, 3.265897F, 9.629533F, 2.8181818F, 10.181818F, 2.8181818F);
      ((Path)localObject1).close();
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/rp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */