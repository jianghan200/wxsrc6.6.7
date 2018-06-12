package com.tencent.mm.plugin.wear.model.f;

import com.tencent.mm.sdk.platformtools.x;

public abstract class d
  implements Runnable
{
  public d()
  {
    x.i("MicroMsg.WearBaseWorkerTask", "Create %s", new Object[] { getName() });
  }
  
  public abstract void execute();
  
  public abstract String getName();
  
  public void run()
  {
    long l1 = System.currentTimeMillis();
    try
    {
      execute();
      long l2 = System.currentTimeMillis();
      x.i("MicroMsg.WearBaseWorkerTask", "execute %s | use time %d", new Object[] { getName(), Long.valueOf(l2 - l1) });
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        x.printErrStackTrace("MicroMsg.WearBaseWorkerTask", localException, "run task %s occur exception: %s", new Object[] { getName(), localException.getMessage() });
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/wear/model/f/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */