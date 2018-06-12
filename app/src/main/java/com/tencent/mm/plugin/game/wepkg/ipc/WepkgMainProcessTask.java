package com.tencent.mm.plugin.game.wepkg.ipc;

import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashSet;
import java.util.Set;

public abstract class WepkgMainProcessTask
  implements Parcelable
{
  private static final Set<Object> fEi = new HashSet();
  Messenger fEz;
  int mTaskId;
  
  public final void En()
  {
    if (this.fEz == null) {
      return;
    }
    Message localMessage = Message.obtain();
    localMessage.what = this.mTaskId;
    localMessage.setData(WepkgMainProcessService.c(this));
    try
    {
      this.fEz.send(localMessage);
      return;
    }
    catch (Exception localException)
    {
      x.e("MicroMsg.Wepkg.WepkgMainProcessTask", localException.getMessage());
    }
  }
  
  public abstract void aai();
  
  public void aaj() {}
  
  public final void ahA()
  {
    fEi.add(this);
  }
  
  public final void ahB()
  {
    fEi.remove(this);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void g(Parcel paramParcel) {}
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/wepkg/ipc/WepkgMainProcessTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */