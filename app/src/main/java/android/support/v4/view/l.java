package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.ViewGroup.MarginLayoutParams;

public final class l
{
  static final a uN = new b();
  
  static
  {
    if (Build.VERSION.SDK_INT >= 17)
    {
      uN = new c();
      return;
    }
  }
  
  public static int a(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    return uN.a(paramMarginLayoutParams);
  }
  
  public static int b(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    return uN.b(paramMarginLayoutParams);
  }
  
  static abstract interface a
  {
    public abstract int a(ViewGroup.MarginLayoutParams paramMarginLayoutParams);
    
    public abstract int b(ViewGroup.MarginLayoutParams paramMarginLayoutParams);
  }
  
  static final class b
    implements l.a
  {
    public final int a(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
    {
      return paramMarginLayoutParams.leftMargin;
    }
    
    public final int b(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
    {
      return paramMarginLayoutParams.rightMargin;
    }
  }
  
  static final class c
    implements l.a
  {
    public final int a(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
    {
      return paramMarginLayoutParams.getMarginStart();
    }
    
    public final int b(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
    {
      return paramMarginLayoutParams.getMarginEnd();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/view/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */