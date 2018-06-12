package com.tencent.mm.plugin.report.service;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

class KVReportDataInfo
  implements Parcelable
{
  public static final Parcelable.Creator<KVReportDataInfo> CREATOR = new Parcelable.Creator() {};
  public boolean mDZ;
  public long mEv;
  public boolean mEw;
  public String value;
  
  public KVReportDataInfo() {}
  
  protected KVReportDataInfo(Parcel paramParcel)
  {
    this.mEv = paramParcel.readLong();
    this.value = paramParcel.readString();
    if (paramParcel.readInt() == 1)
    {
      bool1 = true;
      this.mEw = bool1;
      if (paramParcel.readInt() != 1) {
        break label58;
      }
    }
    label58:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      this.mDZ = bool1;
      return;
      bool1 = false;
      break;
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    paramParcel.writeLong(this.mEv);
    paramParcel.writeString(this.value);
    if (this.mEw)
    {
      paramInt = 1;
      paramParcel.writeInt(paramInt);
      if (!this.mDZ) {
        break label52;
      }
    }
    label52:
    for (paramInt = i;; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      return;
      paramInt = 0;
      break;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/report/service/KVReportDataInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */