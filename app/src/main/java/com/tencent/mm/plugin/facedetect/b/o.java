package com.tencent.mm.plugin.facedetect.b;

import com.tencent.mm.ab.l.a;
import com.tencent.mm.ab.l.b;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.avt;
import com.tencent.mm.protocal.c.bfy;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class o
  extends p
  implements k, e
{
  private final q dJM = new f();
  private boolean iMA = false;
  private String iMF = "";
  
  public o(long paramLong, String paramString1, String paramString2)
  {
    j.a locala = (j.a)this.dJM.KV();
    locala.iMr.rFO = p.iMG;
    locala.iMr.rFP = paramLong;
    locala.iMr.sha = paramString1;
    locala.iMr.shb = paramString2;
  }
  
  final void AQ(String paramString)
  {
    ((j.a)this.dJM.KV()).iMr.rFO = paramString;
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
    x.d("MicroMsg.NetSceneFaceRegFaceRsa", "hy: onGYNetEnd  errType:" + paramInt1 + " errCode:" + paramInt2);
    paramq = (j.b)paramq.Id();
    boolean bool1;
    int i;
    if ((paramInt1 == 0) && (paramInt2 == 0)) {
      if (paramq.iMs.shd == 0)
      {
        bool1 = true;
        this.iMA = bool1;
        this.iMF = paramq.iMs.shc;
        i = paramq.iMs.shd;
        boolean bool3 = this.iMA;
        paramInt2 = paramq.iMs.shd;
        if (bi.oW(this.iMF)) {
          break label179;
        }
        bool1 = bool2;
        label124:
        x.i("MicroMsg.NetSceneFaceRegFaceRsa", "hy: is verify ok: %b, youtuRet; %d, has random pwd: %b", new Object[] { Boolean.valueOf(bool3), Integer.valueOf(paramInt2), Boolean.valueOf(bool1) });
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
      break label124;
      i = paramInt2;
      if (paramq != null)
      {
        i = paramInt2;
        if (paramq.iMs != null)
        {
          i = paramInt2;
          if (paramq.iMs.shd != 0)
          {
            x.i("MicroMsg.NetSceneFaceRegFaceRsa", "hy: has detail ret. use");
            i = paramq.iMs.shd;
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
    return ((j.b)paramq.Id()).iMs.rFR;
  }
  
  public final int getType()
  {
    return 930;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/facedetect/b/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */