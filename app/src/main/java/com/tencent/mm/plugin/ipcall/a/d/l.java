package com.tencent.mm.plugin.ipcall.a.d;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.plugin.ipcall.a.i;
import com.tencent.mm.plugin.ipcall.b.c;
import com.tencent.mm.protocal.c.bcg;
import com.tencent.mm.protocal.c.bch;
import com.tencent.mm.sdk.platformtools.x;

public final class l
  extends com.tencent.mm.ab.l
  implements k
{
  private com.tencent.mm.ab.b diG = null;
  private com.tencent.mm.ab.e diJ;
  private bcg krC = null;
  private bch krD = null;
  
  public l(int paramInt, long paramLong, boolean paramBoolean)
  {
    Object localObject1 = new b.a();
    ((b.a)localObject1).dIG = new bcg();
    ((b.a)localObject1).dIH = new bch();
    ((b.a)localObject1).dIF = 227;
    ((b.a)localObject1).uri = "/cgi-bin/micromsg-bin/pstnreport";
    ((b.a)localObject1).dII = 0;
    ((b.a)localObject1).dIJ = 0;
    this.diG = ((b.a)localObject1).KT();
    this.krC = ((bcg)this.diG.dID.dIL);
    this.krC.rxG = paramInt;
    this.krC.seh = paramLong;
    localObject1 = this.krC;
    if (paramBoolean) {}
    for (paramInt = 1;; paramInt = 0)
    {
      ((bcg)localObject1).seB = paramInt;
      x.d("MicroMsg.NetSceneIPCallReport", "NetSceneIPCallReport, roomId: %d, callseq: %d, gotAnswer: %d", new Object[] { Integer.valueOf(this.krC.rxG), Long.valueOf(this.krC.seh), Integer.valueOf(this.krC.seB) });
      localObject1 = this.krC;
      Object localObject2 = i.aXr();
      localObject2 = ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).kpo + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).kpp + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).kqO + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).eNQ + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).kqP + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).kqE + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).kqF + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).kqG + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).kqH + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).kqI + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).kqJ + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).kqK + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).kqL + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).kqM + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).kqN + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).kqQ + "," + c.aYA() + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).kqZ + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).countryCode + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).kra + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).krb + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).krc + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).kqX + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).kre;
      x.i("MicroMsg.IPCallReportHelper", "getPstnClientReportString, result: %s", new Object[] { localObject2 });
      ((bcg)localObject1).sey = ab.oT((String)localObject2);
      localObject1 = this.krC;
      localObject2 = i.aXr();
      localObject2 = ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).kpo + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).kpp + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).kqO + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).kqW;
      x.i("MicroMsg.IPCallReportHelper", "getPstnChannelReportString, result: %s", new Object[] { localObject2 });
      ((bcg)localObject1).sez = ab.oT((String)localObject2);
      localObject1 = this.krC;
      localObject2 = i.aXr();
      localObject2 = ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).kpo + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).kpp + "," + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).kqO + ((com.tencent.mm.plugin.ipcall.a.c.b)localObject2).kqV;
      x.i("MicroMsg.IPCallReportHelper", "getPstnEngineReport, result: %s", new Object[] { localObject2 });
      ((bcg)localObject1).seA = ab.oT((String)localObject2);
      return;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneIPCallReport", "onGYNetEnd, errType: %d, errCode: %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.krD = ((bch)((com.tencent.mm.ab.b)paramq).dIE.dIL);
    if (this.diJ != null) {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
  }
  
  public final int getType()
  {
    return 227;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/d/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */