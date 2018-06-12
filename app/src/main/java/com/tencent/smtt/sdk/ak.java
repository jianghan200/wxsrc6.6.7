package com.tencent.smtt.sdk;

import com.tencent.smtt.utils.TbsLog;
import com.tencent.smtt.utils.m.a;
import java.util.Map;

final class ak
  implements m.a
{
  ak(TbsDownloadConfig paramTbsDownloadConfig, boolean paramBoolean) {}
  
  public final void a(int paramInt)
  {
    TbsLog.i("TbsDownload", "[TbsDownloader.sendRequest] httpResponseCode=" + paramInt);
    if ((TbsShareManager.isThirdPartyApp(TbsDownloader.a())) && (paramInt == 200))
    {
      this.a.a.put("last_request_success", Long.valueOf(System.currentTimeMillis()));
      this.a.a.put("request_fail", Long.valueOf(0L));
      this.a.a.put("count_request_fail_in_24hours", Long.valueOf(0L));
      this.a.commit();
    }
    if (paramInt >= 300)
    {
      if (this.b) {
        this.a.setDownloadInterruptCode(-107);
      }
    }
    else {
      return;
    }
    this.a.setDownloadInterruptCode(65329);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/smtt/sdk/ak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */