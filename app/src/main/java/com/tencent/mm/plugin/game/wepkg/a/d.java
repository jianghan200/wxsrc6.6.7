package com.tencent.mm.plugin.game.wepkg.a;

import android.database.Cursor;
import com.tencent.mm.bt.h;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.game.wepkg.model.WepkgVersion;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.List;

public class d
  extends i<c>
{
  public static final String[] diD = { i.a(c.dzU, "WepkgVersion") };
  private static volatile d kdU = null;
  private final h dCZ;
  public final boolean fAQ;
  
  private d(h paramh)
  {
    super(paramh, c.dzU, "WepkgVersion", c.ciG);
    this.dCZ = paramh;
    if (paramh != null) {}
    for (boolean bool = true;; bool = false)
    {
      this.fAQ = bool;
      if (!this.fAQ) {
        x.e("MicroMsg.Wepkg.WepkgVersionStorage", "storage can not work!!!");
      }
      return;
    }
  }
  
  public static d aVo()
  {
    if (!g.Eg().Dx()) {
      return new d(null);
    }
    if (kdU == null) {}
    try
    {
      if ((kdU == null) || (!kdU.fAQ)) {
        kdU = new d(g.Ei().dqq);
      }
      return kdU;
    }
    finally {}
  }
  
  public final boolean DU(String paramString)
  {
    if ((!this.fAQ) || (bi.oW(paramString))) {
      return false;
    }
    c localc = new c();
    localc.field_pkgId = paramString;
    boolean bool = super.a(localc, new String[0]);
    x.i("MicroMsg.Wepkg.WepkgVersionStorage", "deleteRecordByPkgid pkgid:%s, ret:%s", new Object[] { paramString, Boolean.valueOf(bool) });
    return bool;
  }
  
  public final c DV(String paramString)
  {
    if ((!this.fAQ) || (bi.oW(paramString))) {
      return null;
    }
    Cursor localCursor = rawQuery(String.format("select * from %s where %s=?", new Object[] { "WepkgVersion", "pkgId" }), new String[] { paramString });
    if (localCursor.moveToFirst())
    {
      paramString = new c();
      paramString.d(localCursor);
      localCursor.close();
      x.i("MicroMsg.Wepkg.WepkgVersionStorage", "getRecordByPkgid exist record in DB, pkgid:%s, version:%s", new Object[] { paramString.field_pkgId, paramString.field_version });
      return paramString;
    }
    x.i("MicroMsg.Wepkg.WepkgVersionStorage", "getRecordByPkgid pkgid:%s, no record in DB", new Object[] { paramString });
    localCursor.close();
    return null;
  }
  
  public final c DW(String paramString)
  {
    if ((!this.fAQ) || (bi.oW(paramString))) {
      return null;
    }
    Cursor localCursor = rawQuery(String.format("select * from %s where %s=? and %s=0", new Object[] { "WepkgVersion", "pkgId", "disable" }), new String[] { paramString });
    if (localCursor.moveToFirst())
    {
      paramString = new c();
      paramString.d(localCursor);
      localCursor.close();
      x.i("MicroMsg.Wepkg.WepkgVersionStorage", "getRecordByPkgidWithAble exist record in DB, pkgid:%s, version:%s, disableWvCache:%s, clearPkgTime:%s, checkIntervalTime:%s, domain:%s, bigPackageReady:%s, preloadFilesReady:%s, preloadFilesAtomic:%s, disable:%s", new Object[] { paramString.field_pkgId, paramString.field_version, Boolean.valueOf(paramString.field_disableWvCache), Long.valueOf(paramString.field_clearPkgTime), Long.valueOf(paramString.field_checkIntervalTime), paramString.field_domain, Boolean.valueOf(paramString.field_bigPackageReady), Boolean.valueOf(paramString.field_preloadFilesReady), Boolean.valueOf(paramString.field_preloadFilesAtomic), Boolean.valueOf(paramString.field_disable) });
      paramString.field_accessTime = com.tencent.mm.plugin.game.wepkg.utils.d.aow();
      super.c(paramString, new String[0]);
      return paramString;
    }
    x.i("MicroMsg.Wepkg.WepkgVersionStorage", "getRecordByPkgidWithAble pkgid:%s, no record in DB", new Object[] { paramString });
    localCursor.close();
    return null;
  }
  
  public final boolean DX(String paramString)
  {
    if (!this.fAQ) {}
    c localc;
    do
    {
      return false;
      localc = DV(paramString);
    } while (localc == null);
    localc.field_nextCheckTime = (com.tencent.mm.plugin.game.wepkg.utils.d.aow() + localc.field_checkIntervalTime);
    boolean bool = super.c(localc, new String[0]);
    x.i("MicroMsg.Wepkg.WepkgVersionStorage", "updateCheckTime pkgid:%s, ret:%s", new Object[] { paramString, Boolean.valueOf(bool) });
    return bool;
  }
  
  public final boolean DY(String paramString)
  {
    if ((!this.fAQ) || (bi.oW(paramString))) {
      return false;
    }
    x.i("MicroMsg.Wepkg.WepkgVersionStorage", "WepkgVersionRecord addAutoDownloadCount ret:%s", new Object[] { Boolean.valueOf(fV("WepkgVersion", String.format("update %s set %s=%s+1 where %s='%s'", new Object[] { "WepkgVersion", "autoDownloadCount", "autoDownloadCount", "pkgId", paramString }))) });
    return true;
  }
  
  public final boolean DZ(String paramString)
  {
    boolean bool = true;
    if ((!this.fAQ) || (bi.oW(paramString))) {
      bool = false;
    }
    c localc;
    do
    {
      return bool;
      localc = DV(paramString);
    } while (localc == null);
    localc.field_disable = true;
    bool = super.c(localc, new String[0]);
    x.i("MicroMsg.Wepkg.WepkgVersionStorage", "setWepkgDisable pkgid:%s, ret:%s", new Object[] { paramString, Boolean.valueOf(bool) });
    return bool;
  }
  
  public final boolean Ea(String paramString)
  {
    if ((!this.fAQ) || (bi.oW(paramString))) {}
    c localc;
    do
    {
      return false;
      localc = DV(paramString);
    } while (localc == null);
    localc.field_createTime = 0L;
    boolean bool = super.c(localc, new String[0]);
    x.i("MicroMsg.Wepkg.WepkgVersionStorage", "updateCreateTimeToZero pkgid:%s, ret:%s", new Object[] { paramString, Boolean.valueOf(bool) });
    return bool;
  }
  
  public final boolean a(String paramString, boolean paramBoolean, long paramLong1, long paramLong2)
  {
    if (!this.fAQ) {}
    c localc;
    do
    {
      return false;
      localc = DV(paramString);
    } while (localc == null);
    localc.field_disableWvCache = paramBoolean;
    localc.field_clearPkgTime = paramLong1;
    localc.field_nextCheckTime = (localc.field_nextCheckTime - localc.field_checkIntervalTime + paramLong2);
    localc.field_checkIntervalTime = paramLong2;
    localc.field_disable = false;
    boolean bool = super.c(localc, new String[0]);
    x.i("MicroMsg.Wepkg.WepkgVersionStorage", "updateConfigInfo pkgid:%s, disableWvCache:%s, clearPkgTime:%s, checkIntervalTime:%s, ret:%s", new Object[] { paramString, Boolean.valueOf(paramBoolean), Long.valueOf(paramLong1), Long.valueOf(paramLong2), Boolean.valueOf(bool) });
    return bool;
  }
  
  public final boolean aA(String paramString, boolean paramBoolean)
  {
    if ((!this.fAQ) || (bi.oW(paramString))) {}
    c localc;
    do
    {
      return false;
      localc = DV(paramString);
    } while (localc == null);
    localc.field_preloadFilesReady = paramBoolean;
    boolean bool = super.c(localc, new String[0]);
    x.i("MicroMsg.Wepkg.WepkgVersionStorage", "updatePreloadFilesReady pkgid:%s, preloadFilesReady:%b, ret:%s", new Object[] { paramString, Boolean.valueOf(paramBoolean), Boolean.valueOf(bool) });
    return bool;
  }
  
  public final List<WepkgVersion> aVp()
  {
    if (!this.fAQ) {
      return null;
    }
    Object localObject = String.format("select * from %s where %s < ? - %s", new Object[] { "WepkgVersion", "accessTime", "clearPkgTime" });
    Cursor localCursor = rawQuery((String)localObject, new String[] { String.valueOf(com.tencent.mm.plugin.game.wepkg.utils.d.aow()) });
    x.i("MicroMsg.Wepkg.WepkgVersionStorage", "getNeedCleanRecords queryStr:%s", new Object[] { localObject });
    if (localCursor == null)
    {
      x.i("MicroMsg.Wepkg.WepkgVersionStorage", "cursor is null");
      return null;
    }
    if (localCursor.moveToFirst())
    {
      localObject = new ArrayList();
      do
      {
        WepkgVersion localWepkgVersion = new WepkgVersion();
        c localc = new c();
        localc.d(localCursor);
        localWepkgVersion.a(localc);
        ((List)localObject).add(localWepkgVersion);
      } while (localCursor.moveToNext());
      localCursor.close();
      x.i("MicroMsg.Wepkg.WepkgVersionStorage", "record list size:%s", new Object[] { Integer.valueOf(((List)localObject).size()) });
      return (List<WepkgVersion>)localObject;
    }
    localCursor.close();
    x.i("MicroMsg.Wepkg.WepkgVersionStorage", "no record");
    return null;
  }
  
  public final boolean k(String paramString1, String paramString2, boolean paramBoolean)
  {
    if ((!this.fAQ) || (bi.oW(paramString1))) {}
    c localc;
    do
    {
      return false;
      localc = DV(paramString1);
    } while (localc == null);
    localc.field_bigPackageReady = paramBoolean;
    localc.field_pkgPath = paramString2;
    boolean bool = super.c(localc, new String[0]);
    x.i("MicroMsg.Wepkg.WepkgVersionStorage", "updateBigPackageReady pkgid:%s, pkgPath:%s, bigPackageReady:%b, ret:%s", new Object[] { paramString1, paramString2, Boolean.valueOf(paramBoolean), Boolean.valueOf(bool) });
    return bool;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/game/wepkg/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */