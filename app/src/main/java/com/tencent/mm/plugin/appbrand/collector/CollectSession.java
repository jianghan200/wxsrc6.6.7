package com.tencent.mm.plugin.appbrand.collector;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import junit.framework.Assert;

public class CollectSession
  implements Parcelable
{
  public static final Parcelable.Creator<CollectSession> CREATOR = new CollectSession.1();
  public final Bundle bQf = new Bundle();
  TimePoint fnY;
  TimePoint fnZ;
  final Map<String, TimePoint> foa = new HashMap();
  String fob;
  String groupId;
  String id;
  
  CollectSession() {}
  
  public CollectSession(String paramString)
  {
    this.id = paramString;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public final void rt(String paramString)
  {
    Assert.assertNull(this.fnY);
    this.fnY = new TimePoint(paramString, System.nanoTime());
    this.fnZ = this.fnY;
    this.fnY.foj.set(1);
    this.foa.put(paramString, this.fnY);
  }
  
  public final void ru(String paramString)
  {
    Assert.assertNotNull(this.fnZ);
    long l = System.nanoTime();
    TimePoint localTimePoint = (TimePoint)this.foa.get(paramString);
    if (localTimePoint == null)
    {
      localTimePoint = new TimePoint(paramString, l);
      localTimePoint.foj.set(1);
      this.foa.put(paramString, localTimePoint);
      this.fnZ.fol.set(localTimePoint);
      this.fnZ = localTimePoint;
      return;
    }
    localTimePoint.fok.set((l + localTimePoint.fok.get() * localTimePoint.foj.get()) / (localTimePoint.foj.get() + 1));
    localTimePoint.foj.incrementAndGet();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.groupId);
    paramParcel.writeString(this.id);
    paramParcel.writeParcelable(this.fnY, paramInt);
    paramParcel.writeString(this.fob);
    paramParcel.writeBundle(this.bQf);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/collector/CollectSession.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */