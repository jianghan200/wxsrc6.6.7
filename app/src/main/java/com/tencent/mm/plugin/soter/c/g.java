package com.tencent.mm.plugin.soter.c;

import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.x;

public enum g
{
  private String appId = null;
  private int errCode = 0;
  private int errType = 0;
  
  private g() {}
  
  public static void m(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    x.d("MicroMsg.SoterReportManager", "SoterReportManager functionName: %s, appId: %s, errType: %d, errCode: %d", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    int i;
    switch (paramString1.hashCode())
    {
    default: 
      i = -1;
      switch (i)
      {
      default: 
        label67:
        x.e("MicroMsg.SoterReportManager", "unknown soter jsapi function name");
        i = -1;
      }
      break;
    }
    for (;;)
    {
      x.i("MicroMsg.SoterReportManager", "functionNameCode: %d", new Object[] { Integer.valueOf(i) });
      if (i != -1) {
        h.mEJ.h(13711, new Object[] { Integer.valueOf(i), paramString2, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      }
      return;
      if (!paramString1.equals("requireSoterBiometricAuthentication")) {
        break;
      }
      i = 0;
      break label67;
      if (!paramString1.equals("getSupportSoter")) {
        break;
      }
      i = 1;
      break label67;
      i = 0;
      continue;
      i = 1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/soter/c/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */