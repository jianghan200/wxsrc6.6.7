package com.tencent.mm.plugin.bbom;

import android.app.Service;
import android.content.ContentResolver;
import android.content.IntentFilter;
import com.tencent.mm.booter.TrafficStatsReceiver;
import com.tencent.mm.modelfriend.AddrBookObserver;
import com.tencent.mm.modelstat.WatchDogPushReceiver;

public final class g
  implements com.tencent.mm.plugin.zero.a.a
{
  private AddrBookObserver hes;
  private WatchDogPushReceiver het;
  private TrafficStatsReceiver heu;
  
  public final void a(Service paramService)
  {
    this.hes = new AddrBookObserver(paramService);
    paramService.getContentResolver().registerContentObserver(com.tencent.mm.pluginsdk.a.cbh(), true, this.hes);
    this.het = new WatchDogPushReceiver();
    paramService.registerReceiver(this.het, new IntentFilter("com.tencent.mm.WatchDogPushReceiver"));
    this.heu = new TrafficStatsReceiver();
    paramService.registerReceiver(this.heu, new IntentFilter("com.tencent.mm.TrafficStatsReceiver"));
    TrafficStatsReceiver.bo(paramService);
  }
  
  public final void b(Service paramService)
  {
    paramService.getContentResolver().unregisterContentObserver(this.hes);
    paramService.unregisterReceiver(this.het);
    paramService.unregisterReceiver(this.heu);
    TrafficStatsReceiver.bp(paramService);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/bbom/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */