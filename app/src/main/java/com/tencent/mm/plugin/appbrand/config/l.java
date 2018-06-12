package com.tencent.mm.plugin.appbrand.config;

import com.tencent.mm.ab.a;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.plugin.appbrand.app.e;
import com.tencent.mm.protocal.c.cgx;
import com.tencent.mm.protocal.c.cgz;
import com.tencent.mm.sdk.platformtools.bi;

public final class l
  extends a<cgz>
{
  final com.tencent.mm.ab.b diG;
  
  public l(String paramString1, String paramString2)
  {
    b.a locala = new b.a();
    cgx localcgx = new cgx();
    localcgx.spJ = paramString1;
    if (bi.oW(paramString1))
    {
      paramString1 = e.aba().f(paramString2, new String[] { "syncVersion" });
      if (paramString1 == null) {
        paramString1 = "";
      }
    }
    for (paramString1 = new com.tencent.mm.bk.b(paramString1.getBytes());; paramString1 = r.sd(paramString1))
    {
      localcgx.riB = paramString1;
      localcgx.sBg = paramString2;
      locala.dIG = localcgx;
      locala.dIH = new cgz();
      locala.dIF = 1151;
      locala.uri = "/cgi-bin/mmbiz-bin/wxaattr/wxaattrsync";
      paramString1 = locala.KT();
      this.diG = paramString1;
      this.diG = paramString1;
      return;
      paramString1 = bi.oV(paramString1.field_syncVersion);
      break;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/config/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */