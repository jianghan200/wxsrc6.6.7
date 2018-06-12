package com.tencent.mm.storage;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.bt.g;
import com.tencent.mm.bt.g.a;
import com.tencent.mm.bt.h;
import com.tencent.mm.plugin.messenger.foundation.a.a.i;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;

public final class bm
  extends j
  implements g.a, i
{
  public static final String[] diD = { "CREATE TABLE IF NOT EXISTS role_info ( id TEXT PRIMARY KEY, name TEXT, status INT, text_reserved1 TEXT, text_reserved2 TEXT, text_reserved3 TEXT, text_reserved4 TEXT, int_reserved1 INT, int_reserved2 INT, int_reserved3 INT, int_reserved4 INT )" };
  private e diF = null;
  
  public bm(h paramh)
  {
    this.diF = paramh;
  }
  
  private bl Zl(String paramString)
  {
    Object localObject = null;
    if ((paramString != null) && (paramString.length() > 0)) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      bl localbl = new bl();
      Cursor localCursor = this.diF.a("role_info", null, "name= ?", new String[] { paramString }, null, null, null, 2);
      paramString = (String)localObject;
      if (localCursor.moveToFirst())
      {
        localbl.d(localCursor);
        paramString = localbl;
      }
      localCursor.close();
      return paramString;
    }
  }
  
  private void a(bl parambl)
  {
    parambl.bWA = 135;
    parambl = parambl.wH();
    if ((parambl.size() > 0) && (this.diF.insert("role_info", "id", parambl) != 0L)) {
      doNotify();
    }
  }
  
  private void b(bl parambl)
  {
    ContentValues localContentValues = parambl.wH();
    if (localContentValues.size() > 0)
    {
      int i = this.diF.update("role_info", localContentValues, "name like ?", new String[] { parambl.name });
      x.d("MicroMsg.RoleStorage", "update role info, name=" + parambl.name + ", res:" + i);
      if (i > 0) {
        doNotify();
      }
    }
  }
  
  public final bl Hg(String paramString)
  {
    Object localObject = null;
    if ((paramString == null) || (paramString.length() <= 0)) {
      return null;
    }
    bl localbl = new bl();
    Cursor localCursor = this.diF.a("role_info", null, "name LIKE ?", new String[] { "%" + paramString }, null, null, null, 2);
    paramString = (String)localObject;
    if (localCursor.moveToFirst())
    {
      localbl.d(localCursor);
      paramString = localbl;
    }
    localCursor.close();
    return paramString;
  }
  
  public final int a(g paramg)
  {
    if (paramg != null) {
      this.diF = paramg;
    }
    return 0;
  }
  
  public final void aF(String paramString, boolean paramBoolean)
  {
    if (bi.oW(paramString))
    {
      x.e("MicroMsg.RoleStorage", "insert role info failed: empty user");
      return;
    }
    bl localbl = Zl(paramString);
    if (localbl == null)
    {
      a(new bl(paramString, paramBoolean, 2));
      x.d("MicroMsg.RoleStorage", "insert new role, user=" + paramString);
      return;
    }
    localbl.setEnable(paramBoolean);
    localbl.bWA = 4;
    b(localbl);
  }
  
  public final void bJ(String paramString, int paramInt)
  {
    if (bi.oW(paramString)) {
      x.e("MicroMsg.RoleStorage", "insert role info failed: empty user");
    }
    while (Zl(paramString) != null) {
      return;
    }
    a(new bl(paramString, true, paramInt));
    x.d("MicroMsg.RoleStorage", "insert new role, user=" + paramString);
  }
  
  public final List<bl> bdo()
  {
    LinkedList localLinkedList = new LinkedList();
    Cursor localCursor = this.diF.a("role_info", null, "int_reserved1=1", null, null, null, null, 2);
    while (localCursor.moveToNext())
    {
      bl localbl = new bl();
      localbl.d(localCursor);
      localLinkedList.add(localbl);
    }
    localCursor.close();
    return localLinkedList;
  }
  
  public final void delete(String paramString)
  {
    if (paramString.length() > 0) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      int i = this.diF.delete("role_info", "name=?", new String[] { paramString });
      x.d("MicroMsg.RoleStorage", "delete name name :" + paramString + ", res:" + i);
      if (i > 0) {
        doNotify();
      }
      return;
    }
  }
  
  public final void e(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = 2;
    if (bi.oW(paramString))
    {
      x.e("MicroMsg.RoleStorage", "insert role info failed: empty user");
      return;
    }
    bl localbl = Zl(paramString);
    if (localbl == null)
    {
      a(new bl(paramString, paramBoolean1, 2));
      x.d("MicroMsg.RoleStorage", "insert new role, user=" + paramString);
      return;
    }
    localbl.setEnable(paramBoolean1);
    int j;
    if (paramBoolean2)
    {
      j = localbl.status;
      if (!paramBoolean2) {}
    }
    for (localbl.status = (i | j);; localbl.status &= 0xFFFFFFFD)
    {
      localbl.bWA = 4;
      b(localbl);
      return;
      i = 0;
      break;
    }
  }
  
  public final String getTableName()
  {
    return "role_info";
  }
  
  public final boolean has(String paramString)
  {
    bl localbl = Hg(new bl.a(paramString).Zk(""));
    return (localbl != null) && (paramString.equals(localbl.name));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/storage/bm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */