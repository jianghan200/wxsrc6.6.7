package com.tencent.mm.plugin.wxcredit.a;

import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.tenpay.model.i;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class c
  extends i
{
  public double qwm = 0.0D;
  
  public c(List<l> paramList, String paramString)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("session_key", paramString);
    paramList = paramList.iterator();
    int i = 0;
    if (paramList.hasNext())
    {
      paramString = (l)paramList.next();
      localHashMap.put("qt_id_" + i, paramString.id);
      localHashMap.put("ans_cont_" + i, paramString.kQE);
      localHashMap.put("level_" + i, paramString.level);
      localHashMap.put("parent_id_" + i, paramString.qwI);
      i += 1;
      if ((paramString.qwK == null) || (!"Y".equals(paramString.kQE))) {
        break label370;
      }
      localHashMap.put("qt_id_" + i, paramString.qwK.id);
      localHashMap.put("ans_cont_" + i, paramString.qwK.kQE);
      localHashMap.put("level_" + i, paramString.qwK.level);
      localHashMap.put("parent_id_" + i, paramString.qwK.qwI);
      i += 1;
    }
    label370:
    for (;;)
    {
      break;
      localHashMap.put("total_num", String.valueOf(i));
      F(localHashMap);
      return;
    }
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    x.d("Micromsg.NetSceneTenpayCheckPwd", "errCode " + paramInt + " errMsg: " + paramString);
    if (paramInt != 0) {
      return;
    }
    try
    {
      this.qwm = (paramJSONObject.getInt("credit_amount") / 100.0D);
      return;
    }
    catch (Exception paramString)
    {
      x.printErrStackTrace("Micromsg.NetSceneTenpayCheckPwd", paramString, "", new Object[0]);
    }
  }
  
  public final int aBO()
  {
    return 60;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/wxcredit/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */