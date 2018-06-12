package android.support.v4.d;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

final class b
{
  private static Method tc;
  
  static
  {
    try
    {
      tc = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", new Class[] { Locale.class });
      return;
    }
    catch (Exception localException)
    {
      throw new IllegalStateException(localException);
    }
  }
  
  public static String a(Locale paramLocale)
  {
    try
    {
      String str = ((Locale)tc.invoke(null, new Object[] { paramLocale })).getScript();
      return str;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      return paramLocale.getScript();
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      for (;;) {}
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/d/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */