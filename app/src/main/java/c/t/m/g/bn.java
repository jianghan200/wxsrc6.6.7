package c.t.m.g;

import android.os.Handler;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class bn
  extends bl
{
  bm a = new bm("HttpSchedulerHandler");
  
  public final void a()
  {
    m.i().post(new bo(this, null, null));
  }
  
  public final void a(bh parambh)
  {
    try
    {
      localJSONObject2 = new JSONObject();
      Object localObject = this.a;
      p.e();
      localObject = ((bm)localObject).a(p.b());
      if (!ci.a((byte[])localObject))
      {
        localObject = new JSONObject(new String((byte[])localObject));
        if (localObject != null)
        {
          localObject = ((JSONObject)localObject).optJSONObject("resultMap");
          if (localObject != null)
          {
            Iterator localIterator = ((JSONObject)localObject).keys();
            while (localIterator.hasNext())
            {
              String str = (String)localIterator.next();
              JSONArray localJSONArray = ((JSONObject)localObject).optJSONArray(str);
              if (localJSONArray != null)
              {
                JSONObject localJSONObject3 = new JSONObject();
                int i = 0;
                while (i < localJSONArray.length())
                {
                  JSONObject localJSONObject4 = localJSONArray.getJSONObject(i);
                  localJSONObject3.put(localJSONObject4.optString("unit"), localJSONObject4.optString("schedulecode"));
                  i += 1;
                }
                localJSONObject2.put(str, localJSONObject3);
              }
            }
          }
        }
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        try
        {
          localJSONObject1 = new JSONObject();
          localJSONObject1.put(m.b(), new JSONObject());
          parambh.a.put("directScheduleCodes", localJSONObject1);
          return;
        }
        catch (Exception parambh)
        {
          JSONObject localJSONObject2;
          return;
        }
        localJSONObject2.put(m.b(), new JSONObject());
        parambh.a.put("directScheduleCodes", localJSONObject2);
        return;
        localJSONObject2.put(m.b(), new JSONObject());
        continue;
        JSONObject localJSONObject1 = null;
      }
    }
  }
  
  public final void a(JSONObject paramJSONObject)
  {
    try
    {
      paramJSONObject = paramJSONObject.optJSONObject("AccessScheduleRsp");
      if (paramJSONObject != null)
      {
        paramJSONObject = paramJSONObject.toString();
        if (!ci.a(paramJSONObject))
        {
          paramJSONObject = paramJSONObject.getBytes();
          if (!ci.a(paramJSONObject))
          {
            String str = p.b();
            this.a.a(str, paramJSONObject);
            m.i().post(new bo(this, str, paramJSONObject));
          }
        }
      }
      return;
    }
    catch (Throwable paramJSONObject) {}
  }
  
  public final String c()
  {
    return "accessscheduler";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/c/t/m/g/bn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */