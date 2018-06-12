package com.tencent.mm.plugin.wallet_index.c;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.yh;
import com.tencent.mm.protocal.c.yi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.c.m;

public final class b
  extends m
{
  private com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  public String pCN;
  public String pCO;
  
  public b(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, int paramInt1, int paramInt2, String paramString9)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new yh();
    ((b.a)localObject).dIH = new yi();
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/genmallprepay";
    ((b.a)localObject).dIF = 2755;
    ((b.a)localObject).dII = 189;
    ((b.a)localObject).dIJ = 1000000189;
    this.diG = ((b.a)localObject).KT();
    localObject = (yh)this.diG.dID.dIL;
    ((yh)localObject).jQb = paramString1;
    ((yh)localObject).rsx = paramString4;
    ((yh)localObject).rsw = paramString3;
    ((yh)localObject).rsy = paramString5;
    ((yh)localObject).rsz = paramString2;
    ((yh)localObject).rhq = paramString6;
    ((yh)localObject).rrC = paramString7;
    ((yh)localObject).rEe = paramString8;
    ((yh)localObject).qZe = paramInt1;
    ((yh)localObject).jTB = paramString9;
    if (paramInt2 > 0) {
      ((yh)localObject).otY = paramInt2;
    }
    x.d("MicroMsg.NetSceneGenMallPrepay", String.format("appid:%s,packageExt:%s,nonceStr:%s,paySignature:%s,signtype:%s,timeStamp:%s,url:%s,bizUsername:%s,channel:%s,scene:%s", new Object[] { paramString1, paramString4, paramString3, paramString5, paramString2, paramString6, paramString7, paramString8, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }));
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void e(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    x.d("MicroMsg.NetSceneGenMallPrepay", "errType:" + paramInt1 + ",errCode:" + paramInt2 + ",errMsg" + paramString);
    paramString = (yi)((com.tencent.mm.ab.b)paramq).dIE.dIL;
    x.i("MicroMsg.NetSceneGenMallPrepay", "hy: errCode and errMsg in proto: errCode: %d, errMsg:%s", new Object[] { Integer.valueOf(paramString.iwS), paramString.iwT });
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      x.d("MicroMsg.NetSceneGenMallPrepay", "rr " + paramString.rEf);
      this.pCN = paramString.rEf;
      this.pCO = paramString.rEg;
    }
    paramq = paramString.iwT;
    paramInt2 = paramString.iwS;
    this.diJ.a(paramInt1, paramInt2, paramq, this);
  }
  
  public final int getType()
  {
    return 2755;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/wallet_index/c/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */