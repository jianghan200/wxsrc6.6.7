package com.tencent.mm.plugin.appbrand.page;

import android.graphics.Bitmap;
import com.tencent.mm.modelappbrand.b.b.c;
import com.tencent.mm.modelappbrand.b.b.i;
import com.tencent.mm.plugin.appbrand.appcache.a;
import com.tencent.mm.plugin.appbrand.appcache.ao;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.c;
import com.tencent.mm.sdk.platformtools.x;
import java.io.IOException;
import java.io.InputStream;

public final class o
{
  private static final b.i gng = new b.c();
  
  public static Bitmap j(g paramg, String paramString)
  {
    if (paramg == null) {}
    for (;;)
    {
      return null;
      Object localObject = a.qB(paramString);
      if (bi.oW((String)localObject)) {
        continue;
      }
      paramString = paramg.hashCode() + 35 + (String)localObject;
      Bitmap localBitmap = gng.jz(paramString);
      if ((localBitmap != null) && (!localBitmap.isRecycled())) {
        return localBitmap;
      }
      paramg = ao.d(paramg, (String)localObject);
      if (paramg != null) {}
      try
      {
        int i = paramg.available();
        if (i <= 0) {
          return null;
        }
        localObject = c.decodeStream(paramg);
        if ((localObject != null) && (!((Bitmap)localObject).isRecycled()))
        {
          gng.d(paramString, (Bitmap)localObject);
          return (Bitmap)localObject;
        }
        return null;
      }
      catch (IOException paramString)
      {
        x.e("MicroMsg.AppBrandPageIconCache", "try decode icon e = %s", new Object[] { paramString });
        return null;
      }
      finally
      {
        if (paramg != null) {
          bi.d(paramg);
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/page/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */