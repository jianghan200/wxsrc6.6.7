package com.google.android.gms.common.api;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.w;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public final class l
  implements p
{
  private final o aKG;
  
  public l(o paramo)
  {
    this.aKG = paramo;
  }
  
  private <A extends a.b> void a(o.e<A> parame)
  {
    this.aKG.b(parame);
    Object localObject = this.aKG;
    a.c localc = parame.os();
    localObject = (a.b)((o)localObject).aLw.get(localc);
    w.j(localObject, "Appropriate Api was not requested.");
    if ((!((a.b)localObject).isConnected()) && (this.aKG.aLx.containsKey(parame.os())))
    {
      parame.c(new Status(17));
      return;
    }
    parame.a((a.b)localObject);
  }
  
  public final <A extends a.b, R extends g, T extends k.a<R, A>> T a(T paramT)
  {
    return b(paramT);
  }
  
  public final void a(ConnectionResult paramConnectionResult, a<?> parama, int paramInt) {}
  
  public final <A extends a.b, T extends k.a<? extends g, A>> T b(T paramT)
  {
    try
    {
      a(paramT);
      return paramT;
    }
    catch (DeadObjectException localDeadObjectException)
    {
      this.aKG.a(new l.1(this, this));
    }
    return paramT;
  }
  
  public final void begin()
  {
    while (!this.aKG.aLq.isEmpty()) {
      try
      {
        a((o.e)this.aKG.aLq.remove());
      }
      catch (DeadObjectException localDeadObjectException) {}
    }
  }
  
  public final void connect() {}
  
  public final void disconnect()
  {
    this.aKG.aLx.clear();
    this.aKG.oR();
    this.aKG.f(null);
    this.aKG.aLp.pm();
  }
  
  public final void dm(int paramInt)
  {
    if (paramInt == 1)
    {
      localObject = this.aKG;
      if (!((o)localObject).aLr)
      {
        ((o)localObject).aLr = true;
        if (((o)localObject).aLv == null)
        {
          ((o)localObject).aLv = new o.c((o)localObject);
          IntentFilter localIntentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
          localIntentFilter.addDataScheme("package");
          ((o)localObject).mContext.getApplicationContext().registerReceiver(((o)localObject).aLv, localIntentFilter);
        }
        ((o)localObject).aLu.sendMessageDelayed(((o)localObject).aLu.obtainMessage(1), ((o)localObject).aLs);
        ((o)localObject).aLu.sendMessageDelayed(((o)localObject).aLu.obtainMessage(2), ((o)localObject).aLt);
      }
    }
    Object localObject = this.aKG.aLC.iterator();
    while (((Iterator)localObject).hasNext()) {
      ((o.e)((Iterator)localObject).next()).a(new Status(8, "The connection to Google Play services was lost"));
    }
    this.aKG.f(null);
    this.aKG.aLp.dt(paramInt);
    this.aKG.aLp.pm();
    if (paramInt == 2) {
      this.aKG.connect();
    }
  }
  
  public final void e(Bundle paramBundle) {}
  
  public final String getName()
  {
    return "CONNECTED";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/google/android/gms/common/api/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */