package com.tencent.mm.plugin.appbrand.config;

import com.tencent.mm.plugin.appbrand.app.e;
import com.tencent.mm.sdk.platformtools.x;

public enum i
{
  public static int rP(String paramString)
  {
    WxaAttributes localWxaAttributes = e.aba().f(paramString, new String[] { "dynamicInfo" });
    if (localWxaAttributes == null)
    {
      i = -1;
      x.i("MicroMsg.AppServiceSettingMMManager", "readAppFileStorageMaxSizeInBytes, appId = %s, MaxLocalstorageSize = %d", new Object[] { paramString, Integer.valueOf(i) });
      if (localWxaAttributes == null) {
        break label79;
      }
    }
    label79:
    for (int i = localWxaAttributes.aek().fsb.fsd;; i = 5)
    {
      return i * 1048576;
      i = localWxaAttributes.aek().fsb.fsd;
      break;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/config/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */