package com.tencent.d.a.c;

import org.json.JSONException;
import org.json.JSONObject;

public final class h
{
  public String onE = "";
  public String signature = "";
  public int uid = -1;
  private long vlB = -1L;
  private String vlC = "";
  public String vlD = "";
  
  public h(String paramString1, String paramString2)
  {
    this.vlD = paramString1;
    try
    {
      paramString1 = new JSONObject(paramString1);
      this.vlB = paramString1.optLong("counter");
      this.uid = paramString1.optInt("uid");
      this.onE = paramString1.optString("cpu_id");
      this.vlC = paramString1.optString("pub_key");
      this.signature = paramString2;
      return;
    }
    catch (JSONException paramString1)
    {
      for (;;)
      {
        c.e("Soter.SoterPubKeyModel", "soter: pub key model failed", new Object[0]);
      }
    }
  }
  
  public final String toString()
  {
    return "SoterPubKeyModel{counter=" + this.vlB + ", uid=" + this.uid + ", cpu_id='" + this.onE + '\'' + ", pub_key_in_x509='" + this.vlC + '\'' + ", rawJson='" + this.vlD + '\'' + ", signature='" + this.signature + '\'' + '}';
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/d/a/c/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */