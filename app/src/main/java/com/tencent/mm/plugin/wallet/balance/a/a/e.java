package com.tencent.mm.plugin.wallet.balance.a.a;

import com.tencent.mm.ab.a;
import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.protocal.c.bco;
import com.tencent.mm.protocal.c.bcp;
import com.tencent.mm.wallet_core.c.d;

public final class e
  extends a<bcp>
  implements d
{
  public e(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bco();
    ((b.a)localObject).dIH = new bcp();
    ((b.a)localObject).dIF = 1276;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/purchasefund";
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    localObject = ((b.a)localObject).KT();
    bco localbco = (bco)((b)localObject).dID.dIL;
    localbco.seK = paramString1;
    localbco.seL = paramInt1;
    localbco.rtK = paramInt2;
    localbco.seM = paramString2;
    this.diG = ((b)localObject);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/wallet/balance/a/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */