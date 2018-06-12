package com.tencent.mm.wallet_core.c;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.bxx;
import com.tencent.mm.protocal.c.bxy;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class l
  extends m
{
  private final b diG;
  private com.tencent.mm.ab.e diJ;
  public int errCode;
  public String iiv = null;
  public String iix;
  public int pDn = 0;
  
  public l(String paramString1, int paramInt1, int paramInt2, int paramInt3, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bxx();
    ((b.a)localObject).dIH = new bxy();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/verifypurchase";
    ((b.a)localObject).dIF = 414;
    ((b.a)localObject).dII = 215;
    ((b.a)localObject).dIJ = 1000000215;
    this.diG = ((b.a)localObject).KT();
    localObject = (bxx)this.diG.dID.dIL;
    this.iiv = paramString1;
    ((bxx)localObject).rem = paramString1;
    ((bxx)localObject).stY = paramInt1;
    ((bxx)localObject).sdM = paramInt3;
    ((bxx)localObject).lOM = paramInt2;
    if (!bi.oW(paramString6))
    {
      ((bxx)localObject).sdK = paramString6;
      ((bxx)localObject).sdL = paramString5;
    }
    ((bxx)localObject).sdN = paramString2;
    ((bxx)localObject).sua = paramString4;
    if (paramString3 != null) {
      paramString1 = paramString3.getBytes();
    }
    for (((bxx)localObject).stX = new bhy().bq(paramString1);; ((bxx)localObject).stX = new bhy())
    {
      ((bxx)localObject).stZ = ((int)bi.VE());
      x.i("MicroMsg.NetSceneVerifyPurchase", "productId:" + this.iiv + ",verifyType:" + paramInt1 + ",palyType:" + paramInt2 + ",payload:" + paramString2 + ",purchaseData:" + paramString3 + ",dataSignature:" + paramString4);
      return;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void e(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    x.e("MicroMsg.NetSceneVerifyPurchase", "ErrType:" + paramInt1 + "   errCode:" + paramInt2);
    this.errCode = 0;
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      this.errCode = -1;
      this.diJ.a(paramInt1, paramInt2, paramString, this);
      return;
    }
    paramq = (bxy)((b)paramq).dIE.dIL;
    if (paramq.six != null)
    {
      this.pDn = paramq.suc;
      x.d("MicroMsg.NetSceneVerifyPurchase", " Get Series ID is " + paramq.rxN);
      x.d("MicroMsg.NetSceneVerifyPurchase", " Get Biz Type is " + paramq.sub);
      this.iix = paramq.rxN;
    }
    this.diJ.a(paramInt1, paramInt2, paramString, this);
  }
  
  public final int getType()
  {
    return 414;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/wallet_core/c/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */