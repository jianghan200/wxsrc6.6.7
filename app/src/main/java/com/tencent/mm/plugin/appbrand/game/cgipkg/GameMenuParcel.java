package com.tencent.mm.plugin.appbrand.game.cgipkg;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.mm.protocal.c.adz;

public class GameMenuParcel
  implements Parcelable
{
  public static final Parcelable.Creator<GameMenuParcel> CREATOR = new GameMenuParcel.1();
  public String appId;
  public adz fAA;
  
  public GameMenuParcel() {}
  
  private GameMenuParcel(Parcel paramParcel)
  {
    this.appId = paramParcel.readString();
    this.fAA = ((adz)com.tencent.mm.ipcinvoker.extension.c.a(com.tencent.mm.ipcinvoker.wx_extension.c.class.getName(), paramParcel));
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.appId);
    com.tencent.mm.ipcinvoker.extension.c.a(this.fAA, paramParcel);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/game/cgipkg/GameMenuParcel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */