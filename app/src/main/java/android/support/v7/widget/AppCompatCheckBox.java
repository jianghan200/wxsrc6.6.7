package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v4.content.a;
import android.support.v4.widget.t;
import android.support.v7.a.a.a;
import android.util.AttributeSet;
import android.widget.CheckBox;

public class AppCompatCheckBox
  extends CheckBox
  implements t
{
  private h Mb = h.eJ();
  private g Mh = new g(this, this.Mb);
  
  public AppCompatCheckBox(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, a.a.checkboxStyle);
  }
  
  public AppCompatCheckBox(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(am.T(paramContext), paramAttributeSet, paramInt);
    this.Mh.b(paramAttributeSet, paramInt);
  }
  
  public int getCompoundPaddingLeft()
  {
    int j = super.getCompoundPaddingLeft();
    int i = j;
    if (this.Mh != null) {
      i = this.Mh.aU(j);
    }
    return i;
  }
  
  public ColorStateList getSupportButtonTintList()
  {
    if (this.Mh != null) {
      return this.Mh.Mj;
    }
    return null;
  }
  
  public PorterDuff.Mode getSupportButtonTintMode()
  {
    if (this.Mh != null) {
      return this.Mh.Mk;
    }
    return null;
  }
  
  public void setButtonDrawable(int paramInt)
  {
    if (this.Mb != null) {}
    for (Drawable localDrawable = this.Mb.a(getContext(), paramInt, false);; localDrawable = a.f(getContext(), paramInt))
    {
      setButtonDrawable(localDrawable);
      return;
    }
  }
  
  public void setButtonDrawable(Drawable paramDrawable)
  {
    super.setButtonDrawable(paramDrawable);
    if (this.Mh != null) {
      this.Mh.eH();
    }
  }
  
  public void setSupportButtonTintList(ColorStateList paramColorStateList)
  {
    if (this.Mh != null) {
      this.Mh.setSupportButtonTintList(paramColorStateList);
    }
  }
  
  public void setSupportButtonTintMode(PorterDuff.Mode paramMode)
  {
    if (this.Mh != null) {
      this.Mh.setSupportButtonTintMode(paramMode);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/AppCompatCheckBox.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */