package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public final class f
  implements Parcelable.Creator<AccountChangeEventsRequest>
{
  static void a(AccountChangeEventsRequest paramAccountChangeEventsRequest, Parcel paramParcel, int paramInt)
  {
    int i = b.t(paramParcel, 20293);
    b.c(paramParcel, 1, paramAccountChangeEventsRequest.aIs);
    b.c(paramParcel, 2, paramAccountChangeEventsRequest.aIw);
    b.a(paramParcel, 3, paramAccountChangeEventsRequest.aIu);
    b.a(paramParcel, 4, paramAccountChangeEventsRequest.aIy, paramInt);
    b.u(paramParcel, i);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/google/android/gms/auth/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */