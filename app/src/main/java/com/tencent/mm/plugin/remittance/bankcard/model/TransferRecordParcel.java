package com.tencent.mm.plugin.remittance.bankcard.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.mm.protocal.c.bty;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TransferRecordParcel
  implements Parcelable
{
  public static final Parcelable.Creator<TransferRecordParcel> CREATOR = new TransferRecordParcel.1();
  public String knE;
  public String lMV;
  public String muA;
  public String muB;
  public String muC;
  public String muD;
  public String mug;
  
  public TransferRecordParcel() {}
  
  protected TransferRecordParcel(Parcel paramParcel)
  {
    this.muA = paramParcel.readString();
    this.muB = paramParcel.readString();
    this.mug = paramParcel.readString();
    this.knE = paramParcel.readString();
    this.lMV = paramParcel.readString();
    this.muC = paramParcel.readString();
    this.muD = paramParcel.readString();
  }
  
  private TransferRecordParcel(bty parambty)
  {
    this.muA = parambty.muA;
    this.muB = parambty.muB;
    this.mug = parambty.mug;
    this.knE = parambty.knE;
    this.lMV = parambty.lMV;
    this.muC = parambty.muC;
    this.muD = parambty.muD;
  }
  
  public static ArrayList<TransferRecordParcel> bT(List<bty> paramList)
  {
    if (paramList == null) {
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      localArrayList.add(new TransferRecordParcel((bty)paramList.next()));
    }
    return localArrayList;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.muA);
    paramParcel.writeString(this.muB);
    paramParcel.writeString(this.mug);
    paramParcel.writeString(this.knE);
    paramParcel.writeString(this.lMV);
    paramParcel.writeString(this.muC);
    paramParcel.writeString(this.muD);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/remittance/bankcard/model/TransferRecordParcel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */