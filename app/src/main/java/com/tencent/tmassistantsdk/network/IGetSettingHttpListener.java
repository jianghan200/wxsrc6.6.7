package com.tencent.tmassistantsdk.network;

import com.tencent.tmassistantsdk.protocol.jce.GetSettingsRequest;
import com.tencent.tmassistantsdk.protocol.jce.GetSettingsResponse;

public abstract interface IGetSettingHttpListener
{
  public abstract void onSettingHttpRequestFinish(GetSettingsRequest paramGetSettingsRequest, GetSettingsResponse paramGetSettingsResponse, boolean paramBoolean);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/tmassistantsdk/network/IGetSettingHttpListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */