package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public final class g
  implements Parcelable.Creator<WakeLockEvent>
{
  static void a(WakeLockEvent paramWakeLockEvent, Parcel paramParcel)
  {
    int i = b.t(paramParcel, 20293);
    b.c(paramParcel, 1, paramWakeLockEvent.mVersionCode);
    b.a(paramParcel, 2, paramWakeLockEvent.aPo);
    b.a(paramParcel, 4, paramWakeLockEvent.aPz);
    b.c(paramParcel, 5, paramWakeLockEvent.aPA);
    b.a(paramParcel, 6, paramWakeLockEvent.aPB);
    b.a(paramParcel, 8, paramWakeLockEvent.aPw);
    b.a(paramParcel, 10, paramWakeLockEvent.aPE);
    b.c(paramParcel, 11, paramWakeLockEvent.aPp);
    b.a(paramParcel, 12, paramWakeLockEvent.aPC);
    b.a(paramParcel, 13, paramWakeLockEvent.aPF);
    b.c(paramParcel, 14, paramWakeLockEvent.aPD);
    float f = paramWakeLockEvent.aPG;
    b.b(paramParcel, 15, 4);
    paramParcel.writeFloat(f);
    b.u(paramParcel, i);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/google/android/gms/common/stats/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */