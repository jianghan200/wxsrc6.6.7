package com.tencent.tmassistantsdk.downloadservice;

public abstract interface IDownloadManagerListener
{
  public abstract void OnDownloadProgressChanged(String paramString, long paramLong1, long paramLong2);
  
  public abstract void OnDownloadStateChanged(String paramString1, int paramInt1, int paramInt2, String paramString2, boolean paramBoolean1, boolean paramBoolean2);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/tmassistantsdk/downloadservice/IDownloadManagerListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */