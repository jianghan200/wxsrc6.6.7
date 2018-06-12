package c.t.m.g;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public final class dh
  extends BroadcastReceiver
{
  final ct a;
  boolean b;
  
  public dh(ct paramct)
  {
    this.a = paramct;
  }
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    if (paramIntent == null) {
      return;
    }
    try
    {
      if (paramIntent.getBooleanExtra("noConnectivity", false))
      {
        this.a.c(Integer.valueOf(-1));
        return;
      }
      if (j.b(paramContext))
      {
        this.a.c(Integer.valueOf(1));
        return;
      }
      this.a.c(Integer.valueOf(0));
      return;
    }
    catch (Exception paramContext) {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/c/t/m/g/dh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */