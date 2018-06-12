package com.google.android.gms.playlog.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class b
  implements Parcelable.Creator<PlayLoggerContext>
{
  static void a(PlayLoggerContext paramPlayLoggerContext, Parcel paramParcel)
  {
    int i = com.google.android.gms.common.internal.safeparcel.b.t(paramParcel, 20293);
    com.google.android.gms.common.internal.safeparcel.b.c(paramParcel, 1, paramPlayLoggerContext.versionCode);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 2, paramPlayLoggerContext.packageName);
    com.google.android.gms.common.internal.safeparcel.b.c(paramParcel, 3, paramPlayLoggerContext.bax);
    com.google.android.gms.common.internal.safeparcel.b.c(paramParcel, 4, paramPlayLoggerContext.bay);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 5, paramPlayLoggerContext.baz);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 6, paramPlayLoggerContext.baA);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 7, paramPlayLoggerContext.baB);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 8, paramPlayLoggerContext.baC);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 9, paramPlayLoggerContext.baD);
    com.google.android.gms.common.internal.safeparcel.b.c(paramParcel, 10, paramPlayLoggerContext.baE);
    com.google.android.gms.common.internal.safeparcel.b.u(paramParcel, i);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/google/android/gms/playlog/internal/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */