package com.tencent.mm.booter;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import com.tencent.mm.network.aa;
import com.tencent.mm.sdk.platformtools.x;

public final class e
{
  NetworkInfo cWU = null;
  WifiInfo cWV = null;
  
  final boolean xy()
  {
    try
    {
      Object localObject = (ConnectivityManager)aa.getContext().getSystemService("connectivity");
      if (localObject == null)
      {
        x.w("MicroMsg.NetworkChangeMgr", "can't get ConnectivityManager");
        this.cWU = null;
        this.cWV = null;
        return false;
      }
      try
      {
        localObject = ((ConnectivityManager)localObject).getActiveNetworkInfo();
        if (localObject == null)
        {
          x.w("MicroMsg.NetworkChangeMgr", "ActiveNetwork is null, has no network");
          this.cWU = null;
          this.cWV = null;
          return false;
        }
      }
      catch (Exception localException1)
      {
        for (;;)
        {
          x.e("MicroMsg.NetworkChangeMgr", "getActiveNetworkInfo failed.");
          localNetworkInfo = null;
        }
      }
      if (localNetworkInfo.getType() != 1) {
        break label423;
      }
      i = 1;
    }
    catch (Exception localException2)
    {
      for (;;)
      {
        NetworkInfo localNetworkInfo;
        x.printErrStackTrace("MicroMsg.NetworkChangeMgr", localException2, "", new Object[0]);
        break;
        WifiInfo localWifiInfo = null;
        continue;
        label423:
        int i = 0;
      }
    }
    if (i != 0)
    {
      localWifiInfo = ((WifiManager)aa.getContext().getSystemService("wifi")).getConnectionInfo();
      if ((localWifiInfo != null) && (this.cWV != null) && (this.cWV.getBSSID().equals(localWifiInfo.getBSSID())) && (this.cWV.getSSID().equals(localWifiInfo.getSSID())) && (this.cWV.getNetworkId() == localWifiInfo.getNetworkId()))
      {
        x.w("MicroMsg.NetworkChangeMgr", "Same Wifi, do not NetworkChanged");
        return false;
      }
      x.d("MicroMsg.NetworkChangeMgr", "New Wifi Info:%s", new Object[] { localWifiInfo });
      x.d("MicroMsg.NetworkChangeMgr", "OldWifi Info:%s", new Object[] { this.cWV });
      if (i == 0)
      {
        x.d("MicroMsg.NetworkChangeMgr", "New NetworkInfo:%s", new Object[] { localNetworkInfo });
        if (this.cWU != null) {
          x.d("MicroMsg.NetworkChangeMgr", "Old NetworkInfo:%s", new Object[] { this.cWU });
        }
      }
      this.cWU = localNetworkInfo;
      this.cWV = localWifiInfo;
    }
    else
    {
      if ((this.cWU != null) && (this.cWU.getExtraInfo() != null) && (localNetworkInfo.getExtraInfo() != null) && (this.cWU.getExtraInfo().equals(localNetworkInfo.getExtraInfo())) && (this.cWU.getSubtype() == localNetworkInfo.getSubtype()) && (this.cWU.getType() == localNetworkInfo.getType()))
      {
        x.w("MicroMsg.NetworkChangeMgr", "Same Network, do not NetworkChanged");
        return false;
      }
      if ((this.cWU != null) && (this.cWU.getExtraInfo() == null) && (localNetworkInfo.getExtraInfo() == null) && (this.cWU.getSubtype() == localNetworkInfo.getSubtype()) && (this.cWU.getType() == localNetworkInfo.getType()))
      {
        x.w("MicroMsg.NetworkChangeMgr", "Same Network, do not NetworkChanged");
        return false;
      }
    }
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/booter/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */