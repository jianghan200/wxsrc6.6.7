package com.tencent.mm.plugin.webview.ui.tools.game;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class GameSettingParams
  implements Parcelable
{
  public static final Parcelable.Creator<GameSettingParams> CREATOR = new GameSettingParams.1();
  public String bQE;
  public String bQF;
  
  public GameSettingParams() {}
  
  private GameSettingParams(Parcel paramParcel)
  {
    this.bQE = paramParcel.readString();
    this.bQF = paramParcel.readString();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.bQE);
    paramParcel.writeString(this.bQF);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/webview/ui/tools/game/GameSettingParams.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */