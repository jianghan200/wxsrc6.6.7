package com.tencent.mm.plugin.voiceprint.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.mm.sdk.platformtools.bi;

public class VertifyInfo
  implements Parcelable
{
  public static final Parcelable.Creator<VertifyInfo> CREATOR = new VertifyInfo.1();
  public String eRp = "";
  public String gEw = "";
  public String mFileName = "";
  public String oET = "";
  public int oFa = 0;
  public int oFi;
  public int oFj;
  public int oFk = 0;
  public boolean oFl = false;
  public boolean oFm = false;
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    paramParcel.writeInt(this.oFi);
    paramParcel.writeInt(this.oFj);
    paramParcel.writeInt(this.oFk);
    paramParcel.writeInt(this.oFa);
    paramParcel.writeString(bi.aG(this.gEw, ""));
    paramParcel.writeString(bi.aG(this.oET, ""));
    paramParcel.writeString(bi.aG(this.mFileName, ""));
    if (this.oFl)
    {
      paramInt = 1;
      paramParcel.writeInt(paramInt);
      if (!this.oFm) {
        break label107;
      }
    }
    label107:
    for (paramInt = i;; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      return;
      paramInt = 0;
      break;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/voiceprint/model/VertifyInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */