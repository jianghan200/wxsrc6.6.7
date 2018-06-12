package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.ViewConfiguration;

public final class ae
{
  static final e vT = new a();
  
  static
  {
    if (Build.VERSION.SDK_INT >= 14)
    {
      vT = new d();
      return;
    }
    if (Build.VERSION.SDK_INT >= 11)
    {
      vT = new c();
      return;
    }
    if (Build.VERSION.SDK_INT >= 8)
    {
      vT = new b();
      return;
    }
  }
  
  public static int a(ViewConfiguration paramViewConfiguration)
  {
    return vT.a(paramViewConfiguration);
  }
  
  public static boolean b(ViewConfiguration paramViewConfiguration)
  {
    return vT.b(paramViewConfiguration);
  }
  
  static class a
    implements ae.e
  {
    public int a(ViewConfiguration paramViewConfiguration)
    {
      return paramViewConfiguration.getScaledTouchSlop();
    }
    
    public boolean b(ViewConfiguration paramViewConfiguration)
    {
      return true;
    }
  }
  
  static class b
    extends ae.a
  {
    public final int a(ViewConfiguration paramViewConfiguration)
    {
      return paramViewConfiguration.getScaledPagingTouchSlop();
    }
  }
  
  static class c
    extends ae.b
  {
    public boolean b(ViewConfiguration paramViewConfiguration)
    {
      return false;
    }
  }
  
  static final class d
    extends ae.c
  {
    public final boolean b(ViewConfiguration paramViewConfiguration)
    {
      return paramViewConfiguration.hasPermanentMenuKey();
    }
  }
  
  static abstract interface e
  {
    public abstract int a(ViewConfiguration paramViewConfiguration);
    
    public abstract boolean b(ViewConfiguration paramViewConfiguration);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/view/ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */