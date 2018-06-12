package com.tencent.mm.plugin.appbrand;

import com.tencent.mm.ipcinvoker.wx_extension.a.a;
import com.tencent.mm.ipcinvoker.wx_extension.a.a.b;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.c;
import java.util.Map;

public final class r
{
  private static volatile Boolean fek = null;
  
  public static boolean aaM()
  {
    if (fek == null)
    {
      Object localObject = a.b.dnp;
      localObject = a.fJ("100400");
      if ((localObject == null) || (!((c)localObject).isValid()) || (bi.getInt((String)((c)localObject).ckq().get("openIsolateContext"), 0) <= 0)) {
        break label81;
      }
    }
    label81:
    for (boolean bool = true;; bool = false)
    {
      fek = Boolean.valueOf(bool);
      x.i("MicroMsg.AppBrand.MultiContextABTests", "openLibraryIsolateContext init value = %B", new Object[] { fek });
      return fek.booleanValue();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/appbrand/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */