package com.google.android.gms.common.images;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class b
  implements Parcelable.Creator<WebImage>
{
  static void a(WebImage paramWebImage, Parcel paramParcel, int paramInt)
  {
    int i = com.google.android.gms.common.internal.safeparcel.b.t(paramParcel, 20293);
    com.google.android.gms.common.internal.safeparcel.b.c(paramParcel, 1, paramWebImage.mVersionCode);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 2, paramWebImage.aMO, paramInt);
    com.google.android.gms.common.internal.safeparcel.b.c(paramParcel, 3, paramWebImage.aMP);
    com.google.android.gms.common.internal.safeparcel.b.c(paramParcel, 4, paramWebImage.aMQ);
    com.google.android.gms.common.internal.safeparcel.b.u(paramParcel, i);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/google/android/gms/common/images/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */