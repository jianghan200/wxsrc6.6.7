package com.tencent.mm.plugin.fav.b.e;

import android.database.Cursor;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fav.a.s;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bi;

public final class b
  extends i<com.tencent.mm.plugin.fav.a.e>
  implements s
{
  private com.tencent.mm.sdk.e.e diF;
  
  public b(com.tencent.mm.sdk.e.e parame)
  {
    super(parame, com.tencent.mm.plugin.fav.a.e.dhO, "FavConfigInfo", null);
    this.diF = parame;
  }
  
  private com.tencent.mm.plugin.fav.a.e aMb()
  {
    com.tencent.mm.plugin.fav.a.e locale = new com.tencent.mm.plugin.fav.a.e();
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.FavConfigStorage", "get fav config sql %s", new Object[] { "select * from FavConfigInfo where configId = 8216" });
    Cursor localCursor = this.diF.b("select * from FavConfigInfo where configId = 8216", null, 2);
    if (localCursor != null)
    {
      if (localCursor.moveToFirst()) {
        locale.d(localCursor);
      }
      localCursor.close();
    }
    return locale;
  }
  
  public final byte[] aLx()
  {
    Object localObject = aMb();
    if (8216 != ((com.tencent.mm.plugin.fav.a.e)localObject).field_configId)
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.FavConfigStorage", "get sync key from fav db fail, try to load from mmdb");
      g.Ek();
      if (((Boolean)g.Ei().DT().get(8224, Boolean.valueOf(false))).booleanValue()) {
        com.tencent.mm.sdk.platformtools.x.w("MicroMsg.FavConfigStorage", "get sync from mmdb fail, has trans");
      }
    }
    else
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FavConfigStorage", "get sync key, id %d, value %s", new Object[] { Integer.valueOf(((com.tencent.mm.plugin.fav.a.e)localObject).field_configId), ((com.tencent.mm.plugin.fav.a.e)localObject).field_value });
      return bi.WP(((com.tencent.mm.plugin.fav.a.e)localObject).field_value);
    }
    g.Ek();
    localObject = bi.oV((String)g.Ei().DT().get(8216, ""));
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FavConfigStorage", "get sync key(%s) from mmdb, do update fav sync key", new Object[] { localObject });
    localObject = bi.WP((String)localObject);
    aw((byte[])localObject);
    com.tencent.mm.sdk.platformtools.x.w("MicroMsg.FavConfigStorage", "set fav sync key has trans");
    g.Ek();
    g.Ei().DT().set(8224, Boolean.valueOf(true));
    return (byte[])localObject;
  }
  
  public final void aw(byte[] paramArrayOfByte)
  {
    com.tencent.mm.plugin.fav.a.e locale = aMb();
    if (8216 == locale.field_configId)
    {
      locale.field_value = bi.bE(paramArrayOfByte);
      bool = c(locale, new String[0]);
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FavConfigStorage", "update sync key: %s, result %B", new Object[] { locale.field_value, Boolean.valueOf(bool) });
      return;
    }
    locale.field_configId = 8216;
    locale.field_value = bi.bE(paramArrayOfByte);
    boolean bool = b(locale);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FavConfigStorage", "insert sync key: %s, result %B", new Object[] { locale.field_value, Boolean.valueOf(bool) });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/fav/b/e/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */