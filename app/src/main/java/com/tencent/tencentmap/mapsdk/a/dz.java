package com.tencent.tencentmap.mapsdk.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class dz
{
  public int a;
  public int b;
  public int c;
  public int d;
  public int e;
  public fm f;
  
  public dz() {}
  
  public dz(fg paramfg)
  {
    this.a = paramfg.a;
    this.b = paramfg.b;
    this.c = paramfg.c;
    this.d = paramfg.d;
    this.e = paramfg.e;
    this.f = paramfg.f;
  }
  
  private void c()
  {
    if ((this.a < 10000) || (this.a > 30000)) {
      this.a = 20000;
    }
    if ((this.b < 10000) || (this.b > 30000)) {
      this.b = 20000;
    }
    if ((this.c < 3) || (this.c > 15)) {
      this.c = 8;
    }
    if ((this.d <= 0) || (this.d > 5)) {
      this.d = 2;
    }
    if ((this.e < 5) || (this.e > 240)) {
      this.e = 60;
    }
  }
  
  public final void a()
  {
    fm localfm = null;
    Object localObject = em.a().getSharedPreferences("Access_Preferences", 0);
    this.a = ((SharedPreferences)localObject).getInt("connectTimeout", 20000);
    this.b = ((SharedPreferences)localObject).getInt("readTimeout", 20000);
    this.c = ((SharedPreferences)localObject).getInt("apnCachedNum", 8);
    this.d = ((SharedPreferences)localObject).getInt("parallelNum", 2);
    this.e = ((SharedPreferences)localObject).getInt("expireTime", 30);
    localObject = ((SharedPreferences)localObject).getString("samplingInfo", null);
    if (localObject != null)
    {
      localObject = ((String)localObject).split(";");
      localfm = new fm();
      HashMap localHashMap = new HashMap();
      int i = 0;
      while (i < localObject.length - 1)
      {
        String[] arrayOfString = localObject[i].split(",");
        localHashMap.put(Integer.valueOf(Integer.parseInt(arrayOfString[0])), Byte.valueOf(Byte.parseByte(arrayOfString[1])));
        i += 1;
      }
      localfm.a = localHashMap;
      localfm.b = Byte.parseByte(localObject[(localObject.length - 1)]);
    }
    this.f = localfm;
    c();
  }
  
  public final void b()
  {
    Object localObject = em.a().getSharedPreferences("Access_Preferences", 0);
    c();
    ((SharedPreferences)localObject).edit().putInt("connectTimeout", this.a).commit();
    ((SharedPreferences)localObject).edit().putInt("readTimeout", this.b).commit();
    ((SharedPreferences)localObject).edit().putInt("apnCachedNum", this.c).commit();
    ((SharedPreferences)localObject).edit().putInt("parallelNum", this.d).commit();
    ((SharedPreferences)localObject).edit().putInt("expireTime", this.e).commit();
    SharedPreferences.Editor localEditor = ((SharedPreferences)localObject).edit();
    localObject = this.f;
    StringBuilder localStringBuilder = new StringBuilder();
    if (((fm)localObject).a != null)
    {
      Iterator localIterator = ((fm)localObject).a.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        localStringBuilder.append(localEntry.getKey() + "," + localEntry.getValue() + ";");
      }
      localStringBuilder.append(((fm)localObject).b);
    }
    for (localObject = localStringBuilder.toString();; localObject = null)
    {
      localEditor.putString("samplingInfo", (String)localObject).commit();
      return;
    }
  }
  
  public final String toString()
  {
    return "connectTimeout:" + this.a + ",readTimeout:" + this.b + ",apnCachedNum:" + this.c + ",parallelNum:" + this.d + ",expireTime:" + this.e;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/dz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */