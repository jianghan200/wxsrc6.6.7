package com.tencent.mm.plugin.multitalk.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.pb.talkroom.sdk.MultiTalkGroupMember;

public class MultiTalkGroupMemberData
  implements Parcelable
{
  public static final Parcelable.Creator<MultiTalkGroupMemberData> CREATOR = new Parcelable.Creator() {};
  MultiTalkGroupMember lsW;
  
  public MultiTalkGroupMemberData(MultiTalkGroupMember paramMultiTalkGroupMember)
  {
    this.lsW = paramMultiTalkGroupMember;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(bi.aG(this.lsW.vgr, ""));
    paramParcel.writeString(bi.aG(this.lsW.vgs, ""));
    paramParcel.writeInt(this.lsW.status);
    paramParcel.writeInt(this.lsW.aAk);
    paramParcel.writeInt(this.lsW.vfs);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/multitalk/data/MultiTalkGroupMemberData.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */