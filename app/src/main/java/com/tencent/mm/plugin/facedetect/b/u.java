package com.tencent.mm.plugin.facedetect.b;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.aah;
import com.tencent.mm.protocal.c.aai;
import com.tencent.mm.sdk.platformtools.x;

public final class u
  extends l
  implements k, b
{
  private com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  private long iML = -1L;
  private byte[] iMM = null;
  
  public u(int paramInt)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new aah();
    ((b.a)localObject).dIH = new aai();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getbioconfig";
    ((b.a)localObject).dIF = 732;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (aah)this.diG.dID.dIL;
    ((aah)localObject).hcE = 1;
    ((aah)localObject).otY = paramInt;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    paramq = (aai)((com.tencent.mm.ab.b)paramq).dIE.dIL;
    long l;
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      this.iML = paramq.rFP;
      this.iMM = paramq.rFQ.lR;
      l = this.iML;
      if (this.iMM != null) {
        break label108;
      }
    }
    label108:
    for (paramInt1 = 0;; paramInt1 = this.iMM.length)
    {
      x.i("MicroMsg.NetSceneGetBioConfig", "hy: get bio config: bioId: %s, bioConfigSize: %d", new Object[] { Long.valueOf(l), Integer.valueOf(paramInt1) });
      if (this.diJ != null) {
        this.diJ.a(paramInt2, paramInt3, paramString, this);
      }
      return;
    }
  }
  
  public final long aJp()
  {
    return this.iML;
  }
  
  public final byte[] aJq()
  {
    return this.iMM;
  }
  
  public final int getType()
  {
    return 732;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/facedetect/b/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */