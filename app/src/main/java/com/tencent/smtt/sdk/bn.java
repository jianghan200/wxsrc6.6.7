package com.tencent.smtt.sdk;

import android.content.Context;
import android.content.IntentFilter;
import com.tencent.smtt.utils.Apn;

class bn
  extends Thread
{
  bn(WebView paramWebView, Context paramContext) {}
  
  public void run()
  {
    try
    {
      if (Apn.getApnType(this.a) == 3) {}
      for (boolean bool = true;; bool = false)
      {
        QbSdk.e = bool;
        QbSdk.f = System.currentTimeMillis();
        IntentFilter localIntentFilter = new IntentFilter();
        localIntentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        this.a.getApplicationContext().registerReceiver(WebView.e(), localIntentFilter);
        return;
      }
      return;
    }
    catch (Throwable localThrowable) {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/smtt/sdk/bn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */