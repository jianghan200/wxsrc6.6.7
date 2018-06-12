package com.tencent.mm.plugin.remittance.bankcard.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.mm.protocal.c.ua;

public class EnterTimeParcel
  implements Parcelable
{
  public static final Parcelable.Creator<EnterTimeParcel> CREATOR = new EnterTimeParcel.1();
  public String dxh;
  public int mun;
  public String muo;
  public String mup;
  public int muq;
  
  public EnterTimeParcel() {}
  
  public EnterTimeParcel(Parcel paramParcel)
  {
    this.mun = paramParcel.readInt();
    this.muo = paramParcel.readString();
    this.mup = paramParcel.readString();
    this.muq = paramParcel.readInt();
    this.dxh = paramParcel.readString();
  }
  
  public EnterTimeParcel(ua paramua)
  {
    this.mun = paramua.mun;
    this.muo = paramua.muo;
    this.mup = paramua.mup;
    this.muq = paramua.muq;
    this.dxh = paramua.dxh;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.mun);
    paramParcel.writeString(this.muo);
    paramParcel.writeString(this.mup);
    paramParcel.writeInt(this.muq);
    paramParcel.writeString(this.dxh);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/remittance/bankcard/model/EnterTimeParcel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */