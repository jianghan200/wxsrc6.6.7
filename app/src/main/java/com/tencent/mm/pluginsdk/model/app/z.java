package com.tencent.mm.pluginsdk.model.app;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.model.au;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.nd;
import com.tencent.mm.protocal.c.ne;
import com.tencent.mm.sdk.platformtools.bi;

public final class z
  extends l
  implements k
{
  private com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  private final b qAe;
  
  public z(b paramb, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new nd();
    ((b.a)localObject).dIH = new ne();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/checkbigfiledownload";
    ((b.a)localObject).dIF = 728;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    this.qAe = paramb;
    localObject = (nd)this.diG.dID.dIL;
    ((nd)localObject).rmy = paramString1;
    ((nd)localObject).rri = paramb.field_totalLen;
    ((nd)localObject).rrj = paramString2;
    ((nd)localObject).ecE = paramString3;
    ((nd)localObject).rrk = paramString4;
    ((nd)localObject).jTv = paramString5;
    au.HU();
    ((nd)localObject).jTu = ((String)com.tencent.mm.model.c.DT().get(2, ""));
    ((nd)localObject).rdY = com.tencent.mm.modelcdntran.b.dOm;
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneCheckBigFileDownload", "summerbig AESKey[%s] FileMd5[%s] FileName[%s] FileExt[%s] FileSize[%d] FileType[%d] stack[%s]", new Object[] { bi.Xf(((nd)localObject).rmy), ((nd)localObject).rrj, ((nd)localObject).ecE, ((nd)localObject).rrk, Long.valueOf(((nd)localObject).rri), Integer.valueOf(((nd)localObject).rdY), bi.cjd() });
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneCheckBigFileDownload", "summerbig onGYNetEnd [%d, %d, %s]", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (ne)((com.tencent.mm.ab.b)paramq).dIE.dIL;
      this.qAe.field_signature = paramq.eJK;
      this.qAe.field_fakeAeskey = paramq.rrm;
      this.qAe.field_fakeSignature = paramq.rrn;
      boolean bool = ao.asF().c(this.qAe, new String[0]);
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneCheckBigFileDownload", "summerbig onGYNetEnd field_signature[%s], field_fakeAeskey[%s], field_fakeSignature[%s], update[%b]", new Object[] { bi.Xf(this.qAe.field_signature), bi.Xf(this.qAe.field_fakeAeskey), bi.Xf(this.qAe.field_fakeSignature), Boolean.valueOf(bool) });
    }
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 728;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/pluginsdk/model/app/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */