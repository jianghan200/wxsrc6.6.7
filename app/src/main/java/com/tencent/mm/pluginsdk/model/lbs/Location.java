package com.tencent.mm.pluginsdk.model.lbs;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.mm.sdk.platformtools.x;

public class Location
  implements Parcelable
{
  public static final Parcelable.Creator<Location> CREATOR = new Location.1();
  public int accuracy;
  public int bUi;
  public String bUk;
  public float dRS;
  public float dRT;
  public String mac;
  
  public Location() {}
  
  public Location(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2, String paramString1, String paramString2)
  {
    this.dRS = paramFloat1;
    this.dRT = paramFloat2;
    this.accuracy = paramInt1;
    this.bUi = paramInt2;
    this.mac = paramString1;
    this.bUk = paramString2;
  }
  
  public final boolean ccc()
  {
    if ((this.dRS == -85.0F) || (this.dRT == -1000.0F))
    {
      x.d("MicroMsg.Radar.Location", "mac and cellId is null");
      return true;
    }
    return false;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeFloat(this.dRS);
    paramParcel.writeFloat(this.dRT);
    paramParcel.writeInt(this.accuracy);
    paramParcel.writeInt(this.bUi);
    paramParcel.writeString(this.mac);
    paramParcel.writeString(this.bUk);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/pluginsdk/model/lbs/Location.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */