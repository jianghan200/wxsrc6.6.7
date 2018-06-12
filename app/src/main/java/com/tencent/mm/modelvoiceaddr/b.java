package com.tencent.mm.modelvoiceaddr;

import android.os.HandlerThread;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l.a;
import com.tencent.mm.ab.l.b;
import com.tencent.mm.ab.o;
import com.tencent.mm.ab.o.4;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.bhz;
import com.tencent.mm.protocal.c.bys;
import com.tencent.mm.protocal.c.byu;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;

public final class b
  extends a
  implements k
{
  private com.tencent.mm.ab.e diJ;
  private int djl = 120;
  private int ehi = 0;
  private boolean eoE = false;
  g eqa;
  private boolean eqb = false;
  private boolean eqc = false;
  private int eqd = 0;
  private bhz eqe = null;
  private String[] eqf = new String[0];
  private int eqg = 3960;
  private ag eqh = new b.2(this, com.tencent.mm.kernel.g.Em().lnJ.getLooper());
  private String filename = null;
  private int retCode = 0;
  
  public b(String paramString1, String paramString2, String paramString3)
  {
    this.filename = paramString1;
    this.eqa = new g(paramString2);
    this.eqe = new bhz().VO(paramString3);
    x.i("MicroMsg.NetSceneNewVoiceInput", "NetSceneNewVoiceInput filename:%s,session:%s,vadVersion:%s", new Object[] { paramString1, paramString2, paramString3 });
  }
  
  private void TX()
  {
    x.d("MicroMsg.NetSceneNewVoiceInput", com.tencent.mm.compatible.util.g.Ac());
    if (this.eqh != null) {
      this.eqh.removeMessages(291);
    }
    this.eqb = true;
  }
  
  protected final int Cc()
  {
    return 2000;
  }
  
  protected final boolean KZ()
  {
    return true;
  }
  
  public final void TR()
  {
    this.eoE = true;
  }
  
  public final String[] TS()
  {
    return this.eqf;
  }
  
  public final long TT()
  {
    return 0L;
  }
  
  public final Set<String> TU()
  {
    g localg = this.eqa;
    HashSet localHashSet = new HashSet();
    localg.eqN.readLock().lock();
    Iterator localIterator = localg.eqM.values().iterator();
    while (localIterator.hasNext())
    {
      g.a locala = (g.a)localIterator.next();
      if (locala.eqQ) {
        localHashSet.add(locala.eqP);
      }
    }
    localg.eqN.readLock().unlock();
    return localHashSet;
  }
  
  public final boolean TV()
  {
    x.d("MicroMsg.NetSceneNewVoiceInput", "preDoScene");
    this.eqh.removeMessages(291);
    if (((this.eqa.Uf()) && (this.eoE)) || (this.eqb))
    {
      x.i("MicroMsg.NetSceneNewVoiceInput", "preDoScene return");
      return false;
    }
    g.a locala = this.eqa.iJ(this.ehi);
    if (locala != null)
    {
      int i = com.tencent.mm.a.e.cm(this.filename);
      int j = Math.min(i, locala.eqS);
      x.d("MicroMsg.NetSceneNewVoiceInput", "fileLength %s info.voiceFileMark %s nowMarkLen %s", new Object[] { Integer.valueOf(i), Integer.valueOf(locala.eqS), Integer.valueOf(j) });
      if (j <= 0)
      {
        x.e("MicroMsg.NetSceneNewVoiceInput", "nowMarkLen <= 0 read failed :%s", new Object[] { this.filename });
        this.retCode = (com.tencent.mm.compatible.util.g.getLine() + 40000);
        this.eqd = 0;
        TW();
        this.diJ.a(3, -1, "ReadFileLengthError", null);
        return false;
      }
      this.eqd = (j - this.ehi);
      if (this.eqd < 0)
      {
        x.i("MicroMsg.NetSceneNewVoiceInput", "canReadLen < 0 length:%s ", new Object[] { Integer.valueOf(this.eqd) });
        this.retCode = (com.tencent.mm.compatible.util.g.getLine() + 40000);
        this.eqh.sendEmptyMessageDelayed(291, this.djl * 2);
        return false;
      }
      x.d("MicroMsg.NetSceneNewVoiceInput", "can read length : %s,reqSeq:%s,interval:%s", new Object[] { Integer.valueOf(this.eqd), Integer.valueOf(locala.eqT), Integer.valueOf(this.djl) });
      if ((this.eqd < 500) && (locala.eqT > 5))
      {
        x.d("MicroMsg.NetSceneNewVoiceInput", "can read length : %s double interval", new Object[] { Integer.valueOf(this.eqd) });
        this.eqh.sendEmptyMessageDelayed(291, this.djl * 2);
      }
      for (;;)
      {
        return true;
        this.eqh.sendEmptyMessageDelayed(291, this.djl);
      }
    }
    this.eqh.sendEmptyMessageDelayed(291, this.djl * 2);
    return true;
  }
  
  public final void TW()
  {
    x.d("MicroMsg.NetSceneNewVoiceInput", com.tencent.mm.compatible.util.g.Ac());
    if (this.eqc) {}
    Object localObject;
    do
    {
      return;
      this.eqc = true;
      TX();
      localObject = com.tencent.mm.kernel.g.DF();
      int i = hashCode();
      x.l("MicroMsg.NetSceneQueue", "cancelAllImp sceneHashCode:%d", new Object[] { Integer.valueOf(i) });
      ((o)localObject).dJt.H(new o.4((o)localObject, i));
      localObject = this.eqa.iJ(this.ehi);
    } while (localObject == null);
    this.eqd = 0;
    com.tencent.mm.kernel.g.Em().H(new b.1(this, (g.a)localObject));
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    parame1 = new b.a();
    parame1.dIG = new bys();
    parame1.dIH = new byu();
    parame1.uri = "/cgi-bin/micromsg-bin/voicetrans";
    parame1.dIF = 235;
    parame1.dII = 381;
    parame1.dIJ = 1000000381;
    parame1 = parame1.KT();
    parame1.KV().qWx = false;
    Object localObject1 = (bys)parame1.dID.dIL;
    Object localObject2 = this.eqa.iJ(this.ehi);
    if (localObject2 == null)
    {
      ((bys)localObject1).rtW = new bhy();
      ((bys)localObject1).rjC = this.ehi;
      ((bys)localObject1).sso = "0";
      ((bys)localObject1).rgC = 1;
      ((bys)localObject1).ssq = 2;
      ((bys)localObject1).rko = 0;
      ((bys)localObject1).suD = this.eqa.Ue();
      if (((bys)localObject1).suD == null) {}
      for (i = 0;; i = ((bys)localObject1).suD.size())
      {
        ((bys)localObject1).suC = i;
        ((bys)localObject1).shU = this.eqe;
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append("[");
        localObject1 = ((bys)localObject1).suD.iterator();
        while (((Iterator)localObject1).hasNext()) {
          ((StringBuilder)localObject2).append(((bhz)((Iterator)localObject1).next()).siM).append(", ");
        }
      }
      ((StringBuilder)localObject2).append("]");
      x.d("MicroMsg.NetSceneNewVoiceInput", "send empty packet fetch %s time %s", new Object[] { ((StringBuilder)localObject2).toString(), Long.valueOf(System.currentTimeMillis()) });
      return a(parame, parame1, this);
    }
    ((g.a)localObject2).eqQ = true;
    if (this.eqc)
    {
      ((g.a)localObject2).eqR = true;
      ((bys)localObject1).rtW = new bhy();
      x.i("MicroMsg.NetSceneNewVoiceInput", "send last packet");
      ((bys)localObject1).rjC = this.ehi;
      ((bys)localObject1).sso = ((g.a)localObject2).eqP;
      if (!((g.a)localObject2).eqR) {
        break label775;
      }
      i = 1;
      label385:
      ((bys)localObject1).rgC = i;
      ((bys)localObject1).ssq = 2;
      i = ((g.a)localObject2).eqT + 1;
      ((g.a)localObject2).eqT = i;
      ((bys)localObject1).rko = i;
      ((bys)localObject1).suD = this.eqa.Ue();
      if (((bys)localObject1).suD != null) {
        break label780;
      }
    }
    label775:
    label780:
    for (int i = 0;; i = ((bys)localObject1).suD.size())
    {
      ((bys)localObject1).suC = i;
      ((bys)localObject1).shU = this.eqe;
      x.d("MicroMsg.NetSceneNewVoiceInput", "%s, read filename: %s, voiceFileMarkEnd: %s, oldReadOffset: %s, canReadLen %s, getILen %s, isRequestEnd: %s, Seq %s, FetchVoiceIds %s, VadVersion %s", new Object[] { com.tencent.mm.compatible.util.g.Ac(), this.filename, Integer.valueOf(((g.a)localObject2).eqS), Integer.valueOf(this.ehi), Integer.valueOf(this.eqd), Integer.valueOf(((bys)localObject1).rtW.siI), Boolean.valueOf(((g.a)localObject2).eqR), Integer.valueOf(((bys)localObject1).rko), ((bys)localObject1).suD, ((bys)localObject1).shU });
      i = this.ehi;
      this.ehi = (((bys)localObject1).rtW.siI + i);
      x.i("MicroMsg.NetSceneNewVoiceInput", "clientId %s oldReadOffset %s", new Object[] { ((g.a)localObject2).eqP, Integer.valueOf(this.ehi) });
      if (((g.a)localObject2).eqT == 1) {
        x.i("MicroMsg.NetSceneNewVoiceInput", "time flee send seq 1 time = %s", new Object[] { Long.valueOf(System.currentTimeMillis()) });
      }
      x.d("MicroMsg.NetSceneNewVoiceInput", "send dispatch packet time %s", new Object[] { Long.valueOf(System.currentTimeMillis()) });
      return a(parame, parame1, this);
      if (this.eqd > this.eqg) {
        this.eqd = this.eqg;
      }
      for (((g.a)localObject2).eqR = false;; ((g.a)localObject2).eqR = true) {
        do
        {
          byte[] arrayOfByte = com.tencent.mm.a.e.e(this.filename, this.ehi, this.eqd);
          ((bys)localObject1).rtW = new bhy().bq(arrayOfByte);
          break;
        } while ((this.eqd > this.eqg) || ((((g.a)localObject2).eqS == Integer.MAX_VALUE) && (!this.eoE)));
      }
      i = 0;
      break label385;
    }
  }
  
  protected final int a(q paramq)
  {
    return l.b.dJm;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSceneNewVoiceInput", "%s time:%s errType: %s, errCode: %s, errMsg: %s", new Object[] { com.tencent.mm.compatible.util.g.Ac(), Long.valueOf(System.currentTimeMillis()), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 == 3) && (paramInt3 == -1)) {
      x.i("MicroMsg.NetSceneNewVoiceInput", "getStack([ %s ]), ThreadID: %s", new Object[] { bi.cjd(), Long.valueOf(Thread.currentThread().getId()) });
    }
    paramArrayOfByte = (bys)((com.tencent.mm.ab.b)paramq).dID.dIL;
    paramq = (byu)((com.tencent.mm.ab.b)paramq).dIE.dIL;
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      x.i("MicroMsg.NetSceneNewVoiceInput", com.tencent.mm.compatible.util.g.Ac() + " onGYNetEnd file: %s errType:%s errCode:%s", new Object[] { this.filename, Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
      TW();
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    x.d("MicroMsg.NetSceneNewVoiceInput", "onGYNetEnd voiceId = %s, seq = %s, time = %s", new Object[] { paramArrayOfByte.sso, Integer.valueOf(paramArrayOfByte.rko), Long.valueOf(System.currentTimeMillis()) });
    this.eqa.Y(paramq.suH);
    if ((this.eqa.Uf()) && (this.eoE))
    {
      x.d("MicroMsg.NetSceneNewVoiceInput", "onGYNetEnd isAllRespEnd && isRecordFinish");
      TX();
    }
    this.eqf = new String[] { this.eqa.getResult() };
    this.diJ.a(paramInt2, paramInt3, paramString, this);
    if (paramq.suI <= 0)
    {
      paramInt1 = this.eqg;
      this.eqg = paramInt1;
      if (paramq.sga >= 0) {
        break label386;
      }
    }
    label386:
    for (paramInt1 = 120;; paramInt1 = paramq.sga)
    {
      this.djl = paramInt1;
      x.d("MicroMsg.NetSceneNewVoiceInput", "onGYNetEnd max_send_byte_per_pack = %s, interval = %s", new Object[] { Integer.valueOf(this.eqg), Integer.valueOf(this.djl) });
      return;
      paramInt1 = paramq.suI;
      break;
    }
  }
  
  protected final void a(l.a parama)
  {
    x.w("MicroMsg.NetSceneNewVoiceInput", com.tencent.mm.compatible.util.g.Ac() + " setSecurityCheckError e: %s", new Object[] { parama });
    if (parama == l.a.dJj)
    {
      TW();
      this.diJ.a(3, -1, "SecurityCheckError", this);
    }
  }
  
  public final int getType()
  {
    return 235;
  }
  
  public final void iI(int paramInt)
  {
    x.d("MicroMsg.NetSceneNewVoiceInput", "%s %s", new Object[] { com.tencent.mm.compatible.util.g.Ac(), Integer.valueOf(paramInt) });
    if (paramInt < 0) {
      throw new IllegalStateException();
    }
    this.eqa.iI(paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/modelvoiceaddr/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */