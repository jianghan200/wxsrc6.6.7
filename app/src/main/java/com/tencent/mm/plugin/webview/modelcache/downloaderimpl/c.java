package com.tencent.mm.plugin.webview.modelcache.downloaderimpl;

import com.tencent.mm.pluginsdk.g.a.c.j;
import com.tencent.mm.pluginsdk.g.a.c.l;
import com.tencent.mm.pluginsdk.g.a.c.m;
import com.tencent.mm.pluginsdk.g.a.c.n.a;
import com.tencent.mm.sdk.platformtools.x;
import java.util.concurrent.ConcurrentHashMap;

public final class c
  extends n.a<e>
{
  private static final ConcurrentHashMap<String, Boolean> pTF = new ConcurrentHashMap();
  
  public c(e parame)
  {
    super(parame);
  }
  
  public static void clearCache()
  {
    pTF.clear();
  }
  
  protected final m a(j paramj)
  {
    if (pTF.putIfAbsent(((e)ach()).getFilePath(), Boolean.TRUE) != null)
    {
      x.i("MicroMsg.ResDownloader.WebViewCacheDownloadNetworkRequestHandler", "request urlKey = %s, already downloading this file", new Object[] { ((e)ach()).qBy });
      return null;
    }
    paramj = super.a(paramj);
    pTF.remove(((e)ach()).getFilePath());
    return paramj;
  }
  
  public final String aca()
  {
    return "WebViewCache";
  }
  
  public final boolean acb()
  {
    return true;
  }
  
  public final boolean acc()
  {
    return false;
  }
  
  public final boolean acd()
  {
    return true;
  }
  
  public final boolean acf()
  {
    return false;
  }
  
  public final boolean bM(long paramLong)
  {
    if (!super.bM(paramLong)) {}
    while (paramLong >= 5242880L) {
      return false;
    }
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/webview/modelcache/downloaderimpl/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */