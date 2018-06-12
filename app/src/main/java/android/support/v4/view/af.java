package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.ViewGroup;

public final class af
{
  static final c vU = new f();
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 21)
    {
      vU = new e();
      return;
    }
    if (i >= 18)
    {
      vU = new d();
      return;
    }
    if (i >= 14)
    {
      vU = new b();
      return;
    }
    if (i >= 11)
    {
      vU = new a();
      return;
    }
  }
  
  public static void d(ViewGroup paramViewGroup)
  {
    vU.d(paramViewGroup);
  }
  
  static class a
    extends af.f
  {
    public final void d(ViewGroup paramViewGroup)
    {
      paramViewGroup.setMotionEventSplittingEnabled(false);
    }
  }
  
  static class b
    extends af.a
  {}
  
  static abstract interface c
  {
    public abstract void d(ViewGroup paramViewGroup);
  }
  
  static class d
    extends af.b
  {}
  
  static final class e
    extends af.d
  {}
  
  static class f
    implements af.c
  {
    public void d(ViewGroup paramViewGroup) {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/view/af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */