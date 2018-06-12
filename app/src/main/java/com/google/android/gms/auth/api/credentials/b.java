package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class b
  implements Parcelable.Creator<CredentialPickerConfig>
{
  static void a(CredentialPickerConfig paramCredentialPickerConfig, Parcel paramParcel)
  {
    int i = com.google.android.gms.common.internal.safeparcel.b.t(paramParcel, 20293);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 1, paramCredentialPickerConfig.aIL);
    com.google.android.gms.common.internal.safeparcel.b.c(paramParcel, 1000, paramCredentialPickerConfig.mVersionCode);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 2, paramCredentialPickerConfig.aIM);
    com.google.android.gms.common.internal.safeparcel.b.u(paramParcel, i);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/google/android/gms/auth/api/credentials/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */