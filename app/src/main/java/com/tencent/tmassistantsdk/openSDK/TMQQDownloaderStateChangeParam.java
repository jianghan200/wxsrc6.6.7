package com.tencent.tmassistantsdk.openSDK;

public class TMQQDownloaderStateChangeParam
{
  public int errorCode;
  public String errorMsg;
  public String hostPackageName;
  public String hostVersion;
  public TMQQDownloaderOpenSDKParam param;
  public int state;
  public String taskId;
  
  public TMQQDownloaderStateChangeParam() {}
  
  public TMQQDownloaderStateChangeParam(TMQQDownloaderOpenSDKParam paramTMQQDownloaderOpenSDKParam, String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, String paramString4)
  {
    this.param = paramTMQQDownloaderOpenSDKParam;
    this.hostPackageName = paramString1;
    this.hostVersion = paramString2;
    this.taskId = paramString3;
    this.state = paramInt1;
    this.errorCode = paramInt2;
    this.errorMsg = paramString4;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/tmassistantsdk/openSDK/TMQQDownloaderStateChangeParam.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */