package com.tencent.mm.plugin.fingerprint.c;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.soter.b.d;
import com.tencent.mm.protocal.c.bqk;
import com.tencent.mm.protocal.c.bql;
import com.tencent.mm.sdk.platformtools.x;
import com.tenpay.android.wechat.TenpayUtil;

public final class b
  extends d
  implements k
{
  public final com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  
  public b(String paramString1, String paramString2, String paramString3)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bqk();
    ((b.a)localObject).dIH = new bql();
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/soteropenfppayment";
    ((b.a)localObject).dIF = 1638;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (bqk)this.diG.dID.dIL;
    ((bqk)localObject).sba = paramString1;
    ((bqk)localObject).signature = paramString2;
    ((bqk)localObject).soj = paramString3;
    ((bqk)localObject).bRr = TenpayUtil.signWith3Des("passwd=" + ((bqk)localObject).soj);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void aNJ()
  {
    x.i("MicroMsg.NetSceneSoterOpenTouchPay", "hy: authkey required");
    if (this.diJ != null) {
      this.diJ.a(4, -1, "", this);
    }
  }
  
  public final void d(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    x.i("MicroMsg.NetSceneSoterOpenTouchPay", "hy: errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      x.i("MicroMsg.NetSceneSoterOpenTouchPay", "open fingerprintpay success");
      com.tencent.mm.plugin.fingerprint.b.e.fa(true);
    }
    for (;;)
    {
      this.diJ.a(paramInt1, paramInt2, "", this);
      return;
      x.e("MicroMsg.NetSceneSoterOpenTouchPay", "open fingerprintpay failed");
    }
  }
  
  public final int getType()
  {
    return 1638;
  }
  
  public final void pS(int paramInt)
  {
    x.i("MicroMsg.NetSceneSoterOpenTouchPay", "hy: onError: errType: %d, errcode: %d", new Object[] { Integer.valueOf(3), Integer.valueOf(paramInt) });
    if (this.diJ != null) {
      this.diJ.a(4, -1, "", this);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/fingerprint/c/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */