package com.tencent.wework.api.model;

import android.os.Bundle;

public class WWMediaLink
  extends WWMediaMessage.WWMediaObject
{
  public String thumbUrl;
  public String webpageUrl;
  
  public final boolean checkArgs()
  {
    if (!super.checkArgs()) {}
    while ((this.webpageUrl == null) || (this.webpageUrl.length() == 0) || (this.webpageUrl.length() > 10240)) {
      return false;
    }
    return true;
  }
  
  public final void toBundle(Bundle paramBundle)
  {
    paramBundle.putString("_wwwebpageobject_thumbUrl", this.thumbUrl);
    paramBundle.putString("_wwwebpageobject_webpageUrl", this.webpageUrl);
    super.toBundle(paramBundle);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/wework/api/model/WWMediaLink.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */