package com.tencent.mm.plugin.recharge.model;

import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONException;
import org.json.JSONObject;

public final class a
{
  public static final int[] mot = { -1, -1 };
  public static final int[] mou = { -2, -2 };
  public int bJt;
  public String mov;
  public String mow;
  public int[] mox = mot;
  public String name;
  
  public a(String paramString1, String paramString2, int paramInt)
  {
    this(paramString1, paramString2, "", paramInt);
  }
  
  public a(String paramString1, String paramString2, String paramString3, int paramInt)
  {
    this.mov = paramString1;
    this.name = paramString2;
    this.mow = paramString3;
    this.bJt = paramInt;
  }
  
  public static a Z(JSONObject paramJSONObject)
  {
    String str1 = paramJSONObject.optString("name");
    String str2 = paramJSONObject.optString("record");
    paramJSONObject = paramJSONObject.optString("location");
    if (!bi.oW(str2)) {
      return new a(str2, str1, paramJSONObject, 2);
    }
    return null;
  }
  
  public final JSONObject bpY()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("record", bi.aG(this.mov, ""));
      localJSONObject.put("name", bi.aG(this.name, ""));
      localJSONObject.put("location", bi.aG(this.mow, ""));
      return localJSONObject;
    }
    catch (JSONException localJSONException)
    {
      x.printErrStackTrace("MicroMsg.MallInputRecord", localJSONException, "", new Object[0]);
    }
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/recharge/model/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */