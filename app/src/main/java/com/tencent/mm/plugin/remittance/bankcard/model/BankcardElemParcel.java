package com.tencent.mm.plugin.remittance.bankcard.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.mm.protocal.c.fg;
import com.tencent.mm.protocal.c.ua;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class BankcardElemParcel
  implements Parcelable
{
  public static final Parcelable.Creator<BankcardElemParcel> CREATOR = new BankcardElemParcel.1();
  public String knE;
  public String lMV;
  public String mug;
  public int muh;
  public int mui;
  public String muj;
  public String muk;
  public String mul;
  public ArrayList<EnterTimeParcel> mum;
  
  public BankcardElemParcel() {}
  
  public BankcardElemParcel(Parcel paramParcel)
  {
    this.lMV = paramParcel.readString();
    this.knE = paramParcel.readString();
    this.mug = paramParcel.readString();
    this.muh = paramParcel.readInt();
    this.mui = paramParcel.readInt();
    this.mum = new ArrayList();
    paramParcel.readTypedList(this.mum, EnterTimeParcel.CREATOR);
    this.muj = paramParcel.readString();
    this.muk = paramParcel.readString();
    this.mul = paramParcel.readString();
  }
  
  public BankcardElemParcel(fg paramfg)
  {
    this.lMV = paramfg.lMV;
    this.knE = paramfg.knE;
    this.mug = paramfg.mug;
    this.muh = paramfg.muh;
    this.mui = paramfg.mui;
    this.muj = paramfg.muj;
    this.muk = paramfg.muk;
    this.mul = paramfg.mul;
    this.mum = new ArrayList();
    paramfg = paramfg.rgf.iterator();
    while (paramfg.hasNext())
    {
      EnterTimeParcel localEnterTimeParcel = new EnterTimeParcel((ua)paramfg.next());
      this.mum.add(localEnterTimeParcel);
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.lMV);
    paramParcel.writeString(this.knE);
    paramParcel.writeString(this.mug);
    paramParcel.writeInt(this.muh);
    paramParcel.writeInt(this.mui);
    paramParcel.writeTypedList(this.mum);
    paramParcel.writeString(this.muj);
    paramParcel.writeString(this.muk);
    paramParcel.writeString(this.mul);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/remittance/bankcard/model/BankcardElemParcel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */