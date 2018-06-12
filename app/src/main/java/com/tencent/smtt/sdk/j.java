package com.tencent.smtt.sdk;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.smtt.utils.TbsLog;

final class j
  extends Handler
{
  j(Looper paramLooper, QbSdk.PreInitCallback paramPreInitCallback, Context paramContext)
  {
    super(paramLooper);
  }
  
  public final void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    }
    do
    {
      return;
      if (this.a != null) {
        this.a.onViewInitFinished(false);
      }
      TbsLog.writeLogToDisk();
      return;
      if (QbSdk.j)
      {
        paramMessage = bv.a().c();
        if (paramMessage != null) {
          paramMessage.a(this.b);
        }
      }
      if (this.a != null) {
        this.a.onViewInitFinished(true);
      }
      TbsLog.writeLogToDisk();
      return;
    } while (this.a == null);
    this.a.onCoreInitFinished();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/smtt/sdk/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */