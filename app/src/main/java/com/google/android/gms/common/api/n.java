package com.google.android.gms.common.api;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public final class n
  implements p
{
  private final o aKG;
  
  public n(o paramo)
  {
    this.aKG = paramo;
  }
  
  public final <A extends a.b, R extends g, T extends k.a<R, A>> T a(T paramT)
  {
    this.aKG.aLq.add(paramT);
    return paramT;
  }
  
  public final void a(ConnectionResult paramConnectionResult, a<?> parama, int paramInt) {}
  
  public final <A extends a.b, T extends k.a<? extends g, A>> T b(T paramT)
  {
    throw new IllegalStateException("GoogleApiClient is not connected yet.");
  }
  
  public final void begin()
  {
    Iterator localIterator = this.aKG.aLw.values().iterator();
    while (localIterator.hasNext()) {
      ((a.b)localIterator.next()).disconnect();
    }
    this.aKG.aLy = Collections.emptySet();
  }
  
  public final void connect()
  {
    o localo = this.aKG;
    localo.aKI.lock();
    try
    {
      localo.aLz = new m(localo, localo.aKX, localo.aKY, localo.aKf, localo.aKg, localo.aKI, localo.mContext);
      localo.aLz.begin();
      localo.aLo.signalAll();
      return;
    }
    finally
    {
      localo.aKI.unlock();
    }
  }
  
  public final void disconnect()
  {
    Iterator localIterator = this.aKG.aLq.iterator();
    while (localIterator.hasNext()) {
      ((o.e)localIterator.next()).cancel();
    }
    this.aKG.aLq.clear();
    this.aKG.aLx.clear();
    this.aKG.oR();
  }
  
  public final void dm(int paramInt) {}
  
  public final void e(Bundle paramBundle) {}
  
  public final String getName()
  {
    return "DISCONNECTED";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/google/android/gms/common/api/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */