package com.tencent.mm.plugin.game.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class GameWebViewLaunchParams
  implements Parcelable
{
  public static final Parcelable.Creator<GameWebViewLaunchParams> CREATOR = new GameWebViewLaunchParams.1();
  public GameFloatLayerInfo jOv;
  
  public GameWebViewLaunchParams() {}
  
  private GameWebViewLaunchParams(Parcel paramParcel)
  {
    this.jOv = ((GameFloatLayerInfo)paramParcel.readParcelable(GameFloatLayerInfo.class.getClassLoader()));
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeParcelable(this.jOv, paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/game/model/GameWebViewLaunchParams.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */