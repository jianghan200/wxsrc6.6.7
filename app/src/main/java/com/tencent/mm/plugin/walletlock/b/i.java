package com.tencent.mm.plugin.walletlock.b;

import android.app.Activity;
import com.tencent.mm.sdk.platformtools.x;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;

public enum i
{
  private Object pIA = new Object();
  public HashSet<WeakReference<Activity>> pIB = new HashSet();
  private boolean pIy = false;
  private boolean pIz = false;
  
  private i() {}
  
  public final void b(WeakReference<Activity> paramWeakReference)
  {
    if (this.pIB != null)
    {
      if (paramWeakReference.get() != null) {
        x.v("MicroMsg.WalletLockStatusManager", "alvinluo addProtectActivity %s", new Object[] { ((Activity)paramWeakReference.get()).getClass().getName() });
      }
      this.pIB.add(paramWeakReference);
    }
  }
  
  public final boolean bSf()
  {
    synchronized (this.pIA)
    {
      boolean bool = this.pIy;
      return bool;
    }
  }
  
  public final boolean bSg()
  {
    synchronized (this.pIA)
    {
      boolean bool = this.pIz;
      return bool;
    }
  }
  
  public final void bSh()
  {
    synchronized (this.pIA)
    {
      this.pIz = true;
      return;
    }
  }
  
  public final void bSi()
  {
    Iterator localIterator = this.pIB.iterator();
    while (localIterator.hasNext())
    {
      Activity localActivity = (Activity)((WeakReference)localIterator.next()).get();
      if ((localActivity != null) && (!localActivity.isFinishing()))
      {
        x.v("MicroMsg.WalletLockStatusManager", "alvinluo finish %s", new Object[] { localActivity.getClass().getName() });
        localActivity.finish();
      }
      localIterator.remove();
    }
  }
  
  public final void jM(boolean paramBoolean)
  {
    synchronized (this.pIA)
    {
      this.pIy = paramBoolean;
      return;
    }
  }
  
  public final void jN(boolean paramBoolean)
  {
    synchronized (this.pIA)
    {
      this.pIz = paramBoolean;
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/walletlock/b/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */