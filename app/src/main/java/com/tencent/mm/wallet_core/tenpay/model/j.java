package com.tencent.mm.wallet_core.tenpay.model;

import com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.mm.plugin.wallet_core.id_verify.util.SetPwdInfo;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.c.c;
import com.tencent.mm.wallet_core.c.d;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public abstract class j
  extends l
  implements d
{
  private static int uYd = 0;
  public RealnameGuideHelper lJN;
  private String lJO;
  private String lJP;
  private String lJQ;
  private String lJR;
  private String lJS;
  protected int lNG;
  public String phl;
  public int ppo = 0;
  protected Map<String, String> uYb = new HashMap();
  public int uYc = 0;
  private boolean uYe = false;
  public int uYf = 0;
  public int uYg = 0;
  public String uYh = null;
  public JSONObject uYi = null;
  private boolean uYj = false;
  
  public void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    if (!this.uYe)
    {
      this.uYg = paramInt;
      this.uYh = paramString;
      this.uYi = paramJSONObject;
      this.uYe = true;
      if (paramJSONObject != null) {
        this.uYc = paramJSONObject.optInt("query_order_flag", 0);
      }
    }
    Object localObject;
    if ((paramJSONObject != null) && (paramJSONObject.has("real_name_info")))
    {
      localObject = paramJSONObject.optJSONObject("real_name_info");
      this.lJO = ((JSONObject)localObject).optString("guide_flag");
      this.lJP = ((JSONObject)localObject).optString("guide_wording");
      this.lJQ = ((JSONObject)localObject).optString("left_button_wording");
      this.lJR = ((JSONObject)localObject).optString("right_button_wording");
      this.lJS = ((JSONObject)localObject).optString("upload_credit_url");
    }
    for (int i = 1;; i = 0)
    {
      JSONObject localJSONObject = null;
      int j = i;
      localObject = localJSONObject;
      if (paramJSONObject != null)
      {
        j = i;
        localObject = localJSONObject;
        if (paramJSONObject.has("set_pwd_info"))
        {
          localJSONObject = paramJSONObject.optJSONObject("set_pwd_info");
          localObject = new SetPwdInfo();
          ((SetPwdInfo)localObject).kRt = localJSONObject.optString("guide_wording");
          ((SetPwdInfo)localObject).kRu = localJSONObject.optString("left_button_wording");
          ((SetPwdInfo)localObject).kRv = localJSONObject.optString("right_button_wording");
          ((SetPwdInfo)localObject).plg = localJSONObject.optInt("send_pwd_msg");
          j = 1;
        }
      }
      if ((j != 0) && (("1".equals(this.lJO)) || ("2".equals(this.lJO)) || (localObject != null)))
      {
        this.lJN = new RealnameGuideHelper();
        this.lJN.a(this.lJO, (SetPwdInfo)localObject, this.lJP, this.lJQ, this.lJR, this.lJS, this.lNG);
      }
      this.phl = paramJSONObject.optString("forget_pwd_url", "");
      x.i("MicroMsg.NetSceneTenpayDelayQueryBase", "forget_pwd_url %s", new Object[] { this.phl });
      this.uYj = true;
      super.a(paramInt, paramString, paramJSONObject);
      return;
    }
  }
  
  public final void a(c paramc, JSONObject paramJSONObject)
  {
    x.i("MicroMsg.NetSceneTenpayDelayQueryBase", "always callback: %s,%s", new Object[] { Integer.valueOf(paramc.errCode), paramc.Yy });
    if ((!this.uYj) && (!this.uYe))
    {
      this.uYf = paramc.errType;
      this.uYg = paramc.errCode;
      this.uYh = paramc.Yy;
      if (paramJSONObject != null)
      {
        this.uYc = paramJSONObject.optInt("query_order_flag", 0);
        this.uYi = paramJSONObject;
      }
      this.uYe = true;
    }
  }
  
  public final void a(String paramString1, String paramString2, int paramInt1, int paramInt2, String paramString3, String paramString4)
  {
    uYd += 1;
    this.uYb.put("req_key", paramString1);
    this.uYb.put("transaction_id", paramString2);
    this.uYb.put("pay_scene", String.valueOf(paramInt1));
    this.uYb.put("bank_type", paramString3);
    this.uYb.put("channel", String.valueOf(paramInt2));
    this.uYb.put("bind_serial", paramString4);
  }
  
  public boolean bNv()
  {
    return false;
  }
  
  public final Map<String, String> cDA()
  {
    return this.uYb;
  }
  
  public final boolean cDB()
  {
    return this.uYc == 1;
  }
  
  public final boolean cDq()
  {
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/wallet_core/tenpay/model/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */