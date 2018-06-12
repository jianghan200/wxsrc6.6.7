package com.tencent.mm.plugin.remittance.bankcard.a;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bdw;
import com.tencent.mm.protocal.c.bdx;
import com.tencent.mm.sdk.platformtools.x;

public final class i
  extends b
{
  private com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  public int limit;
  public bdx mua;
  
  public i(int paramInt1, int paramInt2)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bdw();
    ((b.a)localObject).dIH = new bdx();
    ((b.a)localObject).dIF = 1511;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/historylist_tsbc";
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (bdw)this.diG.dID.dIL;
    ((bdw)localObject).limit = paramInt1;
    ((bdw)localObject).offset = paramInt2;
    this.limit = paramInt1;
    x.i("MicroMsg.NetSceneBankRemitHistoryList", "limit: %s, offset: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    x.i("MicroMsg.NetSceneBankRemitHistoryList", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.mua = ((bdx)((com.tencent.mm.ab.b)paramq).dIE.dIL);
    x.i("MicroMsg.NetSceneBankRemitHistoryList", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.mua.hUm), this.mua.hUn });
    if (this.diJ != null) {
      this.diJ.a(paramInt1, paramInt2, paramString, this);
    }
  }
  
  protected final void f(q paramq)
  {
    paramq = (bdx)((com.tencent.mm.ab.b)paramq).dIE.dIL;
    this.uXe = paramq.hUm;
    this.uXf = paramq.hUn;
  }
  
  public final int getType()
  {
    return 1511;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/remittance/bankcard/a/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */