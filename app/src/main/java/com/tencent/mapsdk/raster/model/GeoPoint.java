package com.tencent.mapsdk.raster.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class GeoPoint
  implements Parcelable
{
  public static final Parcelable.Creator<GeoPoint> CREATOR = new Parcelable.Creator()
  {
    public final GeoPoint createFromParcel(Parcel paramAnonymousParcel)
    {
      return new GeoPoint(paramAnonymousParcel, null);
    }
    
    public final GeoPoint[] newArray(int paramAnonymousInt)
    {
      return new GeoPoint[paramAnonymousInt];
    }
  };
  private int e6Lat = 0;
  private int e6Lon = 0;
  
  public GeoPoint(int paramInt1, int paramInt2)
  {
    this.e6Lat = paramInt1;
    this.e6Lon = paramInt2;
  }
  
  private GeoPoint(Parcel paramParcel)
  {
    this.e6Lat = paramParcel.readInt();
    this.e6Lon = paramParcel.readInt();
  }
  
  public static LatLng g2l(GeoPoint paramGeoPoint)
  {
    return new LatLng(paramGeoPoint.getLatitudeE6() * 1.0D / 1000000.0D, paramGeoPoint.getLongitudeE6() * 1.0D / 1000000.0D);
  }
  
  public GeoPoint Copy()
  {
    return new GeoPoint(this.e6Lat, this.e6Lon);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == null) {}
    do
    {
      do
      {
        return false;
      } while (paramObject.getClass() != getClass());
      paramObject = (GeoPoint)paramObject;
    } while ((this.e6Lat != ((GeoPoint)paramObject).e6Lat) || (this.e6Lon != ((GeoPoint)paramObject).e6Lon));
    return true;
  }
  
  public int getLatitudeE6()
  {
    return this.e6Lat;
  }
  
  public int getLongitudeE6()
  {
    return this.e6Lon;
  }
  
  public int hashCode()
  {
    return this.e6Lon * 7 + this.e6Lat * 11;
  }
  
  public void setLatitudeE6(int paramInt)
  {
    this.e6Lat = paramInt;
  }
  
  public void setLongitudeE6(int paramInt)
  {
    this.e6Lon = paramInt;
  }
  
  public String toString()
  {
    return this.e6Lat + "," + this.e6Lon;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.e6Lat);
    paramParcel.writeInt(this.e6Lon);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mapsdk/raster/model/GeoPoint.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */