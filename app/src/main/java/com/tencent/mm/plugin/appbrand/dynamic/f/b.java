package com.tencent.mm.plugin.appbrand.dynamic.f;

import com.tencent.mm.plugin.appbrand.q.f;
import com.tencent.mm.u.b.c;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class b
  extends c
{
  public Map<String, String> fwR;
  public String fwS;
  public int fwT;
  public int fwU;
  public String path;
  public String title;
  
  public b()
  {
    super("onCanvasInsert");
  }
  
  b(int paramInt)
  {
    super("onCanvasInsert", paramInt);
  }
  
  public final JSONObject tR()
  {
    localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("title", this.title);
      localJSONObject.put("path", this.path);
      if (this.fwR == null) {}
      for (Object localObject = new HashMap();; localObject = this.fwR)
      {
        localJSONObject.put("query", new JSONObject((Map)localObject));
        localJSONObject.put("cacheKey", this.fwS);
        localJSONObject.put("width", f.lO(this.fwT));
        localJSONObject.put("height", f.lO(this.fwU));
        return localJSONObject;
      }
      return localJSONObject;
    }
    catch (JSONException localJSONException) {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/f/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */