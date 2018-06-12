package com.tencent.mm.plugin.exdevice.f.b;

import android.database.Cursor;
import com.tencent.mm.ab.o;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.exdevice.f.a.j;
import com.tencent.mm.plugin.exdevice.f.a.m;
import com.tencent.mm.plugin.exdevice.model.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.Iterator;
import junit.framework.Assert;

public final class c
  implements com.tencent.mm.ab.e
{
  public f iye;
  public com.tencent.mm.plugin.exdevice.f.a.f iyf;
  
  public c()
  {
    x.d("MicroMsg.ExdeviceRankInfoManager", "hy: constructing manager....");
    au.DF().a(1042, this);
    au.DF().a(1041, this);
    au.DF().a(1043, this);
    au.DF().a(1040, this);
  }
  
  public static ArrayList<com.tencent.mm.plugin.exdevice.f.b.a.d> Ad(String paramString)
  {
    com.tencent.mm.plugin.exdevice.f.b.a.d locald = null;
    x.d("MicroMsg.ExdeviceRankInfoManager", "hy: getting like info...");
    if (!bi.oW(paramString))
    {
      Object localObject = ad.aHf();
      if (bi.oW(paramString))
      {
        x.e("MicroMsg.ExdeviceRankInfoStg", "hy: param error");
        return null;
      }
      String str = String.format("select *, rowid from %s where %s = ? order by %s desc", new Object[] { "HardDeviceRankInfo", "rankID", "score" });
      localObject = ((com.tencent.mm.plugin.exdevice.f.b.b.d)localObject).diF.b(str, new String[] { bi.aG(paramString, "") }, 2);
      if (localObject == null)
      {
        x.e("MicroMsg.ExdeviceRankInfoStg", "Get no rank in DB");
        return null;
      }
      if (((Cursor)localObject).moveToFirst())
      {
        paramString = new ArrayList();
        do
        {
          locald = new com.tencent.mm.plugin.exdevice.f.b.a.d();
          locald.d((Cursor)localObject);
          paramString.add(locald);
        } while (((Cursor)localObject).moveToNext());
      }
      for (;;)
      {
        ((Cursor)localObject).close();
        return paramString;
        x.d("MicroMsg.ExdeviceRankInfoStg", "hy: no record");
        paramString = locald;
      }
    }
    x.w("MicroMsg.ExdeviceRankInfoManager", "hy: param error");
    return null;
  }
  
  public static void c(String paramString1, String paramString2, String paramString3, int paramInt)
  {
    au.DF().a(new com.tencent.mm.plugin.exdevice.f.a.l(paramString3, paramString2, paramInt, paramString1), 0);
  }
  
  public static void d(String paramString, ArrayList<com.tencent.mm.plugin.exdevice.f.b.a.d> paramArrayList)
  {
    com.tencent.mm.plugin.exdevice.f.b.b.d locald = ad.aHf();
    if (!bi.oW(paramString)) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      if (paramArrayList == null) {
        break label196;
      }
      String str = String.format("select COUNT(*) from %s where %s = ?", new Object[] { "HardDeviceRankInfo", "rankID" });
      paramString = locald.diF.b(str, new String[] { bi.aG(paramString, "") }, 2);
      if (paramString != null) {
        break;
      }
      x.e("MicroMsg.ExdeviceRankInfoStg", "Get no rank in DB");
      i = 0;
      if (i != 0) {
        break label163;
      }
      paramString = paramArrayList.iterator();
      while (paramString.hasNext()) {
        locald.a((com.tencent.mm.plugin.exdevice.f.b.a.d)paramString.next(), false);
      }
    }
    if (paramString.moveToFirst()) {}
    for (int i = paramString.getInt(0);; i = 0)
    {
      paramString.close();
      break;
      x.d("MicroMsg.ExdeviceRankInfoStg", "hy: no record");
    }
    label163:
    paramString = paramArrayList.iterator();
    while (paramString.hasNext()) {
      locald.b((com.tencent.mm.plugin.exdevice.f.b.a.d)paramString.next(), false);
    }
    label196:
    x.w("MicroMsg.ExdeviceRankInfoStg", "hy: data is null. abort insert");
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    x.d("MicroMsg.ExdeviceRankInfoManager", "hy: netscene back.err type: %d, err code: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if ((paraml instanceof j)) {
      if ((paramInt1 != 0) || (paramInt2 != 0)) {
        x.w("MicroMsg.ExdeviceRankInfoManager", "hy: scene error.");
      }
    }
    do
    {
      do
      {
        return;
        if (!(paraml instanceof com.tencent.mm.plugin.exdevice.f.a.l)) {
          break;
        }
      } while ((paramInt1 == 0) && (paramInt2 == 0));
      x.w("MicroMsg.ExdeviceRankInfoManager", "hy: scene error");
      return;
    } while ((!(paraml instanceof m)) || ((paramInt1 == 0) && (paramInt2 == 0)));
    x.w("MicroMsg.ExdeviceRankInfoManager", "hy: scene error");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/exdevice/f/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */