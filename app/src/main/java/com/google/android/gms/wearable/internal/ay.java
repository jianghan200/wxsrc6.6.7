package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public final class ay
  implements Parcelable.Creator<CapabilityInfoParcelable>
{
  static void a(CapabilityInfoParcelable paramCapabilityInfoParcelable, Parcel paramParcel)
  {
    int i = b.t(paramParcel, 20293);
    b.c(paramParcel, 1, paramCapabilityInfoParcelable.mVersionCode);
    b.a(paramParcel, 2, paramCapabilityInfoParcelable.mName);
    b.b(paramParcel, 3, paramCapabilityInfoParcelable.beh);
    b.u(paramParcel, i);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/google/android/gms/wearable/internal/ay.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */