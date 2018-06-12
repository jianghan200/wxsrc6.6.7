package com.tencent.mm.remoteservice;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;
import java.util.List;

public final class d
{
  private Context context;
  private ServiceConnection hKe = new ServiceConnection()
  {
    public final void onServiceConnected(ComponentName paramAnonymousComponentName, IBinder paramAnonymousIBinder)
    {
      d.this.sCo = c.a.ac(paramAnonymousIBinder);
      paramAnonymousComponentName = (Runnable[])d.this.sCn.toArray(new Runnable[d.this.sCn.size()]);
      int j = paramAnonymousComponentName.length;
      int i = 0;
      while (i < j)
      {
        paramAnonymousComponentName[i].run();
        i += 1;
      }
      d.this.sCn.clear();
    }
    
    public final void onServiceDisconnected(ComponentName paramAnonymousComponentName)
    {
      d.this.sCo = null;
    }
  };
  List<Runnable> sCn = new LinkedList();
  c sCo;
  
  public d(Context paramContext)
  {
    this.context = paramContext;
  }
  
  public final void K(Runnable paramRunnable)
  {
    new StringBuilder("RemoteServiceProxy construct, thread id:").append(Thread.currentThread().getId());
    if (isConnected())
    {
      paramRunnable.run();
      return;
    }
    this.sCn.add(paramRunnable);
    paramRunnable = new Intent(this.context, RemoteService.class);
    this.context.bindService(paramRunnable, this.hKe, 1);
  }
  
  final void a(b paramb, String paramString, Bundle paramBundle)
  {
    if (isConnected()) {}
    try
    {
      this.sCo.a(paramb.getClass().getName(), paramString, paramBundle, paramb);
      return;
    }
    catch (RemoteException paramb)
    {
      x.e("MicroMsg.RemoteServiceProxy", "exception:%s", new Object[] { bi.i(paramb) });
    }
  }
  
  public final boolean isConnected()
  {
    return (this.sCo != null) && (this.sCo.asBinder().isBinderAlive());
  }
  
  public final void release()
  {
    if ((this.sCo != null) && (this.hKe != null))
    {
      this.context.unbindService(this.hKe);
      this.sCo = null;
    }
    this.context = null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/remoteservice/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */