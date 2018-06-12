package com.tencent.pb.talkroom.sdk;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class MultiTalkGroupMember
  implements Parcelable
{
  public static final Parcelable.Creator<MultiTalkGroupMember> CREATOR = new Parcelable.Creator() {};
  public int aAk;
  public int status;
  public int vfs;
  public String vgr = "";
  public String vgs = "";
  
  public int describeContents()
  {
    return 0;
  }
  
  public String toString()
  {
    return "MultiTalkGroupMember [usrName=" + this.vgr + ", inviteUsrName=" + this.vgs + ", status=" + this.status + ", reason=" + this.aAk + ", inviteTime=" + this.vfs + "]";
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (this.vgr == null)
    {
      str = "";
      paramParcel.writeString(str);
      if (this.vgs != null) {
        break label63;
      }
    }
    label63:
    for (String str = "";; str = this.vgs)
    {
      paramParcel.writeString(str);
      paramParcel.writeInt(this.status);
      paramParcel.writeInt(this.aAk);
      paramParcel.writeInt(this.vfs);
      return;
      str = this.vgr;
      break;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/pb/talkroom/sdk/MultiTalkGroupMember.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */