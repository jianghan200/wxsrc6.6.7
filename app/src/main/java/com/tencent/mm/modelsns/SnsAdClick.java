package com.tencent.mm.modelsns;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.mm.g.a.ng;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.bi;

public class SnsAdClick
  implements Parcelable
{
  public static final Parcelable.Creator<SnsAdClick> CREATOR = new SnsAdClick.1();
  public String egF = "";
  public long egG = 0L;
  public String egH = "";
  public String egI = "";
  public int egJ = 0;
  public long egK = 0L;
  public int egL = 0;
  public int egM = 0;
  public int egN = 0;
  public long egO = 0L;
  public long egP = 0L;
  public int scene = 0;
  
  public SnsAdClick() {}
  
  public SnsAdClick(String paramString1, int paramInt1, long paramLong, String paramString2, int paramInt2)
  {
    this.egF = paramString1;
    this.scene = paramInt1;
    this.egG = paramLong;
    this.egH = paramString2;
    this.egL = paramInt2;
    this.egM = 1;
    this.egK = System.currentTimeMillis();
  }
  
  public SnsAdClick(String paramString1, int paramInt1, long paramLong, String paramString2, int paramInt2, byte paramByte)
  {
    this.egF = paramString1;
    this.scene = paramInt1;
    this.egG = paramLong;
    this.egH = paramString2;
    this.egL = paramInt2;
    this.egM = 0;
    this.egK = System.currentTimeMillis();
  }
  
  public SnsAdClick(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    this.egF = "";
    this.scene = 7;
    this.egI = paramString1;
    this.egH = paramString2;
    this.egL = paramInt1;
    this.egM = 0;
    this.egN = paramInt2;
    this.egK = System.currentTimeMillis();
  }
  
  public final void Ry()
  {
    if (this.egO <= 0L) {
      return;
    }
    this.egP += bi.bI(this.egO);
    this.egO = 0L;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public final void in(int paramInt)
  {
    Ry();
    ng localng = new ng();
    this.egJ = paramInt;
    localng.bYk.bYl = this;
    a.sFg.m(localng);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.egF);
    paramParcel.writeInt(this.scene);
    paramParcel.writeInt(this.egJ);
    paramParcel.writeLong(this.egG);
    paramParcel.writeString(bi.aG(this.egH, ""));
    paramParcel.writeLong(this.egK);
    paramParcel.writeInt(this.egM);
    paramParcel.writeInt(this.egL);
    paramParcel.writeInt(this.egN);
    paramParcel.writeString(this.egI);
    paramParcel.writeLong(this.egP);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/modelsns/SnsAdClick.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */