package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class b
  implements Parcelable.Creator<FieldMappingDictionary.FieldMapPair>
{
  static void a(FieldMappingDictionary.FieldMapPair paramFieldMapPair, Parcel paramParcel, int paramInt)
  {
    int i = com.google.android.gms.common.internal.safeparcel.b.t(paramParcel, 20293);
    com.google.android.gms.common.internal.safeparcel.b.c(paramParcel, 1, paramFieldMapPair.versionCode);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 2, paramFieldMapPair.aAL);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 3, paramFieldMapPair.aPj, paramInt);
    com.google.android.gms.common.internal.safeparcel.b.u(paramParcel, i);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/google/android/gms/common/server/response/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */