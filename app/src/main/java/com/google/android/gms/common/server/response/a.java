package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.server.converter.ConverterWrapper;

public final class a
  implements Parcelable.Creator<FastJsonResponse.Field>
{
  static void a(FastJsonResponse.Field paramField, Parcel paramParcel, int paramInt)
  {
    int i = b.t(paramParcel, 20293);
    b.c(paramParcel, 1, paramField.mVersionCode);
    b.c(paramParcel, 2, paramField.pu());
    b.a(paramParcel, 3, paramField.pv());
    b.c(paramParcel, 4, paramField.pw());
    b.a(paramParcel, 5, paramField.px());
    b.a(paramParcel, 6, paramField.py());
    b.c(paramParcel, 7, paramField.pz());
    b.a(paramParcel, 8, paramField.pB());
    if (paramField.aPe == null) {}
    for (paramField = null;; paramField = ConverterWrapper.a(paramField.aPe))
    {
      b.a(paramParcel, 9, paramField, paramInt);
      b.u(paramParcel, i);
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/google/android/gms/common/server/response/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */