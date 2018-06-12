package com.tencent.pb.talkroom.sdk;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.List;

public class MultiTalkGroup
  implements Parcelable
{
  public static final Parcelable.Creator<MultiTalkGroup> CREATOR = new MultiTalkGroup.1();
  public int vcc;
  public String vgm = "";
  public String vgn = "";
  public String vgo = "";
  public String vgp = "";
  public List<MultiTalkGroupMember> vgq = new ArrayList();
  
  public int describeContents()
  {
    return 0;
  }
  
  public String toString()
  {
    return "MultiTalkGroup [mMultiTalkGroupId=" + this.vgm + ", mMultiTalkClientGroupId=" + this.vgn + ", mWxGroupId=" + this.vgo + ", mRouteId=" + this.vcc + ", mCreatorUsrName=" + this.vgp + ", mMultiTalkGroupMemberList=" + this.vgq + "]";
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int j = 0;
    String str;
    if (this.vgm == null)
    {
      str = "";
      paramParcel.writeString(str);
      if (this.vgn != null) {
        break label136;
      }
      str = "";
      label31:
      paramParcel.writeString(str);
      if (this.vgo != null) {
        break label145;
      }
      str = "";
      label48:
      paramParcel.writeString(str);
      paramParcel.writeInt(this.vcc);
      if (this.vgp != null) {
        break label154;
      }
      str = "";
      label73:
      paramParcel.writeString(str);
      if (this.vgq != null) {
        break label163;
      }
    }
    label136:
    label145:
    label154:
    label163:
    for (int i = 0;; i = this.vgq.size())
    {
      paramParcel.writeInt(i);
      while (j < i)
      {
        paramParcel.writeParcelable((MultiTalkGroupMember)this.vgq.get(j), paramInt);
        j += 1;
      }
      str = this.vgm;
      break;
      str = this.vgn;
      break label31;
      str = this.vgo;
      break label48;
      str = this.vgp;
      break label73;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/pb/talkroom/sdk/MultiTalkGroup.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */