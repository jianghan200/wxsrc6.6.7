package com.tencent.mm.plugin.appbrand.collector;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public class TimePoint
  implements Parcelable
{
  public static final Parcelable.Creator<TimePoint> CREATOR = new TimePoint.1();
  final AtomicInteger foj = new AtomicInteger();
  final AtomicLong fok = new AtomicLong();
  final AtomicReference<TimePoint> fol = new AtomicReference();
  String name;
  
  TimePoint()
  {
    this.name = "";
  }
  
  public TimePoint(String paramString, long paramLong)
  {
    this.name = paramString;
    this.fok.set(paramLong);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.name);
    paramParcel.writeLong(this.fok.get());
    paramParcel.writeInt(this.foj.get());
    paramParcel.writeParcelable((Parcelable)this.fol.get(), paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/collector/TimePoint.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */