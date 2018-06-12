package com.tencent.mm.plugin.report.service;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.mars.smc.IDKey;
import java.util.ArrayList;

class GroupIDKeyDataInfo
  implements Parcelable
{
  public static final Parcelable.Creator<GroupIDKeyDataInfo> CREATOR = new Parcelable.Creator() {};
  ArrayList<IDKey> mDY = new ArrayList();
  public boolean mDZ;
  
  protected GroupIDKeyDataInfo(Parcel paramParcel)
  {
    paramParcel.readTypedList(this.mDY, IDKey.CREATOR);
    if (paramParcel.readInt() == 1) {}
    for (;;)
    {
      this.mDZ = bool;
      return;
      bool = false;
    }
  }
  
  GroupIDKeyDataInfo(ArrayList<IDKey> paramArrayList)
  {
    this.mDY = paramArrayList;
    this.mDZ = false;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeTypedList(this.mDY);
    if (this.mDZ) {}
    for (paramInt = 1;; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/report/service/GroupIDKeyDataInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */