package com.tencent.mm.plugin.wxcredit.a;

import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.tenpay.model.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class e
  extends i
{
  public List<l> qwo;
  public int qwp;
  public String token;
  
  public e(String paramString)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("bind_serialno", paramString);
    F(localHashMap);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    x.d("Micromsg.NetSceneTenpayCheckPwd", "errCode " + paramInt + " errMsg: " + paramString);
    if (paramInt != 0) {
      return;
    }
    for (;;)
    {
      try
      {
        this.token = paramJSONObject.getString("session_key");
        this.qwp = paramJSONObject.optInt("answer_times_left", -1);
        paramString = paramJSONObject.getJSONArray("Array");
        if ((paramString == null) || (paramString.length() <= 0)) {
          break;
        }
        paramJSONObject = new HashMap();
        int i = paramString.length();
        paramInt = 0;
        if (paramInt < i)
        {
          JSONObject localJSONObject = paramString.getJSONObject(paramInt);
          l locall = new l();
          locall.id = localJSONObject.getString("qt_id");
          locall.qwI = localJSONObject.getString("parent_id");
          locall.type = localJSONObject.getString("qt_type");
          locall.desc = localJSONObject.getString("qt_cont");
          locall.qwJ = localJSONObject.getInt("ans_len");
          locall.hyz = localJSONObject.getString("wording");
          locall.level = localJSONObject.getInt("level");
          if ((paramJSONObject.containsKey(locall.qwI)) && (!"0".equals(locall.qwI))) {
            ((l)paramJSONObject.get(locall.qwI)).qwK = locall;
          } else {
            paramJSONObject.put(locall.id, locall);
          }
        }
      }
      catch (JSONException paramString)
      {
        x.printErrStackTrace("Micromsg.NetSceneTenpayCheckPwd", paramString, "", new Object[0]);
        return;
      }
      this.qwo = new ArrayList(paramJSONObject.values());
      paramJSONObject.clear();
      return;
      paramInt += 1;
    }
  }
  
  public final int aBO()
  {
    return 59;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/wxcredit/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */