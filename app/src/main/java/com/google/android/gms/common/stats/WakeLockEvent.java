package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public final class WakeLockEvent
  implements SafeParcelable
{
  public static final Parcelable.Creator<WakeLockEvent> CREATOR = new g();
  final int aPA;
  final List<String> aPB;
  final String aPC;
  int aPD;
  final String aPE;
  final String aPF;
  final float aPG;
  final long aPo;
  int aPp;
  final long aPw;
  private long aPy;
  final String aPz;
  final int mVersionCode;
  
  WakeLockEvent(int paramInt1, long paramLong1, int paramInt2, String paramString1, int paramInt3, List<String> paramList, String paramString2, long paramLong2, int paramInt4, String paramString3, String paramString4, float paramFloat)
  {
    this.mVersionCode = paramInt1;
    this.aPo = paramLong1;
    this.aPp = paramInt2;
    this.aPz = paramString1;
    this.aPE = paramString3;
    this.aPA = paramInt3;
    this.aPy = -1L;
    this.aPB = paramList;
    this.aPC = paramString2;
    this.aPw = paramLong2;
    this.aPD = paramInt4;
    this.aPF = paramString4;
    this.aPG = paramFloat;
  }
  
  public WakeLockEvent(long paramLong1, int paramInt1, String paramString1, int paramInt2, List<String> paramList, String paramString2, long paramLong2, int paramInt3, String paramString3, String paramString4, float paramFloat)
  {
    this(1, paramLong1, paramInt1, paramString1, paramInt2, paramList, paramString2, paramLong2, paramInt3, paramString3, paramString4, paramFloat);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    g.a(this, paramParcel);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/google/android/gms/common/stats/WakeLockEvent.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */