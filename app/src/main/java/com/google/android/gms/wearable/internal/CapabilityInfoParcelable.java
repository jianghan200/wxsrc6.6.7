package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.m;
import java.util.List;
import java.util.Set;

public class CapabilityInfoParcelable
  implements SafeParcelable
{
  public static final Parcelable.Creator<CapabilityInfoParcelable> CREATOR = new ay();
  private final Object aNW = new Object();
  final List<NodeParcelable> beh;
  private Set<m> bei;
  final String mName;
  final int mVersionCode;
  
  CapabilityInfoParcelable(int paramInt, String paramString, List<NodeParcelable> paramList)
  {
    this.mVersionCode = paramInt;
    this.mName = paramString;
    this.beh = paramList;
    this.bei = null;
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
      if ((paramObject == null) || (getClass() != paramObject.getClass())) {
        return false;
      }
      paramObject = (CapabilityInfoParcelable)paramObject;
      if (this.mVersionCode != ((CapabilityInfoParcelable)paramObject).mVersionCode) {
        return false;
      }
      if (this.mName != null)
      {
        if (this.mName.equals(((CapabilityInfoParcelable)paramObject).mName)) {}
      }
      else {
        while (((CapabilityInfoParcelable)paramObject).mName != null) {
          return false;
        }
      }
      if (this.beh == null) {
        break;
      }
    } while (this.beh.equals(((CapabilityInfoParcelable)paramObject).beh));
    for (;;)
    {
      return false;
      if (((CapabilityInfoParcelable)paramObject).beh == null) {
        break;
      }
    }
  }
  
  public int hashCode()
  {
    int j = 0;
    int k = this.mVersionCode;
    if (this.mName != null) {}
    for (int i = this.mName.hashCode();; i = 0)
    {
      if (this.beh != null) {
        j = this.beh.hashCode();
      }
      return (i + k * 31) * 31 + j;
    }
  }
  
  public String toString()
  {
    return "CapabilityInfo{" + this.mName + ", " + this.beh + "}";
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ay.a(this, paramParcel);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/google/android/gms/wearable/internal/CapabilityInfoParcelable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */