package c.t.m.g;

import android.text.TextUtils;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class bt
  extends bl
{
  private static boolean a = false;
  
  public final void a(bh parambh)
  {
    Object localObject3 = new bk();
    Object localObject2 = new bj();
    Object localObject1 = new bi();
    try
    {
      if ((ci.a(((bj)localObject2).b)) || (!a))
      {
        parambh.a.put("needUpdateState", Integer.valueOf(1));
        a = true;
      }
      for (;;)
      {
        if (ci.a(((bj)localObject2).b))
        {
          JSONObject localJSONObject = new JSONObject();
          localJSONObject.put("model", ((bk)localObject3).a);
          localJSONObject.put("osVersion", ((bk)localObject3).b);
          localJSONObject.put("imei", ((bk)localObject3).c);
          localJSONObject.put("imsi", ((bk)localObject3).d);
          localJSONObject.put("pseudoId", ((bk)localObject3).e);
          parambh.a.put("RegistDeviceInfo", localJSONObject);
        }
        localObject3 = new JSONObject();
        ((JSONObject)localObject3).put("platform", ((bj)localObject2).a);
        ((JSONObject)localObject3).put("deviceId", ((bj)localObject2).b);
        ((JSONObject)localObject3).put("sdkVersion", ((bj)localObject2).c);
        parambh.a.put("BindDeviceInfo", localObject3);
        localObject2 = new JSONObject();
        ((JSONObject)localObject2).put("bundle", ((bi)localObject1).a);
        ((JSONObject)localObject2).put("verCode", ((bi)localObject1).b);
        ((JSONObject)localObject2).put("verName", ((bi)localObject1).c);
        ((JSONObject)localObject2).put("appId", ((bi)localObject1).e);
        ((JSONObject)localObject2).put("uuid", ((bi)localObject1).d);
        localObject1 = new JSONArray();
        ((JSONArray)localObject1).put(localObject2);
        parambh.a.put("AppState", localObject1);
        localObject1 = cd.a(p.g());
        parambh.a.put("netType", localObject1);
        localObject1 = bf.a(p.j().intValue());
        parambh.a.put("oper", localObject1);
        return;
        parambh.a.put("needUpdateState", Integer.valueOf(0));
      }
      return;
    }
    catch (Exception parambh) {}
  }
  
  public final void a(JSONObject arg1)
  {
    try
    {
      String str1 = ???.optString("result");
      boolean bool = TextUtils.isEmpty(str1);
      if (!bool) {
        try
        {
          if (Integer.parseInt(str1) == 1002)
          {
            cd.a("");
            return;
          }
        }
        catch (Throwable localThrowable) {}
      }
      String str2 = ???.optString("deviceId");
      Object localObject2;
      if (!TextUtils.isEmpty(str2))
      {
        localObject2 = cd.a();
        if ((!TextUtils.isEmpty(str2)) && (!str2.equals(localObject2))) {
          cd.a(str2);
        }
      }
      for (;;)
      {
        str2 = ???.optString("oper");
        if (TextUtils.isEmpty(str2)) {
          break;
        }
        localObject2 = bf.a();
        String str3 = p.b();
        if ((ci.a(str3)) || ("unknown".equals(str3)) || (ci.a(str2)) || ("unknown".equals(str2))) {
          break;
        }
        synchronized (((bf)localObject2).a)
        {
          if (!str2.equals((String)((bf)localObject2).a.get(str3)))
          {
            ((bf)localObject2).a.put(str3, str2);
            str2 = ((bf)localObject2).b();
            cd.a("HalleyOperInfo_" + m.b(), str2);
          }
          return;
        }
        cd.a("");
      }
      return;
    }
    catch (Throwable ???) {}
  }
  
  public final String c()
  {
    return "state";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/c/t/m/g/bt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */