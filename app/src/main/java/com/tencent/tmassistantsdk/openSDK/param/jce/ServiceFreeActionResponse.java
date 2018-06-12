package com.tencent.tmassistantsdk.openSDK.param.jce;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public final class ServiceFreeActionResponse
  extends JceStruct
{
  static byte[] cache_revertField;
  public byte[] revertField = null;
  
  public ServiceFreeActionResponse() {}
  
  public ServiceFreeActionResponse(byte[] paramArrayOfByte)
  {
    this.revertField = paramArrayOfByte;
  }
  
  public final void readFrom(JceInputStream paramJceInputStream)
  {
    if (cache_revertField == null)
    {
      byte[] arrayOfByte = (byte[])new byte[1];
      cache_revertField = arrayOfByte;
      ((byte[])arrayOfByte)[0] = 0;
    }
    this.revertField = ((byte[])paramJceInputStream.read(cache_revertField, 0, false));
  }
  
  public final void writeTo(JceOutputStream paramJceOutputStream)
  {
    if (this.revertField != null) {
      paramJceOutputStream.write(this.revertField, 0);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/tmassistantsdk/openSDK/param/jce/ServiceFreeActionResponse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */