package android.support.v4.os;

import android.os.Build.VERSION;
import android.os.Trace;

public final class e
{
  public static void beginSection(String paramString)
  {
    if (Build.VERSION.SDK_INT >= 18) {
      Trace.beginSection(paramString);
    }
  }
  
  public static void endSection()
  {
    if (Build.VERSION.SDK_INT >= 18) {
      Trace.endSection();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/android/support/v4/os/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */