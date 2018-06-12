package com.tencent.mm.b;

import android.animation.Animator.AnimatorListener;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.animation.LinearInterpolator;
import com.tencent.mm.d.c;
import com.tencent.mm.sdk.platformtools.x;

public final class a
  extends b
{
  private int bwf = 200;
  private ValueAnimator bwg;
  c bwh;
  public float bwi;
  public float bwj;
  public float bwk;
  public Rect bwl;
  public RectF bwm;
  Matrix bwn;
  public long bwo = 0L;
  public Animator.AnimatorListener bwp;
  
  public a(c paramc)
  {
    this.bwh = paramc;
    this.bwn = new Matrix();
    this.bwm = new RectF();
  }
  
  public final void cancel()
  {
    x.d("MicroMsg.CropActionUpAnim", "[cancel]");
    this.bwu = false;
    this.bwt = true;
    if (this.bwg != null) {
      this.bwg.cancel();
    }
  }
  
  public final void play()
  {
    x.i("MicroMsg.CropActionUpAnim", "[play]");
    if (!this.bwt) {
      return;
    }
    this.bwu = false;
    this.bwt = false;
    this.bwg = ValueAnimator.ofPropertyValuesHolder(new PropertyValuesHolder[] { PropertyValuesHolder.ofFloat("scale", new float[] { 1.0F, this.bwi }), PropertyValuesHolder.ofFloat("deltaX", new float[] { 0.0F, this.bwj }), PropertyValuesHolder.ofFloat("deltaY", new float[] { 0.0F, this.bwk }), PropertyValuesHolder.ofFloat("background_alpha", new float[] { 0.0F, 255.0F }) });
    this.bwg.addUpdateListener(new a.1(this));
    this.bwg.addListener(new a.2(this));
    this.bwg.setInterpolator(new LinearInterpolator());
    this.bwg.setDuration(this.bwf);
    this.bwg.setStartDelay(this.bwo);
    this.bwg.start();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */