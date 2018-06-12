package com.tencent.mm.remoteservice;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.lang.reflect.Constructor;

public class RemoteService
  extends Service
{
  private c.a sCl = new c.a()
  {
    public final void a(String paramAnonymousString1, String paramAnonymousString2, Bundle paramAnonymousBundle, b paramAnonymousb)
    {
      try
      {
        Object localObject = RemoteService.this.getClassLoader().loadClass(paramAnonymousString1);
        paramAnonymousString1 = ((Class)localObject).getConstructors();
        if (paramAnonymousString1.length > 0)
        {
          localObject = new Object[paramAnonymousString1[0].getParameterTypes().length];
          localObject[0] = null;
        }
        for (paramAnonymousString1 = (a)paramAnonymousString1[0].newInstance((Object[])localObject);; paramAnonymousString1 = (a)((Class)localObject).newInstance())
        {
          paramAnonymousString1.sCi = paramAnonymousb;
          paramAnonymousString1.sCh = RemoteService.this;
          paramAnonymousString1.onCallback(paramAnonymousString2, paramAnonymousBundle, false);
          return;
        }
        return;
      }
      catch (Exception paramAnonymousString1)
      {
        x.e("MicroMsg.RemoveService", "exception:%s", new Object[] { bi.i(paramAnonymousString1) });
      }
    }
  };
  
  public IBinder onBind(Intent paramIntent)
  {
    new StringBuilder("onBind, threadId:").append(Thread.currentThread().getId());
    return this.sCl;
  }
  
  public void onDestroy()
  {
    new StringBuilder("onDestroy, threadId:").append(Thread.currentThread().getId());
    super.onDestroy();
  }
  
  public void onRebind(Intent paramIntent)
  {
    new StringBuilder("onRebind, threadId:").append(Thread.currentThread().getId());
    super.onRebind(paramIntent);
  }
  
  public boolean onUnbind(Intent paramIntent)
  {
    new StringBuilder("onUnbind, threadId:").append(Thread.currentThread().getId());
    return super.onUnbind(paramIntent);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/remoteservice/RemoteService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */