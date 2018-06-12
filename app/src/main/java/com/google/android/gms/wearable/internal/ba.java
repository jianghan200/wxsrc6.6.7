package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public final class ba
  implements Parcelable.Creator<ChannelEventParcelable>
{
  static void a(ChannelEventParcelable paramChannelEventParcelable, Parcel paramParcel, int paramInt)
  {
    int i = b.t(paramParcel, 20293);
    b.c(paramParcel, 1, paramChannelEventParcelable.mVersionCode);
    b.a(paramParcel, 2, paramChannelEventParcelable.bej, paramInt);
    b.c(paramParcel, 3, paramChannelEventParcelable.type);
    b.c(paramParcel, 4, paramChannelEventParcelable.bek);
    b.c(paramParcel, 5, paramChannelEventParcelable.bel);
    b.u(paramParcel, i);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/google/android/gms/wearable/internal/ba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */