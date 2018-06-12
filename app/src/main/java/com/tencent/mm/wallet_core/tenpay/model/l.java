package com.tencent.mm.wallet_core.tenpay.model;

import com.tencent.mm.wallet_core.c.c;
import org.json.JSONObject;

public abstract class l
  extends i
  implements a
{
  private String Yy = "";
  private int errCode = 0;
  public boolean mxp = false;
  private ITenpaySave.RetryPayInfo oYE;
  public boolean pgm = false;
  private boolean uYl = false;
  public boolean uYm = false;
  public boolean uYn;
  
  public final void J(boolean paramBoolean1, boolean paramBoolean2)
  {
    super.J(paramBoolean1, paramBoolean2);
  }
  
  public void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    this.errCode = paramInt;
    this.Yy = paramString;
  }
  
  public void a(c paramc, JSONObject paramJSONObject)
  {
    boolean bool = true;
    super.a(paramc, paramJSONObject);
    if ((paramJSONObject != null) && (paramJSONObject.optInt("can_pay_retry") == 1)) {}
    for (;;)
    {
      this.uYn = bool;
      this.oYE = new ITenpaySave.RetryPayInfo();
      this.oYE.ag(paramJSONObject);
      return;
      bool = false;
    }
  }
  
  public final boolean brf()
  {
    return !this.mxp;
  }
  
  public final void cDC()
  {
    reset();
    this.uYm = true;
    this.uXZ = false;
  }
  
  public boolean cDq()
  {
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/wallet_core/tenpay/model/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */