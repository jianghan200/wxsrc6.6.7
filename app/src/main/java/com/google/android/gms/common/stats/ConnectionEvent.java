package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class ConnectionEvent
  implements SafeParcelable
{
  public static final Parcelable.Creator<ConnectionEvent> CREATOR = new a();
  final long aPo;
  int aPp;
  final String aPq;
  final String aPr;
  final String aPs;
  final String aPt;
  final String aPu;
  final String aPv;
  final long aPw;
  final long aPx;
  private long aPy;
  final int mVersionCode;
  
  ConnectionEvent(int paramInt1, long paramLong1, int paramInt2, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, long paramLong2, long paramLong3)
  {
    this.mVersionCode = paramInt1;
    this.aPo = paramLong1;
    this.aPp = paramInt2;
    this.aPq = paramString1;
    this.aPr = paramString2;
    this.aPs = paramString3;
    this.aPt = paramString4;
    this.aPy = -1L;
    this.aPu = paramString5;
    this.aPv = paramString6;
    this.aPw = paramLong2;
    this.aPx = paramLong3;
  }
  
  public ConnectionEvent(long paramLong1, int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, long paramLong2, long paramLong3)
  {
    this(1, paramLong1, paramInt, paramString1, paramString2, paramString3, paramString4, paramString5, paramString6, paramLong2, paramLong3);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    a.a(this, paramParcel);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/google/android/gms/common/stats/ConnectionEvent.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */