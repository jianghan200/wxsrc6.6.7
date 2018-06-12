package com.tencent.mm.plugin.appbrand.b;

import android.app.Activity;
import android.content.BroadcastReceiver;
import java.lang.ref.WeakReference;

public abstract class d
{
  private final WeakReference<Activity> fjz;
  public final BroadcastReceiver rj = new d.1(this);
  
  public d(Activity paramActivity)
  {
    this.fjz = new WeakReference(paramActivity);
  }
  
  public abstract void acz();
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/b/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */