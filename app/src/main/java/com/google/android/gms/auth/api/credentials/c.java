package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public final class c
  implements Parcelable.Creator<CredentialRequest>
{
  static void a(CredentialRequest paramCredentialRequest, Parcel paramParcel, int paramInt)
  {
    int i = b.t(paramParcel, 20293);
    b.a(paramParcel, 1, paramCredentialRequest.aIN);
    b.c(paramParcel, 1000, paramCredentialRequest.mVersionCode);
    b.a(paramParcel, 2, paramCredentialRequest.aIO);
    b.a(paramParcel, 3, paramCredentialRequest.aIP, paramInt);
    b.a(paramParcel, 4, paramCredentialRequest.aIQ, paramInt);
    b.u(paramParcel, i);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/google/android/gms/auth/api/credentials/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */