package com.tencent.mm.plugin.appbrand.jsapi;

import android.content.Context;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ao;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public final class l
  extends h
{
  private static final int CTRL_INDEX = 153;
  private static final String NAME = "onNetworkStatusChange";
  private static l fFl;
  private static HashSet<String> fFm = new HashSet();
  
  public static void onNetworkChange()
  {
    for (;;)
    {
      Object localObject2;
      try
      {
        HashMap localHashMap = new HashMap();
        localObject2 = ad.getContext();
        boolean bool = ao.isConnected((Context)localObject2);
        localHashMap.put("isConnected", Boolean.valueOf(bool));
        if (!bool)
        {
          localHashMap.put("networkType", "none");
          localObject2 = fFm.iterator();
          if (!((Iterator)localObject2).hasNext()) {
            break;
          }
          String str = (String)((Iterator)localObject2).next();
          if (fFl == null) {
            fFl = new l();
          }
          fFl.aC(str, 0).x(localHashMap).ahM();
          continue;
        }
        if (!ao.is2G((Context)localObject2)) {
          break label130;
        }
      }
      finally {}
      ((HashMap)localObject1).put("networkType", "2g");
      continue;
      label130:
      if (ao.is3G((Context)localObject2)) {
        ((HashMap)localObject1).put("networkType", "3g");
      } else if (ao.is4G((Context)localObject2)) {
        ((HashMap)localObject1).put("networkType", "4g");
      } else if (ao.isWifi((Context)localObject2)) {
        ((HashMap)localObject1).put("networkType", "wifi");
      } else {
        ((HashMap)localObject1).put("networkType", "unknown");
      }
    }
  }
  
  public static void tk(String paramString)
  {
    try
    {
      fFm.add(paramString);
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public static void tl(String paramString)
  {
    try
    {
      fFm.remove(paramString);
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */