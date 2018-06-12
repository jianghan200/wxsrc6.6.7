package android.support.v4.content;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Process;
import android.support.v4.app.d;

public final class e
{
  public static int f(Context paramContext, String paramString)
  {
    int i = Process.myPid();
    int j = Process.myUid();
    String str1 = paramContext.getPackageName();
    if (paramContext.checkPermission(paramString, i, j) == -1) {
      return -1;
    }
    String str2 = d.permissionToOp(paramString);
    if (str2 != null)
    {
      paramString = str1;
      if (str1 == null)
      {
        paramString = paramContext.getPackageManager().getPackagesForUid(j);
        if ((paramString == null) || (paramString.length <= 0)) {
          return -1;
        }
        paramString = paramString[0];
      }
      if (d.c(paramContext, str2, paramString) != 0) {
        return -2;
      }
    }
    return 0;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/content/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */