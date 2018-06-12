package com.tencent.smtt.sdk;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

class ax
  extends Handler
{
  ax(TbsLogReport paramTbsLogReport, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    if (paramMessage.what == 600) {
      if ((paramMessage.obj instanceof TbsLogReport.TbsLogInfo))
      {
        localTbsLogInfo = (TbsLogReport.TbsLogInfo)paramMessage.obj;
        i = paramMessage.arg1;
        TbsLogReport.a(this.a, i, localTbsLogInfo);
      }
    }
    while (paramMessage.what != 601)
    {
      TbsLogReport.TbsLogInfo localTbsLogInfo;
      int i;
      return;
    }
    TbsLogReport.a(this.a);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/smtt/sdk/ax.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */