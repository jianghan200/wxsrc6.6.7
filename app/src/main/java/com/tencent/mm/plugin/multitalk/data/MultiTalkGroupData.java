package com.tencent.mm.plugin.multitalk.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.pb.talkroom.sdk.MultiTalkGroup;
import com.tencent.pb.talkroom.sdk.MultiTalkGroupMember;
import java.util.List;

public class MultiTalkGroupData
  implements Parcelable
{
  public static final Parcelable.Creator<MultiTalkGroupData> CREATOR = new MultiTalkGroupData.1();
  private MultiTalkGroup lsV;
  
  public MultiTalkGroupData() {}
  
  public MultiTalkGroupData(MultiTalkGroup paramMultiTalkGroup)
  {
    this.lsV = paramMultiTalkGroup;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(bi.aG(this.lsV.vgm, ""));
    paramParcel.writeString(bi.aG(this.lsV.vgn, ""));
    paramParcel.writeString(bi.aG(this.lsV.vgo, ""));
    paramParcel.writeInt(this.lsV.vcc);
    paramParcel.writeString(bi.aG(this.lsV.vgp, ""));
    paramParcel.writeInt(this.lsV.vgq.size());
    int i = 0;
    while (i < this.lsV.vgq.size())
    {
      paramParcel.writeParcelable(new MultiTalkGroupMemberData((MultiTalkGroupMember)this.lsV.vgq.get(i)), paramInt);
      i += 1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/multitalk/data/MultiTalkGroupData.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */