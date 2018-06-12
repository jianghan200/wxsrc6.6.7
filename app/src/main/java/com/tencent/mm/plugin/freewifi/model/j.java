package com.tencent.mm.plugin.freewifi.model;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.RemoteException;
import com.tencent.mm.bt.h.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ar;
import com.tencent.mm.model.au;
import com.tencent.mm.model.bs;
import com.tencent.mm.model.bv;
import com.tencent.mm.model.bv.a;
import com.tencent.mm.network.n;
import com.tencent.mm.plugin.freewifi.g.f;
import com.tencent.mm.plugin.freewifi.k;
import com.tencent.mm.plugin.freewifi.k.a;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;

public final class j
  implements ar
{
  private static HashMap<Integer, h.d> cVM;
  private com.tencent.mm.sdk.b.c bannerOnInitListener = new com.tencent.mm.sdk.b.c() {};
  private bv.a iwx = new j.4(this);
  private volatile d jke;
  private volatile com.tencent.mm.plugin.freewifi.g.d jkf;
  private volatile com.tencent.mm.plugin.freewifi.g.b jkg;
  private volatile f jkh;
  private volatile c jki;
  private volatile c jkj;
  private volatile a jkk;
  private volatile e jkl;
  private n jkm = new j.7(this);
  private com.tencent.mm.sdk.b.c jkn = new j.8(this);
  private com.tencent.mm.sdk.b.c jko = new j.9(this);
  private com.tencent.mm.sdk.b.c jkp = new j.10(this);
  private com.tencent.mm.sdk.b.c jkq = new j.11(this);
  private com.tencent.mm.sdk.b.c jkr = new j.12(this);
  private com.tencent.mm.sdk.b.c jks = new j.2(this);
  
  static
  {
    HashMap localHashMap = new HashMap();
    cVM = localHashMap;
    localHashMap.put(Integer.valueOf("FREEWIFIINFO_TABLE".hashCode()), new j.1());
    cVM.put(Integer.valueOf("FREEWIFICONFIG_TABLE".hashCode()), new j.5());
    cVM.put(Integer.valueOf("FREEWIFILOG_TABLE".hashCode()), new j.6());
  }
  
  public static j aOI()
  {
    au.HN();
    j localj2 = (j)bs.iK("plugin.freewifi");
    j localj1 = localj2;
    if (localj2 == null)
    {
      x.w("MicroMsg.FreeWifi.SubCoreFreeWifi", "not found in MMCore, new one");
      localj1 = new j();
      au.HN().a("plugin.freewifi", localj1);
    }
    return localj1;
  }
  
  public static d aOJ()
  {
    g.Eg().Ds();
    if (aOI().jke == null) {
      aOI().jke = new d();
    }
    return aOI().jke;
  }
  
  public static com.tencent.mm.plugin.freewifi.g.d aOK()
  {
    g.Eg().Ds();
    if (aOI().jkf == null)
    {
      j localj = aOI();
      au.HU();
      localj.jkf = new com.tencent.mm.plugin.freewifi.g.d(com.tencent.mm.model.c.FO());
    }
    return aOI().jkf;
  }
  
  public static com.tencent.mm.plugin.freewifi.g.b aOL()
  {
    g.Eg().Ds();
    if (aOI().jkg == null)
    {
      j localj = aOI();
      au.HU();
      localj.jkg = new com.tencent.mm.plugin.freewifi.g.b(com.tencent.mm.model.c.FO());
    }
    return aOI().jkg;
  }
  
  public static f aOM()
  {
    g.Eg().Ds();
    if (aOI().jkh == null)
    {
      j localj = aOI();
      au.HU();
      localj.jkh = new f(com.tencent.mm.model.c.FO());
    }
    return aOI().jkh;
  }
  
  public static c aON()
  {
    g.Eg().Ds();
    if (aOI().jki == null) {
      aOI().jki = new c();
    }
    return aOI().jki;
  }
  
  public static c aOO()
  {
    g.Eg().Ds();
    if (aOI().jkj == null) {
      aOI().jkj = new c();
    }
    return aOI().jkj;
  }
  
  public static a aOP()
  {
    try
    {
      g.Eg().Ds();
      if (aOI().jkk == null) {
        aOI().jkk = new a();
      }
      a locala = aOI().jkk;
      return locala;
    }
    finally {}
  }
  
  public static e aOQ()
  {
    g.Eg().Ds();
    if (aOI().jkl == null) {
      aOI().jkl = new e();
    }
    return aOI().jkl;
  }
  
  public final HashMap<Integer, h.d> Ci()
  {
    return cVM;
  }
  
  public final void bn(boolean paramBoolean)
  {
    au.getSysCmdMsgExtension().a("freewifi", this.iwx, true);
    au.a(this.jkm);
    com.tencent.mm.sdk.b.a.sFg.b(this.jkn);
    com.tencent.mm.sdk.b.a.sFg.b(this.jko);
    com.tencent.mm.sdk.b.a.sFg.b(this.jkp);
    com.tencent.mm.sdk.b.a.sFg.b(this.jkq);
    com.tencent.mm.sdk.b.a.sFg.b(this.jkr);
    com.tencent.mm.sdk.b.a.sFg.b(this.jks);
    com.tencent.mm.sdk.b.a.sFg.b(this.bannerOnInitListener);
    try
    {
      this.jkm.ev(-9);
      b localb = b.b.aOu();
      x.i("MicroMsg.FreeWifi.FreeWifiConnChangedManager", "initialized");
      try
      {
        localObject1 = (ConnectivityManager)com.tencent.mm.sdk.platformtools.ad.getContext().getSystemService("connectivity");
        localObject2 = ((ConnectivityManager)localObject1).getNetworkInfo(1);
        x.i("MicroMsg.FreeWifi.FreeWifiConnChangedManager", "networkInfoWifi=%s", new Object[] { ((NetworkInfo)localObject2).toString() });
        if ((localObject2 == null) || (!((NetworkInfo)localObject2).isConnected())) {
          break label338;
        }
        localObject2 = ((WifiManager)com.tencent.mm.sdk.platformtools.ad.getContext().getSystemService("wifi")).getConnectionInfo();
        localObject1 = m.BQ(((WifiInfo)localObject2).getSSID());
        localObject2 = m.BR(((WifiInfo)localObject2).getBSSID()).toLowerCase();
        b.a locala = new b.a((byte)0);
        locala.jjF = System.currentTimeMillis();
        locala.type = 1;
        locala.ssid = ((String)localObject1);
        locala.bssid = ((String)localObject2);
        locala.jjG = "";
        b.b(localb.jjC.aOt(), locala);
        localb.jjC = locala;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          Object localObject1;
          Object localObject2 = k.aOa();
          ((k.a)localObject2).bIQ = "UnExpectedException";
          ((k.a)localObject2).result = -1;
          ((k.a)localObject2).hKX = m.g(localException);
          ((k.a)localObject2).aOc().aOb();
          x.e("MicroMsg.FreeWifi.UnExcepctedException", m.h(localException));
        }
      }
      localObject1 = new IntentFilter();
      ((IntentFilter)localObject1).addAction("android.net.conn.CONNECTIVITY_CHANGE");
      localb.aNO();
      com.tencent.mm.sdk.platformtools.ad.getContext().registerReceiver(localb.jjD, (IntentFilter)localObject1);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        x.e("MicroMsg.FreeWifi.SubCoreFreeWifi", "netChanged.onNetworkChange(NETWORK_ACCOUNT_POST_RESET) error. e.getMessage()=" + localRemoteException.getMessage());
        continue;
        label338:
        localObject1 = ((ConnectivityManager)localObject1).getNetworkInfo(0);
        x.i("MicroMsg.FreeWifi.FreeWifiConnChangedManager", "networkInfoMobile=%s", new Object[] { ((NetworkInfo)localObject1).toString() });
        if ((localObject1 != null) && (((NetworkInfo)localObject1).isConnected()))
        {
          localObject2 = new b.a((byte)0);
          ((b.a)localObject2).jjF = System.currentTimeMillis();
          ((b.a)localObject2).type = 0;
          ((b.a)localObject2).ssid = "";
          ((b.a)localObject2).bssid = "";
          ((b.a)localObject2).jjG = m.BR(((NetworkInfo)localObject1).getExtraInfo());
          b.a(localRemoteException.jjC.aOt(), (b.a)localObject2);
          localRemoteException.jjC = ((b.a)localObject2);
        }
      }
    }
  }
  
  public final void bo(boolean paramBoolean) {}
  
  public final void gi(int paramInt) {}
  
  public final void onAccountRelease()
  {
    au.getSysCmdMsgExtension().b("freewifi", this.iwx, true);
    aOJ();
    d.release();
    aON().release();
    au.b(this.jkm);
    com.tencent.mm.sdk.b.a.sFg.c(this.jkn);
    com.tencent.mm.sdk.b.a.sFg.c(this.jko);
    com.tencent.mm.sdk.b.a.sFg.c(this.jkp);
    com.tencent.mm.sdk.b.a.sFg.c(this.jkq);
    com.tencent.mm.sdk.b.a.sFg.c(this.jkr);
    com.tencent.mm.sdk.b.a.sFg.c(this.jks);
    com.tencent.mm.sdk.b.a.sFg.c(this.bannerOnInitListener);
    b.b.aOu().aNO();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/freewifi/model/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */