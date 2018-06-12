package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public final class d
  implements Parcelable.Creator<ValidateAccountRequest>
{
  static void a(ValidateAccountRequest paramValidateAccountRequest, Parcel paramParcel, int paramInt)
  {
    int i = b.t(paramParcel, 20293);
    b.c(paramParcel, 1, paramValidateAccountRequest.mVersionCode);
    b.c(paramParcel, 2, paramValidateAccountRequest.aNl);
    b.a(paramParcel, 3, paramValidateAccountRequest.aMV);
    b.a(paramParcel, 4, paramValidateAccountRequest.aMW, paramInt);
    b.a(paramParcel, 5, paramValidateAccountRequest.aNm);
    b.a(paramParcel, 6, paramValidateAccountRequest.aNn);
    b.u(paramParcel, i);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/google/android/gms/common/internal/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */