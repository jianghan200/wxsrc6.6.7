package com.tencent.mm.plugin.appbrand.game.cgipkg;

import com.tencent.mm.ab.a.a;
import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.by.f;
import com.tencent.mm.protocal.c.ady;
import com.tencent.mm.protocal.c.adz;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class a
  extends com.tencent.mm.ab.a<adz>
{
  private static final Map<String, adz> fAz = new ConcurrentHashMap();
  private final b fmB;
  
  private String getAppId()
  {
    return ((ady)this.fmB.dID.dIL).bPS;
  }
  
  public static adz sN(String paramString)
  {
    if (bi.oW(paramString)) {
      return null;
    }
    return (adz)fAz.get(paramString);
  }
  
  public final f<a.a<adz>> KM()
  {
    try
    {
      fAz.remove(getAppId());
      f localf = super.KM();
      return localf;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/game/cgipkg/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */