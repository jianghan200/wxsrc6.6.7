package android.support.v4.d;

import android.os.Build.VERSION;
import android.text.TextUtils;
import java.util.Locale;

public final class f
{
  public static final Locale ROOT;
  private static final a tr;
  private static String tt;
  private static String tu;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 17) {}
    for (tr = new b((byte)0);; tr = new a((byte)0))
    {
      ROOT = new Locale("", "");
      tt = "Arab";
      tu = "Hebr";
      return;
    }
  }
  
  public static int getLayoutDirectionFromLocale(Locale paramLocale)
  {
    return tr.getLayoutDirectionFromLocale(paramLocale);
  }
  
  private static class a
  {
    public int getLayoutDirectionFromLocale(Locale paramLocale)
    {
      int j = 1;
      if ((paramLocale != null) && (!paramLocale.equals(f.ROOT)))
      {
        String str = a.a(paramLocale);
        int i;
        if (str == null)
        {
          i = j;
          switch (Character.getDirectionality(paramLocale.getDisplayName(paramLocale).charAt(0)))
          {
          default: 
            i = 0;
          }
        }
        do
        {
          do
          {
            return i;
            i = j;
          } while (str.equalsIgnoreCase(f.bO()));
          i = j;
        } while (str.equalsIgnoreCase(f.bP()));
      }
      return 0;
    }
  }
  
  private static final class b
    extends f.a
  {
    private b()
    {
      super();
    }
    
    public final int getLayoutDirectionFromLocale(Locale paramLocale)
    {
      return TextUtils.getLayoutDirectionFromLocale(paramLocale);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/d/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */