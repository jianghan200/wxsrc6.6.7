package com.tencent.tencentmap.mapsdk.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class r
{
  private static r a;
  private SharedPreferences b = null;
  
  private r(Context paramContext)
  {
    this.b = paramContext.getSharedPreferences("com.tencent.tencentmap.mapsdk.maps.offlinemap", 0);
  }
  
  public static r a(Context paramContext)
  {
    if (a == null) {}
    try
    {
      if (a == null) {
        a = new r(paramContext.getApplicationContext());
      }
      return a;
    }
    finally {}
  }
  
  public int a()
  {
    return this.b.getInt("mapConfigVersion", -1);
  }
  
  public boolean a(int paramInt)
  {
    return this.b.edit().putInt("mapConfigVersion", paramInt).commit();
  }
  
  public boolean a(long paramLong)
  {
    return this.b.edit().putLong("mapConfigLastCheckTime", paramLong).commit();
  }
  
  public boolean a(String paramString)
  {
    return this.b.edit().putString("sdkVersion", paramString).commit();
  }
  
  public boolean a(boolean paramBoolean)
  {
    return this.b.edit().putBoolean("worldMapEnabled", paramBoolean).commit();
  }
  
  public int b()
  {
    return this.b.getInt("mapPoiIcon", -1);
  }
  
  public boolean b(int paramInt)
  {
    return this.b.edit().putInt("mapPoiIcon", paramInt).commit();
  }
  
  public boolean b(String paramString)
  {
    return this.b.edit().putString("mapSourceType", paramString).commit();
  }
  
  public boolean b(boolean paramBoolean)
  {
    return this.b.edit().putBoolean("specialDistrictEnable", paramBoolean).commit();
  }
  
  public int c()
  {
    return this.b.getInt("mapIconVersion", -1);
  }
  
  public boolean c(int paramInt)
  {
    return this.b.edit().putInt("mapIconVersion", paramInt).commit();
  }
  
  public boolean c(String paramString)
  {
    return this.b.edit().putString("taiwanMapName", paramString).commit();
  }
  
  public int d()
  {
    return this.b.getInt("rttConfigVersion", 0);
  }
  
  public boolean d(int paramInt)
  {
    return this.b.edit().putInt("rttConfigVersion", paramInt).commit();
  }
  
  public boolean d(String paramString)
  {
    return this.b.edit().putString("worldTileURLExpression", paramString).commit();
  }
  
  public String e()
  {
    return this.b.getString("sdkVersion", null);
  }
  
  public boolean e(int paramInt)
  {
    return this.b.edit().putInt("worldMapStyle", paramInt).commit();
  }
  
  public boolean e(String paramString)
  {
    return this.b.edit().putString("taiwanTileURLExpression", paramString).commit();
  }
  
  public boolean f()
  {
    return this.b.getBoolean("worldMapEnabled", false);
  }
  
  public boolean f(int paramInt)
  {
    return this.b.edit().putInt("worldMapVersion", paramInt).commit();
  }
  
  public boolean f(String paramString)
  {
    return this.b.edit().putString("mapConfigZipMd5", paramString).commit();
  }
  
  public boolean g()
  {
    return this.b.getBoolean("specialDistrictEnable", false);
  }
  
  public boolean g(int paramInt)
  {
    return this.b.edit().putInt("worldMapScene", paramInt).commit();
  }
  
  public boolean g(String paramString)
  {
    return this.b.edit().putString("mapPoiIconZipMd5", paramString).commit();
  }
  
  public int h()
  {
    return this.b.getInt("worldMapStyle", -1);
  }
  
  public boolean h(int paramInt)
  {
    return this.b.edit().putInt("worldMapFrontierVersion", paramInt).commit();
  }
  
  public boolean h(String paramString)
  {
    return this.b.edit().putString("mapIconZipMd5", paramString).commit();
  }
  
  public int i()
  {
    return this.b.getInt("worldMapVersion", -1);
  }
  
  public boolean i(int paramInt)
  {
    return this.b.edit().putInt("mapConfigIndoorVersion", paramInt).commit();
  }
  
  public int j()
  {
    return this.b.getInt("worldMapScene", -1);
  }
  
  public boolean j(int paramInt)
  {
    return this.b.edit().putInt("mapPoiIconIndoorVersion", paramInt).commit();
  }
  
  public String k()
  {
    return this.b.getString("mapSourceType", null);
  }
  
  public boolean k(int paramInt)
  {
    return this.b.edit().putInt("closeRoadSytleNomalModeVersion", paramInt).commit();
  }
  
  public String l()
  {
    return this.b.getString("taiwanMapName", null);
  }
  
  public boolean l(int paramInt)
  {
    return this.b.edit().putInt("closeRoadStyleTrafficModeVersion", paramInt).commit();
  }
  
  public int m()
  {
    return this.b.getInt("worldMapFrontierVersion", -1);
  }
  
  public boolean m(int paramInt)
  {
    return this.b.edit().putInt("handDrawMapVer", paramInt).commit();
  }
  
  public String n()
  {
    return this.b.getString("worldTileURLExpression", null);
  }
  
  public String o()
  {
    return this.b.getString("taiwanTileURLExpression", null);
  }
  
  public int p()
  {
    return this.b.getInt("mapConfigIndoorVersion", 0);
  }
  
  public int q()
  {
    return this.b.getInt("mapPoiIconIndoorVersion", 0);
  }
  
  public String r()
  {
    return this.b.getString("mapConfigZipMd5", null);
  }
  
  public String s()
  {
    return this.b.getString("mapPoiIconZipMd5", null);
  }
  
  public String t()
  {
    return this.b.getString("mapIconZipMd5", null);
  }
  
  public int u()
  {
    return this.b.getInt("closeRoadSytleNomalModeVersion", 0);
  }
  
  public int v()
  {
    return this.b.getInt("closeRoadStyleTrafficModeVersion", 0);
  }
  
  public int w()
  {
    return this.b.getInt("handDrawMapVer", 0);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */