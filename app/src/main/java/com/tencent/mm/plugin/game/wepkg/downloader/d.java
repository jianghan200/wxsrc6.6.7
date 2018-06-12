package com.tencent.mm.plugin.game.wepkg.downloader;

import com.tencent.mm.sdk.platformtools.x;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Future;

public final class d
{
  private static volatile d keh;
  private static Object lock = new Object();
  HashMap<String, c> kei = new HashMap();
  
  private boolean a(c paramc)
  {
    if (this.kei.containsKey(paramc.kdY.kev))
    {
      paramc.kee = true;
      try
      {
        if (paramc.kea != null) {
          paramc.kea.disconnect();
        }
        if (paramc.kdZ != null) {
          paramc.kdZ.cancel(false);
        }
      }
      catch (Exception localException)
      {
        for (;;)
        {
          x.i("MicroMsg.Wepkg.WePkgDownloadTask", "stop, " + localException.getMessage());
        }
      }
      this.kei.remove(paramc.kdY.kev);
      return true;
    }
    return false;
  }
  
  public static d aVs()
  {
    if (keh == null) {}
    synchronized (lock)
    {
      if (keh == null) {
        keh = new d();
      }
      return keh;
    }
  }
  
  public final boolean Ee(String paramString)
  {
    if (this.kei.containsKey(paramString)) {
      this.kei.remove(paramString);
    }
    return true;
  }
  
  public final boolean aVt()
  {
    if ((this.kei == null) || (this.kei.size() == 0)) {
      return false;
    }
    Object localObject = this.kei.values();
    ArrayList localArrayList = new ArrayList();
    localObject = ((Collection)localObject).iterator();
    while (((Iterator)localObject).hasNext()) {
      localArrayList.add((c)((Iterator)localObject).next());
    }
    localObject = localArrayList.iterator();
    while (((Iterator)localObject).hasNext())
    {
      c localc = (c)((Iterator)localObject).next();
      if (localc.kdY.keB) {
        a(localc);
      }
    }
    localArrayList.clear();
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/game/wepkg/downloader/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */