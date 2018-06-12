package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.i.j;

public final class PrivateCommand
  extends SpliceCommand
{
  public static final Parcelable.Creator<PrivateCommand> CREATOR = new PrivateCommand.1();
  public final long aqW;
  public final long aqX;
  public final byte[] aqY;
  
  private PrivateCommand(long paramLong1, byte[] paramArrayOfByte, long paramLong2)
  {
    this.aqW = paramLong2;
    this.aqX = paramLong1;
    this.aqY = paramArrayOfByte;
  }
  
  private PrivateCommand(Parcel paramParcel)
  {
    this.aqW = paramParcel.readLong();
    this.aqX = paramParcel.readLong();
    this.aqY = new byte[paramParcel.readInt()];
    paramParcel.readByteArray(this.aqY);
  }
  
  static PrivateCommand a(j paramj, int paramInt, long paramLong)
  {
    long l = paramj.ba();
    byte[] arrayOfByte = new byte[paramInt - 4];
    paramj.readBytes(arrayOfByte, 0, arrayOfByte.length);
    return new PrivateCommand(l, arrayOfByte, paramLong);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeLong(this.aqW);
    paramParcel.writeLong(this.aqX);
    paramParcel.writeInt(this.aqY.length);
    paramParcel.writeByteArray(this.aqY);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/google/android/exoplayer2/metadata/scte35/PrivateCommand.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */