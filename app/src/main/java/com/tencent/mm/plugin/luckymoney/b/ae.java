package com.tencent.mm.plugin.luckymoney.b;

import com.tencent.mm.plugin.wallet_core.model.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class ae
  extends ab
{
  public a cao;
  public int hUg;
  public String kLZ;
  public String kRq;
  public String kRr;
  public String kRs;
  public String kRt;
  public String kRu = "";
  public String kRv = "";
  public String kRw = "";
  public String kRx;
  
  public ae(int paramInt1, long paramLong1, long paramLong2, int paramInt2, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, int paramInt3)
  {
    this.hUg = paramInt1;
    HashMap localHashMap = new HashMap();
    localHashMap.put("totalNum", String.valueOf(paramInt1));
    localHashMap.put("totalAmount", String.valueOf(paramLong1));
    localHashMap.put("perValue", String.valueOf(paramLong2));
    localHashMap.put("hbType", String.valueOf(paramInt2));
    localHashMap.put("wishing", URLEncoder.encode(bi.oV(paramString1)));
    localHashMap.put("sendUserName", paramString5);
    if (!bi.oW(paramString3)) {
      localHashMap.put("username", paramString3);
    }
    if (!bi.oW(paramString2))
    {
      localHashMap.put("headImg", URLEncoder.encode(paramString2));
      localHashMap.put("nickName", URLEncoder.encode(bi.oV(paramString6)));
      if (!bi.oW(paramString4)) {
        localHashMap.put("receiveNickName", URLEncoder.encode(paramString4));
      }
    }
    localHashMap.put("inWay", String.valueOf(paramInt3));
    if ((paramInt3 == 0) || (paramInt3 == 1) || (paramInt3 == 7)) {
      localHashMap.put("needSendToMySelf", "0");
    }
    F(localHashMap);
  }
  
  public static a P(JSONObject paramJSONObject)
  {
    a locala = new a();
    locala.bSc = paramJSONObject.optString("retmsg");
    paramJSONObject = paramJSONObject.optJSONObject("showmess");
    locala.kRu = paramJSONObject.optString("left_button_wording");
    locala.kRv = paramJSONObject.optString("right_button_wording");
    locala.hUt = paramJSONObject.optString("right_button_url");
    return locala;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    this.kLZ = paramJSONObject.optString("sendId");
    this.kRq = paramJSONObject.optString("reqkey");
    this.kRr = paramJSONObject.optString("sendMsgXml");
    this.kRs = paramJSONObject.optString("guide_flag", "0");
    this.kRt = paramJSONObject.optString("guide_wording");
    this.kRu = paramJSONObject.optString("left_button_wording", "");
    this.kRv = paramJSONObject.optString("right_button_wording", "");
    this.kRw = paramJSONObject.optString("upload_credit_url", "");
    this.kRx = paramJSONObject.optString("id_sign", "");
    if (paramJSONObject.has("showmess"))
    {
      x.i("MicroMsg.NetSceneLuckyMoneyNormalBase", "has alert item");
      this.cao = P(paramJSONObject);
    }
  }
  
  public final String aBL()
  {
    return "/cgi-bin/mmpay-bin/requestwxhb";
  }
  
  public final int getType()
  {
    return 1575;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/luckymoney/b/ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */