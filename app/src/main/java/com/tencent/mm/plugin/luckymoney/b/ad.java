package com.tencent.mm.plugin.luckymoney.b;

import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.a.b;
import com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class ad
  extends ab
{
  long bJC;
  public String ceR;
  public String kLZ;
  public RealnameGuideHelper kMP;
  public f kQP = null;
  public String kRp;
  public String talker;
  
  public ad(int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7)
  {
    this.kLZ = paramString1;
    this.ceR = paramString2;
    this.talker = paramString5;
    HashMap localHashMap = new HashMap();
    localHashMap.put("msgType", String.valueOf(paramInt1));
    localHashMap.put("channelId", String.valueOf(paramInt2));
    localHashMap.put("sendId", paramString1);
    if (!bi.oW(paramString2)) {
      localHashMap.put("nativeUrl", URLEncoder.encode(paramString2));
    }
    if (!bi.oW(paramString3))
    {
      localHashMap.put("headImg", URLEncoder.encode(paramString3));
      localHashMap.put("nickName", URLEncoder.encode(bi.oV(paramString4)));
    }
    localHashMap.put("sessionUserName", paramString5);
    localHashMap.put("ver", paramString6);
    localHashMap.put("timingIdentifier", paramString7);
    F(localHashMap);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    try
    {
      this.kQP = m.M(paramJSONObject);
      if ((paramInt == 0) && (paramJSONObject.has("real_name_info")))
      {
        Object localObject = paramJSONObject.optJSONObject("real_name_info");
        if (localObject != null)
        {
          paramString = ((JSONObject)localObject).optString("guide_flag");
          String str1 = ((JSONObject)localObject).optString("guide_wording");
          String str2 = ((JSONObject)localObject).optString("left_button_wording");
          String str3 = ((JSONObject)localObject).optString("right_button_wording");
          localObject = ((JSONObject)localObject).optString("upload_credit_url");
          this.kMP = new RealnameGuideHelper();
          this.kMP.a(paramString, str1, str2, str3, (String)localObject, 1003);
        }
      }
      this.kRp = paramJSONObject.optString("SystemMsgContext");
      if ((paramInt == 0) && (!bi.oW(this.kRp)))
      {
        boolean bool = bi.oW(this.kQP.kQg);
        if (bool) {}
      }
      try
      {
        this.kRp = this.kRp.replace("$" + this.kQP.kQg + "$", ((b)g.l(b.class)).gT(this.kQP.kQg));
        o.dC(this.kRp, this.talker);
        return;
      }
      catch (Exception paramString)
      {
        x.e("NetSceneLuckyMoneyDetail", "insertLocalSysMsgIfNeed error: %s", new Object[] { paramString.getMessage() });
        return;
      }
      return;
    }
    catch (JSONException paramString)
    {
      x.w("NetSceneLuckyMoneyDetail", "parse luckyMoneyDetail fail: " + paramString.getLocalizedMessage());
    }
  }
  
  public final String aBL()
  {
    return "/cgi-bin/mmpay-bin/openwxhb";
  }
  
  public final int getType()
  {
    return 1685;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/luckymoney/b/ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */