package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.i.t;
import java.util.Arrays;

public final class ChapterFrame
  extends Id3Frame
{
  public static final Parcelable.Creator<ChapterFrame> CREATOR = new ChapterFrame.1();
  public final String aqG;
  public final int aqH;
  public final int aqI;
  public final long aqJ;
  public final long aqK;
  private final Id3Frame[] aqL;
  
  ChapterFrame(Parcel paramParcel)
  {
    super("CHAP");
    this.aqG = paramParcel.readString();
    this.aqH = paramParcel.readInt();
    this.aqI = paramParcel.readInt();
    this.aqJ = paramParcel.readLong();
    this.aqK = paramParcel.readLong();
    int j = paramParcel.readInt();
    this.aqL = new Id3Frame[j];
    int i = 0;
    while (i < j)
    {
      this.aqL[i] = ((Id3Frame)paramParcel.readParcelable(Id3Frame.class.getClassLoader()));
      i += 1;
    }
  }
  
  public ChapterFrame(String paramString, int paramInt1, int paramInt2, long paramLong1, long paramLong2, Id3Frame[] paramArrayOfId3Frame)
  {
    super("CHAP");
    this.aqG = paramString;
    this.aqH = paramInt1;
    this.aqI = paramInt2;
    this.aqJ = paramLong1;
    this.aqK = paramLong2;
    this.aqL = paramArrayOfId3Frame;
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
      paramObject = (ChapterFrame)paramObject;
    } while ((this.aqH == ((ChapterFrame)paramObject).aqH) && (this.aqI == ((ChapterFrame)paramObject).aqI) && (this.aqJ == ((ChapterFrame)paramObject).aqJ) && (this.aqK == ((ChapterFrame)paramObject).aqK) && (t.i(this.aqG, ((ChapterFrame)paramObject).aqG)) && (Arrays.equals(this.aqL, ((ChapterFrame)paramObject).aqL)));
    return false;
  }
  
  public final int hashCode()
  {
    int j = this.aqH;
    int k = this.aqI;
    int m = (int)this.aqJ;
    int n = (int)this.aqK;
    if (this.aqG != null) {}
    for (int i = this.aqG.hashCode();; i = 0) {
      return i + ((((j + 527) * 31 + k) * 31 + m) * 31 + n) * 31;
    }
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.aqG);
    paramParcel.writeInt(this.aqH);
    paramParcel.writeInt(this.aqI);
    paramParcel.writeLong(this.aqJ);
    paramParcel.writeLong(this.aqK);
    paramParcel.writeInt(this.aqL.length);
    Id3Frame[] arrayOfId3Frame = this.aqL;
    int i = arrayOfId3Frame.length;
    paramInt = 0;
    while (paramInt < i)
    {
      paramParcel.writeParcelable(arrayOfId3Frame[paramInt], 0);
      paramInt += 1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/google/android/exoplayer2/metadata/id3/ChapterFrame.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */