package com.tencent.wework.api.model;

import android.os.Bundle;

public class WWMediaLocation
  extends WWMediaMessage.WWMediaObject
{
  public String dRH;
  public double latitude;
  public double longitude;
  public double vzL;
  
  public final boolean checkArgs()
  {
    if (!super.checkArgs()) {}
    while ((this.dRH == null) || (this.dRH.length() == 0) || (this.dRH.length() > 10240)) {
      return false;
    }
    return true;
  }
  
  public final void toBundle(Bundle paramBundle)
  {
    paramBundle.putString("_wwlocobject_address", this.dRH);
    paramBundle.putDouble("_wwlocobject_longitude", this.longitude);
    paramBundle.putDouble("_wwlocobject_latitude", this.latitude);
    paramBundle.putDouble("_wwlocobject_zoom", this.vzL);
    super.toBundle(paramBundle);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/wework/api/model/WWMediaLocation.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */