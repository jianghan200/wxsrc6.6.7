package com.tencent.recovery.handler;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.recovery.Recovery;

public class RecoveryMessageHandler
  extends Handler
{
  public RecoveryMessageHandler()
  {
    super(Looper.getMainLooper());
  }
  
  public void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
      return;
    case 1: 
      Recovery.cEO();
      return;
    case 2: 
      Recovery.Hj(1);
      return;
    }
    Recovery.Hj(1);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/recovery/handler/RecoveryMessageHandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */