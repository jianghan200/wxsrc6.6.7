package com.tencent.mm.ipcinvoker.type;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class IPCInteger
  implements Parcelable
{
  public static final Parcelable.Creator<IPCInteger> CREATOR = new IPCInteger.1();
  public int value;
  
  public IPCInteger() {}
  
  public IPCInteger(int paramInt)
  {
    this.value = paramInt;
  }
  
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
      if (!(paramObject instanceof IPCInteger)) {
        break;
      }
      paramObject = (IPCInteger)paramObject;
    } while (this.value == ((IPCInteger)paramObject).value);
    return false;
    if ((paramObject instanceof Integer)) {
      return paramObject.equals(Integer.valueOf(this.value));
    }
    return false;
  }
  
  public String toString()
  {
    return Integer.toString(this.value);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.value);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/ipcinvoker/type/IPCInteger.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */