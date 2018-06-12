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

public final class lq
  extends c
{
  private final int height = 39;
  private final int width = 39;
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 39;
      return 39;
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
      localCanvas.saveLayerAlpha(null, 128, 4);
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-4210753);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -267.0F, 0.0F, 1.0F, -942.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.j(paramVarArgs);
      ((Path)localObject2).moveTo(290.74658F, 962.3673F);
      ((Path)localObject2).lineTo(281.66696F, 950.38226F);
      ((Path)localObject2).cubicTo(281.66696F, 950.38226F, 280.0749F, 947.686F, 281.897F, 946.12305F);
      ((Path)localObject2).cubicTo(285.0006F, 943.46094F, 288.86172F, 945.6186F, 292.41647F, 942.0F);
      ((Path)localObject2).cubicTo(293.6008F, 943.90704F, 293.0603F, 947.8834F, 290.84427F, 948.8545F);
      ((Path)localObject2).cubicTo(288.6282F, 949.82556F, 285.94733F, 949.9153F, 285.94733F, 949.9153F);
      ((Path)localObject2).lineTo(295.2846F, 966.53125F);
      ((Path)localObject2).lineTo(295.0269F, 966.30566F);
      ((Path)localObject2).cubicTo(295.32394F, 967.01917F, 295.48572F, 967.7877F, 295.48572F, 968.5886F);
      ((Path)localObject2).cubicTo(295.48572F, 972.3405F, 291.93597F, 975.38196F, 287.55713F, 975.38196F);
      ((Path)localObject2).cubicTo(283.1783F, 975.38196F, 279.62857F, 972.3405F, 279.62857F, 968.5886F);
      ((Path)localObject2).cubicTo(279.62857F, 964.8368F, 283.1783F, 961.7953F, 287.55713F, 961.7953F);
      ((Path)localObject2).cubicTo(288.6917F, 961.7953F, 289.77066F, 961.9995F, 290.74658F, 962.3673F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(278.57144F, 946.18054F);
      ((Path)localObject2).lineTo(278.57144F, 948.52997F);
      ((Path)localObject2).cubicTo(273.52835F, 951.2919F, 270.1143F, 956.6069F, 270.1143F, 962.7102F);
      ((Path)localObject2).cubicTo(270.1143F, 971.657F, 277.4504F, 978.9097F, 286.5F, 978.9097F);
      ((Path)localObject2).cubicTo(295.5496F, 978.9097F, 302.8857F, 971.657F, 302.8857F, 962.7102F);
      ((Path)localObject2).cubicTo(302.8857F, 957.0437F, 299.94287F, 952.0567F, 295.48572F, 949.1616F);
      ((Path)localObject2).lineTo(295.48572F, 946.719F);
      ((Path)localObject2).cubicTo(301.1608F, 949.8425F, 305.0F, 955.8331F, 305.0F, 962.7102F);
      ((Path)localObject2).cubicTo(305.0F, 972.8114F, 296.71725F, 981.0F, 286.5F, 981.0F);
      ((Path)localObject2).cubicTo(276.28275F, 981.0F, 268.0F, 972.8114F, 268.0F, 962.7102F);
      ((Path)localObject2).cubicTo(268.0F, 955.4142F, 272.3212F, 949.11597F, 278.57144F, 946.18054F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/lq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */