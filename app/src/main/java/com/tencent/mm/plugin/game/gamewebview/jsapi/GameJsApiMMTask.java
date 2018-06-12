package com.tencent.mm.plugin.game.gamewebview.jsapi;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.mm.plugin.game.gamewebview.ipc.GWMainProcessTask;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import com.tencent.mm.sdk.platformtools.ad;
import java.util.Map;

public class GameJsApiMMTask
  extends GWMainProcessTask
{
  public static final Parcelable.Creator<GameJsApiMMTask> CREATOR = new GameJsApiMMTask.2();
  public int fFd;
  public String fII;
  public d jGq;
  public String jGt;
  public String jGu;
  
  public GameJsApiMMTask() {}
  
  private GameJsApiMMTask(Parcel paramParcel)
  {
    g(paramParcel);
  }
  
  public final void aai()
  {
    Object localObject = e.aSw();
    if (localObject != null)
    {
      localObject = (c)((Map)localObject).get(this.jGt);
      if (!(localObject instanceof f)) {
        ((a)localObject).a(ad.getContext(), this.fII, new GameJsApiMMTask.1(this));
      }
    }
  }
  
  public final void aaj()
  {
    ahB();
    if (this.jGq != null) {
      this.jGq.E(this.fFd, this.jGu);
    }
  }
  
  public final void g(Parcel paramParcel)
  {
    this.fII = paramParcel.readString();
    this.jGt = paramParcel.readString();
    this.jGu = paramParcel.readString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.fII);
    paramParcel.writeString(this.jGt);
    paramParcel.writeString(this.jGu);
  }
  
  public static abstract interface a
  {
    public abstract void tp(String paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/jsapi/GameJsApiMMTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */