package com.tencent.mm.plugin.facedetect.b;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bfx;
import com.tencent.mm.protocal.c.bfy;
import com.tencent.mm.sdk.platformtools.x;

public final class n
  extends l
  implements k, e
{
  private b diG;
  private com.tencent.mm.ab.e diJ;
  private boolean iMA = false;
  private String iME = null;
  
  public n(long paramLong, String paramString1, String paramString2)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bfx();
    ((b.a)localObject).dIH = new bfy();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/registerface";
    ((b.a)localObject).dIF = 918;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (bfx)this.diG.dID.dIL;
    ((bfx)localObject).rFP = paramLong;
    ((bfx)localObject).sha = paramString1;
    ((bfx)localObject).shb = paramString2;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    paramq = (bfy)((b)paramq).dIE.dIL;
    boolean bool;
    if ((paramInt2 == 0) && (paramInt3 == 0)) {
      if (paramq.shd == 0)
      {
        bool = true;
        this.iMA = bool;
        this.iME = paramq.shc;
        paramInt1 = paramq.shd;
        x.i("MicroMsg.NetSceneFaceRegFace", "hy: is Verified: %b", new Object[] { Boolean.valueOf(this.iMA) });
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
          x.i("MicroMsg.NetSceneFaceRegFace", "hy: has detail ret. use");
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
    return this.iME;
  }
  
  public final int getType()
  {
    return 918;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/facedetect/b/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */