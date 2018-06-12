package com.tencent.mm.wallet_core.tenpay.model;

import com.tencent.mm.platformtools.af;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Map;
import org.json.JSONObject;

public class f
  extends l
{
  protected JSONObject uXV;
  public boolean uXW = false;
  public int uXX = 0;
  public boolean uXY = false;
  
  public f(Map<String, String> paramMap)
  {
    x.i("MicroMsg.NetSceneDelayQueryOrder", "NetSceneDelayQueryOrder call");
    F(paramMap);
  }
  
  public int If()
  {
    return 1525;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    super.a(paramInt, paramString, paramJSONObject);
    JSONObject localJSONObject1 = paramJSONObject;
    if (af.eyh) {}
    try
    {
      localJSONObject1 = new JSONObject("{\"retcode\":268447844,\"retmsg\":\"系统麻烦请稍后再试\",\"can_pay_retry\":1,\"show_retmsg_type\":1}");
      x.i("MicroMsg.NetSceneDelayQueryOrder", "errCode = " + paramInt + "errMsg=" + paramString);
      this.uXV = localJSONObject1;
      if (localJSONObject1 != null)
      {
        x.d("MicroMsg.NetSceneDelayQueryOrder", "ret json: %s", new Object[] { localJSONObject1.toString() });
        if (localJSONObject1.optInt("can_pay_retry") != 1) {
          break label119;
        }
      }
      label119:
      for (boolean bool = true;; bool = false)
      {
        this.uXW = bool;
        this.uXX = localJSONObject1.optInt("show_retmsg_type");
        return;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        JSONObject localJSONObject2 = paramJSONObject;
      }
    }
  }
  
  public final int aBO()
  {
    return 1525;
  }
  
  public final JSONObject cDy()
  {
    return this.uXV;
  }
  
  public String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/payorderquery";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/wallet_core/tenpay/model/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */