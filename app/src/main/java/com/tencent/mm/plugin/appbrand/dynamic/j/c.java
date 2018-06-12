package com.tencent.mm.plugin.appbrand.dynamic.j;

import android.os.Bundle;
import android.os.Parcelable;
import com.tencent.mm.ipcinvoker.f;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.appcache.af;
import com.tencent.mm.plugin.appbrand.appcache.ag;
import com.tencent.mm.plugin.appbrand.dynamic.WxaWidgetContext;
import com.tencent.mm.plugin.appbrand.dynamic.f.a;
import com.tencent.mm.plugin.appbrand.dynamic.i;
import com.tencent.mm.plugin.appbrand.dynamic.k;
import com.tencent.mm.pluginsdk.ui.tools.s;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.xweb.m;
import java.io.InputStream;

public final class c
{
  private static final String[] fgM = af.fgM;
  
  private static m bi(String paramString1, String paramString2)
  {
    try
    {
      localag = new ag(paramString1);
    }
    catch (Exception paramString2)
    {
      try
      {
        localag.abW();
        localInputStream = localag.qN(paramString2);
      }
      catch (Exception paramString2)
      {
        for (;;)
        {
          ag localag;
          InputStream localInputStream = null;
        }
      }
      try
      {
        paramString2 = s.Ui(paramString2);
        bi.d(localag);
        paramString2 = new m(paramString2, "UTF-8", localInputStream);
        return paramString2;
      }
      catch (Exception paramString2)
      {
        break label48;
      }
      paramString2 = paramString2;
      localInputStream = null;
      localag = null;
    }
    label48:
    tmp56_53[0] = paramString1;
    Object[] tmp60_56 = tmp56_53;
    tmp60_56[1] = bi.i(paramString2);
    x.e("MicroMsg.ResPkgReader", "tryHitWxaPkgFile with pkgPath(%s), exp = %s", tmp60_56);
    bi.d(localag);
    bi.d(localInputStream);
    return null;
  }
  
  public static String bj(String paramString1, String paramString2)
  {
    if (bi.oW(paramString2)) {
      return "";
    }
    m localm = bk(paramString1, paramString2);
    if (localm != null) {
      try
      {
        x.d("MicroMsg.ResPkgReader", "getCacheContent, dataStream available = %d, url = %s", new Object[] { Integer.valueOf(localm.mInputStream.available()), paramString2 });
        return com.tencent.mm.plugin.appbrand.q.c.convertStreamToString(localm.mInputStream);
      }
      catch (Exception localException)
      {
        for (;;)
        {
          x.e("MicroMsg.ResPkgReader", "getCacheContent exp = %s, id = %s, url = %s", new Object[] { localException, paramString1, paramString2 });
        }
      }
    }
    x.e("MicroMsg.ResPkgReader", "get cache content for id : %s from url : %s, failed", new Object[] { paramString1, paramString2 });
    return "";
  }
  
  public static m bk(String paramString1, String paramString2)
  {
    x.i("MicroMsg.ResPkgReader", "getCacheResource called, id = %s, reqURL = %s", new Object[] { paramString1, paramString2 });
    if (bi.oW(paramString2)) {}
    Object localObject;
    label113:
    for (;;)
    {
      return null;
      if ((!s.fj(paramString2, "about:blank")) && (!com.tencent.mm.plugin.appbrand.q.c.vN(paramString2)))
      {
        localObject = com.tencent.mm.plugin.appbrand.appcache.a.qC(paramString2);
        if (!com.tencent.mm.compatible.loader.a.a(fgM, localObject)) {
          break label173;
        }
        paramString2 = k.sA(paramString1);
        if (paramString2 != null) {}
        for (paramString2 = paramString2.aeX();; paramString2 = null)
        {
          if (paramString2 == null) {
            break label113;
          }
          if (!paramString2.fik) {
            break label115;
          }
          paramString1 = af.openRead((String)localObject);
          if (paramString1 == null) {
            break;
          }
          return new m(s.Ui((String)localObject), "UTF-8", paramString1);
        }
      }
    }
    label115:
    if (bi.oW(paramString2.ffK))
    {
      x.e("MicroMsg.ResPkgReader", "tryHitLibWxaPkgFile, pkgPath[%s] is Null Or Nil", new Object[] { paramString2.ffK });
      return null;
    }
    x.d("MicroMsg.ResPkgReader", "tryHitLibWxaPkgFile, id(%s), fileName(%s)", new Object[] { paramString1, localObject });
    return bi(paramString2.ffK, (String)localObject);
    label173:
    paramString2 = k.sA(paramString1);
    if (paramString2 != null)
    {
      paramString2 = paramString2.aeW();
      if (paramString2 != null) {
        break label260;
      }
      x.e("MicroMsg.ResPkgReader", "tryHitWxaPkgFile, get null appInfo by id %s", new Object[] { paramString1 });
      paramString2 = null;
    }
    for (;;)
    {
      if (paramString2 == null)
      {
        localObject = new Bundle();
        ((Bundle)localObject).putString("id", paramString1);
        ((Bundle)localObject).putInt("widgetState", 2102);
        f.a(i.aeT().sz(paramString1), (Parcelable)localObject, f.a.class, null);
      }
      return paramString2;
      paramString2 = null;
      break;
      label260:
      if (bi.oW(paramString2.ffK))
      {
        x.e("MicroMsg.ResPkgReader", "tryHitWxaPkgFile, get Null Or Nil pkgPath[%s] by appId %s", new Object[] { paramString2.ffK, paramString1 });
        paramString2 = null;
      }
      else
      {
        paramString2 = paramString2.ffK;
        if (bi.oW(paramString2))
        {
          x.e("MicroMsg.ResPkgReader", "tryHitWxaPkgFile, get null or nil pkgLocalPath");
          paramString2 = null;
        }
        else
        {
          x.d("MicroMsg.ResPkgReader", "tryHitWxaPkgFile, id(%s), fileName(%s)", new Object[] { paramString1, localObject });
          paramString2 = bi(paramString2, (String)localObject);
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/j/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */