package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.mm.a.g;
import com.tencent.mm.plugin.appbrand.p.c;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bi;

public class y
  extends c<x>
{
  public static final String[] dzV = { i.a(x.dzU, "PredownloadEncryptPkgInfo") };
  private final e fgu;
  
  public y(e parame)
  {
    super(parame, x.dzU, "PredownloadEncryptPkgInfo", x.ciG);
    this.fgu = parame;
  }
  
  static boolean a(x paramx)
  {
    if (bi.oW(paramx.field_pkgPath))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AppBrand.PredownloadEncryptPkgStorage", "checkPkgIntegrity, with %s path nil", new Object[] { paramx.toShortString() });
      return false;
    }
    if (bi.oW(paramx.field_pkgMd5))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AppBrand.PredownloadEncryptPkgStorage", "checkPkgIntegrity, with %s record md5 nil", new Object[] { paramx.toShortString() });
      return false;
    }
    String str = g.cu(paramx.field_pkgPath);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AppBrand.PredownloadEncryptPkgStorage", "checkPkgIntegrity with %s, file_md5(%s), record_md5(%s)", new Object[] { paramx.toShortString(), str, paramx.field_pkgMd5 });
    return paramx.field_pkgMd5.equals(str);
  }
  
  public final x p(String paramString, int paramInt1, int paramInt2)
  {
    if (bi.oW(paramString)) {}
    x localx;
    do
    {
      return null;
      localx = new x();
      localx.field_appId = paramString;
      localx.field_type = paramInt1;
      localx.field_version = paramInt2;
    } while (!b(localx, x.fgs));
    return localx;
  }
  
  public final x q(String paramString, int paramInt1, int paramInt2)
  {
    paramString = p(paramString, paramInt1, paramInt2);
    if ((paramString != null) && (a(paramString))) {
      return paramString;
    }
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/appcache/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */