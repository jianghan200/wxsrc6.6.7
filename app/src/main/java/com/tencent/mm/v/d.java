package com.tencent.mm.v;

import java.util.Iterator;
import java.util.Map;
import junit.framework.Assert;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class d
  implements c
{
  private JSONObject dpd;
  
  public d()
  {
    this.dpd = new JSONObject();
  }
  
  public d(String paramString)
  {
    try
    {
      this.dpd = new JSONObject(paramString);
      return;
    }
    catch (JSONException paramString)
    {
      throw new f(paramString);
    }
  }
  
  public d(Map paramMap)
  {
    this.dpd = new JSONObject(paramMap);
  }
  
  d(JSONObject paramJSONObject)
  {
    Assert.assertNotNull(paramJSONObject);
    this.dpd = paramJSONObject;
  }
  
  public final c D(String paramString, int paramInt)
  {
    try
    {
      this.dpd.put(paramString, paramInt);
      return this;
    }
    catch (JSONException paramString)
    {
      throw new f(paramString);
    }
  }
  
  public final c b(String paramString, double paramDouble)
  {
    try
    {
      this.dpd.put(paramString, paramDouble);
      return this;
    }
    catch (JSONException paramString)
    {
      throw new f(paramString);
    }
  }
  
  public final String fP(String paramString)
  {
    if (paramString == null) {
      throw new f("Names must be non-null");
    }
    return paramString;
  }
  
  public final a fQ(String paramString)
  {
    try
    {
      paramString = this.dpd.getJSONArray(paramString);
      if (paramString == null) {
        return null;
      }
      paramString = new b(paramString);
      return paramString;
    }
    catch (JSONException paramString)
    {
      throw new f(paramString);
    }
  }
  
  public final a fR(String paramString)
  {
    paramString = this.dpd.optJSONArray(paramString);
    if (paramString == null) {
      return null;
    }
    return new b(paramString);
  }
  
  public final c fS(String paramString)
  {
    try
    {
      paramString = this.dpd.getJSONObject(paramString);
      if (paramString == null) {
        return null;
      }
      paramString = new d(paramString);
      return paramString;
    }
    catch (JSONException paramString)
    {
      throw new f(paramString);
    }
  }
  
  public final c fT(String paramString)
  {
    paramString = this.dpd.optJSONObject(paramString);
    if (paramString == null) {
      return null;
    }
    return new d(paramString);
  }
  
  public final Object get(String paramString)
  {
    try
    {
      paramString = this.dpd.get(paramString);
      if ((paramString instanceof JSONObject)) {
        return new d((JSONObject)paramString);
      }
      if ((paramString instanceof JSONArray))
      {
        paramString = new b((JSONArray)paramString);
        return paramString;
      }
    }
    catch (JSONException paramString)
    {
      throw new f(paramString);
    }
    return paramString;
  }
  
  public final boolean getBoolean(String paramString)
  {
    try
    {
      boolean bool = this.dpd.getBoolean(paramString);
      return bool;
    }
    catch (JSONException paramString)
    {
      throw new f(paramString);
    }
  }
  
  public final double getDouble(String paramString)
  {
    try
    {
      double d = this.dpd.getDouble(paramString);
      return d;
    }
    catch (JSONException paramString)
    {
      throw new f(paramString);
    }
  }
  
  public final int getInt(String paramString)
  {
    try
    {
      int i = this.dpd.getInt(paramString);
      return i;
    }
    catch (JSONException paramString)
    {
      throw new f(paramString);
    }
  }
  
  public final long getLong(String paramString)
  {
    try
    {
      long l = this.dpd.getLong(paramString);
      return l;
    }
    catch (JSONException paramString)
    {
      throw new f(paramString);
    }
  }
  
  public final String getString(String paramString)
  {
    try
    {
      paramString = this.dpd.getString(paramString);
      return paramString;
    }
    catch (JSONException paramString)
    {
      throw new f(paramString);
    }
  }
  
  public final boolean has(String paramString)
  {
    return this.dpd.has(paramString);
  }
  
  public final boolean isNull(String paramString)
  {
    return this.dpd.isNull(paramString);
  }
  
  public final c j(String paramString, long paramLong)
  {
    try
    {
      this.dpd.put(paramString, paramLong);
      return this;
    }
    catch (JSONException paramString)
    {
      throw new f(paramString);
    }
  }
  
  public final Iterator<String> keys()
  {
    return this.dpd.keys();
  }
  
  public final c l(String paramString, Object paramObject)
  {
    try
    {
      this.dpd.put(paramString, paramObject);
      return this;
    }
    catch (JSONException paramString)
    {
      throw new f(paramString);
    }
  }
  
  public final int length()
  {
    return this.dpd.length();
  }
  
  public final c m(String paramString, Object paramObject)
  {
    try
    {
      this.dpd.put(paramString, paramObject);
      return this;
    }
    catch (JSONException paramString)
    {
      throw new f(paramString);
    }
  }
  
  public final Object opt(String paramString)
  {
    try
    {
      Object localObject = this.dpd.get(paramString);
      if ((localObject instanceof JSONObject)) {
        return new d((JSONObject)localObject);
      }
      paramString = (String)localObject;
      if ((localObject instanceof JSONArray))
      {
        paramString = new b((JSONArray)localObject);
        return paramString;
      }
    }
    catch (JSONException paramString)
    {
      paramString = null;
    }
    return paramString;
  }
  
  public final boolean optBoolean(String paramString, boolean paramBoolean)
  {
    return this.dpd.optBoolean(paramString, paramBoolean);
  }
  
  public final double optDouble(String paramString, double paramDouble)
  {
    return this.dpd.optDouble(paramString, paramDouble);
  }
  
  public final int optInt(String paramString, int paramInt)
  {
    return this.dpd.optInt(paramString, paramInt);
  }
  
  public final long optLong(String paramString, long paramLong)
  {
    return this.dpd.optLong(paramString, paramLong);
  }
  
  public final String optString(String paramString)
  {
    return this.dpd.optString(paramString);
  }
  
  public final String optString(String paramString1, String paramString2)
  {
    return this.dpd.optString(paramString1, paramString2);
  }
  
  public final c p(String paramString, boolean paramBoolean)
  {
    try
    {
      this.dpd.put(paramString, paramBoolean);
      return this;
    }
    catch (JSONException paramString)
    {
      throw new f(paramString);
    }
  }
  
  public final Object remove(String paramString)
  {
    return this.dpd.remove(paramString);
  }
  
  public final String toString()
  {
    return this.dpd.toString();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/v/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */