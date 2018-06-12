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

public final class df
  extends c
{
  private final int height = 96;
  private final int width = 130;
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 130;
      return 96;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject1 = c.f(paramVarArgs);
      Object localObject2 = c.e(paramVarArgs);
      Object localObject3 = c.i(paramVarArgs);
      ((Paint)localObject3).setFlags(385);
      ((Paint)localObject3).setStyle(Paint.Style.FILL);
      Object localObject4 = c.i(paramVarArgs);
      ((Paint)localObject4).setFlags(385);
      ((Paint)localObject4).setStyle(Paint.Style.STROKE);
      ((Paint)localObject3).setColor(-16777216);
      ((Paint)localObject4).setStrokeWidth(1.0F);
      ((Paint)localObject4).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject4).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject4).setStrokeMiter(4.0F);
      ((Paint)localObject4).setPathEffect(null);
      c.a((Paint)localObject4, paramVarArgs).setStrokeWidth(1.0F);
      localCanvas.save();
      localObject3 = c.a((Paint)localObject3, paramVarArgs);
      ((Paint)localObject3).setColor(-16777216);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -238.0F, 0.0F, 1.0F, -166.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject4 = c.a((float[])localObject2, 1.0F, 0.0F, 238.0F, 0.0F, 1.0F, 166.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject4);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject2 = c.a((Paint)localObject3, paramVarArgs);
      localObject3 = c.a((float[])localObject4, 0.70710677F, -0.70710677F, 50.78103F, 0.70710677F, 0.70710677F, -41.066437F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localObject1 = c.j(paramVarArgs);
      ((Path)localObject1).moveTo(75.89903F, 17.651163F);
      ((Path)localObject1).lineTo(92.860985F, 63.1806F);
      ((Path)localObject1).lineTo(92.860985F, 63.1806F);
      ((Path)localObject1).cubicTo(93.05379F, 63.698135F, 92.79054F, 64.27399F, 92.27301F, 64.46679F);
      ((Path)localObject1).cubicTo(91.96835F, 64.58029F, 91.62753F, 64.538605F, 91.359215F, 64.35502F);
      ((Path)localObject1).lineTo(74.96195F, 53.135838F);
      ((Path)localObject1).lineTo(58.56469F, 64.35502F);
      ((Path)localObject1).lineTo(58.56469F, 64.35502F);
      ((Path)localObject1).cubicTo(58.108883F, 64.666885F, 57.486565F, 64.5502F, 57.174698F, 64.09439F);
      ((Path)localObject1).cubicTo(56.99111F, 63.826077F, 56.949425F, 63.48526F, 57.062923F, 63.1806F);
      ((Path)localObject1).lineTo(74.02487F, 17.651163F);
      ((Path)localObject1).lineTo(74.02487F, 17.651163F);
      ((Path)localObject1).cubicTo(74.21768F, 17.133627F, 74.793526F, 16.870382F, 75.311066F, 17.063189F);
      ((Path)localObject1).cubicTo(75.58311F, 17.164541F, 75.79768F, 17.379114F, 75.89903F, 17.651163F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/df.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */