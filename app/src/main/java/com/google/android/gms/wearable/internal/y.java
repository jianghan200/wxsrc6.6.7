package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class y<T>
{
  private final Map<T, ap<T>> beL = new HashMap();
  
  public final void a(ao paramao)
  {
    synchronized (this.beL)
    {
      an.f localf = new an.f();
      Iterator localIterator = this.beL.entrySet().iterator();
      for (;;)
      {
        if (localIterator.hasNext())
        {
          Map.Entry localEntry = (Map.Entry)localIterator.next();
          ap localap = (ap)localEntry.getValue();
          if (localap == null) {
            continue;
          }
          localap.bfh = null;
          localap.bfi = null;
          localap.bfj = null;
          localap.bfk = null;
          localap.bfl = null;
          localap.bfm = null;
          localap.bfn = null;
          localap.bfo = null;
          boolean bool = paramao.isConnected();
          if (!bool) {
            continue;
          }
          try
          {
            ((x)paramao.pi()).a(localf, new RemoveListenerRequest(localap));
            if (Log.isLoggable("WearableClient", 2)) {
              new StringBuilder("disconnect: removed: ").append(localEntry.getKey()).append("/").append(localap);
            }
          }
          catch (RemoteException localRemoteException)
          {
            new StringBuilder("disconnect: Didn't remove: ").append(localEntry.getKey()).append("/").append(localap);
          }
        }
      }
    }
    this.beL.clear();
  }
  
  public final void u(IBinder paramIBinder)
  {
    synchronized (this.beL)
    {
      paramIBinder = x.a.t(paramIBinder);
      an.f localf = new an.f();
      Iterator localIterator = this.beL.entrySet().iterator();
      for (;;)
      {
        if (localIterator.hasNext())
        {
          Map.Entry localEntry = (Map.Entry)localIterator.next();
          ap localap = (ap)localEntry.getValue();
          try
          {
            paramIBinder.a(localf, new AddListenerRequest(localap));
            if (Log.isLoggable("WearableClient", 2)) {
              new StringBuilder("onPostInitHandler: added: ").append(localEntry.getKey()).append("/").append(localap);
            }
          }
          catch (RemoteException localRemoteException)
          {
            new StringBuilder("onPostInitHandler: Didn't add: ").append(localEntry.getKey()).append("/").append(localap);
          }
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/google/android/gms/wearable/internal/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */