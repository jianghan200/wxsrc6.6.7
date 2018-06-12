package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public final class a
  implements Parcelable.Creator<ConnectionEvent>
{
  static void a(ConnectionEvent paramConnectionEvent, Parcel paramParcel)
  {
    int i = b.t(paramParcel, 20293);
    b.c(paramParcel, 1, paramConnectionEvent.mVersionCode);
    b.a(paramParcel, 2, paramConnectionEvent.aPo);
    b.a(paramParcel, 4, paramConnectionEvent.aPq);
    b.a(paramParcel, 5, paramConnectionEvent.aPr);
    b.a(paramParcel, 6, paramConnectionEvent.aPs);
    b.a(paramParcel, 7, paramConnectionEvent.aPt);
    b.a(paramParcel, 8, paramConnectionEvent.aPu);
    b.a(paramParcel, 10, paramConnectionEvent.aPw);
    b.a(paramParcel, 11, paramConnectionEvent.aPx);
    b.c(paramParcel, 12, paramConnectionEvent.aPp);
    b.a(paramParcel, 13, paramConnectionEvent.aPv);
    b.u(paramParcel, i);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/google/android/gms/common/stats/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */