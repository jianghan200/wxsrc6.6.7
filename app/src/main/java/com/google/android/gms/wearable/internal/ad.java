package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public final class ad
  implements Parcelable.Creator<NodeParcelable>
{
  static void a(NodeParcelable paramNodeParcelable, Parcel paramParcel)
  {
    int i = b.t(paramParcel, 20293);
    b.c(paramParcel, 1, paramNodeParcelable.mVersionCode);
    b.a(paramParcel, 2, paramNodeParcelable.aEN);
    b.a(paramParcel, 3, paramNodeParcelable.baG);
    b.c(paramParcel, 4, paramNodeParcelable.beG);
    b.a(paramParcel, 5, paramNodeParcelable.beH);
    b.u(paramParcel, i);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/google/android/gms/wearable/internal/ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */