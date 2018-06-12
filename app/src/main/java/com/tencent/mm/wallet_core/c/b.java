package com.tencent.mm.wallet_core.c;

import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONObject;

public final class b
{
  public String bPL = "";
  public String title = "";
  public String uWW = "";
  public String uWX = "";
  public String uWY = "";
  
  public b() {}
  
  public b(String paramString)
  {
    if (bi.oW(paramString)) {
      return;
    }
    try
    {
      paramString = new JSONObject(paramString);
      this.title = paramString.optString("title");
      this.uWW = paramString.optString("body1");
      this.uWX = paramString.optString("body2");
      this.uWY = paramString.optString("button");
      return;
    }
    catch (Exception paramString)
    {
      x.e("MicroMsg.CrtRtnWoding", "crtwoding error %s", new Object[] { paramString.getMessage() });
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/wallet_core/c/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */