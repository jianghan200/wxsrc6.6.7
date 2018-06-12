package com.tencent.mm.cache;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class ArtistCacheManager
  extends BroadcastReceiver
{
  private static ArtistCacheManager dab;
  public static HashMap<String, a> dac = new HashMap();
  private static HashSet<com.tencent.mm.d.a> dad = new HashSet();
  public String dae;
  
  public static ArtistCacheManager yn()
  {
    if (dab == null) {
      dab = new ArtistCacheManager();
    }
    return dab;
  }
  
  public final <T extends d> T a(com.tencent.mm.d.a parama)
  {
    Object localObject = null;
    if (dac.containsKey(this.dae))
    {
      a locala = (a)dac.get(this.dae);
      if (!locala.dah.containsKey(parama)) {
        switch (3.dag[parama.ordinal()])
        {
        }
      }
      for (;;)
      {
        if (localObject != null) {
          ((d)localObject).onCreate();
        }
        if ((localObject != null) && (!locala.dah.containsKey(parama))) {
          locala.dah.put(parama, localObject);
        }
        return (d)locala.dah.get(parama);
        localObject = new b();
        continue;
        localObject = new c();
        continue;
        localObject = new g();
        continue;
        localObject = new a();
      }
    }
    x.e("MicroMsg.ArtistCacheManager", "[getArtistCache] id is not contains! %s", new Object[] { this.dae });
    return null;
  }
  
  @Deprecated
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    x.i("MicroMsg.ArtistCacheManager", "[onReceive]");
    if ((paramIntent != null) && (paramIntent.getAction().equals("com.tencent.mm.plugin.photoedit.action.clear")))
    {
      x.i("MicroMsg.ArtistCacheManager", "[clearAllCache]");
      paramContext = dac.entrySet().iterator();
      while (paramContext.hasNext()) {
        ((a)((Map.Entry)paramContext.next()).getValue()).clearAll();
      }
      dad.clear();
      dab = null;
      e.cjw();
      e.post(new ArtistCacheManager.2(this), "MicroMsg.ArtistCacheManager[clearAllCache]");
    }
  }
  
  public final class a
  {
    public HashMap<com.tencent.mm.d.a, d> dah = new HashMap();
    
    public a() {}
    
    public final void clearAll()
    {
      Iterator localIterator = this.dah.entrySet().iterator();
      while (localIterator.hasNext()) {
        ((d)((Map.Entry)localIterator.next()).getValue()).onDestroy();
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/cache/ArtistCacheManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */