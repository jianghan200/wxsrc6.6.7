package com.tencent.mm.ipcinvoker.type;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class IPCString
  implements Parcelable
{
  public static final Parcelable.Creator<IPCString> CREATOR = new IPCString.1();
  public String value;
  
  public IPCString() {}
  
  public IPCString(String paramString)
  {
    this.value = paramString;
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
      if (!(paramObject instanceof IPCString)) {
        break;
      }
      paramObject = (IPCString)paramObject;
    } while ((this.value == ((IPCString)paramObject).value) || ((this.value != null) && (this.value.equals(((IPCString)paramObject).value))));
    return false;
    if ((paramObject instanceof String)) {
      return paramObject.equals(this.value);
    }
    return false;
  }
  
  public String toString()
  {
    return this.value;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.value);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ipcinvoker/type/IPCString.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */