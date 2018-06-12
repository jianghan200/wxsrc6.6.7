package com.tencent.mm.plugin.soter.c;

import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.Map;

public final class a
{
  private static int onC = -1;
  private static int onD = -1;
  
  public static void bFd()
  {
    if (onC == -1)
    {
      x.e("MicroMsg.FingerpirntReporter", "hy: current open scene not set");
      return;
    }
    h.mEJ.h(12925, new Object[] { Integer.valueOf(onC) });
  }
  
  public static void bFe()
  {
    if (onC == -1)
    {
      x.e("MicroMsg.FingerpirntReporter", "hy: current open scene not set");
      return;
    }
    h.mEJ.h(12926, new Object[] { Integer.valueOf(onC) });
  }
  
  public static void bFf()
  {
    onD = (int)(System.currentTimeMillis() / 1000L);
  }
  
  public static boolean bFg()
  {
    return onC >= 0;
  }
  
  public static void c(int paramInt1, int paramInt2, int paramInt3, String paramString)
  {
    if (onC == -1)
    {
      x.e("MicroMsg.FingerpirntReporter", "hy: current open scene not set");
      return;
    }
    h.mEJ.h(13413, new Object[] { Integer.valueOf(onC), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
  }
  
  public static void dK(int paramInt1, int paramInt2)
  {
    x.v("MicroMsg.FingerpirntReporter", "alvinluo report open guide count, actionType: %d, actionCount: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    h.mEJ.h(14381, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
  }
  
  public static void dL(int paramInt1, int paramInt2)
  {
    switch (paramInt2)
    {
    default: 
      paramInt1 = -1;
    }
    for (;;)
    {
      if (paramInt1 != -1)
      {
        x.i("MicroMsg.FingerpirntReporter", "alvinluo soter idkey report id: %d, key: %d, value: %d", new Object[] { Integer.valueOf(672), Integer.valueOf(paramInt1), Long.valueOf(1L) });
        h.mEJ.a(672L, paramInt1, 1L, false);
      }
      return;
      if (paramInt1 == 3)
      {
        paramInt1 = 0;
        continue;
        paramInt1 = 1;
        continue;
        paramInt1 = 2;
        continue;
        paramInt1 = 3;
        continue;
        paramInt1 = 4;
        continue;
        paramInt1 = 5;
      }
      else
      {
        paramInt1 = -1;
      }
    }
  }
  
  public static void xO(int paramInt)
  {
    onC = paramInt;
  }
  
  public static void xP(int paramInt)
  {
    if (onD == -1)
    {
      x.e("MicroMsg.FingerpirntReporter", "hy: no current pay session");
      return;
    }
    h.mEJ.h(12927, new Object[] { Integer.valueOf(onD), Integer.valueOf(paramInt) });
    onC = -1;
  }
  
  public static void xQ(int paramInt)
  {
    String str = bi.i(new Throwable());
    x.i("MicroMsg.FingerpirntReporter", "alvinluo soter cLog report, sceneType: %d, detailScene: %d, content: %s", new Object[] { Integer.valueOf(3), Integer.valueOf(paramInt), str });
    HashMap localHashMap = new HashMap();
    localHashMap.put("sceneType", "3");
    localHashMap.put("scene", String.valueOf(paramInt));
    h.mEJ.c("Soter", "Fingerprint pay add authentication task failed: " + str, localHashMap);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/soter/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */