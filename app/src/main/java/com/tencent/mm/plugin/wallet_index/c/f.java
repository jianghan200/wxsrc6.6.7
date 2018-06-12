package com.tencent.mm.plugin.wallet_index.c;

import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.tenpay.model.i;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class f
  extends i
{
  public f(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("toUser", paramString1);
    localHashMap.put("receiverTitle", paramString2);
    localHashMap.put("senderTitle", paramString3);
    localHashMap.put("tempId", paramString4);
    localHashMap.put("receiverdes", paramString6);
    localHashMap.put("senderdes", paramString5);
    localHashMap.put("Url", paramString7);
    localHashMap.put("Scene", paramString8);
    F(localHashMap);
  }
  
  public final int If()
  {
    return 1962;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    x.d("Micromsg.NetSceneSendC2CMsg", "errCode " + paramInt + " errMsg: " + paramString);
    if (paramInt != 0) {}
  }
  
  public final int aBO()
  {
    return 0;
  }
  
  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/h5sendc2cmsg";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/wallet_index/c/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */