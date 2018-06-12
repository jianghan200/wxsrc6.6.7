package com.tencent.mm.plugin.game.model.a;

import android.database.Cursor;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class f
  extends i<c>
{
  public static final String[] diD = { i.a(c.dhO, "GameSilentDownload") };
  
  public f(e parame)
  {
    super(parame, c.dhO, "GameSilentDownload", null);
  }
  
  public final c DC(String paramString)
  {
    if (bi.oW(paramString))
    {
      x.i("MicroMsg.GameSilentDownloadStorage", "getDownloadInfo: appid is null");
      return null;
    }
    Cursor localCursor = rawQuery(String.format("select * from %s where %s=?", new Object[] { "GameSilentDownload", "appId" }), new String[] { paramString });
    if (localCursor == null)
    {
      x.i("MicroMsg.GameSilentDownloadStorage", "cursor is null");
      return null;
    }
    if (localCursor.moveToFirst())
    {
      paramString = new c();
      paramString.d(localCursor);
      localCursor.close();
      return paramString;
    }
    x.i("MicroMsg.GameSilentDownloadStorage", "getDownloadInfo appid:%s, no record in DB", new Object[] { paramString });
    localCursor.close();
    return null;
  }
  
  public final boolean DD(String paramString)
  {
    if (bi.oW(paramString)) {
      x.i("MicroMsg.GameSilentDownloadStorage", "updateWifiState: appid is null");
    }
    do
    {
      return false;
      paramString = DC(paramString);
    } while (paramString == null);
    paramString.field_noWifi = false;
    boolean bool = super.c(paramString, new String[0]);
    x.i("MicroMsg.GameSilentDownloadStorage", "updateWifiState, ret:%b", new Object[] { Boolean.valueOf(bool) });
    return bool;
  }
  
  public final boolean DE(String paramString)
  {
    if (bi.oW(paramString)) {
      x.i("MicroMsg.GameSilentDownloadStorage", "updateSdcardAvailableState: appid is null");
    }
    do
    {
      return false;
      paramString = DC(paramString);
    } while (paramString == null);
    paramString.field_noSdcard = false;
    boolean bool = super.c(paramString, new String[0]);
    x.i("MicroMsg.GameSilentDownloadStorage", "updateSdcardAvailableState, ret:%b", new Object[] { Boolean.valueOf(bool) });
    return bool;
  }
  
  public final boolean DF(String paramString)
  {
    if (bi.oW(paramString)) {
      x.i("MicroMsg.GameSilentDownloadStorage", "updateSdcardSpaceState: appid is null");
    }
    do
    {
      return false;
      paramString = DC(paramString);
    } while (paramString == null);
    paramString.field_noEnoughSpace = false;
    boolean bool = super.c(paramString, new String[0]);
    x.i("MicroMsg.GameSilentDownloadStorage", "updateSdcardSpaceState, ret:%b", new Object[] { Boolean.valueOf(bool) });
    return bool;
  }
  
  public final boolean DG(String paramString)
  {
    if (bi.oW(paramString)) {
      x.i("MicroMsg.GameSilentDownloadStorage", "updateBatteryState: appid is null");
    }
    do
    {
      return false;
      paramString = DC(paramString);
    } while (paramString == null);
    paramString.field_lowBattery = false;
    boolean bool = super.c(paramString, new String[0]);
    x.i("MicroMsg.GameSilentDownloadStorage", "updateBatteryState, ret:%b", new Object[] { Boolean.valueOf(bool) });
    return bool;
  }
  
  public final boolean DH(String paramString)
  {
    if (bi.oW(paramString)) {
      x.i("MicroMsg.GameSilentDownloadStorage", "updateDelayState: appid is null");
    }
    do
    {
      return false;
      paramString = DC(paramString);
    } while (paramString == null);
    paramString.field_continueDelay = false;
    boolean bool = super.c(paramString, new String[0]);
    x.i("MicroMsg.GameSilentDownloadStorage", "updateDelayState, ret:%b", new Object[] { Boolean.valueOf(bool) });
    return bool;
  }
  
  public final boolean E(String paramString, long paramLong)
  {
    if ((bi.oW(paramString)) || (paramLong < 0L))
    {
      x.i("MicroMsg.GameSilentDownloadStorage", "updateNextCheckTime: appid is null");
      return false;
    }
    boolean bool = fV("GameSilentDownload", String.format("update %s set %s=%s where %s='%s'", new Object[] { "GameSilentDownload", "nextCheckTime", String.valueOf(paramLong), "appId", paramString }));
    x.i("MicroMsg.GameSilentDownloadStorage", "updateNextCheckTime ret:%b", new Object[] { Boolean.valueOf(bool) });
    return bool;
  }
  
  public final boolean ay(String paramString, boolean paramBoolean)
  {
    if (bi.oW(paramString)) {
      x.i("MicroMsg.GameSilentDownloadStorage", "updateRunningState: appid is null");
    }
    do
    {
      return false;
      paramString = DC(paramString);
    } while (paramString == null);
    paramString.field_isRunning = paramBoolean;
    paramBoolean = super.c(paramString, new String[0]);
    x.i("MicroMsg.GameSilentDownloadStorage", "updateRunningState, ret:%b", new Object[] { Boolean.valueOf(paramBoolean) });
    return paramBoolean;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/game/model/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */