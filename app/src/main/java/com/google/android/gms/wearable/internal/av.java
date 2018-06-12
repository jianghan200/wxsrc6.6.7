package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public final class av
  implements Parcelable.Creator<AncsNotificationParcelable>
{
  static void a(AncsNotificationParcelable paramAncsNotificationParcelable, Parcel paramParcel)
  {
    int i = b.t(paramParcel, 20293);
    b.c(paramParcel, 1, paramAncsNotificationParcelable.mVersionCode);
    b.c(paramParcel, 2, paramAncsNotificationParcelable.mId);
    b.a(paramParcel, 3, paramAncsNotificationParcelable.aYu);
    b.a(paramParcel, 4, paramAncsNotificationParcelable.bdZ);
    b.a(paramParcel, 5, paramAncsNotificationParcelable.bea);
    b.a(paramParcel, 6, paramAncsNotificationParcelable.beb);
    b.a(paramParcel, 7, paramAncsNotificationParcelable.bec);
    if (paramAncsNotificationParcelable.baG == null) {}
    for (String str = paramAncsNotificationParcelable.aYu;; str = paramAncsNotificationParcelable.baG)
    {
      b.a(paramParcel, 8, str);
      b.a(paramParcel, 9, paramAncsNotificationParcelable.bed);
      b.a(paramParcel, 10, paramAncsNotificationParcelable.bee);
      b.a(paramParcel, 11, paramAncsNotificationParcelable.bef);
      b.a(paramParcel, 12, paramAncsNotificationParcelable.beg);
      b.u(paramParcel, i);
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/google/android/gms/wearable/internal/av.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */