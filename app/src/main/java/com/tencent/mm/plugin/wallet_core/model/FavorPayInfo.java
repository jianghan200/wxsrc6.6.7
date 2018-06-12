package com.tencent.mm.plugin.wallet_core.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class FavorPayInfo
  implements Parcelable
{
  public static final Parcelable.Creator<FavorPayInfo> CREATOR = new FavorPayInfo.1();
  public String pnP;
  public int pnQ;
  public String pnR;
  public String pnS;
  public String pnT;
  public List<String> pnU = new LinkedList();
  
  public FavorPayInfo() {}
  
  public FavorPayInfo(Parcel paramParcel)
  {
    this.pnP = paramParcel.readString();
    this.pnQ = paramParcel.readInt();
    this.pnR = paramParcel.readString();
    this.pnS = paramParcel.readString();
    this.pnT = paramParcel.readString();
    this.pnU = paramParcel.createStringArrayList();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String toString()
  {
    StringBuffer localStringBuffer = new StringBuffer(String.format("FavorPayInfo %s isNeedBankPay %s needBankType %s defaultFavorCompId %s changeBankcardTips %s", new Object[] { this.pnP, Integer.valueOf(this.pnQ), this.pnR, this.pnS, this.pnT }));
    if (this.pnU != null)
    {
      localStringBuffer.append("bind_serial_list :");
      Iterator localIterator = this.pnU.iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        localStringBuffer.append(str + ",");
      }
    }
    return localStringBuffer.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.pnP);
    paramParcel.writeInt(this.pnQ);
    paramParcel.writeString(this.pnR);
    paramParcel.writeString(this.pnS);
    paramParcel.writeString(this.pnT);
    paramParcel.writeStringList(this.pnU);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/model/FavorPayInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */