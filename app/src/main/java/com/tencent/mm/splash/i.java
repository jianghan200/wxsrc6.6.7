package com.tencent.mm.splash;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;

final class i
  extends Activity
{
  public String sMW;
  
  protected final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt1 == 100)
    {
      if (paramInt2 != -100) {
        onBackPressed();
      }
      return;
    }
    finish();
    h.b("WxSplash.SplashHackActivity", "unknown request code.", new Object[0]);
  }
  
  protected final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    h.b("WxSplash.SplashHackActivity", "onCreate", new Object[0]);
    setVisible(false);
    paramBundle = new Intent(this, h.ckc());
    paramBundle.putExtra("hashcode", hashCode());
    startActivityForResult(paramBundle, 100);
  }
  
  protected final void onDestroy()
  {
    h.b("WxSplash.SplashHackActivity", "onDestroy", new Object[0]);
    h.sMv.remove(this);
    setVisible(true);
    h.sMv.remove(this);
    super.onDestroy();
  }
  
  protected final void onNewIntent(Intent paramIntent)
  {
    h.b("WxSplash.SplashHackActivity", "onNewIntent.", new Object[0]);
    if ((h.sMz != null) && (h.sMz.k(paramIntent))) {
      finish();
    }
  }
  
  protected final void onPause()
  {
    h.b("WxSplash.SplashHackActivity", "onPause", new Object[0]);
    super.onPause();
  }
  
  protected final void onResume()
  {
    super.onResume();
    h.b("WxSplash.SplashHackActivity", "onResume", new Object[0]);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/splash/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */