package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public final class a
  implements Parcelable.Creator<EmailSignInConfig>
{
  static void a(EmailSignInConfig paramEmailSignInConfig, Parcel paramParcel, int paramInt)
  {
    int i = b.t(paramParcel, 20293);
    b.c(paramParcel, 1, paramEmailSignInConfig.versionCode);
    b.a(paramParcel, 2, paramEmailSignInConfig.aJr, paramInt);
    b.a(paramParcel, 3, paramEmailSignInConfig.aJs);
    b.a(paramParcel, 4, paramEmailSignInConfig.aJt, paramInt);
    b.u(paramParcel, i);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/google/android/gms/auth/api/signin/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */