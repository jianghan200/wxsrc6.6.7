package com.tencent.mm.plugin.topstory.ui.video;

import com.tencent.mm.protocal.c.bti;
import com.tencent.mm.protocal.c.ps;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class k
{
  public static final k oAn = new k();
  public bti oAo;
  
  public static JSONArray cB(List<ps> paramList)
  {
    JSONArray localJSONArray = new JSONArray();
    int i = 0;
    for (;;)
    {
      if (i < paramList.size()) {}
      try
      {
        JSONObject localJSONObject = new JSONObject();
        ps localps = (ps)paramList.get(i);
        localJSONObject.put("key", localps.aAL);
        localJSONObject.put("uintValue", localps.rtU);
        localJSONObject.put("textValue", localps.rtV);
        localJSONArray.put(localJSONObject);
        i += 1;
        continue;
        return localJSONArray;
      }
      catch (Exception localException)
      {
        for (;;) {}
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/topstory/ui/video/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */