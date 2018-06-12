package com.tencent.mm.plugin.wallet.balance.a.a;

import com.tencent.mm.ab.a;
import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.protocal.c.bbk;
import com.tencent.mm.protocal.c.bbl;
import com.tencent.mm.protocal.c.fe;

public final class d
  extends a<bbl>
{
  public d(int paramInt1, fe paramfe, int paramInt2)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bbk();
    ((b.a)localObject).dIH = new bbl();
    ((b.a)localObject).dIF = 1324;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/preredeemfund";
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    localObject = ((b.a)localObject).KT();
    bbk localbbk = (bbk)((b)localObject).dID.dIL;
    localbbk.sdC = paramInt1;
    if (paramfe != null) {
      localbbk.sdD = 1;
    }
    for (localbbk.sdE = paramfe;; localbbk.sdE = null)
    {
      localbbk.rtK = paramInt2;
      this.diG = ((b)localObject);
      return;
      localbbk.sdD = 0;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/wallet/balance/a/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */