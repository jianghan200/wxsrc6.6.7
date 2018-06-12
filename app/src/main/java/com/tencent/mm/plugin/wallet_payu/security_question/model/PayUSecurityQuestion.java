package com.tencent.mm.plugin.wallet_payu.security_question.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class PayUSecurityQuestion
  implements Parcelable
{
  public static final Parcelable.Creator<PayUSecurityQuestion> CREATOR = new PayUSecurityQuestion.1();
  public String desc;
  public String id;
  
  public PayUSecurityQuestion(Parcel paramParcel)
  {
    this.id = paramParcel.readString();
    this.desc = paramParcel.readString();
  }
  
  public PayUSecurityQuestion(String paramString1, String paramString2)
  {
    this.id = paramString1;
    this.desc = paramString2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.id);
    paramParcel.writeString(this.desc);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/wallet_payu/security_question/model/PayUSecurityQuestion.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */