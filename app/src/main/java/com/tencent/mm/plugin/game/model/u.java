package com.tencent.mm.plugin.game.model;

import com.tencent.mm.sdk.platformtools.bi;
import java.util.LinkedList;
import java.util.Map;

public final class u
{
  public static String B(Map<String, String> paramMap)
  {
    return bi.aG((String)paramMap.get(".sysmsg.gamecenter.formatcontent"), "");
  }
  
  public static long C(Map<String, String> paramMap)
  {
    return bi.getLong((String)paramMap.get(".sysmsg.game_control_info.control_flag"), 0L);
  }
  
  static void a(Map<String, String> paramMap, s params)
  {
    params.jMr.clear();
    int i = 0;
    if (i == 0) {}
    for (String str = ".sysmsg.gamecenter.userinfo";; str = ".sysmsg.gamecenter.userinfo" + i)
    {
      if (!paramMap.containsKey(str)) {
        return;
      }
      s.h localh = new s.h();
      localh.userName = bi.aG((String)paramMap.get(str + ".username"), "");
      localh.bgn = bi.aG((String)paramMap.get(str + ".nickname"), "");
      localh.jNp = bi.aG((String)paramMap.get(str + ".usericon"), "");
      localh.jNr = bi.aG((String)paramMap.get(str + ".badge_icon"), "");
      localh.jNs = bi.aG((String)paramMap.get(str + ".$jump_id"), "");
      params.jMr.add(localh);
      i += 1;
      break;
    }
  }
  
  public static void b(Map<String, String> paramMap, s params)
  {
    boolean bool2 = true;
    params.jMI.url = bi.aG((String)paramMap.get(".sysmsg.gamecenter.floatlayer.open_url"), "");
    s.a locala = params.jMI;
    if (bi.getInt((String)paramMap.get(".sysmsg.gamecenter.floatlayer.full_screen"), 0) == 1)
    {
      bool1 = true;
      locala.jMc = bool1;
      params.jMI.orientation = bi.getInt((String)paramMap.get(".sysmsg.gamecenter.floatlayer.orientation"), 0);
      params = params.jMI;
      if (bi.getInt((String)paramMap.get(".sysmsg.gamecenter.floatlayer.is_transparent"), 0) != 1) {
        break label117;
      }
    }
    label117:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      params.jNf = bool1;
      return;
      bool1 = false;
      break;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/game/model/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */