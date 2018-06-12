package com.google.android.gms.auth.api.proxy;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ProxyRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator<ProxyRequest> CREATOR = new b();
  public static final int aJe = 0;
  public static final int aJf = 1;
  public static final int aJg = 2;
  public static final int aJh = 3;
  public static final int aJi = 4;
  public static final int aJj = 5;
  public static final int aJk = 6;
  public static final int aJl = 7;
  public static final int aJm = 7;
  public final long aJd;
  public final int aJn;
  Bundle aJo;
  public final byte[] body;
  public final String url;
  final int versionCode;
  
  ProxyRequest(int paramInt1, String paramString, int paramInt2, long paramLong, byte[] paramArrayOfByte, Bundle paramBundle)
  {
    this.versionCode = paramInt1;
    this.url = paramString;
    this.aJn = paramInt2;
    this.aJd = paramLong;
    this.body = paramArrayOfByte;
    this.aJo = paramBundle;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String toString()
  {
    return "ProxyRequest[ url: " + this.url + ", method: " + this.aJn + " ]";
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    b.a(this, paramParcel);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/google/android/gms/auth/api/proxy/ProxyRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */