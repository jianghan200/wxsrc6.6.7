package com.tencent.mm.pluginsdk.wallet;

import com.tencent.mm.g.a.lp;
import com.tencent.mm.g.a.lp.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Map;
import org.json.JSONObject;

public final class g
{
  public String appId;
  public int bJY;
  public String bVW;
  public String bVX;
  public int bVY;
  public int bVZ;
  public String dBl;
  public String extInfo;
  public String nonceStr;
  public String packageExt;
  public String partnerId;
  public int qUV;
  public int qUW = 0;
  public String qUX;
  public int qUY = 0;
  public String signType;
  public String timeStamp;
  public String url;
  
  public g() {}
  
  public g(lp paramlp)
  {
    if ((paramlp == null) || (paramlp.bVV == null)) {
      return;
    }
    this.appId = paramlp.bVV.appId;
    this.partnerId = paramlp.bVV.partnerId;
    this.signType = paramlp.bVV.signType;
    this.nonceStr = paramlp.bVV.nonceStr;
    this.timeStamp = paramlp.bVV.timeStamp;
    this.packageExt = paramlp.bVV.packageExt;
    this.bVW = paramlp.bVV.bVW;
    this.url = paramlp.bVV.url;
    this.bVX = paramlp.bVV.bVX;
    this.bVY = paramlp.bVV.bVY;
    this.bJY = paramlp.bVV.bJY;
    this.bVZ = paramlp.bVV.bVZ;
  }
  
  public g(Map<String, Object> paramMap)
  {
    this.appId = ((String)paramMap.get("appId"));
    this.partnerId = ((String)paramMap.get("partnerId"));
    this.signType = ((String)paramMap.get("signType"));
    this.nonceStr = ((String)paramMap.get("nonceStr"));
    this.timeStamp = ((String)paramMap.get("timeStamp"));
    this.packageExt = ((String)paramMap.get("package"));
    this.bVW = ((String)paramMap.get("paySign"));
    this.url = ((String)paramMap.get("url"));
    this.bVX = ((String)paramMap.get("src_username"));
    this.bVY = bi.getInt((String)paramMap.get("scene"), 0);
    if (this.bVY == 0) {
      this.bVY = bi.getInt((String)paramMap.get("pay_scene"), 0);
    }
    this.bJY = bi.getInt((String)paramMap.get("pay_channel"), 0);
    this.extInfo = bi.oV((String)paramMap.get("ext_info"));
    this.qUX = bi.oV((String)paramMap.get("token"));
    this.qUY = bi.getInt(bi.aG((String)paramMap.get("result_jump_mode"), "0"), 0);
  }
  
  public g(JSONObject paramJSONObject)
  {
    this.appId = paramJSONObject.optString("appId");
    this.partnerId = paramJSONObject.optString("partnerId");
    this.signType = paramJSONObject.optString("signType");
    this.nonceStr = paramJSONObject.optString("nonceStr");
    this.timeStamp = paramJSONObject.optString("timeStamp");
    this.packageExt = paramJSONObject.optString("package");
    this.bVW = paramJSONObject.optString("paySign");
    this.dBl = paramJSONObject.optString("cookie");
    this.url = paramJSONObject.optString("url");
    this.bVX = paramJSONObject.optString("src_username");
    this.bVY = paramJSONObject.optInt("scene", 0);
    if (this.bVY == 0) {
      this.bVY = paramJSONObject.optInt("pay_scene", 0);
    }
    this.bJY = paramJSONObject.optInt("pay_channel", 0);
    this.extInfo = paramJSONObject.optString("ext_info", "");
    this.qUX = paramJSONObject.optString("token", "");
    this.qUY = bi.getInt(paramJSONObject.optString("result_jump_mode", "0"), 0);
    this.qUW = paramJSONObject.optInt("pay_for_wallet_type", 0);
  }
  
  public static int eC(int paramInt1, int paramInt2)
  {
    if (paramInt1 != 1037) {}
    while (paramInt2 <= 0) {
      return paramInt1;
    }
    return paramInt2;
  }
  
  public static int eD(int paramInt1, int paramInt2)
  {
    int j = eC(paramInt1, paramInt2);
    int i;
    if ((j == 1000) || (j == 1018) || (j == 1017) || (j == 1033)) {
      i = 0;
    }
    for (;;)
    {
      x.i("MicroMsg.WalletJsapiData", "parsePayChannelByScene, scene: %s, rawScene: %s, resultChannel: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(i) });
      return i;
      if (j == 1019)
      {
        i = 1;
      }
      else if (j == 1010)
      {
        i = 5;
      }
      else if ((j == 1007) || (j == 1008))
      {
        i = 6;
      }
      else if (j == 1009)
      {
        i = 7;
      }
      else if ((j == 1035) || (j == 1020))
      {
        i = 8;
      }
      else if ((j == 1011) || (j == 1047) || (j == 1025))
      {
        i = 12;
      }
      else if ((j == 1012) || (j == 1032) || (j == 1048) || (j == 1050))
      {
        i = 13;
      }
      else if ((j == 1005) || (j == 1027) || (j == 1042) || (j == 1006))
      {
        i = 15;
      }
      else if ((j == 1024) || (j == 1021))
      {
        i = 16;
      }
      else if ((j == 1029) || (j == 1028))
      {
        i = 23;
      }
      else if ((j == 1013) || (j == 1031) || (j == 1049))
      {
        i = 24;
      }
      else if ((j == 1001) || (j == 1003))
      {
        i = 25;
      }
      else if ((j == 1045) || (j == 1046))
      {
        i = 26;
      }
      else if (j == 1022)
      {
        i = 27;
      }
      else if (j == 1023)
      {
        i = 28;
      }
      else if (j == 1026)
      {
        i = 29;
      }
      else if (j == 1039)
      {
        i = 30;
      }
      else if ((j == 1034) || (j == 1060))
      {
        i = 31;
      }
      else if ((j != 1014) && (j != 1043) && (j != 1044))
      {
        i = j;
        if (j != 1036) {}
      }
      else
      {
        i = 32;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/pluginsdk/wallet/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */