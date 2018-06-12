package com.tencent.mm.plugin.masssend.a;

import android.content.ContentValues;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.l.a;
import com.tencent.mm.ab.l.b;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.model.au;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.modelvideo.s.b;
import com.tencent.mm.network.k;
import com.tencent.mm.protocal.c.asz;
import com.tencent.mm.protocal.c.ata;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ai;
import com.tencent.mm.storage.az;
import junit.framework.Assert;

public final class f
  extends l
  implements k
{
  boolean dJO = false;
  private int dTO;
  g.a dYW = null;
  public com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  int enO = 0;
  private a lar = null;
  int retCode = 0;
  
  public f(a parama, boolean paramBoolean)
  {
    this(parama, paramBoolean, 0);
  }
  
  public f(a parama, boolean paramBoolean, int paramInt)
  {
    this.lar = parama;
    this.dTO = paramInt;
    parama.createTime = bi.VF();
    if (parama.msgType == 43)
    {
      parama.status = 104;
      com.tencent.mm.modelvideo.o.Ta();
      parama.lan = s.nM(s.nL(parama.bch()));
      com.tencent.mm.modelvideo.o.Ta();
      parama.bxj = s.nM(s.nK(parama.bch()));
      this.enO = 2500;
      if (parama.videoSource == 2) {
        this.enO = 2500;
      }
    }
    Object localObject;
    for (;;)
    {
      localObject = new b.a();
      ((b.a)localObject).dIG = new asz();
      ((b.a)localObject).dIH = new ata();
      ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/masssend";
      ((b.a)localObject).dIF = 193;
      ((b.a)localObject).dII = 84;
      ((b.a)localObject).dIJ = 1000000084;
      this.diG = ((b.a)localObject).KT();
      localObject = (asz)this.diG.dID.dIL;
      ((asz)localObject).rVj = com.tencent.mm.a.g.u(parama.bcj().getBytes());
      ((asz)localObject).rVu = parama.lak;
      ((asz)localObject).rVi = parama.bcj();
      parama.ehf = bi.VF();
      ((asz)localObject).rVk = parama.bcg();
      ((asz)localObject).jQd = parama.msgType;
      ((asz)localObject).rVl = parama.lal;
      if (!paramBoolean) {
        break label537;
      }
      i = j;
      label296:
      ((asz)localObject).rVv = i;
      ((asz)localObject).rJr = paramInt;
      this.dYW = new g.a();
      return;
      if (parama.msgType != 34) {
        break;
      }
      this.enO = 40;
      parama.status = 104;
      parama.bxj = com.tencent.mm.modelvoice.o.nM(parama.bch());
      parama.lan = 0;
    }
    if (parama.msgType == 3)
    {
      this.enO = 40;
      if (paramInt != 1) {
        break label543;
      }
      this.enO = 1250;
    }
    label537:
    label543:
    for (int i = 1;; i = 0)
    {
      parama.lao = i;
      parama.status = 104;
      parama.lan = 0;
      localObject = new StringBuilder();
      au.HU();
      parama.bxj = com.tencent.mm.a.e.cm(com.tencent.mm.model.c.Gb() + parama.bch());
      break;
      if (parama.msgType == 1)
      {
        this.enO = 1;
        parama.status = 104;
        parama.bxj = parama.bch().getBytes().length;
        parama.lan = 0;
        break;
      }
      x.d("MicroMsg.NetSceneMasSend", "error msgtype:" + parama.msgType);
      Assert.assertTrue("error msgtype:" + parama.msgType, false);
      break;
      i = 0;
      break label296;
    }
  }
  
  protected final int Cc()
  {
    return 2500;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    int i = 2;
    int j = 0;
    int k = 0;
    this.diJ = parame1;
    if (this.dJO)
    {
      x.d("MicroMsg.NetSceneMasSend", "isCancel");
      this.retCode = (0 - (com.tencent.mm.compatible.util.g.getLine() + 10000));
      j = -1;
    }
    Object localObject1;
    do
    {
      return j;
      this.enO -= 1;
      if (this.enO < 0)
      {
        x.d("MicroMsg.NetSceneMasSend", "MAX_SEND_TIMES");
        this.retCode = (0 - (com.tencent.mm.compatible.util.g.getLine() + 10000));
        return -1;
      }
      if (this.lar == null)
      {
        x.d("MicroMsg.NetSceneMasSend", "MasSendInfo is null");
        this.retCode = (0 - (com.tencent.mm.compatible.util.g.getLine() + 10000));
        return -1;
      }
      if (bi.oW(this.lar.bcj()))
      {
        x.d("MicroMsg.NetSceneMasSend", "MasSendInfo.toList is null");
        this.retCode = (0 - (com.tencent.mm.compatible.util.g.getLine() + 10000));
        return -1;
      }
      if (this.lar.lak == 0)
      {
        x.d("MicroMsg.NetSceneMasSend", "getTolistCount is 0");
        this.retCode = (0 - (com.tencent.mm.compatible.util.g.getLine() + 10000));
        return -1;
      }
      if (this.lar.bxj <= 0)
      {
        x.d("MicroMsg.NetSceneMasSend", "getDataLen is 0");
        this.retCode = (0 - (com.tencent.mm.compatible.util.g.getLine() + 10000));
        return -1;
      }
      if ((this.lar.status == 103) && (this.lar.lan <= 0))
      {
        x.d("MicroMsg.NetSceneMasSend", "getThumbTotalLen is 0");
        this.retCode = (0 - (com.tencent.mm.compatible.util.g.getLine() + 10000));
        return -1;
      }
      if ((this.lar.status != 103) && (this.lar.status != 104))
      {
        x.d("MicroMsg.NetSceneMasSend", "msg type :" + this.lar.msgType);
        this.retCode = (0 - (com.tencent.mm.compatible.util.g.getLine() + 10000));
        return -1;
      }
      parame1 = (asz)this.diG.dID.dIL;
      if (this.lar.msgType != 43) {
        break label1228;
      }
      localObject1 = this.lar.bch();
      if (!bi.oW((String)localObject1)) {
        break;
      }
      x.d("MicroMsg.NetSceneMasSend", "MasSendInfo.fileName is null");
      this.retCode = (0 - (com.tencent.mm.compatible.util.g.getLine() + 10000));
      i = -1;
      j = i;
    } while (i != 0);
    for (;;)
    {
      return a(parame, this.diG, this);
      parame1.rVm = new bhy();
      parame1.rVn = 0;
      parame1.rVr = new bhy();
      parame1.rVq = 0;
      parame1.rVs = 2;
      parame1.rVl = this.lar.lal;
      if (this.lar.videoSource > 0) {}
      for (;;)
      {
        parame1.rVt = i;
        parame1.rVp = this.lar.lan;
        parame1.rVo = this.lar.bxj;
        if (this.lar.status != 103) {
          break label836;
        }
        com.tencent.mm.modelvideo.o.Ta();
        localObject2 = s.k(s.nL((String)localObject1), this.lar.enI, 8000);
        if ((((s.b)localObject2).ret >= 0) && (((s.b)localObject2).bEG != 0)) {
          break label604;
        }
        x.e("MicroMsg.NetSceneMasSend", "doScene READ THUMB[" + (String)localObject1 + "]  Error ");
        this.retCode = (0 - (com.tencent.mm.compatible.util.g.getLine() + 10000));
        i = -1;
        break;
        i = 0;
      }
      label604:
      x.d("MicroMsg.NetSceneMasSend", "doScene READ THUMB[" + (String)localObject1 + "] read ret:" + ((s.b)localObject2).ret + " readlen:" + ((s.b)localObject2).bEG + " newOff:" + ((s.b)localObject2).eon + " netOff:" + this.lar.enI);
      if (((s.b)localObject2).eon < this.lar.enI)
      {
        x.e("MicroMsg.NetSceneMasSend", "Err doScene READ THUMB[" + (String)localObject1 + "] newOff:" + ((s.b)localObject2).eon + " OldtOff:" + this.lar.enI);
        this.retCode = (0 - (com.tencent.mm.compatible.util.g.getLine() + 10000));
        i = -1;
        break;
      }
      localObject1 = new byte[((s.b)localObject2).bEG];
      System.arraycopy(((s.b)localObject2).buf, 0, localObject1, 0, ((s.b)localObject2).bEG);
      parame1.rVq = this.lar.enI;
      Object localObject2 = new bhy();
      ((bhy)localObject2).bq((byte[])localObject1);
      parame1.rVr = ((bhy)localObject2);
      for (;;)
      {
        i = 0;
        break;
        label836:
        com.tencent.mm.modelvideo.o.Ta();
        localObject2 = s.k(s.nK((String)localObject1), this.lar.lam, 8000);
        if ((((s.b)localObject2).ret < 0) || (((s.b)localObject2).bEG == 0))
        {
          x.e("MicroMsg.NetSceneMasSend", "doScene READ VIDEO[" + (String)localObject1 + "]  Error ");
          this.retCode = (0 - (com.tencent.mm.compatible.util.g.getLine() + 10000));
          i = -1;
          break;
        }
        x.d("MicroMsg.NetSceneMasSend", "doScene READ VIDEO[" + (String)localObject1 + "] read ret:" + ((s.b)localObject2).ret + " readlen:" + ((s.b)localObject2).bEG + " newOff:" + ((s.b)localObject2).eon + " netOff:" + this.lar.lam);
        if (((s.b)localObject2).eon < this.lar.lam)
        {
          x.e("MicroMsg.NetSceneMasSend", "Err doScene READ VIDEO[" + (String)localObject1 + "] newOff:" + ((s.b)localObject2).eon + " OldtOff:" + this.lar.lam);
          this.retCode = (0 - (com.tencent.mm.compatible.util.g.getLine() + 10000));
          i = -1;
          break;
        }
        if (((s.b)localObject2).eon >= com.tencent.mm.modelvideo.c.els)
        {
          x.e("MicroMsg.NetSceneMasSend", "Err doScene READ VIDEO[" + (String)localObject1 + "] maxsize:" + com.tencent.mm.modelvideo.c.els);
          this.retCode = (0 - (com.tencent.mm.compatible.util.g.getLine() + 10000));
          i = -1;
          break;
        }
        localObject1 = new byte[((s.b)localObject2).bEG];
        System.arraycopy(((s.b)localObject2).buf, 0, localObject1, 0, ((s.b)localObject2).bEG);
        parame1.rVn = this.lar.lam;
        parame1.rVq = this.lar.enI;
        localObject2 = new bhy();
        ((bhy)localObject2).bq((byte[])localObject1);
        parame1.rVm = ((bhy)localObject2);
      }
      label1228:
      if (this.lar.msgType == 34)
      {
        parame1.rVs = 0;
        parame1.rVt = 0;
        parame1.rVm = new bhy().bq(new byte[0]);
        parame1.rVn = 0;
        parame1.rVr = new bhy().bq(new byte[0]);
        parame1.rVq = 0;
        parame1.rVp = 0;
        parame1.rVo = this.lar.bxj;
        localObject1 = com.tencent.mm.modelvoice.q.ok(this.lar.bch());
        if (localObject1 == null)
        {
          this.retCode = (0 - (com.tencent.mm.compatible.util.g.getLine() + 10000));
          x.d("MicroMsg.NetSceneMasSend", "fileop is null");
          i = -1;
        }
        while (i != 0)
        {
          return -1;
          localObject2 = ((com.tencent.mm.modelvoice.b)localObject1).br(this.lar.lam, 8000);
          if (((com.tencent.mm.modelvoice.g)localObject2).ret < 0)
          {
            x.e("MicroMsg.NetSceneMasSend", "Err doScene READ file[" + this.lar.bch() + "] read ret:" + ((com.tencent.mm.modelvoice.g)localObject2).ret + " readlen:" + ((com.tencent.mm.modelvoice.g)localObject2).bEG + " newOff:" + ((com.tencent.mm.modelvoice.g)localObject2).eon + " netOff:" + this.lar.lam);
            this.retCode = (0 - (com.tencent.mm.compatible.util.g.getLine() + 10000));
            i = -1;
          }
          else if ((((com.tencent.mm.modelvoice.g)localObject2).eon < this.lar.lam) || (((com.tencent.mm.modelvoice.g)localObject2).eon >= 469000))
          {
            x.e("MicroMsg.NetSceneMasSend", "Err doScene READ offseterror file[" + this.lar.bch() + "] read ret:" + ((com.tencent.mm.modelvoice.g)localObject2).ret + " readlen:" + ((com.tencent.mm.modelvoice.g)localObject2).bEG + " newOff:" + ((com.tencent.mm.modelvoice.g)localObject2).eon + " netOff:" + this.lar.lam);
            this.retCode = (0 - (com.tencent.mm.compatible.util.g.getLine() + 10000));
            i = -1;
          }
          else if (this.lar.bxj <= 0)
          {
            x.e("MicroMsg.NetSceneMasSend", "Err doScene READ datalen file[" + this.lar.bch() + "] read totalLen:" + this.lar.bxj);
            this.retCode = (com.tencent.mm.compatible.util.g.getLine() + 10000);
            i = -1;
          }
          else
          {
            byte[] arrayOfByte = new byte[((com.tencent.mm.modelvoice.g)localObject2).bEG];
            System.arraycopy(((com.tencent.mm.modelvoice.g)localObject2).buf, 0, arrayOfByte, 0, ((com.tencent.mm.modelvoice.g)localObject2).bEG);
            parame1.rVm = new bhy().bq(arrayOfByte);
            parame1.rVl = this.lar.lal;
            parame1.rVn = this.lar.lam;
            parame1.rVw = ((com.tencent.mm.modelvoice.b)localObject1).getFormat();
            i = k;
          }
        }
      }
      else if (this.lar.msgType == 3)
      {
        if (bi.oW(this.lar.bch()))
        {
          x.d("MicroMsg.NetSceneMasSend", "getFilename is null");
          this.retCode = (0 - (com.tencent.mm.compatible.util.g.getLine() + 10000));
          i = -1;
        }
        while (i != 0)
        {
          return -1;
          parame1.rVs = 0;
          parame1.rVt = 0;
          parame1.rVm = new bhy().bq(new byte[0]);
          parame1.rVn = 0;
          parame1.rVr = new bhy().bq(new byte[0]);
          parame1.rVq = 0;
          parame1.rVp = 0;
          parame1.rVl = 0;
          parame1.rVp = this.lar.lan;
          parame1.rVo = this.lar.bxj;
          parame1.rJr = this.dTO;
          localObject1 = new StringBuilder();
          au.HU();
          localObject1 = com.tencent.mm.model.c.Gb() + this.lar.bch();
          k = this.lar.bxj - this.lar.lam;
          i = k;
          if (k > 8000) {
            i = 8000;
          }
          localObject1 = com.tencent.mm.a.e.e((String)localObject1, this.lar.lam, i);
          if (bi.bC((byte[])localObject1))
          {
            x.e("MicroMsg.NetSceneMasSend", "doScene READ data[" + this.lar.bch() + "]  Error ");
            this.retCode = (0 - (com.tencent.mm.compatible.util.g.getLine() + 10000));
            i = -1;
          }
          else
          {
            parame1.rVn = this.lar.lam;
            parame1.rVq = this.lar.enI;
            localObject2 = new bhy();
            ((bhy)localObject2).bq((byte[])localObject1);
            parame1.rVm = ((bhy)localObject2);
            i = j;
          }
        }
      }
      else
      {
        if (this.lar.msgType != 1) {
          break label2205;
        }
        parame1.rVm = new bhy().bq(this.lar.bch().getBytes());
        parame1.rVo = this.lar.bxj;
        parame1.rVl = 0;
        parame1.rVn = 0;
        parame1.rVr = new bhy().bq(new byte[0]);
        parame1.rVq = 0;
        parame1.rVp = 0;
        parame1.rVs = 0;
        parame1.rVt = 0;
      }
    }
    label2205:
    x.d("MicroMsg.NetSceneMasSend", "error msgtype:" + this.lar.msgType);
    this.retCode = (0 - (com.tencent.mm.compatible.util.g.getLine() + 10000));
    return -1;
  }
  
  protected final int a(com.tencent.mm.network.q paramq)
  {
    return l.b.dJm;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSceneMasSend", "onGYNetEnd  errtype:" + paramInt2 + " errCode:" + paramInt3);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      x.e("MicroMsg.NetSceneMasSend", "ERR: onGYNetEnd FAILED errtype:" + paramInt2 + " errCode:" + paramInt3);
      this.retCode = (0 - com.tencent.mm.compatible.util.g.getLine() - 10000);
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    if (this.lar == null)
    {
      x.e("MicroMsg.NetSceneMasSend", "ERR: onGYNetEnd Get INFO FAILED :");
      this.retCode = (0 - com.tencent.mm.compatible.util.g.getLine() - 10000);
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    if ((this.lar.status != 104) && (this.lar.status != 103))
    {
      x.e("MicroMsg.NetSceneMasSend", "ERR: onGYNetEnd STATUS ERR: status:" + this.lar.status);
      this.retCode = (0 - com.tencent.mm.compatible.util.g.getLine() - 10000);
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    paramArrayOfByte = (ata)this.diG.dIE.dIL;
    paramq = (asz)this.diG.dID.dIL;
    if ((paramq.rVp > 0) && (paramq.rVr != null) && (paramq.rVr.siK != null) && (!bi.bC(paramq.rVr.siK.toByteArray())) && (paramq.rVq != paramArrayOfByte.rVq - paramq.rVr.siI))
    {
      x.e("MicroMsg.NetSceneMasSend", "onGYNetEnd Err Thumb ");
      this.retCode = (0 - com.tencent.mm.compatible.util.g.getLine() - 10000);
      this.diJ.a(3, -1, "doScene failed", this);
      return;
    }
    if ((paramq.rVo > 0) && (paramq.rVm != null) && (paramq.rVm.siK != null) && (!bi.bC(paramq.rVm.siK.toByteArray())) && (paramq.rVn != paramArrayOfByte.rVn - paramq.rVm.siI))
    {
      x.e("MicroMsg.NetSceneMasSend", "onGYNetEnd Err Data ");
      this.retCode = (0 - com.tencent.mm.compatible.util.g.getLine() - 10000);
      this.diJ.a(3, -1, "doScene failed", this);
      return;
    }
    this.lar.enK = bi.VE();
    paramInt1 = this.lar.status;
    if (paramInt1 == 103)
    {
      paramArrayOfByte = this.lar;
      paramInt1 = paramq.rVq;
      paramArrayOfByte.enI = (paramq.rVr.siI + paramInt1);
      if (this.lar.enI >= this.lar.lan) {
        this.lar.status = 199;
      }
    }
    for (;;)
    {
      if (this.lar.status != 199)
      {
        if (a(this.dIX, this.diJ) != -1) {
          break;
        }
        this.retCode = (0 - (com.tencent.mm.compatible.util.g.getLine() + 10000));
        this.diJ.a(3, -1, "doScene failed", this);
        return;
        if (paramInt1 == 104)
        {
          paramArrayOfByte = this.lar;
          paramInt1 = paramq.rVn;
          paramArrayOfByte.lam = (paramq.rVm.siI + paramInt1);
          if (this.lar.lam >= this.lar.bxj) {
            if (this.lar.lan > 0) {
              this.lar.status = 103;
            } else {
              this.lar.status = 199;
            }
          }
        }
        else
        {
          x.e("MicroMsg.NetSceneMasSend", "onGYNetEnd ERROR STATUS:" + paramInt1);
          this.retCode = (0 - com.tencent.mm.compatible.util.g.getLine() - 10000);
          this.diJ.a(3, -1, "doScene failed", this);
          return;
        }
      }
    }
    paramArrayOfByte = h.bco();
    a locala = this.lar;
    if (locala != null)
    {
      locala.bWA = -1;
      ContentValues localContentValues = new ContentValues();
      if ((locala.bWA & 0x1) != 0) {
        localContentValues.put("clientid", locala.bcg());
      }
      if ((locala.bWA & 0x2) != 0) {
        localContentValues.put("status", Integer.valueOf(locala.status));
      }
      if ((locala.bWA & 0x4) != 0) {
        localContentValues.put("createtime", Long.valueOf(locala.createTime));
      }
      if ((locala.bWA & 0x8) != 0) {
        localContentValues.put("lastmodifytime", Long.valueOf(locala.enK));
      }
      if ((locala.bWA & 0x10) != 0) {
        localContentValues.put("filename", locala.bch());
      }
      if ((locala.bWA & 0x20) != 0) {
        localContentValues.put("thumbfilename", locala.bci());
      }
      if ((locala.bWA & 0x40) != 0) {
        localContentValues.put("tolist", locala.bcj());
      }
      if ((locala.bWA & 0x80) != 0) {
        localContentValues.put("tolistcount", Integer.valueOf(locala.lak));
      }
      if ((locala.bWA & 0x100) != 0) {
        localContentValues.put("msgtype", Integer.valueOf(locala.msgType));
      }
      if ((locala.bWA & 0x200) != 0) {
        localContentValues.put("mediatime", Integer.valueOf(locala.lal));
      }
      if ((locala.bWA & 0x400) != 0) {
        localContentValues.put("datanetoffset", Integer.valueOf(locala.lam));
      }
      if ((locala.bWA & 0x800) != 0) {
        localContentValues.put("datalen", Integer.valueOf(locala.bxj));
      }
      if ((locala.bWA & 0x1000) != 0) {
        localContentValues.put("thumbnetoffset", Integer.valueOf(locala.enI));
      }
      if ((locala.bWA & 0x2000) != 0) {
        localContentValues.put("thumbtotallen", Integer.valueOf(locala.lan));
      }
      if ((locala.bWA & 0x4000) != 0) {
        localContentValues.put("reserved1", Integer.valueOf(locala.videoSource));
      }
      if ((locala.bWA & 0x8000) != 0) {
        localContentValues.put("reserved2", Integer.valueOf(locala.lao));
      }
      if ((locala.bWA & 0x10000) != 0)
      {
        if (locala.dCX != null) {
          break label1426;
        }
        paramq = "";
        localContentValues.put("reserved3", paramq);
      }
      if ((locala.bWA & 0x20000) != 0)
      {
        if (locala.dCY != null) {
          break label1436;
        }
        paramq = "";
        label1248:
        localContentValues.put("reserved4", paramq);
      }
      if ((int)paramArrayOfByte.dCZ.insert("massendinfo", "clientid", localContentValues) != -1)
      {
        au.HU();
        if (com.tencent.mm.model.c.FW().Yq("masssendapp") != null) {
          break label1446;
        }
        paramInt1 = 1;
        label1299:
        paramq = new ai();
        paramq.setUsername("masssendapp");
        paramq.setContent(b.a(locala));
        paramq.as(locala.createTime);
        paramq.eX(0);
        paramq.eV(0);
        if (paramInt1 == 0) {
          break label1451;
        }
        au.HU();
        com.tencent.mm.model.c.FW().d(paramq);
        label1367:
        paramArrayOfByte.doNotify();
      }
    }
    if (this.dYW != null) {}
    for (long l = this.dYW.Ad();; l = 0L)
    {
      x.d("MicroMsg.NetSceneMasSend", "!!!FIN: useTime:" + l);
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
      label1426:
      paramq = locala.dCX;
      break;
      label1436:
      paramq = locala.dCY;
      break label1248;
      label1446:
      paramInt1 = 0;
      break label1299;
      label1451:
      au.HU();
      com.tencent.mm.model.c.FW().a(paramq, "masssendapp");
      break label1367;
    }
  }
  
  protected final void a(l.a parama) {}
  
  public final void cancel()
  {
    this.dJO = true;
  }
  
  public final int getType()
  {
    return 193;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/masssend/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */