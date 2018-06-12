package com.tencent.tencentmap.mapsdk.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class eg
  extends BroadcastReceiver
{
  eg(ef paramef) {}
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    try
    {
      el.a().a(new ef.b(this.a, paramIntent));
      return;
    }
    catch (Throwable paramContext) {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/eg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */