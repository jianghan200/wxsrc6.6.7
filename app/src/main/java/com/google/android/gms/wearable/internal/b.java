package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class b
  implements Parcelable.Creator<DataItemAssetParcelable>
{
  static void a(DataItemAssetParcelable paramDataItemAssetParcelable, Parcel paramParcel)
  {
    int i = com.google.android.gms.common.internal.safeparcel.b.t(paramParcel, 20293);
    com.google.android.gms.common.internal.safeparcel.b.c(paramParcel, 1, paramDataItemAssetParcelable.mVersionCode);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 2, paramDataItemAssetParcelable.aEN);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 3, paramDataItemAssetParcelable.aXv);
    com.google.android.gms.common.internal.safeparcel.b.u(paramParcel, i);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/google/android/gms/wearable/internal/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */