package com.tencent.mm.plugin.wallet.balance.a.a;

import com.tencent.mm.ab.a;
import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.protocal.c.bdl;
import com.tencent.mm.protocal.c.bdm;

public final class f
  extends a<bdm>
{
  public f(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bdl();
    ((b.a)localObject).dIH = new bdm();
    ((b.a)localObject).dIF = 1283;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/qrypurchaseresult";
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    localObject = ((b.a)localObject).KT();
    bdl localbdl = (bdl)((b)localObject).dID.dIL;
    localbdl.sfu = paramString1;
    localbdl.myq = paramString2;
    localbdl.seL = paramInt1;
    localbdl.rtK = paramInt2;
    this.diG = ((b)localObject);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/wallet/balance/a/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */