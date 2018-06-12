package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.mm.plugin.appbrand.appcache.base.b;
import com.tencent.mm.plugin.appbrand.appcache.base.b.a;
import com.tencent.mm.plugin.appbrand.appcache.base.b.a.a;
import com.tencent.mm.pluginsdk.g.a.b.a;
import com.tencent.mm.pluginsdk.g.a.c.k;
import com.tencent.mm.pluginsdk.g.a.c.l;
import com.tencent.mm.pluginsdk.g.a.c.m;
import java.util.Iterator;
import java.util.Set;

public enum e
  implements b<f, m, k>
{
  public final com.tencent.mm.plugin.appbrand.q.g<String, b.a<m, k>> ffu = new com.tencent.mm.plugin.appbrand.q.g();
  
  private e() {}
  
  public final void a(f paramf, m paramm)
  {
    Object localObject1;
    if (paramm.status == 2)
    {
      localObject1 = ((com.tencent.mm.plugin.appbrand.a.c)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.appbrand.a.c.class)).aaO();
      if (localObject1 == null)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.AppBrand.Predownload.EncryptPkgDownloader", "onDownloadResult complete, null storage");
        localObject1 = b.a.a.fiv;
      }
    }
    for (;;)
    {
      Object localObject2 = this.ffu.bp(paramf.qBy);
      if (localObject2 == null) {
        break;
      }
      localObject2 = ((Set)localObject2).iterator();
      while (((Iterator)localObject2).hasNext()) {
        ((b.a)((Iterator)localObject2).next()).a(paramf.appId, (b.a.a)localObject1, paramm);
      }
      localObject2 = ((y)localObject1).p(paramf.appId, paramf.ffw, paramf.version);
      if (localObject2 == null)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.AppBrand.Predownload.EncryptPkgDownloader", "onDownloadResult complete, null record with %s", new Object[] { paramf.toShortString() });
        localObject1 = b.a.a.fiv;
      }
      else
      {
        ((x)localObject2).field_pkgPath = paramf.getFilePath();
        boolean bool = y.a((x)localObject2);
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AppBrand.Predownload.EncryptPkgDownloader", "onDownloadResult complete, integrityOk %b, with %s", new Object[] { Boolean.valueOf(bool), paramf.toShortString() });
        if (bool)
        {
          ((y)localObject1).c((com.tencent.mm.sdk.e.c)localObject2, new String[0]);
          localObject1 = b.a.a.fio;
        }
        else
        {
          localObject1 = b.a.a.fir;
          continue;
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.AppBrand.Predownload.EncryptPkgDownloader", "onDownloadResult %s", new Object[] { paramm });
          if ((paramm.qDk instanceof a)) {
            localObject1 = b.a.a.fiu;
          } else {
            switch (paramm.httpStatusCode)
            {
            default: 
              localObject1 = b.a.a.fip;
              break;
            case 403: 
            case 404: 
              localObject1 = b.a.a.fit;
            }
          }
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/appcache/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */