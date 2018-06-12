package com.tencent.mm.plugin.appbrand.appcache.a.b;

import android.util.Base64;
import com.tencent.mm.bk.b;
import com.tencent.mm.protocal.c.aql;
import com.tencent.mm.protocal.c.chl;
import com.tencent.mm.protocal.c.chs;
import com.tencent.mm.protocal.c.ob;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class g
  extends a<Boolean, chs>
{
  private static Boolean a(String paramString1, String paramString2, chs paramchs)
  {
    Object localObject = paramchs.sBJ;
    if (bi.oW((String)localObject))
    {
      x.e("MicroMsg.AppBrand.Predownload.CmdIssueLaunch", "call[%s | %s], empty base64", new Object[] { paramString1, paramString2 });
      return Boolean.FALSE;
    }
    if (bi.cX(paramchs.sum))
    {
      x.e("MicroMsg.AppBrand.Predownload.CmdIssueLaunch", "call[%s | %s], empty sceneList", new Object[] { paramString1, paramString2 });
      return Boolean.FALSE;
    }
    for (;;)
    {
      try
      {
        byte[] arrayOfByte = Base64.decode((String)localObject, 0);
        localObject = new aql();
        ((aql)localObject).aG(arrayOfByte);
        if (((aql)localObject).rSV.rsl.lR.length == 0)
        {
          x.e("MicroMsg.AppBrand.Predownload.CmdIssueLaunch", "call[%s | %s], parse pb, invalid foreground control bytes", new Object[] { paramString1, paramString2 });
          i = com.tencent.mm.plugin.appbrand.appcache.a.c.a.fiY;
          com.tencent.mm.plugin.appbrand.appcache.a.c.a.n(paramchs.sBu.sBs, 105L);
          return Boolean.FALSE;
        }
        int i = com.tencent.mm.plugin.appbrand.appcache.a.c.a.fiY;
        com.tencent.mm.plugin.appbrand.appcache.a.c.a.n(paramchs.sBu.sBs, 104L);
        LinkedList localLinkedList = paramchs.sum;
        l1 = paramchs.sBK & 0xFFFFFFFF;
        long l2 = paramchs.sBL & 0xFFFFFFFF;
        if (localLinkedList == null)
        {
          localObject = "null";
          x.i("MicroMsg.AppBrand.Predownload.CmdIssueLaunch", "call[%s| %s] WriteToStorage, sceneList %s, time[%d, %d]", new Object[] { paramString1, paramString2, localObject, Long.valueOf(l1), Long.valueOf(l2) });
          boolean bool = ((com.tencent.mm.plugin.appbrand.appcache.a.d.e)com.tencent.mm.plugin.appbrand.app.e.x(com.tencent.mm.plugin.appbrand.appcache.a.d.e.class)).a(arrayOfByte, paramString2, localLinkedList, l1, l2);
          i = com.tencent.mm.plugin.appbrand.appcache.a.c.a.fiY;
          l2 = paramchs.sBu.sBs;
          if (!bool) {
            break label417;
          }
          l1 = 107L;
          com.tencent.mm.plugin.appbrand.appcache.a.c.a.n(l2, l1);
          return Boolean.valueOf(bool);
        }
        if (bi.cX(localLinkedList))
        {
          localObject = "{}";
          continue;
        }
        localObject = new StringBuilder("{");
        Iterator localIterator = localLinkedList.iterator();
        if (localIterator.hasNext())
        {
          ((StringBuilder)localObject).append(localIterator.next().toString()).append(',');
          continue;
        }
        ((StringBuilder)localObject).append("}");
      }
      catch (Exception paramchs)
      {
        x.printErrStackTrace("MicroMsg.AppBrand.Predownload.CmdIssueLaunch", paramchs, "call[%s | %s], decode base64", new Object[] { paramString1, paramString2 });
        return Boolean.FALSE;
      }
      localObject = ((StringBuilder)localObject).toString();
      continue;
      label417:
      long l1 = 108L;
    }
  }
  
  final String acp()
  {
    return "CmdIssueLaunch";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/appcache/a/b/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */