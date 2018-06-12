package com.tencent.mm.plugin.game.gamewebview.ipc;

import android.os.Bundle;
import com.tencent.mm.model.au;
import com.tencent.mm.network.n;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public final class a
{
  private static HashMap<Integer, GameMMToClientEvent> fEx = new HashMap();
  private static n jkm;
  
  static
  {
    a.1 local1 = new a.1();
    jkm = local1;
    au.a(local1);
  }
  
  public static void a(int paramInt, GameMMToClientEvent paramGameMMToClientEvent)
  {
    fEx.put(Integer.valueOf(paramInt), paramGameMMToClientEvent);
  }
  
  public static void qK(int paramInt)
  {
    fEx.remove(Integer.valueOf(paramInt));
  }
  
  public static void z(Bundle paramBundle)
  {
    try
    {
      x.d("MicroMsg.GameMMToClientEventCenter", "notifyToAllClint");
      Iterator localIterator = fEx.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        GameMMToClientEvent localGameMMToClientEvent = (GameMMToClientEvent)localEntry.getValue();
        if (localGameMMToClientEvent != null)
        {
          localGameMMToClientEvent.jGg = ((Integer)localEntry.getKey()).intValue();
          localGameMMToClientEvent.jfZ = paramBundle;
          localGameMMToClientEvent.ahH();
        }
      }
    }
    finally {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/ipc/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */