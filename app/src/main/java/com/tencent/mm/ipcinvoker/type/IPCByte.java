package com.tencent.mm.ipcinvoker.type;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class IPCByte
  implements Parcelable
{
  public static final Parcelable.Creator<IPCByte> CREATOR = new IPCByte.1();
  public byte value;
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    do
    {
      return true;
      if (!(paramObject instanceof IPCByte)) {
        break;
      }
      paramObject = (IPCByte)paramObject;
    } while (this.value == ((IPCByte)paramObject).value);
    return false;
    if ((paramObject instanceof Byte)) {
      return paramObject.equals(Byte.valueOf(this.value));
    }
    return false;
  }
  
  public String toString()
  {
    return Integer.toString(this.value);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeByte(this.value);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/ipcinvoker/type/IPCByte.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */