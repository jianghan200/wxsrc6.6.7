package com.tencent.mm.plugin.wear.model.d;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.l.a;
import com.tencent.mm.ab.l.b;
import com.tencent.mm.model.au;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.bwa;
import com.tencent.mm.protocal.c.bwb;
import com.tencent.mm.sdk.platformtools.al;
import java.util.UUID;

public final class c
  extends l
  implements k
{
  private String clientId;
  al dHa = new al(new c.1(this), true);
  private com.tencent.mm.ab.b diG;
  com.tencent.mm.ab.e diJ;
  public boolean eoE = false;
  private boolean eql = false;
  private int eqp = 0;
  String filename = null;
  public int mFO;
  int pJL = 0;
  public String pJM;
  public boolean pJN;
  public String talker;
  
  public c(String paramString1, String paramString2, int paramInt)
  {
    this.mFO = paramInt;
    this.talker = paramString2;
    this.filename = paramString1;
    this.eqp = 0;
    this.clientId = UUID.randomUUID().toString();
  }
  
  private static String d(bhy parambhy)
  {
    if ((parambhy != null) && (parambhy.siK != null)) {
      return parambhy.siK.cfV();
    }
    return null;
  }
  
  protected final int Cc()
  {
    return 20;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    int j = 0;
    this.diJ = parame1;
    int m = com.tencent.mm.a.e.cm(this.filename);
    if (m <= 0)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.Wear.NetSceneVoiceToText", "doScene file length is zero: %s", new Object[] { this.filename });
      j = -1;
      return j;
    }
    int k = m - this.pJL;
    int i;
    if (k > 3960) {
      i = 3960;
    }
    for (;;)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Wear.NetSceneVoiceToText", "fileLength: %d | readOffset: %d | isRecordFinish=%b | endFlag=%b | filename=%s", new Object[] { Integer.valueOf(m), Integer.valueOf(this.pJL), Boolean.valueOf(this.eoE), Boolean.valueOf(this.eql), this.filename });
      parame1 = com.tencent.mm.a.e.e(this.filename, this.pJL, i);
      if (parame1 != null) {
        break label254;
      }
      if (this.eql) {
        break;
      }
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.Wear.NetSceneVoiceToText", "Can not read file: canReadLen=%d | isRecordFinish=%b | endFlag=%b", new Object[] { Integer.valueOf(i), Boolean.valueOf(this.eoE), Boolean.valueOf(this.eql) });
      return -1;
      if ((k < 3300) && (!this.eoE))
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.Wear.NetSceneVoiceToText", "try to send a buf less than MIN_SEND_BYTE_PER_PACK: canReadLen=%d | isRecordFinished=%b", new Object[] { Integer.valueOf(k), Boolean.valueOf(this.eoE) });
        return -1;
      }
      i = k;
      if (this.eoE)
      {
        this.eql = true;
        i = k;
      }
    }
    label254:
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bwa();
    ((b.a)localObject).dIH = new bwb();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/uploadinputvoice";
    ((b.a)localObject).dIF = 349;
    ((b.a)localObject).dII = 158;
    ((b.a)localObject).dIJ = 1000000158;
    this.diG = ((b.a)localObject).KT();
    localObject = (bwa)this.diG.dID.dIL;
    au.HU();
    ((bwa)localObject).hbL = ((String)com.tencent.mm.model.c.DT().get(2, ""));
    ((bwa)localObject).rtW = new bhy().bq(parame1);
    ((bwa)localObject).rjC = this.pJL;
    ((bwa)localObject).sso = this.clientId;
    if (this.eql)
    {
      i = 1;
      ((bwa)localObject).rgC = i;
      ((bwa)localObject).ssp = 0;
      ((bwa)localObject).reb = 0;
      ((bwa)localObject).ssq = this.eqp;
      ((bwa)localObject).rdY = 0;
      i = a(parame, this.diG, this);
      j = ((bwa)localObject).rjC;
      this.pJL = (((bwa)localObject).rtW.siI + j);
      if (!this.eoE) {
        break label535;
      }
    }
    label535:
    for (long l = 0L;; l = 500L)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Wear.NetSceneVoiceToText", "doScene filename=%s | delay=%d | ret=%d", new Object[] { this.filename, Long.valueOf(l), Integer.valueOf(i) });
      this.dHa.J(l, l);
      return i;
      i = 0;
      break;
    }
  }
  
  protected final int a(q paramq)
  {
    return l.b.dJm;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Wear.NetSceneVoiceToText", "onGYNetEnd errorType=%d | errorCode=%d |filename=%s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), this.filename });
    paramq = (bwb)((com.tencent.mm.ab.b)paramq).dIE.dIL;
    if ((paramInt2 != 0) || (paramInt3 != 0)) {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
    do
    {
      return;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Wear.NetSceneVoiceToText", "resp EndFlag=%d | Text=%s", new Object[] { Integer.valueOf(paramq.rgC), d(paramq.ssr) });
    } while (paramq.rgC != 1);
    this.pJN = true;
    paramq = d(paramq.ssr);
    if (paramq != null) {
      this.pJM = paramq;
    }
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  protected final void a(l.a parama)
  {
    this.diJ.a(3, 0, "securityCheckError", this);
  }
  
  public final int getType()
  {
    return 349;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/wear/model/d/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */