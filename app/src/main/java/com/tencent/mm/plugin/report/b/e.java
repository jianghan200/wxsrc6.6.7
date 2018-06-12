package com.tencent.mm.plugin.report.b;

import com.tencent.mars.smc.SmcLogic;
import com.tencent.mars.smc.SmcProtoBufUtil;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.a.a.h;
import com.tencent.mm.protocal.a.a.i;
import com.tencent.mm.protocal.a.a.j;
import com.tencent.mm.protocal.c.ami;
import com.tencent.mm.protocal.c.pb;
import com.tencent.mm.protocal.c.pc;
import com.tencent.mm.protocal.y;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class e
  extends l
  implements k
{
  int bVU = 0;
  private com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  private boolean iLZ = false;
  private pb mDP = null;
  private a mDQ = new a();
  
  public e(byte[] paramArrayOfByte, int paramInt)
  {
    if (paramArrayOfByte == null) {
      throw new NullPointerException("data must not be null");
    }
    this.bVU = paramInt;
    com.tencent.mm.kernel.g.Eg();
    this.iLZ = com.tencent.mm.kernel.a.Dw();
    if (paramInt == 1) {}
    for (;;)
    {
      Object localObject;
      try
      {
        localObject = new i();
        ((i)localObject).aG(paramArrayOfByte);
        this.mDP = SmcProtoBufUtil.toMMReportKvReq((i)localObject);
        if (this.mDP == null) {
          break;
        }
        this.mDP.rtn = new ami();
        this.mDP.rtn.rOY = a.vs(this.bVU);
        return;
      }
      catch (Exception paramArrayOfByte)
      {
        x.e("MicroMsg.NetSceneCliReportKV", "parse data error");
        com.tencent.mm.kernel.g.Ek();
        com.tencent.mm.kernel.g.Em().H(new Runnable()
        {
          public final void run()
          {
            SmcLogic.OnReportResp(3, -1, null, e.this.bVU);
          }
        });
        continue;
      }
      if (paramInt == 2) {
        try
        {
          localObject = new com.tencent.mm.protocal.a.a.g();
          ((com.tencent.mm.protocal.a.a.g)localObject).aG(paramArrayOfByte);
          this.mDP = SmcProtoBufUtil.toMMReportIdkeyReq((com.tencent.mm.protocal.a.a.g)localObject);
        }
        catch (Exception paramArrayOfByte)
        {
          x.e("MicroMsg.NetSceneCliReportKV", "parse data error");
          com.tencent.mm.kernel.g.Ek();
          com.tencent.mm.kernel.g.Em().H(new Runnable()
          {
            public final void run()
            {
              SmcLogic.OnReportResp(3, -1, null, e.this.bVU);
            }
          });
        }
      }
    }
    x.i("MicroMsg.NetSceneCliReportKV", "NetSceneCliReportKV parse req is null, stack[%s]", new Object[] { bi.cjd() });
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    int i;
    if (this.mDP == null)
    {
      x.e("MicroMsg.NetSceneCliReportKV", "do scene but req is null!");
      i = -2;
      return i;
    }
    if (!this.iLZ) {
      this.mDP.rtm = com.tencent.mm.bk.b.bi(bi.ciV());
    }
    b.a locala = new b.a();
    locala.dIK = false;
    locala.dIG = this.mDP;
    locala.dIH = new pc();
    label91:
    String str;
    if (1 == this.bVU)
    {
      parame1 = "/cgi-bin/micromsg-bin/newreportkvcomm";
      if (1 != this.bVU) {
        break label249;
      }
      str = "/cgi-bin/micromsg-bin/newreportkvcommrsa";
      label103:
      if (!this.iLZ) {
        break label256;
      }
    }
    for (;;)
    {
      locala.uri = parame1;
      locala.dIF = getType();
      this.diG = locala.KT();
      if (!this.iLZ)
      {
        this.diG.a(y.cgs());
        this.diG.cdn = 1;
      }
      int j = a(parame, this.diG, this);
      i = j;
      if (j >= 0) {
        break;
      }
      x.i("MicroMsg.NetSceneCliReportKV", "mark all failed. do scene %d", new Object[] { Integer.valueOf(j) });
      try
      {
        SmcLogic.OnReportResp(3, -1, null, this.bVU);
        return j;
      }
      catch (Exception parame)
      {
        x.e("MicroMsg.NetSceneCliReportKV", "updateReportStrategy failed  hash:%d  , ex:%s", new Object[] { Integer.valueOf(hashCode()), bi.i(parame) });
        return j;
      }
      parame1 = "/cgi-bin/micromsg-bin/newreportidkey";
      break label91;
      label249:
      str = "/cgi-bin/micromsg-bin/newreportidkeyrsa";
      break label103;
      label256:
      parame1 = str;
    }
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    if ((com.tencent.mm.kernel.g.Eh().dpP == null) || (com.tencent.mm.kernel.g.Eh().dpP.dJs == null))
    {
      x.f("MicroMsg.NetSceneCliReportKV", "null == MMCore.getNetSceneQueue().getDispatcher(), can't give response to kvcomm.");
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    if (paramInt2 != 0)
    {
      x.e("MicroMsg.NetSceneCliReportKV", "get cli_report_kv strategy err, errType:" + paramInt2 + ", errCode:" + paramInt3);
      SmcLogic.OnReportResp(paramInt2, paramInt3, null, this.bVU);
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    x.d("MicroMsg.NetSceneCliReportKV", "get cli_report_kv strategy ok, channel:" + this.bVU);
    paramq = (pc)this.diG.dIE.dIL;
    this.mDQ.a(paramq.rtx, this.bVU);
    try
    {
      if (this.bVU == 1) {
        SmcLogic.OnReportResp(0, 0, SmcProtoBufUtil.toSmcReportKvResp(paramq).toByteArray(), this.bVU);
      }
      for (;;)
      {
        this.diJ.a(paramInt2, paramInt3, paramString, this);
        return;
        if (this.bVU == 2) {
          SmcLogic.OnReportResp(0, 0, SmcProtoBufUtil.toSmcReportIdkeyResp(paramq).toByteArray(), this.bVU);
        }
      }
    }
    catch (Exception paramq)
    {
      for (;;)
      {
        x.e("MicroMsg.NetSceneCliReportKV", "updateReportStrategy failed  hash:%d  , ex:%s", new Object[] { Integer.valueOf(hashCode()), bi.i(paramq) });
      }
    }
  }
  
  public final int getType()
  {
    if (!this.iLZ)
    {
      if (1 == this.bVU) {
        return 997;
      }
      return 987;
    }
    if (1 == this.bVU) {
      return 996;
    }
    return 986;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/report/b/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */