package com.tencent.mm.plugin.bottle.ui;

import android.content.Context;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ImageView;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.a;

public class BallonImageView
  extends ImageView
{
  private Animation hkg = new Animation()
  {
    private int ftm;
    private int ftn;
    private float hkh = 0.1F;
    private float hki = E(0.1F, 0.8F);
    private float hkj = 0.1F;
    private float hkk = E(0.1F, 0.3F);
    private float hkl = 1.0F;
    private float hkm = E(0.7F, 1.0F);
    private float hkn;
    private float hko;
    private float hkp;
    private float hkq;
    
    private static float E(float paramAnonymousFloat1, float paramAnonymousFloat2)
    {
      return (float)Math.random() * (paramAnonymousFloat2 - paramAnonymousFloat1) + paramAnonymousFloat1;
    }
    
    private void aum()
    {
      this.hkn = (this.hkh * this.ftm);
      this.hko = (this.hki * this.ftm);
      this.hkp = (this.hkj * this.ftn);
      this.hkq = (this.hkk * this.ftn);
    }
    
    protected final void applyTransformation(float paramAnonymousFloat, Transformation paramAnonymousTransformation)
    {
      float f1 = this.hkn;
      float f2 = this.hkp;
      if (this.hkn != this.hko) {
        f1 = this.hkn + (this.hko - this.hkn) * paramAnonymousFloat;
      }
      if (this.hkp != this.hkq) {
        f2 = this.hkp + (this.hkq - this.hkp) * paramAnonymousFloat;
      }
      paramAnonymousTransformation.getMatrix().setTranslate(f1, f2);
      f1 = this.hkl + (this.hkm - this.hkl) * paramAnonymousFloat;
      paramAnonymousTransformation.getMatrix().postScale(f1, f1);
      if (paramAnonymousFloat == 1.0F)
      {
        this.hkh = this.hki;
        this.hkj = this.hkk;
        this.hki = E(0.1F, 0.8F);
        this.hkk = E(0.1F, 0.3F);
        this.hkl = this.hkm;
        this.hkm = E(0.7F, 1.0F);
        aum();
      }
    }
    
    public final void initialize(int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3, int paramAnonymousInt4)
    {
      super.initialize(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousInt3, paramAnonymousInt4);
      this.ftm = paramAnonymousInt3;
      this.ftn = paramAnonymousInt4;
      aum();
    }
  };
  
  public BallonImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.hkg.setRepeatCount(-1);
    this.hkg.setDuration(15000L);
    this.hkg.setFillAfter(true);
  }
  
  public BallonImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.hkg.setRepeatCount(-1);
    this.hkg.setDuration(15000L);
    this.hkg.setFillAfter(true);
  }
  
  public void setVisibility(int paramInt)
  {
    if (paramInt == 0) {
      setAnimation(this.hkg);
    }
    for (;;)
    {
      super.setVisibility(paramInt);
      return;
      BackwardSupportUtil.a.c(this, this.hkg);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/bottle/ui/BallonImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */