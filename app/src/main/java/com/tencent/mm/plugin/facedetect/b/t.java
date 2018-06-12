package com.tencent.mm.plugin.facedetect.b;

import com.tencent.mm.ab.l.a;
import com.tencent.mm.ab.l.b;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.avt;
import com.tencent.mm.protocal.c.bxp;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class t
  extends p
  implements k, e
{
  private final q dJM = new g();
  private boolean iMA = false;
  private String iMF = "";
  
  public t(long paramLong, String paramString1, String paramString2)
  {
    k.a locala = (k.a)this.dJM.KV();
    locala.iMt.rFO = p.iMG;
    locala.iMt.rFP = paramLong;
    locala.iMt.shb = paramString2;
    locala.iMt.sha = paramString1;
  }
  
  final void AQ(String paramString)
  {
    ((k.a)this.dJM.KV()).iMt.rFO = paramString;
  }
  
  protected final int Cc()
  {
    return 3;
  }
  
  protected final int a(q paramq)
  {
    return l.b.dJm;
  }
  
  protected final void a(l.a parama) {}
  
  public final boolean aJr()
  {
    return true;
  }
  
  public final String aJs()
  {
    return this.iMF;
  }
  
  public final void c(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    boolean bool2 = true;
    x.d("MicroMsg.NetSceneFaceVerifyFaceRsa", "hy: onGYNetEnd  errType:" + paramInt1 + " errCode:" + paramInt2);
    paramq = (k.b)paramq.Id();
    boolean bool1;
    label114:
    int i;
    if ((paramInt1 == 0) && (paramInt2 == 0)) {
      if (paramq.iMu.shd == 0)
      {
        bool1 = true;
        this.iMA = bool1;
        this.iMF = paramq.iMu.shc;
        boolean bool3 = this.iMA;
        paramInt2 = paramq.iMu.shd;
        if (bi.oW(this.iMF)) {
          break label179;
        }
        bool1 = bool2;
        x.i("MicroMsg.NetSceneFaceVerifyFaceRsa", "hy: is verify ok: %b, youtuRet: %d, has random pwd: %b", new Object[] { Boolean.valueOf(bool3), Integer.valueOf(paramInt2), Boolean.valueOf(bool1) });
        i = paramq.iMu.shd;
      }
    }
    for (;;)
    {
      this.diJ.a(paramInt1, i, paramString, this);
      return;
      bool1 = false;
      break;
      label179:
      bool1 = false;
      break label114;
      i = paramInt2;
      if (paramq != null)
      {
        i = paramInt2;
        if (paramq.iMu != null)
        {
          i = paramInt2;
          if (paramq.iMu.shd != 0)
          {
            x.i("MicroMsg.NetSceneFaceVerifyFaceRsa", "hy: has detail ret. use");
            i = paramq.iMu.shd;
          }
        }
      }
    }
  }
  
  final int g(com.tencent.mm.network.e parame)
  {
    this.dJM.KV();
    return a(parame, this.dJM, this);
  }
  
  protected final avt g(q paramq)
  {
    return ((k.b)paramq.Id()).iMu.rFR;
  }
  
  public final int getType()
  {
    return 930;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/facedetect/b/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */