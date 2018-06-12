package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.mm.a.o;
import com.tencent.mm.ab.a;
import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.plugin.appbrand.app.e;
import com.tencent.mm.plugin.appbrand.launching.h;
import com.tencent.mm.protocal.c.aim;
import com.tencent.mm.protocal.c.ain;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.v.g;
import org.json.JSONObject;

public final class c
  extends a<ain>
{
  private final b diG;
  
  public c(String paramString1, String paramString2, String paramString3, int paramInt)
  {
    b.a locala = new b.a();
    locala.dIF = 1718;
    locala.uri = "/cgi-bin/mmbiz-bin/wxaapp/gettestcodedownloadinfo";
    aim localaim = new aim();
    localaim.bPS = paramString1;
    localaim.rLl = paramString2;
    localaim.rLm = paramString3;
    localaim.rnc = paramInt;
    if (paramInt == 1) {
      paramString1 = ((h)e.x(h.class)).aH(paramString1, paramInt);
    }
    try
    {
      localaim.rLn = new o(g.fU(paramString1).optLong("dev_key")).intValue();
      locala.dIG = localaim;
      locala.dIH = new ain();
      paramString1 = locala.KT();
      this.diG = paramString1;
      this.diG = paramString1;
      return;
    }
    catch (Exception paramString1)
    {
      for (;;)
      {
        x.e("MicroMsg.AppBrand.CgiGetTestCodeDownloadInfo", "opt devKey %s", new Object[] { paramString1 });
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/appcache/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */