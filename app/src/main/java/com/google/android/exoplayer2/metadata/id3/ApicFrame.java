package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.i.t;
import java.util.Arrays;

public final class ApicFrame
  extends Id3Frame
{
  public static final Parcelable.Creator<ApicFrame> CREATOR = new ApicFrame.1();
  public final int aqE;
  public final byte[] aqF;
  public final String description;
  public final String mimeType;
  
  ApicFrame(Parcel paramParcel)
  {
    super("APIC");
    this.mimeType = paramParcel.readString();
    this.description = paramParcel.readString();
    this.aqE = paramParcel.readInt();
    this.aqF = paramParcel.createByteArray();
  }
  
  public ApicFrame(String paramString1, String paramString2, int paramInt, byte[] paramArrayOfByte)
  {
    super("APIC");
    this.mimeType = paramString1;
    this.description = paramString2;
    this.aqE = paramInt;
    this.aqF = paramArrayOfByte;
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
      paramObject = (ApicFrame)paramObject;
    } while ((this.aqE == ((ApicFrame)paramObject).aqE) && (t.i(this.mimeType, ((ApicFrame)paramObject).mimeType)) && (t.i(this.description, ((ApicFrame)paramObject).description)) && (Arrays.equals(this.aqF, ((ApicFrame)paramObject).aqF)));
    return false;
  }
  
  public final int hashCode()
  {
    int j = 0;
    int k = this.aqE;
    if (this.mimeType != null) {}
    for (int i = this.mimeType.hashCode();; i = 0)
    {
      if (this.description != null) {
        j = this.description.hashCode();
      }
      return ((i + (k + 527) * 31) * 31 + j) * 31 + Arrays.hashCode(this.aqF);
    }
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.mimeType);
    paramParcel.writeString(this.description);
    paramParcel.writeInt(this.aqE);
    paramParcel.writeByteArray(this.aqF);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/google/android/exoplayer2/metadata/id3/ApicFrame.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */