package com.tencent.mm.plugin.appbrand.b;

import android.app.Activity;
import android.content.BroadcastReceiver;
import java.lang.ref.WeakReference;

public abstract class e
{
  public final BroadcastReceiver fjD = new e.1(this);
  final WeakReference<Activity> fjz;
  
  public e(Activity paramActivity)
  {
    this.fjz = new WeakReference(paramActivity);
  }
  
  public abstract void acA();
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/b/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */