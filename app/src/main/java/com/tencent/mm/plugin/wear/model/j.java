package com.tencent.mm.plugin.wear.model;

import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.x;

public final class j
{
  ag giD;
  HandlerThread handlerThread;
  
  public j()
  {
    if (com.tencent.mm.compatible.util.d.fT(18))
    {
      this.handlerThread = e.Xs("WearWorker_worker_thread");
      this.handlerThread.start();
      this.giD = new a(this.handlerThread.getLooper());
      x.i("MicroMsg.Wear.WearWorker", "start worker %d", new Object[] { Integer.valueOf(this.handlerThread.getThreadId()) });
    }
  }
  
  public final void a(com.tencent.mm.plugin.wear.model.f.d paramd)
  {
    if (this.giD != null)
    {
      paramd = this.giD.obtainMessage(0, paramd);
      this.giD.sendMessage(paramd);
    }
  }
  
  private final class a
    extends ag
  {
    public a(Looper paramLooper)
    {
      super();
    }
    
    public final void handleMessage(Message paramMessage)
    {
      paramMessage = (com.tencent.mm.plugin.wear.model.f.d)paramMessage.obj;
      if (paramMessage != null) {}
      try
      {
        paramMessage.run();
        return;
      }
      catch (Exception localException)
      {
        x.printErrStackTrace("MicroMsg.Wear.WearWorker", localException.getCause(), "run task %s occur exception", new Object[] { paramMessage.getName() });
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/wear/model/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */