package com.tencent.mm.plugin.chatroom.d;

import com.tencent.mm.ab.a;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.protocal.c.abw;
import com.tencent.mm.protocal.c.abx;

public final class c
  extends a<abx>
{
  public c(String paramString)
  {
    b.a locala = new b.a();
    abw localabw = new abw();
    localabw.rvj = paramString;
    locala.dIG = localabw;
    locala.dIH = new abx();
    locala.uri = "/cgi-bin/micromsg-bin/getchatroominfodetail";
    locala.dIF = 223;
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/chatroom/d/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */