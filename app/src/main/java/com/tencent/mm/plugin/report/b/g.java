package com.tencent.mm.plugin.report.b;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.a;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ag;
import com.tencent.mm.protocal.c.ah;
import com.tencent.mm.protocal.c.ys;
import com.tencent.mm.protocal.c.yt;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class g
  extends l
  implements k
{
  private static boolean bgH = false;
  private static Object lock = new Object();
  private com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  private ys mDS = null;
  public ah mDT;
  
  public g(int paramInt1, int paramInt2)
  {
    hs(true);
    ag localag = new ag();
    this.mDS = new ys();
    try
    {
      localag.qZC = paramInt1;
      localag.qZD = paramInt2;
      this.mDS.rEW = localag;
      return;
    }
    catch (Exception localException)
    {
      x.e("MicroMsg.NetSceneGetAPMStrategy", "parse data error");
    }
  }
  
  private static void hs(boolean paramBoolean)
  {
    synchronized (lock)
    {
      bgH = paramBoolean;
      return;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    com.tencent.mm.kernel.g.Eg();
    int i;
    if (!a.Dw())
    {
      x.w("MicroMsg.NetSceneGetAPMStrategy", "get mrs strategy must go after login");
      i = -1;
    }
    int j;
    do
    {
      return i;
      parame1 = new b.a();
      parame1.dIK = false;
      parame1.dIG = this.mDS;
      parame1.dIH = new yt();
      parame1.uri = "/cgi-bin/micromsg-bin/getapmstrategy";
      parame1.dIF = 914;
      this.diG = parame1.KT();
      j = a(parame, this.diG, this);
      i = j;
    } while (j >= 0);
    x.i("MicroMsg.NetSceneGetAPMStrategy", "mark all failed. do scene %d", new Object[] { Integer.valueOf(j) });
    try
    {
      this.mDT = null;
      hs(false);
      return j;
    }
    catch (Exception parame)
    {
      x.e("MicroMsg.NetSceneGetAPMStrategy", "onStrategyResp failed  hash:%d  , ex:%s", new Object[] { Integer.valueOf(hashCode()), bi.i(parame) });
    }
    return j;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    try
    {
      this.mDT = null;
      if ((com.tencent.mm.kernel.g.Eh().dpP == null) || (com.tencent.mm.kernel.g.Eh().dpP.dJs == null))
      {
        x.f("MicroMsg.NetSceneGetAPMStrategy", "null == network().getNetSceneQueue().getDispatcher(), can't give response to kvcomm.");
        this.diJ.a(paramInt2, paramInt3, paramString, this);
        return;
      }
      if (paramInt2 != 0)
      {
        x.e("MicroMsg.NetSceneGetAPMStrategy", "get report strategy err, errType:" + paramInt2 + ", errCode:" + paramInt3);
        this.diJ.a(paramInt2, paramInt3, paramString, this);
        return;
      }
      x.d("MicroMsg.NetSceneGetAPMStrategy", "get report strategy ok");
      this.mDT = ((yt)this.diG.dIE.dIL).rEX;
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    finally
    {
      hs(false);
    }
  }
  
  public final int getType()
  {
    return 914;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/report/b/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */