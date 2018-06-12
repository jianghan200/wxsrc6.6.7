package com.tencent.mm.plugin.exdevice.f.b.b;

import android.database.Cursor;
import com.tencent.mm.plugin.exdevice.f.b.a;
import com.tencent.mm.plugin.exdevice.f.b.d;
import com.tencent.mm.plugin.exdevice.model.ad;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.Iterator;
import junit.framework.Assert;

public final class e
  extends i<com.tencent.mm.plugin.exdevice.f.b.a.e>
{
  public static final String[] diD = { i.a(com.tencent.mm.plugin.exdevice.f.b.a.e.dhO, "HardDeviceLikeUser") };
  private com.tencent.mm.sdk.e.e diF;
  
  public e(com.tencent.mm.sdk.e.e parame)
  {
    super(parame, com.tencent.mm.plugin.exdevice.f.b.a.e.dhO, "HardDeviceLikeUser", null);
    this.diF = parame;
    parame.fV("HardDeviceLikeUser", "CREATE INDEX IF NOT EXISTS ExdeviceRankLikeInfoRankIdAppNameIndex ON HardDeviceLikeUser ( rankID, appusername )");
  }
  
  public final ArrayList<com.tencent.mm.plugin.exdevice.f.b.a.e> Ai(String paramString)
  {
    com.tencent.mm.plugin.exdevice.f.b.a.e locale = null;
    if (bi.oW(paramString))
    {
      x.e("MicroMsg.ExdeviceRankLikeUserStg", "hy: param error");
      return null;
    }
    Object localObject = String.format("select *, rowid from %s where %s = ? order by %s desc", new Object[] { "HardDeviceLikeUser", "rankID", "timestamp" });
    localObject = this.diF.b((String)localObject, new String[] { bi.aG(paramString, "") }, 2);
    if (localObject == null)
    {
      x.e("MicroMsg.ExdeviceRankLikeUserStg", "Get no rank in DB");
      return null;
    }
    paramString = locale;
    if (((Cursor)localObject).moveToFirst())
    {
      paramString = new ArrayList();
      do
      {
        locale = new com.tencent.mm.plugin.exdevice.f.b.a.e();
        locale.d((Cursor)localObject);
        paramString.add(locale);
      } while (((Cursor)localObject).moveToNext());
    }
    ((Cursor)localObject).close();
    return paramString;
  }
  
  public final void a(String paramString1, String paramString2, ArrayList<com.tencent.mm.plugin.exdevice.f.b.a.e> paramArrayList)
  {
    if (!bi.oW(paramString1)) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      if (paramArrayList != null) {
        break;
      }
      x.i("MicroMsg.ExdeviceRankLikeUserStg", "batchInsertOrUpdate failed, data is null.");
      return;
    }
    paramArrayList = paramArrayList.iterator();
    while (paramArrayList.hasNext())
    {
      com.tencent.mm.plugin.exdevice.f.b.a.e locale = (com.tencent.mm.plugin.exdevice.f.b.a.e)paramArrayList.next();
      if (locale != null) {}
      for (bool = true;; bool = false)
      {
        Assert.assertTrue(bool);
        if (!c(locale, new String[] { "rankID", "username" })) {
          break label110;
        }
        x.d("MicroMsg.ExdeviceRankLikeUserStg", "hy: update success");
        break;
      }
      label110:
      if (b(locale)) {
        x.d("MicroMsg.ExdeviceRankLikeUserStg", "hy: insert success");
      } else {
        x.w("MicroMsg.ExdeviceRankLikeUserStg", "hy: insert or update failed");
      }
    }
    ad.aHn().a("HardDeviceLikeUser", new d(paramString1, paramString2, null));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/exdevice/f/b/b/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */