package com.tencent.mm.plugin.appbrand.jsapi.share;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObjectManager;
import com.tencent.mm.plugin.appbrand.e;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.jsapi.file.a;
import com.tencent.mm.plugin.appbrand.page.o;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.c;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;
import java.io.IOException;

public final class k
{
  public static String a(p paramp, String paramString, boolean paramBoolean)
  {
    if (paramp == null) {}
    String str;
    do
    {
      do
      {
        do
        {
          do
          {
            return null;
            str = paramp.mAppId;
            if (!bi.oW(paramString)) {
              break;
            }
          } while (!paramBoolean);
          paramp.a(1, null, new Object[0]);
          paramString = AppBrandLocalMediaObjectManager.genMediaFilePath(str, "share_" + System.currentTimeMillis());
          e.a(str, new k.1(str, paramp, paramString));
          return "delayLoadFile://" + paramString;
          if (!paramString.startsWith("wxfile://")) {
            break;
          }
          paramp = paramp.fdO.fcw.rb(paramString);
        } while ((paramp == null) || (!paramp.exists()));
        return "file://" + paramp.getAbsolutePath();
      } while ((paramString.startsWith("http://")) || (paramString.startsWith("https://")));
      str = AppBrandLocalMediaObjectManager.genMediaFilePath(str, "share_" + System.currentTimeMillis());
      paramp = o.j(paramp.fdO, paramString);
    } while ((paramp == null) || (paramp.isRecycled()));
    try
    {
      c.a(paramp, 100, Bitmap.CompressFormat.PNG, str, true);
    }
    catch (IOException paramString)
    {
      for (;;)
      {
        x.w("MicroMsg.ShareHelper", "save temp bitmap to file failed, . exception : %s", new Object[] { paramString });
        if ((paramp != null) && (!paramp.isRecycled())) {
          paramp.recycle();
        }
      }
    }
    finally
    {
      if ((paramp == null) || (paramp.isRecycled())) {
        break label293;
      }
      paramp.recycle();
    }
    return "file://" + str;
  }
  
  public static boolean tY(String paramString)
  {
    return bi.oW(paramString);
  }
  
  public static String tZ(String paramString)
  {
    String str;
    if (paramString == null) {
      str = null;
    }
    do
    {
      return str;
      if (paramString.startsWith("file://")) {
        return paramString.replace("file://", "");
      }
      str = paramString;
    } while (!paramString.startsWith("delayLoadFile://"));
    return paramString.replace("delayLoadFile://", "");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/share/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */