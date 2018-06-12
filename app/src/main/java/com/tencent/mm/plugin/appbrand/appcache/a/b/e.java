package com.tencent.mm.plugin.appbrand.appcache.a.b;

import android.util.Base64;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.d;
import com.tencent.mm.plugin.appbrand.config.p;
import com.tencent.mm.protocal.c.cgy;
import com.tencent.mm.protocal.c.cgz;
import com.tencent.mm.protocal.c.chl;
import com.tencent.mm.protocal.c.chq;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Iterator;
import java.util.LinkedList;

public class e
  extends a<Boolean, chq>
{
  private static Boolean a(String paramString1, String paramString2, chq paramchq)
  {
    WxaAttributes.d locald = null;
    Object localObject = paramchq.sBH;
    if (bi.oW((String)localObject))
    {
      x.e("MicroMsg.AppBrand.Predownload.CmdIssueContact", "call[%s | %s], empty base64", new Object[] { paramString1, paramString2 });
      return Boolean.FALSE;
    }
    label230:
    boolean bool2;
    boolean bool1;
    try
    {
      localObject = Base64.decode((String)localObject, 0);
      localcgz = new cgz();
      localcgz.aG((byte[])localObject);
      localObject = com.tencent.mm.plugin.appbrand.app.e.aba().e(paramString1, new String[] { "versionInfo" });
      if (localObject == null) {}
      for (localObject = null;; localObject = ((WxaAttributes)localObject).ael())
      {
        Iterator localIterator = localcgz.riC.iterator();
        if (!localIterator.hasNext()) {
          break;
        }
        cgy localcgy = (cgy)localIterator.next();
        if (!"WxaAppVersionInfo".equals(localcgy.riD)) {
          break label441;
        }
        locald = WxaAttributes.d.si(localcgy.mEl);
        break label441;
      }
      if (locald == null)
      {
        i = com.tencent.mm.plugin.appbrand.appcache.a.c.a.fiY;
        com.tencent.mm.plugin.appbrand.appcache.a.c.a.n(paramchq.sBu.sBs, 87L);
        return Boolean.FALSE;
      }
      i = com.tencent.mm.plugin.appbrand.appcache.a.c.a.fiY;
      com.tencent.mm.plugin.appbrand.appcache.a.c.a.n(paramchq.sBu.sBs, 88L);
      if ((localObject == null) || (locald == null)) {
        break label444;
      }
      if (((WxaAttributes.d)localObject).cbu >= locald.cbu) {
        break label450;
      }
    }
    catch (Exception paramchq)
    {
      cgz localcgz;
      int i;
      label270:
      long l2;
      label308:
      label406:
      x.printErrStackTrace("MicroMsg.AppBrand.Predownload.CmdIssueContact", paramchq, "call[%s | %s], decode base64", new Object[] { paramString1, paramString2 });
      return Boolean.FALSE;
    }
    if (bool2)
    {
      com.tencent.mm.plugin.appbrand.app.e.aba().a(paramString1, localcgz.riB, localcgz.riC);
      if (com.tencent.mm.plugin.appbrand.app.e.aba().e(paramString1, new String[0]) == null) {
        break label456;
      }
      bool1 = true;
      i = com.tencent.mm.plugin.appbrand.appcache.a.c.a.fiY;
      l2 = paramchq.sBu.sBs;
      if (!bool1) {
        break label462;
      }
    }
    label441:
    label444:
    label450:
    label456:
    label462:
    for (long l1 = 85L;; l1 = 86L)
    {
      com.tencent.mm.plugin.appbrand.appcache.a.c.a.n(l2, l1);
      if (localObject == null)
      {
        i = -1;
        if (locald != null) {
          break label406;
        }
      }
      for (int j = -1;; j = locald.cbu)
      {
        x.i("MicroMsg.AppBrand.Predownload.CmdIssueContact", "call[%s | %s], record.ver %d, issue.ver %d, doIssue %b, issueRet %b", new Object[] { paramString1, paramString2, Integer.valueOf(i), Integer.valueOf(j), Boolean.valueOf(bool2), Boolean.valueOf(bool1) });
        return Boolean.valueOf(bool1);
        i = com.tencent.mm.plugin.appbrand.appcache.a.c.a.fiY;
        com.tencent.mm.plugin.appbrand.appcache.a.c.a.n(paramchq.sBu.sBs, 84L);
        bool1 = false;
        break;
        i = ((WxaAttributes.d)localObject).cbu;
        break label308;
      }
      break;
      bool2 = true;
      break label230;
      bool2 = false;
      break label230;
      bool1 = false;
      break label270;
    }
  }
  
  final String acp()
  {
    return "CmdIssueContact";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/appcache/a/b/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */