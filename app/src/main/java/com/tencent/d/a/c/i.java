package com.tencent.d.a.c;

import org.json.JSONException;
import org.json.JSONObject;

public final class i
{
  public String signature = "";
  private long vlB = -1L;
  private String vlE = null;
  public String vlF = null;
  private String vlG = "";
  private String vlH = "";
  private String vlI = "";
  private String vlJ = "";
  private String vlK = "";
  public int vlL = 20;
  public String vlM = "";
  
  public static i acF(String paramString)
  {
    try
    {
      JSONObject localJSONObject = new JSONObject(paramString);
      i locali = new i();
      locali.vlM = paramString;
      locali.vlE = localJSONObject.optString("raw");
      locali.vlF = localJSONObject.optString("fid");
      locali.vlB = localJSONObject.optLong("counter");
      locali.vlG = localJSONObject.optString("tee_n");
      locali.vlH = localJSONObject.optString("tee_v");
      locali.vlI = localJSONObject.optString("fp_n");
      locali.vlJ = localJSONObject.optString("fp_v");
      locali.vlK = localJSONObject.optString("cpu_id");
      locali.vlL = localJSONObject.optInt("rsa_pss_saltlen", 20);
      return locali;
    }
    catch (JSONException paramString)
    {
      c.e("Soter.SoterSignatureResult", "soter: convert from json failed." + paramString.toString(), new Object[0]);
    }
    return null;
  }
  
  public final String toString()
  {
    return "SoterSignatureResult{rawValue='" + this.vlE + '\'' + ", fid='" + this.vlF + '\'' + ", counter=" + this.vlB + ", TEEName='" + this.vlG + '\'' + ", TEEVersion='" + this.vlH + '\'' + ", FpName='" + this.vlI + '\'' + ", FpVersion='" + this.vlJ + '\'' + ", cpuId='" + this.vlK + '\'' + ", saltLen=" + this.vlL + ", jsonValue='" + this.vlM + '\'' + ", signature='" + this.signature + '\'' + '}';
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/d/a/c/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */