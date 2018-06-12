package com.tencent.mm.plugin.wallet_core.id_verify.model;

import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.tenpay.model.i;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class c
  extends i
{
  public c(String paramString1, String paramString2, int paramInt)
  {
    this(paramString1, paramString2, paramInt, (byte)0);
  }
  
  private c(String paramString1, String paramString2, int paramInt, byte paramByte)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("flag", "1");
    localHashMap.put("passwd", paramString1);
    localHashMap.put("token", paramString2);
    localHashMap.put("realname_scene", String.valueOf(paramInt));
    x.i("MicroMsg.NetSceneRealNameReg", "realname_scene=%d", new Object[] { Integer.valueOf(paramInt) });
    F(localHashMap);
  }
  
  public final int If()
  {
    return 1648;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    x.i("MicroMsg.NetSceneRealNameReg", "errCode=" + paramString + ";errMsg=" + paramString);
  }
  
  public final int aBO()
  {
    return 1648;
  }
  
  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/realnamereg";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/id_verify/model/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */