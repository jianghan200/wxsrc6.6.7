package com.tencent.smtt.sdk;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.smtt.utils.TbsLog;

class aq
  extends Handler
{
  aq(an paraman, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    QbSdk.setTBSInstallingStatus(true);
    switch (paramMessage.what)
    {
    }
    for (;;)
    {
      QbSdk.setTBSInstallingStatus(false);
      super.handleMessage(paramMessage);
      return;
      TbsLog.i("TbsInstaller", "TbsInstaller--handleMessage--MSG_INSTALL_TBS_CORE");
      Object[] arrayOfObject = (Object[])paramMessage.obj;
      an.a(this.a, (Context)arrayOfObject[0], (String)arrayOfObject[1], ((Integer)arrayOfObject[2]).intValue());
      continue;
      TbsLog.i("TbsInstaller", "TbsInstaller--handleMessage--MSG_COPY_TBS_CORE");
      arrayOfObject = (Object[])paramMessage.obj;
      an.a(this.a, (Context)arrayOfObject[0], (Context)arrayOfObject[1], ((Integer)arrayOfObject[2]).intValue());
      continue;
      TbsLog.i("TbsInstaller", "TbsInstaller--handleMessage--MSG_INSTALL_TBS_CORE_EX");
      arrayOfObject = (Object[])paramMessage.obj;
      this.a.b((Context)arrayOfObject[0], (Bundle)arrayOfObject[1]);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/smtt/sdk/aq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */