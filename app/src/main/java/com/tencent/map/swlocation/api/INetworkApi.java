package com.tencent.map.swlocation.api;

import com.d.a.a.q;

public abstract interface INetworkApi
  extends q
{
  @Deprecated
  public abstract byte[] httpRequest(String paramString, byte[] paramArrayOfByte);
  
  public abstract byte[] httpRequest(byte[] paramArrayOfByte);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/map/swlocation/api/INetworkApi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */