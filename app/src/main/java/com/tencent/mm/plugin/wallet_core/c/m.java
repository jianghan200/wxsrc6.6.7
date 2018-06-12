package com.tencent.mm.plugin.wallet_core.c;

import com.tencent.mm.plugin.wallet_core.model.BindCardOrder;
import com.tencent.mm.wallet_core.tenpay.model.i;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class m
  extends i
{
  public String hKX;
  public String pjp;
  public String pjq;
  public BindCardOrder pjr;
  
  public m(BindCardOrder paramBindCardOrder, String paramString1, String paramString2, String paramString3, String paramString4, long paramLong1, long paramLong2, String paramString5, String paramString6, int paramInt1, int paramInt2)
  {
    this.pjr = paramBindCardOrder;
    paramBindCardOrder = new HashMap();
    paramBindCardOrder.put("activity_id", paramString1);
    paramBindCardOrder.put("award_id", paramString2);
    paramBindCardOrder.put("send_record_id", paramString3);
    paramBindCardOrder.put("user_record_id", paramString4);
    paramBindCardOrder.put("activity_mch_id", String.valueOf(paramLong1));
    paramBindCardOrder.put("activity_type", String.valueOf(paramLong2));
    paramBindCardOrder.put("bank_type", paramString5);
    paramBindCardOrder.put("bank_serial", paramString6);
    paramBindCardOrder.put("bindbankscene", String.valueOf(paramInt1));
    paramBindCardOrder.put("realname_scene", String.valueOf(paramInt2));
    F(paramBindCardOrder);
  }
  
  public final int If()
  {
    return 1786;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    if ((paramJSONObject != null) && (paramInt == 0))
    {
      this.pjp = paramJSONObject.optString("result_code");
      this.hKX = paramJSONObject.optString("result_msg");
      this.pjq = paramJSONObject.optString("alert_wording");
    }
  }
  
  public final int aBO()
  {
    return 1786;
  }
  
  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/sendbindcardaward";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/c/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */