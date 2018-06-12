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

public final class vm
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
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject1 = c.f(paramVarArgs);
      Object localObject3 = c.e(paramVarArgs);
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
      localObject2 = c.a(localPaint, paramVarArgs);
      ((Paint)localObject2).setStrokeWidth(1.0F);
      localCanvas.save();
      localObject2 = c.a((Paint)localObject2, paramVarArgs);
      ((Paint)localObject2).setColor(49462);
      ((Paint)localObject2).setStrokeWidth(4.5F);
      localObject3 = c.a((float[])localObject3, 1.0F, 0.0F, 51.0F, 0.0F, 1.0F, 30.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localPaint = c.a((Paint)localObject2, paramVarArgs);
      Path localPath = c.j(paramVarArgs);
      localPath.moveTo(66.0F, 34.434784F);
      localPath.cubicTo(66.0F, 28.671913F, 61.68265F, 24.0F, 56.357143F, 24.0F);
      localPath.lineTo(21.642857F, 24.0F);
      localPath.cubicTo(16.317348F, 24.0F, 12.0F, 28.671913F, 12.0F, 34.434784F);
      localPath.lineTo(12.0F, 53.217392F);
      localPath.cubicTo(12.0F, 58.272263F, 14.808723F, 62.83148F, 19.120768F, 64.776F);
      localPath.lineTo(31.581991F, 70.39461F);
      localPath.cubicTo(33.932438F, 71.45452F, 36.453564F, 72.0F, 38.99976F, 72.0F);
      localPath.cubicTo(41.545956F, 72.0F, 44.06684F, 71.45426F, 46.417286F, 70.39461F);
      localPath.lineTo(58.87923F, 64.77574F);
      localPath.cubicTo(63.191277F, 62.831738F, 66.0F, 58.272522F, 66.0F, 53.217392F);
      localPath.lineTo(66.0F, 34.434784F);
      localPath.close();
      localCanvas.drawPath(localPath, localPaint);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a((Paint)localObject2, paramVarArgs);
      localPath = c.j(paramVarArgs);
      localPath.moveTo(75.4257F, 110.687675F);
      localPath.lineTo(73.200226F, 91.85187F);
      localPath.cubicTo(72.91933F, 89.473785F, 71.39157F, 87.50228F, 69.306305F, 86.76688F);
      localPath.lineTo(59.5953F, 83.342316F);
      localPath.cubicTo(58.883038F, 83.09111F, 58.113415F, 83.36188F, 57.724117F, 84.010796F);
      localPath.cubicTo(53.699406F, 90.71903F, 46.69817F, 94.887184F, 38.999874F, 94.887184F);
      localPath.cubicTo(31.301687F, 94.887184F, 24.300394F, 90.71887F, 20.275846F, 84.010735F);
      localPath.cubicTo(19.886583F, 83.36188F, 19.116964F, 83.09111F, 18.40462F, 83.34235F);
      localPath.lineTo(8.693676F, 86.766884F);
      localPath.cubicTo(6.6082973F, 87.502266F, 5.080688F, 89.47365F, 4.8007145F, 91.8438F);
      localPath.lineTo(2.526326F, 111.7142F);
      localPath.lineTo(75.4257F, 110.687675F);
      localPath.close();
      localCanvas.drawPath(localPath, localPaint);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a((Paint)localObject2, paramVarArgs);
      localPath = c.j(paramVarArgs);
      localPath.moveTo(69.59223F, 39.91107F);
      localPath.cubicTo(72.38202F, 26.959818F, 73.16859F, 13.377077F, 70.87402F, 9.400347F);
      localPath.lineTo(70.42537F, 8.622779F);
      localPath.lineTo(71.957436F, 2.25F);
      localPath.cubicTo(71.05563F, 2.25F, 69.77039F, 2.25F, 67.84891F, 2.25F);
      localPath.cubicTo(59.72476F, 2.25F, 59.72476F, 2.25F, 46.958237F, 2.25F);
      localPath.cubicTo(46.900265F, 2.25F, 46.778572F, 2.2508101F, 46.597443F, 2.2533023F);
      localPath.cubicTo(46.289677F, 2.2575371F, 45.93099F, 2.2651951F, 45.52568F, 2.2771451F);
      localPath.cubicTo(44.361774F, 2.311462F, 43.062443F, 2.3733463F, 41.66224F, 2.4696746F);
      localPath.cubicTo(37.66796F, 2.7444646F, 33.676857F, 3.2386937F, 29.971664F, 4.0034003F);
      localPath.cubicTo(22.297905F, 5.58717F, 16.9747F, 8.123934F, 15.096029F, 11.449661F);
      localPath.lineTo(14.956052F, 11.697455F);
      localPath.lineTo(13.334339F, 12.584346F);
      localPath.lineTo(13.211527F, 12.591787F);
      localPath.cubicTo(13.197997F, 12.592216F, 13.197997F, 12.592216F, 13.179774F, 12.592619F);
      localPath.cubicTo(13.161227F, 12.592914F, 13.161227F, 12.592914F, 13.15498F, 12.592962F);
      localPath.cubicTo(12.906434F, 12.595112F, 12.53698F, 12.626863F, 11.994384F, 12.738012F);
      localPath.cubicTo(11.085454F, 12.924205F, 10.180191F, 13.260188F, 9.347122F, 13.776304F);
      localPath.cubicTo(6.9136167F, 15.283949F, 5.4373093F, 18.053352F, 5.4373093F, 22.758621F);
      localPath.cubicTo(5.4373093F, 24.597424F, 6.696868F, 30.469868F, 9.174842F, 39.990395F);
      localPath.lineTo(69.59223F, 39.91107F);
      localPath.close();
      localCanvas.drawPath(localPath, localPaint);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a((Paint)localObject2, paramVarArgs);
      localPaint.setStrokeCap(Paint.Cap.ROUND);
      localPaint.setStrokeJoin(Paint.Join.MITER);
      localPath = c.j(paramVarArgs);
      localPath.moveTo(27.041748F, 69.0F);
      localPath.cubicTo(27.872559F, 77.072266F, 26.858643F, 82.59155F, 24.0F, 85.55786F);
      localCanvas.drawPath(localPath, localPaint);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a((Paint)localObject2, paramVarArgs);
      localPaint.setStrokeCap(Paint.Cap.ROUND);
      localPaint.setStrokeJoin(Paint.Join.MITER);
      localObject3 = c.a((float[])localObject3, -1.0F, 0.0F, 105.32238F, 0.0F, 1.0F, 0.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject1);
      localObject1 = c.j(paramVarArgs);
      ((Path)localObject1).moveTo(54.041748F, 69.0F);
      ((Path)localObject1).cubicTo(54.87256F, 77.072266F, 53.858643F, 82.59155F, 51.0F, 85.55786F);
      localCanvas.drawPath((Path)localObject1, localPaint);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramVarArgs);
      localObject3 = c.j(paramVarArgs);
      ((Path)localObject3).moveTo(7.5F, 42.0F);
      ((Path)localObject3).cubicTo(9.985281F, 42.0F, 12.0F, 44.014717F, 12.0F, 46.5F);
      ((Path)localObject3).cubicTo(12.0F, 48.985283F, 9.985281F, 51.0F, 7.5F, 51.0F);
      ((Path)localObject3).cubicTo(5.0147185F, 51.0F, 3.0F, 48.985283F, 3.0F, 46.5F);
      ((Path)localObject3).cubicTo(3.0F, 44.014717F, 5.0147185F, 42.0F, 7.5F, 42.0F);
      ((Path)localObject3).close();
      localCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a((Paint)localObject2, paramVarArgs);
      localObject2 = c.j(paramVarArgs);
      ((Path)localObject2).moveTo(70.5F, 42.0F);
      ((Path)localObject2).cubicTo(72.98528F, 42.0F, 75.0F, 44.014717F, 75.0F, 46.5F);
      ((Path)localObject2).cubicTo(75.0F, 48.985283F, 72.98528F, 51.0F, 70.5F, 51.0F);
      ((Path)localObject2).cubicTo(68.01472F, 51.0F, 66.0F, 48.985283F, 66.0F, 46.5F);
      ((Path)localObject2).cubicTo(66.0F, 44.014717F, 68.01472F, 42.0F, 70.5F, 42.0F);
      ((Path)localObject2).close();
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/vm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */