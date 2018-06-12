package com.tencent.b.a.a;

import org.json.JSONException;
import org.json.JSONObject;

final class a
{
  public static String bvd = "ts";
  public static String bve = "times";
  public static String bvf = "mfreq";
  public static String bvg = "mdays";
  long buZ = 0L;
  int bva = 0;
  int bvb = 100;
  int bvc = 3;
  
  a() {}
  
  a(String paramString)
  {
    if (!s.ci(paramString)) {}
    for (;;)
    {
      return;
      try
      {
        paramString = new JSONObject(paramString);
        if (!paramString.isNull(bvd)) {
          this.buZ = paramString.getLong(bvd);
        }
        if (!paramString.isNull(bvf)) {
          this.bvb = paramString.getInt(bvf);
        }
        if (!paramString.isNull(bve)) {
          this.bva = paramString.getInt(bve);
        }
        if (!paramString.isNull(bvg))
        {
          this.bvc = paramString.getInt(bvg);
          return;
        }
      }
      catch (JSONException paramString) {}
    }
  }
  
  public final String toString()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put(bvd, this.buZ);
      localJSONObject.put(bve, this.bva);
      localJSONObject.put(bvf, this.bvb);
      localJSONObject.put(bvg, this.bvc);
      return localJSONObject.toString();
    }
    catch (JSONException localJSONException)
    {
      for (;;) {}
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/b/a/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */