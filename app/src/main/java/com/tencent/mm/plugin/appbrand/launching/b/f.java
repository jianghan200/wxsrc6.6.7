package com.tencent.mm.plugin.appbrand.launching.b;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.mm.compatible.loader.a;
import com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;

public final class f
  implements com.tencent.mm.plugin.appbrand.n.e
{
  private static final int[] ghh = { 1025, 1031, 1032 };
  private static final int[] ghi = { 1011, 1012, 1013, 1047, 1049, 1048, 1050 };
  private final d ghj = new d();
  private final e ghk = new e();
  private final c ghl = new c();
  
  public final boolean b(Context paramContext, String paramString, int paramInt, Bundle paramBundle)
  {
    if (a.c(ghh, paramInt)) {
      if (a.a.ggY != this.ghj.a(paramContext, paramString, paramInt, paramBundle)) {}
    }
    do
    {
      do
      {
        return true;
        return false;
        if (!a.c(ghi, paramInt)) {
          break;
        }
      } while (a.a.ggY == this.ghk.a(paramContext, paramString, paramInt, paramBundle));
      return false;
      if ((1064 != paramInt) && (1078 != paramInt)) {
        break;
      }
    } while (a.a.ggY == this.ghl.a(paramContext, paramString, paramInt, paramBundle));
    return false;
    x.e("MicroMsg.WeAppLinkOpener", "handleScanCodeLink, unhandled case link[ %s ], scene[ %d ]", new Object[] { paramString, Integer.valueOf(paramInt) });
    return false;
  }
  
  public final boolean uo(String paramString)
  {
    if (bi.oW(paramString)) {}
    label36:
    label69:
    label184:
    label222:
    for (;;)
    {
      return false;
      x.i("MicroMsg.WeAppLinkOpener", "handle appLink = %s", new Object[] { paramString });
      Object localObject2 = b.values();
      int k = localObject2.length;
      int i = 0;
      Object localObject1;
      int j;
      if (i < k)
      {
        localObject1 = localObject2[i];
        if ((!bi.oW(paramString)) && (paramString.startsWith(((b)localObject1).eeG)))
        {
          j = 1;
          if (j == 0) {
            break label184;
          }
        }
      }
      for (;;)
      {
        if (localObject1 == null) {
          break label222;
        }
        try
        {
          localObject2 = Uri.parse(paramString);
          paramString = (String)localObject2;
        }
        catch (Exception localException)
        {
          for (;;)
          {
            AppBrandStatObject localAppBrandStatObject;
            x.e("MicroMsg.WeAppLinkOpener", "handle nativeLink = %s, exp = %s", new Object[] { paramString, localException });
            paramString = null;
          }
        }
        if (paramString == null) {
          break;
        }
        localObject2 = paramString.getQueryParameter("username");
        paramString = paramString.getQueryParameter("path");
        if ((bi.oW((String)localObject2)) || (!ab.gr((String)localObject2))) {
          break;
        }
        localAppBrandStatObject = new AppBrandStatObject();
        localAppBrandStatObject.scene = ((b)localObject1).scene;
        localAppBrandStatObject.bGG = b.akT();
        localAppBrandStatObject.cbB = b.akU();
        localAppBrandStatObject.cbC = b.akV();
        AppBrandLaunchProxyUI.a(null, (String)localObject2, paramString, 0, -1, localAppBrandStatObject, null);
        return true;
        j = 0;
        break label69;
        i += 1;
        break label36;
        localObject1 = null;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/appbrand/launching/b/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */