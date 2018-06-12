package com.tencent.mm.plugin.wallet_index.c;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.anm;
import com.tencent.mm.protocal.c.ann;
import com.tencent.mm.protocal.c.bxk;
import com.tencent.mm.protocal.c.bxl;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.c.m;

public final class g
  extends m
{
  public String bKk;
  private b diG;
  private com.tencent.mm.ab.e diJ;
  public int errCode;
  
  public g(int paramInt1, int paramInt2, String paramString, ann paramann, anm paramanm)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bxk();
    ((b.a)localObject).dIH = new bxl();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/boss/verifyandroidiappackage";
    ((b.a)localObject).dIF = 1306;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (bxk)this.diG.dID.dIL;
    ((bxk)localObject).rFc = paramInt1;
    ((bxk)localObject).bVC = paramInt2;
    this.bKk = paramString;
    ((bxk)localObject).rFi = paramann;
    ((bxk)localObject).rFh = paramanm;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void e(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    x.e("MicroMsg.NetSceneVerifyAndroidIapPackage", "ErrType:" + paramInt1 + ",errCode:" + paramInt2 + ",errMsg:" + paramString);
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      this.diJ.a(paramInt1, paramInt2, paramString, this);
      return;
    }
    paramq = (bxl)this.diG.dIE.dIL;
    x.e("MicroMsg.NetSceneVerifyAndroidIapPackage", "business: errCode:" + paramq.bQO + ",errMsg:" + paramq.bQP);
    paramInt2 = paramq.bQO;
    this.diJ.a(paramInt1, paramInt2, paramString, this);
  }
  
  public final int getType()
  {
    return 1306;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/wallet_index/c/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */