package com.google.android.exoplayer2.video;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;

public final class ColorInfo
  implements Parcelable
{
  public static final Parcelable.Creator<ColorInfo> CREATOR = new Parcelable.Creator() {};
  public final int aCN;
  public final int aCO;
  public final int aCP;
  public final byte[] aCQ;
  private int aeo;
  
  ColorInfo(Parcel paramParcel)
  {
    this.aCN = paramParcel.readInt();
    this.aCO = paramParcel.readInt();
    this.aCP = paramParcel.readInt();
    int i;
    if (paramParcel.readInt() != 0)
    {
      i = 1;
      if (i == 0) {
        break label57;
      }
    }
    label57:
    for (paramParcel = paramParcel.createByteArray();; paramParcel = null)
    {
      this.aCQ = paramParcel;
      return;
      i = 0;
      break;
    }
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if ((paramObject == null) || (getClass() != paramObject.getClass())) {
        return false;
      }
      paramObject = (ColorInfo)paramObject;
    } while ((this.aCN == ((ColorInfo)paramObject).aCN) && (this.aCO == ((ColorInfo)paramObject).aCO) && (this.aCP == ((ColorInfo)paramObject).aCP) && (Arrays.equals(this.aCQ, ((ColorInfo)paramObject).aCQ)));
    return false;
  }
  
  public final int hashCode()
  {
    if (this.aeo == 0) {
      this.aeo = ((((this.aCN + 527) * 31 + this.aCO) * 31 + this.aCP) * 31 + Arrays.hashCode(this.aCQ));
    }
    return this.aeo;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("ColorInfo(").append(this.aCN).append(", ").append(this.aCO).append(", ").append(this.aCP).append(", ");
    if (this.aCQ != null) {}
    for (boolean bool = true;; bool = false) {
      return bool + ")";
    }
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.aCN);
    paramParcel.writeInt(this.aCO);
    paramParcel.writeInt(this.aCP);
    if (this.aCQ != null) {}
    for (paramInt = 1;; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      if (this.aCQ != null) {
        paramParcel.writeByteArray(this.aCQ);
      }
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/google/android/exoplayer2/video/ColorInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */