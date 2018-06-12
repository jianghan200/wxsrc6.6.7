package com.tencent.mm.plugin.game.gamewebview.model;

import java.util.HashMap;

public final class b
{
  private static HashMap<String, String> jHY = new HashMap();
  
  public static String Dg(String paramString)
  {
    return (String)jHY.get(paramString);
  }
  
  public static void Dh(String paramString)
  {
    jHY.remove(paramString);
  }
  
  public static void cV(String paramString1, String paramString2)
  {
    jHY.put(paramString1, paramString2);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/model/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */