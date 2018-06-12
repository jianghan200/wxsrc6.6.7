package com.tencent.mm.splash;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;

public class SplashFallbackActivity
  extends Activity
{
  private Handler mHandler;
  private Runnable sMT = new Runnable()
  {
    private long sMU = -1L;
    
    public final void run()
    {
      if (this.sMU == -1L) {
        this.sMU = System.currentTimeMillis();
      }
      if (!SplashFallbackActivity.ckj())
      {
        if (System.currentTimeMillis() - this.sMU >= 80000L)
        {
          h.b("MicroMsg.FallbackSplash", "checkIfMainProcessStartupDone timeout", new Object[0]);
          SplashFallbackActivity.this.finish();
          SplashFallbackActivity.this.overridePendingTransition(g.a.splash_no_anim, g.a.splash_faded_out);
          return;
        }
        SplashFallbackActivity.b(SplashFallbackActivity.this).postDelayed(SplashFallbackActivity.a(SplashFallbackActivity.this), 100L);
        return;
      }
      h.b("MicroMsg.FallbackSplash", "checkIfMainProcessStartupDone true", new Object[0]);
      SplashFallbackActivity.this.finish();
      SplashFallbackActivity.this.overridePendingTransition(g.a.splash_no_anim, g.a.splash_faded_out);
    }
  };
  
  public void onBackPressed()
  {
    h.b("MicroMsg.FallbackSplash", "block onBackPressed", new Object[0]);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    h.b("MicroMsg.FallbackSplash", "onCreate", new Object[0]);
    paramBundle = new HandlerThread("splash-activity");
    paramBundle.start();
    this.mHandler = new Handler(paramBundle.getLooper());
    this.mHandler.postDelayed(this.sMT, 100L);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/splash/SplashFallbackActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */