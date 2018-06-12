package com.tencent.mm.plugin.aa.a.a;

import com.tencent.mm.ab.a;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.protocal.c.b;
import com.tencent.mm.protocal.c.c;
import com.tencent.mm.sdk.platformtools.x;

public final class d
  extends a<c>
{
  public d(String paramString1, String paramString2)
  {
    b.a locala = new b.a();
    b localb = new b();
    localb.qYc = paramString1;
    localb.qYd = paramString2;
    locala.dIG = localb;
    locala.dIH = new c();
    locala.uri = "/cgi-bin/mmpay-bin/newaaclosenotify";
    locala.dIF = 1672;
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
    x.i("MicroMsg.CgiCloseAAUrgeNotify", "CgiCloseAAUrgeNotify, billNo: %s, chatroom: %s", new Object[] { paramString1, paramString2 });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/aa/a/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */