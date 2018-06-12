package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public final class g
  implements Parcelable.Creator<RecordConsentRequest>
{
  static void a(RecordConsentRequest paramRecordConsentRequest, Parcel paramParcel, int paramInt)
  {
    int i = b.t(paramParcel, 20293);
    b.c(paramParcel, 1, paramRecordConsentRequest.mVersionCode);
    b.a(paramParcel, 2, paramRecordConsentRequest.aIy, paramInt);
    b.a(paramParcel, 3, paramRecordConsentRequest.baK, paramInt);
    b.a(paramParcel, 4, paramRecordConsentRequest.aJw);
    b.u(paramParcel, i);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/google/android/gms/signin/internal/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */