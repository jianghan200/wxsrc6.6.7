package com.tencent.mm.plugin.appbrand.appcache.a.d;

import android.util.Pair;
import com.tencent.mm.bk.b;
import com.tencent.mm.plugin.appbrand.p.c;
import com.tencent.mm.protocal.c.aql;
import com.tencent.mm.protocal.c.ob;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Iterator;
import java.util.List;

public class e
  extends c<f>
{
  public static final String[] dzV = { i.a(f.dzU, "PredownloadIssueLaunchWxaAppResponse") };
  
  public e(com.tencent.mm.sdk.e.e parame)
  {
    super(parame, f.dzU, "PredownloadIssueLaunchWxaAppResponse", f.ciG);
  }
  
  public static void act() {}
  
  public final boolean a(byte[] paramArrayOfByte, String paramString, List<Integer> paramList, long paramLong1, long paramLong2)
  {
    if ((bi.bC(paramArrayOfByte)) || (bi.oW(paramString)))
    {
      x.i("MicroMsg.AppBrand.Predownload.DuplicateLaunchWxaAppCacheStorage", "setLaunchData, invalid input %s", new Object[] { paramString });
      return false;
    }
    if (bi.cX(paramList))
    {
      x.e("MicroMsg.AppBrand.Predownload.DuplicateLaunchWxaAppCacheStorage", "setLaunchData, appId %s, empty sceneList", new Object[] { paramString });
      return false;
    }
    Iterator localIterator = paramList.iterator();
    boolean bool1 = true;
    if (localIterator.hasNext())
    {
      int i = ((Integer)localIterator.next()).intValue();
      f localf = new f();
      localf.field_appId = paramString;
      localf.field_scene = i;
      boolean bool2 = b(localf, new String[0]);
      localf.field_launchProtoBlob = paramArrayOfByte;
      localf.field_startTime = paramLong1;
      localf.field_endTime = paramLong2;
      if (bool2) {}
      for (bool2 = c(localf, new String[0]);; bool2 = b(localf))
      {
        bool1 = bool2 & bool1;
        break;
      }
    }
    x.i("MicroMsg.AppBrand.Predownload.DuplicateLaunchWxaAppCacheStorage", "setLaunchData, appId %s, sceneList %d, setOk %b", new Object[] { paramString, Integer.valueOf(paramList.size()), Boolean.valueOf(bool1) });
    return bool1;
  }
  
  public final Pair<aql, Long> am(String paramString, int paramInt)
  {
    try
    {
      long l = bi.VE();
      f localf = new f();
      localf.field_appId = paramString;
      localf.field_scene = paramInt;
      if (b(localf, new String[0]))
      {
        x.i("MicroMsg.AppBrand.Predownload.DuplicateLaunchWxaAppCacheStorage", "found info with appId(%s) scene(%d), [%d, %d]", new Object[] { paramString, Integer.valueOf(paramInt), Long.valueOf(localf.field_startTime), Long.valueOf(localf.field_endTime) });
        if ((localf.field_startTime <= l) && (l <= localf.field_endTime))
        {
          aql localaql = new aql();
          localaql.aG(localf.field_launchProtoBlob);
          if (localaql.rSV.rsl.lR.length > 0) {
            return Pair.create(localaql, Long.valueOf(localf.field_reportId));
          }
          x.e("MicroMsg.AppBrand.Predownload.DuplicateLaunchWxaAppCacheStorage", "found into with appId(%s) scene(%d), but jsapi_control_bytes invalid", new Object[] { paramString, Integer.valueOf(paramInt) });
        }
      }
      return Pair.create(null, Long.valueOf(-1L));
    }
    catch (Exception localException)
    {
      x.printErrStackTrace("MicroMsg.AppBrand.Predownload.DuplicateLaunchWxaAppCacheStorage", localException, "get with appId(%s) scene(%d)", new Object[] { paramString, Integer.valueOf(paramInt) });
    }
    return Pair.create(null, Long.valueOf(-1L));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/appcache/a/d/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */