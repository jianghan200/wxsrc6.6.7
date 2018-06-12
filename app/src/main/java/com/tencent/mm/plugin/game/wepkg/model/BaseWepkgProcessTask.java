package com.tencent.mm.plugin.game.wepkg.model;

import android.os.Parcel;
import com.tencent.mm.plugin.game.wepkg.ipc.WepkgMainProcessTask;

public abstract class BaseWepkgProcessTask
  extends WepkgMainProcessTask
{
  public boolean bGZ = false;
  
  public final void g(Parcel paramParcel)
  {
    if (paramParcel.readByte() != 0) {}
    for (boolean bool = true;; bool = false)
    {
      this.bGZ = bool;
      k(paramParcel);
      return;
    }
  }
  
  public abstract void k(Parcel paramParcel);
  
  public abstract void v(Parcel paramParcel, int paramInt);
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (this.bGZ) {}
    for (int i = 1;; i = 0)
    {
      paramParcel.writeByte((byte)i);
      v(paramParcel, paramInt);
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/wepkg/model/BaseWepkgProcessTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */