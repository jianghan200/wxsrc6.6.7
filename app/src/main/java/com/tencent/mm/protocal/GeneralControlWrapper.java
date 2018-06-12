package com.tencent.mm.protocal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.mm.protocal.c.yl;
import com.tencent.mm.sdk.platformtools.x;

public class GeneralControlWrapper
  implements Parcelable
{
  public static final Parcelable.Creator<GeneralControlWrapper> CREATOR = new Parcelable.Creator() {};
  public static final GeneralControlWrapper qVX = new GeneralControlWrapper(10);
  public static final GeneralControlWrapper qVY = new GeneralControlWrapper(1);
  public int qVZ;
  
  public GeneralControlWrapper(int paramInt)
  {
    this.qVZ = paramInt;
    x.d("MicroMsg.GeneralControlWrapper", "edw <init>, " + this);
  }
  
  private GeneralControlWrapper(Parcel paramParcel)
  {
    this.qVZ = paramParcel.readInt();
  }
  
  public GeneralControlWrapper(yl paramyl)
  {
    this.qVZ = paramyl.rEl;
    x.d("MicroMsg.GeneralControlWrapper", "edw <init>, " + this);
  }
  
  public final boolean cgf()
  {
    if ((this.qVZ & 0x2000) != 0) {}
    for (boolean bool = true;; bool = false)
    {
      x.d("MicroMsg.GeneralControlWrapper", "allowOuterOpenUrl, ret = " + bool);
      return bool;
    }
  }
  
  public final boolean cgg()
  {
    if ((this.qVZ & 0x2) > 0) {}
    for (boolean bool = true;; bool = false)
    {
      x.d("MicroMsg.GeneralControlWrapper", "allowInnerOpenUrl, ret = " + bool);
      return bool;
    }
  }
  
  public final boolean cgh()
  {
    if ((this.qVZ & 0x40) > 0) {}
    for (boolean bool = true;; bool = false)
    {
      x.d("MicroMsg.GeneralControlWrapper", "allowScanQRCode, ret = " + bool);
      return bool;
    }
  }
  
  public final boolean cgi()
  {
    if ((this.qVZ & 0x800) > 0) {}
    for (boolean bool = true;; bool = false)
    {
      x.d("MicroMsg.GeneralControlWrapper", "allowReportPageEvent, ret = " + bool);
      return bool;
    }
  }
  
  public final boolean cgj()
  {
    if ((this.qVZ & 0x4000) > 0) {}
    for (boolean bool = true;; bool = false)
    {
      x.d("MicroMsg.GeneralControlWrapper", "allowReportPageEvent, ret = " + bool);
      return bool;
    }
  }
  
  public final boolean cgk()
  {
    if ((this.qVZ & 0x8000) > 0) {}
    for (boolean bool = true;; bool = false)
    {
      x.d("MicroMsg.GeneralControlWrapper", "allowFavImage, ret = " + bool);
      return bool;
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("[bitset=0x");
    localStringBuilder.append(Integer.toHexString(this.qVZ));
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.qVZ);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/GeneralControlWrapper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */