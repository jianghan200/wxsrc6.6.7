package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public final class s
  implements Parcelable.Creator<Asset>
{
  static void a(Asset paramAsset, Parcel paramParcel, int paramInt)
  {
    int i = b.t(paramParcel, 20293);
    b.c(paramParcel, 1, paramAsset.mVersionCode);
    b.a(paramParcel, 2, paramAsset.bdf);
    b.a(paramParcel, 3, paramAsset.bdg);
    b.a(paramParcel, 4, paramAsset.bdh, paramInt);
    b.a(paramParcel, 5, paramAsset.uri, paramInt);
    b.u(paramParcel, i);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/google/android/gms/wearable/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */