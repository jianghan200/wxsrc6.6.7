package com.tencent.mm.plugin.offline.a;

import com.tencent.mm.compatible.e.q;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.offline.c.a;
import com.tencent.mm.plugin.offline.k;
import com.tencent.mm.sdk.platformtools.ac;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.storage.x;
import com.tencent.mm.wallet_core.tenpay.model.i;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class n
  extends i
{
  public static String lJU = "";
  public static String lKn = "";
  private int hUm = -1;
  private String hUn = "";
  public int lJK = -1;
  public String lJL = "";
  public String lKo = "";
  public String lKp = "";
  public String lKq = "";
  final Map<String, String> lKr = new HashMap();
  
  public n(String paramString, int paramInt)
  {
    this.lKr.put("device_id", q.zz());
    this.lKr.put("timestamp", paramString);
    this.lKr.put("scene", String.valueOf(paramInt));
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(q.zz());
    localStringBuilder.append("&");
    localStringBuilder.append(paramString);
    paramString = localStringBuilder.toString();
    this.lKr.put("sign", ac.ce(paramString));
    paramString = this.lKr;
    localStringBuilder = new StringBuilder();
    g.Ek();
    paramString.put("code_ver", g.Ei().DT().get(aa.a.sOz, ""));
    F(this.lKr);
  }
  
  public final int If()
  {
    return 568;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    if (paramJSONObject != null)
    {
      lJU = paramJSONObject.optString("limit_fee");
      lKn = paramJSONObject.optString("is_show_order_detail");
      paramString = paramJSONObject.optString("pay_amount");
      String str1 = paramJSONObject.optString("pay_number");
      String str2 = paramJSONObject.optString("card_logos");
      k.bkO();
      k.aw(196629, lJU);
      k.bkO();
      k.aw(196641, lKn);
      k.bkO();
      k.aw(196645, paramString);
      k.bkO();
      k.aw(196646, str1);
      a.Je(str2);
      this.hUm = paramJSONObject.optInt("retcode");
      this.hUn = paramJSONObject.optString("retmsg");
      this.lJK = paramJSONObject.optInt("wx_error_type");
      this.lJL = paramJSONObject.optString("wx_error_msg");
      this.lKo = paramJSONObject.optString("get_code_flag");
      this.lKp = paramJSONObject.optString("micropay_pause_flag");
      this.lKq = paramJSONObject.optString("micropay_pause_word");
    }
  }
  
  public final int aBO()
  {
    return 49;
  }
  
  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/offlinequeryuser";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/offline/a/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */