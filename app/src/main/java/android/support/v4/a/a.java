package android.support.v4.a;

import android.os.Build.VERSION;
import android.view.View;

public final class a
{
  private static final c mc = new e();
  
  static
  {
    if (Build.VERSION.SDK_INT >= 12)
    {
      mc = new f();
      return;
    }
  }
  
  public static g bb()
  {
    return mc.bb();
  }
  
  public static void v(View paramView)
  {
    mc.v(paramView);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/android/support/v4/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */