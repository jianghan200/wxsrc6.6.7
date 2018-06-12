package com.tencent.mm.ipcinvoker.wx_extension.service;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.mm.ab.b;
import com.tencent.mm.ipcinvoker.extension.c;
import com.tencent.mm.ipcinvoker.wx_extension.a;

public class IPCRunCgiRespWrapper
  implements Parcelable
{
  public static final Parcelable.Creator<IPCRunCgiRespWrapper> CREATOR = new IPCRunCgiRespWrapper.1();
  public String Yy;
  public b diG;
  public int errCode;
  public int errType;
  
  public IPCRunCgiRespWrapper() {}
  
  IPCRunCgiRespWrapper(Parcel paramParcel)
  {
    this.errType = paramParcel.readInt();
    this.errCode = paramParcel.readInt();
    this.Yy = paramParcel.readString();
    this.diG = ((b)c.a(a.class.getName(), paramParcel));
  }
  
  public static IPCRunCgiRespWrapper CF()
  {
    IPCRunCgiRespWrapper localIPCRunCgiRespWrapper = new IPCRunCgiRespWrapper();
    localIPCRunCgiRespWrapper.diG = null;
    localIPCRunCgiRespWrapper.Yy = null;
    localIPCRunCgiRespWrapper.errType = 3;
    localIPCRunCgiRespWrapper.errCode = -2;
    return localIPCRunCgiRespWrapper;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.errType);
    paramParcel.writeInt(this.errCode);
    paramParcel.writeString(this.Yy);
    c.a(this.diG, paramParcel);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ipcinvoker/wx_extension/service/IPCRunCgiRespWrapper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */