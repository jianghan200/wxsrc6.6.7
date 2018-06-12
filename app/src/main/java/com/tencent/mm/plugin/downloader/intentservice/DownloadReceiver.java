package com.tencent.mm.plugin.downloader.intentservice;

import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.v4.app.z.d;
import com.tencent.mm.model.an;
import com.tencent.mm.plugin.notification.b;

public class DownloadReceiver
  extends ResultReceiver
{
  private static final String TAG = DownloadReceiver.class.getSimpleName();
  private z.d iby;
  
  protected void onReceiveResult(int paramInt, Bundle paramBundle)
  {
    super.onReceiveResult(paramInt, paramBundle);
    if (paramInt == 4657)
    {
      paramInt = paramBundle.getInt("progress");
      if (b.lHh != null) {}
    }
    else
    {
      return;
    }
    if (paramInt < 100)
    {
      this.iby.b(100, paramInt, false).c("Download in progress:" + paramInt);
      b.lHh.notify(4657, this.iby.build());
      return;
    }
    this.iby.b(0, 0, false).c("Download Complete");
    b.lHh.notify(4658, this.iby.build());
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/downloader/intentservice/DownloadReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */