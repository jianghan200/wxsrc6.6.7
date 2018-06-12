package com.tencent.mm.bt;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Map;
import java.util.Queue;
import junit.framework.Assert;

public final class g
  implements e
{
  public static String tdI = "";
  public int field_MARK_CURSOR_CHECK_IGNORE;
  public boolean qAy;
  public h tdH;
  public Map<String, i> tdJ;
  public Queue<a> tdK;
  public f tdk;
  
  public final int ZK(String paramString)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    if (!this.qAy) {
      return -4;
    }
    if ((this.tdH == null) || (this.tdH.inTransaction()))
    {
      x.d("MicroMsg.MemoryStorage", "copy table but diskDB inTransaction");
      return -3;
    }
    try
    {
      if (f.a(this.tdk, paramString))
      {
        this.tdk.execSQL("drop table " + paramString);
        x.i("MicroMsg.MemoryStorage", "table %s is in Memory DB,drop! ", new Object[] { paramString });
      }
      Cursor localCursor = this.tdH.b(" select sql from sqlite_master where tbl_name=\"" + paramString + "\" and type = \"table\"", null, 0);
      if (localCursor != null)
      {
        localObject1 = localObject2;
        if (localCursor.getCount() == 1)
        {
          localCursor.moveToFirst();
          localObject1 = localCursor.getString(0);
        }
        localCursor.close();
      }
      if (localObject1 == null)
      {
        x.w("MicroMsg.MemoryStorage", "diskDB has not this table !");
        return -1;
      }
      this.tdk.execSQL((String)localObject1);
      this.tdk.execSQL("insert into " + paramString + " select * from old." + paramString);
      x.d("MicroMsg.MemoryStorage", "copy table %s success", new Object[] { paramString });
      return 0;
    }
    catch (Exception paramString)
    {
      x.printErrStackTrace("MicroMsg.MemoryStorage", paramString, "copy table failed with exception.\n", new Object[0]);
    }
    return -2;
  }
  
  public final Cursor a(String paramString1, String[] paramArrayOfString1, String paramString2, String[] paramArrayOfString2, String paramString3, String paramString4, String paramString5, int paramInt)
  {
    return query(paramString1, paramArrayOfString1, paramString2, paramArrayOfString2, paramString3, paramString4, paramString5);
  }
  
  public final Cursor b(String paramString, String[] paramArrayOfString, int paramInt)
  {
    return rawQuery(paramString, paramArrayOfString);
  }
  
  public final boolean cjr()
  {
    boolean bool = false;
    if ((this.tdk == null) || (!this.tdk.isOpen()))
    {
      x.e("MicroMsg.MemoryStorage", "memory db is close [%s]", new Object[] { tdI });
      bool = true;
    }
    return bool;
  }
  
  public final int delete(String paramString1, String paramString2, String[] paramArrayOfString)
  {
    Assert.assertTrue("Not Attach Mem Storage:" + paramString1, this.tdJ.containsKey(paramString1));
    if ((this.tdk != null) && (this.tdk.isOpen()))
    {
      i locali = (i)this.tdJ.get(paramString1);
      i.a locala = new i.a();
      locala.sIz = 5;
      locala.ted = paramString2;
      locala.J(paramArrayOfString);
      locali.a(locala);
      return this.tdk.delete(paramString1, paramString2, paramArrayOfString);
    }
    x.w("MicroMsg.MemoryStorage", "memoryDB already close delete [%s] [%s]", new Object[] { paramString1, tdI });
    if ((this.tdH != null) && (this.tdH.isOpen())) {
      return this.tdH.delete(paramString1, paramString2, paramArrayOfString);
    }
    return -1;
  }
  
  public final boolean fV(String paramString1, String paramString2)
  {
    boolean bool2 = false;
    Assert.assertTrue("Not Attach Mem Storage:" + paramString1, this.tdJ.containsKey(paramString1));
    boolean bool1;
    if ((this.tdk != null) && (this.tdk.isOpen()))
    {
      paramString1 = (i)this.tdJ.get(paramString1);
      i.a locala = new i.a();
      locala.sIz = 1;
      locala.sql = paramString2;
      paramString1.a(locala);
      this.tdk.execSQL(paramString2);
      bool1 = true;
    }
    do
    {
      do
      {
        return bool1;
        x.w("MicroMsg.MemoryStorage", "memoryDB already close execSQL [%s] [%s]", new Object[] { paramString1, tdI });
        bool1 = bool2;
      } while (this.tdH == null);
      bool1 = bool2;
    } while (!this.tdH.isOpen());
    this.tdH.fV(paramString2, paramString1);
    return true;
  }
  
  public final long insert(String paramString1, String paramString2, ContentValues paramContentValues)
  {
    Assert.assertTrue("Not Attach Mem Storage:" + paramString1, this.tdJ.containsKey(paramString1));
    if ((this.tdk != null) && (this.tdk.isOpen()))
    {
      i locali = (i)this.tdJ.get(paramString1);
      i.a locala = new i.a();
      locala.sIz = 2;
      locala.sKz = paramString2;
      locala.values = new ContentValues(paramContentValues);
      locali.a(locala);
      return this.tdk.insert(paramString1, paramString2, paramContentValues);
    }
    x.w("MicroMsg.MemoryStorage", "memoryDB already close insert [%s] [%s]", new Object[] { paramString1, tdI });
    if ((this.tdH != null) && (this.tdH.isOpen())) {
      return this.tdH.insert(paramString1, paramString2, paramContentValues);
    }
    return -1L;
  }
  
  public final Cursor query(String paramString1, String[] paramArrayOfString1, String paramString2, String[] paramArrayOfString2, String paramString3, String paramString4, String paramString5)
  {
    if ((this.tdk != null) && (this.tdk.isOpen())) {
      return this.tdk.a(paramString1, paramArrayOfString1, paramString2, paramArrayOfString2, paramString3, paramString4, paramString5, 0);
    }
    x.w("MicroMsg.MemoryStorage", "memoryDB already close query [%s] [%s]", new Object[] { paramString1, tdI });
    return d.cnR();
  }
  
  public final Cursor rawQuery(String paramString, String[] paramArrayOfString)
  {
    if ((this.tdk != null) && (this.tdk.isOpen())) {
      return this.tdk.b(paramString, paramArrayOfString, 0);
    }
    x.w("MicroMsg.MemoryStorage", "memoryDB already close rawQuery [%s] [%s]", new Object[] { paramString, tdI });
    return d.cnR();
  }
  
  public final long replace(String paramString1, String paramString2, ContentValues paramContentValues)
  {
    Assert.assertTrue("Not Attach Mem Storage:" + paramString1, this.tdJ.containsKey(paramString1));
    if ((this.tdk != null) && (this.tdk.isOpen()))
    {
      i locali = (i)this.tdJ.get(paramString1);
      i.a locala = new i.a();
      locala.sIz = 4;
      locala.sKz = paramString2;
      locala.values = new ContentValues(paramContentValues);
      locali.a(locala);
      return this.tdk.replace(paramString1, paramString2, paramContentValues);
    }
    x.w("MicroMsg.MemoryStorage", "memoryDB already close replace [%s] [%s]", new Object[] { paramString1, tdI });
    if ((this.tdH != null) && (this.tdH.isOpen())) {
      return this.tdH.replace(paramString1, paramString2, paramContentValues);
    }
    return -1L;
  }
  
  public final int update(String paramString1, ContentValues paramContentValues, String paramString2, String[] paramArrayOfString)
  {
    Assert.assertTrue("Not Attach Mem Storage:" + paramString1, this.tdJ.containsKey(paramString1));
    if ((this.tdk != null) && (this.tdk.isOpen()))
    {
      i locali = (i)this.tdJ.get(paramString1);
      i.a locala = new i.a();
      locala.sIz = 3;
      locala.ted = paramString2;
      locala.values = new ContentValues(paramContentValues);
      locala.J(paramArrayOfString);
      locali.a(locala);
      return this.tdk.update(paramString1, paramContentValues, paramString2, paramArrayOfString);
    }
    x.w("MicroMsg.MemoryStorage", "memoryDB already close update [%s] [%s]", new Object[] { paramString1, tdI });
    if ((this.tdH != null) && (this.tdH.isOpen())) {
      return this.tdH.update(paramString1, paramContentValues, paramString2, paramArrayOfString);
    }
    return -1;
  }
  
  public static abstract interface a
  {
    public abstract int a(g paramg);
    
    public abstract String getTableName();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/bt/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */