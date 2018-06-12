package com.tencent.mm.plugin.freewifi.c;

import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Map;

public final class a
{
  public String bssid;
  public String jju;
  public String jjv;
  public long jjw;
  public String jjx;
  public long jjy;
  public String ssid;
  public String type;
  public long uin;
  
  public static a BW(String paramString)
  {
    x.i("MicroMsg.FreeWifi.FreeWifiSchemaMsg", "It starts to parse msgContent for FreeWifiSchemaMsg. msgContent=%s", new Object[] { paramString });
    if (m.isEmpty(paramString))
    {
      x.e("MicroMsg.FreeWifi.FreeWifiSchemaMsg", "msgCoentent is empty. return.");
      return null;
    }
    x.i("MicroMsg.FreeWifi.FreeWifiSchemaMsg", "Shorten msgContent into one line. msgContent=%s", new Object[] { paramString });
    paramString = bl.z(paramString, "sysmsg");
    if ((paramString == null) || (paramString.size() == 0))
    {
      x.e("MicroMsg.FreeWifi.FreeWifiSchemaMsg", "Parsing xml failed");
      return null;
    }
    x.i("MicroMsg.FreeWifi.FreeWifiSchemaMsg", "Parsed values = " + paramString.toString());
    if (!"freewifi".equalsIgnoreCase((String)paramString.get(".sysmsg.$type")))
    {
      x.e("MicroMsg.FreeWifi.FreeWifiSchemaMsg", "sysmsg type is not freewifi. return.");
      return null;
    }
    a locala = new a();
    locala.type = ((String)paramString.get(".sysmsg.type"));
    x.i("MicroMsg.FreeWifi.FreeWifiSchemaMsg", "schemaMsg.type=" + locala.type);
    if (!"schemamsg".equals(locala.type))
    {
      x.e("MicroMsg.FreeWifi.FreeWifiSchemaMsg", "schemaMsg.type is not schemamsg. return.");
      return null;
    }
    boolean bool = m.l(paramString, "MicroMsg.FreeWifi.FreeWifiSchemaMsg");
    x.i("MicroMsg.FreeWifi.FreeWifiSchemaMsg", "checkMsgPushedVersion=" + bool);
    if (!bool)
    {
      x.e("MicroMsg.FreeWifi.FreeWifiSchemaMsg", "version not matched. return.");
      return null;
    }
    locala.uin = bi.getLong((String)paramString.get(".sysmsg.uin"), 0L);
    x.i("MicroMsg.FreeWifi.FreeWifiSchemaMsg", "schemaMsg.uin=" + locala.uin);
    locala.ssid = ((String)paramString.get(".sysmsg.schemamsg.ssid"));
    x.i("MicroMsg.FreeWifi.FreeWifiSchemaMsg", "schemaMsg.ssid=" + locala.ssid);
    if (m.isEmpty(locala.ssid))
    {
      x.e("MicroMsg.FreeWifi.FreeWifiSchemaMsg", "scemaMsg.ssid is empty. return.");
      return null;
    }
    locala.bssid = m.BR((String)paramString.get(".sysmsg.schemamsg.bssid"));
    x.i("MicroMsg.FreeWifi.FreeWifiSchemaMsg", "schemaMsg.bssid=" + locala.bssid);
    locala.jju = ((String)paramString.get(".sysmsg.schemamsg.mobilemac"));
    x.i("MicroMsg.FreeWifi.FreeWifiSchemaMsg", "schemaMsg.mobilemac=" + locala.jju);
    if (m.isEmpty(locala.jju))
    {
      x.e("MicroMsg.FreeWifi.FreeWifiSchemaMsg", "scemaMsg.mobilemac is empty. return.");
      return null;
    }
    locala.jjv = ((String)paramString.get(".sysmsg.schemamsg.mpappid"));
    x.i("MicroMsg.FreeWifi.FreeWifiSchemaMsg", "schemaMsg.mpappid=" + locala.jjv);
    locala.jjw = bi.getLong((String)paramString.get(".sysmsg.schemamsg.mpshopid"), 0L);
    x.i("MicroMsg.FreeWifi.FreeWifiSchemaMsg", "schemaMsg.mpshopid=" + locala.jjw);
    locala.jjx = ((String)paramString.get(".sysmsg.schemamsg.schemaurl"));
    x.i("MicroMsg.FreeWifi.FreeWifiSchemaMsg", "schemaMsg.schemaurl=" + locala.jjx);
    if (m.isEmpty(locala.jjx))
    {
      x.e("MicroMsg.FreeWifi.FreeWifiSchemaMsg", "scemaMsg.schemaurl is empty. return.");
      return null;
    }
    locala.jjy = bi.getLong((String)paramString.get(".sysmsg.schemamsg.expiredseconds"), 0L);
    x.i("MicroMsg.FreeWifi.FreeWifiSchemaMsg", "schema.expiredseconds=" + locala.jjy);
    return locala;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/freewifi/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */