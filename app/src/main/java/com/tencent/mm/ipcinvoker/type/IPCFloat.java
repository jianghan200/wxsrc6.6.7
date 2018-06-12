package com.tencent.mm.ipcinvoker.type;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class IPCFloat
  implements Parcelable
{
  public static final Parcelable.Creator<IPCFloat> CREATOR = new IPCFloat.1();
  public float value;
  
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
      if (!(paramObject instanceof IPCFloat)) {
        break;
      }
      paramObject = (IPCFloat)paramObject;
    } while (this.value == ((IPCFloat)paramObject).value);
    return false;
    if ((paramObject instanceof Float)) {
      return paramObject.equals(Float.valueOf(this.value));
    }
    return false;
  }
  
  public String toString()
  {
    return Float.toString(this.value);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeFloat(this.value);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/ipcinvoker/type/IPCFloat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */