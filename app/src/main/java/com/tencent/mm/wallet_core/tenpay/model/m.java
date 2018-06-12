package com.tencent.mm.wallet_core.tenpay.model;

import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.c.o;
import java.util.HashMap;
import org.json.JSONObject;

public final class m
  extends i
{
  public m()
  {
    F(new HashMap());
  }
  
  public final int If()
  {
    return 477;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    x.d("Micromsg.NetSceneTenpayTimeSeed", " errCode: " + paramInt + " errMsg :" + paramString);
    paramString = paramJSONObject.optString("time_stamp");
    if (!bi.oW(paramString))
    {
      o.setTimeStamp(paramString);
      return;
    }
    x.w("Micromsg.NetSceneTenpayTimeSeed", "hy: no timeseed. use local timeseed");
    o.setTimeStamp(System.currentTimeMillis() / 1000L);
  }
  
  public final int aBO()
  {
    return 19;
  }
  
  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/timeseed";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/wallet_core/tenpay/model/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */