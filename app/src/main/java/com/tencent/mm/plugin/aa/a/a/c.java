package com.tencent.mm.plugin.aa.a.a;

import com.tencent.mm.ab.a;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.protocal.c.w;

public final class c
  extends a<com.tencent.mm.protocal.c.x>
{
  public c(int paramInt1, int paramInt2, int paramInt3)
  {
    b.a locala = new b.a();
    w localw = new w();
    localw.limit = paramInt1;
    localw.offset = paramInt2;
    localw.type = paramInt3;
    locala.dIG = localw;
    locala.dIH = new com.tencent.mm.protocal.c.x();
    locala.uri = "/cgi-bin/mmpay-bin/newaaquerylist";
    locala.dIF = 1676;
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CgiAAQueryList", "CgiAAQueryList, limit: %s, offset: %s, type: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
  }
  
  public c(int paramInt1, int paramInt2, int paramInt3, String paramString1, int paramInt4, int paramInt5, String paramString2)
  {
    b.a locala = new b.a();
    w localw = new w();
    localw.limit = paramInt1;
    localw.offset = paramInt2;
    localw.type = paramInt3;
    localw.qYQ = paramString1;
    localw.qYR = paramInt4;
    localw.qYS = paramInt5;
    localw.qYT = paramString2;
    locala.dIG = localw;
    locala.dIH = new com.tencent.mm.protocal.c.x();
    locala.uri = "/cgi-bin/mmpay-bin/newaaquerylist";
    locala.dIF = 1676;
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CgiAAQueryList", "CgiAAQueryList, limit: %s, offset: %s, type: %s, bill_id: %s, trans_id: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString1, paramString2 });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/aa/a/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */