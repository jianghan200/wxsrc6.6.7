package com.tencent.mm.plugin.report.b;

import com.tencent.mars.smc.SmcLogic;
import com.tencent.mars.smc.SmcProtoBufUtil;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.a.a.c;
import com.tencent.mm.protocal.a.a.f;
import com.tencent.mm.protocal.c.ace;
import com.tencent.mm.protocal.c.acf;
import com.tencent.mm.protocal.c.ami;
import com.tencent.mm.protocal.y;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class h
  extends l
  implements k
{
  private static boolean bgH = false;
  private static Object lock = new Object();
  private com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  private a mDQ = new a();
  private ace mDU = null;
  
  public h()
  {
    hs(true);
    this.mDU = SmcProtoBufUtil.toMMGetStrategyReq();
    if (this.mDU != null)
    {
      this.mDU.rtn = new ami();
      this.mDU.rtn.rOY = a.vs(0);
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
  
  public static boolean isRunning()
  {
    synchronized (lock)
    {
      boolean bool = bgH;
      return bool;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    g.Eg();
    boolean bool = com.tencent.mm.kernel.a.Dw();
    if (!bool) {
      this.mDU.rtm = com.tencent.mm.bk.b.bi(bi.ciV());
    }
    b.a locala = new b.a();
    locala.dIK = false;
    locala.dIG = this.mDU;
    locala.dIH = new acf();
    if (bool) {}
    int i;
    for (parame1 = "/cgi-bin/micromsg-bin/getkvidkeystrategy";; parame1 = "/cgi-bin/micromsg-bin/getkvidkeystrategyrsa")
    {
      locala.uri = parame1;
      locala.dIF = getType();
      this.diG = locala.KT();
      if (!bool)
      {
        this.diG.a(y.cgs());
        this.diG.cdn = 1;
      }
      i = a(parame, this.diG, this);
      if (i < 0) {
        x.i("MicroMsg.NetSceneGetCliKVStrategy", "mark all failed. do scene %d", new Object[] { Integer.valueOf(i) });
      }
      try
      {
        SmcLogic.OnStrategyResp(3, -1, null, 1);
        SmcLogic.OnStrategyResp(3, -1, null, 2);
        hs(false);
        return i;
      }
      catch (Exception parame)
      {
        x.e("MicroMsg.NetSceneGetCliKVStrategy", "onReportStrategyResp failed  hash:%d  , ex:%s", new Object[] { Integer.valueOf(hashCode()), bi.i(parame) });
      }
    }
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    if ((g.Eh().dpP == null) || (g.Eh().dpP.dJs == null))
    {
      x.f("MicroMsg.NetSceneGetCliKVStrategy", "null == network().getNetSceneQueue().getDispatcher(), can't give response to kvcomm.");
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    if (paramInt2 != 0)
    {
      x.e("MicroMsg.NetSceneGetCliKVStrategy", "get report strategy err, errType:" + paramInt2 + ", errCode:" + paramInt3);
      SmcLogic.OnStrategyResp(paramInt2, paramInt3, null, 1);
      SmcLogic.OnStrategyResp(paramInt2, paramInt3, null, 2);
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      hs(false);
      return;
    }
    x.d("MicroMsg.NetSceneGetCliKVStrategy", "get report strategy ok");
    paramArrayOfByte = (acf)this.diG.dIE.dIL;
    this.mDQ.a(paramArrayOfByte.rtx, 0);
    try
    {
      paramq = SmcProtoBufUtil.toSmcKVStrategyResp(paramArrayOfByte);
      paramArrayOfByte = SmcProtoBufUtil.toSmcIdkeyStrategyResp(paramArrayOfByte);
      SmcLogic.OnStrategyResp(0, 0, paramq.toByteArray(), 1);
      SmcLogic.OnStrategyResp(0, 0, paramArrayOfByte.toByteArray(), 2);
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      hs(false);
      return;
    }
    catch (Exception paramq)
    {
      for (;;)
      {
        x.e("MicroMsg.NetSceneGetCliKVStrategy", "onReportStrategyResp failed  hash:%d  , ex:%s", new Object[] { Integer.valueOf(hashCode()), bi.i(paramq) });
      }
    }
  }
  
  public final int getType()
  {
    g.Eg();
    if (com.tencent.mm.kernel.a.Dw()) {
      return 988;
    }
    return 989;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/report/b/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */