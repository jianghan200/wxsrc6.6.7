package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public final class s
  implements Parcelable.Creator<Scope>
{
  static void a(Scope paramScope, Parcel paramParcel)
  {
    int i = b.t(paramParcel, 20293);
    b.c(paramParcel, 1, paramScope.mVersionCode);
    b.a(paramParcel, 2, paramScope.aKo);
    b.u(paramParcel, i);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/common/api/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */