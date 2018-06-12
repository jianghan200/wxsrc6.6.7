package com.tencent.tencentmap.mapsdk.a;

import com.tencent.map.lib.util.StringUtil;
import e.a;
import e.b;
import e.c;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class kn
  implements jg
{
  private static kn a;
  private boolean b = false;
  
  private static int a(JSONObject paramJSONObject, String paramString)
  {
    if ((paramJSONObject != null) && (paramJSONObject.has(paramString))) {
      try
      {
        int i = paramJSONObject.getInt(paramString);
        return i;
      }
      catch (JSONException paramJSONObject) {}
    }
    return 0;
  }
  
  private ek a(a parama)
  {
    c localc = new c();
    localc.vHw = 0L;
    localc.vHB = kh.b();
    if (!StringUtil.isEmpty(kh.a)) {
      localc.vHA = kh.a;
    }
    localc.imei = kh.a();
    localc.vHy = "ANDROID";
    localc.version = "4.0.8".replaceAll("\\.", "");
    localc.bvp = "";
    ek localek = new ek();
    localek.a("UTF-8");
    localek.a(9001);
    if (!this.b) {
      localek.c("rttserver");
    }
    for (;;)
    {
      localek.d("getLinks");
      localek.a("info", localc);
      localek.a("req", parama);
      return localek;
      localek.c("rtthisserver");
    }
  }
  
  public static kn a()
  {
    try
    {
      if (a == null) {
        a = new kn();
      }
      kn localkn = a;
      return localkn;
    }
    finally {}
  }
  
  private b a(String paramString, byte[] paramArrayOfByte)
  {
    int i = 0;
    label80:
    for (;;)
    {
      if (i < 3) {}
      try
      {
        Object localObject = pn.a().a(paramString, "sosomap navsns", paramArrayOfByte);
        if ((localObject == null) || (((po)localObject).a == null)) {
          break label80;
        }
        ek localek = new ek();
        localek.a("UTF-8");
        localek.a(((po)localObject).a);
        localObject = (b)localek.b("res");
        return (b)localObject;
      }
      catch (Exception localException)
      {
        i += 1;
      }
      return null;
    }
  }
  
  private byte[] a(b paramb)
  {
    if (paramb == null) {
      return null;
    }
    return paramb.atn;
  }
  
  private a b(String paramString)
  {
    if (StringUtil.isEmpty(paramString)) {
      return null;
    }
    a locala = new a();
    try
    {
      paramString = new JSONObject(paramString);
      locala.setTag(c(paramString, "tag"));
      locala.vHu = ((short)a(paramString, "level"));
      locala.vHv = ((short)a(paramString, "zip"));
      locala.vHt = new ArrayList();
      JSONArray localJSONArray = b(paramString, "boundArray");
      int j = localJSONArray.length();
      int i = 0;
      for (;;)
      {
        paramString = locala;
        if (i >= j) {
          break;
        }
        locala.vHt.add(Integer.valueOf(localJSONArray.getInt(i)));
        i += 1;
      }
      return paramString;
    }
    catch (Exception paramString)
    {
      paramString = null;
    }
  }
  
  private static JSONArray b(JSONObject paramJSONObject, String paramString)
  {
    if ((paramJSONObject != null) && (paramJSONObject.has(paramString))) {
      try
      {
        paramJSONObject = paramJSONObject.getJSONArray(paramString);
        return paramJSONObject;
      }
      catch (JSONException paramJSONObject) {}
    }
    return null;
  }
  
  private static String c(JSONObject paramJSONObject, String paramString)
  {
    if ((paramJSONObject != null) && (paramJSONObject.has(paramString))) {
      try
      {
        paramJSONObject = paramJSONObject.getString(paramString);
        return paramJSONObject;
      }
      catch (JSONException paramJSONObject) {}
    }
    return "";
  }
  
  public byte[] a(String paramString)
  {
    try
    {
      if (StringUtil.isEmpty(paramString)) {
        return null;
      }
      paramString = b(paramString);
      if (paramString != null)
      {
        paramString = a(paramString);
        if (paramString != null)
        {
          paramString = a(a(b(), paramString.a()));
          return paramString;
        }
      }
    }
    catch (Throwable paramString) {}
    return null;
  }
  
  public String b()
  {
    return "http://tafrtt.map.qq.com/index.wup";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/kn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */