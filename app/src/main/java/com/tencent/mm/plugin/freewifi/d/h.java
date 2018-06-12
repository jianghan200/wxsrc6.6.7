package com.tencent.mm.plugin.freewifi.d;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.protocal.c.agi;
import com.tencent.mm.protocal.c.agj;
import com.tencent.mm.protocal.c.xq;

public final class h
  extends c
{
  public h(String paramString1, int paramInt, String paramString2)
  {
    aOR();
    agi localagi = (agi)this.diG.dID.dIL;
    localagi.appId = paramString1;
    localagi.jnQ = paramInt;
    localagi.bLe = paramString2;
  }
  
  protected final void aOR()
  {
    b.a locala = new b.a();
    locala.dIG = new agi();
    locala.dIH = new agj();
    locala.uri = "/cgi-bin/mmo2o-bin/getpcfrontpage";
    locala.dIF = 1760;
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
  }
  
  public final xq aOV()
  {
    agj localagj = (agj)this.diG.dIE.dIL;
    if (localagj != null) {
      return localagj.qZq;
    }
    return null;
  }
  
  public final int getType()
  {
    return 1760;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/freewifi/d/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */