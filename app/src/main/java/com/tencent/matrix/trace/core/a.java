package com.tencent.matrix.trace.core;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import java.util.Iterator;
import java.util.LinkedList;

public final class a
  implements Application.ActivityLifecycleCallbacks
{
  private static a btq;
  private final LinkedList<a> btr;
  private boolean bts;
  private String btt;
  private Runnable btu;
  private boolean mIsPaused;
  private final Handler mMainHandler;
  
  private a(Application paramApplication)
  {
    if (paramApplication != null)
    {
      paramApplication.unregisterActivityLifecycleCallbacks(this);
      paramApplication.registerActivityLifecycleCallbacks(this);
    }
    this.btr = new LinkedList();
    this.mMainHandler = new Handler(Looper.getMainLooper());
  }
  
  public static void b(Application paramApplication)
  {
    if (btq == null) {
      btq = new a(paramApplication);
    }
  }
  
  private static String d(Activity paramActivity)
  {
    return paramActivity.getClass().getName() + paramActivity.hashCode();
  }
  
  public static a tE()
  {
    return btq;
  }
  
  public final void a(a parama)
  {
    if (this.btr != null) {
      this.btr.add(parama);
    }
  }
  
  public final void b(a parama)
  {
    if (this.btr != null) {
      this.btr.remove(parama);
    }
  }
  
  public final void onActivityCreated(Activity paramActivity, Bundle paramBundle)
  {
    paramBundle = this.btr.iterator();
    while (paramBundle.hasNext()) {
      ((a)paramBundle.next()).onActivityCreated(paramActivity);
    }
  }
  
  public final void onActivityDestroyed(Activity paramActivity)
  {
    if (d(paramActivity).equals(this.btt)) {
      this.btt = null;
    }
  }
  
  public final void onActivityPaused(final Activity paramActivity)
  {
    Object localObject = this.btr.iterator();
    while (((Iterator)localObject).hasNext()) {
      ((a)((Iterator)localObject).next()).onActivityPause(paramActivity);
    }
    this.mIsPaused = true;
    if (this.btu != null) {
      this.mMainHandler.removeCallbacks(this.btu);
    }
    localObject = this.mMainHandler;
    paramActivity = new Runnable()
    {
      public final void run()
      {
        if ((a.b(a.this)) && (a.c(a.this)))
        {
          a.d(a.this);
          Iterator localIterator = a.a(a.this).iterator();
          while (localIterator.hasNext()) {
            ((a.a)localIterator.next()).onBackground(paramActivity);
          }
        }
      }
    };
    this.btu = paramActivity;
    ((Handler)localObject).postDelayed(paramActivity, 600L);
  }
  
  public final void onActivityResumed(final Activity paramActivity)
  {
    final boolean bool = false;
    this.mIsPaused = false;
    if (!this.bts) {
      bool = true;
    }
    this.bts = true;
    Object localObject = d(paramActivity);
    if (!((String)localObject).equals(this.btt))
    {
      Iterator localIterator = this.btr.iterator();
      while (localIterator.hasNext()) {
        ((a)localIterator.next()).onChange(paramActivity, null);
      }
      this.btt = ((String)localObject);
    }
    localObject = this.mMainHandler;
    paramActivity = new Runnable()
    {
      public final void run()
      {
        if (bool)
        {
          Iterator localIterator = a.a(a.this).iterator();
          while (localIterator.hasNext()) {
            ((a.a)localIterator.next()).onFront(paramActivity);
          }
        }
      }
    };
    this.btu = paramActivity;
    ((Handler)localObject).postDelayed(paramActivity, 600L);
  }
  
  public final void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle) {}
  
  public final void onActivityStarted(Activity paramActivity)
  {
    Iterator localIterator = this.btr.iterator();
    while (localIterator.hasNext()) {
      ((a)localIterator.next()).onActivityStarted(paramActivity);
    }
  }
  
  public final void onActivityStopped(Activity paramActivity) {}
  
  public static abstract interface a
  {
    public abstract void onActivityCreated(Activity paramActivity);
    
    public abstract void onActivityPause(Activity paramActivity);
    
    public abstract void onActivityStarted(Activity paramActivity);
    
    public abstract void onBackground(Activity paramActivity);
    
    public abstract void onChange(Activity paramActivity, Fragment paramFragment);
    
    public abstract void onFront(Activity paramActivity);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/matrix/trace/core/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */