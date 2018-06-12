package com.tencent.mm.plugin.aa.a.a;

import com.tencent.mm.ab.a;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.protocal.c.r;
import com.tencent.mm.protocal.c.s;
import com.tencent.mm.sdk.platformtools.x;

public final class b
  extends a<s>
{
  public b(String paramString1, String paramString2, int paramInt)
  {
    b.a locala = new b.a();
    r localr = new r();
    localr.qYc = paramString1;
    localr.qYd = paramString2;
    localr.scene = paramInt;
    locala.dIG = localr;
    locala.dIH = new s();
    locala.uri = "/cgi-bin/mmpay-bin/newaapayurge";
    locala.dIF = 1644;
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
    x.i("MicroMsg.CgiAAPayUrge", "CgiAAPayUrge, billNo: %s, chatroom: %s, scene: %s", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt) });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/aa/a/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */