package com.tencent.mm.plugin.game.gamewebview.ipc;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.mm.plugin.base.model.d;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public class AddShortcutTask
  extends GWMainProcessTask
{
  public static final Parcelable.Creator<AddShortcutTask> CREATOR = new AddShortcutTask.2();
  public String appId;
  public Runnable fFC;
  public boolean success;
  public String username;
  
  public AddShortcutTask() {}
  
  private AddShortcutTask(Parcel paramParcel)
  {
    g(paramParcel);
  }
  
  public final void aai()
  {
    if ((bi.oW(this.appId)) || (bi.oW(this.username)))
    {
      x.e("MicroMsg.AddShortcutTask", "appid or username is null");
      this.success = false;
      return;
    }
    d.a(ad.getContext(), this.username, this.appId, new AddShortcutTask.1(this));
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
  
  public final void g(Parcel paramParcel)
  {
    boolean bool = true;
    this.username = paramParcel.readString();
    this.appId = paramParcel.readString();
    if (paramParcel.readByte() == 1) {}
    for (;;)
    {
      this.success = bool;
      return;
      bool = false;
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.username);
    paramParcel.writeString(this.appId);
    if (this.success) {}
    for (paramInt = 1;; paramInt = 0)
    {
      paramParcel.writeByte((byte)paramInt);
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/ipc/AddShortcutTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */