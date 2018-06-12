package com.tencent.smtt.sdk;

import android.os.Build.VERSION;
import java.io.File;
import java.io.FileFilter;

final class ap
  implements FileFilter
{
  public final boolean accept(File paramFile)
  {
    paramFile = paramFile.getName();
    if (paramFile == null) {}
    while ((paramFile.endsWith(".jar_is_first_load_dex_flag_file")) || ((Build.VERSION.SDK_INT >= 21) && (paramFile.endsWith(".dex")))) {
      return false;
    }
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/smtt/sdk/ap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */