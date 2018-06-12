package com.tencent.mm.plugin.recharge.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class MallRechargeProduct
  implements Parcelable
{
  public static final Parcelable.Creator<MallRechargeProduct> CREATOR = new MallRechargeProduct.1();
  public String appId;
  public String bKk;
  public String ioy;
  public boolean isDefault;
  public float moA = 0.0F;
  public float moB = 0.0F;
  public boolean moC;
  public int moD;
  public int moE;
  public int moF;
  public final boolean moG;
  public boolean moH = true;
  public String moy;
  public String moz;
  
  public MallRechargeProduct(Parcel paramParcel)
  {
    this.moy = paramParcel.readString();
    this.appId = paramParcel.readString();
    this.bKk = paramParcel.readString();
    this.ioy = paramParcel.readString();
    this.moz = paramParcel.readString();
    this.moA = paramParcel.readFloat();
    this.moB = paramParcel.readFloat();
    if (paramParcel.readInt() == 1)
    {
      bool1 = true;
      this.moC = bool1;
      this.moD = paramParcel.readInt();
      this.moE = paramParcel.readInt();
      if (paramParcel.readInt() != 1) {
        break label152;
      }
      bool1 = true;
      label118:
      this.isDefault = bool1;
      if (paramParcel.readInt() != 1) {
        break label157;
      }
    }
    label152:
    label157:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      this.moG = bool1;
      this.moF = paramParcel.readInt();
      return;
      bool1 = false;
      break;
      bool1 = false;
      break label118;
    }
  }
  
  public MallRechargeProduct(boolean paramBoolean)
  {
    this.moG = paramBoolean;
  }
  
  public static void a(MallRechargeProduct paramMallRechargeProduct1, MallRechargeProduct paramMallRechargeProduct2)
  {
    paramMallRechargeProduct2.appId = paramMallRechargeProduct1.appId;
    paramMallRechargeProduct2.moy = paramMallRechargeProduct1.moy;
    paramMallRechargeProduct2.bKk = paramMallRechargeProduct1.bKk;
    paramMallRechargeProduct2.ioy = paramMallRechargeProduct1.ioy;
    paramMallRechargeProduct2.moz = paramMallRechargeProduct1.moz;
    paramMallRechargeProduct2.moA = paramMallRechargeProduct1.moA;
    paramMallRechargeProduct2.moB = paramMallRechargeProduct1.moB;
    paramMallRechargeProduct2.moC = paramMallRechargeProduct1.moC;
    paramMallRechargeProduct2.moD = paramMallRechargeProduct1.moD;
    paramMallRechargeProduct2.moE = paramMallRechargeProduct1.moE;
    paramMallRechargeProduct2.isDefault = paramMallRechargeProduct1.isDefault;
    paramMallRechargeProduct2.moH = paramMallRechargeProduct1.moH;
    paramMallRechargeProduct2.moF = paramMallRechargeProduct1.moF;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public final boolean isValid()
  {
    return (!this.moC) || (this.moD > 0);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    paramParcel.writeString(this.moy);
    paramParcel.writeString(this.appId);
    paramParcel.writeString(this.bKk);
    paramParcel.writeString(this.ioy);
    paramParcel.writeString(this.moz);
    paramParcel.writeFloat(this.moA);
    paramParcel.writeFloat(this.moB);
    if (this.moC)
    {
      paramInt = 1;
      paramParcel.writeInt(paramInt);
      paramParcel.writeInt(this.moD);
      paramParcel.writeInt(this.moE);
      if (!this.isDefault) {
        break label130;
      }
      paramInt = 1;
      label97:
      paramParcel.writeInt(paramInt);
      if (!this.moG) {
        break label135;
      }
    }
    label130:
    label135:
    for (paramInt = i;; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      paramParcel.writeInt(this.moF);
      return;
      paramInt = 0;
      break;
      paramInt = 0;
      break label97;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/recharge/model/MallRechargeProduct.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */