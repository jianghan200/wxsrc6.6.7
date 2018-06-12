package com.tencent.mm.wallet_core.e.a;

import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.c.o;
import java.util.HashMap;
import org.json.JSONObject;

public final class b
  extends a
{
  public b()
  {
    F(new HashMap());
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    x.d("Micromsg.NetScenePayUTimeSeed", " errCode: " + paramInt + " errMsg :" + paramString);
    paramString = paramJSONObject.optString("time_stamp");
    if (!bi.oW(paramString)) {
      o.setTimeStamp(paramString);
    }
  }
  
  public final int bOo()
  {
    return 28;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/wallet_core/e/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */