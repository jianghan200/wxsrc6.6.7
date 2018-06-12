package com.tencent.mm.plugin.game.model;

import com.tencent.mm.sdk.platformtools.bi;
import java.util.HashMap;
import java.util.Map;

public final class z
{
  public static z jNy;
  
  public static z aUg()
  {
    if (jNy == null) {
      jNy = new z();
    }
    return jNy;
  }
  
  static void c(Map<String, String> paramMap, s params)
  {
    params.jMw.clear();
    int i = 0;
    if (i == 0) {}
    for (String str1 = ".sysmsg.gamecenter.jump_info.jump";; str1 = ".sysmsg.gamecenter.jump_info.jump" + i)
    {
      if (!paramMap.containsKey(str1)) {
        return;
      }
      String str2 = (String)paramMap.get(str1 + ".$id");
      s.d locald = new s.d();
      locald.jNj = bi.getInt((String)paramMap.get(str1 + ".jump_type"), 0);
      locald.iCI = bi.aG((String)paramMap.get(str1 + ".jump_url"), "");
      if (!bi.oW(str2)) {
        params.jMw.put(str2, locald);
      }
      i += 1;
      break;
    }
  }
  
  public static void d(Map<String, String> paramMap, s params)
  {
    params.jNa = bi.getInt((String)paramMap.get(".sysmsg.gamecenter.report.msg_subtype"), 0);
    params.jNb = bi.aG((String)paramMap.get(".sysmsg.gamecenter.report.noticeid"), "");
  }
  
  public static void e(Map<String, String> paramMap, s params)
  {
    boolean bool2 = true;
    params.jMI.url = bi.aG((String)paramMap.get(".sysmsg.gamecenter.float_layer.open_url"), "");
    s.a locala = params.jMI;
    if (bi.getInt((String)paramMap.get(".sysmsg.gamecenter.float_layer.full_screen"), 0) == 1)
    {
      bool1 = true;
      locala.jMc = bool1;
      params.jMI.orientation = bi.getInt((String)paramMap.get(".sysmsg.gamecenter.float_layer.orientation"), 0);
      params = params.jMI;
      if (bi.getInt((String)paramMap.get(".sysmsg.gamecenter.float_layer.is_transparent"), 0) != 1) {
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


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/game/model/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */