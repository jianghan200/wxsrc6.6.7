package com.tencent.mm.plugin.wallet.balance.a.a;

import com.tencent.mm.ab.a;
import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.protocal.c.bdn;
import com.tencent.mm.protocal.c.bdo;

public final class g
  extends a<bdo>
{
  private b eAN;
  private bdn oYF = null;
  
  public g()
  {
    b.a locala = new b.a();
    locala.dIG = new bdn();
    locala.dIH = new bdo();
    locala.dIF = 1211;
    locala.uri = "/cgi-bin/mmpay-bin/qryusrfunddetail";
    locala.dII = 0;
    locala.dIJ = 0;
    this.eAN = locala.KT();
    this.oYF = ((bdn)this.eAN.dID.dIL);
    this.oYF.time_stamp = ((int)System.currentTimeMillis());
    this.diG = locala.KT();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/wallet/balance/a/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */