package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.i.t;
import java.util.Arrays;

public final class PrivFrame
  extends Id3Frame
{
  public static final Parcelable.Creator<PrivFrame> CREATOR = new PrivFrame.1();
  public final String aqU;
  public final byte[] aqV;
  
  PrivFrame(Parcel paramParcel)
  {
    super("PRIV");
    this.aqU = paramParcel.readString();
    this.aqV = paramParcel.createByteArray();
  }
  
  public PrivFrame(String paramString, byte[] paramArrayOfByte)
  {
    super("PRIV");
    this.aqU = paramString;
    this.aqV = paramArrayOfByte;
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
      paramObject = (PrivFrame)paramObject;
    } while ((t.i(this.aqU, ((PrivFrame)paramObject).aqU)) && (Arrays.equals(this.aqV, ((PrivFrame)paramObject).aqV)));
    return false;
  }
  
  public final int hashCode()
  {
    if (this.aqU != null) {}
    for (int i = this.aqU.hashCode();; i = 0) {
      return (i + 527) * 31 + Arrays.hashCode(this.aqV);
    }
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.aqU);
    paramParcel.writeByteArray(this.aqV);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/google/android/exoplayer2/metadata/id3/PrivFrame.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */