package com.tencent.mm.plugin.sns.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Camera;
import android.graphics.Matrix;
import android.util.DisplayMetrics;
import android.view.animation.Animation;
import android.view.animation.Transformation;

public final class a
  extends Animation
{
  private final float bwC;
  private final float bwD;
  private Context context;
  private final float omK;
  private final float omL;
  private final float omM;
  private final boolean omN;
  private Camera omO;
  private float scale = 1.0F;
  
  public a(Context paramContext, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, boolean paramBoolean)
  {
    this.context = paramContext;
    this.omK = paramFloat1;
    this.omL = paramFloat2;
    this.bwC = paramFloat3;
    this.bwD = paramFloat4;
    this.omM = 150.0F;
    this.omN = paramBoolean;
    this.scale = paramContext.getResources().getDisplayMetrics().density;
  }
  
  protected final void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    float f1 = this.omK;
    float f2 = this.omL;
    float f3 = this.omK;
    float f4 = this.bwC;
    float f5 = this.bwD;
    Object localObject = this.omO;
    paramTransformation = paramTransformation.getMatrix();
    ((Camera)localObject).save();
    if (this.omN) {
      ((Camera)localObject).translate(0.0F, 0.0F, this.omM * paramFloat);
    }
    for (;;)
    {
      ((Camera)localObject).rotateY(f1 + (f2 - f3) * paramFloat);
      ((Camera)localObject).getMatrix(paramTransformation);
      ((Camera)localObject).restore();
      localObject = new float[9];
      Object tmp98_96 = localObject;
      tmp98_96[0] = 0.0F;
      Object tmp102_98 = tmp98_96;
      tmp102_98[1] = 0.0F;
      Object tmp106_102 = tmp102_98;
      tmp106_102[2] = 0.0F;
      Object tmp110_106 = tmp106_102;
      tmp110_106[3] = 0.0F;
      Object tmp114_110 = tmp110_106;
      tmp114_110[4] = 0.0F;
      Object tmp118_114 = tmp114_110;
      tmp118_114[5] = 0.0F;
      Object tmp122_118 = tmp118_114;
      tmp122_118[6] = 0.0F;
      Object tmp127_122 = tmp122_118;
      tmp127_122[7] = 0.0F;
      Object tmp132_127 = tmp127_122;
      tmp132_127[8] = 0.0F;
      tmp132_127;
      paramTransformation.getValues((float[])localObject);
      localObject[6] /= this.scale;
      paramTransformation.setValues((float[])localObject);
      paramTransformation.preTranslate(-f4, -f5);
      paramTransformation.postTranslate(f4, f5);
      return;
      ((Camera)localObject).translate(0.0F, 0.0F, this.omM * (1.0F - paramFloat));
    }
  }
  
  public final void initialize(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.initialize(paramInt1, paramInt2, paramInt3, paramInt4);
    this.omO = new Camera();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/widget/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */