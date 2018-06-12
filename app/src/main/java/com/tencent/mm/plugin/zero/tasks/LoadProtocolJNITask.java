package com.tencent.mm.plugin.zero.tasks;

import com.tencent.mars.xlog.Xlog;
import com.tencent.mm.compatible.util.k;
import com.tencent.mm.kernel.a.c.a;
import com.tencent.mm.kernel.b.g;
import com.tencent.mm.protocal.MMProtocalJni;

public class LoadProtocolJNITask
  extends a
{
  private void retryOnce(Runnable paramRunnable)
  {
    try
    {
      paramRunnable.run();
      return;
    }
    catch (Throwable localThrowable)
    {
      paramRunnable.run();
    }
  }
  
  public void execute(g paramg)
  {
    k.b("MMProtocalJni", getClass().getClassLoader());
    retryOnce(new LoadProtocolJNITask.1(this));
    retryOnce(new Runnable()
    {
      public void run()
      {
        MMProtocalJni.setProtocalJniLogLevel(new Xlog().getLogLevel());
      }
    });
    retryOnce(new Runnable()
    {
      public void run()
      {
        MMProtocalJni.setIsLite(false);
      }
    });
  }
  
  public String name()
  {
    return "boot-load-MMProtocalJni-library";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/zero/tasks/LoadProtocolJNITask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */