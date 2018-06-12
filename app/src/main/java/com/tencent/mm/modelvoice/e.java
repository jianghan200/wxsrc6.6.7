package com.tencent.mm.modelvoice;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.l.a;
import com.tencent.mm.ab.l.b;
import com.tencent.mm.compatible.util.g;
import com.tencent.mm.model.ao;
import com.tencent.mm.model.s;
import com.tencent.mm.network.k;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.sq;
import com.tencent.mm.protocal.c.sr;
import com.tencent.mm.protocal.k.e;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.bd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import junit.framework.Assert;

public final class e
  extends l
  implements k
{
  private static ao eoC = null;
  private static List<c> eoD = new ArrayList();
  private String bWJ;
  private al dHa = new al(new e.2(this), false);
  private com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  private String eoB;
  private boolean eoE = false;
  private boolean eoF = false;
  public String fileName;
  public int retCode = 0;
  
  public e(p paramp)
  {
    if (paramp != null)
    {
      bool = true;
      Assert.assertTrue(bool);
      this.fileName = paramp.fileName;
      if (this.fileName == null) {
        break label124;
      }
    }
    label124:
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      this.eoB = paramp.eoB;
      this.bWJ = paramp.bWJ;
      x.i("MicroMsg.NetSceneDownloadVoice", "NetSceneDownloadVoice:  file[%s] voiceFormat[%s] user[%s]", new Object[] { this.fileName, this.eoB, this.bWJ });
      return;
      bool = false;
      break;
    }
  }
  
  public static void a(ao paramao)
  {
    if (eoC == null) {
      eoC = paramao;
    }
  }
  
  public static void a(c paramc)
  {
    if (!eoD.contains(paramc)) {
      eoD.add(paramc);
    }
  }
  
  public static void b(c paramc)
  {
    eoD.remove(paramc);
  }
  
  private void doNotify()
  {
    bd localbd = q.os(this.fileName);
    if (localbd != null)
    {
      if (eoC != null) {
        eoC.a(localbd);
      }
      Iterator localIterator = eoD.iterator();
      while (localIterator.hasNext()) {
        ah.A(new e.1(this, (c)localIterator.next(), localbd));
      }
    }
  }
  
  protected final int Cc()
  {
    return 100;
  }
  
  public final boolean KY()
  {
    boolean bool = super.KY();
    if (bool) {
      h.mEJ.a(111L, 232L, 1L, false);
    }
    return bool;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    if (this.fileName == null)
    {
      x.e("MicroMsg.NetSceneDownloadVoice", "doScene:  filename null!");
      this.retCode = (g.getLine() + 10000);
      return -1;
    }
    parame1 = q.ot(this.fileName);
    if ((parame1 == null) || (!parame1.TL()))
    {
      x.e("MicroMsg.NetSceneDownloadVoice", "Get info Failed file:" + this.fileName);
      this.retCode = (g.getLine() + 10000);
      return -1;
    }
    x.i("MicroMsg.NetSceneDownloadVoice", "doScene file:" + this.fileName + " netTimes:" + parame1.enO);
    if (!q.oj(this.fileName))
    {
      x.e("MicroMsg.NetSceneDownloadVoice", "checkVoiceNetTimes Failed file:" + this.fileName);
      q.nP(this.fileName);
      this.retCode = (g.getLine() + 10000);
      return -1;
    }
    int i = parame1.emu - parame1.enH;
    if (i <= 0)
    {
      if (parame1.status == 5)
      {
        this.eoF = true;
        x.e("MicroMsg.NetSceneDownloadVoice", "doScene file:" + this.fileName + " Net:" + parame1.emu + " Local:" + parame1.enH);
        this.retCode = (g.getLine() + 10000);
        return -1;
      }
      q.a(this.fileName, parame1.enH, null);
      this.retCode = (g.getLine() + 10000);
      return -1;
    }
    if (parame1.dHI == parame1.emu) {
      this.eoE = true;
    }
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new sq();
    ((b.a)localObject).dIH = new sr();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/downloadvoice";
    ((b.a)localObject).dIF = 128;
    ((b.a)localObject).dII = 20;
    ((b.a)localObject).dIJ = 1000000020;
    this.diG = ((b.a)localObject).KT();
    localObject = (sq)this.diG.dID.dIL;
    ((sq)localObject).rdo = parame1.clientId;
    ((sq)localObject).rcq = parame1.bYu;
    ((sq)localObject).rvV = i;
    ((sq)localObject).rjC = parame1.enH;
    if (s.fq(this.bWJ))
    {
      ((sq)localObject).rvj = this.bWJ;
      ((sq)localObject).rvW = parame1.epJ;
    }
    x.i("MicroMsg.NetSceneDownloadVoice", "doScene req.ClientMsgId:%s req.MsgId:%d req.NewMsgId:%d, req.Length:%d req.Offset:%d req.ChatRoomName:%s req.MasterBufId %d", new Object[] { ((sq)localObject).rdo, Integer.valueOf(((sq)localObject).rci), Long.valueOf(((sq)localObject).rcq), Integer.valueOf(((sq)localObject).rvV), Integer.valueOf(((sq)localObject).rjC), ((sq)localObject).rvj, Long.valueOf(((sq)localObject).rvW) });
    return a(parame, this.diG, this);
  }
  
  protected final int a(com.tencent.mm.network.q paramq)
  {
    paramq = (sq)((com.tencent.mm.ab.b)paramq).dID.dIL;
    if ((paramq.rcq == 0L) || (paramq.rdo == null) || (paramq.rdo.length() == 0) || (paramq.rvV <= 0) || (paramq.rjC < 0))
    {
      q.nP(this.fileName);
      return l.b.dJn;
    }
    return l.b.dJm;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneDownloadVoice", "onGYNetEnd file:" + this.fileName + " + id:" + paramInt1 + " errtype:" + paramInt2 + " errCode:" + paramInt3);
    paramArrayOfByte = (sr)((com.tencent.mm.ab.b)paramq).dIE.dIL;
    if (paramArrayOfByte.rvY == 1)
    {
      x.v("MicroMsg.NetSceneDownloadVoice", this.fileName + " cancelFlag = 1");
      q.oo(this.fileName);
      return;
    }
    if (paramInt3 == -22)
    {
      q.nP(this.fileName);
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    if ((paramInt2 == 4) && (paramInt3 != 0))
    {
      h.mEJ.a(111L, 231L, 1L, false);
      q.nP(this.fileName);
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      h.mEJ.a(111L, 230L, 1L, false);
      x.e("MicroMsg.NetSceneDownloadVoice", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3 + " resp:" + paramq.Id().qWB);
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    x.d("MicroMsg.NetSceneDownloadVoice", "onGYNetEnd file:" + this.fileName + " Recv:" + paramArrayOfByte.rtW.siI + " fileOff:" + paramArrayOfByte.rjC);
    if (paramArrayOfByte.rtW.siK == null)
    {
      x.e("MicroMsg.NetSceneDownloadVoice", "onGYNetEnd get recv Buffer null");
      q.nP(this.fileName);
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    paramq = paramArrayOfByte.rtW.siK.toByteArray();
    if (paramq.length == 0)
    {
      x.e("MicroMsg.NetSceneDownloadVoice", "onGYNetEnd Recv Buf ZERO length ");
      q.nP(this.fileName);
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    paramInt1 = q.aC(this.eoB, this.fileName).write(paramq, paramq.length, paramArrayOfByte.rjC);
    if (paramInt1 < 0)
    {
      x.e("MicroMsg.NetSceneDownloadVoice", "onGYNetEnd Write Failed File:" + this.fileName + " ret:" + paramInt1);
      q.nP(this.fileName);
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    q.c(this.fileName, paramq, paramq.length);
    x.i("MicroMsg.NetSceneDownloadVoice", "OnRecvEnd : file:" + this.fileName + " filesize:" + paramInt1 + " voiceFormat:" + this.eoB);
    paramInt1 = q.a(this.fileName, paramInt1, null);
    if (paramInt1 < 0)
    {
      h.mEJ.a(111L, 229L, 1L, false);
      x.e("MicroMsg.NetSceneDownloadVoice", "onGYNetEnd file:" + this.fileName + "updateAfterRecv Ret:" + paramInt1);
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    if (paramInt1 == 1)
    {
      doNotify();
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    long l = 1000L;
    if (this.eoE) {
      l = 0L;
    }
    this.dHa.J(l, l);
  }
  
  protected final void a(l.a parama)
  {
    h.mEJ.a(111L, 233L, 1L, false);
    q.nP(this.fileName);
  }
  
  public final int getType()
  {
    return 128;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/modelvoice/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */