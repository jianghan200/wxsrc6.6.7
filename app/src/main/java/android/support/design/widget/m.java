package android.support.design.widget;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.support.v4.b.a.a;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

@TargetApi(21)
final class m
  extends k
{
  private InsetDrawable fR;
  private final Interpolator mInterpolator;
  
  m(VisibilityAwareImageButton paramVisibilityAwareImageButton, p paramp)
  {
    super(paramVisibilityAwareImageButton, paramp);
    if (paramVisibilityAwareImageButton.isInEditMode()) {}
    for (paramVisibilityAwareImageButton = null;; paramVisibilityAwareImageButton = AnimationUtils.loadInterpolator(this.fN.getContext(), 17563661))
    {
      this.mInterpolator = paramVisibilityAwareImageButton;
      return;
    }
  }
  
  private Animator a(Animator paramAnimator)
  {
    paramAnimator.setInterpolator(this.mInterpolator);
    return paramAnimator;
  }
  
  final void a(ColorStateList paramColorStateList, PorterDuff.Mode paramMode, int paramInt1, int paramInt2)
  {
    this.fG = a.g(au());
    a.a(this.fG, paramColorStateList);
    if (paramMode != null) {
      a.a(this.fG, paramMode);
    }
    if (paramInt2 > 0) {
      this.fI = a(paramInt2, paramColorStateList);
    }
    for (paramColorStateList = new LayerDrawable(new Drawable[] { this.fI, this.fG });; paramColorStateList = this.fG)
    {
      this.fH = new RippleDrawable(ColorStateList.valueOf(paramInt1), paramColorStateList, null);
      this.fJ = this.fH;
      this.fO.setBackgroundDrawable(this.fH);
      return;
      this.fI = null;
    }
  }
  
  final void al() {}
  
  final void ao()
  {
    as();
  }
  
  final boolean aq()
  {
    return false;
  }
  
  final d at()
  {
    return new e();
  }
  
  final void c(int[] paramArrayOfInt) {}
  
  final void d(Rect paramRect)
  {
    if (this.fO.ak())
    {
      float f1 = this.fO.getRadius();
      float f2 = this.fN.getElevation() + this.fL;
      int i = (int)Math.ceil(o.d(f2, f1, false));
      int j = (int)Math.ceil(o.c(f2, f1, false));
      paramRect.set(i, j, i, j);
      return;
    }
    paramRect.set(0, 0, 0, 0);
  }
  
  final void e(Rect paramRect)
  {
    if (this.fO.ak())
    {
      this.fR = new InsetDrawable(this.fH, paramRect.left, paramRect.top, paramRect.right, paramRect.bottom);
      this.fO.setBackgroundDrawable(this.fR);
      return;
    }
    this.fO.setBackgroundDrawable(this.fH);
  }
  
  public final float getElevation()
  {
    return this.fN.getElevation();
  }
  
  public final void l(float paramFloat)
  {
    this.fN.setElevation(paramFloat);
    if (this.fO.ak()) {
      as();
    }
  }
  
  final void m(float paramFloat)
  {
    StateListAnimator localStateListAnimator = new StateListAnimator();
    localStateListAnimator.addState(PRESSED_ENABLED_STATE_SET, a(ObjectAnimator.ofFloat(this.fN, "translationZ", new float[] { paramFloat })));
    localStateListAnimator.addState(fM, a(ObjectAnimator.ofFloat(this.fN, "translationZ", new float[] { paramFloat })));
    localStateListAnimator.addState(EMPTY_STATE_SET, a(ObjectAnimator.ofFloat(this.fN, "translationZ", new float[] { 0.0F })));
    this.fN.setStateListAnimator(localStateListAnimator);
    if (this.fO.ak()) {
      as();
    }
  }
  
  final void setRippleColor(int paramInt)
  {
    if ((this.fH instanceof RippleDrawable))
    {
      ((RippleDrawable)this.fH).setColor(ColorStateList.valueOf(paramInt));
      return;
    }
    super.setRippleColor(paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/android/support/design/widget/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */