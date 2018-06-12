package com.tencent.mm.compatible.util;

import android.os.Build;
import android.os.Build.VERSION;
import com.tencent.mm.compatible.e.k;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.sdk.platformtools.bi;

public final class n
{
  public static String fi(String paramString)
  {
    if (paramString == null) {}
    do
    {
      do
      {
        do
        {
          return paramString;
        } while ((q.deW.ddJ == 2) || (q.deW.ddU == 1));
        if (q.deW.ddJ != 1) {
          break;
        }
      } while (!paramString.toString().contains("\n"));
      return paramString.toString().replace("\n", " ");
    } while ((Build.VERSION.SDK_INT != 16) || (!paramString.toString().contains("\n")) || (bi.aG(Build.MANUFACTURER, "").toLowerCase().indexOf("meizu".toLowerCase()) >= 0));
    return paramString.toString().replace("\n", " ");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/compatible/util/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */