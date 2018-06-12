package android.support.v4.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.widget.CompoundButton;

public final class c
{
  private static final c yL = new b();
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 23)
    {
      yL = new a();
      return;
    }
    if (i >= 21)
    {
      yL = new d();
      return;
    }
  }
  
  public static Drawable a(CompoundButton paramCompoundButton)
  {
    return yL.a(paramCompoundButton);
  }
  
  public static void a(CompoundButton paramCompoundButton, ColorStateList paramColorStateList)
  {
    yL.a(paramCompoundButton, paramColorStateList);
  }
  
  public static void a(CompoundButton paramCompoundButton, PorterDuff.Mode paramMode)
  {
    yL.a(paramCompoundButton, paramMode);
  }
  
  static final class a
    extends c.d
  {
    public final Drawable a(CompoundButton paramCompoundButton)
    {
      return paramCompoundButton.getButtonDrawable();
    }
  }
  
  static class b
    implements c.c
  {
    public Drawable a(CompoundButton paramCompoundButton)
    {
      return d.a(paramCompoundButton);
    }
    
    public void a(CompoundButton paramCompoundButton, ColorStateList paramColorStateList)
    {
      if ((paramCompoundButton instanceof t)) {
        ((t)paramCompoundButton).setSupportButtonTintList(paramColorStateList);
      }
    }
    
    public void a(CompoundButton paramCompoundButton, PorterDuff.Mode paramMode)
    {
      if ((paramCompoundButton instanceof t)) {
        ((t)paramCompoundButton).setSupportButtonTintMode(paramMode);
      }
    }
  }
  
  static abstract interface c
  {
    public abstract Drawable a(CompoundButton paramCompoundButton);
    
    public abstract void a(CompoundButton paramCompoundButton, ColorStateList paramColorStateList);
    
    public abstract void a(CompoundButton paramCompoundButton, PorterDuff.Mode paramMode);
  }
  
  static class d
    extends c.b
  {
    public final void a(CompoundButton paramCompoundButton, ColorStateList paramColorStateList)
    {
      paramCompoundButton.setButtonTintList(paramColorStateList);
    }
    
    public final void a(CompoundButton paramCompoundButton, PorterDuff.Mode paramMode)
    {
      paramCompoundButton.setButtonTintMode(paramMode);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/widget/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */