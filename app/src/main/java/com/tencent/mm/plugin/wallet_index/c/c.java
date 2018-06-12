package com.tencent.mm.plugin.wallet_index.c;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.wallet_core.model.i;
import com.tencent.mm.protocal.c.yj;
import com.tencent.mm.protocal.c.yk;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.c.d;
import com.tencent.mm.wallet_core.c.m;

public final class c
  extends m
  implements d
{
  private com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  public String pCN;
  public String pCO;
  
  public c(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, int paramInt1, int paramInt2, int paramInt3, String paramString9)
  {
    Object localObject1 = new b.a();
    ((b.a)localObject1).dIG = new yj();
    ((b.a)localObject1).dIH = new yk();
    ((b.a)localObject1).uri = "/cgi-bin/mmpay-bin/genprepay";
    ((b.a)localObject1).dIF = 398;
    ((b.a)localObject1).dII = 189;
    ((b.a)localObject1).dIJ = 1000000189;
    this.diG = ((b.a)localObject1).KT();
    Object localObject2 = com.tencent.mm.plugin.soter.c.b.bFh();
    localObject1 = ((com.tencent.mm.plugin.soter.c.c)localObject2).onE;
    localObject2 = ((com.tencent.mm.plugin.soter.c.c)localObject2).onF;
    yj localyj = (yj)this.diG.dID.dIL;
    localyj.jQb = paramString1;
    localyj.rsx = paramString4;
    localyj.rsw = paramString3;
    localyj.rsy = paramString5;
    localyj.rsz = paramString2;
    localyj.rhq = paramString6;
    localyj.rrC = paramString7;
    localyj.rEe = paramString8;
    localyj.qZe = paramInt1;
    localyj.rEi = ((String)localObject1);
    localyj.rEh = ((String)localObject2);
    localyj.rmQ = i.bOL();
    if (paramInt2 > 0) {
      localyj.otY = paramInt2;
    }
    localyj.rEj = paramInt3;
    localyj.rEk = paramString9;
    x.d("MicroMsg.NetSceneGenPrepay", "appid:%s,packageExt:%s,nonceStr:%s,paySignature:%s,signtype:%s,timeStamp:%s,url:%s,bizUsername:%s,channel:%s,scene:%s,WxAppScene:%s,cookie:%s", new Object[] { paramString1, paramString4, paramString3, paramString5, paramString2, paramString6, paramString7, paramString8, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString9 });
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void e(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    x.d("MicroMsg.NetSceneGenPrepay", "errType:" + paramInt1 + ",errCode:" + paramInt2 + ",errMsg" + paramString);
    paramString = (yk)((com.tencent.mm.ab.b)paramq).dIE.dIL;
    x.i("MicroMsg.NetSceneGenPrepay", "hy: errCode and errMsg in proto: errCode: %d, errMsg:%s", new Object[] { Integer.valueOf(paramString.iwS), paramString.iwT });
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      x.d("MicroMsg.NetSceneGenPrepay", "rr " + paramString.rEf);
      this.pCN = paramString.rEf;
      this.pCO = paramString.rEg;
    }
    paramq = paramString.iwT;
    paramInt2 = paramString.iwS;
    this.diJ.a(paramInt1, paramInt2, paramq, this);
  }
  
  public final int getType()
  {
    return 398;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_index/c/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */