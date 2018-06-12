package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.b.a.a;
import android.support.v4.widget.c;
import android.support.v7.a.a.k;
import android.util.AttributeSet;
import android.widget.CompoundButton;

final class g
{
  private final h Mb;
  private final CompoundButton Mi;
  ColorStateList Mj = null;
  PorterDuff.Mode Mk = null;
  private boolean Ml = false;
  private boolean Mm = false;
  private boolean Mn;
  
  g(CompoundButton paramCompoundButton, h paramh)
  {
    this.Mi = paramCompoundButton;
    this.Mb = paramh;
  }
  
  private void eI()
  {
    Drawable localDrawable = c.a(this.Mi);
    if ((localDrawable != null) && ((this.Ml) || (this.Mm)))
    {
      localDrawable = a.g(localDrawable).mutate();
      if (this.Ml) {
        a.a(localDrawable, this.Mj);
      }
      if (this.Mm) {
        a.a(localDrawable, this.Mk);
      }
      if (localDrawable.isStateful()) {
        localDrawable.setState(this.Mi.getDrawableState());
      }
      this.Mi.setButtonDrawable(localDrawable);
    }
  }
  
  final int aU(int paramInt)
  {
    int i = paramInt;
    if (Build.VERSION.SDK_INT < 17)
    {
      Drawable localDrawable = c.a(this.Mi);
      i = paramInt;
      if (localDrawable != null) {
        i = paramInt + localDrawable.getIntrinsicWidth();
      }
    }
    return i;
  }
  
  final void b(AttributeSet paramAttributeSet, int paramInt)
  {
    paramAttributeSet = this.Mi.getContext().obtainStyledAttributes(paramAttributeSet, a.k.CompoundButton, paramInt, 0);
    try
    {
      if (paramAttributeSet.hasValue(a.k.CompoundButton_android_button))
      {
        paramInt = paramAttributeSet.getResourceId(a.k.CompoundButton_android_button, 0);
        if (paramInt != 0) {
          this.Mi.setButtonDrawable(this.Mb.a(this.Mi.getContext(), paramInt, false));
        }
      }
      if (paramAttributeSet.hasValue(a.k.CompoundButton_buttonTint)) {
        c.a(this.Mi, paramAttributeSet.getColorStateList(a.k.CompoundButton_buttonTint));
      }
      if (paramAttributeSet.hasValue(a.k.CompoundButton_buttonTintMode)) {
        c.a(this.Mi, w.aZ(paramAttributeSet.getInt(a.k.CompoundButton_buttonTintMode, -1)));
      }
      return;
    }
    finally
    {
      paramAttributeSet.recycle();
    }
  }
  
  final void eH()
  {
    if (this.Mn)
    {
      this.Mn = false;
      return;
    }
    this.Mn = true;
    eI();
  }
  
  final void setSupportButtonTintList(ColorStateList paramColorStateList)
  {
    this.Mj = paramColorStateList;
    this.Ml = true;
    eI();
  }
  
  final void setSupportButtonTintMode(PorterDuff.Mode paramMode)
  {
    this.Mk = paramMode;
    this.Mm = true;
    eI();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */