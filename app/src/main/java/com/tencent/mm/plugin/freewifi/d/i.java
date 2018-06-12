package com.tencent.mm.plugin.freewifi.d;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.protocal.c.agm;
import com.tencent.mm.protocal.c.agn;

public final class i
  extends c
{
  public i(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    aOR();
    agm localagm = (agm)this.diG.dID.dIL;
    localagm.bIQ = paramString1;
    localagm.jjP = paramString2;
    localagm.jjQ = paramString3;
    localagm.jjR = paramString4;
    localagm.bLe = paramString5;
    localagm.qZf = paramString6;
  }
  
  protected final void aOR()
  {
    b.a locala = new b.a();
    locala.dIG = new agm();
    locala.dIH = new agn();
    locala.uri = "/cgi-bin/mmo2o-bin/getportalapinfo";
    locala.dIF = 1709;
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
  }
  
  public final String aPc()
  {
    return ((agn)this.diG.dIE.dIL).jkX;
  }
  
  public final String aPd()
  {
    return ((agn)this.diG.dIE.dIL).jkY;
  }
  
  public final int getType()
  {
    return 1709;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/freewifi/d/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */