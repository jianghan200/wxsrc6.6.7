package com.tencent.mm.v;

import android.annotation.TargetApi;
import junit.framework.Assert;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class b
  implements a
{
  private JSONArray dpc;
  
  public b()
  {
    this.dpc = new JSONArray();
  }
  
  public b(String paramString)
  {
    try
    {
      this.dpc = new JSONArray(paramString);
      return;
    }
    catch (JSONException paramString)
    {
      throw new f(paramString);
    }
  }
  
  b(JSONArray paramJSONArray)
  {
    Assert.assertNotNull(paramJSONArray);
    this.dpc = paramJSONArray;
  }
  
  public final a aB(Object paramObject)
  {
    this.dpc.put(paramObject);
    return this;
  }
  
  public final a aO(long paramLong)
  {
    this.dpc.put(paramLong);
    return this;
  }
  
  public final a bq(boolean paramBoolean)
  {
    this.dpc.put(paramBoolean);
    return this;
  }
  
  public final Object get(int paramInt)
  {
    try
    {
      Object localObject = this.dpc.get(paramInt);
      if ((localObject instanceof JSONObject)) {
        return new d((JSONObject)localObject);
      }
      if ((localObject instanceof JSONArray))
      {
        localObject = new b((JSONArray)localObject);
        return localObject;
      }
    }
    catch (JSONException localJSONException)
    {
      throw new f(localJSONException);
    }
    return localJSONException;
  }
  
  public final boolean getBoolean(int paramInt)
  {
    try
    {
      boolean bool = this.dpc.getBoolean(paramInt);
      return bool;
    }
    catch (JSONException localJSONException)
    {
      throw new f(localJSONException);
    }
  }
  
  public final double getDouble(int paramInt)
  {
    try
    {
      double d = this.dpc.getDouble(paramInt);
      return d;
    }
    catch (JSONException localJSONException)
    {
      throw new f(localJSONException);
    }
  }
  
  public final int getInt(int paramInt)
  {
    try
    {
      paramInt = this.dpc.getInt(paramInt);
      return paramInt;
    }
    catch (JSONException localJSONException)
    {
      throw new f(localJSONException);
    }
  }
  
  public final long getLong(int paramInt)
  {
    try
    {
      long l = this.dpc.getLong(paramInt);
      return l;
    }
    catch (JSONException localJSONException)
    {
      throw new f(localJSONException);
    }
  }
  
  public final String getString(int paramInt)
  {
    try
    {
      String str = this.dpc.getString(paramInt);
      return str;
    }
    catch (JSONException localJSONException)
    {
      throw new f(localJSONException);
    }
  }
  
  public final a gv(int paramInt)
  {
    this.dpc.put(paramInt);
    return this;
  }
  
  public final a gw(int paramInt)
  {
    try
    {
      Object localObject = this.dpc.getJSONArray(paramInt);
      if (localObject == null) {
        return null;
      }
      localObject = new b((JSONArray)localObject);
      return (a)localObject;
    }
    catch (JSONException localJSONException)
    {
      throw new f(localJSONException);
    }
  }
  
  public final a gx(int paramInt)
  {
    JSONArray localJSONArray = this.dpc.optJSONArray(paramInt);
    if (localJSONArray == null) {
      return null;
    }
    return new b(localJSONArray);
  }
  
  public final c gy(int paramInt)
  {
    try
    {
      Object localObject = this.dpc.getJSONObject(paramInt);
      if (localObject == null) {
        return null;
      }
      localObject = new d((JSONObject)localObject);
      return (c)localObject;
    }
    catch (JSONException localJSONException)
    {
      throw new f(localJSONException);
    }
  }
  
  public final c gz(int paramInt)
  {
    JSONObject localJSONObject = this.dpc.optJSONObject(paramInt);
    if (localJSONObject == null) {
      return null;
    }
    return new d(localJSONObject);
  }
  
  public final boolean isNull(int paramInt)
  {
    return this.dpc.isNull(paramInt);
  }
  
  public final int length()
  {
    return this.dpc.length();
  }
  
  public final a o(double paramDouble)
  {
    try
    {
      this.dpc.put(paramDouble);
      return this;
    }
    catch (JSONException localJSONException)
    {
      throw new f(localJSONException);
    }
  }
  
  public final Object opt(int paramInt)
  {
    Object localObject2 = this.dpc.opt(paramInt);
    Object localObject1;
    if ((localObject2 instanceof JSONObject)) {
      localObject1 = new d((JSONObject)localObject2);
    }
    do
    {
      return localObject1;
      localObject1 = localObject2;
    } while (!(localObject2 instanceof JSONArray));
    return new b((JSONArray)localObject2);
  }
  
  public final boolean optBoolean(int paramInt)
  {
    return this.dpc.optBoolean(paramInt);
  }
  
  public final boolean optBoolean(int paramInt, boolean paramBoolean)
  {
    return this.dpc.optBoolean(paramInt, paramBoolean);
  }
  
  public final double optDouble(int paramInt)
  {
    return this.dpc.optDouble(paramInt);
  }
  
  public final double optDouble(int paramInt, double paramDouble)
  {
    return this.dpc.optDouble(paramInt, paramDouble);
  }
  
  public final int optInt(int paramInt)
  {
    return this.dpc.optInt(paramInt);
  }
  
  public final int optInt(int paramInt1, int paramInt2)
  {
    return this.dpc.optInt(paramInt1, paramInt2);
  }
  
  public final long optLong(int paramInt)
  {
    return this.dpc.optLong(paramInt);
  }
  
  public final long optLong(int paramInt, long paramLong)
  {
    return this.dpc.optLong(paramInt, paramLong);
  }
  
  public final String optString(int paramInt)
  {
    return this.dpc.optString(paramInt);
  }
  
  public final String optString(int paramInt, String paramString)
  {
    return this.dpc.optString(paramInt, paramString);
  }
  
  @TargetApi(19)
  public final Object remove(int paramInt)
  {
    Object localObject2 = this.dpc.remove(paramInt);
    Object localObject1;
    if ((localObject2 instanceof JSONObject)) {
      localObject1 = new d((JSONObject)localObject2);
    }
    do
    {
      return localObject1;
      localObject1 = localObject2;
    } while (!(localObject2 instanceof JSONArray));
    return new b((JSONArray)localObject2);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/v/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */