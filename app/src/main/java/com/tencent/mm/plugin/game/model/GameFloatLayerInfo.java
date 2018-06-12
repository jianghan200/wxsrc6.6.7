package com.tencent.mm.plugin.game.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class GameFloatLayerInfo
  implements Parcelable
{
  public static final Parcelable.Creator<GameFloatLayerInfo> CREATOR = new GameFloatLayerInfo.1();
  public boolean jMc;
  public int orientation;
  public String url;
  
  public GameFloatLayerInfo() {}
  
  private GameFloatLayerInfo(Parcel paramParcel)
  {
    this.url = paramParcel.readString();
    if (paramParcel.readInt() == 1) {}
    for (;;)
    {
      this.jMc = bool;
      this.orientation = paramParcel.readInt();
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
    paramParcel.writeString(this.url);
    if (this.jMc) {}
    for (paramInt = 1;; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      paramParcel.writeInt(this.orientation);
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/game/model/GameFloatLayerInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */