package com.tencent.mm.plugin.appbrand.appusage;

import com.tencent.mm.ab.a;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.protocal.c.akt;
import com.tencent.mm.protocal.c.aku;

class r
  extends a<aku>
{
  r(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    b.a locala = new b.a();
    akt localakt = new akt();
    localakt.aAk = paramInt1;
    localakt.condition = paramInt2;
    localakt.rNG = paramInt3;
    localakt.rNH = paramInt4;
    locala.dIG = localakt;
    locala.dIH = new aku();
    locala.uri = "/cgi-bin/mmbiz-bin/wxaapp/getwxausagerecord";
    locala.dIF = 1148;
    this.diG = locala.KT();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/appusage/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */