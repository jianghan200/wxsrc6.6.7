package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.i.t;
import java.util.Arrays;

public final class GeobFrame
  extends Id3Frame
{
  public static final Parcelable.Creator<GeobFrame> CREATOR = new Parcelable.Creator() {};
  public final byte[] data;
  public final String description;
  public final String filename;
  public final String mimeType;
  
  GeobFrame(Parcel paramParcel)
  {
    super("GEOB");
    this.mimeType = paramParcel.readString();
    this.filename = paramParcel.readString();
    this.description = paramParcel.readString();
    this.data = paramParcel.createByteArray();
  }
  
  public GeobFrame(String paramString1, String paramString2, String paramString3, byte[] paramArrayOfByte)
  {
    super("GEOB");
    this.mimeType = paramString1;
    this.filename = paramString2;
    this.description = paramString3;
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
      paramObject = (GeobFrame)paramObject;
    } while ((t.i(this.mimeType, ((GeobFrame)paramObject).mimeType)) && (t.i(this.filename, ((GeobFrame)paramObject).filename)) && (t.i(this.description, ((GeobFrame)paramObject).description)) && (Arrays.equals(this.data, ((GeobFrame)paramObject).data)));
    return false;
  }
  
  public final int hashCode()
  {
    int k = 0;
    int i;
    if (this.mimeType != null)
    {
      i = this.mimeType.hashCode();
      if (this.filename == null) {
        break label79;
      }
    }
    label79:
    for (int j = this.filename.hashCode();; j = 0)
    {
      if (this.description != null) {
        k = this.description.hashCode();
      }
      return ((j + (i + 527) * 31) * 31 + k) * 31 + Arrays.hashCode(this.data);
      i = 0;
      break;
    }
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.mimeType);
    paramParcel.writeString(this.filename);
    paramParcel.writeString(this.description);
    paramParcel.writeByteArray(this.data);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/google/android/exoplayer2/metadata/id3/GeobFrame.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */