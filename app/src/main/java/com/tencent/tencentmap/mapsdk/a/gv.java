package com.tencent.tencentmap.mapsdk.a;

import com.tencent.map.lib.basemap.data.GeoPoint;

public class gv
{
  private static gv a;
  private StringBuffer b = new StringBuffer();
  private String c = "";
  private String d = "";
  
  public static gv a()
  {
    if (a == null) {
      a = new gv();
    }
    return a;
  }
  
  public void a(int paramInt)
  {
    this.c = ("####ClearCacheStatus: " + paramInt);
  }
  
  public void a(ic paramic)
  {
    if (paramic == null) {
      return;
    }
    StringBuffer localStringBuffer = new StringBuffer();
    GeoPoint localGeoPoint = paramic.p();
    if (localGeoPoint != null) {
      localStringBuffer.append("####mapCenter x: " + localGeoPoint.getLatitudeE6() + "  y: " + localGeoPoint.getLongitudeE6());
    }
    localStringBuffer.append("  mapScale: " + paramic.j());
    localStringBuffer.append("  mapSkew: " + paramic.d());
    localStringBuffer.append("  mapRotate: " + paramic.c());
    this.d = localStringBuffer.toString();
  }
  
  public void a(String paramString)
  {
    if (this.b == null) {
      this.b = new StringBuffer();
    }
    this.b.append("####");
    this.b.append(paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/gv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */