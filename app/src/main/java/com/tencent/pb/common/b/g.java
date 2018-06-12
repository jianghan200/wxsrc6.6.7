package com.tencent.pb.common.b;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import com.tencent.pb.common.c.c;
import com.tencent.pb.common.c.d;

public final class g
{
  private NetworkInfo cWU = null;
  private WifiInfo cWV = null;
  private int vcv = 1;
  
  public final boolean xy()
  {
    WifiInfo localWifiInfo1 = null;
    for (;;)
    {
      try
      {
        localObject2 = (ConnectivityManager)d.oSX.getSystemService("connectivity");
        if (localObject2 != null) {
          continue;
        }
        c.x("NetworkChangeMgr", new Object[] { "can't get ConnectivityManager" });
        this.vcv = 1;
        this.cWV = null;
        this.cWU = null;
        bool = true;
      }
      catch (Exception localException)
      {
        Object localObject2;
        c.x("NetworkChangeMgr", new Object[] { localException });
        this.vcv = 1;
        this.cWV = null;
        this.cWU = null;
        bool = true;
        continue;
        if (((NetworkInfo)localObject2).getType() != 1) {
          break label456;
        }
        localWifiInfo2 = ((WifiManager)d.oSX.getSystemService("wifi")).getConnectionInfo();
        i = 2;
        continue;
        if (i != 2) {
          continue;
        }
        if ((localWifiInfo2 == null) || (this.cWV == null) || (!this.cWV.getBSSID().equals(localWifiInfo2.getBSSID())) || (!this.cWV.getSSID().equals(localWifiInfo2.getSSID())) || (this.cWV.getNetworkId() != localWifiInfo2.getNetworkId())) {
          break label461;
        }
        bool = false;
        continue;
        if ((this.cWU == null) || (this.cWU.getExtraInfo() == null) || (((NetworkInfo)localObject2).getExtraInfo() == null) || (!this.cWU.getExtraInfo().equals(((NetworkInfo)localObject2).getExtraInfo())) || (this.cWU.getSubtype() != ((NetworkInfo)localObject2).getSubtype()) || (this.cWU.getType() != ((NetworkInfo)localObject2).getType())) {
          continue;
        }
        bool = false;
        continue;
        if ((this.cWU == null) || (this.cWU.getExtraInfo() != null) || (((NetworkInfo)localObject2).getExtraInfo() != null) || (this.cWU.getSubtype() != ((NetworkInfo)localObject2).getSubtype())) {
          continue;
        }
        j = this.cWU.getType();
        k = ((NetworkInfo)localObject2).getType();
        if (j != k) {
          continue;
        }
        bool = false;
        continue;
        bool = true;
        continue;
      }
      finally {}
      return bool;
      localObject2 = ((ConnectivityManager)localObject2).getActiveNetworkInfo();
      if (localObject2 != null) {
        continue;
      }
      this.vcv = 1;
      this.cWV = null;
      this.cWU = null;
      bool = true;
    }
    c.d("NetworkChangeMgr", new Object[] { "NetworkChangeMgr ", localObject2 });
    int i;
    if (!((NetworkInfo)localObject2).isConnected())
    {
      i = 1;
      label122:
      if (i != this.vcv) {
        break label443;
      }
      if (i != 1) {
        break label225;
      }
    }
    label225:
    label443:
    label456:
    label461:
    for (boolean bool = false;; bool = true)
    {
      this.vcv = i;
      this.cWV = localWifiInfo1;
      this.cWU = ((NetworkInfo)localObject2);
      break;
      WifiInfo localWifiInfo2;
      int j;
      int k;
      i = 3;
      break label122;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/pb/common/b/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */