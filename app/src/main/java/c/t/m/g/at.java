package c.t.m.g;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Build.VERSION;

public final class at
{
  public static String a = "";
  public static String b = "";
  public static String c = "";
  public static String d = "";
  
  private static String a()
  {
    try
    {
      String str = Build.MODEL;
      return str;
    }
    catch (Throwable localThrowable) {}
    return "null";
  }
  
  public static void a(Context paramContext)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append(a());
    localStringBuffer.append(";Android ");
    localStringBuffer.append(b());
    localStringBuffer.append(",level ");
    localStringBuffer.append(c());
    a = localStringBuffer.toString();
    b = b(paramContext);
    paramContext.getPackageName();
    c = d();
    d = a();
  }
  
  private static String b()
  {
    try
    {
      String str = Build.VERSION.RELEASE;
      return str;
    }
    catch (Throwable localThrowable) {}
    return "null";
  }
  
  private static String b(Context paramContext)
  {
    Object localObject = paramContext.getPackageName();
    for (;;)
    {
      int i;
      int k;
      try
      {
        paramContext = paramContext.getPackageManager().getPackageInfo((String)localObject, 0);
        localObject = paramContext.versionName;
        int m = paramContext.versionCode;
        if ((localObject == null) || (((String)localObject).trim().length() <= 0)) {
          return String.valueOf(m);
        }
        paramContext = ((String)localObject).trim().replace('\n', ' ').replace('\r', ' ').replace("|", "%7C");
        localObject = paramContext.toCharArray();
        i = 0;
        j = 0;
        if (i < localObject.length)
        {
          k = j;
          if (localObject[i] != '.') {
            break label151;
          }
          k = j + 1;
          break label151;
        }
        if (j < 3)
        {
          paramContext = paramContext + "." + m;
          return paramContext;
        }
      }
      catch (Throwable paramContext)
      {
        return "";
      }
      return paramContext;
      label151:
      i += 1;
      int j = k;
    }
  }
  
  private static String c()
  {
    try
    {
      String str = Build.VERSION.SDK;
      return str;
    }
    catch (Throwable localThrowable) {}
    return "null";
  }
  
  private static String d()
  {
    try
    {
      String str = Build.BRAND;
      return str;
    }
    catch (Throwable localThrowable) {}
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/c/t/m/g/at.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */