package com.tencent.mm.sandbox;

import android.os.Process;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.Map;

public final class c
{
  private static c sCW = null;
  private static Map<Integer, Boolean> sCX = new HashMap();
  
  public static void i(int paramInt, Object paramObject)
  {
    x.i("MicroMsg.SandBoxCore", "regLifeCycle, id=" + paramInt + ", class=%s", new Object[] { paramObject.getClass().getName() });
    sCX.put(Integer.valueOf(paramInt), Boolean.valueOf(true));
    x.i("MicroMsg.SandBoxCore", "regLifeCycle, map size=" + sCX.size());
  }
  
  public static void j(int paramInt, Object paramObject)
  {
    x.i("MicroMsg.SandBoxCore", "unregLifeCycle, id=" + paramInt + ", class=%s", new Object[] { paramObject.getClass().getName() });
    sCX.remove(Integer.valueOf(paramInt));
    x.i("MicroMsg.SandBoxCore", "unregLifeCycle, map size=" + sCX.size());
    if (sCX.size() == 0)
    {
      Process.killProcess(Process.myPid());
      x.w("MicroMsg.SandBoxCore", "Sandbox exit Now.");
      x.chS();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/sandbox/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */