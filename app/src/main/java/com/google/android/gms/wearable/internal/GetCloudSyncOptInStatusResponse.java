package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class GetCloudSyncOptInStatusResponse
  implements SafeParcelable
{
  public static final Parcelable.Creator<GetCloudSyncOptInStatusResponse> CREATOR = new m();
  public final boolean bex;
  public final boolean bey;
  public final int statusCode;
  public final int versionCode;
  
  GetCloudSyncOptInStatusResponse(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.versionCode = paramInt1;
    this.statusCode = paramInt2;
    this.bex = paramBoolean1;
    this.bey = paramBoolean2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    m.a(this, paramParcel);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/google/android/gms/wearable/internal/GetCloudSyncOptInStatusResponse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */