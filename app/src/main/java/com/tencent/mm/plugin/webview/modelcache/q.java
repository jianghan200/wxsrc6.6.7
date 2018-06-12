package com.tencent.mm.plugin.webview.modelcache;

import android.os.HandlerThread;
import android.util.SparseArray;
import com.tencent.mm.g.a.tu;
import com.tencent.mm.model.au;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Iterator;
import java.util.Set;

public final class q
{
  private volatile ah dJt;
  private final Object gBw = new Object();
  public final com.tencent.mm.sdk.b.c pTk = new com.tencent.mm.sdk.b.c() {};
  public final com.tencent.mm.sdk.b.c pTl = new q.2(this);
  private volatile i pTm;
  final SparseArray<l> pTn = new SparseArray();
  public final c pTo = new c();
  final e pTp = new e();
  public final byte[] pTq = new byte[0];
  public final SparseArray<Set<Object>> pTr = new SparseArray();
  
  public final void Ar(int paramInt)
  {
    if (au.HX()) {
      try
      {
        a.bUL().pTp.Ao(paramInt);
        synchronized (this.pTq)
        {
          Object localObject2 = (Set)this.pTr.get(paramInt);
          if ((localObject2 != null) && (((Set)localObject2).size() > 0))
          {
            ??? = ((Set)localObject2).iterator();
            if (((Iterator)???).hasNext())
            {
              ((Iterator)???).next();
              if (this.pTm == null) {
                this.pTm = new i();
              }
              localObject2 = this.pTm;
            }
          }
        }
        return;
      }
      catch (Exception localException)
      {
        x.e("MicroMsg.WebViewCacheWorkerManager", "onWebViewUIDestroy, accHasReady, but occurred exception = %s", new Object[] { localException });
      }
    }
  }
  
  public final ah Em()
  {
    if (this.dJt == null) {}
    synchronized (this.gBw)
    {
      if (this.dJt == null) {
        this.dJt = new q.3(this, "WebViewCacheWorkerManager#WorkerThread");
      }
      return this.dJt;
    }
  }
  
  public final void release(boolean paramBoolean)
  {
    int i = 0;
    while (i < this.pTn.size())
    {
      this.pTn.valueAt(i);
      i += 1;
    }
    this.pTn.clear();
    a.clearCache();
    if (this.dJt == null) {
      return;
    }
    synchronized (this.gBw)
    {
      if (this.dJt == null) {
        return;
      }
    }
    if (paramBoolean)
    {
      this.dJt.lnJ.quit();
      return;
    }
    ah localah = this.dJt;
    this.dJt.H(new q.4(this, localah));
    this.dJt = null;
  }
  
  private static final class a
  {
    private static final q pTz = new q((byte)0);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/webview/modelcache/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */