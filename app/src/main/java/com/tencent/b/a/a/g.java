package com.tencent.b.a.a;

import org.json.JSONException;
import org.json.JSONObject;

final class g
{
  String bjM = null;
  String bvw = null;
  String bvx = "0";
  long bvy = 0L;
  
  static g ch(String paramString)
  {
    g localg = new g();
    if (s.ci(paramString)) {}
    try
    {
      paramString = new JSONObject(paramString);
      if (!paramString.isNull("ui")) {
        localg.bjM = paramString.getString("ui");
      }
      if (!paramString.isNull("mc")) {
        localg.bvw = paramString.getString("mc");
      }
      if (!paramString.isNull("mid")) {
        localg.bvx = paramString.getString("mid");
      }
      if (!paramString.isNull("ts")) {
        localg.bvy = paramString.getLong("ts");
      }
      return localg;
    }
    catch (JSONException paramString) {}
    return localg;
  }
  
  private JSONObject tN()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      s.a(localJSONObject, "ui", this.bjM);
      s.a(localJSONObject, "mc", this.bvw);
      s.a(localJSONObject, "mid", this.bvx);
      localJSONObject.put("ts", this.bvy);
      return localJSONObject;
    }
    catch (JSONException localJSONException) {}
    return localJSONObject;
  }
  
  final int a(g paramg)
  {
    if (paramg == null) {}
    do
    {
      do
      {
        return 1;
        if ((!s.cj(this.bvx)) || (!s.cj(paramg.bvx))) {
          break;
        }
        if (this.bvx.equals(paramg.bvx)) {
          return 0;
        }
      } while (this.bvy >= paramg.bvy);
      return -1;
    } while (s.cj(this.bvx));
    return -1;
  }
  
  public final String toString()
  {
    return tN().toString();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/b/a/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */