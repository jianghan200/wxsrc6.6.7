package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

public final class BinaryFrame
  extends Id3Frame
{
  public static final Parcelable.Creator<BinaryFrame> CREATOR = new BinaryFrame.1();
  public final byte[] data;
  
  BinaryFrame(Parcel paramParcel)
  {
    super(paramParcel.readString());
    this.data = paramParcel.createByteArray();
  }
  
  public BinaryFrame(String paramString, byte[] paramArrayOfByte)
  {
    super(paramString);
    this.data = paramArrayOfByte;
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
      paramObject = (BinaryFrame)paramObject;
    } while ((this.id.equals(((BinaryFrame)paramObject).id)) && (Arrays.equals(this.data, ((BinaryFrame)paramObject).data)));
    return false;
  }
  
  public final int hashCode()
  {
    return (this.id.hashCode() + 527) * 31 + Arrays.hashCode(this.data);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.id);
    paramParcel.writeByteArray(this.data);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/google/android/exoplayer2/metadata/id3/BinaryFrame.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */