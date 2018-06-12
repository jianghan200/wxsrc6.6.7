package com.tencent.mm.plugin.wallet_core.model.mall;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class MallNews
  implements Parcelable
{
  public static final Parcelable.Creator<MallNews> CREATOR = new MallNews.1();
  public String bLe;
  public String oqH;
  public int ppS;
  public String psa = "0";
  public String psb = "0";
  public String psc;
  public String psd;
  public String pse;
  public String psf;
  public int psg;
  public String psh;
  public int psi;
  public String psj;
  public String psk;
  public int showType;
  public String type;
  
  public MallNews(Parcel paramParcel)
  {
    this.psc = paramParcel.readString();
    this.oqH = paramParcel.readString();
    this.bLe = paramParcel.readString();
    this.psd = paramParcel.readString();
    this.pse = paramParcel.readString();
    this.psf = paramParcel.readString();
    this.psg = paramParcel.readInt();
    this.psh = paramParcel.readString();
    this.psa = paramParcel.readString();
    this.psb = paramParcel.readString();
    this.showType = paramParcel.readInt();
    this.psj = paramParcel.readString();
    this.ppS = paramParcel.readInt();
    this.psk = paramParcel.readString();
  }
  
  public MallNews(String paramString)
  {
    this.psc = paramString;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if ((paramObject instanceof MallNews))
    {
      paramObject = (MallNews)paramObject;
      if ((this.psc != null) && (this.psc.equals(((MallNews)paramObject).psc))) {
        break label35;
      }
    }
    label35:
    while ((this.oqH == null) || (!this.oqH.equals(((MallNews)paramObject).oqH))) {
      return false;
    }
    return true;
  }
  
  public String toString()
  {
    return String.format("functionId : %s, activityId : %s, ticket : %s, activityMsg : %s, activityLink : %s, activityIconLink : %s, showFlag : %s, orgStr : %s, activityTips: %s, activityType: %d, activityUrl: %s", new Object[] { this.psc, this.oqH, this.bLe, this.psd, this.pse, this.psf, this.psa, this.psj, this.psh, Integer.valueOf(this.ppS), this.psk });
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.psc);
    paramParcel.writeString(this.oqH);
    paramParcel.writeString(this.bLe);
    paramParcel.writeString(this.psd);
    paramParcel.writeString(this.pse);
    paramParcel.writeString(this.psf);
    paramParcel.writeInt(this.psg);
    paramParcel.writeString(this.psh);
    paramParcel.writeString(this.psa);
    paramParcel.writeString(this.psb);
    paramParcel.writeInt(this.showType);
    paramParcel.writeString(this.psj);
    paramParcel.writeInt(this.ppS);
    paramParcel.writeString(this.psk);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/model/mall/MallNews.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */