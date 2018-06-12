package com.tencent.mm.plugin.appbrand.ipc;

import android.os.Parcelable;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public final class d
{
  private static final HashMap<String, MMToClientEvent> fEx = new HashMap();
  
  public static void a(MMToClientEvent paramMMToClientEvent)
  {
    x.i("MicroMsg.MMToClientEventCenter", "register MMToClientEvent.appId:%s, MMToClientEvent.hash:%d", new Object[] { paramMMToClientEvent.appId, Integer.valueOf(paramMMToClientEvent.hashCode()) });
    if (paramMMToClientEvent.appId == null)
    {
      x.e("MicroMsg.MMToClientEventCenter", "register MMToClientEvent.appId is null!!!");
      return;
    }
    for (;;)
    {
      synchronized (fEx)
      {
        if (fEx.get(paramMMToClientEvent.appId) == null)
        {
          fEx.put(paramMMToClientEvent.appId, paramMMToClientEvent);
          return;
        }
      }
      x.d("MicroMsg.MMToClientEventCenter", "The CommonConfig is already exist!~ so replace it");
      fEx.remove(paramMMToClientEvent.appId);
      fEx.put(paramMMToClientEvent.appId, paramMMToClientEvent);
    }
  }
  
  public static void aB(String paramString, int paramInt)
  {
    x.i("MicroMsg.MMToClientEventCenter", "notify unread:%d", new Object[] { Integer.valueOf(paramInt) });
    synchronized (fEx)
    {
      paramString = (MMToClientEvent)fEx.get(paramString);
      if (paramString == null) {}
    }
    x.e("MicroMsg.MMToClientEventCenter", "notify fail!!! The MMToClientEvent isn't exist!!!");
  }
  
  public static void b(MMToClientEvent paramMMToClientEvent)
  {
    x.i("MicroMsg.MMToClientEventCenter", "unregister MMToClientEvent.appId:%s", new Object[] { paramMMToClientEvent.appId });
    synchronized (fEx)
    {
      fEx.remove(paramMMToClientEvent.appId);
      return;
    }
  }
  
  public static <T extends Parcelable> void c(T paramT)
  {
    Object localObject2 = new LinkedList();
    synchronized (fEx)
    {
      Iterator localIterator = fEx.values().iterator();
      if (localIterator.hasNext()) {
        ((LinkedList)localObject2).add((MMToClientEvent)localIterator.next());
      }
    }
    localObject2 = ((LinkedList)localObject2).iterator();
    while (((Iterator)localObject2).hasNext()) {
      synchronized ((MMToClientEvent)((Iterator)localObject2).next())
      {
        ((MMToClientEvent)???).fEp = 5;
        ((MMToClientEvent)???).fEq = paramT.getClass().getName();
        ((MMToClientEvent)???).fEr = paramT;
        ((MMToClientEvent)???).ahH();
      }
    }
  }
  
  public static void k(String paramString1, int paramInt, String paramString2)
  {
    x.i("MicroMsg.MMToClientEventCenter", "notify appId:%s, type:%d, config:%s", new Object[] { paramString1, Integer.valueOf(paramInt), paramString2 });
    MMToClientEvent localMMToClientEvent;
    synchronized (fEx)
    {
      localMMToClientEvent = (MMToClientEvent)fEx.get(paramString1);
      if (localMMToClientEvent == null) {}
    }
    x.e("MicroMsg.MMToClientEventCenter", "notify fail!!! The MMToClientEvent isn't exist!!!");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/ipc/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */