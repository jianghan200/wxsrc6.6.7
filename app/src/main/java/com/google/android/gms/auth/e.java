package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public final class e
  implements Parcelable.Creator<AccountChangeEvent>
{
  static void a(AccountChangeEvent paramAccountChangeEvent, Parcel paramParcel)
  {
    int i = b.t(paramParcel, 20293);
    b.c(paramParcel, 1, paramAccountChangeEvent.aIs);
    b.a(paramParcel, 2, paramAccountChangeEvent.aIt);
    b.a(paramParcel, 3, paramAccountChangeEvent.aIu);
    b.c(paramParcel, 4, paramAccountChangeEvent.aIv);
    b.c(paramParcel, 5, paramAccountChangeEvent.aIw);
    b.a(paramParcel, 6, paramAccountChangeEvent.aIx);
    b.u(paramParcel, i);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/google/android/gms/auth/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */