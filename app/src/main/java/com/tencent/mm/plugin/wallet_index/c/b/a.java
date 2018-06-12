package com.tencent.mm.plugin.wallet_index.c.b;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bah;
import com.tencent.mm.protocal.c.bai;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.c.m;

public final class a
  extends m
{
  private b diG;
  private com.tencent.mm.ab.e diJ;
  public String pCN;
  public String pCO;
  
  public a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, int paramInt)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bah();
    ((b.a)localObject).dIH = new bai();
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/payugenprepay";
    ((b.a)localObject).dIF = 1521;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (bah)this.diG.dID.dIL;
    ((bah)localObject).jQb = paramString1;
    ((bah)localObject).rsx = paramString4;
    ((bah)localObject).rsw = paramString3;
    ((bah)localObject).rsy = paramString5;
    ((bah)localObject).rsz = paramString2;
    ((bah)localObject).rhq = paramString6;
    ((bah)localObject).rrC = paramString7;
    ((bah)localObject).rEe = paramString8;
    ((bah)localObject).qZe = paramInt;
    x.d("MicroMsg.NetScenePayUGenPrepay", String.format("appid:%s,packageExt:%s,nonceStr:%s,paySignature:%s,signtype:%s,timeStamp:%s,url:%s,bizUsername:%s,", new Object[] { paramString1, paramString4, paramString3, paramString5, paramString2, paramString6, paramString7, paramString8 }));
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void e(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    x.d("MicroMsg.NetScenePayUGenPrepay", "errType:" + paramInt1 + ",errCode:" + paramInt2 + ",errMsg" + paramString);
    paramString = (bai)((b)paramq).dIE.dIL;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      x.d("MicroMsg.NetScenePayUGenPrepay", "rr " + paramString.rEf);
      this.pCN = paramString.rEf;
      this.pCO = paramString.rEg;
    }
    paramString = paramString.iwT;
    this.diJ.a(paramInt1, paramInt2, paramString, this);
  }
  
  public final int getType()
  {
    return 1521;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/wallet_index/c/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */