package com.tencent.mm.plugin.wallet_core.model.mall;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;

public class MallFunction
  implements Parcelable
{
  public static final Parcelable.Creator<MallFunction> CREATOR = new Parcelable.Creator() {};
  public String cbR;
  public String ceR;
  public String kYQ;
  public String kYR;
  public String kck;
  public String moy;
  public String prS;
  public ArrayList<String> prT;
  public MallNews prU;
  public String prV;
  public int prW = 0;
  public int type;
  
  public MallFunction() {}
  
  public MallFunction(Parcel paramParcel)
  {
    this.moy = paramParcel.readString();
    this.cbR = paramParcel.readString();
    this.prS = paramParcel.readString();
    this.kYQ = paramParcel.readString();
    this.kYR = paramParcel.readString();
    this.ceR = paramParcel.readString();
    this.kck = paramParcel.readString();
    this.prT = new ArrayList();
    paramParcel.readStringList(this.prT);
    this.prU = ((MallNews)paramParcel.readParcelable(MallNews.class.getClassLoader()));
    this.type = paramParcel.readInt();
    this.prV = paramParcel.readString();
    this.prW = paramParcel.readInt();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.moy);
    paramParcel.writeString(this.cbR);
    paramParcel.writeString(this.prS);
    paramParcel.writeString(this.kYQ);
    paramParcel.writeString(this.kYR);
    paramParcel.writeString(this.ceR);
    paramParcel.writeString(this.kck);
    paramParcel.writeStringList(this.prT);
    paramParcel.writeParcelable(this.prU, paramInt);
    paramParcel.writeInt(this.type);
    paramParcel.writeString(this.prV);
    paramParcel.writeInt(this.prW);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/model/mall/MallFunction.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */