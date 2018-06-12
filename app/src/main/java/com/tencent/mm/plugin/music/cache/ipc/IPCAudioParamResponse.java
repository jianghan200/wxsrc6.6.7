package com.tencent.mm.plugin.music.cache.ipc;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.mm.an.f;

public class IPCAudioParamResponse
  implements Parcelable
{
  public static final Parcelable.Creator<IPCAudioParamResponse> CREATOR = new Parcelable.Creator() {};
  public String fileName;
  public byte[] lxI;
  public String lxJ;
  public int lxK;
  public String lxx;
  public String musicUrl;
  
  public IPCAudioParamResponse() {}
  
  public IPCAudioParamResponse(Parcel paramParcel)
  {
    this.lxx = paramParcel.readString();
    this.musicUrl = paramParcel.readString();
    this.fileName = paramParcel.readString();
    this.lxJ = paramParcel.readString();
    this.lxK = paramParcel.readInt();
    int i = paramParcel.readInt();
    if (i > 0)
    {
      this.lxI = new byte[i];
      paramParcel.readByteArray(this.lxI);
    }
  }
  
  public IPCAudioParamResponse(f paramf)
  {
    this.lxx = paramf.field_musicId;
    this.musicUrl = paramf.field_musicUrl;
    this.fileName = paramf.field_fileName;
    this.lxK = paramf.field_fileCacheComplete;
    this.lxJ = paramf.field_pieceFileMIMEType;
    this.lxI = paramf.field_indexBitData;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.lxx);
    paramParcel.writeString(this.musicUrl);
    paramParcel.writeString(this.fileName);
    paramParcel.writeString(this.lxJ);
    paramParcel.writeInt(this.lxK);
    if (this.lxI != null)
    {
      paramParcel.writeInt(this.lxI.length);
      paramParcel.writeByteArray(this.lxI);
      return;
    }
    paramParcel.writeInt(0);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/music/cache/ipc/IPCAudioParamResponse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */