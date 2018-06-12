package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public final class a
  implements Parcelable.Creator<Credential>
{
  static void a(Credential paramCredential, Parcel paramParcel, int paramInt)
  {
    int i = b.t(paramParcel, 20293);
    b.a(paramParcel, 1001, paramCredential.aID);
    b.a(paramParcel, 1, paramCredential.aEN);
    b.c(paramParcel, 1000, paramCredential.mVersionCode);
    b.a(paramParcel, 2, paramCredential.mName);
    b.a(paramParcel, 3, paramCredential.aIF, paramInt);
    b.a(paramParcel, 1002, paramCredential.aIE);
    b.b(paramParcel, 4, paramCredential.aIG);
    b.a(paramParcel, 5, paramCredential.aIH);
    b.a(paramParcel, 6, paramCredential.aII);
    b.a(paramParcel, 7, paramCredential.aIJ);
    b.a(paramParcel, 8, paramCredential.aIK);
    b.u(paramParcel, i);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/google/android/gms/auth/api/credentials/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */