package com.tencent.mm.plugin.cdndownloader.ipc;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class CDNTaskState
  implements Parcelable
{
  public static final Parcelable.Creator<CDNTaskState> CREATOR = new Parcelable.Creator() {};
  public int completeSize = 0;
  public int fileTotalSize = 0;
  public int taskState = -100;
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.taskState);
    paramParcel.writeInt(this.completeSize);
    paramParcel.writeInt(this.fileTotalSize);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/cdndownloader/ipc/CDNTaskState.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */