package com.tencent.mm.plugin.luckymoney.b;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.e;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.alm;
import com.tencent.mm.protocal.c.aln;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.c.h;

public final class v
  extends h
{
  public aln kRa;
  
  public v(String paramString1, String paramString2, String paramString3)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new alm();
    ((b.a)localObject).dIH = new aln();
    ((b.a)localObject).dIF = 2929;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/ftfhb/businesscallbackwxhb";
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (alm)this.diG.dID.dIL;
    ((alm)localObject).kLZ = paramString1;
    ((alm)localObject).hTI = paramString2;
    ((alm)localObject).kRx = paramString3;
    x.i("MicroMsg.NetSceneLuckyMoneyBusinessCallback", "sendId: %s, %s", new Object[] { paramString1, paramString3 });
  }
  
  protected final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    this.kRa = ((aln)((b)paramq).dIE.dIL);
    x.i("MicroMsg.NetSceneLuckyMoneyBusinessCallback", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.kRa.hUm), this.kRa.hUn });
    if (this.diJ != null) {
      this.diJ.a(paramInt1, paramInt2, paramString, this);
    }
  }
  
  protected final void f(q paramq)
  {
    paramq = (aln)((b)paramq).dIE.dIL;
    this.uXe = paramq.hUm;
    this.uXf = paramq.hUn;
  }
  
  public final int getType()
  {
    return 2929;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/luckymoney/b/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */