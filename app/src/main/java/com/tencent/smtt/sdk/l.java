package com.tencent.smtt.sdk;

import android.content.Context;

final class l
  implements TbsListener
{
  l(Context paramContext, QbSdk.PreInitCallback paramPreInitCallback) {}
  
  public final void onDownloadFinish(int paramInt) {}
  
  public final void onDownloadProgress(int paramInt) {}
  
  public final void onInstallFinish(int paramInt)
  {
    QbSdk.preInit(this.a, this.b);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/smtt/sdk/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */