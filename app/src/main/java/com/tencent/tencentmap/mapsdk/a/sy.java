package com.tencent.tencentmap.mapsdk.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class sy
{
  private static sy b = null;
  private SharedPreferences a;
  
  public static sy a()
  {
    if (b == null) {}
    try
    {
      b = new sy();
      return b;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final String a(String paramString)
  {
    if (this.a == null) {
      return null;
    }
    return this.a.getString(paramString, null);
  }
  
  public final void a(Context paramContext)
  {
    paramContext = paramContext.getApplicationContext();
    this.a = paramContext.getSharedPreferences(paramContext.getPackageName(), 0);
  }
  
  public final boolean a(String paramString, int paramInt)
  {
    if (this.a == null) {
      return false;
    }
    return this.a.edit().putInt(paramString, paramInt).commit();
  }
  
  public final boolean a(String paramString1, String paramString2)
  {
    if (this.a == null) {
      return false;
    }
    return this.a.edit().putString(paramString1, paramString2).commit();
  }
  
  public final boolean a(String paramString, boolean paramBoolean)
  {
    if (this.a == null) {
      return false;
    }
    return this.a.edit().putBoolean(paramString, paramBoolean).commit();
  }
  
  public final boolean a(String[] paramArrayOfString)
  {
    int i = 0;
    if (this.a == null) {
      return false;
    }
    SharedPreferences.Editor localEditor = this.a.edit();
    int j = paramArrayOfString.length;
    while (i < j)
    {
      localEditor.remove(paramArrayOfString[i]);
      i += 1;
    }
    return localEditor.commit();
  }
  
  public final int b(String paramString)
  {
    if (this.a == null) {
      return -1;
    }
    return this.a.getInt(paramString, -1);
  }
  
  public final boolean c(String paramString)
  {
    if (this.a == null) {
      return false;
    }
    return this.a.getBoolean(paramString, false);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/sy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */