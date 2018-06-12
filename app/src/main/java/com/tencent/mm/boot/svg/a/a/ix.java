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

public final class ix
  extends c
{
  private final int height = 96;
  private final int width = 96;
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 96;
      return 96;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject1 = c.f(paramVarArgs);
      float[] arrayOfFloat = c.e(paramVarArgs);
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
      c.a(localPaint, paramVarArgs).setStrokeWidth(1.0F);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 12.0F, 0.0F, 1.0F, 12.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a((Paint)localObject2, paramVarArgs);
      ((Paint)localObject2).setColor(-8683387);
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 18.0F, 0.0F, 1.0F, 8.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramVarArgs);
      localObject2 = c.j(paramVarArgs);
      ((Path)localObject2).moveTo(16.3293F, 71.9602F);
      ((Path)localObject2).cubicTo(13.4363F, 68.3632F, 11.7613F, 63.5762F, 11.7333F, 58.8262F);
      ((Path)localObject2).cubicTo(11.7123F, 55.3172F, 9.3753F, 52.2362F, 6.6693F, 48.6682F);
      ((Path)localObject2).cubicTo(6.0453F, 47.8462F, 5.4243F, 47.0262F, 4.8313F, 46.2012F);
      ((Path)localObject2).cubicTo(1.7113F, 41.8592F, 0.0413F, 36.3052F, 3.0E-4F, 30.1402F);
      ((Path)localObject2).cubicTo(-0.0897F, 16.2672F, 9.4763F, 3.9412F, 22.7473F, 0.8312F);
      ((Path)localObject2).cubicTo(31.8983F, -1.3138F, 41.2843F, 0.7372F, 48.4973F, 6.4552F);
      ((Path)localObject2).cubicTo(55.7073F, 12.1712F, 59.8433F, 20.7212F, 59.8433F, 29.9132F);
      ((Path)localObject2).cubicTo(59.8433F, 35.8332F, 58.1123F, 41.5582F, 54.8373F, 46.4712F);
      ((Path)localObject2).lineTo(47.3483F, 41.4782F);
      ((Path)localObject2).cubicTo(49.6353F, 38.0492F, 50.8433F, 34.0502F, 50.8433F, 29.9132F);
      ((Path)localObject2).cubicTo(50.8433F, 23.4862F, 47.9503F, 17.5062F, 42.9063F, 13.5082F);
      ((Path)localObject2).cubicTo(37.8603F, 9.5082F, 31.2613F, 8.0822F, 24.8013F, 9.5942F);
      ((Path)localObject2).cubicTo(15.5823F, 11.7542F, 8.9373F, 20.3702F, 9.0003F, 30.0812F);
      ((Path)localObject2).cubicTo(9.0293F, 34.3712F, 10.1153F, 38.1302F, 12.1403F, 40.9502F);
      ((Path)localObject2).cubicTo(12.6883F, 41.7122F, 13.2633F, 42.4692F, 13.8393F, 43.2292F);
      ((Path)localObject2).cubicTo(17.0523F, 47.4652F, 20.6943F, 52.2662F, 20.7333F, 58.7732F);
      ((Path)localObject2).cubicTo(20.7353F, 59.2312F, 20.9243F, 69.9922F, 31.7853F, 69.9922F);
      ((Path)localObject2).cubicTo(38.5203F, 69.9922F, 40.5293F, 65.0932F, 41.1263F, 62.1732F);
      ((Path)localObject2).cubicTo(42.2533F, 56.6692F, 38.7963F, 52.3462F, 31.1283F, 49.6692F);
      ((Path)localObject2).cubicTo(21.6763F, 46.0542F, 16.3273F, 38.8702F, 16.3273F, 29.9132F);
      ((Path)localObject2).cubicTo(16.3273F, 21.8642F, 22.0113F, 16.2422F, 30.1513F, 16.2422F);
      ((Path)localObject2).cubicTo(37.4623F, 16.2422F, 43.4103F, 22.3752F, 43.4103F, 29.9132F);
      ((Path)localObject2).cubicTo(43.4103F, 34.2002F, 41.3043F, 36.9812F, 40.5103F, 38.0272F);
      ((Path)localObject2).lineTo(32.939453F, 33.42163F);
      ((Path)localObject2).cubicTo(34.1613F, 32.040527F, 34.4103F, 31.1762F, 34.4103F, 29.9132F);
      ((Path)localObject2).cubicTo(34.4103F, 27.6672F, 33.214844F, 25.261963F, 30.0F, 25.261963F);
      ((Path)localObject2).cubicTo(26.785156F, 25.261963F, 25.3273F, 27.509521F, 25.3273F, 29.9132F);
      ((Path)localObject2).cubicTo(25.3273F, 36.4132F, 30.1173F, 39.6352F, 34.1613F, 41.1962F);
      ((Path)localObject2).cubicTo(51.8603F, 47.4082F, 50.7173F, 60.2012F, 49.9443F, 63.9782F);
      ((Path)localObject2).cubicTo(48.0473F, 73.2392F, 41.0893F, 78.9922F, 31.7853F, 78.9922F);
      ((Path)localObject2).cubicTo(23.6863F, 78.9922F, 18.9103F, 75.1682F, 16.3293F, 71.9602F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/ix.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */