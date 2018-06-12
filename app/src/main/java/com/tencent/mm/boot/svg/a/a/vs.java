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

public final class vs
  extends c
{
  private final int height = 180;
  private final int width = 180;
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 180;
      return 180;
      Object localObject1 = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject2 = c.f(paramVarArgs);
      float[] arrayOfFloat = c.e(paramVarArgs);
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
      localObject3 = c.a((Paint)localObject4, paramVarArgs);
      ((Paint)localObject3).setStrokeWidth(1.0F);
      ((Canvas)localObject1).save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 30.0F, 0.0F, 1.0F, 24.0F);
      ((Matrix)localObject2).reset();
      ((Matrix)localObject2).setValues(arrayOfFloat);
      ((Canvas)localObject1).concat((Matrix)localObject2);
      ((Canvas)localObject1).save();
      localObject4 = c.a((Paint)localObject3, paramVarArgs);
      ((Paint)localObject4).setColor(49462);
      ((Paint)localObject4).setStrokeWidth(4.5F);
      Object localObject5 = c.j(paramVarArgs);
      ((Path)localObject5).moveTo(79.795166F, 69.0F);
      ((Path)localObject5).cubicTo(80.84132F, 69.0F, 81.68458F, 69.0F, 82.27852F, 69.0F);
      ((Path)localObject5).cubicTo(88.17543F, 69.0F, 93.0F, 63.923756F, 93.0F, 57.719162F);
      ((Path)localObject5).lineTo(93.0F, 31.08488F);
      ((Path)localObject5).cubicTo(92.99973F, 9.443161F, 77.23633F, 6.1085777F, 77.23633F, 6.1085777F);
      ((Path)localObject5).cubicTo(64.17073F, -3.16201F, 46.449528F, -1.8522556F, 34.69421F, 9.8445635F);
      ((Path)localObject5).cubicTo(28.109148F, 16.402514F, 24.0F, 25.684708F, 24.0F, 35.978374F);
      ((Path)localObject5).cubicTo(24.0F, 43.025726F, 24.0F, 51.499718F, 24.0F, 57.719162F);
      ((Path)localObject5).cubicTo(24.0F, 63.923756F, 28.824574F, 69.0F, 34.72148F, 69.0F);
      ((Path)localObject5).cubicTo(35.315956F, 69.0F, 36.093964F, 69.0F, 37.02466F, 69.0F);
      ((Canvas)localObject1).drawPath((Path)localObject5, (Paint)localObject4);
      ((Canvas)localObject1).restore();
      ((Canvas)localObject1).save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 90.0F, 0.0F, 1.0F, 36.0F);
      ((Matrix)localObject2).reset();
      ((Matrix)localObject2).setValues(arrayOfFloat);
      ((Canvas)localObject1).concat((Matrix)localObject2);
      ((Canvas)localObject1).restore();
      ((Canvas)localObject1).save();
      localObject4 = c.a((Paint)localObject3, paramVarArgs);
      ((Paint)localObject4).setColor(49462);
      ((Paint)localObject4).setStrokeWidth(4.5F);
      localObject5 = c.j(paramVarArgs);
      ((Path)localObject5).moveTo(112.03832F, 129.37389F);
      ((Path)localObject5).cubicTo(111.18502F, 125.1752F, 109.58488F, 117.436F, 106.5941F, 102.82027F);
      ((Path)localObject5).cubicTo(104.8089F, 94.19127F, 99.69263F, 94.09959F, 80.07527F, 88.468895F);
      ((Path)localObject5).lineTo(73.16765F, 83.92315F);
      ((Path)localObject5).cubicTo(73.16765F, 82.2035F, 73.16765F, 79.714485F, 73.16765F, 78.0F);
      ((Path)localObject5).moveTo(47.912327F, 78.0F);
      ((Path)localObject5).cubicTo(47.82817F, 80.086105F, 47.82817F, 81.855F, 47.82817F, 83.92315F);
      ((Path)localObject5).lineTo(40.92027F, 88.46862F);
      ((Path)localObject5).cubicTo(24.830534F, 93.08673F, 52.997284F, 85.00266F, 24.00238F, 93.324234F);
      ((Path)localObject5).cubicTo(18.86542F, 95.22453F, 15.611796F, 96.862564F, 14.401439F, 102.82F);
      ((Path)localObject5).cubicTo(14.397038F, 102.8412F, 10.798364F, 120.13192F, 9.0F, 129.40842F);
      ((Canvas)localObject1).drawPath((Path)localObject5, (Paint)localObject4);
      ((Canvas)localObject1).restore();
      localObject4 = c.j(paramVarArgs);
      ((Path)localObject4).moveTo(0.0F, 129.0F);
      ((Path)localObject4).lineTo(120.0F, 129.0F);
      ((Path)localObject4).lineTo(120.0F, 156.0F);
      ((Path)localObject4).lineTo(0.0F, 156.0F);
      ((Path)localObject4).lineTo(0.0F, 129.0F);
      ((Path)localObject4).close();
      ((Canvas)localObject1).save();
      localObject4 = c.a((Paint)localObject3, paramVarArgs);
      ((Paint)localObject4).setColor(49462);
      ((Paint)localObject4).setStrokeWidth(4.5F);
      ((Paint)localObject4).setStrokeCap(Paint.Cap.ROUND);
      ((Paint)localObject4).setStrokeJoin(Paint.Join.MITER);
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 39.0F, 0.0F, 1.0F, 84.0F);
      ((Matrix)localObject2).reset();
      ((Matrix)localObject2).setValues(arrayOfFloat);
      ((Canvas)localObject1).concat((Matrix)localObject2);
      ((Canvas)localObject1).save();
      localObject5 = c.a((Paint)localObject4, paramVarArgs);
      Path localPath = c.j(paramVarArgs);
      localPath.moveTo(1.5817388F, 4.7485895F);
      localPath.cubicTo(-0.6547393F, 6.723633F, -1.5753936F, 17.91504F, 6.1705556F, 21.007137F);
      localPath.lineTo(21.0F, 24.0F);
      localPath.lineTo(8.367464F, 0.0F);
      localPath.cubicTo(5.861647F, 1.3836222F, 3.5997386F, 2.9664853F, 1.5817388F, 4.7485895F);
      localPath.close();
      ((Canvas)localObject1).drawPath(localPath, (Paint)localObject5);
      ((Canvas)localObject1).restore();
      ((Canvas)localObject1).save();
      localObject4 = c.a((Paint)localObject4, paramVarArgs);
      arrayOfFloat = c.a(arrayOfFloat, -1.0F, 0.0F, 64.542946F, 0.0F, 1.0F, 0.0F);
      ((Matrix)localObject2).reset();
      ((Matrix)localObject2).setValues(arrayOfFloat);
      ((Canvas)localObject1).concat((Matrix)localObject2);
      localObject2 = c.j(paramVarArgs);
      ((Path)localObject2).moveTo(22.58174F, 4.7485895F);
      ((Path)localObject2).cubicTo(20.34526F, 6.723633F, 19.424606F, 17.91504F, 27.170555F, 21.007137F);
      ((Path)localObject2).lineTo(43.542942F, 24.0F);
      ((Path)localObject2).lineTo(29.367464F, 0.0F);
      ((Path)localObject2).cubicTo(26.861647F, 1.3836222F, 24.59974F, 2.9664853F, 22.58174F, 4.7485895F);
      ((Path)localObject2).close();
      ((Canvas)localObject1).drawPath((Path)localObject2, (Paint)localObject4);
      ((Canvas)localObject1).restore();
      ((Canvas)localObject1).restore();
      ((Canvas)localObject1).save();
      localObject2 = c.a((Paint)localObject3, paramVarArgs);
      ((Paint)localObject2).setColor(49462);
      ((Paint)localObject2).setStrokeWidth(4.5F);
      localObject3 = c.j(paramVarArgs);
      ((Path)localObject3).moveTo(34.500023F, 36.49006F);
      ((Path)localObject3).cubicTo(34.504597F, 48.431625F, 34.48657F, 55.138245F, 34.529358F, 55.76485F);
      ((Path)localObject3).cubicTo(35.96001F, 75.170944F, 53.725014F, 85.20811F, 68.90725F, 79.32616F);
      ((Path)localObject3).cubicTo(78.674225F, 75.54389F, 85.479774F, 65.79335F, 85.479774F, 54.535385F);
      ((Path)localObject3).lineTo(85.479774F, 36.49006F);
      ((Path)localObject3).cubicTo(85.479774F, 36.49006F, 85.92921F, 29.304337F, 82.59075F, 23.124592F);
      ((Path)localObject3).cubicTo(81.47551F, 21.060392F, 78.91831F, 20.371489F, 76.98925F, 21.632803F);
      ((Path)localObject3).cubicTo(73.35449F, 24.009048F, 66.35759F, 27.091797F, 56.498043F, 24.820032F);
      ((Path)localObject3).cubicTo(41.507687F, 21.365734F, 34.500023F, 36.49006F, 34.500023F, 36.49006F);
      ((Path)localObject3).close();
      ((Canvas)localObject1).drawPath((Path)localObject3, (Paint)localObject2);
      ((Canvas)localObject1).restore();
      ((Canvas)localObject1).restore();
      localObject1 = c.j(paramVarArgs);
      ((Path)localObject1).moveTo(75.0F, 132.0F);
      ((Path)localObject1).lineTo(105.0F, 132.0F);
      ((Path)localObject1).lineTo(105.0F, 141.0F);
      ((Path)localObject1).lineTo(75.0F, 141.0F);
      ((Path)localObject1).lineTo(75.0F, 132.0F);
      ((Path)localObject1).close();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/vs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */