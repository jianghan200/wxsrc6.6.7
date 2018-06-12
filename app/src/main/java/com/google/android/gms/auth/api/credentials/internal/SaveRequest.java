package com.google.android.gms.auth.api.credentials.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class SaveRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator<SaveRequest> CREATOR = new b();
  final Credential aJc;
  final int mVersionCode;
  
  SaveRequest(int paramInt, Credential paramCredential)
  {
    this.mVersionCode = paramInt;
    this.aJc = paramCredential;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    b.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/google/android/gms/auth/api/credentials/internal/SaveRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */