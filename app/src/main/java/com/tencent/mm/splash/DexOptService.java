package com.tencent.mm.splash;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;

public class DexOptService
  extends Service
{
  private HandlerThread mHandlerThread = new HandlerThread("DexOpt-Thread");
  private Handler sMq;
  private volatile boolean sMr = false;
  private Handler sMs = new Handler()
  {
    public final void handleMessage(Message paramAnonymousMessage)
    {
      h.b("WxSplash.DexOptService", "dexopt process quit.", new Object[0]);
      DexOptService.this.stopSelf();
    }
  };
  private volatile Throwable sMt;
  
  private boolean cjS()
  {
    h.b("WxSplash.DexOptService", "doDexOpt start", new Object[0]);
    try
    {
      bool = h.sMA.aY(getApplicationContext());
      h.b("WxSplash.DexOptService", "schedule to quit", new Object[0]);
      this.sMs.removeCallbacksAndMessages(null);
      this.sMs.sendEmptyMessageDelayed(0, 120000L);
      h.b("WxSplash.DexOptService", "doDexOpt done, result %s", new Object[] { Boolean.valueOf(bool) });
      return bool;
    }
    catch (Throwable localThrowable)
    {
      for (;;)
      {
        this.sMt = localThrowable;
        boolean bool = false;
      }
    }
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    h.b("WxSplash.DexOptService", "onBind", new Object[0]);
    return null;
  }
  
  public void onCreate()
  {
    h.b("WxSplash.DexOptService", "onCreate", new Object[0]);
    super.onCreate();
    this.mHandlerThread.start();
    this.sMq = new Handler(this.mHandlerThread.getLooper())
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        if (DexOptService.a(DexOptService.this))
        {
          h.b("WxSplash.DexOptService", "dex opt progressing.", new Object[0]);
          return;
        }
        DexOptService.a(DexOptService.this, true);
        if (DexOptService.b(DexOptService.this)) {
          DexOptService.bwD();
        }
        for (;;)
        {
          DexOptService.aSp();
          DexOptService.a(DexOptService.this, false);
          return;
          DexOptService.Jv();
          DexOptService.c(DexOptService.this);
        }
      }
    };
  }
  
  public void onDestroy()
  {
    h.b("WxSplash.DexOptService", "onDestroy", new Object[0]);
    super.onDestroy();
  }
  
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    this.sMq.sendEmptyMessage(0);
    h.b("WxSplash.DexOptService", "onStartCommand", new Object[0]);
    return super.onStartCommand(paramIntent, paramInt1, paramInt2);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/splash/DexOptService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */