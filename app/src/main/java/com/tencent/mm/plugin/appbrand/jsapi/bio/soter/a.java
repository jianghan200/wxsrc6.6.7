package com.tencent.mm.plugin.appbrand.jsapi.bio.soter;

import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;

public final class a
{
  public static String g(JSONArray paramJSONArray)
  {
    if (paramJSONArray == null) {}
    for (String str = null;; str = paramJSONArray.toString())
    {
      x.i("MicroMsg.AppBrandSoterTranslateUtil", "hy: translating string array: %s", new Object[] { str });
      if ((paramJSONArray != null) && (paramJSONArray.length() != 0)) {
        break;
      }
      return "0x00";
    }
    int i = 0;
    int j = 0;
    for (;;)
    {
      if (i >= paramJSONArray.length()) {
        break label97;
      }
      try
      {
        int k = tq(paramJSONArray.getString(i));
        j = (byte)(j | k);
      }
      catch (JSONException localJSONException)
      {
        for (;;)
        {
          x.printErrStackTrace("MicroMsg.AppBrandSoterTranslateUtil", localJSONException, "hy: json error in translate", new Object[0]);
        }
      }
      i += 1;
    }
    label97:
    paramJSONArray = "0x" + Integer.toHexString(j);
    x.i("MicroMsg.AppBrandSoterTranslateUtil", "hy: translated bitsetStr: %s", new Object[] { paramJSONArray });
    return paramJSONArray;
  }
  
  public static JSONArray kA(int paramInt)
  {
    if (paramInt <= 0) {
      return new JSONArray();
    }
    ArrayList localArrayList = new ArrayList(3);
    if ((paramInt & 0x1) == 1) {
      localArrayList.add("fingerPrint");
    }
    if ((paramInt & 0x8) == 8) {
      localArrayList.add("facial");
    }
    if ((paramInt & 0x2) == 2) {
      localArrayList.add("speech");
    }
    x.i("MicroMsg.AppBrandSoterTranslateUtil", "hy: final string is: %s", new Object[] { localArrayList.toString() });
    return new JSONArray(localArrayList);
  }
  
  public static int tq(String paramString)
  {
    if ("fingerPrint".equals(paramString)) {
      return 1;
    }
    if ("facial".equals(paramString)) {
      return 8;
    }
    if ("speech".equals(paramString)) {
      return 2;
    }
    x.e("MicroMsg.AppBrandSoterTranslateUtil", "hy: invalid item");
    return 0;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/bio/soter/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */