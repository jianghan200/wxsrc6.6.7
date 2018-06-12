package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.m;

public class NodeParcelable
  implements SafeParcelable, m
{
  public static final Parcelable.Creator<NodeParcelable> CREATOR = new ad();
  final String aEN;
  final String baG;
  final int beG;
  final boolean beH;
  final int mVersionCode;
  
  NodeParcelable(int paramInt1, String paramString1, String paramString2, int paramInt2, boolean paramBoolean)
  {
    this.mVersionCode = paramInt1;
    this.aEN = paramString1;
    this.baG = paramString2;
    this.beG = paramInt2;
    this.beH = paramBoolean;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof NodeParcelable)) {
      return false;
    }
    return ((NodeParcelable)paramObject).aEN.equals(this.aEN);
  }
  
  public final String getId()
  {
    return this.aEN;
  }
  
  public int hashCode()
  {
    return this.aEN.hashCode();
  }
  
  public String toString()
  {
    return "Node{" + this.baG + ", id=" + this.aEN + ", hops=" + this.beG + ", isNearby=" + this.beH + "}";
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ad.a(this, paramParcel);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/google/android/gms/wearable/internal/NodeParcelable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */