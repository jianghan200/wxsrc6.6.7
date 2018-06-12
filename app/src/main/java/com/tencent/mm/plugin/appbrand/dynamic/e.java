package com.tencent.mm.plugin.appbrand.dynamic;

import android.view.View;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class e
{
  private static volatile e fuF;
  public Map<String, WeakReference<View>> fuG = new ConcurrentHashMap();
  
  public static e aeR()
  {
    if (fuF == null) {}
    try
    {
      if (fuF == null) {
        fuF = new e();
      }
      return fuF;
    }
    finally {}
  }
  
  public final View sv(String paramString)
  {
    if (bi.oW(paramString))
    {
      x.w("MicroMsg.DynamicPageViewMgr", "get view from manager failed, key is null or nil.");
      return null;
    }
    paramString = (WeakReference)this.fuG.get(paramString);
    if (paramString != null) {
      return (View)paramString.get();
    }
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */