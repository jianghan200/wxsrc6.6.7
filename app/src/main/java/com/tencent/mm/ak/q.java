package com.tencent.mm.ak;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import com.tencent.mm.compatible.e.k;
import com.tencent.mm.k.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.b;
import com.tencent.mm.plugin.zero.b.a;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class q
{
  private static String[] dWM = null;
  
  public static boolean Pn()
  {
    if (dWM == null) {
      Po();
    }
    if ((Build.VERSION.SDK_INT >= 14) && (dWM != null) && (dWM.length > 0) && (com.tencent.mm.compatible.e.q.deW.der == 1)) {}
    for (boolean bool = true;; bool = false)
    {
      x.d("MicroMsg.WebpUtil", "isSupportWebp: %b", new Object[] { Boolean.valueOf(bool) });
      return bool;
    }
  }
  
  private static void Po()
  {
    try
    {
      String str = ((a)g.l(a.class)).AT().getValue("BizEnableWebpUrl");
      x.d("MicroMsg.WebpUtil", "initCdnUrlList, urllist: %s", new Object[] { str });
      if (!bi.oW(str))
      {
        dWM = str.split(";");
        x.d("MicroMsg.WebpUtil", "initCdnUrlList, CDN_URL_LIST.length: %d", new Object[] { Integer.valueOf(dWM.length) });
      }
      return;
    }
    catch (b localb)
    {
      x.w("MicroMsg.WebpUtil", "initCdnUrlList fail, AccountNotReady");
      return;
    }
    catch (Exception localException)
    {
      x.d("MicroMsg.WebpUtil", "initCdnUrlList error: %s", new Object[] { localException.getMessage() });
    }
  }
  
  private static int Pp()
  {
    Context localContext = ad.getContext();
    if (ao.isWifi(localContext)) {
      return 1;
    }
    if (ao.is4G(localContext)) {
      return 4;
    }
    if (ao.is3G(localContext)) {
      return 3;
    }
    if (ao.is2G(localContext)) {
      return 2;
    }
    return 0;
  }
  
  public static String hY(int paramInt)
  {
    return String.format("System=android-%d,ClientVersion=%d,NetworkType=%d,Scene=%d", new Object[] { Integer.valueOf(Build.VERSION.SDK_INT), Integer.valueOf(paramInt), Integer.valueOf(Pp()), Integer.valueOf(2) });
  }
  
  public static String hZ(int paramInt)
  {
    return String.format("System=android-%d,ClientVersion=%d,NetworkType=%d,Scene=%d", new Object[] { Integer.valueOf(Build.VERSION.SDK_INT), Integer.valueOf(paramInt), Integer.valueOf(Pp()), Integer.valueOf(1) });
  }
  
  private static boolean lW(String paramString)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    String[] arrayOfString;
    int j;
    int i;
    if (dWM != null)
    {
      bool1 = bool2;
      if (dWM.length > 0)
      {
        bool1 = bool2;
        if (!bi.oW(paramString))
        {
          arrayOfString = dWM;
          j = arrayOfString.length;
          i = 0;
        }
      }
    }
    for (;;)
    {
      bool1 = bool2;
      if (i < j)
      {
        if (paramString.startsWith(arrayOfString[i])) {
          bool1 = true;
        }
      }
      else {
        return bool1;
      }
      i += 1;
    }
  }
  
  public static String lX(String paramString)
  {
    if ((dWM == null) || (dWM.length == 0))
    {
      x.d("MicroMsg.WebpUtil", "addWebpURLIfNecessary, cdn url is null");
      Po();
    }
    if (!lW(paramString)) {
      x.d("MicroMsg.WebpUtil", "addWebpURLIfNecessary, is not cdn url");
    }
    for (;;)
    {
      return paramString;
      try
      {
        Object localObject = Uri.parse(paramString);
        String str1 = ((Uri)localObject).getQueryParameter("wxtype");
        if (!bi.oW(str1))
        {
          str1 = str1.toLowerCase();
          x.d("MicroMsg.WebpUtil", "addWebpURLIfNecessary, wxtype:%s", new Object[] { str1 });
          if ((!str1.equals("gif")) && (!str1.contains("gif")))
          {
            String str2 = ((Uri)localObject).getQueryParameter("tp");
            if (((bi.oW(str2)) || (!str2.equals("webp"))) && (!bi.oW(str1)))
            {
              localObject = ((Uri)localObject).buildUpon().appendQueryParameter("tp", "webp").build().toString();
              x.d("MicroMsg.WebpUtil", "webpURL: %s", new Object[] { localObject });
              return (String)localObject;
            }
          }
        }
      }
      catch (Exception localException) {}
    }
    return paramString;
  }
  
  public static boolean lY(String paramString)
  {
    try
    {
      if (bi.oW(paramString)) {
        return false;
      }
      if (lW(paramString))
      {
        paramString = Uri.parse(paramString).getQueryParameter("tp");
        if (!bi.oW(paramString))
        {
          boolean bool = paramString.equals("webp");
          if (bool) {
            return true;
          }
        }
      }
    }
    catch (Exception paramString) {}
    return false;
  }
  
  public static String lZ(String paramString)
  {
    try
    {
      if (!lW(paramString)) {
        return null;
      }
      paramString = Uri.parse(paramString).getQueryParameter("wxtype").toLowerCase();
      if (!bi.oW(paramString))
      {
        paramString = paramString.toLowerCase();
        return paramString;
      }
    }
    catch (Exception paramString) {}
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ak/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */