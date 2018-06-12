package com.tencent.mm.ipcinvoker;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.tencent.mm.ipcinvoker.b.a.a;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class BaseIPCService
  extends Service
{
  private volatile boolean dlZ;
  private volatile boolean dma;
  private a.a dmb = new a.a()
  {
    public final void a(Bundle paramAnonymousBundle, String paramAnonymousString, com.tencent.mm.ipcinvoker.b.b paramAnonymousb)
    {
      if ((paramAnonymousString == null) || (paramAnonymousString.length() == 0))
      {
        com.tencent.mm.ipcinvoker.h.b.e("IPC.BaseIPCService", "invokeAsync failed, class is null or nil.", new Object[0]);
        return;
      }
      if (paramAnonymousBundle == null)
      {
        com.tencent.mm.ipcinvoker.h.b.e("IPC.BaseIPCService", "invokeAsync failed, data is null.", new Object[0]);
        return;
      }
      paramAnonymousBundle.setClassLoader(BaseIPCService.class.getClassLoader());
      paramAnonymousBundle = paramAnonymousBundle.getParcelable("__remote_task_data");
      a locala = (a)j.d(paramAnonymousString, a.class);
      if (locala == null)
      {
        com.tencent.mm.ipcinvoker.h.b.e("IPC.BaseIPCService", "invokeAsync failed, can not newInstance by class %s.", new Object[] { paramAnonymousString });
        return;
      }
      l.post(new BaseIPCService.1.1(this, locala, paramAnonymousBundle, paramAnonymousb));
    }
    
    public final Bundle d(Bundle paramAnonymousBundle, String paramAnonymousString)
    {
      if ((paramAnonymousString == null) || (paramAnonymousString.length() == 0))
      {
        com.tencent.mm.ipcinvoker.h.b.e("IPC.BaseIPCService", "invokeSync failed, class is null or nil.", new Object[0]);
        return null;
      }
      if (paramAnonymousBundle == null)
      {
        com.tencent.mm.ipcinvoker.h.b.e("IPC.BaseIPCService", "invokeSync failed, data is null.", new Object[0]);
        return null;
      }
      i locali = (i)j.d(paramAnonymousString, i.class);
      if (locali == null)
      {
        com.tencent.mm.ipcinvoker.h.b.e("IPC.BaseIPCService", "invokeSync failed, can not newInstance by class %s.", new Object[] { paramAnonymousString });
        return null;
      }
      paramAnonymousBundle.setClassLoader(BaseIPCService.class.getClassLoader());
      paramAnonymousBundle = paramAnonymousBundle.getParcelable("__remote_task_data");
      paramAnonymousString = new Bundle();
      paramAnonymousString.putParcelable("__remote_task_result_data", (Parcelable)locali.av(paramAnonymousBundle));
      return paramAnonymousString;
    }
  };
  
  public final void bp(boolean paramBoolean)
  {
    if ((this.dma) && (!paramBoolean))
    {
      com.tencent.mm.ipcinvoker.h.b.i("IPC.BaseIPCService", "abort kill self(%s), the service was connected by other process.", new Object[] { getProcessName() });
      return;
    }
    com.tencent.mm.ipcinvoker.h.b.i("IPC.BaseIPCService", "kill self(%s)", new Object[] { getProcessName() });
    this.dlZ = true;
    b.Cq().Cr();
    Object localObject1 = b.Cq();
    com.tencent.mm.ipcinvoker.h.b.i("IPC.IPCBridgeManager", "releaseAllIPCBridge", new Object[0]);
    if (!((b)localObject1).dmm.isEmpty()) {}
    synchronized (((b)localObject1).dmm)
    {
      if (((b)localObject1).dmm.isEmpty()) {}
      do
      {
        HashSet localHashSet;
        do
        {
          stopSelf();
          localObject1 = h.Ct();
          ??? = getProcessName();
          ((h)localObject1).dmG.remove(???);
          l.i(new BaseIPCService.2(this));
          return;
          localHashSet = new HashSet(((b)localObject1).dmm.keySet());
        } while (localHashSet.isEmpty());
        ??? = localHashSet.iterator();
      } while (!((Iterator)???).hasNext());
      ((b)localObject1).fB((String)((Iterator)???).next());
    }
  }
  
  public abstract String getProcessName();
  
  public IBinder onBind(Intent paramIntent)
  {
    com.tencent.mm.ipcinvoker.h.b.i("IPC.BaseIPCService", "onBind(%s), killSelf(%s)", new Object[] { paramIntent, Boolean.valueOf(this.dlZ) });
    if (this.dlZ)
    {
      com.tencent.mm.ipcinvoker.h.b.i("IPC.BaseIPCService", "need to kill self, return null Binder object.", new Object[0]);
      return null;
    }
    paramIntent = h.Ct();
    String str = e.Cs();
    if ((str == null) || (str.length() == 0) || (this == null)) {}
    for (;;)
    {
      this.dma = true;
      return this.dmb;
      paramIntent.dmG.put(str, this);
    }
  }
  
  public boolean onUnbind(Intent paramIntent)
  {
    com.tencent.mm.ipcinvoker.h.b.i("IPC.BaseIPCService", "onUnbind(%s)", new Object[] { paramIntent });
    boolean bool = super.onUnbind(paramIntent);
    this.dma = false;
    return bool;
  }
  
  private static final class a
    implements c<Parcelable>, com.tencent.mm.ipcinvoker.e.a
  {
    com.tencent.mm.ipcinvoker.b.b dmh;
    final List<com.tencent.mm.ipcinvoker.e.b> dmi = new LinkedList();
    
    public a(com.tencent.mm.ipcinvoker.b.b paramb)
    {
      this.dmh = paramb;
      if (paramb != null)
      {
        com.tencent.mm.ipcinvoker.h.b.i("IPC.IPCInvokeCallbackProxy", "keep ref of callback(%s)", new Object[] { Integer.valueOf(paramb.hashCode()) });
        com.tencent.mm.ipcinvoker.f.b.ay(paramb);
      }
    }
    
    public final void a(com.tencent.mm.ipcinvoker.e.b paramb)
    {
      if (paramb == null) {
        return;
      }
      synchronized (this.dmi)
      {
        if (this.dmi.contains(paramb)) {
          return;
        }
      }
      this.dmi.add(paramb);
    }
    
    protected final void finalize()
    {
      try
      {
        com.tencent.mm.ipcinvoker.h.b.i("IPC.IPCInvokeCallbackProxy", "finalize(%s)", new Object[] { Integer.valueOf(hashCode()) });
        if (this.dmh != null)
        {
          com.tencent.mm.ipcinvoker.h.b.i("IPC.IPCInvokeCallbackProxy", "finalize, release callback(%s)", new Object[] { Integer.valueOf(this.dmh.hashCode()) });
          l.post(new a(this.dmh));
          this.dmh = null;
        }
        return;
      }
      finally
      {
        super.finalize();
      }
    }
    
    private static final class a
      implements Runnable
    {
      private static final Bundle dmj;
      com.tencent.mm.ipcinvoker.b.b dmh;
      
      static
      {
        Bundle localBundle = new Bundle();
        dmj = localBundle;
        localBundle.putBoolean("__command_release_ref", true);
      }
      
      a(com.tencent.mm.ipcinvoker.b.b paramb)
      {
        this.dmh = paramb;
      }
      
      public final void run()
      {
        try
        {
          com.tencent.mm.ipcinvoker.h.b.i("IPC.IPCInvokeCallbackProxy", "notify release ref of callback(%s).", new Object[] { Integer.valueOf(this.dmh.hashCode()) });
          this.dmh.i(dmj);
          com.tencent.mm.ipcinvoker.f.b.az(this.dmh);
          this.dmh = null;
          return;
        }
        catch (RemoteException localRemoteException)
        {
          com.tencent.mm.ipcinvoker.h.b.e("IPC.IPCInvokeCallbackProxy", "notify release ref error, %s", new Object[] { Log.getStackTraceString(localRemoteException) });
          return;
        }
        catch (Exception localException)
        {
          com.tencent.mm.ipcinvoker.h.b.e("IPC.IPCInvokeCallbackProxy", "notify release ref error, %s\n %s", new Object[] { localException.getMessage(), Log.getStackTraceString(localException) });
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/ipcinvoker/BaseIPCService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */