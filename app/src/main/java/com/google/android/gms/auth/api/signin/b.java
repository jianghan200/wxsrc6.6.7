package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;

public final class b
  implements Parcelable.Creator<FacebookSignInConfig>
{
  static void a(FacebookSignInConfig paramFacebookSignInConfig, Parcel paramParcel, int paramInt)
  {
    int i = com.google.android.gms.common.internal.safeparcel.b.t(paramParcel, 20293);
    com.google.android.gms.common.internal.safeparcel.b.c(paramParcel, 1, paramFacebookSignInConfig.versionCode);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 2, paramFacebookSignInConfig.Hq, paramInt);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 3, new ArrayList(paramFacebookSignInConfig.aJu));
    com.google.android.gms.common.internal.safeparcel.b.u(paramParcel, i);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/google/android/gms/auth/api/signin/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */