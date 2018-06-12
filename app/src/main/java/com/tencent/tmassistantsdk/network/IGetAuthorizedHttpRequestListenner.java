package com.tencent.tmassistantsdk.network;

import com.tencent.tmassistantsdk.openSDK.opensdktomsdk.data.AuthorizedResult;

public abstract interface IGetAuthorizedHttpRequestListenner
{
  public abstract void onGetAuthorizedRequestFinished(AuthorizedResult paramAuthorizedResult, int paramInt);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/tmassistantsdk/network/IGetAuthorizedHttpRequestListenner.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */