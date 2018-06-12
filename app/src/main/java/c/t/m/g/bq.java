package c.t.m.g;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Handler;
import android.text.TextUtils;
import java.util.Map;
import org.json.JSONObject;

public final class bq
  extends bl
{
  ab a = new ab();
  
  public bq()
  {
    String str = m.a().getSharedPreferences(d(), 0).getString("halley_cloud_param_content", "");
    if (!TextUtils.isEmpty(str)) {}
    try
    {
      this.a.a(str);
      return;
    }
    catch (Throwable localThrowable)
    {
      m.a().getSharedPreferences(d(), 0).edit().putString("halley_cloud_param_content", "").commit();
    }
  }
  
  private static String d()
  {
    return "Halley_Cloud_Param_Content_" + m.b() + "_for_SettingsHandler";
  }
  
  public final void a(bh parambh)
  {
    String str = this.a.c();
    parambh.a.put("confVersion", str);
  }
  
  public final void a(JSONObject paramJSONObject)
  {
    try
    {
      paramJSONObject = paramJSONObject.optJSONObject("Setting");
      if (paramJSONObject != null)
      {
        paramJSONObject = paramJSONObject.optString("data");
        if (!TextUtils.isEmpty(paramJSONObject))
        {
          this.a.a(paramJSONObject);
          paramJSONObject = this.a.a.toString();
          m.a().getSharedPreferences(d(), 0).edit().putString("halley_cloud_param_content", paramJSONObject).commit();
        }
      }
      return;
    }
    catch (Throwable paramJSONObject) {}finally
    {
      m.i().post(new br(this));
    }
  }
  
  public final void b()
  {
    m.i().post(new br(this));
  }
  
  public final String c()
  {
    return "settings";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/c/t/m/g/bq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */