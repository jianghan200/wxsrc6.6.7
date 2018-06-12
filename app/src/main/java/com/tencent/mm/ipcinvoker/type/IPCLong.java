package com.tencent.mm.ipcinvoker.type;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class IPCLong
  implements Parcelable
{
  public static final Parcelable.Creator<IPCLong> CREATOR = new IPCLong.1();
  public long value;
  
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
      if (!(paramObject instanceof IPCLong)) {
        break;
      }
      paramObject = (IPCLong)paramObject;
    } while (this.value == ((IPCLong)paramObject).value);
    return false;
    if ((paramObject instanceof Long)) {
      return paramObject.equals(Long.valueOf(this.value));
    }
    return false;
  }
  
  public String toString()
  {
    return Long.toString(this.value);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeLong(this.value);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/ipcinvoker/type/IPCLong.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */