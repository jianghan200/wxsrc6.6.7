package com.tencent.mm.plugin.facedetect.b;

import com.tencent.mm.ab.m;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.amt;
import com.tencent.mm.protocal.c.avs;
import com.tencent.mm.protocal.c.avt;
import com.tencent.mm.protocal.c.iz;
import com.tencent.mm.protocal.k.d;
import com.tencent.mm.protocal.y;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public abstract class p
  extends m
  implements k
{
  static String iMG = null;
  protected com.tencent.mm.ab.e diJ = null;
  
  public static void AR(String paramString)
  {
    iMG = paramString;
  }
  
  protected static String Oj()
  {
    return iMG;
  }
  
  abstract void AQ(String paramString);
  
  public final void Ld()
  {
    if (this.diJ != null) {
      this.diJ.a(3, -1, "", this);
    }
  }
  
  public final com.tencent.mm.ab.e Le()
  {
    return this.diJ;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    if (!bi.oW(iMG))
    {
      x.i("MicroMsg.NetSceneFaceRsaBase", "hy: has ticket: %s", new Object[] { iMG });
      AQ(iMG);
      return g(parame);
    }
    return getType();
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    x.i("MicroMsg.NetSceneFaceRsaBase", "hy: errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if ((paramInt1 == 4) && (paramInt2 == -102))
    {
      paramInt1 = paramq.KV().qWA.ver;
      x.d("MicroMsg.NetSceneFaceRsaBase", "hy: summerauth auth MM_ERR_CERT_EXPIRED  getcert now  old ver:%d", new Object[] { Integer.valueOf(paramInt1) });
      g.Em().H(new p.1(this, paramInt1));
      return;
    }
    c(paramInt1, paramInt2, paramString, paramq);
  }
  
  public final iz c(q paramq)
  {
    paramq = g(paramq);
    if (paramq != null) {
      return paramq.rhK;
    }
    return null;
  }
  
  abstract void c(int paramInt1, int paramInt2, String paramString, q paramq);
  
  public final avs d(q paramq)
  {
    paramq = g(paramq);
    if (paramq != null) {
      return paramq.rhL;
    }
    return null;
  }
  
  public final amt e(q paramq)
  {
    paramq = g(paramq);
    if (paramq != null) {
      return paramq.rhJ;
    }
    return null;
  }
  
  abstract int g(com.tencent.mm.network.e parame);
  
  protected abstract avt g(q paramq);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/facedetect/b/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */