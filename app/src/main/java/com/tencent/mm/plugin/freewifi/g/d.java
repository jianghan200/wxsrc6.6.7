package com.tencent.mm.plugin.freewifi.g;

import android.database.Cursor;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.ac;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class d
  extends i<c>
{
  public static final String[] diD = { i.a(c.dhO, "FreeWifiInfo"), "CREATE INDEX IF NOT EXISTS freewifi_md5_ssid  on FreeWifiInfo  (  ssidmd5 )" };
  
  public d(e parame)
  {
    super(parame, c.dhO, "FreeWifiInfo", null);
  }
  
  public final c Cf(String paramString)
  {
    if (bi.oW(paramString))
    {
      x.e("MicroMsg.FreeWifi.FreeWifiInfoStorage", "ssid is null");
      return null;
    }
    paramString = "select * from FreeWifiInfo where ssidmd5 = '" + ac.ce(paramString) + "' and wifiType = 1";
    x.d("MicroMsg.FreeWifi.FreeWifiInfoStorage", "getFreeWifiInfoBySSID, sql : %s", new Object[] { paramString });
    paramString = rawQuery(paramString, new String[0]);
    if (paramString == null)
    {
      x.e("MicroMsg.FreeWifi.FreeWifiInfoStorage", "cursor is null");
      return null;
    }
    if (paramString.moveToFirst())
    {
      c localc = new c();
      localc.d(paramString);
      paramString.close();
      return localc;
    }
    paramString.close();
    return null;
  }
  
  public final c Cg(String paramString)
  {
    if (bi.oW(paramString))
    {
      x.e("MicroMsg.FreeWifi.FreeWifiInfoStorage", "ssid is null");
      return null;
    }
    paramString = "select * from FreeWifiInfo where ssidmd5 = '" + ac.ce(paramString) + "'";
    x.d("MicroMsg.FreeWifi.FreeWifiInfoStorage", "getFreeWifiInfoBySSID, sql : %s", new Object[] { paramString });
    paramString = rawQuery(paramString, new String[0]);
    if (paramString == null)
    {
      x.e("MicroMsg.FreeWifi.FreeWifiInfoStorage", "cursor is null");
      return null;
    }
    if (paramString.moveToFirst())
    {
      c localc = new c();
      localc.d(paramString);
      paramString.close();
      return localc;
    }
    paramString.close();
    return null;
  }
  
  public final void Ch(String paramString)
  {
    paramString = "update FreeWifiInfo set connectState = -1 where ssidmd5 !='" + ac.ce(paramString) + "'";
    x.d("MicroMsg.FreeWifi.FreeWifiInfoStorage", "updateOtherAp : %s", new Object[] { paramString });
    x.d("MicroMsg.FreeWifi.FreeWifiInfoStorage", "update other ap  ret = %b", new Object[] { Boolean.valueOf(fV("FreeWifiInfo", paramString)) });
  }
  
  public final c aPn()
  {
    x.d("MicroMsg.FreeWifi.FreeWifiInfoStorage", "getLastConnectSuccessWifiInfo, sql : %s", new Object[] { "select * from FreeWifiInfo where connectState = 2" });
    Cursor localCursor = rawQuery("select * from FreeWifiInfo where connectState = 2", new String[0]);
    if (localCursor == null)
    {
      x.e("MicroMsg.FreeWifi.FreeWifiInfoStorage", "no connected sucess wifi info");
      return null;
    }
    if (localCursor.moveToFirst())
    {
      c localc = new c();
      localc.d(localCursor);
      localCursor.close();
      return localc;
    }
    localCursor.close();
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/freewifi/g/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */