package com.tencent.mm.g.c;

import com.tencent.mm.bt.h;
import com.tencent.mm.bt.h.d;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import junit.framework.Assert;

public final class ff
  extends h
{
  private static ff cVL = null;
  private static HashMap<Integer, h.d> cVM;
  
  static
  {
    HashMap localHashMap = new HashMap();
    cVM = localHashMap;
    localHashMap.put(Integer.valueOf("FavItemInfo".hashCode()), new ff.1());
    cVM.put(Integer.valueOf("FavSearchInfo".hashCode()), new ff.2());
    cVM.put(Integer.valueOf("FavEditInfo".hashCode()), new ff.3());
    cVM.put(Integer.valueOf("FavCdnInfo".hashCode()), new ff.4());
    cVM.put(Integer.valueOf("FavConfigInfo".hashCode()), new ff.5());
  }
  
  private ff()
  {
    long l = System.currentTimeMillis();
    g.Eg();
    if (a.Df() != 0) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      str = g.Ei().cachePath + "enFavorite.db";
      x.d("MicroMsg.FavoriteDataBase", "db path", new Object[] { str });
      g.Eg();
      if (a("", str, a.Df(), q.zy(), cVM)) {
        break;
      }
      throw new com.tencent.mm.model.b((byte)0);
    }
    String str = this.tdP;
    if (!bi.oW(str))
    {
      x.e("MicroMsg.FavoriteDataBase", "dbinit failed :" + str);
      com.tencent.mm.sdk.a.b.A("init db Favorite Failed: [ " + str + "]", "DBinit");
    }
    x.d("MicroMsg.FavoriteDataBase", "init db Favorite time:%d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
  }
  
  public static ff xa()
  {
    if (cVL == null) {
      cVL = new ff();
    }
    return cVL;
  }
  
  public final void ex(String paramString)
  {
    super.ex(paramString);
    cVL = null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/g/c/ff.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */