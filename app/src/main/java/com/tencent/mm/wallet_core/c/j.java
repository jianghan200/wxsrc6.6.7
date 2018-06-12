package com.tencent.mm.wallet_core.c;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.wallet_core.model.i;
import com.tencent.mm.protocal.c.baa;
import com.tencent.mm.protocal.c.bab;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class j
  extends m
{
  private com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  
  public j(String paramString)
  {
    this(paramString, null, null, -1, -1, -1);
  }
  
  public j(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, int paramInt3)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new baa();
    ((b.a)localObject).dIH = new bab();
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/paysubscribe";
    ((b.a)localObject).dIF = 421;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (baa)this.diG.dID.dIL;
    ((baa)localObject).scJ = paramString1;
    ((baa)localObject).rmQ = i.bOL();
    ((baa)localObject).scK = paramString3;
    if (!bi.oW(paramString2)) {
      ((baa)localObject).scL = new com.tencent.mm.bk.b(paramString2.getBytes());
    }
    if (paramInt1 >= 0) {
      ((baa)localObject).rmJ = paramInt1;
    }
    if (paramInt2 >= 0) {
      ((baa)localObject).qZe = paramInt2;
    }
    if (paramInt3 >= 0) {
      ((baa)localObject).scM = paramInt3;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void e(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    x.d("MicroMsg.NetScenePaySubscribe", "errType:" + paramInt1 + ",errCode:" + paramInt2 + ",errMsg" + paramString);
    this.diJ.a(paramInt1, paramInt2, paramString, this);
  }
  
  public final int getType()
  {
    return 421;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/wallet_core/c/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */