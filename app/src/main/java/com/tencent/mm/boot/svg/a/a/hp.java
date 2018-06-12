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

public final class hp
  extends c
{
  private final int height = 135;
  private final int width = 135;
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 135;
      return 135;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject2 = c.f(paramVarArgs);
      Object localObject3 = c.e(paramVarArgs);
      Paint localPaint = c.i(paramVarArgs);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.FILL);
      Object localObject1 = c.i(paramVarArgs);
      ((Paint)localObject1).setFlags(385);
      ((Paint)localObject1).setStyle(Paint.Style.STROKE);
      localPaint.setColor(-16777216);
      ((Paint)localObject1).setStrokeWidth(1.0F);
      ((Paint)localObject1).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject1).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject1).setStrokeMiter(4.0F);
      ((Paint)localObject1).setPathEffect(null);
      localObject1 = c.a((Paint)localObject1, paramVarArgs);
      ((Paint)localObject1).setStrokeWidth(1.0F);
      localCanvas.save();
      localObject3 = c.a((float[])localObject3, 1.0F, 0.0F, -53.0F, 0.0F, 1.0F, -446.0F);
      ((Matrix)localObject2).reset();
      ((Matrix)localObject2).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject2);
      localCanvas.save();
      localObject3 = c.a((float[])localObject3, 1.0F, 0.0F, 53.0F, 0.0F, 1.0F, 446.0F);
      ((Matrix)localObject2).reset();
      ((Matrix)localObject2).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject2);
      localObject2 = c.a(localPaint, paramVarArgs);
      ((Paint)localObject2).setColor(1275068416);
      localCanvas.save();
      localObject2 = c.a((Paint)localObject2, paramVarArgs);
      localObject3 = c.j(paramVarArgs);
      ((Path)localObject3).moveTo(67.5F, 0.0F);
      ((Path)localObject3).cubicTo(104.77922F, 0.0F, 135.0F, 30.22078F, 135.0F, 67.5F);
      ((Path)localObject3).cubicTo(135.0F, 104.77922F, 104.77922F, 135.0F, 67.5F, 135.0F);
      ((Path)localObject3).cubicTo(30.22078F, 135.0F, 0.0F, 104.77922F, 0.0F, 67.5F);
      ((Path)localObject3).cubicTo(0.0F, 30.22078F, 30.22078F, 0.0F, 67.5F, 0.0F);
      ((Path)localObject3).close();
      localCanvas.drawPath((Path)localObject3, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject1, paramVarArgs);
      ((Paint)localObject1).setColor(-1);
      ((Paint)localObject1).setStrokeWidth(6.9F);
      localObject2 = c.j(paramVarArgs);
      ((Path)localObject2).moveTo(67.5F, 3.449997F);
      ((Path)localObject2).cubicTo(102.87384F, 3.449997F, 131.55F, 32.12616F, 131.55F, 67.5F);
      ((Path)localObject2).cubicTo(131.55F, 102.87384F, 102.87384F, 131.55F, 67.5F, 131.55F);
      ((Path)localObject2).cubicTo(32.12616F, 131.55F, 3.449997F, 102.87384F, 3.449997F, 67.5F);
      ((Path)localObject2).cubicTo(3.449997F, 32.12616F, 32.12616F, 3.449997F, 67.5F, 3.449997F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-1);
      localObject1 = c.j(paramVarArgs);
      ((Path)localObject1).moveTo(89.24534F, 69.888115F);
      ((Path)localObject1).lineTo(58.42176F, 90.100464F);
      ((Path)localObject1).cubicTo(57.10284F, 90.96533F, 55.332527F, 90.59726F, 54.467655F, 89.278336F);
      ((Path)localObject1).cubicTo(54.16254F, 88.81304F, 54.0F, 88.26875F, 54.0F, 87.71235F);
      ((Path)localObject1).lineTo(54.0F, 47.287655F);
      ((Path)localObject1).cubicTo(54.0F, 45.710457F, 55.278572F, 44.431885F, 56.85577F, 44.431885F);
      ((Path)localObject1).cubicTo(57.412178F, 44.431885F, 57.956467F, 44.594425F, 58.42176F, 44.89954F);
      ((Path)localObject1).lineTo(89.24534F, 65.111885F);
      ((Path)localObject1).cubicTo(90.564255F, 65.97676F, 90.932335F, 67.74707F, 90.06746F, 69.06599F);
      ((Path)localObject1).cubicTo(89.85269F, 69.39351F, 89.57285F, 69.67335F, 89.24534F, 69.888115F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/hp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */