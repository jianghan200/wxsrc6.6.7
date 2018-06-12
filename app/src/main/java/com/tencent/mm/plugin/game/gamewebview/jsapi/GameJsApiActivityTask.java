package com.tencent.mm.plugin.game.gamewebview.jsapi;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.mm.plugin.game.gamewebview.ipc.GameProcessActivityTask;
import com.tencent.mm.plugin.game.gamewebview.ipc.GameProcessActivityTask.a;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Map;

public class GameJsApiActivityTask
  extends GameProcessActivityTask
{
  public static final Parcelable.Creator<GameJsApiActivityTask> CREATOR = new Parcelable.Creator() {};
  public int fFd;
  public String fII;
  public d jGq;
  public String jGt;
  public String jGu;
  
  public GameJsApiActivityTask(Context paramContext)
  {
    super(paramContext);
  }
  
  private GameJsApiActivityTask(Parcel paramParcel)
  {
    g(paramParcel);
  }
  
  public final void a(Context paramContext, GameProcessActivityTask.a parama)
  {
    x.i("MicroMsg.GameJsApiActivityTask", "runInMainProcess, apiName = %s", new Object[] { this.jGt });
    Object localObject = e.aSw();
    if (localObject != null)
    {
      localObject = (c)((Map)localObject).get(this.jGt);
      if (!(localObject instanceof f)) {
        ((a)localObject).a(paramContext, this.fII, new GameJsApiActivityTask.1(this, parama));
      }
    }
  }
  
  public final void aaj()
  {
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
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/jsapi/GameJsApiActivityTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */