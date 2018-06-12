package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public final class a
  implements Parcelable.Creator<SignInConfiguration>
{
  static void a(SignInConfiguration paramSignInConfiguration, Parcel paramParcel, int paramInt)
  {
    int i = b.t(paramParcel, 20293);
    b.c(paramParcel, 1, paramSignInConfiguration.versionCode);
    b.a(paramParcel, 2, paramSignInConfiguration.aJv);
    b.a(paramParcel, 3, paramSignInConfiguration.aJw);
    b.a(paramParcel, 4, paramSignInConfiguration.aJx, paramInt);
    b.a(paramParcel, 5, paramSignInConfiguration.aJy, paramInt);
    b.a(paramParcel, 6, paramSignInConfiguration.aJz, paramInt);
    b.a(paramParcel, 7, paramSignInConfiguration.aJA);
    b.u(paramParcel, i);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/google/android/gms/auth/api/signin/internal/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */