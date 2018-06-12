package com.tencent.tmassistantsdk.downloadclient;

import com.tencent.tmassistantsdk.protocol.jce.AppSimpleDetail;
import java.util.ArrayList;

public abstract interface ITMAssistantExchangeURLListenner
{
  public abstract void onExchangedURLSucceed(ArrayList<AppSimpleDetail> paramArrayList, boolean paramBoolean);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/tmassistantsdk/downloadclient/ITMAssistantExchangeURLListenner.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */