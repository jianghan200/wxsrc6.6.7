package com.tencent.mm.plugin.game.gamewebview.ipc;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.mm.ba.a;
import com.tencent.mm.sdk.platformtools.x;

public class GameKeepPageTopTask
  extends GWMainProcessTask
{
  public static final Parcelable.Creator<GameKeepPageTopTask> CREATOR = new GameKeepPageTopTask.1();
  public boolean jGf;
  public String title;
  public int type;
  public String url;
  public String username;
  
  public GameKeepPageTopTask() {}
  
  private GameKeepPageTopTask(Parcel paramParcel)
  {
    g(paramParcel);
  }
  
  public final void aai()
  {
    x.i("MicroMsg.GameKeepPageTopTask", "type = " + this.type);
    switch (this.type)
    {
    default: 
      return;
    case 1: 
      locala = a.erR;
      this.jGf = a.Us();
      locala = a.erR;
      this.url = a.Ut();
      return;
    }
    a locala = a.erR;
    a.s(this.url, this.title, this.username);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public final void g(Parcel paramParcel)
  {
    boolean bool = true;
    this.type = paramParcel.readInt();
    if (paramParcel.readByte() == 1) {}
    for (;;)
    {
      this.jGf = bool;
      this.url = paramParcel.readString();
      this.title = paramParcel.readString();
      this.username = paramParcel.readString();
      return;
      bool = false;
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.type);
    if (this.jGf) {}
    for (paramInt = 1;; paramInt = 0)
    {
      paramParcel.writeByte((byte)paramInt);
      paramParcel.writeString(this.url);
      paramParcel.writeString(this.title);
      paramParcel.writeString(this.username);
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/ipc/GameKeepPageTopTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */