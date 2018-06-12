package com.tencent.mm.plugin.honey_pay.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.mm.protocal.c.alq;
import com.tencent.mm.sdk.platformtools.x;
import java.io.IOException;

public class HoneyPayCardType
  implements Parcelable
{
  public static final Parcelable.Creator<HoneyPayCardType> CREATOR = new HoneyPayCardType.1();
  public byte[] lR;
  
  protected HoneyPayCardType(Parcel paramParcel)
  {
    this.lR = new byte[paramParcel.readInt()];
    paramParcel.readByteArray(this.lR);
  }
  
  public HoneyPayCardType(alq paramalq)
  {
    try
    {
      this.lR = paramalq.toByteArray();
      return;
    }
    catch (IOException paramalq)
    {
      x.printErrStackTrace("MicroMsg.HoneyPayCardType", paramalq, "", new Object[0]);
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.lR.length);
    paramParcel.writeByteArray(this.lR);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/honey_pay/model/HoneyPayCardType.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */