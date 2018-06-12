package com.tencent.mm.plugin.card.d;

import android.text.TextUtils;
import com.tencent.mm.protocal.c.la;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class t
{
  public static ArrayList<la> yi(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return null;
    }
    for (;;)
    {
      int i;
      try
      {
        JSONArray localJSONArray = new JSONObject(paramString).getJSONArray("used_store_list");
        if ((localJSONArray == null) || (localJSONArray.length() == 0)) {
          break;
        }
        ArrayList localArrayList = new ArrayList();
        i = 0;
        if (i < localJSONArray.length())
        {
          JSONObject localJSONObject = localJSONArray.getJSONObject(i);
          if (localJSONObject == null)
          {
            paramString = null;
            if (paramString != null) {
              localArrayList.add(paramString);
            }
          }
          else
          {
            paramString = new la();
            paramString.name = localJSONObject.optString("name");
            paramString.descriptor = localJSONObject.optString("descriptor");
            paramString.hvl = localJSONObject.optString("phone");
            paramString.country = localJSONObject.optString("country");
            paramString.csK = localJSONObject.optString("province");
            paramString.csL = localJSONObject.optString("city");
            paramString.dRH = localJSONObject.optString("address");
            paramString.rnu = ((float)localJSONObject.optDouble("distance"));
            paramString.bUg = ((float)localJSONObject.optDouble("longitude"));
            paramString.bSx = ((float)localJSONObject.optDouble("latitude"));
            paramString.hwI = localJSONObject.optString("jump_url");
            paramString.rnv = localJSONObject.optString("app_brand_user_name");
            paramString.rnw = localJSONObject.optString("app_brand_pass");
            continue;
          }
        }
        else
        {
          return localArrayList;
        }
      }
      catch (JSONException paramString)
      {
        x.printErrStackTrace("MicroMsg.ShopInfoItemParser", paramString, "", new Object[0]);
        return null;
      }
      i += 1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/card/d/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */