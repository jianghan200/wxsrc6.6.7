package com.tencent.mm.plugin.luckymoney.b;

import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.storage.x;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class u
  extends r
{
  public String ceR;
  public int ceS;
  public int ceT;
  public String kLZ;
  public int kPI;
  public String kPJ;
  public String kQH;
  public String kQI;
  public int kQL;
  public String kQM;
  public String kQN;
  public int kQO;
  public int kQQ;
  public String kQR;
  public String kQS;
  public int kQT = 1;
  public String kQU = null;
  public String kQV = null;
  public String kQW = null;
  public String kQX = null;
  public String kQY = null;
  public long kQZ = 0L;
  public ai kQa;
  public String kQb;
  
  public u(String paramString1, String paramString2, int paramInt, String paramString3)
  {
    this.ceR = paramString2;
    this.kLZ = paramString1;
    this.kQQ = paramInt;
    HashMap localHashMap = new HashMap();
    localHashMap.put("sendId", paramString1);
    if (!bi.oW(paramString2)) {
      localHashMap.put("nativeUrl", URLEncoder.encode(paramString2));
    }
    localHashMap.put("way", String.valueOf(paramInt));
    localHashMap.put("channelId", "2");
    localHashMap.put("package", paramString3);
    g.Ek();
    long l = ((Long)g.Ei().DT().get(aa.a.sTd, Long.valueOf(0L))).longValue();
    if (l > 0L)
    {
      if (System.currentTimeMillis() >= l) {
        break label196;
      }
      localHashMap.put("agreeDuty", "0");
    }
    for (;;)
    {
      F(localHashMap);
      return;
      label196:
      paramString1 = new StringBuilder();
      g.Ek();
      localHashMap.put("agreeDuty", (Integer)g.Ei().DT().get(aa.a.sTe, Integer.valueOf(1)));
    }
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    this.kQR = paramJSONObject.optString("spidLogo");
    this.kQS = paramJSONObject.optString("spidWishing");
    this.kQH = paramJSONObject.optString("spidName");
    this.kQR = paramJSONObject.optString("spidLogo");
    this.ceS = paramJSONObject.optInt("hbStatus");
    this.ceT = paramJSONObject.optInt("receiveStatus");
    this.kPJ = paramJSONObject.optString("statusMess");
    this.kQI = paramJSONObject.optString("hintMess");
    this.kQb = paramJSONObject.optString("watermark");
    this.kLZ = paramJSONObject.optString("sendId");
    this.kQL = paramJSONObject.optInt("focusFlag");
    this.kQM = paramJSONObject.optString("focusWording");
    this.kQN = paramJSONObject.optString("focusAppidUserName");
    this.kQO = paramJSONObject.optInt("isFocus");
    this.kPI = paramJSONObject.optInt("hbType");
    paramString = paramJSONObject.optJSONObject("agree_duty");
    if (paramString != null)
    {
      this.kQU = paramString.optString("agreed_flag", "-1");
      this.kQV = paramString.optString("title", "");
      this.kQW = paramString.optString("service_protocol_wording", "");
      this.kQX = paramString.optString("service_protocol_url", "");
      this.kQY = paramString.optString("button_wording", "");
      this.kQZ = paramString.optLong("delay_expired_time", 0L);
    }
    if (this.kQZ > 0L)
    {
      g.Ek();
      g.Ei().DT().a(aa.a.sTd, Long.valueOf(System.currentTimeMillis() + this.kQZ * 1000L));
    }
    this.kQa = m.O(paramJSONObject.optJSONObject("operationTail"));
  }
  
  public final int aBM()
  {
    return 0;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/luckymoney/b/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */