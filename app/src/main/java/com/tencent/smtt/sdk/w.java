package com.tencent.smtt.sdk;

class w
  implements Runnable
{
  w(v paramv) {}
  
  public void run()
  {
    if ((!TbsShareManager.forceLoadX5FromTBSDemo(v.a(this.a).getContext())) && (TbsDownloader.needDownload(v.a(this.a).getContext(), false))) {
      TbsDownloader.startDownload(v.a(this.a).getContext());
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/smtt/sdk/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */