package com.tencent.mm.ab;

import com.tencent.mm.network.a.b;
import com.tencent.mm.network.c;
import com.tencent.mm.network.e;
import com.tencent.mm.network.f;
import com.tencent.mm.network.h;
import com.tencent.mm.network.i;
import com.tencent.mm.network.l;
import com.tencent.mm.network.o;
import com.tencent.mm.network.r;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.List;

public final class q
  implements e
{
  public final f dJJ;
  private p dJK;
  
  public q(f paramf)
  {
    this.dJJ = paramf;
  }
  
  public final boolean Lh()
  {
    try
    {
      boolean bool = this.dJJ.Lh();
      return bool;
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.RDispatcher", "core service down, guess network stable, %s", new Object[] { localException });
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bi.i(localException) });
    }
    return true;
  }
  
  public final c Lr()
  {
    try
    {
      if (this.dJK == null) {
        this.dJK = new p(this.dJJ.Ux());
      }
      p localp = this.dJK;
      return localp;
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.RDispatcher", "getAccInfo failed, core service down, %s", new Object[] { localException });
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bi.i(localException) });
    }
    return null;
  }
  
  public final i Ls()
  {
    try
    {
      i locali = this.dJJ.Uz();
      return locali;
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bi.i(localException) });
    }
    return null;
  }
  
  public final void Lt()
  {
    try
    {
      this.dJJ.Lt();
      return;
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bi.i(localException) });
    }
  }
  
  public final void Lu()
  {
    try
    {
      this.dJJ.Lu();
      return;
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bi.i(localException) });
    }
  }
  
  public final int a(r paramr, l paraml)
  {
    try
    {
      int i = this.dJJ.a(paramr, paraml);
      return i;
    }
    catch (Exception paramr)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.RDispatcher", "remote dispatcher lost, send failed, %s", new Object[] { paramr });
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bi.i(paramr) });
    }
    return -1;
  }
  
  public final int a(String paramString, boolean paramBoolean, List<String> paramList)
  {
    try
    {
      int i = this.dJJ.a(paramString, paramBoolean, paramList);
      return i;
    }
    catch (Exception paramString)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bi.i(paramString) });
    }
    return -1;
  }
  
  public final void a(int paramInt1, String paramString, int paramInt2, boolean paramBoolean)
  {
    try
    {
      this.dJJ.a(paramInt1, paramString, paramInt2, paramBoolean);
      return;
    }
    catch (Exception paramString)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bi.i(paramString) });
    }
  }
  
  public final void a(b paramb)
  {
    try
    {
      this.dJJ.a(paramb);
      return;
    }
    catch (Exception paramb)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bi.i(paramb) });
    }
  }
  
  public final void a(h paramh)
  {
    try
    {
      this.dJJ.a(paramh);
      return;
    }
    catch (Exception paramh)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bi.i(paramh) });
    }
  }
  
  public final void a(o paramo)
  {
    try
    {
      this.dJJ.a(paramo);
      return;
    }
    catch (Exception paramo)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bi.i(paramo) });
    }
  }
  
  public final void a(com.tencent.mm.protocal.x paramx)
  {
    try
    {
      this.dJJ.a(paramx);
      return;
    }
    catch (Exception paramx)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bi.i(paramx) });
    }
  }
  
  public final void a(boolean paramBoolean, String paramString1, String paramString2, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt1, int paramInt2, String paramString3, String paramString4)
  {
    try
    {
      this.dJJ.a(paramBoolean, paramString1, paramString2, paramArrayOfInt1, paramArrayOfInt2, paramInt1, paramInt2, paramString3, paramString4);
      return;
    }
    catch (Exception paramString1)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.RDispatcher", "dkidc setIDCHostInfo ip failed, core service down, %s", new Object[] { paramString1 });
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bi.i(paramString1) });
    }
  }
  
  public final void bC(boolean paramBoolean)
  {
    try
    {
      this.dJJ.bC(paramBoolean);
      return;
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.RDispatcher", "change active status failed, core service down, %s", new Object[] { localException });
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bi.i(localException) });
    }
  }
  
  public final void bD(boolean paramBoolean)
  {
    try
    {
      this.dJJ.bD(paramBoolean);
      return;
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bi.i(localException) });
    }
  }
  
  public final void bE(boolean paramBoolean)
  {
    try
    {
      this.dJJ.bE(paramBoolean);
      return;
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bi.i(localException) });
    }
  }
  
  public final void bF(boolean paramBoolean)
  {
    try
    {
      this.dJJ.bF(paramBoolean);
      return;
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bi.i(localException) });
    }
  }
  
  public final void cancel(int paramInt)
  {
    try
    {
      this.dJJ.cancel(paramInt);
      return;
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.RDispatcher", "cancel remote rr failed, netid=%d, %s", new Object[] { Integer.valueOf(paramInt), localException });
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bi.i(localException) });
    }
  }
  
  public final int getHostByName(String paramString, List<String> paramList)
  {
    try
    {
      int i = this.dJJ.getHostByName(paramString, paramList);
      return i;
    }
    catch (Exception paramString)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bi.i(paramString) });
    }
    return -1;
  }
  
  public final String[] getIPsString(boolean paramBoolean)
  {
    try
    {
      String[] arrayOfString = this.dJJ.getIPsString(paramBoolean);
      return arrayOfString;
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.RDispatcher", "query remote network server ip failed, %s", new Object[] { localException });
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bi.i(localException) });
    }
    return null;
  }
  
  public final String getIspId()
  {
    try
    {
      String str = this.dJJ.getIspId();
      return str;
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bi.i(localException) });
    }
    return null;
  }
  
  public final String getNetworkServerIp()
  {
    try
    {
      String str = this.dJJ.getNetworkServerIp();
      return str;
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.RDispatcher", "query remote network server ip failed, %s", new Object[] { localException });
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bi.i(localException) });
    }
    return null;
  }
  
  public final void keepSignalling()
  {
    try
    {
      this.dJJ.keepSignalling();
      return;
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bi.i(localException) });
    }
  }
  
  public final void kg(String paramString)
  {
    try
    {
      this.dJJ.kg(paramString);
      return;
    }
    catch (Exception paramString)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.RDispatcher", "ipxxStatistics remote call error, %s", new Object[] { paramString });
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bi.i(paramString) });
    }
  }
  
  public final void kh(String paramString)
  {
    try
    {
      this.dJJ.kh(paramString);
      return;
    }
    catch (Exception paramString)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bi.i(paramString) });
    }
  }
  
  public final void reportFailIp(String paramString)
  {
    try
    {
      this.dJJ.reportFailIp(paramString);
      return;
    }
    catch (Exception paramString)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bi.i(paramString) });
    }
  }
  
  public final void reset()
  {
    try
    {
      this.dJJ.reset();
      return;
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.RDispatcher", "reset failed, core service down, %s", new Object[] { localException });
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bi.i(localException) });
    }
  }
  
  public final void setHostInfo(String[] paramArrayOfString1, String[] paramArrayOfString2, int[] paramArrayOfInt)
  {
    try
    {
      this.dJJ.setHostInfo(paramArrayOfString1, paramArrayOfString2, paramArrayOfInt);
      return;
    }
    catch (Exception paramArrayOfString1)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bi.i(paramArrayOfString1) });
    }
  }
  
  public final void setSignallingStrategy(long paramLong1, long paramLong2)
  {
    try
    {
      this.dJJ.setSignallingStrategy(paramLong1, paramLong2);
      return;
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bi.i(localException) });
    }
  }
  
  public final void stopSignalling()
  {
    try
    {
      this.dJJ.stopSignalling();
      return;
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.RDispatcher", "exception:%s", new Object[] { bi.i(localException) });
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/ab/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */