package com.tencent.mm.plugin.subapp.c;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.l.a;
import com.tencent.mm.ab.l.b;
import com.tencent.mm.model.au;
import com.tencent.mm.network.k;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.bwv;
import com.tencent.mm.protocal.c.bww;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.bd;
import junit.framework.Assert;

public final class b
  extends l
  implements k
{
  al dHa = new al(new b.1(this), true);
  private com.tencent.mm.ab.b diG;
  com.tencent.mm.ab.e diJ;
  private int endFlag = 0;
  private boolean eoE = false;
  long eoJ;
  private int eon = 0;
  String fileName;
  int retCode = 0;
  
  public b(String paramString)
  {
    if (paramString != null) {}
    for (;;)
    {
      Assert.assertTrue(bool);
      x.d("MicroMsg.NetSceneUploadVoiceRemind", "NetSceneUploadVoice:  file:" + paramString);
      this.fileName = paramString;
      return;
      bool = false;
    }
  }
  
  protected final int Cc()
  {
    return 240;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    this.eoE = false;
    if (this.fileName == null)
    {
      x.e("MicroMsg.NetSceneUploadVoiceRemind", "doScene:  filename null!");
      this.retCode = (com.tencent.mm.compatible.util.g.getLine() + 10000);
      return -1;
    }
    g localg = h.Ok(this.fileName);
    if ((localg == null) || (!localg.TM()))
    {
      x.e("MicroMsg.NetSceneUploadVoiceRemind", "Get info Failed file:" + this.fileName);
      this.retCode = (com.tencent.mm.compatible.util.g.getLine() + 10000);
      return -1;
    }
    x.d("MicroMsg.NetSceneUploadVoiceRemind", "doScene file:" + this.fileName + " netTimes:" + localg.field_nettimes);
    parame1 = this.fileName;
    boolean bool;
    if (parame1 == null) {
      bool = false;
    }
    while (!bool)
    {
      x.e("MicroMsg.NetSceneUploadVoiceRemind", "checkVoiceNetTimes Failed file:" + this.fileName);
      h.nP(this.fileName);
      this.retCode = (com.tencent.mm.compatible.util.g.getLine() + 10000);
      return -1;
      parame1 = h.Ok(parame1);
      if (parame1 == null)
      {
        bool = false;
      }
      else if (parame1.field_nettimes >= 80)
      {
        bool = false;
      }
      else
      {
        parame1.field_nettimes += 1;
        parame1.bWA = 16384;
        bool = h.a(parame1);
      }
    }
    parame1 = new c.a();
    int i;
    int j;
    if (localg.field_status == 8)
    {
      x.v("MicroMsg.NetSceneUploadVoiceRemind", this.fileName + " cancelFlag = 1");
      this.endFlag = 1;
      h.op(localg.field_filename);
      i = 1;
      j = localg.field_voicelenght;
      if (j != 0) {
        break label1544;
      }
      j = (this.eon - 6) / 32 * 20;
    }
    label1544:
    for (;;)
    {
      x.d("MicroMsg.NetSceneUploadVoiceRemind", "info.getMsgSvrId() " + localg.field_msgid);
      Object localObject = new b.a();
      ((b.a)localObject).dIG = new bwv();
      ((b.a)localObject).dIH = new bww();
      ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/uploadvoicerecognize";
      ((b.a)localObject).dIF = 329;
      ((b.a)localObject).dII = 157;
      ((b.a)localObject).dIJ = 1000000157;
      this.diG = ((b.a)localObject).KT();
      localObject = (bwv)this.diG.dID.dIL;
      ((bwv)localObject).jTv = com.tencent.mm.model.q.GF();
      ((bwv)localObject).jTu = localg.field_user;
      ((bwv)localObject).rjC = localg.field_offset;
      ((bwv)localObject).rdo = localg.field_clientid;
      ((bwv)localObject).rvX = j;
      ((bwv)localObject).rgC = this.endFlag;
      ((bwv)localObject).rcq = localg.field_msgid;
      ((bwv)localObject).rvY = i;
      ((bwv)localObject).sth = ((int)(localg.field_createtime / 1000L));
      ((bwv)localObject).rVw = 1;
      if (i != 1) {
        ((bwv)localObject).rtW = new bhy().S(parame1.buf, parame1.bEG);
      }
      for (((bwv)localObject).rvV = parame1.bEG;; ((bwv)localObject).rvV = 1)
      {
        x.v("MicroMsg.NetSceneUploadVoiceRemind", "cancelFlag:" + i + " endFlag:" + this.endFlag + " svrId:" + localg.field_msgid);
        x.v("MicroMsg.NetSceneUploadVoiceRemind", "doscene msgId:" + ((bwv)localObject).rcq + " user:" + ((bwv)localObject).jTu + " offset:" + ((bwv)localObject).rjC + " dataLen:" + ((bwv)localObject).rtW.siI + " endFlag:" + ((bwv)localObject).rgC);
        x.d("MicroMsg.NetSceneUploadVoiceRemind", "doScene MsgId:" + localg.field_msgid + " file:" + this.fileName + " readBytes:" + parame1.bEG + " neTTTOff:" + localg.field_offset + " neWWWOff:" + this.eon + " endFlag:" + this.endFlag + " cancelFlag:" + i + " status:" + localg.field_status);
        x.d("MicroMsg.NetSceneUploadVoiceRemind", "tiger log " + localObject.toString());
        this.eoJ = System.currentTimeMillis();
        return a(parame, this.diG, this);
        if (localg.field_status == 3) {
          this.eoE = true;
        }
        parame1 = h.Ol(this.fileName);
        if (parame1 == null)
        {
          this.retCode = (com.tencent.mm.compatible.util.g.getLine() + 10000);
          return -1;
        }
        parame1 = parame1.xU(localg.field_offset);
        x.d("MicroMsg.NetSceneUploadVoiceRemind", "doScene READ file[" + this.fileName + "] read ret:" + parame1.ret + " readlen:" + parame1.bEG + " newOff:" + parame1.eon + " netOff:" + localg.field_offset + " line:" + com.tencent.mm.compatible.util.g.getLine());
        if (parame1.ret < 0)
        {
          x.e("MicroMsg.NetSceneUploadVoiceRemind", "Err doScene READ file[" + this.fileName + "] read ret:" + parame1.ret + " readlen:" + parame1.bEG + " newOff:" + parame1.eon + " netOff:" + localg.field_offset);
          h.nP(this.fileName);
          this.retCode = (com.tencent.mm.compatible.util.g.getLine() + 10000);
          return -1;
        }
        this.eon = parame1.eon;
        if ((this.eon < localg.field_offset) || (this.eon >= 469000))
        {
          x.e("MicroMsg.NetSceneUploadVoiceRemind", "Err doScene READ file[" + this.fileName + "] newOff:" + this.eon + " OldtOff:" + localg.field_offset);
          h.nP(this.fileName);
          this.retCode = (com.tencent.mm.compatible.util.g.getLine() + 10000);
          return -1;
        }
        this.endFlag = 0;
        if ((parame1.bEG == 0) && (!this.eoE))
        {
          x.e("MicroMsg.NetSceneUploadVoiceRemind", "doScene:  file:" + this.fileName + " No Data temperature , will be retry");
          h.nP(this.fileName);
          this.retCode = (com.tencent.mm.compatible.util.g.getLine() + 10000);
          return -1;
        }
        if (this.eoE)
        {
          if (localg.field_totallen <= 0)
          {
            x.e("MicroMsg.NetSceneUploadVoiceRemind", "Err doScene READ file[" + this.fileName + "] read totalLen:" + localg.field_totallen);
            h.nP(this.fileName);
            this.retCode = (com.tencent.mm.compatible.util.g.getLine() + 10000);
            return -1;
          }
          if ((localg.field_totallen > this.eon) && (parame1.bEG < 6000))
          {
            x.e("MicroMsg.NetSceneUploadVoiceRemind", "Err doScene READ file[" + this.fileName + "] readlen:" + parame1.bEG + " newOff:" + parame1.eon + " netOff:" + localg.field_offset + " totalLen:" + localg.field_totallen);
            h.nP(this.fileName);
            this.retCode = (com.tencent.mm.compatible.util.g.getLine() + 10000);
            return -1;
          }
          if (localg.field_totallen <= this.eon) {
            this.endFlag = 1;
          }
        }
        i = 0;
        break;
        ((bwv)localObject).rtW = new bhy().b(com.tencent.mm.bk.b.bi(new byte[1]));
      }
    }
  }
  
  protected final int a(com.tencent.mm.network.q paramq)
  {
    paramq = (bwv)((com.tencent.mm.ab.b)paramq).dID.dIL;
    x.v("MicroMsg.NetSceneUploadVoiceRemind", "check : offset:" + paramq.rjC + " dataLen:" + paramq.rtW.siI + " endFlag:" + paramq.rgC);
    return l.b.dJm;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSceneUploadVoiceRemind", "onGYNetEnd file:" + this.fileName + " errtype:" + paramInt2 + " errCode:" + paramInt3);
    paramArrayOfByte = (bwv)((com.tencent.mm.ab.b)paramq).dID.dIL;
    paramq = (bww)((com.tencent.mm.ab.b)paramq).dIE.dIL;
    x.d("MicroMsg.NetSceneUploadVoiceRemind", "tiger log resp " + paramq.toString());
    if ((paramInt2 == 4) && (paramInt3 == -22))
    {
      paramq = h.Ok(this.fileName);
      if (paramq != null)
      {
        if (paramq.field_status == 3)
        {
          au.HU();
          paramArrayOfByte = com.tencent.mm.model.c.FT().dW(paramq.field_msglocalid);
          paramArrayOfByte.setContent(f.b(paramq.field_human, paramq.field_voicelenght, false));
          paramArrayOfByte.setStatus(2);
          au.HU();
          com.tencent.mm.model.c.FT().a(paramq.field_msglocalid, paramArrayOfByte);
        }
        paramq.field_status = 97;
        paramq.field_lastmodifytime = (System.currentTimeMillis() / 1000L);
        paramq.bWA = 320;
        h.a(paramq);
      }
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    if ((paramInt2 == 4) && (paramInt3 != 0))
    {
      h.nP(this.fileName);
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      x.e("MicroMsg.NetSceneUploadVoiceRemind", "onGYNetEnd file:" + this.fileName + " errType:" + paramInt2 + " errCode:" + paramInt3);
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    x.d("MicroMsg.NetSceneUploadVoiceRemind", "onGYNetEnd msgId:" + paramq.rcq + " toUser:" + paramArrayOfByte.jTu);
    paramArrayOfByte = this.fileName;
    int j = this.eon;
    long l = paramq.rcq;
    Object localObject = paramq.rdo;
    int k = this.endFlag;
    if (paramArrayOfByte == null) {
      paramInt1 = -1;
    }
    for (;;)
    {
      x.d("MicroMsg.NetSceneUploadVoiceRemind", "onGYNetEnd updateAfterSend:" + paramInt1 + " file:" + this.fileName + " MsgSvrId:" + paramq.rcq + " clientId:" + paramq.rdo + " neWWOff:" + this.eon + " neTTTT:" + paramq.rvV);
      if (paramInt1 >= 0) {
        break;
      }
      h.nP(this.fileName);
      x.e("MicroMsg.NetSceneUploadVoiceRemind", "onGYNetEnd file:" + this.fileName + "UpdateAfterSend Ret:" + paramInt1);
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
      x.d("MicroMsg.VoiceRemindLogic", "UpdateAfterSend file:[" + paramArrayOfByte + "] newOff:" + j + " SvrID:" + l + " clientID:" + (String)localObject + " hasSendEndFlag " + k);
      g localg = h.Ok(paramArrayOfByte);
      if (localg == null)
      {
        paramInt1 = -1;
      }
      else
      {
        localg.field_offset = j;
        localg.field_lastmodifytime = (System.currentTimeMillis() / 1000L);
        localg.bWA = 264;
        if ((bi.oW(localg.field_clientid)) && (localObject != null))
        {
          localg.field_clientid = ((String)localObject);
          localg.bWA |= 0x200;
        }
        if ((localg.field_msgid == 0L) && (l != 0L))
        {
          localg.field_msgid = l;
          localg.bWA |= 0x4;
        }
        int i = 0;
        x.d("MicroMsg.VoiceRemindLogic", "info.getTotalLen() " + localg.field_totallen + "  newOffset " + j + "  " + localg.field_status);
        paramInt1 = i;
        if (localg.field_totallen <= j)
        {
          paramInt1 = i;
          if (localg.field_status == 3)
          {
            paramInt1 = i;
            if (k == 1)
            {
              localg.field_status = 99;
              localg.bWA |= 0x40;
              au.HU();
              localObject = com.tencent.mm.model.c.FT().dW(localg.field_msglocalid);
              ((bd)localObject).ep(localg.field_user);
              ((bd)localObject).ax(localg.field_msgid);
              ((bd)localObject).setStatus(2);
              ((bd)localObject).setContent(f.b(localg.field_human, localg.field_voicelenght, false));
              au.HU();
              com.tencent.mm.model.c.FT().a(localg.field_msglocalid, (bd)localObject);
              x.d("MicroMsg.VoiceRemindLogic", "END!!! updateSend  file:" + paramArrayOfByte + " total:" + localg.field_totallen + " status:" + localg.field_status + " netTimes:" + localg.field_nettimes);
              paramInt1 = 1;
              h.ol(paramArrayOfByte);
            }
          }
        }
        if (!h.a(localg)) {
          paramInt1 = -4;
        }
      }
    }
    if (paramInt1 == 1)
    {
      x.d("MicroMsg.NetSceneUploadVoiceRemind", "onGYNetEnd finish file:" + this.fileName);
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    if (this.eoE) {}
    for (l = 0L;; l = 500L)
    {
      x.d("MicroMsg.NetSceneUploadVoiceRemind", "onGYNetEnd file:" + this.fileName + " delay:" + l);
      this.dHa.J(l, l);
      return;
    }
  }
  
  protected final void a(l.a parama)
  {
    h.nP(this.fileName);
  }
  
  public final int getType()
  {
    return 329;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/subapp/c/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */