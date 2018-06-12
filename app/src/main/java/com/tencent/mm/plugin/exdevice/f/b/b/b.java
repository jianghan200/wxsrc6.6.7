package com.tencent.mm.plugin.exdevice.f.b.b;

import android.database.Cursor;
import com.tencent.mm.plugin.exdevice.f.b.d;
import com.tencent.mm.plugin.exdevice.model.ad;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import junit.framework.Assert;

public final class b
  extends i<com.tencent.mm.plugin.exdevice.f.b.a.a>
{
  public static final String[] diD = { i.a(com.tencent.mm.plugin.exdevice.f.b.a.a.dhO, "HardDeviceChampionInfo") };
  private e diF;
  
  public b(e parame)
  {
    super(parame, com.tencent.mm.plugin.exdevice.f.b.a.a.dhO, "HardDeviceChampionInfo", null);
    this.diF = parame;
    parame.fV("HardDeviceChampionInfo", "CREATE INDEX IF NOT EXISTS ExdeviceRankChampionInfoRankIdAppNameIndex ON HardDeviceChampionInfo ( username )");
  }
  
  public final com.tencent.mm.plugin.exdevice.f.b.a.a Ah(String paramString)
  {
    Object localObject1 = null;
    Object localObject2 = String.format("select *, rowid from %s where %s = ? limit 1", new Object[] { "HardDeviceChampionInfo", "username" });
    localObject2 = this.diF.b((String)localObject2, new String[] { bi.aG(paramString, "") }, 2);
    if (localObject2 == null)
    {
      x.e("MicroMsg.ExdeviceRankChampionStg", "Get no rank in DB");
      return null;
    }
    if (((Cursor)localObject2).moveToFirst())
    {
      paramString = new com.tencent.mm.plugin.exdevice.f.b.a.a();
      paramString.d((Cursor)localObject2);
    }
    for (;;)
    {
      ((Cursor)localObject2).close();
      return paramString;
      x.d("MicroMsg.ExdeviceRankChampionStg", "hy: no record");
      paramString = (String)localObject1;
    }
  }
  
  public final boolean a(com.tencent.mm.plugin.exdevice.f.b.a.a parama)
  {
    if (parama != null) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      if (!c(parama, new String[] { "username" })) {
        break;
      }
      x.d("MicroMsg.ExdeviceRankChampionStg", "hy: update success");
      ad.aHn().a("HardDeviceChampionInfo", new d(null, null, parama.field_username));
      return true;
    }
    if (b(parama))
    {
      x.d("MicroMsg.ExdeviceRankChampionStg", "hy: insert success");
      ad.aHn().a("HardDeviceChampionInfo", new d(null, null, parama.field_username));
      return true;
    }
    x.w("MicroMsg.ExdeviceRankChampionStg", "hy: insert or update failed");
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/exdevice/f/b/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */