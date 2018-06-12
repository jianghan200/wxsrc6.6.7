package com.tencent.mm.plugin.luckymoney.b;

import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.a.b;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class ag
  extends ab
{
  long bJC;
  public int bxk;
  public String ceR;
  public int ceS;
  public int ceT;
  public String dwi;
  public String kLZ;
  public String kLf;
  public String kNj;
  public int kPI;
  public String kPJ;
  public String kPM;
  public int kPU;
  public int kQT = 1;
  public String kQU = null;
  public String kQV = null;
  public String kQW = null;
  public String kQX = null;
  public String kQY = null;
  public long kQZ = 0L;
  public ai kQa;
  public String kQb;
  public String kQg;
  public long kRA;
  public int kRB;
  public String kRC;
  public int kRj = 0;
  public String kRy;
  public long kRz;
  public int msgType = 1;
  String talker;
  
  public ag(int paramInt1, String paramString1, String paramString2, int paramInt2, String paramString3)
  {
    this.bxk = paramInt1;
    this.kLZ = paramString1;
    this.ceR = paramString2;
    HashMap localHashMap = new HashMap();
    localHashMap.put("msgType", "1");
    localHashMap.put("channelId", String.valueOf(paramInt1));
    localHashMap.put("sendId", paramString1);
    localHashMap.put("inWay", String.valueOf(paramInt2));
    localHashMap.put("ver", paramString3);
    g.Ek();
    long l = ((Long)g.Ei().DT().get(aa.a.sTd, Long.valueOf(0L))).longValue();
    if (l > 0L)
    {
      if (System.currentTimeMillis() >= l) {
        break label221;
      }
      localHashMap.put("agreeDuty", "0");
    }
    for (;;)
    {
      if (!bi.oW(paramString2)) {
        localHashMap.put("nativeUrl", URLEncoder.encode(paramString2));
      }
      F(localHashMap);
      return;
      label221:
      paramString1 = new StringBuilder();
      g.Ek();
      localHashMap.put("agreeDuty", (Integer)g.Ei().DT().get(aa.a.sTe, Integer.valueOf(1)));
    }
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    this.kRy = paramJSONObject.optString("sendNick");
    this.kPM = paramJSONObject.optString("sendHeadImg");
    this.ceS = paramJSONObject.optInt("hbStatus");
    this.ceT = paramJSONObject.optInt("receiveStatus");
    this.kPJ = paramJSONObject.optString("statusMess");
    this.kLf = paramJSONObject.optString("wishing");
    this.kPU = paramJSONObject.optInt("isSender");
    this.kRz = paramJSONObject.optLong("sceneAmount");
    this.kRA = paramJSONObject.optLong("sceneRecTimeStamp");
    this.kPI = paramJSONObject.optInt("hbType");
    this.kQb = paramJSONObject.optString("watermark");
    this.kNj = paramJSONObject.optString("externMess");
    this.kQg = paramJSONObject.optString("sendUserName");
    if ((!bi.oW(this.kQg)) && (bi.oW(this.kRy))) {
      this.kRy = ((b)g.l(b.class)).gT(this.kQg);
    }
    this.kQa = m.O(paramJSONObject.optJSONObject("operationTail"));
    this.kRj = paramJSONObject.optInt("scenePicSwitch");
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
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneReceiveLuckyMoney", "scenePicSwitch:" + this.kRj);
    this.kRB = paramJSONObject.optInt("preStrainFlag", 1);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneReceiveLuckyMoney", "preStrainFlag:" + this.kRB);
    g.Ek();
    g.Ei().DT().a(aa.a.sSS, Integer.valueOf(this.kRB));
    this.kRC = paramJSONObject.optString("timingIdentifier");
    this.dwi = paramJSONObject.optString("effectResource");
  }
  
  public final String aBL()
  {
    return "/cgi-bin/mmpay-bin/receivewxhb";
  }
  
  public final boolean bba()
  {
    return this.kPU == 1;
  }
  
  public final int getType()
  {
    return 1581;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/luckymoney/b/ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */