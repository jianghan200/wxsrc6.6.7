package com.tencent.mm.plugin.backup.bakoldlogic.c;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.backup.a.d;
import com.tencent.mm.protocal.c.acg;
import com.tencent.mm.protocal.c.ach;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class f
  extends l
  implements k
{
  private final com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  
  public f(String paramString)
  {
    x.i("MicroMsg.NetSceneGetConnectInfo", "summerbak NetSceneGetConnectInfo init, url[%s], stack[%s]", new Object[] { paramString, bi.cjd() });
    b.a locala = new b.a();
    locala.dIG = new acg();
    locala.dIH = new ach();
    locala.uri = "/cgi-bin/micromsg-bin/getconnectinfo";
    locala.dII = 0;
    locala.dIJ = 0;
    locala.dIF = 595;
    this.diG = locala.KT();
    ((acg)this.diG.dID.dIL).URL = paramString;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneGetConnectInfo", "errType %d,  errCode %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (ach)this.diG.dIE.dIL;
      d.X(paramq.reV.siK.lR);
      x.i("MicroMsg.NetSceneGetConnectInfo", "id:%s  hello:%s, ok:%s, PCName:%s, PCAcctName:%s, scene:%d", new Object[] { paramq.ID, paramq.rfr, paramq.rfs, paramq.rfj, paramq.rfk, Integer.valueOf(paramq.otY) });
      x.i("MicroMsg.NetSceneGetConnectInfo", "resource:%s", new Object[] { paramq.rGT });
      paramq = paramq.reV.siK;
    }
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final ach atg()
  {
    return (ach)this.diG.dIE.dIL;
  }
  
  public final int getType()
  {
    return 595;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/backup/bakoldlogic/c/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */