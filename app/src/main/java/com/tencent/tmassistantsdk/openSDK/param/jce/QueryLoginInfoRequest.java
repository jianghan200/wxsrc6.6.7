package com.tencent.tmassistantsdk.openSDK.param.jce;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public final class QueryLoginInfoRequest
  extends JceStruct
{
  public String addtion = "";
  
  public QueryLoginInfoRequest() {}
  
  public QueryLoginInfoRequest(String paramString)
  {
    this.addtion = paramString;
  }
  
  public final void readFrom(JceInputStream paramJceInputStream)
  {
    this.addtion = paramJceInputStream.readString(0, false);
  }
  
  public final void writeTo(JceOutputStream paramJceOutputStream)
  {
    if (this.addtion != null) {
      paramJceOutputStream.write(this.addtion, 0);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/tmassistantsdk/openSDK/param/jce/QueryLoginInfoRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */