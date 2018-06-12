package com.tencent.mm.plugin.wxcredit.a;

import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.tenpay.model.i;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class d
  extends i
{
  public k qwn;
  
  public d(String paramString1, String paramString2)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("bind_serialno", paramString1);
    localHashMap.put("bank_type", paramString2);
    localHashMap.put("query_method", "1");
    F(localHashMap);
    paramString1 = new HashMap();
    paramString1.put("banktype", paramString2);
    aC(paramString1);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    boolean bool = true;
    x.d("Micromsg.NetSceneTenpayCheckPwd", "errCode " + paramInt + " errMsg: " + paramString);
    if (paramInt != 0) {
      return;
    }
    for (;;)
    {
      JSONObject localJSONObject;
      String str;
      try
      {
        this.qwn = new k();
        this.qwn.qwr = paramJSONObject.optInt("credit_state");
        this.qwn.qwm = (paramJSONObject.optInt("credit_amount") / 100.0D);
        this.qwn.qws = (paramJSONObject.optInt("credit_usable") / 100.0D);
        this.qwn.qwt = (paramJSONObject.optInt("bill_amount") / 100.0D);
        this.qwn.qwu = paramJSONObject.optInt("bill_date");
        this.qwn.qwv = (paramJSONObject.optInt("repay_amount") / 100.0D);
        this.qwn.qww = (paramJSONObject.optInt("repay_minimum") / 100.0D);
        paramString = this.qwn;
        if (paramJSONObject.optInt("upgrade_amount") != 1) {
          break label505;
        }
        paramString.qwx = bool;
        this.qwn.qwy = paramJSONObject.optInt("bill_month");
        this.qwn.qwz = paramJSONObject.optString("repay_url");
        this.qwn.qwA = paramJSONObject.optString("repay_lasttime");
        this.qwn.qwE = paramJSONObject.optString("lasttime");
        paramString = paramJSONObject.getJSONArray("jump_url_array");
        if ((paramString == null) || (paramString.length() <= 0)) {
          break label408;
        }
        int i = paramString.length();
        paramInt = 0;
        if (paramInt >= i) {
          break label408;
        }
        localJSONObject = paramString.getJSONObject(paramInt);
        str = localJSONObject.getString("jump_name");
        if ("account_rights_url".equals(str)) {
          this.qwn.qwC = localJSONObject.getString("jump_url");
        } else if ("bill_url".equals(str)) {
          this.qwn.qwD = localJSONObject.getString("jump_url");
        }
      }
      catch (Exception paramString)
      {
        x.printErrStackTrace("Micromsg.NetSceneTenpayCheckPwd", paramString, "", new Object[0]);
        return;
      }
      if ("card_detail_url".equals(str))
      {
        this.qwn.qwB = localJSONObject.getString("jump_url");
      }
      else if ("know_more_url".equals(str))
      {
        this.qwn.qwF = localJSONObject.getString("jump_url");
        break label498;
        label408:
        paramString = paramJSONObject.getJSONObject("appservice");
        if (paramString == null) {
          break;
        }
        this.qwn.qwG = new j();
        this.qwn.qwG.qwq = paramString.getString("app_telephone");
        this.qwn.qwG.nickname = paramString.getString("nickname");
        this.qwn.qwG.username = paramString.getString("username");
        this.qwn.qwG.url = paramString.getString("jump_url");
        return;
      }
      label498:
      paramInt += 1;
      continue;
      label505:
      bool = false;
    }
  }
  
  public final int aBO()
  {
    return 57;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/wxcredit/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */