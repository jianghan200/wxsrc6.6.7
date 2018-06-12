package com.tencent.mm.ipcinvoker;

import com.tencent.mm.ipcinvoker.a.d;
import com.tencent.mm.ipcinvoker.h.a.a;
import java.util.Map;

public final class g
{
  public static void fD(String paramString)
  {
    if (fF(paramString)) {
      return;
    }
    l.post(new Runnable()
    {
      public final void run()
      {
        b localb = b.Cq();
        String str = this.dmp;
        if (e.fC(str))
        {
          com.tencent.mm.ipcinvoker.h.b.i("IPC.IPCBridgeManager", "the same process(%s), do not need to build IPCBridge.", new Object[] { str });
          return;
        }
        localb.fA(str);
      }
    });
  }
  
  public static void fE(String paramString)
  {
    if (fF(paramString)) {
      return;
    }
    l.post(new g.4(paramString));
  }
  
  public static boolean fF(String paramString)
  {
    b localb = b.Cq();
    return (!e.fC(paramString)) && (localb.dmm.get(paramString) != null);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/ipcinvoker/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */