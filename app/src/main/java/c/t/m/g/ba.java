package c.t.m.g;

import android.text.TextUtils;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

final class ba
  implements Runnable
{
  ba(az paramaz) {}
  
  public final void run()
  {
    Object localObject1 = p.b();
    az localaz = this.a;
    Object localObject2 = this.a.a.a((String)localObject1);
    try
    {
      if ((!TextUtils.isEmpty((CharSequence)localObject1)) && (!ci.a((byte[])localObject2)))
      {
        localObject2 = new JSONObject(new String((byte[])localObject2));
        localObject1 = new q((String)localObject1);
        ((JSONObject)localObject2).getString("ipInfo");
        localObject2 = ((JSONObject)localObject2).optJSONObject("resultMap");
        if (localObject2 != null)
        {
          Iterator localIterator = ((JSONObject)localObject2).keys();
          while (localIterator.hasNext())
          {
            JSONArray localJSONArray = ((JSONObject)localObject2).optJSONArray((String)localIterator.next());
            if (localJSONArray != null) {
              az.a((q)localObject1, localJSONArray);
            }
          }
        }
        localaz.b = ((q)localObject1);
        return;
      }
    }
    catch (Throwable localThrowable) {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/c/t/m/g/ba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */