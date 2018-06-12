package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public final class ae
  implements Parcelable.Creator<OpenChannelResponse>
{
  static void a(OpenChannelResponse paramOpenChannelResponse, Parcel paramParcel, int paramInt)
  {
    int i = b.t(paramParcel, 20293);
    b.c(paramParcel, 1, paramOpenChannelResponse.versionCode);
    b.c(paramParcel, 2, paramOpenChannelResponse.statusCode);
    b.a(paramParcel, 3, paramOpenChannelResponse.bej, paramInt);
    b.u(paramParcel, i);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/google/android/gms/wearable/internal/ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */