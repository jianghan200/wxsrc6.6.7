package com.tencent.mm.plugin.offline.b;

import android.database.Cursor;
import com.tencent.mm.plugin.offline.a.r;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.x;

public final class a
  extends i<r>
{
  public static final String[] diD = { i.a(r.dhO, "OfflineOrderStatus") };
  public e diF;
  
  public a(e parame)
  {
    super(parame, r.dhO, "OfflineOrderStatus", null);
    this.diF = parame;
  }
  
  public final r IX(String paramString)
  {
    Object localObject = null;
    Cursor localCursor = this.diF.b("select * from OfflineOrderStatus where reqkey=?", new String[] { paramString }, 2);
    if (localCursor == null) {
      return null;
    }
    localCursor.moveToFirst();
    x.i("MicroMsg.OfflineOrderStatusStorage", "in getOrderStatusByTranId: cursor.isAfterLast() = " + localCursor.isAfterLast());
    paramString = (String)localObject;
    if (!localCursor.isAfterLast())
    {
      paramString = new r();
      paramString.d(localCursor);
    }
    localCursor.close();
    return paramString;
  }
  
  public final void IY(String paramString)
  {
    r localr = IX(paramString);
    if (localr != null) {
      localr.field_status = -1;
    }
    for (paramString = localr;; paramString = localr)
    {
      b(paramString);
      return;
      localr = new r();
      localr.field_reqkey = paramString;
      localr.field_status = -1;
    }
  }
  
  public final void b(r paramr)
  {
    if (paramr.field_reqkey == null)
    {
      x.e("MicroMsg.OfflineOrderStatusStorage", "status.field_reqkey is null");
      return;
    }
    Cursor localCursor = this.diF.b("select * from OfflineOrderStatus where reqkey=?", new String[] { paramr.field_reqkey }, 2);
    int i;
    if (localCursor == null)
    {
      i = 0;
      if (i == 0)
      {
        x.i("MicroMsg.OfflineOrderStatusStorage", "saveOfflineOrderStatus: insert reqKey: %s,  status: %d ", new Object[] { paramr.field_reqkey, Integer.valueOf(paramr.field_status) });
        b(paramr);
      }
    }
    else
    {
      localCursor.moveToFirst();
      if (!localCursor.isAfterLast()) {}
      for (i = 1;; i = 0)
      {
        localCursor.close();
        break;
      }
    }
    x.i("MicroMsg.OfflineOrderStatusStorage", "saveOfflineOrderStatus: update reqKey: %s,  status: %d ", new Object[] { paramr.field_reqkey, Integer.valueOf(paramr.field_status) });
    c(paramr, new String[0]);
  }
  
  public final r bkW()
  {
    int i = 1;
    r localr = null;
    x.i("MicroMsg.OfflineOrderStatusStorage", "in getLastestOrder: orders count: %d, latest 3 orders: %s", new Object[] { Integer.valueOf(bkY()), bkX() });
    Cursor localCursor = this.diF.b("SELECT * FROM OfflineOrderStatus WHERE status!=-1 ORDER BY rowid DESC LIMIT 1", null, 2);
    if (localCursor == null) {
      return null;
    }
    localCursor.moveToFirst();
    if (!localCursor.isAfterLast()) {}
    for (;;)
    {
      if (i != 0)
      {
        localr = new r();
        localr.d(localCursor);
      }
      localCursor.close();
      if (localr == null) {
        break;
      }
      x.i("MicroMsg.OfflineOrderStatusStorage", "getLastestOrder status = " + localr.field_status);
      return localr;
      i = 0;
    }
    x.i("MicroMsg.OfflineOrderStatusStorage", "getLastestOrder null");
    return localr;
  }
  
  public final String bkX()
  {
    String str = String.format("SELECT * FROM %s ORDER BY %s DESC LIMIT %d;", new Object[] { "OfflineOrderStatus", "rowid", Integer.valueOf(3) });
    Cursor localCursor = this.diF.b(str, null, 2);
    str = "";
    if (localCursor == null)
    {
      x.e("MicroMsg.OfflineOrderStatusStorage", "getAllOrdersInfo: error.cursor is null\n");
      return "";
      str = str + ";";
    }
    int j;
    for (int i = j;; i = 0)
    {
      if (localCursor.moveToNext())
      {
        j = i + 1;
        if (j <= 3)
        {
          i = 0;
          while (i < localCursor.getColumnCount())
          {
            str = str + localCursor.getColumnName(i) + ": " + localCursor.getString(i) + ", ";
            i += 1;
          }
          break;
        }
      }
      localCursor.close();
      return str;
    }
  }
  
  public final int bkY()
  {
    int j = 0;
    Object localObject = String.format("SELECT COUNT(*) FROM %s;", new Object[] { "OfflineOrderStatus" });
    localObject = this.diF.b((String)localObject, null, 2);
    if (localObject == null)
    {
      x.e("MicroMsg.OfflineOrderStatusStorage", "getOrdersCount: error.cursor is null\n");
      return 0;
    }
    int i = j;
    if (((Cursor)localObject).moveToNext())
    {
      i = j;
      if (((Cursor)localObject).getColumnCount() > 0) {
        i = ((Cursor)localObject).getInt(0);
      }
    }
    ((Cursor)localObject).close();
    return i;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/offline/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */