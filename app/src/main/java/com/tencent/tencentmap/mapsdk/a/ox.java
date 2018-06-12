package com.tencent.tencentmap.mapsdk.a;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class ox
  implements Parcelable
{
  public static final Parcelable.Creator<ox> CREATOR = new ox.1();
  public double a;
  public double b;
  
  public ox(double paramDouble1, double paramDouble2)
  {
    if ((-180.0D <= paramDouble2) && (paramDouble2 < 180.0D)) {}
    for (this.b = paramDouble2;; this.b = (((paramDouble2 - 180.0D) % 360.0D + 360.0D) % 360.0D - 180.0D))
    {
      this.a = Math.max(-90.0D, Math.min(90.0D, paramDouble1));
      return;
    }
  }
  
  private ox(Parcel paramParcel)
  {
    this.a = paramParcel.readDouble();
    this.b = paramParcel.readDouble();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if (!(paramObject instanceof ox)) {
        return false;
      }
      paramObject = (ox)paramObject;
    } while ((Double.doubleToLongBits(this.a) == Double.doubleToLongBits(((ox)paramObject).a)) && (Double.doubleToLongBits(this.b) == Double.doubleToLongBits(((ox)paramObject).b)));
    return false;
  }
  
  public int hashCode()
  {
    long l = Double.doubleToLongBits(this.a);
    int i = (int)(l ^ l >>> 32);
    l = Double.doubleToLongBits(this.b);
    return (i + 31) * 31 + (int)(l ^ l >>> 32);
  }
  
  public String toString()
  {
    return "lat/lng: (" + this.a + "," + this.b + ")";
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeDouble(this.a);
    paramParcel.writeDouble(this.b);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/ox.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */