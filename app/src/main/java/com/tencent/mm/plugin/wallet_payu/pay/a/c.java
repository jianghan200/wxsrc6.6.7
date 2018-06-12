package com.tencent.mm.plugin.wallet_payu.pay.a;

import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.wallet_core.e.a.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class c
  extends a
{
  public Orders mCZ = null;
  private String pfn = null;
  
  public c(String paramString)
  {
    this(paramString, 0);
  }
  
  public c(String paramString, int paramInt)
  {
    this.pfn = paramString;
    paramString = new HashMap();
    paramString.put("req_key", this.pfn);
    paramString.put("query_scene", String.valueOf(paramInt));
    F(paramString);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    this.mCZ = Orders.ah(paramJSONObject);
    if (this.mCZ != null) {
      this.mCZ.bOd = this.pfn;
    }
  }
  
  public final int bOo()
  {
    return 8;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/wallet_payu/pay/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */