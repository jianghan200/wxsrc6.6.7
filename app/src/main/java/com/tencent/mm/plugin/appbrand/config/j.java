package com.tencent.mm.plugin.appbrand.config;

import com.tencent.mm.plugin.appbrand.a;
import com.tencent.mm.sdk.platformtools.x;

public enum j
{
  public static long rQ(String paramString)
  {
    paramString = a.qa(paramString);
    boolean bool;
    if (paramString == null)
    {
      bool = true;
      if (paramString != null) {
        break label73;
      }
      l = -1L;
      label19:
      x.i("MicroMsg.AppServiceSettingRemoteManager", "getMaxFileStorageSize, (null == config) = %b, MaxFileStorageSize = %d", new Object[] { Boolean.valueOf(bool), Long.valueOf(l) });
      if ((paramString == null) || (paramString.fqZ <= 0L)) {
        break label81;
      }
    }
    label73:
    label81:
    for (long l = paramString.fqZ;; l = 10L)
    {
      return l * 1048576L;
      bool = false;
      break;
      l = paramString.fqZ;
      break label19;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/config/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */