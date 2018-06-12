package com.tencent.smtt.sdk;

class ae
  implements Runnable
{
  ae(ad paramad) {}
  
  public void run()
  {
    if ((!TbsShareManager.forceLoadX5FromTBSDemo(ad.a(this.a).getContext())) && (TbsDownloader.needDownload(ad.a(this.a).getContext(), false))) {
      TbsDownloader.startDownload(ad.a(this.a).getContext());
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/smtt/sdk/ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */