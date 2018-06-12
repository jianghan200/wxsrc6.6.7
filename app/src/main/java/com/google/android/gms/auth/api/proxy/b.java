package com.google.android.gms.auth.api.proxy;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class b
  implements Parcelable.Creator<ProxyRequest>
{
  static void a(ProxyRequest paramProxyRequest, Parcel paramParcel)
  {
    int i = com.google.android.gms.common.internal.safeparcel.b.t(paramParcel, 20293);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 1, paramProxyRequest.url);
    com.google.android.gms.common.internal.safeparcel.b.c(paramParcel, 1000, paramProxyRequest.versionCode);
    com.google.android.gms.common.internal.safeparcel.b.c(paramParcel, 2, paramProxyRequest.aJn);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 3, paramProxyRequest.aJd);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 4, paramProxyRequest.body);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 5, paramProxyRequest.aJo);
    com.google.android.gms.common.internal.safeparcel.b.u(paramParcel, i);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/google/android/gms/auth/api/proxy/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */