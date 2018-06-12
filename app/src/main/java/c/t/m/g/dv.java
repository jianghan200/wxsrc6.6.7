package c.t.m.g;

import android.os.Bundle;
import com.tencent.map.geolocation.TencentPoi;
import java.util.ArrayList;
import java.util.Iterator;
import org.eclipse.jdt.annotation.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class dv
{
  public int a;
  public final ArrayList<TencentPoi> b = new ArrayList();
  public dz c;
  
  dv() {}
  
  public dv(JSONObject paramJSONObject)
  {
    this.a = paramJSONObject.optInt("stat");
    if (paramJSONObject.has("subnation")) {
      this.c = new dz(paramJSONObject.optJSONObject("subnation"));
    }
    for (;;)
    {
      paramJSONObject = paramJSONObject.optJSONArray("poilist");
      if (paramJSONObject != null) {
        try
        {
          int j = paramJSONObject.length();
          int i = 0;
          for (;;)
          {
            if (i < j)
            {
              dy localdy = new dy(paramJSONObject.getJSONObject(i));
              this.b.add(localdy);
              i += 1;
              continue;
              if (paramJSONObject.has("results"))
              {
                this.c = a(paramJSONObject.optJSONArray("results"));
                break;
              }
              this.c = dz.a;
              new StringBuilder("DetailsData: unknown json ").append(paramJSONObject.toString());
            }
          }
        }
        catch (JSONException paramJSONObject) {}
      }
    }
  }
  
  private static dz a(@Nullable JSONArray paramJSONArray)
  {
    int i = 2;
    if (paramJSONArray == null) {
      localObject1 = null;
    }
    dz localdz;
    int j;
    Object localObject2;
    do
    {
      return (dz)localObject1;
      localdz = dz.a(dz.a);
      j = paramJSONArray.length();
      if (j > 0)
      {
        localObject1 = paramJSONArray.optJSONObject(0);
        localdz.b = ((JSONObject)localObject1).optString("n");
        localdz.e = ((JSONObject)localObject1).optString("p");
        localdz.f = ((JSONObject)localObject1).optString("c");
        localdz.g = ((JSONObject)localObject1).optString("d");
        localdz.d = ((JSONObject)localObject1).optString("adcode");
      }
      if (j > 1)
      {
        localObject1 = paramJSONArray.optJSONObject(1);
        localObject2 = ((JSONObject)localObject1).optString("address_name");
        localdz.m.putString("addrdesp.name", (String)localObject2);
        localObject2 = ((JSONObject)localObject1).optJSONObject("landmark");
        localObject1 = ((JSONObject)localObject1).optJSONObject("second_landmark");
        if (localObject2 != null) {
          localdz.m.putParcelable("addrdesp.landmark", new du((JSONObject)localObject2));
        }
        if (localObject1 != null) {
          localdz.m.putParcelable("addrdesp.second_landmark", new du((JSONObject)localObject1));
        }
      }
      localObject1 = localdz;
    } while (j <= 2);
    Object localObject1 = new ArrayList();
    if (i < j)
    {
      localObject2 = new du(paramJSONArray.optJSONObject(i));
      ((ArrayList)localObject1).add(localObject2);
      if ("ST".equals(((du)localObject2).b)) {
        localdz.j = ((du)localObject2).a;
      }
      for (;;)
      {
        i += 1;
        break;
        if ("ST_NO".equals(((du)localObject2).b)) {
          localdz.k = ((du)localObject2).a;
        }
      }
    }
    localdz.m.putParcelableArrayList("addrdesp.results", (ArrayList)localObject1);
    return localdz;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("DetailsData{");
    localStringBuilder.append("subnation=").append(this.c).append(",");
    localStringBuilder.append("poilist=[");
    Iterator localIterator = this.b.iterator();
    while (localIterator.hasNext()) {
      localStringBuilder.append((TencentPoi)localIterator.next()).append(",");
    }
    localStringBuilder.append("]");
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/c/t/m/g/dv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */