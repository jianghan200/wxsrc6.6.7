package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class GetCloudSyncOptInOutDoneResponse
  implements SafeParcelable
{
  public static final Parcelable.Creator<GetCloudSyncOptInOutDoneResponse> CREATOR = new l();
  public final boolean bew;
  public final int statusCode;
  public final int versionCode;
  
  GetCloudSyncOptInOutDoneResponse(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    this.versionCode = paramInt1;
    this.statusCode = paramInt2;
    this.bew = paramBoolean;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    l.a(this, paramParcel);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/google/android/gms/wearable/internal/GetCloudSyncOptInOutDoneResponse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */