package com.tencent.mm.pluginsdk.g.a.c;

import android.annotation.SuppressLint;
import com.tencent.mm.pluginsdk.g.a.a.b.a;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

@SuppressLint({"UseSparseArrays"})
public final class r
{
  private static final HashMap<Integer, g> qDy;
  private static volatile List<g> qDz;
  
  static
  {
    Object localObject = new HashMap(2);
    qDy = (HashMap)localObject;
    ((HashMap)localObject).put(Integer.valueOf("CheckResUpdatePlugin".hashCode()), new b.a());
    try
    {
      localObject = Class.forName("com.tencent.mm.plugin.webview.modelcache.downloaderimpl.WebViewCacheDownloadHelper$ResDownloaderPlugin").newInstance();
      qDy.put(Integer.valueOf("WebViewCacheDownload".hashCode()), (g)localObject);
      qDz = null;
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        x.printErrStackTrace("MicroMsg.ResDownloaderPluginMap", localException, "", new Object[0]);
      }
    }
  }
  
  public static Collection<g> ccI()
  {
    if (qDz != null) {
      return qDz;
    }
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = qDy.keySet().iterator();
    while (localIterator.hasNext())
    {
      int i = ((Integer)localIterator.next()).intValue();
      g localg = (g)qDy.get(Integer.valueOf(i));
      if (localg != null) {
        localLinkedList.add(localg);
      }
    }
    qDz = localLinkedList;
    return localLinkedList;
  }
  
  public static void init() {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/pluginsdk/g/a/c/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */