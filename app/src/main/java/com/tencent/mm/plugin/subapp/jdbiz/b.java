package com.tencent.mm.plugin.subapp.jdbiz;

import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.pluginsdk.f.f.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import java.util.Map;

public final class b
  implements f.a
{
  public String bWW = "";
  public long eiD = 0L;
  public String iconUrl = "";
  public String jumpUrl = "";
  public String oqG = "";
  public String oqH = "";
  public boolean oqI = false;
  public boolean oqJ = false;
  public String oqK = "";
  public String oqL = "";
  public long oqM;
  public long oqN;
  public long oqO;
  public long oqP;
  public String oqQ = "";
  public String oqR = "";
  public String oqS = "";
  public String oqT = "";
  public long startTime;
  public String title = "";
  
  public static b bFY()
  {
    au.HU();
    String str = (String)c.DT().get(327942, "");
    b localb = new b();
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.JdMsgContent", " create xml : " + str);
    localb.MU(str);
    return localb;
  }
  
  public final void MU(String paramString)
  {
    this.oqG = "";
    this.oqH = "";
    this.eiD = 0L;
    this.oqK = "";
    this.oqI = false;
    this.oqJ = false;
    this.oqR = "";
    this.oqS = "";
    this.oqT = "";
    this.oqQ = "";
    this.jumpUrl = "";
    this.bWW = "";
    this.bWW = paramString;
    if (bi.oW(paramString)) {}
    do
    {
      return;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.JdMsgContent", "feed xml %s", new Object[] { paramString });
      paramString = bl.z(paramString, "sysmsg");
    } while (paramString == null);
    this.oqG = bi.aG((String)paramString.get(".sysmsg.biztype"), "");
    this.oqQ = bi.aG((String)paramString.get(".sysmsg.alert"), "");
    this.oqH = bi.aG((String)paramString.get(".sysmsg.activityid"), "");
    this.startTime = bi.WV((String)paramString.get(".sysmsg.starttime"));
    this.eiD = bi.WV((String)paramString.get(".sysmsg.expiretime"));
    this.title = bi.aG((String)paramString.get(".sysmsg.content.title"), "");
    this.iconUrl = bi.aG((String)paramString.get(".sysmsg.content.icon"), "");
    this.jumpUrl = bi.aG((String)paramString.get(".sysmsg.content.jumpurl"), "");
    this.oqM = bi.WV((String)paramString.get(".sysmsg.content.urlstarttime"));
    this.oqN = bi.WV((String)paramString.get(".sysmsg.content.urlexpiretime"));
    this.oqK = bi.aG((String)paramString.get(".sysmsg.content.jdcelltitle"), "");
    this.oqL = bi.aG((String)paramString.get(".sysmsg.content.jdcellicon"), "");
    this.oqO = bi.WV((String)paramString.get(".sysmsg.content.titlestarttime"));
    this.oqP = bi.WV((String)paramString.get(".sysmsg.content.titleexpiretime"));
    this.oqI = "1".equals(paramString.get(".sysmsg.content.findshowreddot"));
    this.oqJ = "1".equals(paramString.get(".sysmsg.content.jdcellshowred"));
    this.oqR = bi.aG((String)paramString.get(".sysmsg.content.alertviewtitle"), "");
    this.oqS = bi.aG((String)paramString.get(".sysmsg.content.alertviewconfirm"), "");
    this.oqT = bi.aG((String)paramString.get(".sysmsg.content.alertviewcancel"), "");
  }
  
  public final boolean a(b paramb)
  {
    if (paramb == null) {}
    while (!bi.aG(this.oqH, "").equals(bi.aG(paramb.oqH, ""))) {
      return true;
    }
    return false;
  }
  
  public final boolean aiS()
  {
    return this.startTime < System.currentTimeMillis() / 1000L;
  }
  
  public final boolean bFZ()
  {
    return (this.eiD != 0L) && (this.eiD < System.currentTimeMillis() / 1000L);
  }
  
  public final String bGa()
  {
    return bi.aG(this.bWW, "");
  }
  
  public final String bGb()
  {
    return this.oqH;
  }
  
  public final String bGc()
  {
    return this.oqK;
  }
  
  public final boolean bGd()
  {
    return this.oqJ;
  }
  
  public final String bGe()
  {
    return this.oqG;
  }
  
  public final String bGf()
  {
    return this.jumpUrl;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/subapp/jdbiz/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */