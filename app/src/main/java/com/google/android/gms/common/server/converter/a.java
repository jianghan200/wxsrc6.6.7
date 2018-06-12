package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public final class a
  implements Parcelable.Creator<ConverterWrapper>
{
  static void a(ConverterWrapper paramConverterWrapper, Parcel paramParcel, int paramInt)
  {
    int i = b.t(paramParcel, 20293);
    b.c(paramParcel, 1, paramConverterWrapper.mVersionCode);
    b.a(paramParcel, 2, paramConverterWrapper.aOP, paramInt);
    b.u(paramParcel, i);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/google/android/gms/common/server/converter/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */