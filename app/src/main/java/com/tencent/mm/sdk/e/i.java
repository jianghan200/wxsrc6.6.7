package com.tencent.mm.sdk.e;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import junit.framework.Assert;

public abstract class i<T extends c>
  extends j
  implements d<T>
{
  private final e diF;
  public int field_MARK_CURSOR_CHECK_IGNORE = 1;
  public final c.a sKB;
  private final String table;
  
  public i(e parame, c.a parama, String paramString, String[] paramArrayOfString)
  {
    this.diF = parame;
    this.sKB = parama;
    parama = this.sKB;
    if (bi.oW(this.sKB.sKz)) {}
    int i;
    for (parame = "rowid";; parame = this.sKB.sKz)
    {
      parama.sKz = parame;
      this.table = paramString;
      parame = a(this.sKB, getTableName(), this.diF);
      i = 0;
      while (i < parame.size())
      {
        if (!this.diF.fV(this.table, (String)parame.get(i))) {
          x.i("MicroMsg.SDK.MAutoStorage", "updateColumnSQLs table failed %s, sql %s", new Object[] { this.table, parame.get(i) });
        }
        i += 1;
      }
    }
    if ((paramArrayOfString != null) && (paramArrayOfString.length > 0))
    {
      i = j;
      while (i < paramArrayOfString.length)
      {
        this.diF.fV(this.table, paramArrayOfString[i]);
        i += 1;
      }
    }
  }
  
  private void Xq(String paramString)
  {
    x.d("MicroMsg.SDK.MAutoStorage", getTableName() + ":" + paramString);
  }
  
  private void Xr(String paramString)
  {
    x.e("MicroMsg.SDK.MAutoStorage", getTableName() + ":" + paramString);
  }
  
  public static String a(c.a parama, String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("CREATE TABLE IF NOT EXISTS " + paramString + " ( ");
    localStringBuilder.append(parama.sql);
    localStringBuilder.append(");");
    return localStringBuilder.toString();
  }
  
  private static StringBuilder a(ContentValues paramContentValues, String... paramVarArgs)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    int j = paramVarArgs.length;
    int i = 0;
    while (i < j)
    {
      String str = paramVarArgs[i];
      localStringBuilder.append(str + " = ? AND ");
      if (paramContentValues.get(str) == null) {
        return null;
      }
      i += 1;
    }
    localStringBuilder.append(" 1=1");
    return localStringBuilder;
  }
  
  public static List<String> a(c.a parama, String paramString, e parame)
  {
    ArrayList localArrayList = new ArrayList();
    if ((parame == null) || (paramString == null))
    {
      if (parame == null) {}
      for (boolean bool = true;; bool = false)
      {
        x.e("MicroMsg.SDK.MAutoStorage", "dk getUpdateSQLs db==null :%b  table:%s", new Object[] { Boolean.valueOf(bool), paramString });
        return localArrayList;
      }
    }
    Object localObject1 = parame.b("PRAGMA table_info( " + paramString + " )", new String[0], 2);
    if (localObject1 == null) {
      return localArrayList;
    }
    parame = new HashMap();
    int i = ((Cursor)localObject1).getColumnIndex("name");
    int j = ((Cursor)localObject1).getColumnIndex("type");
    while (((Cursor)localObject1).moveToNext()) {
      parame.put(((Cursor)localObject1).getString(i), ((Cursor)localObject1).getString(j));
    }
    ((Cursor)localObject1).close();
    parama = parama.sKA.entrySet().iterator();
    while (parama.hasNext())
    {
      Object localObject2 = (Map.Entry)parama.next();
      localObject1 = (String)((Map.Entry)localObject2).getValue();
      localObject2 = (String)((Map.Entry)localObject2).getKey();
      if ((localObject1 != null) && (((String)localObject1).length() > 0))
      {
        String str = (String)parame.get(localObject2);
        if (str == null)
        {
          localArrayList.add("ALTER TABLE " + paramString + " ADD COLUMN " + (String)localObject2 + " " + (String)localObject1 + ";");
          parame.remove(localObject2);
        }
        else if (!((String)localObject1).toLowerCase().startsWith(str.toLowerCase()))
        {
          x.e("MicroMsg.SDK.MAutoStorage", "conflicting alter table on column: " + (String)localObject2 + ", " + str + "<o-n>" + (String)localObject1);
          parame.remove(localObject2);
        }
      }
    }
    return localArrayList;
  }
  
  private static String[] a(String[] paramArrayOfString, ContentValues paramContentValues)
  {
    String[] arrayOfString = new String[paramArrayOfString.length];
    int i = 0;
    while (i < arrayOfString.length)
    {
      arrayOfString[i] = bi.oV(paramContentValues.getAsString(paramArrayOfString[i]));
      i += 1;
    }
    return arrayOfString;
  }
  
  private boolean b(ContentValues paramContentValues)
  {
    Cursor localCursor = this.diF.query(getTableName(), this.sKB.columns, this.sKB.sKz + " = ?", new String[] { bi.oV(paramContentValues.getAsString(this.sKB.sKz)) }, null, null, null);
    boolean bool = c.a(paramContentValues, localCursor);
    localCursor.close();
    return bool;
  }
  
  public boolean a(long paramLong, T paramT)
  {
    return a(paramLong, paramT, true);
  }
  
  public final boolean a(long paramLong, T paramT, boolean paramBoolean)
  {
    paramT = paramT.wH();
    boolean bool2;
    if ((paramT == null) || (paramT.size() <= 0))
    {
      Xr("update failed, value.size <= 0");
      bool2 = false;
      return bool2;
    }
    Cursor localCursor = this.diF.query(getTableName(), this.sKB.columns, "rowid = ?", new String[] { String.valueOf(paramLong) }, null, null, null);
    if (c.a(paramT, localCursor))
    {
      localCursor.close();
      Xq("no need replace , fields no change");
      return true;
    }
    localCursor.close();
    if (this.diF.update(getTableName(), paramT, "rowid = ?", new String[] { String.valueOf(paramLong) }) > 0) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      bool2 = bool1;
      if (!bool1) {
        break;
      }
      bool2 = bool1;
      if (!paramBoolean) {
        break;
      }
      doNotify();
      return bool1;
    }
  }
  
  public boolean a(T paramT)
  {
    boolean bool;
    ContentValues localContentValues;
    int j;
    int k;
    if (!bi.oW(this.sKB.sKz))
    {
      bool = true;
      Assert.assertTrue("replace primaryKey == null", bool);
      localContentValues = paramT.wH();
      if (localContentValues != null)
      {
        j = localContentValues.size();
        k = paramT.AX().sKy.length;
        if (!localContentValues.containsKey("rowid")) {
          break label86;
        }
      }
    }
    label86:
    for (int i = 1;; i = 0)
    {
      if (j == i + k) {
        break label91;
      }
      Xr("replace failed, cv.size() != item.fields().length");
      return false;
      bool = false;
      break;
    }
    label91:
    if (b(localContentValues))
    {
      Xq("no need replace , fields no change");
      return true;
    }
    if (this.diF.replace(getTableName(), this.sKB.sKz, localContentValues) > 0L)
    {
      Xp(this.sKB.sKz);
      return true;
    }
    Xr("replace failed");
    return false;
  }
  
  public boolean a(T paramT, boolean paramBoolean)
  {
    ContentValues localContentValues = paramT.wH();
    if ((localContentValues == null) || (localContentValues.size() <= 0))
    {
      Xr("insert failed, value.size <= 0");
      return false;
    }
    paramT.sKx = this.diF.insert(getTableName(), this.sKB.sKz, localContentValues);
    if (paramT.sKx <= 0L)
    {
      Xr("insert failed");
      return false;
    }
    localContentValues.put("rowid", Long.valueOf(paramT.sKx));
    if (paramBoolean) {
      Xp(localContentValues.getAsString(this.sKB.sKz));
    }
    return true;
  }
  
  public boolean a(T paramT, boolean paramBoolean, String... paramVarArgs)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    paramT = paramT.wH();
    if ((paramT == null) || (paramT.size() <= 0)) {
      Xr("delete failed, value.size <= 0");
    }
    do
    {
      do
      {
        return bool2;
        if ((paramVarArgs != null) && (paramVarArgs.length > 0)) {
          break;
        }
        Xq("delete with primary key");
        if (this.diF.delete(getTableName(), this.sKB.sKz + " = ?", new String[] { bi.oV(paramT.getAsString(this.sKB.sKz)) }) > 0) {
          bool1 = true;
        }
        bool2 = bool1;
      } while (!bool1);
      bool2 = bool1;
    } while (!paramBoolean);
    doNotify();
    return bool1;
    StringBuilder localStringBuilder = a(paramT, paramVarArgs);
    if (localStringBuilder == null)
    {
      Xr("delete failed, check keys failed");
      return false;
    }
    if ((this.diF.delete(getTableName(), localStringBuilder.toString(), a(paramVarArgs, paramT)) > 0) && (paramBoolean))
    {
      Xp(this.sKB.sKz);
      return true;
    }
    Xr("delete failed");
    return false;
  }
  
  public boolean a(T paramT, String... paramVarArgs)
  {
    return a(paramT, true, paramVarArgs);
  }
  
  public Cursor axc()
  {
    return this.diF.query(getTableName(), this.sKB.columns, null, null, null, null, null);
  }
  
  public final boolean b(long paramLong, T paramT)
  {
    Cursor localCursor = this.diF.a(getTableName(), this.sKB.columns, "rowid = ?", new String[] { String.valueOf(paramLong) }, null, null, null, 2);
    if (localCursor.moveToFirst())
    {
      paramT.d(localCursor);
      localCursor.close();
      return true;
    }
    localCursor.close();
    return false;
  }
  
  public boolean b(T paramT)
  {
    return a(paramT, true);
  }
  
  public boolean b(T paramT, boolean paramBoolean, String... paramVarArgs)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    paramT = paramT.wH();
    if ((paramT == null) || (paramT.size() <= 0)) {
      Xr("update failed, value.size <= 0");
    }
    do
    {
      do
      {
        return bool2;
        if ((paramVarArgs != null) && (paramVarArgs.length > 0)) {
          break;
        }
        Xq("update with primary key");
        if (b(paramT))
        {
          Xq("no need replace , fields no change");
          return true;
        }
        if (this.diF.update(getTableName(), paramT, this.sKB.sKz + " = ?", new String[] { bi.oV(paramT.getAsString(this.sKB.sKz)) }) > 0) {
          bool1 = true;
        }
        bool2 = bool1;
      } while (!bool1);
      bool2 = bool1;
    } while (!paramBoolean);
    doNotify();
    return bool1;
    StringBuilder localStringBuilder = a(paramT, paramVarArgs);
    if (localStringBuilder == null)
    {
      Xr("update failed, check keys failed");
      return false;
    }
    if (this.diF.update(getTableName(), paramT, localStringBuilder.toString(), a(paramVarArgs, paramT)) > 0)
    {
      if (paramBoolean) {
        Xp(paramT.getAsString(this.sKB.sKz));
      }
      return true;
    }
    Xr("update failed");
    return false;
  }
  
  public boolean b(T paramT, String... paramVarArgs)
  {
    ContentValues localContentValues = paramT.wH();
    if ((localContentValues == null) || (localContentValues.size() <= 0))
    {
      Xr("get failed, value.size <= 0");
      return false;
    }
    if ((paramVarArgs == null) || (paramVarArgs.length <= 0))
    {
      Xq("get with primary key");
      paramVarArgs = this.diF.a(getTableName(), this.sKB.columns, this.sKB.sKz + " = ?", new String[] { bi.oV(localContentValues.getAsString(this.sKB.sKz)) }, null, null, null, 2);
      if (paramVarArgs.moveToFirst())
      {
        paramT.d(paramVarArgs);
        paramVarArgs.close();
        return true;
      }
      paramVarArgs.close();
      return false;
    }
    StringBuilder localStringBuilder = a(localContentValues, paramVarArgs);
    if (localStringBuilder == null)
    {
      Xr("get failed, check keys failed");
      return false;
    }
    paramVarArgs = this.diF.a(getTableName(), this.sKB.columns, localStringBuilder.toString(), a(paramVarArgs, localContentValues), null, null, null, 2);
    if (paramVarArgs.moveToFirst())
    {
      paramT.d(paramVarArgs);
      paramVarArgs.close();
      return true;
    }
    paramVarArgs.close();
    Xq("get failed, not found");
    return false;
  }
  
  public boolean c(T paramT, String... paramVarArgs)
  {
    return b(paramT, true, paramVarArgs);
  }
  
  public boolean delete(long paramLong)
  {
    boolean bool = true;
    if (this.diF.delete(getTableName(), "rowid = ?", new String[] { String.valueOf(paramLong) }) > 0) {}
    for (;;)
    {
      if (bool) {
        doNotify();
      }
      return bool;
      bool = false;
    }
  }
  
  public final boolean fV(String paramString1, String paramString2)
  {
    if (paramString1.length() == 0)
    {
      Xr("null or nill table");
      return false;
    }
    if ((paramString2 == null) || (paramString2.length() == 0))
    {
      Xr("null or nill sql");
      return false;
    }
    return this.diF.fV(paramString1, paramString2);
  }
  
  public int getCount()
  {
    int i = 0;
    Cursor localCursor = rawQuery("select count(*) from " + getTableName(), new String[0]);
    if (localCursor != null)
    {
      localCursor.moveToFirst();
      i = localCursor.getInt(0);
      localCursor.close();
    }
    return i;
  }
  
  public String getTableName()
  {
    return this.table;
  }
  
  public final Cursor rawQuery(String paramString, String... paramVarArgs)
  {
    return this.diF.rawQuery(paramString, paramVarArgs);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/sdk/e/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */