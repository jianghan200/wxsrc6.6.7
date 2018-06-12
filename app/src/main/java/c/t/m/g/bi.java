package c.t.m.g;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

public final class bi
{
  public String a = "";
  public int b = 0;
  public String c = "";
  public String d = "";
  public int e;
  
  public bi()
  {
    try
    {
      this.a = m.a().getPackageName();
      PackageInfo localPackageInfo = m.a().getPackageManager().getPackageInfo(this.a, 0);
      this.b = localPackageInfo.versionCode;
      this.c = localPackageInfo.versionName;
      this.e = m.b();
      this.d = "";
      return;
    }
    catch (Throwable localThrowable) {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/c/t/m/g/bi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */