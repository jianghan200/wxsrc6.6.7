package com.tencent.mm.plugin.downloader.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class FileDownloadTaskInfo
  implements Parcelable
{
  public static Parcelable.Creator<FileDownloadTaskInfo> CREATOR = new FileDownloadTaskInfo.1();
  public String appId = "";
  public String bKg = "";
  public int bPG = 2;
  public long gTK = 0L;
  public long icq = 0L;
  public boolean icr = false;
  public boolean ics = false;
  public long id = -1L;
  public String path = "";
  public int status = 0;
  public String url = "";
  
  public FileDownloadTaskInfo() {}
  
  private FileDownloadTaskInfo(Parcel paramParcel)
  {
    this.id = paramParcel.readLong();
    this.url = paramParcel.readString();
    this.status = paramParcel.readInt();
    this.path = paramParcel.readString();
    this.bKg = paramParcel.readString();
    this.appId = paramParcel.readString();
    this.icq = paramParcel.readLong();
    this.gTK = paramParcel.readLong();
    if (paramParcel.readByte() == 1) {}
    for (;;)
    {
      this.icr = bool;
      this.bPG = paramParcel.readInt();
      return;
      bool = false;
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeLong(this.id);
    paramParcel.writeString(this.url);
    paramParcel.writeInt(this.status);
    paramParcel.writeString(this.path);
    paramParcel.writeString(this.bKg);
    paramParcel.writeString(this.appId);
    paramParcel.writeLong(this.icq);
    paramParcel.writeLong(this.gTK);
    if (this.icr) {}
    for (paramInt = 1;; paramInt = 0)
    {
      paramParcel.writeByte((byte)paramInt);
      paramParcel.writeInt(this.bPG);
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/downloader/model/FileDownloadTaskInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */