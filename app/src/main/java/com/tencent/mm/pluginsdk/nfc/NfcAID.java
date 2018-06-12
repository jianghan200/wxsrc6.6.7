package com.tencent.mm.pluginsdk.nfc;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class NfcAID
  implements Parcelable
{
  public static final Parcelable.Creator<NfcAID> CREATOR = new NfcAID.1();
  public String mURL = null;
  public String qBe = null;
  
  public NfcAID(Parcel paramParcel)
  {
    this.qBe = paramParcel.readString();
    this.mURL = paramParcel.readString();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.qBe);
    paramParcel.writeString(this.mURL);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/pluginsdk/nfc/NfcAID.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */