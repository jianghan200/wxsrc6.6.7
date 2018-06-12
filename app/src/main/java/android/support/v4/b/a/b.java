package android.support.v4.b.a;

import android.graphics.drawable.Drawable;
import java.lang.reflect.Method;

final class b
{
  static Method rq;
  static boolean rr;
  private static Method rs;
  private static boolean rt;
  
  public static int i(Drawable paramDrawable)
  {
    if (!rt) {}
    try
    {
      Method localMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
      rs = localMethod;
      localMethod.setAccessible(true);
      rt = true;
      if (rs != null) {
        try
        {
          int i = ((Integer)rs.invoke(paramDrawable, new Object[0])).intValue();
          return i;
        }
        catch (Exception paramDrawable)
        {
          rs = null;
        }
      }
      return -1;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      for (;;) {}
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/b/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */