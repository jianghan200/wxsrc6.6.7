package com.tencent.mm.plugin.websearch.api;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.asl;
import com.tencent.mm.protocal.c.asm;
import com.tencent.mm.sdk.platformtools.x;

public final class m
  extends l
  implements k
{
  public int bWo;
  private b dZf;
  private com.tencent.mm.ab.e diJ;
  public int iPZ;
  public String kJG;
  public asm pLm;
  private int pLn;
  public int scene;
  
  public m(int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString1, long paramLong, String paramString2)
  {
    this.scene = paramInt1;
    this.pLn = paramInt3;
    this.bWo = paramInt4;
    this.iPZ = paramInt2;
    this.kJG = paramString2;
    x.i("MicroMsg.FTS.NetSceneWebSearchGuide", "scene %d, h5Version=%d type=%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt3), Integer.valueOf(paramInt2) });
    paramString2 = new b.a();
    paramString2.dIF = 1048;
    paramString2.uri = "/cgi-bin/mmsearch-bin/searchguide";
    paramString2.dIG = new asl();
    paramString2.dIH = new asm();
    this.dZf = paramString2.KT();
    paramString2 = (asl)this.dZf.dID.dIL;
    paramString2.otY = paramInt1;
    paramString2.rUH = paramInt3;
    paramString2.rUI = p.JU();
    paramString2.rUJ = paramInt2;
    paramString2.iwP = paramString1;
    paramString2.rUK = paramLong;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.dZf, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.FTS.NetSceneWebSearchGuide", "netId %d | errType %d | errCode %d | errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    this.pLm = ((asm)this.dZf.dIE.dIL);
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 1048;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/websearch/api/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */