package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public final class u
  implements Parcelable.Creator<ConnectionConfiguration>
{
  static void a(ConnectionConfiguration paramConnectionConfiguration, Parcel paramParcel)
  {
    int i = b.t(paramParcel, 20293);
    b.c(paramParcel, 1, paramConnectionConfiguration.mVersionCode);
    b.a(paramParcel, 2, paramConnectionConfiguration.mName);
    b.a(paramParcel, 3, paramConnectionConfiguration.bdi);
    b.c(paramParcel, 4, paramConnectionConfiguration.aMd);
    b.c(paramParcel, 5, paramConnectionConfiguration.bdj);
    b.a(paramParcel, 6, paramConnectionConfiguration.bdk);
    b.a(paramParcel, 7, paramConnectionConfiguration.aFp);
    b.a(paramParcel, 8, paramConnectionConfiguration.bdl);
    b.a(paramParcel, 9, paramConnectionConfiguration.bdm);
    b.a(paramParcel, 10, paramConnectionConfiguration.bdn);
    b.u(paramParcel, i);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/google/android/gms/wearable/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */