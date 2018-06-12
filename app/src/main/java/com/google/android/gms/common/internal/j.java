package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public final class j
  implements Parcelable.Creator<GetServiceRequest>
{
  static void a(GetServiceRequest paramGetServiceRequest, Parcel paramParcel, int paramInt)
  {
    int i = b.t(paramParcel, 20293);
    b.c(paramParcel, 1, paramGetServiceRequest.version);
    b.c(paramParcel, 2, paramGetServiceRequest.aNc);
    b.c(paramParcel, 3, paramGetServiceRequest.aNd);
    b.a(paramParcel, 4, paramGetServiceRequest.aNe);
    b.a(paramParcel, 5, paramGetServiceRequest.aNf);
    b.a(paramParcel, 6, paramGetServiceRequest.aNg, paramInt);
    b.a(paramParcel, 7, paramGetServiceRequest.aNh);
    b.a(paramParcel, 8, paramGetServiceRequest.aNi, paramInt);
    b.u(paramParcel, i);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/google/android/gms/common/internal/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */