package com.tencent.rtmp;

public class TXPlayerAuthBuilder
{
  int appId;
  int exper = -1;
  String fileId;
  protected boolean isHttps;
  String sign;
  String timeout;
  String us;
  
  public int getAppId()
  {
    return this.appId;
  }
  
  public int getExper()
  {
    return this.exper;
  }
  
  public String getFileId()
  {
    return this.fileId;
  }
  
  public String getSign()
  {
    return this.sign;
  }
  
  public String getTimeout()
  {
    return this.timeout;
  }
  
  public String getUs()
  {
    return this.us;
  }
  
  public boolean isHttps()
  {
    return this.isHttps;
  }
  
  public void setAppId(int paramInt)
  {
    this.appId = paramInt;
  }
  
  public void setExper(int paramInt)
  {
    this.exper = paramInt;
  }
  
  public void setFileId(String paramString)
  {
    this.fileId = paramString;
  }
  
  public void setHttps(boolean paramBoolean)
  {
    this.isHttps = paramBoolean;
  }
  
  public void setSign(String paramString)
  {
    this.sign = paramString;
  }
  
  public void setTimeout(String paramString)
  {
    this.timeout = paramString;
  }
  
  public void setUs(String paramString)
  {
    this.us = paramString;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/rtmp/TXPlayerAuthBuilder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */