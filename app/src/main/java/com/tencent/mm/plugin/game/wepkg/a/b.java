package com.tencent.mm.plugin.game.wepkg.a;

import android.database.Cursor;
import com.tencent.mm.bt.h;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.game.wepkg.model.WepkgPreloadFile;
import com.tencent.mm.plugin.game.wepkg.utils.d;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.List;

public class b
  extends i<a>
{
  public static final String[] diD = { i.a(a.dzU, "WepkgPreloadFiles") };
  private static volatile b kdT = null;
  private final h dCZ;
  public final boolean fAQ;
  
  private b(h paramh)
  {
    super(paramh, a.dzU, "WepkgPreloadFiles", a.ciG);
    this.dCZ = paramh;
    if (paramh != null) {}
    for (boolean bool = true;; bool = false)
    {
      this.fAQ = bool;
      if (!this.fAQ) {
        x.e("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "storage can not work!!!");
      }
      return;
    }
  }
  
  public static b aVn()
  {
    if (!g.Eg().Dx()) {
      return new b(null);
    }
    if (kdT == null) {}
    try
    {
      if ((kdT == null) || (!kdT.fAQ)) {
        kdT = new b(g.Ei().dqq);
      }
      return kdT;
    }
    finally {}
  }
  
  public final List<WepkgPreloadFile> DT(String paramString)
  {
    if ((!this.fAQ) || (bi.oW(paramString))) {
      return null;
    }
    Object localObject = String.format("select * from %s where %s=?", new Object[] { "WepkgPreloadFiles", "pkgId" });
    paramString = rawQuery((String)localObject, new String[] { paramString });
    x.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "getPreLoadFileList queryStr:%s", new Object[] { localObject });
    if (paramString == null)
    {
      x.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "cursor is null");
      return null;
    }
    if (paramString.moveToFirst())
    {
      localObject = new ArrayList();
      do
      {
        WepkgPreloadFile localWepkgPreloadFile = new WepkgPreloadFile();
        a locala = new a();
        locala.d(paramString);
        localWepkgPreloadFile.a(locala);
        ((List)localObject).add(localWepkgPreloadFile);
      } while (paramString.moveToNext());
      paramString.close();
      x.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "record list size:%s", new Object[] { Integer.valueOf(((List)localObject).size()) });
      return (List<WepkgPreloadFile>)localObject;
    }
    paramString.close();
    x.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "no record");
    return null;
  }
  
  public final boolean DU(String paramString)
  {
    if ((!this.fAQ) || (bi.oW(paramString))) {
      return false;
    }
    a locala = new a();
    locala.field_pkgId = paramString;
    boolean bool = super.a(locala, new String[] { "pkgId" });
    x.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "deleteRecordByPkgid pkgid:%s, ret:%s", new Object[] { paramString, Boolean.valueOf(bool) });
    return bool;
  }
  
  public final boolean d(String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    if ((!this.fAQ) || (bi.oW(paramString1)) || (bi.oW(paramString2))) {}
    a locala;
    do
    {
      return false;
      locala = de(paramString1, paramString2);
    } while (locala == null);
    locala.field_completeDownload = paramBoolean;
    locala.field_filePath = paramString3;
    boolean bool = super.c(locala, new String[0]);
    x.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "updateDownloadCompleteState pkgid:%s, rid:%s, completeDownload:%s, filePath:%s, ret:%s", new Object[] { paramString1, paramString2, Boolean.valueOf(paramBoolean), paramString3, Boolean.valueOf(bool) });
    return bool;
  }
  
  public final a de(String paramString1, String paramString2)
  {
    if ((!this.fAQ) || (bi.oW(paramString1)) || (bi.oW(paramString2))) {
      return null;
    }
    Object localObject = d.di(paramString1, paramString2);
    localObject = rawQuery(String.format("select * from %s where %s=?", new Object[] { "WepkgPreloadFiles", "key" }), new String[] { localObject });
    if (((Cursor)localObject).moveToFirst())
    {
      paramString1 = new a();
      paramString1.d((Cursor)localObject);
      ((Cursor)localObject).close();
      x.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "getRecordByRid exist record in DB, pkgid:%s, rid:%s, version:%s", new Object[] { paramString1.field_pkgId, paramString1.field_rid, paramString1.field_version });
      return paramString1;
    }
    x.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "getRecordByRid pkgid:%s, rid:%s, no record in DB", new Object[] { paramString1, paramString2 });
    ((Cursor)localObject).close();
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/game/wepkg/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */