package com.tencent.mm.plugin.downloader.model;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.jg.JgClassChecked;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

@JgClassChecked(author=20, fComment="checked", lastDate="20150202", reviewer=20, vComment={com.jg.EType.RECEIVERCHECK})
public class FileDownloadReceiver
  extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if ((paramContext == null) || (paramIntent == null)) {
      return;
    }
    paramContext = paramIntent.getAction();
    x.i("MicroMsg.FileDownloadReceiver", paramContext);
    if (bi.oW(paramContext))
    {
      x.e("MicroMsg.FileDownloadReceiver", "action is null or nill, ignore");
      return;
    }
    paramContext.equals("android.intent.action.DOWNLOAD_COMPLETE");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/downloader/model/FileDownloadReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */