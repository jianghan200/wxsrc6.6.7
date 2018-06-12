package com.tencent.smtt.sdk;

import com.tencent.smtt.utils.TbsLog;
import com.tencent.smtt.utils.m.a;

class az
  implements m.a
{
  az(TbsLogReport paramTbsLogReport) {}
  
  public void a(int paramInt)
  {
    TbsLog.i("TbsDownload", "[TbsApkDownloadStat.reportDownloadStat] onHttpResponseCode:" + paramInt);
    if (paramInt < 300) {
      TbsLogReport.b(this.a);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/smtt/sdk/az.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */