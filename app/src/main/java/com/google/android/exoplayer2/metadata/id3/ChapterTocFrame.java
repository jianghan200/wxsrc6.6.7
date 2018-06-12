package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.i.t;
import java.util.Arrays;

public final class ChapterTocFrame
  extends Id3Frame
{
  public static final Parcelable.Creator<ChapterTocFrame> CREATOR = new Parcelable.Creator() {};
  private final Id3Frame[] aqL;
  public final String aqM;
  public final boolean aqN;
  public final boolean aqO;
  public final String[] aqP;
  
  ChapterTocFrame(Parcel paramParcel)
  {
    super("CTOC");
    this.aqM = paramParcel.readString();
    if (paramParcel.readByte() != 0)
    {
      bool1 = true;
      this.aqN = bool1;
      if (paramParcel.readByte() == 0) {
        break label109;
      }
    }
    label109:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      this.aqO = bool1;
      this.aqP = paramParcel.createStringArray();
      int j = paramParcel.readInt();
      this.aqL = new Id3Frame[j];
      while (i < j)
      {
        this.aqL[i] = ((Id3Frame)paramParcel.readParcelable(Id3Frame.class.getClassLoader()));
        i += 1;
      }
      bool1 = false;
      break;
    }
  }
  
  public ChapterTocFrame(String paramString, boolean paramBoolean1, boolean paramBoolean2, String[] paramArrayOfString, Id3Frame[] paramArrayOfId3Frame)
  {
    super("CTOC");
    this.aqM = paramString;
    this.aqN = paramBoolean1;
    this.aqO = paramBoolean2;
    this.aqP = paramArrayOfString;
    this.aqL = paramArrayOfId3Frame;
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
      paramObject = (ChapterTocFrame)paramObject;
    } while ((this.aqN == ((ChapterTocFrame)paramObject).aqN) && (this.aqO == ((ChapterTocFrame)paramObject).aqO) && (t.i(this.aqM, ((ChapterTocFrame)paramObject).aqM)) && (Arrays.equals(this.aqP, ((ChapterTocFrame)paramObject).aqP)) && (Arrays.equals(this.aqL, ((ChapterTocFrame)paramObject).aqL)));
    return false;
  }
  
  public final int hashCode()
  {
    int j = 1;
    int k = 0;
    int i;
    if (this.aqN)
    {
      i = 1;
      if (!this.aqO) {
        break label56;
      }
    }
    for (;;)
    {
      if (this.aqM != null) {
        k = this.aqM.hashCode();
      }
      return ((i + 527) * 31 + j) * 31 + k;
      i = 0;
      break;
      label56:
      j = 0;
    }
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    paramParcel.writeString(this.aqM);
    if (this.aqN)
    {
      paramInt = 1;
      paramParcel.writeByte((byte)paramInt);
      if (!this.aqO) {
        break label91;
      }
    }
    label91:
    for (paramInt = i;; paramInt = 0)
    {
      paramParcel.writeByte((byte)paramInt);
      paramParcel.writeStringArray(this.aqP);
      paramParcel.writeInt(this.aqL.length);
      paramInt = 0;
      while (paramInt < this.aqL.length)
      {
        paramParcel.writeParcelable(this.aqL[paramInt], 0);
        paramInt += 1;
      }
      paramInt = 0;
      break;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/google/android/exoplayer2/metadata/id3/ChapterTocFrame.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */