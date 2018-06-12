package com.tencent.mm.wallet_core.c;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bbp;
import com.tencent.mm.protocal.c.bbq;
import com.tencent.mm.sdk.platformtools.x;

public final class k
  extends m
{
  public final b diG;
  private com.tencent.mm.ab.e diJ;
  public String iiv;
  public String pCK;
  public String pCL;
  
  public k(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, String paramString4)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bbp();
    ((b.a)localObject).dIH = new bbq();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/preparepurchase";
    ((b.a)localObject).dIF = 422;
    ((b.a)localObject).dII = 214;
    ((b.a)localObject).dIJ = 1000000214;
    this.diG = ((b.a)localObject).KT();
    localObject = (bbp)this.diG.dID.dIL;
    this.iiv = paramString1;
    ((bbp)localObject).rem = paramString1;
    this.pCL = paramString2;
    ((bbp)localObject).sdK = paramString2;
    this.pCK = paramString3;
    ((bbp)localObject).sdL = paramString3;
    ((bbp)localObject).lOM = paramInt2;
    ((bbp)localObject).sdM = paramInt1;
    ((bbp)localObject).jTB = paramString4;
    x.d("MicroMsg.NetScenePreparePurchase", "productId:" + paramString1 + ",price:" + paramString2 + ",currencyType:" + paramString3 + ",payType:" + paramInt2);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void e(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    x.e("MicroMsg.NetScenePreparePurchase", "ErrType:" + paramInt1 + ",errCode:" + paramInt2 + ",errMsg:" + paramString);
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      this.diJ.a(paramInt1, paramInt2, paramString, this);
      return;
    }
    this.diJ.a(paramInt1, paramInt2, paramString, this);
  }
  
  public final int getType()
  {
    return 422;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/wallet_core/c/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */