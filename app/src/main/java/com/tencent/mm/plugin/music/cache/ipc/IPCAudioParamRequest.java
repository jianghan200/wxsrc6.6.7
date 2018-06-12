package com.tencent.mm.plugin.music.cache.ipc;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class IPCAudioParamRequest
  implements Parcelable
{
  public static final Parcelable.Creator<IPCAudioParamRequest> CREATOR = new IPCAudioParamRequest.1();
  public int lxH = 0;
  public byte[] lxI;
  public String lxx = "";
  public String mimeType = "";
  
  public IPCAudioParamRequest() {}
  
  public IPCAudioParamRequest(Parcel paramParcel)
  {
    this.lxx = paramParcel.readString();
    this.lxH = paramParcel.readInt();
    this.mimeType = paramParcel.readString();
    int i = paramParcel.readInt();
    if (i > 0)
    {
      this.lxI = new byte[i];
      paramParcel.readByteArray(this.lxI);
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.lxx);
    paramParcel.writeInt(this.lxH);
    paramParcel.writeString(this.mimeType);
    if (this.lxI != null)
    {
      paramParcel.writeInt(this.lxI.length);
      paramParcel.writeByteArray(this.lxI);
      return;
    }
    paramParcel.writeInt(0);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/music/cache/ipc/IPCAudioParamRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */