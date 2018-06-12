package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public final class t
  implements Parcelable.Creator<Status>
{
  static void a(Status paramStatus, Parcel paramParcel, int paramInt)
  {
    int i = b.t(paramParcel, 20293);
    b.c(paramParcel, 1, paramStatus.aJC);
    b.c(paramParcel, 1000, paramStatus.mVersionCode);
    b.a(paramParcel, 2, paramStatus.aKu);
    b.a(paramParcel, 3, paramStatus.aJD, paramInt);
    b.u(paramParcel, i);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/common/api/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */