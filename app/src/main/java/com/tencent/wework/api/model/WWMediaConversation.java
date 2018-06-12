package com.tencent.wework.api.model;

import android.os.Bundle;

public class WWMediaConversation
  extends WWMediaMessage.WWMediaObject
{
  public String jed;
  public long mEo;
  public String name;
  public byte[] vzJ;
  public WWMediaMessage.WWMediaObject vzK;
  
  public final boolean checkArgs()
  {
    if (!super.checkArgs()) {}
    while (((this.vzJ != null) && (this.vzJ.length > 10485760)) || ((this.jed != null) && (this.jed.length() > 10240)) || ((this.jed != null) && (getFileSize(this.jed) > 10485760)) || (this.vzK == null) || (!this.vzK.checkArgs())) {
      return false;
    }
    return true;
  }
  
  public final void toBundle(Bundle paramBundle)
  {
    super.toBundle(paramBundle);
    paramBundle.putString("_wwconvobject_name", this.name);
    paramBundle.putLong("_wwconvobject_date", this.mEo);
    paramBundle.putByteArray("_wwconvobject_avatarData", this.vzJ);
    paramBundle.putString("_wwconvobject_avatarPath", this.jed);
    paramBundle.putBundle("_wwconvobject_message", BaseMessage.b(this.vzK));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/wework/api/model/WWMediaConversation.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */