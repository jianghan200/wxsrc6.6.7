package com.tencent.mm.plugin.cdndownloader.ipc;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class CDNTaskInfo
  implements Parcelable
{
  public static final Parcelable.Creator<CDNTaskInfo> CREATOR = new CDNTaskInfo.1();
  public boolean dQc;
  public String downloadUrl;
  public String filePath;
  public String hKj;
  public String hKk;
  public int hKl;
  public int hKm;
  public boolean hKn;
  public boolean hKo;
  public boolean hKp;
  public String mediaId;
  
  public CDNTaskInfo() {}
  
  private CDNTaskInfo(Parcel paramParcel)
  {
    if (paramParcel.readByte() == 1)
    {
      bool1 = true;
      this.dQc = bool1;
      this.downloadUrl = paramParcel.readString();
      this.mediaId = paramParcel.readString();
      this.filePath = paramParcel.readString();
      this.hKj = paramParcel.readString();
      this.hKk = paramParcel.readString();
      this.hKl = paramParcel.readInt();
      this.hKm = paramParcel.readInt();
      if (paramParcel.readByte() != 1) {
        break label113;
      }
      bool1 = true;
      label87:
      this.hKn = bool1;
      if (paramParcel.readByte() != 1) {
        break label118;
      }
    }
    label113:
    label118:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      this.hKp = bool1;
      return;
      bool1 = false;
      break;
      bool1 = false;
      break label87;
    }
  }
  
  public CDNTaskInfo(String paramString)
  {
    this.downloadUrl = paramString;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return (paramObject == this) || ((paramObject != null) && ((paramObject instanceof CDNTaskInfo)) && (((CDNTaskInfo)paramObject).downloadUrl.equals(this.downloadUrl)));
  }
  
  public int hashCode()
  {
    return this.downloadUrl.hashCode();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    byte b2 = 1;
    if (this.dQc)
    {
      b1 = 1;
      paramParcel.writeByte(b1);
      paramParcel.writeString(this.downloadUrl);
      paramParcel.writeString(this.mediaId);
      paramParcel.writeString(this.filePath);
      paramParcel.writeString(this.hKj);
      paramParcel.writeString(this.hKk);
      paramParcel.writeInt(this.hKl);
      paramParcel.writeInt(this.hKm);
      if (!this.hKn) {
        break label108;
      }
      b1 = 1;
      label82:
      paramParcel.writeByte(b1);
      if (!this.hKp) {
        break label113;
      }
    }
    label108:
    label113:
    for (byte b1 = b2;; b1 = 0)
    {
      paramParcel.writeByte(b1);
      return;
      b1 = 0;
      break;
      b1 = 0;
      break label82;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/cdndownloader/ipc/CDNTaskInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */