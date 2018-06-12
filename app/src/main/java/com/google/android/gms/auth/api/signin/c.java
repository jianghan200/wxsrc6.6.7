package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.ArrayList;

public final class c
  implements Parcelable.Creator<GoogleSignInConfig>
{
  static void a(GoogleSignInConfig paramGoogleSignInConfig, Parcel paramParcel)
  {
    int i = b.t(paramParcel, 20293);
    b.c(paramParcel, 1, paramGoogleSignInConfig.versionCode);
    b.b(paramParcel, 2, new ArrayList(paramGoogleSignInConfig.aJu));
    b.u(paramParcel, i);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/google/android/gms/auth/api/signin/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */