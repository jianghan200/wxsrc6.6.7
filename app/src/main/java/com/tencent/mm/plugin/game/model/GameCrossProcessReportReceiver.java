package com.tencent.mm.plugin.game.model;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.game.a.b;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;

public class GameCrossProcessReportReceiver
  extends BroadcastReceiver
{
  public static void H(int paramInt, String paramString)
  {
    if (ad.cic())
    {
      an(paramInt, paramString);
      return;
    }
    String str = ad.getPackageName() + ".plugin.game.model.GameCrossProcessReportReceiver";
    Intent localIntent = new Intent("com.tencent.mm.game.report.GameCrossProcessReportReceiver");
    localIntent.setComponent(new ComponentName(ad.getPackageName(), str));
    localIntent.putExtra("LOGID_KEY", paramInt);
    localIntent.putExtra("LOGEXT_KEY", paramString);
    ad.getContext().sendBroadcast(localIntent);
  }
  
  private static void an(int paramInt, String paramString)
  {
    x.i("MicroMsg.GameCrossProcessReportReceiver", "game cross process report, logId:%d, logExt:%s", new Object[] { Integer.valueOf(paramInt), paramString });
    paramString = new am.a(paramInt, paramString);
    ((b)g.l(b.class)).aSg().a(paramString);
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if (paramIntent == null) {
      x.e("MicroMsg.GameCrossProcessReportReceiver", "onReceive intent == null");
    }
    while (!"com.tencent.mm.game.report.GameCrossProcessReportReceiver".equals(paramIntent.getAction())) {
      return;
    }
    an(paramIntent.getIntExtra("LOGID_KEY", 0), paramIntent.getStringExtra("LOGEXT_KEY"));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/game/model/GameCrossProcessReportReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */