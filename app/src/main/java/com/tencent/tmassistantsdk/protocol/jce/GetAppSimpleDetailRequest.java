package com.tencent.tmassistantsdk.protocol.jce;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import java.util.ArrayList;

public final class GetAppSimpleDetailRequest
  extends JceStruct
{
  static ArrayList<AppDetailParam> cache_appReqList;
  public ArrayList<AppDetailParam> appReqList = null;
  
  public GetAppSimpleDetailRequest() {}
  
  public GetAppSimpleDetailRequest(ArrayList<AppDetailParam> paramArrayList)
  {
    this.appReqList = paramArrayList;
  }
  
  public final void readFrom(JceInputStream paramJceInputStream)
  {
    if (cache_appReqList == null)
    {
      cache_appReqList = new ArrayList();
      AppDetailParam localAppDetailParam = new AppDetailParam();
      cache_appReqList.add(localAppDetailParam);
    }
    this.appReqList = ((ArrayList)paramJceInputStream.read(cache_appReqList, 0, false));
  }
  
  public final void writeTo(JceOutputStream paramJceOutputStream)
  {
    if (this.appReqList != null) {
      paramJceOutputStream.write(this.appReqList, 0);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/tmassistantsdk/protocol/jce/GetAppSimpleDetailRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */