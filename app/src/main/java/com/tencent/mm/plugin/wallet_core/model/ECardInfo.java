package com.tencent.mm.plugin.wallet_core.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;

public class ECardInfo
  implements Parcelable
{
  public static final Parcelable.Creator<ECardInfo> CREATOR = new Parcelable.Creator() {};
  public String bJV;
  public String ceh;
  public int pmY;
  public int pmZ;
  public int pna;
  public String pnb;
  public String pnc;
  public String pnd;
  public int pne;
  public ArrayList<String> pnf = new ArrayList();
  public String png;
  public String pnh;
  public String pni;
  public String pnj;
  public String title;
  
  public ECardInfo() {}
  
  public ECardInfo(Parcel paramParcel)
  {
    this.pmY = paramParcel.readInt();
    this.bJV = paramParcel.readString();
    this.pmZ = paramParcel.readInt();
    this.pna = paramParcel.readInt();
    this.pnb = paramParcel.readString();
    this.pnc = paramParcel.readString();
    this.pnd = paramParcel.readString();
    this.pne = paramParcel.readInt();
    this.title = paramParcel.readString();
    paramParcel.readStringList(this.pnf);
    this.png = paramParcel.readString();
    this.pnh = paramParcel.readString();
    this.pni = paramParcel.readString();
    this.pnj = paramParcel.readString();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.pmY);
    paramParcel.writeString(this.bJV);
    paramParcel.writeInt(this.pmZ);
    paramParcel.writeInt(this.pna);
    paramParcel.writeString(this.pnb);
    paramParcel.writeString(this.pnc);
    paramParcel.writeString(this.pnd);
    paramParcel.writeInt(this.pne);
    paramParcel.writeString(this.title);
    paramParcel.writeStringList(this.pnf);
    paramParcel.writeString(this.png);
    paramParcel.writeString(this.pnh);
    paramParcel.writeString(this.pni);
    paramParcel.writeString(this.pnj);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/model/ECardInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */