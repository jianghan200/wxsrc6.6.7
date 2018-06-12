package com.tencent.mm.plugin.wallet_core.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.bi;

public class Authen
  implements Parcelable
{
  public static final Parcelable.Creator<Authen> CREATOR = new Authen.1();
  public int bWA;
  public String country;
  public String csD;
  public String csK;
  public String csL;
  public String dRH;
  public String eXM;
  public String knG;
  public String lMV;
  public String lMW;
  public PayInfo mpb = new PayInfo();
  public String pcx;
  public String pjw;
  public int plh = 0;
  public String pli;
  public String plj;
  public String plk;
  public int pll;
  public String plm;
  public String pln;
  public String plo;
  public String plp;
  public String plq;
  public String plr;
  public String pls;
  public String plt;
  public String plu;
  public String plv;
  public String plw;
  public String plx;
  public String ply;
  public String plz;
  public String token;
  
  public Authen() {}
  
  public Authen(Parcel paramParcel)
  {
    this.bWA = paramParcel.readInt();
    this.pli = paramParcel.readString();
    this.lMV = paramParcel.readString();
    this.lMW = paramParcel.readString();
    this.plj = paramParcel.readString();
    this.plk = paramParcel.readString();
    this.pll = paramParcel.readInt();
    this.pjw = paramParcel.readString();
    this.plm = paramParcel.readString();
    this.pln = paramParcel.readString();
    this.plo = paramParcel.readString();
    this.token = paramParcel.readString();
    this.plr = paramParcel.readString();
    this.pls = paramParcel.readString();
    this.country = paramParcel.readString();
    this.csK = paramParcel.readString();
    this.csL = paramParcel.readString();
    this.dRH = paramParcel.readString();
    this.knG = paramParcel.readString();
    this.eXM = paramParcel.readString();
    this.csD = paramParcel.readString();
    this.pcx = paramParcel.readString();
    this.plt = paramParcel.readString();
    this.plu = paramParcel.readString();
    this.plq = paramParcel.readString();
    this.plv = paramParcel.readString();
    this.plw = paramParcel.readString();
    this.plx = paramParcel.readString();
    this.ply = paramParcel.readString();
    this.plz = paramParcel.readString();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.bWA);
    paramParcel.writeString(bi.aG(this.pli, ""));
    paramParcel.writeString(bi.aG(this.lMV, ""));
    paramParcel.writeString(bi.aG(this.lMW, ""));
    paramParcel.writeString(bi.aG(this.plj, ""));
    paramParcel.writeString(bi.aG(this.plk, ""));
    paramParcel.writeInt(this.pll);
    paramParcel.writeString(bi.aG(this.pjw, ""));
    paramParcel.writeString(bi.aG(this.plm, ""));
    paramParcel.writeString(bi.aG(this.pln, ""));
    paramParcel.writeString(bi.aG(this.plo, ""));
    paramParcel.writeString(bi.aG(this.token, ""));
    paramParcel.writeString(bi.aG(this.plr, ""));
    paramParcel.writeString(bi.aG(this.pls, ""));
    paramParcel.writeString(bi.aG(this.country, ""));
    paramParcel.writeString(bi.aG(this.csK, ""));
    paramParcel.writeString(bi.aG(this.csL, ""));
    paramParcel.writeString(bi.aG(this.dRH, ""));
    paramParcel.writeString(bi.aG(this.knG, ""));
    paramParcel.writeString(bi.aG(this.eXM, ""));
    paramParcel.writeString(bi.aG(this.csD, ""));
    paramParcel.writeString(bi.aG(this.pcx, ""));
    paramParcel.writeString(bi.aG(this.plt, ""));
    paramParcel.writeString(bi.aG(this.plu, ""));
    paramParcel.writeString(bi.aG(this.plq, ""));
    paramParcel.writeString(bi.aG(this.plv, ""));
    paramParcel.writeString(bi.aG(this.plw, ""));
    paramParcel.writeString(bi.aG(this.plx, ""));
    paramParcel.writeString(bi.aG(this.ply, ""));
    paramParcel.writeString(bi.aG(this.plz, ""));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/model/Authen.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */