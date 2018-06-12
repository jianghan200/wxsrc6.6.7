package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public class StorageInfoResponse
  implements SafeParcelable
{
  public static final Parcelable.Creator<StorageInfoResponse> CREATOR = new al();
  public final long beI;
  public final List<PackageStorageInfo> beJ;
  public final int statusCode;
  public final int versionCode;
  
  StorageInfoResponse(int paramInt1, int paramInt2, long paramLong, List<PackageStorageInfo> paramList)
  {
    this.versionCode = paramInt1;
    this.statusCode = paramInt2;
    this.beI = paramLong;
    this.beJ = paramList;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    al.a(this, paramParcel);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/google/android/gms/wearable/internal/StorageInfoResponse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */