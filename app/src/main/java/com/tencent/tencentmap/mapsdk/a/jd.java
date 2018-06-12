package com.tencent.tencentmap.mapsdk.a;

import com.tencent.map.lib.basemap.data.DoublePoint;
import com.tencent.map.lib.basemap.data.GeoPoint;
import java.util.ArrayList;
import java.util.List;

public class jd
{
  private static double a(int paramInt1, int paramInt2, int paramInt3, float paramFloat)
  {
    return (1.0D - paramFloat) * (1.0D - paramFloat) * paramInt1 + 2.0F * paramFloat * (1.0D - paramFloat) * paramInt2 + paramFloat * paramFloat * paramInt3;
  }
  
  private static double a(DoublePoint paramDoublePoint1, DoublePoint paramDoublePoint2)
  {
    double d1 = paramDoublePoint2.x - paramDoublePoint1.x;
    double d2 = paramDoublePoint2.y - paramDoublePoint1.y;
    return Math.sqrt(d1 * d1 + d2 * d2);
  }
  
  private static float a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat)
  {
    float f1 = (paramInt2 - paramInt1) * 3.0F;
    float f2 = (paramInt3 - paramInt2) * 3.0F - f1;
    float f3 = paramInt4 - paramInt1;
    float f4 = paramFloat * paramFloat;
    return f1 * paramFloat + (f2 * f4 + (f3 - f1 - f2) * (f4 * paramFloat)) + paramInt1;
  }
  
  public static int a(List<GeoPoint> paramList, int[] paramArrayOfInt, hh paramhh)
  {
    if (paramList == null) {}
    int k;
    do
    {
      return 0;
      k = paramList.size();
    } while (k < 2);
    int i = 0;
    int j = 0;
    while (i < k - 1)
    {
      GeoPoint localGeoPoint1 = (GeoPoint)paramList.get(i);
      GeoPoint localGeoPoint2 = (GeoPoint)paramList.get(i + 1);
      double d = a(paramhh.b(localGeoPoint1), paramhh.b(localGeoPoint2));
      int m = (int)d / 500;
      m = (int)d / Math.max(4, m * 4);
      paramArrayOfInt[i] = m;
      j += m;
      i += 1;
    }
    return j;
  }
  
  private static GeoPoint a(List<GeoPoint> paramList, float paramFloat)
  {
    if ((paramList == null) || (paramList.isEmpty())) {
      return null;
    }
    int i = paramList.size();
    if ((i != 3) && (i != 4)) {
      return null;
    }
    if (i == 3)
    {
      localGeoPoint1 = (GeoPoint)paramList.get(0);
      localGeoPoint2 = (GeoPoint)paramList.get(1);
      paramList = (GeoPoint)paramList.get(2);
      if ((localGeoPoint1 == null) || (localGeoPoint2 == null) || (paramList == null)) {
        return null;
      }
      i = (int)a(localGeoPoint1.getLongitudeE6(), localGeoPoint2.getLongitudeE6(), paramList.getLongitudeE6(), paramFloat);
      return new GeoPoint((int)a(localGeoPoint1.getLatitudeE6(), localGeoPoint2.getLatitudeE6(), paramList.getLatitudeE6(), paramFloat), i);
    }
    GeoPoint localGeoPoint1 = (GeoPoint)paramList.get(0);
    GeoPoint localGeoPoint2 = (GeoPoint)paramList.get(1);
    GeoPoint localGeoPoint3 = (GeoPoint)paramList.get(2);
    paramList = (GeoPoint)paramList.get(3);
    if ((localGeoPoint1 == null) || (localGeoPoint2 == null) || (localGeoPoint3 == null) || (paramList == null)) {
      return null;
    }
    i = (int)a(localGeoPoint1.getLongitudeE6(), localGeoPoint2.getLongitudeE6(), localGeoPoint3.getLongitudeE6(), paramList.getLongitudeE6(), paramFloat);
    return new GeoPoint((int)a(localGeoPoint1.getLatitudeE6(), localGeoPoint2.getLatitudeE6(), localGeoPoint3.getLatitudeE6(), paramList.getLatitudeE6(), paramFloat), i);
  }
  
  public static List<GeoPoint> a(List<GeoPoint> paramList, int paramInt)
  {
    if ((paramList == null) || (paramList.isEmpty())) {
      return null;
    }
    int m = paramList.size();
    ArrayList localArrayList = new ArrayList(paramInt);
    GeoPoint localGeoPoint1 = (GeoPoint)paramList.get(0);
    GeoPoint localGeoPoint2 = (GeoPoint)paramList.get(m - 1);
    int j = (localGeoPoint1.getLongitudeE6() + localGeoPoint2.getLongitudeE6()) / 2;
    int k = (localGeoPoint1.getLatitudeE6() + localGeoPoint2.getLatitudeE6()) / 2;
    int i = 0;
    while (i < m)
    {
      localGeoPoint1 = (GeoPoint)paramList.get(i);
      localGeoPoint1.setLongitudeE6(localGeoPoint1.getLongitudeE6() - j);
      localGeoPoint1.setLatitudeE6(localGeoPoint1.getLatitudeE6() - k);
      i += 1;
    }
    float f2 = 1.0F / (paramInt + 1);
    i = 0;
    float f1 = f2;
    while (i < paramInt)
    {
      localGeoPoint1 = a(paramList, f1);
      localGeoPoint1.setLongitudeE6(localGeoPoint1.getLongitudeE6() + j);
      localGeoPoint1.setLatitudeE6(localGeoPoint1.getLatitudeE6() + k);
      localArrayList.add(localGeoPoint1);
      f1 += f2;
      i += 1;
    }
    return localArrayList;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/jd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */