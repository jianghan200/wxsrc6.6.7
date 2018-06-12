package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.i.j;
import com.google.android.exoplayer2.i.q;

public final class TimeSignalCommand
  extends SpliceCommand
{
  public static final Parcelable.Creator<TimeSignalCommand> CREATOR = new Parcelable.Creator() {};
  public final long ars;
  public final long art;
  
  private TimeSignalCommand(long paramLong1, long paramLong2)
  {
    this.ars = paramLong1;
    this.art = paramLong2;
  }
  
  static long a(j paramj, long paramLong)
  {
    long l2 = paramj.readUnsignedByte();
    long l1 = -9223372036854775807L;
    if ((0x80 & l2) != 0L) {
      l1 = ((1L & l2) << 32 | paramj.ba()) + paramLong & 0x1FFFFFFFF;
    }
    return l1;
  }
  
  static TimeSignalCommand b(j paramj, long paramLong, q paramq)
  {
    paramLong = a(paramj, paramLong);
    return new TimeSignalCommand(paramLong, paramq.T(paramLong));
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeLong(this.ars);
    paramParcel.writeLong(this.art);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/google/android/exoplayer2/metadata/scte35/TimeSignalCommand.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */