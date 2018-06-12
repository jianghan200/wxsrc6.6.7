package com.tencent.mm.plugin.order.model;

import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class e
  extends com.tencent.mm.wallet_core.tenpay.model.i
{
  public int hUg;
  private int kQJ;
  public List<d> lOA = null;
  public String lOB;
  public List<i> lOz = null;
  
  public e(int paramInt, String paramString)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("Limit", "10");
    localHashMap.put("Offset", String.valueOf(paramInt));
    localHashMap.put("Extbuf", paramString);
    F(localHashMap);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    int i = 0;
    x.d("MicroMsg.NetScenePatchQueryUserRoll", "errCode " + paramInt + " errMsg: " + paramString);
    this.lOz = new LinkedList();
    try
    {
      this.hUg = paramJSONObject.getInt("TotalNum");
      this.kQJ = paramJSONObject.getInt("RecNum");
      this.lOB = paramJSONObject.optString("Extbuf");
      paramString = paramJSONObject.getJSONArray("UserRollList");
      Object localObject;
      if (paramString != null)
      {
        paramInt = 0;
        while (paramInt < paramString.length())
        {
          localObject = new i();
          JSONObject localJSONObject = paramString.getJSONObject(paramInt);
          ((i)localObject).lOM = localJSONObject.optInt("PayType");
          ((i)localObject).lOE = localJSONObject.optString("Transid");
          ((i)localObject).lOF = localJSONObject.optDouble("TotalFee");
          ((i)localObject).lOG = localJSONObject.optString("GoodsName");
          ((i)localObject).lOH = localJSONObject.optInt("CreateTime");
          ((i)localObject).lOJ = localJSONObject.optInt("ModifyTime");
          ((i)localObject).lOK = localJSONObject.optString("FeeType");
          ((i)localObject).lOP = localJSONObject.optString("AppThumbUrl");
          ((i)localObject).lOI = localJSONObject.optString("TradeStateName");
          ((i)localObject).lOU = localJSONObject.optString("StatusColor");
          ((i)localObject).lOV = localJSONObject.optString("FeeColor");
          ((i)localObject).lOW = localJSONObject.optDouble("ActualPayFee");
          ((i)localObject).lOX = localJSONObject.optString("BillId");
          this.lOz.add(localObject);
          paramInt += 1;
        }
      }
      this.lOA = new LinkedList();
      paramString = paramJSONObject.optJSONArray("month_info");
      if (paramString != null)
      {
        paramInt = i;
        while (paramInt < paramString.length())
        {
          paramJSONObject = paramString.getJSONObject(paramInt);
          localObject = new d();
          ((d)localObject).year = paramJSONObject.optInt("year");
          ((d)localObject).month = paramJSONObject.optInt("month");
          ((d)localObject).lOy = paramJSONObject.optString("feetext");
          this.lOA.add(localObject);
          paramInt += 1;
        }
      }
      return;
    }
    catch (JSONException paramString)
    {
      x.e("MicroMsg.NetScenePatchQueryUserRoll", "Parse Json exp:" + paramString.getLocalizedMessage());
    }
  }
  
  public final int aBO()
  {
    return 105;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/order/model/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */