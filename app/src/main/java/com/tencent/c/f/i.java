package com.tencent.c.f;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.tencent.c.e.a.a.a;

public final class i
{
  public static a bL(Context paramContext, String paramString)
  {
    a locala = new a();
    try
    {
      paramContext = paramContext.getPackageManager().getPackageInfo(paramString, 64);
      locala.byT = paramString;
      locala.versionName = paramContext.versionName;
      locala.versionCode = paramContext.versionCode;
      return locala;
    }
    catch (Throwable paramContext) {}
    return locala;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/c/f/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */