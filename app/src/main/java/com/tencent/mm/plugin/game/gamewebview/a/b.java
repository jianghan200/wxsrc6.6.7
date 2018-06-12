package com.tencent.mm.plugin.game.gamewebview.a;

import java.util.HashMap;
import java.util.Map;

public final class b
{
  private static final Map<String, Integer> jGa;
  
  static
  {
    HashMap localHashMap = new HashMap();
    jGa = localHashMap;
    localHashMap.put("addDownloadTaskStraight", Integer.valueOf(1));
    jGa.put("cancelDownloadTask", Integer.valueOf(2));
    jGa.put("pauseDownloadTask", Integer.valueOf(3));
    jGa.put("resumeDownloadTask", Integer.valueOf(4));
    jGa.put("openCustomWebview", Integer.valueOf(5));
    jGa.put("openUrlWithExtraWebview", Integer.valueOf(6));
    jGa.put("sendAppMessage", Integer.valueOf(7));
  }
  
  public static int CZ(String paramString)
  {
    if (!jGa.containsKey(paramString)) {
      return 0;
    }
    return ((Integer)jGa.get(paramString)).intValue();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */