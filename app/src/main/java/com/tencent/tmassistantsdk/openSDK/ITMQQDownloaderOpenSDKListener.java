package com.tencent.tmassistantsdk.openSDK;

public abstract interface ITMQQDownloaderOpenSDKListener
{
  public abstract void OnDownloadTaskProgressChanged(TMQQDownloaderOpenSDKParam paramTMQQDownloaderOpenSDKParam, long paramLong1, long paramLong2);
  
  public abstract void OnDownloadTaskStateChanged(TMQQDownloaderOpenSDKParam paramTMQQDownloaderOpenSDKParam, int paramInt1, int paramInt2, String paramString);
  
  public abstract void OnQQDownloaderInvalid();
  
  public abstract void OnServiceFree();
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/tmassistantsdk/openSDK/ITMQQDownloaderOpenSDKListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */