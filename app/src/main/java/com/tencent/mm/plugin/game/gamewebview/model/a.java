package com.tencent.mm.plugin.game.gamewebview.model;

import com.tencent.mm.plugin.game.gamewebview.ui.d;
import java.util.HashMap;

public final class a
{
  private static HashMap<Integer, d> jHX = new HashMap();
  
  public static void a(d paramd)
  {
    jHX.put(Integer.valueOf(paramd.hashCode()), paramd);
  }
  
  public static void b(d paramd)
  {
    jHX.remove(Integer.valueOf(paramd.hashCode()));
  }
  
  public static void cleanup()
  {
    jHX.clear();
  }
  
  public static d qL(int paramInt)
  {
    return (d)jHX.get(Integer.valueOf(paramInt));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/model/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */