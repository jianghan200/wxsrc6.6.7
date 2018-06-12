package com.google.android.gms.playlog.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public final class a
  implements Parcelable.Creator<LogEvent>
{
  static void a(LogEvent paramLogEvent, Parcel paramParcel)
  {
    int i = b.t(paramParcel, 20293);
    b.c(paramParcel, 1, paramLogEvent.versionCode);
    b.a(paramParcel, 2, paramLogEvent.bat);
    b.a(paramParcel, 3, paramLogEvent.tag);
    b.a(paramParcel, 4, paramLogEvent.bav);
    b.a(paramParcel, 5, paramLogEvent.baw);
    b.a(paramParcel, 6, paramLogEvent.bau);
    b.u(paramParcel, i);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/google/android/gms/playlog/internal/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */