package com.tencent.mm.pluginsdk.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class PayInfo
  implements Parcelable
{
  public static final Parcelable.Creator<PayInfo> CREATOR = new Parcelable.Creator() {};
  public String Yy;
  public String appId;
  public String bKk;
  public String bOd;
  public int bPZ;
  public String bQb;
  public String bQc;
  public String bVE = "";
  public int bVU;
  public int bVY = 0;
  public int bVZ = -1;
  public String cdL;
  public String fMk;
  public String fky;
  public String hvl;
  public boolean jNf = false;
  public int myh = 0;
  public String pCO;
  public String partnerId;
  public int pxN = 0;
  public int pxO = 0;
  public int qUI = 0;
  public boolean qUJ = true;
  public String qUK;
  public Bundle qUL;
  public int qUM;
  public long qUN = 0L;
  public int qUO = -1;
  public String qUP;
  public String qUQ;
  public int qUR = 1;
  public double qUS = 0.0D;
  
  public PayInfo() {}
  
  public PayInfo(Parcel paramParcel)
  {
    this.bVY = paramParcel.readInt();
    this.qUI = paramParcel.readInt();
    this.bOd = paramParcel.readString();
    this.fMk = paramParcel.readString();
    this.appId = paramParcel.readString();
    this.pCO = paramParcel.readString();
    this.partnerId = paramParcel.readString();
    this.cdL = paramParcel.readString();
    this.bKk = paramParcel.readString();
    this.Yy = paramParcel.readString();
    this.bVU = paramParcel.readInt();
    this.bVZ = paramParcel.readInt();
    if (paramParcel.readInt() == 1)
    {
      bool1 = true;
      this.jNf = bool1;
      if (paramParcel.readInt() != 1) {
        break label316;
      }
    }
    label316:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      this.qUJ = bool1;
      this.qUL = paramParcel.readBundle();
      this.pxN = paramParcel.readInt();
      this.bQb = paramParcel.readString();
      this.bQc = paramParcel.readString();
      this.bPZ = paramParcel.readInt();
      this.qUN = paramParcel.readLong();
      this.bVE = paramParcel.readString();
      this.qUP = paramParcel.readString();
      this.qUQ = paramParcel.readString();
      this.qUR = paramParcel.readInt();
      this.hvl = paramParcel.readString();
      this.fky = paramParcel.readString();
      this.myh = paramParcel.readInt();
      this.qUS = paramParcel.readDouble();
      return;
      bool1 = false;
      break;
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String toString()
  {
    return String.format("sense : %d, reqKey : %s, uuid : %s, appId : %s, appSource : %s, partnerId : %s, paySign : %s, productId : %s, soterAuth: %s", new Object[] { Integer.valueOf(this.bVY), this.bOd, this.fMk, this.appId, this.pCO, this.partnerId, this.cdL, this.bKk, this.bVE });
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    paramParcel.writeInt(this.bVY);
    paramParcel.writeInt(this.qUI);
    paramParcel.writeString(this.bOd);
    paramParcel.writeString(this.fMk);
    paramParcel.writeString(this.appId);
    paramParcel.writeString(this.pCO);
    paramParcel.writeString(this.partnerId);
    paramParcel.writeString(this.cdL);
    paramParcel.writeString(this.bKk);
    paramParcel.writeString(this.Yy);
    paramParcel.writeInt(this.bVU);
    paramParcel.writeInt(this.bVZ);
    if (this.jNf)
    {
      paramInt = 1;
      paramParcel.writeInt(paramInt);
      if (!this.qUJ) {
        break label244;
      }
    }
    label244:
    for (paramInt = i;; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      paramParcel.writeBundle(this.qUL);
      paramParcel.writeInt(this.pxN);
      paramParcel.writeString(this.bQb);
      paramParcel.writeString(this.bQc);
      paramParcel.writeInt(this.bPZ);
      paramParcel.writeLong(this.qUN);
      paramParcel.writeString(this.bVE);
      paramParcel.writeString(this.qUP);
      paramParcel.writeString(this.qUQ);
      paramParcel.writeInt(this.qUR);
      paramParcel.writeString(this.hvl);
      paramParcel.writeString(this.fky);
      paramParcel.writeInt(this.myh);
      paramParcel.writeDouble(this.qUS);
      return;
      paramInt = 0;
      break;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/pluginsdk/wallet/PayInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */