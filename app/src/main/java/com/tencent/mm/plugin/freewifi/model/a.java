package com.tencent.mm.plugin.freewifi.model;

import android.content.Intent;
import android.util.SparseArray;
import com.tencent.mm.plugin.freewifi.d.b;
import com.tencent.mm.plugin.freewifi.i;
import com.tencent.mm.plugin.freewifi.i.a;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class a
{
  private g jjA = new g();
  SparseArray<Long> jjz = new SparseArray();
  
  public final void a(String paramString, g.b paramb, int paramInt, Intent paramIntent)
  {
    g localg = this.jjA;
    j.aON().aOv().post(new g.1(localg, paramString, paramIntent, paramb, paramInt));
  }
  
  public final void a(String paramString1, String paramString2, Intent paramIntent)
  {
    g localg = this.jjA;
    j.aON().aOv().post(new g.2(localg, paramString2, paramString1, paramIntent));
  }
  
  public final void aOs()
  {
    for (;;)
    {
      String str4;
      com.tencent.mm.plugin.freewifi.g.c localc;
      int j;
      try
      {
        x.i("MicroMsg.FreeWifi.FreeWifiAuthManager", "ap check for bar.");
        String str3 = d.aOz();
        x.i("MicroMsg.FreeWifi.FreeWifiAuthManager", "autuApAuth, get ssid is %s ", new Object[] { str3 });
        bool = bi.oW(str3);
        if (bool) {
          return;
        }
        if (j.aOK().Cf(str3) != null) {
          continue;
        }
        str4 = d.aOx();
        if (str4 == null)
        {
          i = 0;
          x.i("MicroMsg.FreeWifi.FreeWifiAuthManager", "freewifi info is null, now try to check is the wechat wifi fromserver, ssid is : %s, mac is : %s, nowmac hashcode : %d", new Object[] { str3, str4, Integer.valueOf(i) });
          if (bi.oW(str4)) {
            continue;
          }
          localc = j.aOK().Cg(str3);
          if (localc != null) {
            break label434;
          }
          String str1 = "null free wifiinfo";
          x.i("MicroMsg.FreeWifi.FreeWifiAuthManager", "now mac is : %s, loacal mac is : %s", new Object[] { str4, str1 });
          if (localc == null) {
            break label444;
          }
          x.i("MicroMsg.FreeWifi.FreeWifiAuthManager", "freewifi is not null, expired time = %d", new Object[] { Long.valueOf(localc.field_expiredTime) });
          if ((str4.equalsIgnoreCase(localc.field_mac)) && (localc.field_expiredTime - bi.VE() >= 0L)) {
            break label539;
          }
          x.i("MicroMsg.FreeWifi.FreeWifiAuthManager", "has expierd time or mac has changed");
          bool = true;
          x.i("MicroMsg.FreeWifi.FreeWifiAuthManager", "Should request bar from back end = %b", new Object[] { Boolean.valueOf(bool) });
          if (!bool) {
            continue;
          }
          int k = d.aOy();
          x.i("MicroMsg.FreeWifi.FreeWifiAuthManager", "now should do ap check, rssi is :  %d, mac : %s, mac hashcode : %d", new Object[] { Integer.valueOf(k), str4, Integer.valueOf(str4.hashCode()) });
          if (System.currentTimeMillis() - i.a.aNZ().oX("LOCAL_CONFIG_LAST_APCHECK_SAVE_DELAY_CRD_TIMEMILLIS") <= i.a.aNZ().getInt("LOCAL_CONFIG_APCHECK_DELAY_CRD_EXPIRED_DAYS", 7) * 24 * 60 * 60 * 1000) {
            break label534;
          }
          j = 1;
          i = j;
          if (i.a.aNZ().getInt("LOCAL_CONFIG_FEATURES_DEFINE_ONCE_BAR_APPEARED", 0) == 1) {
            i = j | 0x2;
          }
          j = i;
          if (i.a.aNZ().getInt("LOCAL_CONFIG_FEATURES_DEFINE_ONCE_USE_WECHAT_FREEWIFI", 0) == 1) {
            j = i | 0x4;
          }
          i = j;
          if (i.a.aNZ().getInt("LOCAL_CONFIG_FEATURES_DEFINE_ONCE_RECV_FREEWIFI_SYSMSG", 0) == 1) {
            i = j | 0x8;
          }
          x.i("MicroMsg.FreeWifi.FreeWifiAuthManager", "features : " + i);
          new b(str4, str3, k, i).b(new a.1(this));
          continue;
        }
        int i = str4.hashCode();
      }
      finally {}
      continue;
      label434:
      String str2 = localc.field_mac;
      continue;
      label444:
      if (this.jjz.indexOfKey(str4.hashCode()) >= 0)
      {
        long l = ((Long)this.jjz.get(str4.hashCode())).longValue();
        x.i("MicroMsg.FreeWifi.FreeWifiAuthManager", "has checked this mac, now time - last check time = %d", new Object[] { Long.valueOf(bi.VF() - l) });
        if (bi.VF() - l > 43200000L) {
          bool = true;
        }
      }
      else
      {
        x.i("MicroMsg.FreeWifi.FreeWifiAuthManager", "has not checked this mac, try to check from server");
        bool = true;
        continue;
        label534:
        j = 0;
        continue;
      }
      label539:
      boolean bool = false;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/freewifi/model/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */