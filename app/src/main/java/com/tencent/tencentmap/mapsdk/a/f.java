package com.tencent.tencentmap.mapsdk.a;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import android.util.SparseArray;
import java.lang.ref.WeakReference;

@TargetApi(14)
public final class f
  implements Application.ActivityLifecycleCallbacks
{
  private static SparseArray<WeakReference<Activity>> a = new SparseArray();
  
  private static void a(Activity paramActivity)
  {
    if ((paramActivity != null) && (a != null))
    {
      int i = paramActivity.hashCode();
      if (a.get(i) == null)
      {
        paramActivity = new WeakReference(paramActivity);
        a.put(i, paramActivity);
      }
    }
  }
  
  public final void onActivityCreated(Activity paramActivity, Bundle paramBundle)
  {
    a(paramActivity);
  }
  
  public final void onActivityDestroyed(Activity paramActivity)
  {
    a.b = true;
    a(paramActivity);
  }
  
  public final void onActivityPaused(Activity paramActivity)
  {
    a.b = true;
    a(paramActivity);
  }
  
  public final void onActivityResumed(Activity paramActivity)
  {
    a.b = true;
    a(paramActivity);
  }
  
  public final void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle)
  {
    a.b = true;
    a(paramActivity);
  }
  
  public final void onActivityStarted(Activity paramActivity)
  {
    a.b = true;
    a(paramActivity);
  }
  
  public final void onActivityStopped(Activity paramActivity)
  {
    a.b = true;
    a(paramActivity);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */