package com.tencent.mm.sdk.f;

import android.os.HandlerThread;
import java.util.concurrent.atomic.AtomicInteger;
import junit.framework.Assert;

public final class a
{
  private ThreadGroup dWZ;
  private final AtomicInteger sKP = new AtomicInteger(1);
  private e.b sKQ;
  
  a(e.b paramb)
  {
    this.sKQ = paramb;
    this.dWZ = new ThreadGroup("MM_FREE_THREAD_GROUP");
  }
  
  static HandlerThread cY(String paramString, int paramInt)
  {
    Assert.assertNotNull("newThread arg name is null!", paramString);
    return new a("mmt_h" + paramString, paramInt);
  }
  
  static final class a
    extends HandlerThread
  {
    a(String paramString, int paramInt)
    {
      super(paramInt);
    }
    
    public final void run()
    {
      super.run();
    }
    
    public final void start()
    {
      super.start();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/sdk/f/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */