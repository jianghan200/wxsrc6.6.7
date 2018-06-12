package com.google.android.gms.signin;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public final class a
  implements Parcelable.Creator<GoogleSignInAccount>
{
  static void a(GoogleSignInAccount paramGoogleSignInAccount, Parcel paramParcel, int paramInt)
  {
    int i = b.t(paramParcel, 20293);
    b.c(paramParcel, 1, paramGoogleSignInAccount.versionCode);
    b.a(paramParcel, 2, paramGoogleSignInAccount.aEN);
    b.a(paramParcel, 3, paramGoogleSignInAccount.aIR);
    b.a(paramParcel, 4, paramGoogleSignInAccount.baF);
    b.a(paramParcel, 5, paramGoogleSignInAccount.baG);
    b.a(paramParcel, 6, paramGoogleSignInAccount.baH, paramInt);
    b.u(paramParcel, i);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/google/android/gms/signin/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */