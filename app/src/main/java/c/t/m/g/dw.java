package c.t.m.g;

import org.json.JSONException;
import org.json.JSONObject;

final class dw
{
  public String a;
  public String b;
  public int c;
  
  dw() {}
  
  public dw(JSONObject paramJSONObject)
  {
    try
    {
      this.a = paramJSONObject.getString("bid");
      this.b = paramJSONObject.getString("floor");
      this.c = paramJSONObject.getInt("type");
      return;
    }
    catch (JSONException paramJSONObject)
    {
      throw paramJSONObject;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/c/t/m/g/dw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */