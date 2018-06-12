package com.tencent.mm.plugin.wallet_index.c;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.anm;
import com.tencent.mm.protocal.c.ann;
import com.tencent.mm.protocal.c.za;
import com.tencent.mm.protocal.c.zb;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.c.m;

public final class d
  extends m
{
  private b diG;
  private com.tencent.mm.ab.e diJ;
  public int errCode;
  public anm pCP;
  public ann pCQ;
  
  public d(int paramInt1, String paramString1, String paramString2, String paramString3, int paramInt2, String paramString4, String paramString5, String paramString6, String paramString7)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new za();
    ((b.a)localObject).dIH = new zb();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/boss/getandroidiappackage";
    ((b.a)localObject).dIF = 1130;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (za)this.diG.dID.dIL;
    ((za)localObject).bPS = paramString1;
    ((za)localObject).rFc = paramInt1;
    ((za)localObject).rFd = Integer.parseInt(paramString2);
    ((za)localObject).desc = paramString3;
    ((za)localObject).count = paramInt2;
    ((za)localObject).scene = 13;
    ((za)localObject).rFe = paramString4;
    ((za)localObject).rFf = paramString5;
    ((za)localObject).sign = paramString6;
    ((za)localObject).rFg = paramString7;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void e(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    x.e("MicroMsg.NetSceneGetAndroidIapPackage", "ErrType:" + paramInt1 + ",errCode:" + paramInt2 + ",errMsg:" + paramString);
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      this.diJ.a(paramInt1, paramInt2, paramString, this);
      return;
    }
    paramString = (zb)this.diG.dIE.dIL;
    x.e("MicroMsg.NetSceneGetAndroidIapPackage", "business: errCode:" + paramString.bQO + ",errMsg:" + paramString.bQP);
    paramInt2 = paramString.bQO;
    paramq = paramString.bQP;
    if (paramInt2 == 0)
    {
      this.pCP = paramString.rFh;
      this.pCQ = paramString.rFi;
    }
    this.diJ.a(paramInt1, paramInt2, paramq, this);
  }
  
  public final int getType()
  {
    return 1130;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_index/c/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */