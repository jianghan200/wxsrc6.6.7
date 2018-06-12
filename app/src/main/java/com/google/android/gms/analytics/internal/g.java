package com.google.android.gms.analytics.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.c.ah;
import com.google.android.gms.common.internal.w;

class g
  extends BroadcastReceiver
{
  static final String aFm = g.class.getName();
  final q aFn;
  boolean aFo;
  boolean aFp;
  
  g(q paramq)
  {
    w.ah(paramq);
    this.aFn = paramq;
  }
  
  final void mN()
  {
    this.aFn.nr();
    this.aFn.nt();
  }
  
  final boolean mO()
  {
    Object localObject = (ConnectivityManager)this.aFn.mContext.getSystemService("connectivity");
    try
    {
      localObject = ((ConnectivityManager)localObject).getActiveNetworkInfo();
      if (localObject != null)
      {
        boolean bool = ((NetworkInfo)localObject).isConnected();
        if (bool) {
          return true;
        }
      }
      return false;
    }
    catch (SecurityException localSecurityException) {}
    return false;
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    mN();
    paramContext = paramIntent.getAction();
    this.aFn.nr().d("NetworkBroadcastReceiver received action", paramContext);
    if ("android.net.conn.CONNECTIVITY_CHANGE".equals(paramContext))
    {
      boolean bool = mO();
      if (this.aFp != bool)
      {
        this.aFp = bool;
        paramContext = this.aFn.nt();
        paramContext.d("Network connectivity status changed", Boolean.valueOf(bool));
        paramContext.aFn.ns().d(new m.1(paramContext, bool));
      }
    }
    do
    {
      return;
      if (!"com.google.analytics.RADIO_POWERED".equals(paramContext)) {
        break;
      }
    } while (paramIntent.hasExtra(aFm));
    paramContext = this.aFn.nt();
    paramContext.aO("Radio powered up");
    paramContext.ni();
    return;
    this.aFn.nr().f("NetworkBroadcastReceiver received unknown action", paramContext);
  }
  
  public final void unregister()
  {
    if (!this.aFo) {
      return;
    }
    this.aFn.nr().aO("Unregistering connectivity change receiver");
    this.aFo = false;
    this.aFp = false;
    Context localContext = this.aFn.mContext;
    try
    {
      localContext.unregisterReceiver(this);
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      this.aFn.nr().g("Failed to unregister the network broadcast receiver", localIllegalArgumentException);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/google/android/gms/analytics/internal/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */