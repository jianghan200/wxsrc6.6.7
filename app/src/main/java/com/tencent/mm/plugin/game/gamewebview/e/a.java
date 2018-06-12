package com.tencent.mm.plugin.game.gamewebview.e;

import com.tencent.mm.protocal.c.aoc;
import java.util.HashMap;

public final class a
{
  private static final HashMap<String, aoc> jKH = new HashMap();
  
  public static boolean bI(String paramString1, String paramString2)
  {
    paramString1 = (aoc)jKH.get(paramString1 + "#" + paramString2);
    return (paramString1 != null) && (paramString1.reL == 1);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/e/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */