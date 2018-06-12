package com.tencent.mm.plugin.freewifi.d;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.protocal.c.nz;
import com.tencent.mm.protocal.c.oa;

public final class d
  extends c
{
  public d(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, long paramLong, String paramString6, String paramString7)
  {
    aOR();
    nz localnz = (nz)this.diG.dID.dIL;
    localnz.rsb = paramString1;
    localnz.rsc = paramString2;
    localnz.rsd = paramString3;
    localnz.rse = paramString4;
    localnz.rsf = paramString5;
    localnz.rsg = paramLong;
    localnz.rsh = paramString6;
    localnz.rsi = paramString7;
  }
  
  protected final void aOR()
  {
    b.a locala = new b.a();
    locala.dIG = new nz();
    locala.dIH = new oa();
    locala.uri = "/cgi-bin/mmo2o-bin/checkifcallup";
    locala.dIF = 1155;
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
  }
  
  public final oa aOZ()
  {
    return (oa)this.diG.dIE.dIL;
  }
  
  public final int getType()
  {
    return 1155;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/freewifi/d/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */