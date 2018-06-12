package com.tencent.mm.plugin.freewifi.e;

import android.content.Intent;
import com.tencent.mm.plugin.freewifi.k;
import com.tencent.mm.plugin.freewifi.k.a;
import com.tencent.mm.plugin.freewifi.k.b;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.ui.FreeWifiNetCheckUI;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;

public final class b
{
  private static String TAG = "MicroMsg.FreeWifi.Protocol31Entry";
  
  public static void J(Intent paramIntent)
  {
    boolean bool1 = true;
    if (paramIntent == null) {}
    Object localObject;
    do
    {
      return;
      localObject = paramIntent.getStringExtra("free_wifi_ap_key");
    } while (m.isEmpty((String)localObject));
    int i = paramIntent.getIntExtra("free_wifi_threeone_startup_type", 0);
    if (2 == i) {
      i = 11;
    }
    for (;;)
    {
      label39:
      paramIntent.putExtra("free_wifi_channel_id", i);
      paramIntent.putExtra("ConstantsFreeWifi.FREE_WIFI_PROTOCOL_NUMBER", 31);
      m.d(paramIntent, paramIntent.getStringExtra("free_wifi_schema_ticket"));
      paramIntent.putExtra("ConstantsFreeWifi.FREE_WIFI_REPORT_WIFI_SERVER_ID", m.E(paramIntent) + "_" + m.G(paramIntent) + "_" + m.H(paramIntent) + "_" + System.currentTimeMillis());
      boolean bool2 = d.a.aPi().j(paramIntent.getIntExtra("free_wifi_threeone_startup_type", 0), paramIntent.getStringExtra("free_wifi_ap_key"), paramIntent.getStringExtra("free_wifi_schema_ticket"));
      k.a locala = k.aOa();
      locala.ssid = m.BS(TAG);
      locala.bssid = m.BT(TAG);
      locala.bIQ = ((String)localObject);
      locala.jid = paramIntent.getStringExtra("free_wifi_schema_ticket");
      locala.jie = m.G(paramIntent);
      locala.jif = k.b.jiy.jiQ;
      locala.jig = k.b.jiy.name;
      locala.bVU = m.H(paramIntent);
      if (bool2)
      {
        i = 0;
        label242:
        locala.result = i;
        localObject = locala.aOc();
        if (bool2) {
          break label396;
        }
      }
      for (;;)
      {
        ((k)localObject).b(paramIntent, bool1).aOb();
        x.i(TAG, "getLock = " + bool2);
        m.BV("type=" + paramIntent.getIntExtra("free_wifi_threeone_startup_type", 0) + ";getLock=" + bool2);
        if (!bool2) {
          break;
        }
        m.d(paramIntent, paramIntent.getStringExtra("free_wifi_schema_ticket"));
        paramIntent.setClass(ad.getContext(), FreeWifiNetCheckUI.class);
        paramIntent.addFlags(67108864);
        com.tencent.mm.bg.d.b(ad.getContext(), "freewifi", ".ui.FreeWifiEntryUI", paramIntent);
        return;
        if (3 == i)
        {
          i = 12;
          break label39;
        }
        if (4 != i) {
          break label401;
        }
        i = 13;
        break label39;
        i = -1;
        break label242;
        label396:
        bool1 = false;
      }
      label401:
      i = 1;
    }
  }
  
  public static b aPg()
  {
    return a.aPh();
  }
  
  private static final class a
  {
    private static b jkA = new b((byte)0);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/freewifi/e/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */