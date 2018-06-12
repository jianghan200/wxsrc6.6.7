package com.google.android.exoplayer2.source.dash.manifest;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class RepresentationKey
  implements Parcelable, Comparable<RepresentationKey>
{
  public static final Parcelable.Creator<RepresentationKey> CREATOR = new RepresentationKey.1();
  public final int arU;
  public final int asR;
  public final int asS;
  
  public RepresentationKey(int paramInt1, int paramInt2, int paramInt3)
  {
    this.arU = paramInt1;
    this.asR = paramInt2;
    this.asS = paramInt3;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final String toString()
  {
    return this.arU + "." + this.asR + "." + this.asS;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.arU);
    paramParcel.writeInt(this.asR);
    paramParcel.writeInt(this.asS);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/google/android/exoplayer2/source/dash/manifest/RepresentationKey.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */