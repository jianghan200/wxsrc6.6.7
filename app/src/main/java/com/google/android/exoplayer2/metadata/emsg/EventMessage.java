package com.google.android.exoplayer2.metadata.emsg;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.i.t;
import com.google.android.exoplayer2.metadata.Metadata.Entry;
import java.util.Arrays;

public final class EventMessage
  implements Metadata.Entry
{
  public static final Parcelable.Creator<EventMessage> CREATOR = new EventMessage.1();
  private int aeo;
  public final String aqB;
  public final long aqC;
  public final byte[] aqD;
  public final long id;
  public final String value;
  
  EventMessage(Parcel paramParcel)
  {
    this.aqB = paramParcel.readString();
    this.value = paramParcel.readString();
    this.aqC = paramParcel.readLong();
    this.id = paramParcel.readLong();
    this.aqD = paramParcel.createByteArray();
  }
  
  public EventMessage(String paramString1, String paramString2, long paramLong1, long paramLong2, byte[] paramArrayOfByte)
  {
    this.aqB = paramString1;
    this.value = paramString2;
    this.aqC = paramLong1;
    this.id = paramLong2;
    this.aqD = paramArrayOfByte;
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
      paramObject = (EventMessage)paramObject;
    } while ((this.aqC == ((EventMessage)paramObject).aqC) && (this.id == ((EventMessage)paramObject).id) && (t.i(this.aqB, ((EventMessage)paramObject).aqB)) && (t.i(this.value, ((EventMessage)paramObject).value)) && (Arrays.equals(this.aqD, ((EventMessage)paramObject).aqD)));
    return false;
  }
  
  public final int hashCode()
  {
    int j = 0;
    if (this.aeo == 0) {
      if (this.aqB == null) {
        break label103;
      }
    }
    label103:
    for (int i = this.aqB.hashCode();; i = 0)
    {
      if (this.value != null) {
        j = this.value.hashCode();
      }
      this.aeo = (((((i + 527) * 31 + j) * 31 + (int)(this.aqC ^ this.aqC >>> 32)) * 31 + (int)(this.id ^ this.id >>> 32)) * 31 + Arrays.hashCode(this.aqD));
      return this.aeo;
    }
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.aqB);
    paramParcel.writeString(this.value);
    paramParcel.writeLong(this.aqC);
    paramParcel.writeLong(this.id);
    paramParcel.writeByteArray(this.aqD);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/google/android/exoplayer2/metadata/emsg/EventMessage.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */