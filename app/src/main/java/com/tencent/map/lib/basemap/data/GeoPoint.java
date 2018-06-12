package com.tencent.map.lib.basemap.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class GeoPoint
  implements Parcelable
{
  public static final Parcelable.Creator<GeoPoint> CREATOR = new Parcelable.Creator()
  {
    public final GeoPoint a(Parcel paramAnonymousParcel)
    {
      return new GeoPoint(paramAnonymousParcel, null);
    }
    
    public final GeoPoint[] a(int paramAnonymousInt)
    {
      return new GeoPoint[paramAnonymousInt];
    }
  };
  private int mLatitudeE6;
  private int mLongitudeE6;
  
  public GeoPoint()
  {
    this.mLatitudeE6 = -85000001;
    this.mLongitudeE6 = -180000001;
  }
  
  public GeoPoint(int paramInt1, int paramInt2)
  {
    this.mLatitudeE6 = paramInt1;
    this.mLongitudeE6 = paramInt2;
  }
  
  private GeoPoint(Parcel paramParcel)
  {
    this.mLatitudeE6 = paramParcel.readInt();
    this.mLongitudeE6 = paramParcel.readInt();
  }
  
  public GeoPoint(GeoPoint paramGeoPoint)
  {
    this();
    this.mLatitudeE6 = paramGeoPoint.mLatitudeE6;
    this.mLongitudeE6 = paramGeoPoint.mLongitudeE6;
  }
  
  public static GeoPoint formString(String paramString)
  {
    GeoPoint localGeoPoint = new GeoPoint();
    if (paramString != null) {}
    try
    {
      paramString = paramString.split(",");
      if ((paramString != null) && (paramString.length == 2))
      {
        localGeoPoint.mLatitudeE6 = Integer.parseInt(paramString[0]);
        localGeoPoint.mLongitudeE6 = Integer.parseInt(paramString[1]);
      }
      return localGeoPoint;
    }
    catch (Exception paramString) {}
    return localGeoPoint;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if ((paramObject instanceof GeoPoint))
    {
      paramObject = (GeoPoint)paramObject;
      bool1 = bool2;
      if (this.mLatitudeE6 == ((GeoPoint)paramObject).mLatitudeE6)
      {
        bool1 = bool2;
        if (this.mLongitudeE6 == ((GeoPoint)paramObject).mLongitudeE6) {
          bool1 = true;
        }
      }
    }
    return bool1;
  }
  
  public int getLatitudeE6()
  {
    return this.mLatitudeE6;
  }
  
  public int getLongitudeE6()
  {
    return this.mLongitudeE6;
  }
  
  public void setGeoPoint(GeoPoint paramGeoPoint)
  {
    this.mLatitudeE6 = paramGeoPoint.getLatitudeE6();
    this.mLongitudeE6 = paramGeoPoint.getLongitudeE6();
  }
  
  public void setLatitudeE6(int paramInt)
  {
    this.mLatitudeE6 = paramInt;
  }
  
  public void setLongitudeE6(int paramInt)
  {
    this.mLongitudeE6 = paramInt;
  }
  
  public String toString()
  {
    return this.mLatitudeE6 + "," + this.mLongitudeE6;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.mLatitudeE6);
    paramParcel.writeInt(this.mLongitudeE6);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/map/lib/basemap/data/GeoPoint.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */