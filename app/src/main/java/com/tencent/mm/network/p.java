package com.tencent.mm.network;

import android.os.RemoteException;
import com.tencent.mars.magicbox.IPxxLogic.ICallBack;
import com.tencent.mars.mm.MMLogic;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class p
  implements IPxxLogic.ICallBack
{
  private static long ese = 0L;
  private static int esf = 0;
  private final String TAG = "IPxxCallback";
  
  private static void iK(int paramInt)
  {
    try
    {
      t localt = aa.UZ();
      g localg = localt.ess;
      if (localg != null) {}
      try
      {
        localt.ess.es(paramInt);
        return;
      }
      catch (RemoteException localRemoteException)
      {
        x.e("MicroMsg.AutoAuth", "exception:%s", new Object[] { bi.i(localRemoteException) });
        return;
      }
      return;
    }
    catch (Exception localException)
    {
      x.e("IPxxCallback", "exception:%s", new Object[] { bi.i(localException) });
    }
  }
  
  public final String getCrashFilePath(int paramInt)
  {
    Object localObject = new Date(System.currentTimeMillis() - paramInt * 86400000L);
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyyMMdd");
    localObject = com.tencent.mm.compatible.util.e.duP + "crash_" + localSimpleDateFormat.format((Date)localObject) + ".txt";
    if (com.tencent.mm.a.e.cn((String)localObject)) {
      return (String)localObject;
    }
    return null;
  }
  
  public final String getUplodLogExtrasInfo()
  {
    try
    {
      Object localObject = new StringBuffer();
      ((StringBuffer)localObject).append("Device:").append(d.qVI).append(" ").append(d.qVJ).append("\n");
      localObject = ((StringBuffer)localObject).toString();
      return (String)localObject;
    }
    catch (Exception localException) {}
    return null;
  }
  
  public final void recoverLinkAddrs() {}
  
  public final void setNewDnsDebugHostInfo(String paramString, int paramInt)
  {
    MMLogic.setNewDnsDebugHost(paramString, String.valueOf(paramInt));
  }
  
  public final void uploadLogFail()
  {
    esf = 0;
    iK(-1);
  }
  
  public final void uploadLogResponse(long paramLong1, long paramLong2)
  {
    int j = 100;
    int k = 0;
    x.i("IPxxCallback", "ipxx progress totalSize:%d uploadSize:%d lastPercent:%d ", new Object[] { Long.valueOf(paramLong1), Long.valueOf(paramLong2), Integer.valueOf(esf) });
    long l = bi.VE();
    if (l - 1L < ese) {
      return;
    }
    ese = l;
    int i = k;
    if (paramLong2 >= 0L)
    {
      i = k;
      if (paramLong1 > 0L)
      {
        i = k;
        if (paramLong2 < paramLong1) {
          i = (int)(100L * paramLong2 / paramLong1);
        }
      }
    }
    if (i > 100) {
      i = j;
    }
    for (;;)
    {
      j = i;
      if (esf > i) {
        j = esf;
      }
      esf = j;
      iK(j);
      return;
    }
  }
  
  public final void uploadLogSuccess()
  {
    esf = 0;
    iK(100);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/network/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */