package com.tencent.mm.sandbox.updater;

import android.content.Context;
import android.content.Intent;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

final class f
{
  private static long sEe = 125829120L;
  private static long sEf = 314572800L;
  al bAZ = new al(new f.1(this), true);
  boolean iXC = false;
  private boolean initialized = false;
  private long sEg = 0L;
  private long sEh = 0L;
  private String sEi = null;
  private j sEj;
  
  public f(j paramj)
  {
    this.sEj = paramj;
  }
  
  public static boolean VS(String paramString)
  {
    if (i.VU(paramString) > sEe)
    {
      x.e("MicroMsg.TrafficStatistic", "overTrafficAlertLine reach traffic alert line!");
      return true;
    }
    return false;
  }
  
  public final void cT(String paramString, int paramInt)
  {
    if (bi.oW(paramString)) {}
    do
    {
      return;
      if (!paramString.equals(this.sEi)) {
        stop();
      }
      x.i("MicroMsg.TrafficStatistic", "pack size: " + paramInt);
      x.i("MicroMsg.TrafficStatistic", "TRAFFIC_ALERT_LINE before : %s", new Object[] { Long.valueOf(sEe) });
      sEe = Math.max(paramInt * 4, sEe);
      sEe = Math.min(sEf, sEe);
      x.i("MicroMsg.TrafficStatistic", "TRAFFIC_ALERT_LINE after : %s", new Object[] { Long.valueOf(sEe) });
    } while (this.initialized);
    if (this.sEj.mContext != null) {
      this.iXC = ao.isWifi(this.sEj.mContext);
    }
    this.bAZ.J(30000L, 30000L);
    this.initialized = true;
    this.sEi = paramString;
  }
  
  final void lb(boolean paramBoolean)
  {
    long l = 0L;
    if ((paramBoolean) || (this.sEg + this.sEh >= 524288L))
    {
      if (this.sEg + this.sEh > 0L)
      {
        Intent localIntent = new Intent();
        localIntent.setAction("com.tencent.mm.sandbox.updater.intent.ACTION_UPDATE");
        localIntent.putExtra("intent_extra_flow_stat_upstream", this.sEg);
        localIntent.putExtra("intent_extra_flow_stat_downstream", this.sEh);
        if (this.sEj.mContext != null) {
          this.iXC = ao.isWifi(this.sEj.mContext);
        }
        localIntent.putExtra("intent_extra_flow_stat_is_wifi", this.iXC);
        if (this.sEj.mContext != null) {
          this.sEj.mContext.sendBroadcast(localIntent, "com.tencent.mm.permission.MM_MESSAGE");
        }
      }
      if (!bi.oW(this.sEi)) {
        break label188;
      }
      x.e("MicroMsg.TrafficStatistic", "traffic is null!");
    }
    for (;;)
    {
      if ((l >= sEe) && (this.sEj.nPm == 2))
      {
        x.e("MicroMsg.TrafficStatistic", "checkIfTrafficAlert reach traffic alert line!");
        this.sEj.cancel();
      }
      return;
      label188:
      l = i.u(this.sEi, this.sEg, this.sEh);
      this.sEg = 0L;
      this.sEh = 0L;
    }
  }
  
  public final void stop()
  {
    lb(true);
    this.bAZ.SO();
    this.initialized = false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/sandbox/updater/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */