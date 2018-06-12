package com.tencent.mm.opensdk.diffdev;

public abstract interface OAuthListener
{
  public abstract void onAuthFinish(OAuthErrCode paramOAuthErrCode, String paramString);
  
  public abstract void onAuthGotQrcode(String paramString, byte[] paramArrayOfByte);
  
  public abstract void onQrcodeScanned();
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/opensdk/diffdev/OAuthListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */