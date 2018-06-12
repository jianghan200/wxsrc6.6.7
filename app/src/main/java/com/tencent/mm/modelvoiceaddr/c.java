package com.tencent.mm.modelvoiceaddr;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l.a;
import com.tencent.mm.ab.l.b;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.bhz;
import com.tencent.mm.protocal.c.bym;
import com.tencent.mm.protocal.c.byn;
import com.tencent.mm.sdk.platformtools.al;
import java.util.LinkedList;
import java.util.Set;

public final class c
  extends a
  implements k
{
  al dHa = new al(new c.1(this), true);
  private com.tencent.mm.ab.b diG;
  com.tencent.mm.ab.e diJ;
  int ehi = 0;
  boolean eoE = false;
  private long eqk = -1L;
  private boolean eql = false;
  private int eqm;
  private String[] eqn = new String[0];
  String filename = null;
  int retCode = 0;
  
  public c(String paramString, int paramInt)
  {
    this.filename = paramString;
    this.eqm = paramInt;
  }
  
  protected final int Cc()
  {
    return 20;
  }
  
  public final void TR()
  {
    this.eoE = true;
  }
  
  public final String[] TS()
  {
    return this.eqn;
  }
  
  public final long TT()
  {
    return this.eqk;
  }
  
  public final Set<String> TU()
  {
    return null;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    int i = 3960;
    this.diJ = parame1;
    int k = com.tencent.mm.a.e.cm(this.filename);
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneVoiceAddr", com.tencent.mm.compatible.util.g.Ac() + " read file:" + this.filename + " filelen:" + k + " oldoff:" + this.ehi + " isFin:" + this.eoE);
    if (k <= 0)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneVoiceAddr", "read failed :" + this.filename);
      this.retCode = (com.tencent.mm.compatible.util.g.getLine() + 40000);
      return -1;
    }
    int j = k - this.ehi;
    if (j > 3960) {}
    for (;;)
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneVoiceAddr", com.tencent.mm.compatible.util.g.Ac() + " read file:" + this.filename + " filelen:" + k + " oldoff:" + this.ehi + " isFin:" + this.eoE + " endFlag:" + this.eql);
      parame1 = com.tencent.mm.a.e.e(this.filename, this.ehi, i);
      if (parame1 != null) {
        break;
      }
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneVoiceAddr", com.tencent.mm.compatible.util.g.Ac() + " read failed :" + this.filename + " read:" + i);
      this.retCode = (com.tencent.mm.compatible.util.g.getLine() + 40000);
      return -1;
      if ((j < 3300) && (!this.eoE))
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneVoiceAddr", com.tencent.mm.compatible.util.g.Ac() + " read failed :" + this.filename + "can read:" + j + " isfinish:" + this.eoE);
        this.retCode = (com.tencent.mm.compatible.util.g.getLine() + 40000);
        return -1;
      }
      if (this.eoE) {
        this.eql = true;
      }
      i = j;
    }
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bym();
    ((b.a)localObject).dIH = new byn();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/voiceaddr";
    ((b.a)localObject).dIF = 206;
    ((b.a)localObject).dII = 94;
    ((b.a)localObject).dIJ = 1000000094;
    this.diG = ((b.a)localObject).KT();
    localObject = (bym)this.diG.dID.dIL;
    ((bym)localObject).rtW = new bhy().bq(parame1);
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneVoiceAddr", com.tencent.mm.compatible.util.g.Ac() + " read file:" + this.filename + " readlen:" + parame1.length + " datalen:" + ((bym)localObject).rtW.siK.toByteArray().length + " dataiLen:" + ((bym)localObject).rtW.siI + " md5:" + com.tencent.mm.a.g.u(parame1) + " datamd5:" + com.tencent.mm.a.g.u(((bym)localObject).rtW.siK.toByteArray()));
    ((bym)localObject).hbL = ((String)com.tencent.mm.kernel.g.Ei().DT().get(2, ""));
    ((bym)localObject).rjC = this.ehi;
    ((bym)localObject).sso = this.eqk;
    if (this.eql) {}
    for (i = 1;; i = 0)
    {
      ((bym)localObject).rgC = i;
      ((bym)localObject).ssp = 0;
      ((bym)localObject).reb = 0;
      ((bym)localObject).ssq = 0;
      ((bym)localObject).rdY = 0;
      ((bym)localObject).sut = this.eqm;
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneVoiceAddr", "clientId " + this.eqk);
      return a(parame, this.diG, this);
    }
  }
  
  protected final int a(q paramq)
  {
    return l.b.dJm;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneVoiceAddr", com.tencent.mm.compatible.util.g.Ac() + " onGYNetEnd file:" + this.filename + " errtype:" + paramInt2 + " errCode:" + paramInt3);
    paramArrayOfByte = (bym)((com.tencent.mm.ab.b)paramq).dID.dIL;
    paramq = (byn)((com.tencent.mm.ab.b)paramq).dIE.dIL;
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneVoiceAddr", com.tencent.mm.compatible.util.g.Ac() + " onGYNetEnd file:" + this.filename + " errType:" + paramInt2 + " errCode:" + paramInt3);
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneVoiceAddr", com.tencent.mm.compatible.util.g.Ac() + " onGYNetEnd  file:" + this.filename + " endflag:" + paramq.rgC + " lst:" + paramq.rgF);
    if (paramArrayOfByte.rgC == 1)
    {
      this.eqn = new String[paramq.rgF.size()];
      paramInt1 = 0;
      while (paramInt1 < paramq.rgF.size())
      {
        this.eqn[paramInt1] = ((bhz)paramq.rgF.get(paramInt1)).siM;
        paramInt1 += 1;
      }
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    paramInt1 = paramArrayOfByte.rjC;
    this.ehi = (paramArrayOfByte.rtW.siI + paramInt1);
    if (this.eoE) {}
    for (long l = 0L;; l = 500L)
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneVoiceAddr", "onGYNetEnd file:" + this.filename + " delay:" + l);
      this.dHa.J(l, l);
      return;
    }
  }
  
  protected final void a(l.a parama)
  {
    this.diJ.a(3, com.tencent.mm.compatible.util.g.getLine() + 40000, "ecurityCheckError", this);
  }
  
  public final int getType()
  {
    return 206;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/modelvoiceaddr/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */