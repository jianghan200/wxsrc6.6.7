package com.tencent.smtt.sdk;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

class ah
  extends Handler
{
  ah(ag paramag, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    if (paramMessage.what == 150) {
      ag.a(this.a);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/smtt/sdk/ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */