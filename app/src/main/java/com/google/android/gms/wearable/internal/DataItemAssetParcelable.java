package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.wearable.g;

public class DataItemAssetParcelable
  implements SafeParcelable, g
{
  public static final Parcelable.Creator<DataItemAssetParcelable> CREATOR = new b();
  final String aEN;
  final String aXv;
  final int mVersionCode;
  
  DataItemAssetParcelable(int paramInt, String paramString1, String paramString2)
  {
    this.mVersionCode = paramInt;
    this.aEN = paramString1;
    this.aXv = paramString2;
  }
  
  public DataItemAssetParcelable(g paramg)
  {
    this.mVersionCode = 1;
    this.aEN = ((String)w.ah(paramg.getId()));
    this.aXv = ((String)w.ah(paramg.rR()));
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public final String getId()
  {
    return this.aEN;
  }
  
  public final String rR()
  {
    return this.aXv;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("DataItemAssetParcelable[");
    localStringBuilder.append("@");
    localStringBuilder.append(Integer.toHexString(hashCode()));
    if (this.aEN == null) {
      localStringBuilder.append(",noid");
    }
    for (;;)
    {
      localStringBuilder.append(", key=");
      localStringBuilder.append(this.aXv);
      localStringBuilder.append("]");
      return localStringBuilder.toString();
      localStringBuilder.append(",");
      localStringBuilder.append(this.aEN);
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    b.a(this, paramParcel);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/google/android/gms/wearable/internal/DataItemAssetParcelable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */