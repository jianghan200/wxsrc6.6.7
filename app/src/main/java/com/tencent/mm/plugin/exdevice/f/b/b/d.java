package com.tencent.mm.plugin.exdevice.f.b.b;

import android.database.Cursor;
import com.tencent.mm.plugin.exdevice.f.b.a;
import com.tencent.mm.plugin.exdevice.model.ad;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import junit.framework.Assert;

public final class d
  extends i<com.tencent.mm.plugin.exdevice.f.b.a.d>
{
  public static final String[] diD = { i.a(com.tencent.mm.plugin.exdevice.f.b.a.d.dhO, "HardDeviceRankInfo") };
  public e diF;
  
  public d(e parame)
  {
    super(parame, com.tencent.mm.plugin.exdevice.f.b.a.d.dhO, "HardDeviceRankInfo", null);
    this.diF = parame;
    parame.fV("HardDeviceRankInfo", "CREATE INDEX IF NOT EXISTS ExdeviceRankInfoRankIdAppNameIndex ON HardDeviceRankInfo ( rankID, appusername )");
  }
  
  public final com.tencent.mm.plugin.exdevice.f.b.a.d a(com.tencent.mm.plugin.exdevice.f.b.d paramd)
  {
    Object localObject1 = null;
    Object localObject2 = String.format("select *, rowid from %s where %s = ? and %s = ? limit 1", new Object[] { "HardDeviceRankInfo", "rankID", "username" });
    localObject2 = this.diF.b((String)localObject2, new String[] { bi.aG(paramd.ixK, ""), bi.aG(paramd.username, "") }, 2);
    if (localObject2 == null)
    {
      x.e("MicroMsg.ExdeviceRankInfoStg", "Get no rank in DB");
      return null;
    }
    if (((Cursor)localObject2).moveToFirst())
    {
      paramd = new com.tencent.mm.plugin.exdevice.f.b.a.d();
      paramd.d((Cursor)localObject2);
    }
    for (;;)
    {
      ((Cursor)localObject2).close();
      return paramd;
      x.d("MicroMsg.ExdeviceRankInfoStg", "hy: no record");
      paramd = (com.tencent.mm.plugin.exdevice.f.b.d)localObject1;
    }
  }
  
  public final boolean a(com.tencent.mm.plugin.exdevice.f.b.a.d paramd, boolean paramBoolean)
  {
    if (b(paramd, paramBoolean)) {
      return true;
    }
    if (paramd != null) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      b(paramd);
      x.d("MicroMsg.ExdeviceRankInfoStg", "hy: insert success");
      if (!paramBoolean) {
        break;
      }
      ad.aHn().a("HardDeviceRankInfo", new com.tencent.mm.plugin.exdevice.f.b.d(paramd.field_rankID, paramd.field_appusername, paramd.field_username));
      return true;
    }
  }
  
  public final boolean b(com.tencent.mm.plugin.exdevice.f.b.a.d paramd, boolean paramBoolean)
  {
    if (paramd != null) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      com.tencent.mm.plugin.exdevice.f.b.a.d locald = a(new com.tencent.mm.plugin.exdevice.f.b.d(paramd.field_rankID, paramd.field_appusername, paramd.field_username));
      if (locald == null) {
        break;
      }
      locald.field_likecount = paramd.field_likecount;
      locald.field_selfLikeState = paramd.field_selfLikeState;
      c(locald, new String[] { "rankID", "username" });
      x.d("MicroMsg.ExdeviceRankInfoStg", "hy: update success");
      if (paramBoolean) {
        ad.aHn().a("HardDeviceRankInfo", new com.tencent.mm.plugin.exdevice.f.b.d(paramd.field_rankID, paramd.field_appusername, paramd.field_username));
      }
      return true;
    }
    return false;
  }
  
  public final void e(String paramString, ArrayList<com.tencent.mm.plugin.exdevice.f.b.a.d> paramArrayList)
  {
    if ((bi.oW(paramString)) || (paramArrayList == null))
    {
      x.w("MicroMsg.ExdeviceRankInfoStg", "insertOrUpdateRankInfo failed, rank id is null or nil or data is null.");
      return;
    }
    x.i("MicroMsg.ExdeviceRankInfoStg", "insertOrUpdateRankInfo, rankId(%s) , size(%d).", new Object[] { paramString, Integer.valueOf(paramArrayList.size()) });
    int i = 0;
    while (i < paramArrayList.size())
    {
      a((com.tencent.mm.plugin.exdevice.f.b.a.d)paramArrayList.get(i), false);
      i += 1;
    }
    ad.aHn().a("HardDeviceRankInfo", new com.tencent.mm.plugin.exdevice.f.b.d(paramString, null, null));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/exdevice/f/b/b/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */