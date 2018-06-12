package com.tencent.mm.plugin.wallet_core.c;

import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.tenpay.model.i;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class aa
  extends i
{
  public JSONObject fFc;
  public String pjF = "";
  
  public aa(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, long paramLong)
  {
    this.pjF = paramString1;
    HashMap localHashMap = new HashMap();
    localHashMap.put("activity_id", paramString1);
    localHashMap.put("award_id", paramString2);
    localHashMap.put("send_record_id", paramString3);
    localHashMap.put("user_record_id", paramString4);
    localHashMap.put("req_key", paramString5);
    localHashMap.put("transaction_id", paramString6);
    localHashMap.put("activity_mch_id", String.valueOf(paramLong));
    F(localHashMap);
  }
  
  public final int If()
  {
    return 1979;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    x.i("MicroMsg.NetSceneTenpayQueryPayaward", "errcode %s errmsg %s json %s", new Object[] { Integer.valueOf(paramInt), paramString, paramJSONObject });
    this.fFc = paramJSONObject;
  }
  
  public final int aBO()
  {
    return 1979;
  }
  
  public final boolean bkU()
  {
    return false;
  }
  
  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/querypayaward";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/c/aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */