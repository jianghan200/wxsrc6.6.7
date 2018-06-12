package com.tencent.mm.ipcinvoker.type;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class IPCBoolean
  implements Parcelable
{
  public static final Parcelable.Creator<IPCBoolean> CREATOR = new IPCBoolean.1();
  public boolean value;
  
  public IPCBoolean() {}
  
  public IPCBoolean(boolean paramBoolean)
  {
    this.value = paramBoolean;
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
      if (!(paramObject instanceof IPCBoolean)) {
        break;
      }
      paramObject = (IPCBoolean)paramObject;
    } while (this.value == ((IPCBoolean)paramObject).value);
    return false;
    if ((paramObject instanceof Boolean)) {
      return paramObject.equals(Boolean.valueOf(this.value));
    }
    return false;
  }
  
  public String toString()
  {
    return Boolean.toString(this.value);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (this.value) {}
    for (paramInt = 1;; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/ipcinvoker/type/IPCBoolean.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */