package com.tencent.tencentmap.mapsdk.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class v
{
  private static volatile v a;
  private SharedPreferences b;
  
  private v(Context paramContext)
  {
    this.b = paramContext.getSharedPreferences("com.tencent.tencentmap.vector.dynamic", 0);
  }
  
  public static v a(Context paramContext)
  {
    if (a == null) {}
    try
    {
      if (a == null) {
        a = new v(paramContext);
      }
      return a;
    }
    finally {}
  }
  
  public boolean a(long paramLong)
  {
    return this.b.edit().putLong("lastDynamicLibCheckTime", paramLong).commit();
  }
  
  public boolean a(String paramString)
  {
    if (paramString == null) {
      return false;
    }
    if (this.b.getString("supportVectorOtaVersions", null) == null) {
      return this.b.edit().putString("supportVectorOtaVersions", paramString).commit();
    }
    LinkedHashSet localLinkedHashSet = new LinkedHashSet(Arrays.asList(a()));
    localLinkedHashSet.add(paramString);
    return a((String[])localLinkedHashSet.toArray(new String[localLinkedHashSet.size()]));
  }
  
  public boolean a(String[] paramArrayOfString)
  {
    int i = 0;
    if (paramArrayOfString == null) {
      return false;
    }
    StringBuffer localStringBuffer = new StringBuffer();
    while (i < paramArrayOfString.length - 1)
    {
      localStringBuffer.append(paramArrayOfString[i] + ";");
      i += 1;
    }
    localStringBuffer.append(paramArrayOfString[(paramArrayOfString.length - 1)]);
    return this.b.edit().putString("supportVectorOtaVersions", localStringBuffer.toString()).commit();
  }
  
  public String[] a()
  {
    String str = this.b.getString("supportVectorOtaVersions", null);
    if (str == null) {
      return null;
    }
    return str.split(";");
  }
  
  public String b()
  {
    return this.b.getString("vectorMapConfigMd5", null);
  }
  
  public boolean b(String paramString)
  {
    return this.b.edit().putString("vectorMapConfigMd5", paramString).commit();
  }
  
  public String c()
  {
    return this.b.getString("vectorMapPoiIconMd5", null);
  }
  
  public boolean c(String paramString)
  {
    return this.b.edit().putString("vectorMapPoiIconMd5", paramString).commit();
  }
  
  public long d()
  {
    return this.b.getLong("lastDynamicLibCheckTime", 0L);
  }
  
  public boolean d(String paramString)
  {
    return this.b.edit().putString("dynamicMapSdkVectorVersion", paramString).commit();
  }
  
  public String e()
  {
    return this.b.getString("dynamicMapSdkVectorVersion", "");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */