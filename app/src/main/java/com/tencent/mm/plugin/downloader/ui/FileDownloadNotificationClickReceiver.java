package com.tencent.mm.plugin.downloader.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.mm.g.a.qw;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public class FileDownloadNotificationClickReceiver
  extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    x.i("MicroMsg.FileDownloadNotificationClickReceiver", "onReceive");
    Object localObject = bi.bQ(paramContext);
    x.i("MicroMsg.FileDownloadNotificationClickReceiver", "topActivityName = " + (String)localObject);
    paramIntent = paramIntent.getExtras();
    if (bi.oV((String)localObject).equals("com.tencent.mm.plugin.game.gamewebview.ui.GameWebViewUI"))
    {
      paramContext = new qw();
      paramContext.cbF.bundle = paramIntent;
      a.sFg.m(paramContext);
      return;
    }
    localObject = new Intent(paramContext, FileDownloadConfirmUI.class);
    ((Intent)localObject).putExtras(paramIntent);
    ((Intent)localObject).setFlags(268435456);
    paramContext.startActivity((Intent)localObject);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/downloader/ui/FileDownloadNotificationClickReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */