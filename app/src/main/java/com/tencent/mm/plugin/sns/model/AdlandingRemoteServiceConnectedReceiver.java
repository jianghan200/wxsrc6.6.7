package com.tencent.mm.plugin.sns.model;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.content.d;

public class AdlandingRemoteServiceConnectedReceiver
  extends BroadcastReceiver
{
  private Runnable epp;
  
  public static void b(d paramd)
  {
    paramd.a(new Intent("com.tencnet.mm.action.adlanding.connected"));
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if ((paramIntent != null) && ("com.tencnet.mm.action.adlanding.connected".equals(paramIntent.getAction())) && (this.epp != null)) {
      this.epp.run();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/sns/model/AdlandingRemoteServiceConnectedReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */