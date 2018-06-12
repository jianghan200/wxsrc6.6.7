package com.tencent.mm.wallet_core.c;

import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class o
{
  private static long hyD = 0L;
  private static String pnl = "";
  private static String uXq = "";
  
  public static boolean cCZ()
  {
    long l = bi.bG(hyD);
    x.d("MicroMsg.TimeStampHelper", "pass time " + l);
    return l > 300L;
  }
  
  public static String cDa()
  {
    if ((bi.oW(pnl)) || (b.chp())) {
      x.i("MicroMsg.TimeStampHelper", "getTimeStamp is null from %s isOverdue %s update_time: %s", new Object[] { uXq, Boolean.valueOf(cCZ()), Long.valueOf(hyD) });
    }
    return pnl;
  }
  
  public static void setTimeStamp(String paramString)
  {
    pnl = paramString;
    hyD = System.currentTimeMillis() / 1000L;
    uXq = bi.cjd().toString();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/wallet_core/c/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */