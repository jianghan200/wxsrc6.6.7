package com.tencent.map.lib.util;

import com.tencent.map.lib.basemap.data.GeoPoint;

public class d
{
  public static GeoPoint a(int paramInt1, int paramInt2)
  {
    double d2 = paramInt2 * 360.0F / 2.68435456E8F;
    double d1 = paramInt1 * 360.0F / 2.68435456E8F;
    d2 = Math.atan(Math.exp((180.0D - d2) * 0.017453292519943295D)) / 0.008726646259971648D;
    paramInt1 = (int)Math.ceil((d1 - 180.0D) * 1000000.0D);
    return new GeoPoint((int)Math.ceil((d2 - 90.0D) * 1000000.0D), paramInt1);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/map/lib/util/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */