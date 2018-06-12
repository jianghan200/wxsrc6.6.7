package com.tencent.mm.plugin.sns.model;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.l.b;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.storage.r;
import com.tencent.mm.plugin.sns.storage.s;
import com.tencent.mm.protocal.c.ate;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.bor;
import com.tencent.mm.protocal.c.bos;
import com.tencent.mm.protocal.k.e;
import com.tencent.mm.sdk.platformtools.x;
import java.io.IOException;
import java.io.OutputStream;

public final class p
  extends l
  implements k
{
  private OutputStream dHY = null;
  private com.tencent.mm.ab.b diG;
  public com.tencent.mm.ab.e diJ;
  private String filename;
  String mediaId = "";
  private String nnX;
  private int nnY = -1;
  int nnZ = -1;
  private boolean noa = true;
  private String nob = null;
  private ate noc;
  
  public p(ate paramate, String paramString1, String paramString2, int paramInt1, boolean paramBoolean, int paramInt2, String paramString3)
  {
    this.mediaId = paramString1;
    this.noc = paramate;
    this.noa = paramBoolean;
    this.nnY = paramInt1;
    this.nnZ = paramInt2;
    this.nob = paramString3;
    this.nnX = an.s(af.getAccSnsPath(), paramString1);
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bor();
    ((b.a)localObject).dIH = new bos();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/mmsnsdownload";
    ((b.a)localObject).dIF = 208;
    ((b.a)localObject).dII = 96;
    ((b.a)localObject).dIJ = 1000000096;
    this.diG = ((b.a)localObject).KT();
    bor localbor = (bor)this.diG.dID.dIL;
    r localr = af.byd().NA(paramString1);
    localObject = localr;
    if (localr == null) {
      localObject = new r();
    }
    ((r)localObject).nJL = paramString1;
    ((r)localObject).offset = 0;
    af.byd().a(paramString1, (r)localObject);
    if (paramBoolean) {}
    for (this.filename = i.n(paramate);; this.filename = i.m(paramate))
    {
      FileOp.mL(this.nnX);
      FileOp.deleteFile(an.s(af.getAccSnsPath(), paramString1) + this.filename);
      localbor.smD = paramString2;
      localbor.smE = 0;
      localbor.rdW = 0;
      localbor.rdV = 0;
      localbor.hcE = this.nnY;
      x.d("MicroMsg.NetSceneSnsDownload", "requestKey " + paramString3);
      return;
    }
  }
  
  private int H(byte[] paramArrayOfByte)
  {
    if (!i.LM(af.Gq())) {
      return 0;
    }
    try
    {
      if (this.dHY == null)
      {
        FileOp.mL(this.nnX);
        this.dHY = FileOp.jx(this.nnX + this.filename);
      }
      x.d("MicroMsg.NetSceneSnsDownload", "appendBuf " + paramArrayOfByte.length);
      this.dHY.write(paramArrayOfByte);
      return paramArrayOfByte.length;
    }
    catch (IOException paramArrayOfByte)
    {
      x.printErrStackTrace("MicroMsg.NetSceneSnsDownload", paramArrayOfByte, "appendBuf failed: " + this.filename, new Object[0]);
      return -1;
    }
    finally
    {
      KA();
    }
  }
  
  private void KA()
  {
    try
    {
      if (this.dHY != null)
      {
        this.dHY.flush();
        this.dHY.close();
        this.dHY = null;
      }
      return;
    }
    catch (IOException localIOException)
    {
      x.printErrStackTrace("MicroMsg.NetSceneSnsDownload", localIOException, "", new Object[0]);
    }
  }
  
  private void onError()
  {
    af.byj().LW(this.nob);
  }
  
  protected final int Cc()
  {
    return 100;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  protected final int a(q paramq)
  {
    return l.b.dJm;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSceneSnsDownload", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    paramArrayOfByte = (b.c)paramq.Id();
    paramq = (bos)((com.tencent.mm.ab.b)paramq).dIE.dIL;
    if (paramArrayOfByte.qWB != 0)
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      af.byj().LW(this.nob);
      return;
    }
    paramArrayOfByte = af.byd().NA(this.mediaId);
    if (paramq.rdV <= 0)
    {
      x.e("MicroMsg.NetSceneSnsDownload", "error 1");
      onError();
      return;
    }
    if (paramq.rfy == null)
    {
      x.e("MicroMsg.NetSceneSnsDownload", "error 2");
      onError();
      return;
    }
    if ((paramq.rdW < 0) || (paramq.rdW + paramq.rfy.siK.lR.length > paramq.rdV))
    {
      x.e("MicroMsg.NetSceneSnsDownload", "error 3");
      onError();
      return;
    }
    if (paramq.rdW != paramArrayOfByte.offset)
    {
      x.e("MicroMsg.NetSceneSnsDownload", "error 4");
      onError();
      return;
    }
    paramInt1 = H(paramq.rfy.siK.toByteArray());
    if (paramInt1 < 0)
    {
      x.e("MicroMsg.NetSceneSnsDownload", "error 5");
      onError();
      return;
    }
    paramArrayOfByte.offset += paramInt1;
    paramArrayOfByte.nJH = paramq.rdV;
    x.d("MicroMsg.NetSceneSnsDownload", "byteLen " + paramInt1 + "  totalLen " + paramq.rdV);
    af.byd().a(this.mediaId, paramArrayOfByte);
    if ((paramArrayOfByte.offset == paramArrayOfByte.nJH) && (paramArrayOfByte.nJH != 0))
    {
      paramInt1 = 1;
      if (paramInt1 == 0) {
        break label617;
      }
      x.d("MicroMsg.NetSceneSnsDownload", "downLoad ok");
      if (this.nnZ != 1) {
        break label504;
      }
      paramq = i.e(this.noc);
      label400:
      paramArrayOfByte = an.s(af.getAccSnsPath(), this.mediaId);
      FileOp.deleteFile(paramArrayOfByte + paramq);
      FileOp.i(paramArrayOfByte, this.filename, paramq);
      if (!this.noa) {
        break label516;
      }
      s.b(paramArrayOfByte, paramq, i.f(this.noc), af.byw());
    }
    for (;;)
    {
      af.byj().LW(this.nob);
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
      paramInt1 = 0;
      break;
      label504:
      paramq = i.l(this.noc);
      break label400;
      label516:
      String str = i.e(this.noc);
      if (!FileOp.cn(paramArrayOfByte + str)) {
        s.a(paramArrayOfByte, paramq, str, af.byx());
      }
      str = i.f(this.noc);
      if (!FileOp.cn(paramArrayOfByte + str)) {
        s.b(paramArrayOfByte, paramq, str, af.byw());
      }
    }
    label617:
    a(this.dIX, this.diJ);
  }
  
  public final int getType()
  {
    return 208;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/sns/model/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */