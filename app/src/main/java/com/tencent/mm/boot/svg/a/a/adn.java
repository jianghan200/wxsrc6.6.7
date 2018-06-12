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

public final class adn
  extends c
{
  private final int height = 48;
  private final int width = 48;
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 48;
      return 48;
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
      localObject3 = c.a((float[])localObject3, 1.0F, 0.0F, -57.0F, 0.0F, 1.0F, -426.0F);
      ((Matrix)localObject2).reset();
      ((Matrix)localObject2).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject2);
      localCanvas.save();
      localObject3 = c.a((float[])localObject3, 1.0F, 0.0F, 57.0F, 0.0F, 1.0F, 426.0F);
      ((Matrix)localObject2).reset();
      ((Matrix)localObject2).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject2);
      localCanvas.save();
      localObject3 = c.a((float[])localObject3, 1.0F, 0.0F, 2.0F, 0.0F, 1.0F, 1.0F);
      ((Matrix)localObject2).reset();
      ((Matrix)localObject2).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject2);
      localObject2 = c.a(localPaint, paramVarArgs);
      ((Paint)localObject2).setColor(421178649);
      localCanvas.save();
      localObject2 = c.a((Paint)localObject2, paramVarArgs);
      localObject3 = c.j(paramVarArgs);
      ((Path)localObject3).moveTo(0.0F, 22.0F);
      ((Path)localObject3).cubicTo(0.008455056F, 16.672909F, 0.0F, 11.917717F, 0.0F, 6.0F);
      ((Path)localObject3).cubicTo(5.9540505F, 4.1088686F, 12.507443F, 1.9538383F, 22.0F, 0.0F);
      ((Path)localObject3).cubicTo(30.492556F, 1.9538383F, 37.045948F, 4.1088686F, 43.0F, 6.0F);
      ((Path)localObject3).cubicTo(43.0F, 11.917717F, 42.991547F, 16.672909F, 43.0F, 22.0F);
      ((Path)localObject3).cubicTo(42.991547F, 35.808678F, 30.947437F, 43.57803F, 21.0F, 46.0F);
      ((Path)localObject3).cubicTo(12.052562F, 43.57803F, 0.008455056F, 35.808678F, 0.0F, 22.0F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject1, paramVarArgs);
      ((Paint)localObject1).setColor(-15028967);
      ((Paint)localObject1).setStrokeWidth(3.0F);
      localObject2 = c.j(paramVarArgs);
      ((Path)localObject2).moveTo(1.5000008F, 22.00073F);
      ((Path)localObject2).cubicTo(1.5075872F, 32.99103F, 10.078676F, 41.353813F, 21.020136F, 44.449203F);
      ((Path)localObject2).cubicTo(32.69469F, 41.47724F, 41.49317F, 33.14895F, 41.5F, 22.00238F);
      ((Path)localObject2).cubicTo(41.497402F, 20.365496F, 41.496265F, 18.710062F, 41.496243F, 16.854805F);
      ((Path)localObject2).cubicTo(41.496227F, 15.422399F, 41.49664F, 14.398892F, 41.498123F, 11.593655F);
      ((Path)localObject2).cubicTo(41.499176F, 9.594675F, 41.499725F, 8.331651F, 41.499916F, 7.096765F);
      ((Path)localObject2).cubicTo(40.838436F, 6.8861384F, 40.11861F, 6.6568284F, 39.97149F, 6.610029F);
      ((Path)localObject2).cubicTo(38.935696F, 6.2805448F, 38.116764F, 6.0216136F, 37.30908F, 5.7688565F);
      ((Path)localObject2).cubicTo(35.25496F, 5.1260386F, 33.440895F, 4.576554F, 31.62486F, 4.051996F);
      ((Path)localObject2).cubicTo(28.394964F, 3.1190488F, 25.252028F, 2.293892F, 21.982248F, 1.5354043F);
      ((Path)localObject2).cubicTo(18.317486F, 2.296731F, 14.915536F, 3.1245034F, 11.540995F, 4.056751F);
      ((Path)localObject2).cubicTo(8.388927F, 4.927538F, 7.122994F, 5.313002F, 1.5000832F, 7.0975056F);
      ((Path)localObject2).cubicTo(1.5002767F, 8.332155F, 1.500823F, 9.595075F, 1.5018787F, 11.593655F);
      ((Path)localObject2).cubicTo(1.5033605F, 14.398892F, 1.5037745F, 15.422399F, 1.5037575F, 16.854805F);
      ((Path)localObject2).cubicTo(1.5037354F, 18.709438F, 1.5025969F, 20.364384F, 1.5000007F, 22.00073F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(1.5000007F, 22.00073F);
      ((Path)localObject2).cubicTo(1.4999999F, 22.001282F, 1.4999989F, 22.001831F, 1.4999981F, 22.00238F);
      ((Path)localObject2).lineTo(1.4999998F, 21.99908F);
      ((Path)localObject2).cubicTo(1.5000001F, 21.999632F, 1.5000004F, 22.000181F, 1.5000008F, 22.00073F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-15028967);
      localObject1 = c.j(paramVarArgs);
      ((Path)localObject1).moveTo(13.085647F, 10.3166275F);
      ((Path)localObject1).lineTo(23.235413F, 10.3166275F);
      ((Path)localObject1).cubicTo(25.576914F, 10.3166275F, 27.333014F, 10.822622F, 28.503765F, 11.834627F);
      ((Path)localObject1).cubicTo(29.674515F, 12.846633F, 30.259882F, 14.255481F, 30.259882F, 16.061216F);
      ((Path)localObject1).cubicTo(30.259882F, 17.073221F, 30.111061F, 17.911585F, 29.813412F, 18.576334F);
      ((Path)localObject1).cubicTo(29.515762F, 19.241081F, 29.168512F, 19.77684F, 28.771646F, 20.183628F);
      ((Path)localObject1).cubicTo(28.374783F, 20.590414F, 27.982883F, 20.883097F, 27.595942F, 21.061686F);
      ((Path)localObject1).cubicTo(27.208998F, 21.240276F, 26.926237F, 21.359333F, 26.747646F, 21.418863F);
      ((Path)localObject1).lineTo(26.747646F, 21.478392F);
      ((Path)localObject1).cubicTo(27.065138F, 21.518078F, 27.407429F, 21.617292F, 27.774529F, 21.77604F);
      ((Path)localObject1).cubicTo(28.14163F, 21.934786F, 28.48392F, 22.187782F, 28.801413F, 22.53504F);
      ((Path)localObject1).cubicTo(29.118904F, 22.882296F, 29.381823F, 23.333723F, 29.590176F, 23.889334F);
      ((Path)localObject1).cubicTo(29.79853F, 24.444944F, 29.902706F, 25.139446F, 29.902706F, 25.972862F);
      ((Path)localObject1).cubicTo(29.902706F, 27.222986F, 29.99696F, 28.358995F, 30.18547F, 29.380922F);
      ((Path)localObject1).cubicTo(30.373981F, 30.402847F, 30.666664F, 31.132076F, 31.06353F, 31.568628F);
      ((Path)localObject1).lineTo(27.075058F, 31.568628F);
      ((Path)localObject1).cubicTo(26.797253F, 31.112232F, 26.633549F, 30.606237F, 26.58394F, 30.050627F);
      ((Path)localObject1).cubicTo(26.534332F, 29.495016F, 26.50953F, 28.959257F, 26.50953F, 28.443333F);
      ((Path)localObject1).cubicTo(26.50953F, 27.471014F, 26.45F, 26.63265F, 26.33094F, 25.928215F);
      ((Path)localObject1).cubicTo(26.211882F, 25.223782F, 25.993608F, 24.638414F, 25.676117F, 24.172098F);
      ((Path)localObject1).cubicTo(25.358625F, 23.705782F, 24.927042F, 23.363491F, 24.381353F, 23.145216F);
      ((Path)localObject1).cubicTo(23.835665F, 22.92694F, 23.1362F, 22.817804F, 22.282942F, 22.817804F);
      ((Path)localObject1).lineTo(16.806234F, 22.817804F);
      ((Path)localObject1).lineTo(16.806234F, 31.568628F);
      ((Path)localObject1).lineTo(13.085647F, 31.568628F);
      ((Path)localObject1).lineTo(13.085647F, 10.3166275F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(16.806234F, 19.990156F);
      ((Path)localObject1).lineTo(22.908F, 19.990156F);
      ((Path)localObject1).cubicTo(24.098595F, 19.990156F, 25.001448F, 19.707396F, 25.616589F, 19.141863F);
      ((Path)localObject1).cubicTo(26.23173F, 18.57633F, 26.539293F, 17.728045F, 26.539293F, 16.596981F);
      ((Path)localObject1).cubicTo(26.539293F, 15.922311F, 26.440079F, 15.371669F, 26.241648F, 14.945039F);
      ((Path)localObject1).cubicTo(26.043215F, 14.51841F, 25.770374F, 14.18604F, 25.423117F, 13.947922F);
      ((Path)localObject1).cubicTo(25.075861F, 13.709803F, 24.679003F, 13.551059F, 24.232529F, 13.471686F);
      ((Path)localObject1).cubicTo(23.786057F, 13.392313F, 23.324709F, 13.352628F, 22.84847F, 13.352628F);
      ((Path)localObject1).lineTo(16.806234F, 13.352628F);
      ((Path)localObject1).lineTo(16.806234F, 19.990156F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/adn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */