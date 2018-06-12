package com.tencent.mm.plugin.exdevice.f.b.b;

import android.database.Cursor;
import com.tencent.mm.plugin.exdevice.f.b.a.c;
import com.tencent.mm.plugin.exdevice.f.b.b;
import com.tencent.mm.protocal.c.xj;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import junit.framework.Assert;

public final class a
  extends i<c>
{
  public static final String[] diD = { i.a(c.dhO, "HardDeviceRankFollowInfo") };
  private e diF;
  
  public a(e parame)
  {
    super(parame, c.dhO, "HardDeviceRankFollowInfo", null);
    this.diF = parame;
    parame.fV("HardDeviceRankFollowInfo", "CREATE INDEX IF NOT EXISTS ExdeviceRankFollowRankIdAppNameIndex ON HardDeviceRankFollowInfo ( rankID, appusername )");
  }
  
  private boolean a(c paramc)
  {
    boolean bool2 = false;
    if (paramc != null)
    {
      bool1 = true;
      Assert.assertTrue(bool1);
      c localc = a(new b(paramc.field_rankID, paramc.field_appusername, paramc.field_username));
      if (localc == null) {
        break label98;
      }
      localc.field_step = paramc.field_step;
      c(localc, new String[] { "rankID", "appusername", "username" });
      x.d("MicroMsg.ExdeviceFollowInfoStg", "ap: update success");
    }
    label98:
    for (int i = 1;; i = 0)
    {
      if (i == 0) {
        break label103;
      }
      return true;
      bool1 = false;
      break;
    }
    label103:
    boolean bool1 = bool2;
    if (paramc != null) {
      bool1 = true;
    }
    Assert.assertTrue(bool1);
    b(paramc);
    x.d("MicroMsg.ExdeviceFollowInfoStg", "ap: insert success");
    return true;
  }
  
  public final boolean Af(String paramString)
  {
    String str = String.format("select * from %s where %s=? and %s=? and %s=? limit 1", new Object[] { "HardDeviceRankFollowInfo", "rankID", "appusername", "username" });
    paramString = this.diF.b(str, new String[] { bi.aG("hardcode_rank_id", ""), bi.aG("hardcode_app_name", ""), bi.aG(paramString, "") }, 2);
    if (paramString == null)
    {
      x.e("MicroMsg.ExdeviceFollowInfoStg", "ap: check follow not in DB");
      return false;
    }
    boolean bool = paramString.moveToFirst();
    paramString.close();
    x.d("MicroMsg.ExdeviceFollowInfoStg", "checkUserIsFollow %s", new Object[] { Boolean.valueOf(bool) });
    return bool;
  }
  
  public final boolean Ag(String paramString)
  {
    paramString = a(new b("hardcode_rank_id", "hardcode_app_name", paramString));
    if (paramString != null)
    {
      a(paramString, new String[] { "rankID", "appusername", "username" });
      x.d("MicroMsg.ExdeviceFollowInfoStg", "ap: update success");
      return true;
    }
    return false;
  }
  
  public final c a(b paramb)
  {
    Object localObject1 = null;
    Object localObject2 = String.format("select *, rowid from %s where %s = ? and %s = ? and %s = ? limit 1", new Object[] { "HardDeviceRankFollowInfo", "rankID", "username", "appusername" });
    localObject2 = this.diF.b((String)localObject2, new String[] { bi.aG(paramb.ixK, ""), bi.aG(paramb.username, ""), bi.aG(paramb.appName, "") }, 2);
    if (localObject2 == null)
    {
      x.e("MicroMsg.ExdeviceFollowInfoStg", "ap: Get no follow in DB");
      return null;
    }
    if (((Cursor)localObject2).moveToFirst())
    {
      paramb = new c();
      paramb.d((Cursor)localObject2);
    }
    for (;;)
    {
      ((Cursor)localObject2).close();
      return paramb;
      x.d("MicroMsg.ExdeviceFollowInfoStg", "ap: no record");
      paramb = (b)localObject1;
    }
  }
  
  public final void a(ArrayList<xj> paramArrayList, String paramString1, String paramString2)
  {
    if (paramArrayList != null)
    {
      paramArrayList = paramArrayList.iterator();
      while (paramArrayList.hasNext())
      {
        xj localxj = (xj)paramArrayList.next();
        c localc = new c();
        localc.field_rankID = paramString1;
        localc.field_step = localxj.fHo;
        localc.field_username = localxj.username;
        localc.field_appusername = paramString2;
        a(localc);
      }
    }
  }
  
  public final ArrayList<c> aHs()
  {
    ArrayList localArrayList = null;
    Object localObject = String.format("select *, rowid from %s where %s= ? and %s = ? order by rowid asc", new Object[] { "HardDeviceRankFollowInfo", "rankID", "appusername" });
    localObject = this.diF.b((String)localObject, new String[] { "hardcode_rank_id", "hardcode_app_name" }, 2);
    if (localObject == null)
    {
      x.e("MicroMsg.ExdeviceFollowInfoStg", "ap: Get follows not in DB");
      return null;
    }
    if (((Cursor)localObject).moveToFirst())
    {
      localArrayList = new ArrayList();
      do
      {
        c localc = new c();
        localc.d((Cursor)localObject);
        x.d("MicroMsg.ExdeviceFollowInfoStg", "follow info: rowid: %s, info: %s", new Object[] { Integer.valueOf(((Cursor)localObject).getColumnIndex("rowid")), localc.toString() });
        localArrayList.add(localc);
      } while (((Cursor)localObject).moveToNext());
      x.d("MicroMsg.ExdeviceFollowInfoStg", "getAllFollowItem: %d, %s", new Object[] { Integer.valueOf(localArrayList.size()), localArrayList.toString() });
    }
    for (;;)
    {
      ((Cursor)localObject).close();
      return localArrayList;
      x.d("MicroMsg.ExdeviceFollowInfoStg", "ap: no record");
    }
  }
  
  public final void aS(List<c> paramList)
  {
    if ((bi.oW("hardcode_rank_id")) || (bi.oW("hardcode_app_name"))) {
      x.e("MicroMsg.ExdeviceFollowInfoStg", "ap: delete follows,params is null");
    }
    while (paramList != null)
    {
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        c localc = (c)paramList.next();
        localc.field_rankID = "hardcode_rank_id";
        localc.field_appusername = "hardcode_app_name";
        a(localc);
      }
      x.d("MicroMsg.ExdeviceFollowInfoStg", "ap: delete rankId: %s %s count %d", new Object[] { "hardcode_rank_id", "hardcode_app_name", Integer.valueOf(this.diF.delete("HardDeviceRankFollowInfo", "rankID=? and appusername=?", new String[] { "hardcode_rank_id", "hardcode_app_name" })) });
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/exdevice/f/b/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */