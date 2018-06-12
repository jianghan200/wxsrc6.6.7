package com.tencent.mm.plugin.appbrand.dynamic.b;

import android.graphics.Bitmap;
import com.tencent.mm.modelappbrand.b.b.c;
import com.tencent.mm.modelappbrand.b.b.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.xweb.m;
import java.io.IOException;
import java.io.InputStream;

public final class a
{
  private static final b.i fvr = new b.c();
  
  public static Bitmap aY(String paramString1, String paramString2)
  {
    if ((bi.oW(paramString1)) || (bi.oW(paramString2))) {}
    for (;;)
    {
      return null;
      Object localObject = com.tencent.mm.plugin.appbrand.appcache.a.qB(paramString2);
      if (bi.oW((String)localObject)) {
        continue;
      }
      paramString2 = paramString1 + '#' + (String)localObject;
      Bitmap localBitmap = fvr.jz(paramString2);
      if ((localBitmap != null) && (!localBitmap.isRecycled())) {
        return localBitmap;
      }
      paramString1 = com.tencent.mm.plugin.appbrand.dynamic.j.c.bk(paramString1, (String)localObject);
      if (paramString1 != null) {}
      try
      {
        if (paramString1.mInputStream != null)
        {
          int i = paramString1.mInputStream.available();
          if (i > 0) {}
        }
        else
        {
          return null;
        }
        localObject = com.tencent.mm.sdk.platformtools.c.decodeStream(paramString1.mInputStream);
        if ((localObject != null) && (!((Bitmap)localObject).isRecycled()))
        {
          fvr.d(paramString2, (Bitmap)localObject);
          return (Bitmap)localObject;
        }
        return null;
      }
      catch (IOException paramString2)
      {
        x.e("MicroMsg.CanvasImageCache", "try decode icon e = %s", new Object[] { paramString2 });
        return null;
      }
      finally
      {
        if (paramString1 != null) {
          bi.d(paramString1.mInputStream);
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */