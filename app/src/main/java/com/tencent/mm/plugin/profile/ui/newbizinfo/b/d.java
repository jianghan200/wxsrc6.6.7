package com.tencent.mm.plugin.profile.ui.newbizinfo.b;

import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class d
{
  public String aAL;
  public String ceR;
  public int dMk;
  public String id;
  public List<d> lZm;
  public String name;
  public int type;
  public String value;
  
  public static d Y(JSONObject paramJSONObject)
  {
    if (paramJSONObject == null)
    {
      x.e("MicroMsg.ServiceInfo", "json is null, err");
      paramJSONObject = null;
    }
    for (;;)
    {
      return paramJSONObject;
      locald = new d();
      try
      {
        locald.id = paramJSONObject.optString("id", "");
        locald.type = paramJSONObject.optInt("type");
        locald.name = paramJSONObject.optString("name");
        locald.aAL = paramJSONObject.optString("key");
        locald.value = paramJSONObject.optString("value");
        locald.dMk = paramJSONObject.optInt("acttype", -1);
        locald.ceR = paramJSONObject.optString("native_url");
        locald.lZm = new ArrayList();
        JSONArray localJSONArray = paramJSONObject.optJSONArray("sub_button_list");
        paramJSONObject = locald;
        if (localJSONArray == null) {
          continue;
        }
        int i = 0;
        for (;;)
        {
          paramJSONObject = locald;
          if (i >= localJSONArray.length()) {
            break;
          }
          paramJSONObject = Y(localJSONArray.optJSONObject(i));
          if (paramJSONObject != null) {
            locald.lZm.add(paramJSONObject);
          }
          i += 1;
        }
        return locald;
      }
      catch (Exception paramJSONObject)
      {
        x.k("MicroMsg.ServiceInfo", "", new Object[] { paramJSONObject });
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/profile/ui/newbizinfo/b/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */