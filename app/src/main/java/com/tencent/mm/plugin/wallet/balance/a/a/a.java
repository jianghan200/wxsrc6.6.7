package com.tencent.mm.plugin.wallet.balance.a.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.protocal.c.pj;
import com.tencent.mm.protocal.c.pk;

public final class a
  extends com.tencent.mm.ab.a<pk>
{
  public a(String paramString, int paramInt)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new pj();
    ((b.a)localObject).dIH = new pk();
    ((b.a)localObject).dIF = 1386;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/closefundaccount";
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    localObject = ((b.a)localObject).KT();
    pj localpj = (pj)((b)localObject).dID.dIL;
    localpj.rtJ = paramString;
    localpj.rtK = paramInt;
    this.diG = ((b)localObject);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/wallet/balance/a/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */