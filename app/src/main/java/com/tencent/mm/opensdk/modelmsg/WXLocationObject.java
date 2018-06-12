package com.tencent.mm.opensdk.modelmsg;

import android.os.Bundle;

public class WXLocationObject
  implements WXMediaMessage.IMediaObject
{
  private static final String TAG = "MicroMsg.SDK.WXLocationObject";
  public double lat;
  public double lng;
  
  public WXLocationObject()
  {
    this(0.0D, 0.0D);
  }
  
  public WXLocationObject(double paramDouble1, double paramDouble2)
  {
    this.lat = paramDouble1;
    this.lng = paramDouble2;
  }
  
  public boolean checkArgs()
  {
    return true;
  }
  
  public void serialize(Bundle paramBundle)
  {
    paramBundle.putDouble("_wxlocationobject_lat", this.lat);
    paramBundle.putDouble("_wxlocationobject_lng", this.lng);
  }
  
  public int type()
  {
    return 30;
  }
  
  public void unserialize(Bundle paramBundle)
  {
    this.lat = paramBundle.getDouble("_wxlocationobject_lat");
    this.lng = paramBundle.getDouble("_wxlocationobject_lng");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/opensdk/modelmsg/WXLocationObject.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */