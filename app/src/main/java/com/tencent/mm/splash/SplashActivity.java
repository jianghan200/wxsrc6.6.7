package com.tencent.mm.splash;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;

public class SplashActivity
  extends Activity
{
  private boolean sMR = false;
  
  private void ckg()
  {
    if (h.sMz.b(this, new Runnable()
    {
      public final void run()
      {
        SplashActivity.c(SplashActivity.this);
      }
    })) {
      cki();
    }
  }
  
  private void cki()
  {
    if (this.sMR) {
      return;
    }
    this.sMR = true;
    h.sMz = null;
    if (!isFinishing())
    {
      setResult(-100);
      int i = getIntent().getIntExtra("hashcode", 0);
      Iterator localIterator = h.sMv.iterator();
      while (localIterator.hasNext())
      {
        i locali = (i)localIterator.next();
        if (i == locali.hashCode())
        {
          locali.recreate();
          h.b("WxSplash.SplashActivity", "do recreate", new Object[0]);
        }
      }
      new Handler().postDelayed(new Runnable()
      {
        public final void run()
        {
          SplashActivity.this.finish();
          SplashActivity.d(SplashActivity.this);
        }
      }, 50L);
      return;
    }
    onBackPressed();
  }
  
  public final void ckh()
  {
    if (h.sMz != null)
    {
      if (!h.sMz.a(this, new Runnable()
      {
        public final void run()
        {
          SplashActivity.c(SplashActivity.this);
        }
      })) {
        ckg();
      }
      return;
    }
    h.b("WxSplash.SplashActivity", "permissions delegate is null, call splash finish directly.", new Object[0]);
    cki();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    h.a(this);
    h.b("WxSplash.SplashActivity", "onCreate", new Object[0]);
    if (!h.cjV())
    {
      h.b("WxSplash.SplashActivity", "no need splash, finish", new Object[0]);
      ckh();
    }
    if (h.sMI != null) {
      h.sMI.e(this);
    }
  }
  
  protected void onDestroy()
  {
    h.b(this);
    h.b("WxSplash.SplashActivity", "onDestroy", new Object[0]);
    super.onDestroy();
  }
  
  public void onPause()
  {
    h.b("WxSplash.SplashActivity", "onPause", new Object[0]);
    super.onPause();
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    if (h.sMz != null) {
      h.sMz.a(this, paramInt, paramArrayOfString, paramArrayOfInt);
    }
  }
  
  protected void onResume()
  {
    super.onResume();
    h.b("WxSplash.SplashActivity", "onResume", new Object[0]);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/splash/SplashActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */