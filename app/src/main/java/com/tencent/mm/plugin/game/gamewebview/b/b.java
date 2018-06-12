package com.tencent.mm.plugin.game.gamewebview.b;

import com.tencent.mm.sdk.platformtools.bi;
import java.util.Map;

public final class b
{
  public static Map<String, a> jHU;
  
  public static void a(a parama)
  {
    if (bi.oW(parama.getName())) {
      return;
    }
    jHU.put(parama.getName(), parama);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */