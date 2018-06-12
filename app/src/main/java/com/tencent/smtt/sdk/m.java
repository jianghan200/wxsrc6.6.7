package com.tencent.smtt.sdk;

import android.content.Context;

final class m
  implements TbsDownloader.TbsDownloaderCallback
{
  m(Context paramContext, QbSdk.PreInitCallback paramPreInitCallback) {}
  
  public final void onNeedDownloadFinish(boolean paramBoolean, int paramInt)
  {
    if ((TbsShareManager.findCoreForThirdPartyApp(this.a) == 0) && (!TbsShareManager.getCoreDisabled()))
    {
      TbsShareManager.forceToLoadX5ForThirdApp(this.a, false);
      if ((QbSdk.i) && (TbsShareManager.isThirdPartyApp(this.a))) {
        TbsExtensionFunctionManager.getInstance().initTbsBuglyIfNeed(this.a);
      }
      return;
    }
    if ((QbSdk.i) && (TbsShareManager.isThirdPartyApp(this.a))) {
      TbsExtensionFunctionManager.getInstance().initTbsBuglyIfNeed(this.a);
    }
    QbSdk.preInit(this.a, this.b);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/smtt/sdk/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */