package com.tencent.mm.aw;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.l.b;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.bhz;
import com.tencent.mm.protocal.c.bwe;
import com.tencent.mm.protocal.c.bwf;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.x;

public final class a
  extends l
  implements k
{
  al dHa = new al(new a.1(this), true);
  private b diG;
  com.tencent.mm.ab.e diJ;
  private String ehf = null;
  private int ehg = 0;
  private int ehh = 0;
  int ehi = 0;
  private int ehj = 5;
  private String filemd5 = null;
  String filename = null;
  private int sampleRate = 0;
  
  public a(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.filename = paramString;
    this.ehj = paramInt1;
    this.sampleRate = paramInt2;
    this.ehg = paramInt3;
    this.ehh = paramInt4;
    paramInt1 = com.tencent.mm.a.e.cm(this.filename);
    this.filemd5 = com.tencent.mm.a.g.u(com.tencent.mm.a.e.e(this.filename, 0, paramInt1));
  }
  
  protected final int Cc()
  {
    return 60;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    int i = 3960;
    this.diJ = parame1;
    int k = com.tencent.mm.a.e.cm(this.filename);
    x.d("MicroMsg.NetSceneUploadMedia", com.tencent.mm.compatible.util.g.Ac() + " read file:" + this.filename + " filelen:" + k + " oldoff:" + this.ehi + "this.filemd5 " + this.filemd5);
    if (k <= 0)
    {
      x.e("MicroMsg.NetSceneUploadMedia", "read failed :" + this.filename);
      return -1;
    }
    int j = k - this.ehi;
    if (j > 3960) {}
    for (;;)
    {
      x.i("MicroMsg.NetSceneUploadMedia", com.tencent.mm.compatible.util.g.Ac() + " read file:" + this.filename + " filelen:" + k + " oldoff:" + this.ehi + "  canReadLen " + i);
      parame1 = com.tencent.mm.a.e.e(this.filename, this.ehi, i);
      if (parame1 == null)
      {
        x.e("MicroMsg.NetSceneUploadMedia", "read data error");
        return -1;
      }
      Object localObject = new b.a();
      ((b.a)localObject).dIG = new bwe();
      ((b.a)localObject).dIH = new bwf();
      ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/mmuploadmedia";
      ((b.a)localObject).dIF = 240;
      ((b.a)localObject).dII = 111;
      ((b.a)localObject).dIJ = 1000000111;
      this.diG = ((b.a)localObject).KT();
      localObject = (bwe)this.diG.dID.dIL;
      ((bwe)localObject).ssv = new bhz().VO(this.ehf);
      ((bwe)localObject).rtW = new bhy().bq(parame1);
      ((bwe)localObject).rdX = parame1.length;
      ((bwe)localObject).ssw = new bhz().VO(this.filemd5);
      ((bwe)localObject).rdV = k;
      ((bwe)localObject).rdW = this.ehi;
      ((bwe)localObject).jSO = this.ehj;
      ((bwe)localObject).ssx = 1;
      ((bwe)localObject).ssy = this.sampleRate;
      ((bwe)localObject).ssz = this.ehg;
      ((bwe)localObject).ssA = this.ehh;
      return a(parame, this.diG, this);
      i = j;
    }
  }
  
  protected final int a(q paramq)
  {
    return l.b.dJm;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSceneUploadMedia", com.tencent.mm.compatible.util.g.Ac() + " onGYNetEnd file:" + this.filename + " errtype:" + paramInt2 + " errCode:" + paramInt3);
    paramArrayOfByte = (bwe)((b)paramq).dID.dIL;
    paramq = ((bwf)((b)paramq).dIE.dIL).rvP;
    x.i("MicroMsg.NetSceneUploadMedia", "fileName:%s, md5:%s, totalLen:%d, dataLen:%d, startPos:%d", new Object[] { this.filename, paramq, Integer.valueOf(paramArrayOfByte.rdV), Integer.valueOf(paramArrayOfByte.rdX), Integer.valueOf(paramArrayOfByte.rdW) });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      x.e("MicroMsg.NetSceneUploadMedia", com.tencent.mm.compatible.util.g.Ac() + " onGYNetEnd file:" + this.filename + " errType:" + paramInt2 + " errCode:" + paramInt3);
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    if ((paramArrayOfByte.rdV <= paramArrayOfByte.rdX + paramArrayOfByte.rdW) && (paramq != null) && (!paramq.equals("0")))
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    paramInt1 = paramArrayOfByte.rdW;
    this.ehi = (paramArrayOfByte.rtW.siI + paramInt1);
    x.d("MicroMsg.NetSceneUploadMedia", "onGYNetEnd file:" + this.filename + " delay:500");
    this.dHa.J(500L, 500L);
  }
  
  public final int getType()
  {
    return 240;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/aw/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */