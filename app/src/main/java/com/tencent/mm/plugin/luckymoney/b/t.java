package com.tencent.mm.plugin.luckymoney.b;

import com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class t
  extends r
{
  public int ceS;
  public int ceT;
  public long cfh;
  public int hUg;
  public String kLZ;
  public RealnameGuideHelper kMP;
  public String kPJ;
  public a kPY;
  public String kQH;
  public String kQI;
  public int kQJ;
  public String kQK;
  public int kQL;
  public String kQM;
  public String kQN;
  public int kQO;
  public f kQP = null;
  
  public t(String paramString1, String paramString2, int paramInt, String paramString3, String paramString4)
  {
    this.kLZ = paramString1;
    HashMap localHashMap = new HashMap();
    localHashMap.put("sendId", paramString1);
    if (!bi.oW(paramString2)) {
      localHashMap.put("nativeUrl", URLEncoder.encode(paramString2));
    }
    localHashMap.put("way", String.valueOf(paramInt));
    localHashMap.put("channelId", "2");
    localHashMap.put("package", paramString3);
    localHashMap.put("sessionUserName", paramString4);
    F(localHashMap);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    this.kQH = paramJSONObject.optString("spidName");
    this.ceS = paramJSONObject.optInt("hbStatus");
    this.ceT = paramJSONObject.optInt("receiveStatus");
    this.kPJ = paramJSONObject.optString("statusMess");
    this.kQI = paramJSONObject.optString("hintMess");
    this.cfh = paramJSONObject.optLong("amount");
    this.kQJ = paramJSONObject.optInt("recNum");
    this.hUg = paramJSONObject.optInt("totalNum");
    this.kPY = new a();
    paramString = paramJSONObject.optJSONObject("atomicFunc");
    if (paramString != null)
    {
      this.kPY.ddp = paramString.optInt("enable");
      this.kPY.kPx = paramString.optString("fissionContent");
      this.kPY.kPw = paramString.optString("fissionUrl");
    }
    this.kQL = paramJSONObject.optInt("focusFlag");
    this.kQM = paramJSONObject.optString("focusWording");
    this.kQN = paramJSONObject.optString("focusAppidUserName");
    this.kQO = paramJSONObject.optInt("isFocus");
    this.kQK = paramJSONObject.optString("smallHbButtonMess");
    try
    {
      this.kQP = m.M(paramJSONObject);
      this.kQP.kPM = paramJSONObject.optString("spidLogo");
      this.kQP.kPL = paramJSONObject.optString("spidName");
      this.kQP.kLf = paramJSONObject.optString("spidWishing");
      if ((paramInt == 0) && (paramJSONObject.has("real_name_info")))
      {
        Object localObject = paramJSONObject.optJSONObject("real_name_info");
        if (localObject != null)
        {
          paramString = ((JSONObject)localObject).optString("guide_flag");
          paramJSONObject = ((JSONObject)localObject).optString("guide_wording");
          String str1 = ((JSONObject)localObject).optString("left_button_wording");
          String str2 = ((JSONObject)localObject).optString("right_button_wording");
          localObject = ((JSONObject)localObject).optString("upload_credit_url");
          this.kMP = new RealnameGuideHelper();
          this.kMP.a(paramString, paramJSONObject, str1, str2, (String)localObject, 1005);
        }
      }
      return;
    }
    catch (JSONException paramString)
    {
      for (;;)
      {
        x.w("MicroMsg.NetSceneLuckyMoneyBusiBase", "parse luckyMoneyDetail fail: " + paramString.getLocalizedMessage());
      }
    }
  }
  
  public final int aBM()
  {
    return 1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/luckymoney/b/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */