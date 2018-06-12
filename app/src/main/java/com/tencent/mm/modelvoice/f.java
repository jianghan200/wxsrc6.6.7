package com.tencent.mm.modelvoice;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.l.a;
import com.tencent.mm.ab.l.b;
import com.tencent.mm.j.a;
import com.tencent.mm.j.a.a;
import com.tencent.mm.model.bf;
import com.tencent.mm.network.k;
import com.tencent.mm.platformtools.af;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.bwv;
import com.tencent.mm.protocal.c.bww;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import java.util.HashMap;
import junit.framework.Assert;

public final class f
  extends l
  implements k
{
  al dHa = new al(new f.1(this), true);
  private com.tencent.mm.ab.b diG;
  com.tencent.mm.ab.e diJ;
  private int endFlag = 0;
  private boolean eoE = false;
  private int eoI;
  long eoJ;
  private int eon = 0;
  public String fileName;
  public int retCode = 0;
  
  public f(String paramString)
  {
    this(paramString, 0);
  }
  
  public f(String paramString, int paramInt)
  {
    if (paramString != null) {}
    for (;;)
    {
      Assert.assertTrue(bool);
      x.d("MicroMsg.NetSceneUploadVoice", "NetSceneUploadVoice:  file:" + paramString);
      this.fileName = paramString;
      this.eoI = paramInt;
      return;
      bool = false;
    }
  }
  
  protected final int Cc()
  {
    return 60;
  }
  
  public final boolean KY()
  {
    boolean bool = super.KY();
    if (bool) {
      h.mEJ.a(111L, 239L, 1L, false);
    }
    return bool;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    this.eoE = false;
    if (this.fileName == null)
    {
      x.e("MicroMsg.NetSceneUploadVoice", "doScene:  filename null!");
      this.retCode = (com.tencent.mm.compatible.util.g.getLine() + 10000);
      return -1;
    }
    p localp = q.ot(this.fileName);
    if ((localp == null) || (!localp.TM()))
    {
      x.e("MicroMsg.NetSceneUploadVoice", "Get info Failed file:" + this.fileName);
      this.retCode = (com.tencent.mm.compatible.util.g.getLine() + 10000);
      return -1;
    }
    x.d("MicroMsg.NetSceneUploadVoice", "doScene file:" + this.fileName + " netTimes:" + localp.enO);
    if (!q.oj(this.fileName))
    {
      x.e("MicroMsg.NetSceneUploadVoice", "checkVoiceNetTimes Failed file:" + this.fileName);
      q.nP(this.fileName);
      this.retCode = (com.tencent.mm.compatible.util.g.getLine() + 10000);
      return -1;
    }
    parame1 = new g();
    int k;
    int j;
    int i;
    Object localObject1;
    if (localp.status == 8)
    {
      x.v("MicroMsg.NetSceneUploadVoice", this.fileName + " cancelFlag = 1");
      k = 1;
      this.endFlag = 0;
      q.op(localp.fileName);
      j = 0;
      int m = localp.epI;
      x.i("MicroMsg.NetSceneUploadVoice", "info.getVoiceLength: %s", new Object[] { Integer.valueOf(m) });
      i = m;
      if (m == 0)
      {
        m = q.ou(this.fileName);
        x.i("MicroMsg.NetSceneUploadVoice", "getCurrentRecordFileLen: %s", new Object[] { Integer.valueOf(m) });
        i = m;
        if (m < 0)
        {
          i = q.iF(this.eon);
          x.i("MicroMsg.NetSceneUploadVoice", "fuck getMinTimeByOffset: %s", new Object[] { Integer.valueOf(i) });
        }
      }
      localObject1 = new b.a();
      ((b.a)localObject1).dIG = new bwv();
      ((b.a)localObject1).dIH = new bww();
      ((b.a)localObject1).uri = "/cgi-bin/micromsg-bin/uploadvoice";
      ((b.a)localObject1).dIF = 127;
      ((b.a)localObject1).dII = 19;
      ((b.a)localObject1).dIJ = 1000000019;
      this.diG = ((b.a)localObject1).KT();
      localObject1 = (bwv)this.diG.dID.dIL;
      ((bwv)localObject1).jTv = com.tencent.mm.model.q.GF();
      ((bwv)localObject1).jTu = localp.bWJ;
      ((bwv)localObject1).rjC = localp.emu;
      ((bwv)localObject1).rdo = localp.clientId;
      ((bwv)localObject1).rvX = i;
      ((bwv)localObject1).rgC = this.endFlag;
      ((bwv)localObject1).rcq = localp.bYu;
      ((bwv)localObject1).rvY = k;
      ((bwv)localObject1).sti = this.eoI;
      ((bwv)localObject1).rco = bf.Is();
      ((bwv)localObject1).rco = a.a.yw().z(localp.bWJ, localp.enN);
      ((bwv)localObject1).rVw = j;
      if (k == 1) {
        break label1966;
      }
      ((bwv)localObject1).rtW = new bhy().S(parame1.buf, parame1.bEG);
    }
    for (((bwv)localObject1).rvV = parame1.bEG;; ((bwv)localObject1).rvV = 1)
    {
      x.d("MicroMsg.NetSceneUploadVoice", "cancelFlag:" + k + " endFlag:" + this.endFlag + " svrId:" + localp.bYu);
      x.v("MicroMsg.NetSceneUploadVoice", "doscene msgId:" + ((bwv)localObject1).rcq + " user:" + ((bwv)localObject1).jTu + " offset:" + ((bwv)localObject1).rjC + " dataLen:" + ((bwv)localObject1).rtW.siI + " endFlag:" + ((bwv)localObject1).rgC);
      x.i("MicroMsg.NetSceneUploadVoice", "doScene MsgId:" + localp.bYu + " voiceFormat:" + j + " file:" + this.fileName + " readBytes:" + parame1.bEG + " neTTTOff:" + localp.emu + " neWWWOff:" + this.eon + " endFlag:" + this.endFlag + " cancelFlag:" + k + " status:" + localp.status + " voiceLen:" + i);
      this.eoJ = System.currentTimeMillis();
      return a(parame, this.diG, this);
      if (localp.status == 3) {
        this.eoE = true;
      }
      Object localObject2 = q.ok(this.fileName);
      if (localObject2 == null)
      {
        this.retCode = (com.tencent.mm.compatible.util.g.getLine() + 10000);
        x.e("MicroMsg.NetSceneUploadVoice", "doScene: fileOp is null, fileName:%s", new Object[] { this.fileName });
        return -1;
      }
      j = ((b)localObject2).getFormat();
      x.d("MicroMsg.NetSceneUploadVoice", "format " + j);
      parame1 = ((b)localObject2).br(localp.emu, 6000);
      x.d("MicroMsg.NetSceneUploadVoice", "doScene READ file[" + this.fileName + "] read ret:" + parame1.ret + " readlen:" + parame1.bEG + " newOff:" + parame1.eon + " netOff:" + localp.emu + " line:" + com.tencent.mm.compatible.util.g.getLine());
      if (parame1.ret < 0)
      {
        h.mEJ.a(111L, 241L, 1L, false);
        x.e("MicroMsg.NetSceneUploadVoice", "Err doScene READ file[" + this.fileName + "] read ret:" + parame1.ret + " readlen:" + parame1.bEG + " newOff:" + parame1.eon + " netOff:" + localp.emu);
        q.nP(this.fileName);
        this.retCode = (com.tencent.mm.compatible.util.g.getLine() + 10000);
        return -1;
      }
      this.eon = parame1.eon;
      if ((this.eon < localp.emu) || (this.eon >= 469000))
      {
        h.mEJ.a(111L, 240L, 1L, false);
        x.e("MicroMsg.NetSceneUploadVoice", "Err doScene READ file[" + this.fileName + "] newOff:" + this.eon + " OldtOff:" + localp.emu);
        q.nP(this.fileName);
        this.retCode = (com.tencent.mm.compatible.util.g.getLine() + 10000);
        return -1;
      }
      this.endFlag = 0;
      if ((parame1.bEG == 0) && (!this.eoE))
      {
        x.e("MicroMsg.NetSceneUploadVoice", "doScene:  file:" + this.fileName + " No Data temperature , will be retry");
        this.retCode = (com.tencent.mm.compatible.util.g.getLine() + 10000);
        return -1;
      }
      if (this.eoE)
      {
        if (localp.dHI <= 0)
        {
          x.e("MicroMsg.NetSceneUploadVoice", "Err doScene READ file[" + this.fileName + "] read totalLen:" + localp.dHI);
          q.nP(this.fileName);
          this.retCode = (com.tencent.mm.compatible.util.g.getLine() + 10000);
          return -1;
        }
        if ((localp.dHI > this.eon) && (parame1.bEG < 6000))
        {
          x.e("MicroMsg.NetSceneUploadVoice", "Err doScene READ file[" + this.fileName + "] readlen:" + parame1.bEG + " newOff:" + parame1.eon + " netOff:" + localp.emu + " totalLen:" + localp.dHI);
          q.nP(this.fileName);
          this.retCode = (com.tencent.mm.compatible.util.g.getLine() + 10000);
          return -1;
        }
        if (localp.dHI <= this.eon)
        {
          localObject1 = (Integer)q.epM.get(q.getFullPath(this.fileName));
          if ((localObject1 != null) && (((Integer)localObject1).intValue() != 0))
          {
            i = ((Integer)q.epN.get(q.getFullPath(this.fileName))).intValue();
            localObject2 = ((b)localObject2).br(0, i);
            k = q.b(((Integer)localObject1).intValue() & 0xFF, ((g)localObject2).buf, ((g)localObject2).bEG);
            if (((Integer)localObject1).intValue() != k)
            {
              x.e("MicroMsg.NetSceneUploadVoice", "Checksum error file. realChecksum:%d, tempChecksum:%d, total:%d, rr.length:%d", new Object[] { Integer.valueOf(k), localObject1, Integer.valueOf(i), Integer.valueOf(((g)localObject2).bEG) });
              x.e("MicroMsg.NetSceneUploadVoice", "Checksum error file[" + this.fileName + "] readlen:" + parame1.bEG + " newOff:" + parame1.eon + " netOff:" + localp.emu + " totalLen:" + localp.dHI);
              h.mEJ.a(111L, 173L, 1L, false);
              q.epM.put(q.getFullPath(this.fileName), Integer.valueOf(k));
              localObject1 = (Integer)q.epO.get(q.getFullPath(this.fileName));
              if ((localObject1 != null) && (((Integer)localObject1).intValue() != 0))
              {
                i = q.a(0, ((g)localObject2).buf, ((g)localObject2).bEG);
                if (((Integer)localObject1).intValue() != i)
                {
                  x.e("MicroMsg.NetSceneUploadVoice", "Checksum error file. cacheSimpleChecksum:%d, realSimpleChecksum:%d", new Object[] { localObject1, Integer.valueOf(i) });
                  q.nP(this.fileName);
                  this.retCode = (com.tencent.mm.compatible.util.g.getLine() + 10000);
                  h.mEJ.a(111L, 174L, 1L, false);
                  return -1;
                }
              }
            }
          }
          this.endFlag = 1;
        }
      }
      k = 0;
      break;
      label1966:
      ((bwv)localObject1).rtW = new bhy().b(com.tencent.mm.bk.b.bi(new byte[1]));
    }
  }
  
  protected final int a(com.tencent.mm.network.q paramq)
  {
    paramq = (bwv)((com.tencent.mm.ab.b)paramq).dID.dIL;
    x.v("MicroMsg.NetSceneUploadVoice", "check msgId:" + paramq.rcq + " offset:" + paramq.rjC + " dataLen:" + paramq.rtW.siI + " endFlag:" + paramq.rgC);
    if (((paramq.rcq == 0L) && (paramq.rjC != 0)) || (((paramq.rtW == null) || (paramq.rtW.siI == 0)) && (paramq.rgC != 1) && (paramq.rvY != 1))) {
      return l.b.dJn;
    }
    return l.b.dJm;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSceneUploadVoice", "onGYNetEnd file:" + this.fileName + " errtype:" + paramInt2 + " errCode:" + paramInt3);
    paramArrayOfByte = (bwv)((com.tencent.mm.ab.b)paramq).dID.dIL;
    paramq = (bww)((com.tencent.mm.ab.b)paramq).dIE.dIL;
    if ((paramInt2 == 4) && (paramInt3 == -22))
    {
      q.nQ(this.fileName);
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    if ((paramInt2 == 4) && (paramInt3 != 0))
    {
      q.nP(this.fileName);
      h.mEJ.a(111L, 237L, 1L, false);
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      h.mEJ.a(111L, 236L, 1L, false);
      x.e("MicroMsg.NetSceneUploadVoice", "onGYNetEnd file:" + this.fileName + " errType:" + paramInt2 + " errCode:" + paramInt3);
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    x.d("MicroMsg.NetSceneUploadVoice", "onGYNetEnd msgId:" + paramq.rcq + " toUser:" + paramArrayOfByte.jTu);
    if ((paramq.rcq <= 0L) && (!ab.gY(paramArrayOfByte.jTu)))
    {
      h.mEJ.a(111L, 235L, 1L, false);
      x.e("MicroMsg.NetSceneUploadVoice", "onGYNetEnd file:" + this.fileName + " getMsgId:" + paramq.rcq + " netoff:" + paramq.rjC);
      q.nP(this.fileName);
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    x.d("MicroMsg.NetSceneUploadVoice", "dkmsgid  set svrmsgid %d -> %d", new Object[] { Long.valueOf(paramq.rcq), Integer.valueOf(af.exn) });
    if ((10007 == af.exm) && (af.exn != 0))
    {
      paramq.rcq = af.exn;
      af.exn = 0;
    }
    paramInt1 = q.a(this.fileName, this.eon, paramq.rcq, paramq.rdo, this.endFlag, this.eoI);
    x.d("MicroMsg.NetSceneUploadVoice", "dkmsgid onGYNetEnd updateAfterSend:" + paramInt1 + " file:" + this.fileName + " MsgSvrId:" + paramq.rcq + " clientId:" + paramq.rdo + " neWWOff:" + this.eon + " neTTTT:" + paramq.rvV + " forwardflag:" + this.eoI);
    if (paramInt1 < 0)
    {
      q.nP(this.fileName);
      x.e("MicroMsg.NetSceneUploadVoice", "onGYNetEnd file:" + this.fileName + "UpdateAfterSend Ret:" + paramInt1);
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    if (paramInt1 == 1)
    {
      x.d("MicroMsg.NetSceneUploadVoice", "onGYNetEnd finish file:" + this.fileName);
      paramq = q.ot(this.fileName);
      paramq = ((i)com.tencent.mm.kernel.g.l(i.class)).bcY().dW(paramq.enN);
      com.tencent.mm.modelstat.b.ehL.f(paramq);
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    if (this.eoE) {}
    for (long l = 0L;; l = 500L)
    {
      x.d("MicroMsg.NetSceneUploadVoice", "onGYNetEnd file:" + this.fileName + " delay:" + l);
      this.dHa.J(l, l);
      return;
    }
  }
  
  protected final void a(l.a parama)
  {
    h.mEJ.a(111L, 238L, 1L, false);
    q.nP(this.fileName);
  }
  
  public final int getType()
  {
    return 127;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/modelvoice/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */