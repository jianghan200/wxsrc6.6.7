package android.support.design.widget;

import android.support.v4.view.z;
import android.view.ViewPropertyAnimator;

class k
  extends j
{
  private boolean fx;
  
  k(VisibilityAwareImageButton paramVisibilityAwareImageButton, p paramp)
  {
    super(paramVisibilityAwareImageButton, paramp);
  }
  
  final void am()
  {
    if ((this.fx) || (this.fN.getVisibility() != 0)) {
      return;
    }
    if ((!z.ai(this.fN)) || (this.fN.isInEditMode()))
    {
      this.fN.i(8, false);
      return;
    }
    this.fN.animate().cancel();
    this.fN.animate().scaleX(0.0F).scaleY(0.0F).alpha(0.0F).setDuration(200L).setInterpolator(a.bN).setListener(new k.1(this));
  }
  
  final void an()
  {
    if ((this.fx) || (this.fN.getVisibility() != 0))
    {
      if ((z.ai(this.fN)) && (!this.fN.isInEditMode()))
      {
        this.fN.animate().cancel();
        if (this.fN.getVisibility() != 0)
        {
          this.fN.setAlpha(0.0F);
          this.fN.setScaleY(0.0F);
          this.fN.setScaleX(0.0F);
        }
        this.fN.animate().scaleX(1.0F).scaleY(1.0F).alpha(1.0F).setDuration(200L).setInterpolator(a.bO).setListener(new k.2(this));
      }
    }
    else {
      return;
    }
    this.fN.i(0, false);
    this.fN.setAlpha(1.0F);
    this.fN.setScaleY(1.0F);
    this.fN.setScaleX(1.0F);
  }
  
  boolean aq()
  {
    return true;
  }
  
  final void ar()
  {
    float f1 = this.fN.getRotation();
    Object localObject;
    if (this.fy != null)
    {
      localObject = this.fy;
      float f2 = -f1;
      if (((o)localObject).cY != f2)
      {
        ((o)localObject).cY = f2;
        ((o)localObject).invalidateSelf();
      }
    }
    if (this.fI != null)
    {
      localObject = this.fI;
      f1 = -f1;
      if (f1 != ((d)localObject).cY)
      {
        ((d)localObject).cY = f1;
        ((d)localObject).invalidateSelf();
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/android/support/design/widget/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */