package com.tencent.mm.wallet_core.c;

import org.json.JSONObject;

public final class r
{
  public String spW = "";
  public String sxq = "";
  public String uXv = "";
  public String uXw = "";
  public int uXx = 0;
  
  public r() {}
  
  public r(JSONObject paramJSONObject)
  {
    this.uXv = paramJSONObject.optString("device_id");
    this.sxq = paramJSONObject.optString("device_name");
    this.uXw = paramJSONObject.optString("device_os");
    this.uXx = paramJSONObject.optInt("Is_cur_device");
    this.spW = paramJSONObject.optString("crt_no");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/wallet_core/c/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */