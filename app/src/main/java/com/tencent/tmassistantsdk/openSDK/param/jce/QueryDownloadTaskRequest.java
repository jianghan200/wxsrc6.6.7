package com.tencent.tmassistantsdk.openSDK.param.jce;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public final class QueryDownloadTaskRequest
  extends JceStruct
{
  static IPCBaseParam cache_baseParam;
  public IPCBaseParam baseParam = null;
  
  public QueryDownloadTaskRequest() {}
  
  public QueryDownloadTaskRequest(IPCBaseParam paramIPCBaseParam)
  {
    this.baseParam = paramIPCBaseParam;
  }
  
  public final void readFrom(JceInputStream paramJceInputStream)
  {
    if (cache_baseParam == null) {
      cache_baseParam = new IPCBaseParam();
    }
    this.baseParam = ((IPCBaseParam)paramJceInputStream.read(cache_baseParam, 0, true));
  }
  
  public final void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.baseParam, 0);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/tmassistantsdk/openSDK/param/jce/QueryDownloadTaskRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */