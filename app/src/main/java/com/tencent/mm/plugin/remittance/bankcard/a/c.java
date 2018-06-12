package com.tencent.mm.plugin.remittance.bankcard.a;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.jq;
import com.tencent.mm.protocal.c.jr;
import com.tencent.mm.sdk.platformtools.x;

public final class c
  extends b
{
  private final String TAG = "MicroMsg.NetSceneBankRemitBusinessCallback";
  private com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  public jr mtU;
  
  public c(String paramString1, String paramString2)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new jq();
    ((b.a)localObject).dIH = new jr();
    ((b.a)localObject).dIF = 1340;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/busscb_tsbc";
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (jq)this.diG.dID.dIL;
    ((jq)localObject).rlf = paramString1;
    ((jq)localObject).myq = paramString2;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    x.i("MicroMsg.NetSceneBankRemitBusinessCallback", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.mtU = ((jr)((com.tencent.mm.ab.b)paramq).dIE.dIL);
    x.i("MicroMsg.NetSceneBankRemitBusinessCallback", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.mtU.hUm), this.mtU.hUn });
    if (this.diJ != null) {
      this.diJ.a(paramInt1, paramInt2, paramString, this);
    }
  }
  
  protected final void f(q paramq)
  {
    paramq = (jr)((com.tencent.mm.ab.b)paramq).dIE.dIL;
    this.uXe = paramq.hUm;
    this.uXf = paramq.hUn;
  }
  
  public final int getType()
  {
    return 1340;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/remittance/bankcard/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */