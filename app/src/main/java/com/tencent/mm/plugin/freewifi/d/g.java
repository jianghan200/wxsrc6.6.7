package com.tencent.mm.plugin.freewifi.d;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.protocal.c.aen;
import com.tencent.mm.protocal.c.aeo;

public final class g
  extends c
{
  public g(String paramString1, String paramString2, String paramString3)
  {
    aOR();
    aen localaen = (aen)this.diG.dID.dIL;
    localaen.jjP = paramString1;
    localaen.jjQ = paramString2;
    localaen.jjR = paramString3;
    localaen.qZw = m.aOi();
  }
  
  protected final void aOR()
  {
    b.a locala = new b.a();
    locala.dIG = new aen();
    locala.dIH = new aeo();
    locala.uri = "/cgi-bin/mmo2o-bin/getprotocol31schemaurl";
    locala.dIF = 1746;
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
  }
  
  public final String aPb()
  {
    return ((aeo)this.diG.dIE.dIL).rIC;
  }
  
  public final int getType()
  {
    return 1746;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/freewifi/d/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */