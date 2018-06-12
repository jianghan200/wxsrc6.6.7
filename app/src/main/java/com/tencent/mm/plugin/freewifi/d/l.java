package com.tencent.mm.plugin.freewifi.d;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.protocal.c.bmc;
import com.tencent.mm.protocal.c.bmd;

public final class l
  extends c
{
  public l(String paramString1, int paramInt, String paramString2)
  {
    aOR();
    bmc localbmc = (bmc)this.diG.dID.dIL;
    localbmc.appId = paramString1;
    localbmc.jnQ = paramInt;
    localbmc.bLe = paramString2;
  }
  
  protected final void aOR()
  {
    b.a locala = new b.a();
    locala.dIG = new bmc();
    locala.dIH = new bmd();
    locala.uri = "/cgi-bin/mmo2o-bin/setpcloginuserInfo";
    locala.dIF = 1761;
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
  }
  
  public final int getType()
  {
    return 1761;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/freewifi/d/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */