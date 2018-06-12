package com.tencent.mm.plugin.report.service;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;

class BroadCastData
  implements Parcelable
{
  public static final Parcelable.Creator<BroadCastData> CREATOR = new Parcelable.Creator() {};
  ArrayList<KVReportDataInfo> mDV = new ArrayList();
  ArrayList<StIDKeyDataInfo> mDW = new ArrayList();
  ArrayList<GroupIDKeyDataInfo> mDX = new ArrayList();
  
  public BroadCastData() {}
  
  protected BroadCastData(Parcel paramParcel)
  {
    paramParcel.readTypedList(this.mDV, KVReportDataInfo.CREATOR);
    paramParcel.readTypedList(this.mDW, StIDKeyDataInfo.CREATOR);
    paramParcel.readTypedList(this.mDX, GroupIDKeyDataInfo.CREATOR);
  }
  
  public BroadCastData(BroadCastData paramBroadCastData)
  {
    if (paramBroadCastData == null) {
      return;
    }
    this.mDV = new ArrayList(paramBroadCastData.mDV);
    this.mDW = new ArrayList(paramBroadCastData.mDW);
    this.mDX = new ArrayList(paramBroadCastData.mDX);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeTypedList(this.mDV);
    paramParcel.writeTypedList(this.mDW);
    paramParcel.writeTypedList(this.mDX);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/report/service/BroadCastData.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */