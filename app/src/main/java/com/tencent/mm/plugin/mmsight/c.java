package com.tencent.mm.plugin.mmsight;

import com.tencent.mm.sdk.platformtools.x;
import java.util.concurrent.ConcurrentSkipListSet;

public final class c
{
  private static ConcurrentSkipListSet<Integer> ldT = new ConcurrentSkipListSet();
  
  public static void sI(int paramInt)
  {
    try
    {
      x.i("MicroMsg.MMSightCaptureVideoRemuxStatus", "markMsgRemuxing: %s", new Object[] { Integer.valueOf(paramInt) });
      ldT.add(Integer.valueOf(paramInt));
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        x.e("MicroMsg.MMSightCaptureVideoRemuxStatus", "markMsgRemuxing error: %s", new Object[] { localException.getMessage() });
      }
    }
    finally {}
  }
  
  public static void sJ(int paramInt)
  {
    try
    {
      x.i("MicroMsg.MMSightCaptureVideoRemuxStatus", "markMsgRemuxingFinish: %s", new Object[] { Integer.valueOf(paramInt) });
      ldT.remove(Integer.valueOf(paramInt));
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        x.e("MicroMsg.MMSightCaptureVideoRemuxStatus", "markMsgRemuxingFinish error: %s", new Object[] { localException.getMessage() });
      }
    }
    finally {}
  }
  
  public static boolean sK(int paramInt)
  {
    try
    {
      bool = ldT.contains(Integer.valueOf(paramInt));
      x.d("MicroMsg.MMSightCaptureVideoRemuxStatus", "isMsgRemuxing: %s, %s", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(bool) });
      return bool;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        x.e("MicroMsg.MMSightCaptureVideoRemuxStatus", "isMsgRemuxing error: %s", new Object[] { localException.getMessage() });
        boolean bool = false;
      }
    }
    finally {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/mmsight/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */