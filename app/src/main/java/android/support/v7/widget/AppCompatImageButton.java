package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v4.view.x;
import android.support.v7.a.a.a;
import android.util.AttributeSet;
import android.widget.ImageButton;

public class AppCompatImageButton
  extends ImageButton
  implements x
{
  private f Mc;
  private i fn;
  
  public AppCompatImageButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, a.a.imageButtonStyle);
  }
  
  public AppCompatImageButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(am.T(paramContext), paramAttributeSet, paramInt);
    paramContext = h.eJ();
    this.Mc = new f(this, paramContext);
    this.Mc.b(paramAttributeSet, paramInt);
    this.fn = new i(this, paramContext);
    this.fn.b(paramAttributeSet, paramInt);
  }
  
  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    if (this.Mc != null) {
      this.Mc.eG();
    }
  }
  
  public ColorStateList getSupportBackgroundTintList()
  {
    if (this.Mc != null) {
      return this.Mc.getSupportBackgroundTintList();
    }
    return null;
  }
  
  public PorterDuff.Mode getSupportBackgroundTintMode()
  {
    if (this.Mc != null) {
      return this.Mc.getSupportBackgroundTintMode();
    }
    return null;
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable)
  {
    super.setBackgroundDrawable(paramDrawable);
    if (this.Mc != null) {
      this.Mc.b(null);
    }
  }
  
  public void setBackgroundResource(int paramInt)
  {
    super.setBackgroundResource(paramInt);
    if (this.Mc != null) {
      this.Mc.aT(paramInt);
    }
  }
  
  public void setImageResource(int paramInt)
  {
    this.fn.setImageResource(paramInt);
  }
  
  public void setSupportBackgroundTintList(ColorStateList paramColorStateList)
  {
    if (this.Mc != null) {
      this.Mc.setSupportBackgroundTintList(paramColorStateList);
    }
  }
  
  public void setSupportBackgroundTintMode(PorterDuff.Mode paramMode)
  {
    if (this.Mc != null) {
      this.Mc.setSupportBackgroundTintMode(paramMode);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/AppCompatImageButton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */