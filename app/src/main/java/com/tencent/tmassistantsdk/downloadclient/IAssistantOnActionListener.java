package com.tencent.tmassistantsdk.downloadclient;

public abstract interface IAssistantOnActionListener
{
  public abstract void onActionResult(byte[] paramArrayOfByte);
  
  public abstract void onDownloadSDKServiceInvalid();
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/tmassistantsdk/downloadclient/IAssistantOnActionListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */