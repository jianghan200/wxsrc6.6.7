package c.t.m.g;

import org.json.JSONException;
import org.json.JSONObject;

public final class dx
{
  public double a;
  public double b;
  public double c;
  public float d;
  public String e;
  public String f;
  
  dx() {}
  
  public dx(JSONObject paramJSONObject)
  {
    try
    {
      this.a = paramJSONObject.getDouble("latitude");
      this.b = paramJSONObject.getDouble("longitude");
      this.c = paramJSONObject.getDouble("altitude");
      this.d = ((float)paramJSONObject.getDouble("accuracy"));
      this.e = paramJSONObject.optString("name");
      this.f = paramJSONObject.optString("addr");
      return;
    }
    catch (JSONException paramJSONObject)
    {
      throw paramJSONObject;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/c/t/m/g/dx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */