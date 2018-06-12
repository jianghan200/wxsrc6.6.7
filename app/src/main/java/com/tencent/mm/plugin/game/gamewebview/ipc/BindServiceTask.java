package com.tencent.mm.plugin.game.gamewebview.ipc;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public class BindServiceTask
  extends GWMainProcessTask
{
  public static final Parcelable.Creator<BindServiceTask> CREATOR = new BindServiceTask.1();
  public Runnable fFC;
  
  public BindServiceTask() {}
  
  public BindServiceTask(byte paramByte) {}
  
  public final void aai()
  {
    ahH();
  }
  
  public final void aaj()
  {
    if (this.fFC != null) {
      this.fFC.run();
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public final void g(Parcel paramParcel) {}
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/ipc/BindServiceTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */