package com.tencent.mm.compatible.util;

import android.os.Build;
import com.tencent.mm.sdk.platformtools.bi;

public final class l
{
  public static boolean xZ()
  {
    return bi.aG(Build.MANUFACTURER, "").toLowerCase().indexOf("samsung".toLowerCase()) >= 0;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/compatible/util/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */