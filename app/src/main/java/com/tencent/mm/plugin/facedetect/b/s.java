package com.tencent.mm.plugin.facedetect.b;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bxo;
import com.tencent.mm.protocal.c.bxp;
import com.tencent.mm.sdk.platformtools.x;

public final class s
  extends l
  implements k, e
{
  private b diG;
  private com.tencent.mm.ab.e diJ;
  private boolean iMA = false;
  
  public s(long paramLong, String paramString1, String paramString2)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bxo();
    ((b.a)localObject).dIH = new bxp();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/verifyface";
    ((b.a)localObject).dIF = 797;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (bxo)this.diG.dID.dIL;
    ((bxo)localObject).rFP = paramLong;
    ((bxo)localObject).sha = paramString1;
    ((bxo)localObject).shb = paramString2;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    paramq = (bxp)((b)paramq).dIE.dIL;
    boolean bool;
    if ((paramInt2 == 0) && (paramInt3 == 0)) {
      if (paramq.shd == 0)
      {
        bool = true;
        this.iMA = bool;
        paramInt1 = paramq.shd;
        x.i("MicroMsg.NetSceneFaceVerifyFace", "hy: is Verified: %b", new Object[] { Boolean.valueOf(this.iMA) });
      }
    }
    for (;;)
    {
      if (this.diJ != null) {
        this.diJ.a(paramInt2, paramInt1, paramString, this);
      }
      return;
      bool = false;
      break;
      paramInt1 = paramInt3;
      if (paramq != null)
      {
        paramInt1 = paramInt3;
        if (paramq.shd != 0)
        {
          x.i("MicroMsg.NetSceneFaceVerifyFace", "hy: has DetailRet, use it");
          paramInt1 = paramq.shd;
        }
      }
    }
  }
  
  public final boolean aJr()
  {
    return true;
  }
  
  public final String aJs()
  {
    return null;
  }
  
  public final int getType()
  {
    return 797;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/facedetect/b/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */