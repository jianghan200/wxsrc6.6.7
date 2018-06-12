package com.tencent.mm.plugin.appbrand.appcache;

import android.util.Pair;
import com.tencent.mm.plugin.appbrand.a.a;
import com.tencent.mm.plugin.appbrand.app.e;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public enum m
  implements a
{
  private int fgd = -1;
  private String fge = null;
  
  private m() {}
  
  final void A(int paramInt, String paramString)
  {
    this.fgd = paramInt;
    this.fge = paramString;
  }
  
  public final void cs(boolean paramBoolean)
  {
    Object localObject = ak.p(paramBoolean, true);
    if (((Pair)localObject).second != null) {}
    do
    {
      do
      {
        return;
      } while (((Pair)localObject).first != ak.a.fhF);
      localObject = e.abi();
      if (!paramBoolean) {
        break;
      }
      i = 0;
      localObject = ((ap)localObject).a("@LibraryAppId", i, new String[] { "downloadURL", "version" });
    } while ((localObject == null) || (bi.oW(((al)localObject).field_downloadURL)));
    if (paramBoolean) {}
    m.1 local1;
    for (int i = ((al)localObject).field_version;; i = 0)
    {
      local1 = new m.1(this, i);
      if (!paramBoolean) {
        break label239;
      }
      if ((this.fgd <= 0) || (bi.oW(this.fge))) {
        break label224;
      }
      paramBoolean = k.abF();
      x.i("MicroMsg.AppBrand.PkgDownloadService", "[incremental] lib can be patch, abtest open %b", new Object[] { Boolean.valueOf(paramBoolean) });
      if (!paramBoolean) {
        break label224;
      }
      if (ak.t("@LibraryAppId", 0, this.fgd).first != ak.a.fhB) {
        break label196;
      }
      x.i("MicroMsg.AppBrand.PkgDownloadService", "[incremental] start incremental lib download");
      i.a("@LibraryAppId", this.fgd, ((al)localObject).field_version, this.fge, local1);
      return;
      i = 999;
      break;
    }
    label196:
    x.e("MicroMsg.AppBrand.PkgDownloadService", "[incremental] OldLibPkg[%d] or PatchUrl[%s] Invalid", new Object[] { Integer.valueOf(this.fgd), this.fge });
    label224:
    aq.a(((al)localObject).field_downloadURL, ((al)localObject).field_version, local1);
    return;
    label239:
    aq.a(((al)localObject).field_downloadURL, local1);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/appcache/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */