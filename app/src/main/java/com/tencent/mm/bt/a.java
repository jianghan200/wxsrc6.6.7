package com.tencent.mm.bt;

import android.database.Cursor;
import com.tencent.mm.compatible.e.l;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteDatabaseCorruptException;
import com.tencent.wcdb.database.SQLiteDirectCursor;
import com.tencent.wcdb.database.SQLiteException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import junit.framework.Assert;

public final class a
{
  public static final Pattern tdj = Pattern.compile("^[\\s]*CREATE[\\s]+TABLE[\\s]*", 2);
  private String Yy = "";
  String aAL;
  private boolean isNew = false;
  f tdk;
  String tdl = "";
  public boolean tdm = false;
  String tdn = "";
  public boolean tdo = false;
  
  private static void a(f paramf)
  {
    if (paramf.tdt != null) {}
    for (paramf = paramf.tdt;; paramf = paramf.tdu)
    {
      paramf = paramf.rawQueryWithFactory(SQLiteDirectCursor.FACTORY, "SELECT count(*) FROM sqlite_master;", null, null);
      if (paramf.moveToFirst()) {
        break;
      }
      throw new SQLiteException("Cannot get count for sqlite_master");
    }
    paramf.close();
  }
  
  private boolean a(String paramString1, long paramLong, String paramString2, boolean paramBoolean, String paramString3)
  {
    if (this.tdk != null) {
      throw new AssertionError();
    }
    this.aAL = com.tencent.mm.a.g.u((paramString2 + paramLong).getBytes()).substring(0, 7);
    if (!FileOp.cn(paramString1)) {}
    for (boolean bool = true;; bool = false)
    {
      this.isNew = bool;
      try
      {
        this.tdk = f.s(paramString1, this.aAL, paramBoolean);
        a(this.tdk);
        return true;
      }
      catch (SQLiteException localSQLiteException)
      {
        if (!(localSQLiteException instanceof SQLiteDatabaseCorruptException)) {
          break;
        }
      }
    }
    for (int i = 1;; i = 0)
    {
      if (i != 0)
      {
        paramString3 = q.getDeviceID(ad.getContext());
        int j = i;
        if (paramString3 != null)
        {
          j = i;
          if (!paramString3.equals(paramString2))
          {
            j = 0;
            paramString2 = com.tencent.mm.a.g.u((paramString3 + paramLong).getBytes()).substring(0, 7);
            try
            {
              this.tdk = f.s(paramString1, paramString2, paramBoolean);
              a(this.tdk);
              this.aAL = paramString2;
              l.zh().set(258, paramString3);
              com.tencent.mm.plugin.report.f.mDy.a(181L, 5L, 1L, false);
              return true;
            }
            catch (SQLiteException paramString2)
            {
              if ((paramString2 instanceof SQLiteDatabaseCorruptException)) {
                j = 1;
              }
            }
          }
        }
        if ((this.tdk == null) && (j != 0))
        {
          if (!paramBoolean) {
            i = 42;
          }
          for (;;)
          {
            com.tencent.mm.plugin.report.f.mDy.a(181L, i, 1L, true);
            f.ZJ(paramString1);
            if (paramString1.endsWith("EnMicroMsg.db")) {
              f.ZJ(com.tencent.mm.kernel.g.Ei().dqp + "dbback/EnMicroMsg.db");
            }
            try
            {
              this.tdk = f.s(paramString1, this.aAL, paramBoolean);
              a(this.tdk);
              this.isNew = true;
              com.tencent.mm.plugin.report.f.mDy.a(181L, 6L, 1L, false);
              return true;
            }
            catch (SQLiteException paramString1)
            {
              com.tencent.mm.plugin.report.f.mDy.a(181L, 7L, 1L, false);
            }
            if (f.cnX()) {
              i = 43;
            } else {
              i = 41;
            }
          }
        }
      }
      for (;;)
      {
        if (this.tdk != null)
        {
          this.tdk.close();
          this.tdk = null;
        }
        this.aAL = null;
        return false;
        if ((paramString3 != null) && (paramString3.length() > 0))
        {
          if (!FileOp.cn(paramString3)) {}
          for (bool = true;; bool = false)
          {
            this.isNew = bool;
            try
            {
              this.tdk = f.s(paramString3, this.aAL, paramBoolean);
              a(this.tdk);
              com.tencent.mm.plugin.report.f.mDy.a(181L, 6L, 1L, false);
              return true;
            }
            catch (SQLiteException paramString1)
            {
              com.tencent.mm.plugin.report.f.mDy.a(181L, 7L, 1L, false);
            }
          }
        }
      }
    }
  }
  
  private boolean a(HashMap<Integer, h.d> paramHashMap, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramHashMap == null) {}
    Object localObject3;
    for (int i = -1;; i = paramHashMap.size())
    {
      x.d("MicroMsg.DBInit", "createtables checkCreateIni:%b  tables:%d", new Object[] { Boolean.valueOf(paramBoolean1), Integer.valueOf(i) });
      localObject1 = "";
      if (!paramBoolean1) {
        break label316;
      }
      this.tdl = (this.tdk.getPath() + ".ini");
      localObject1 = new StringBuilder();
      if (paramHashMap == null) {
        break;
      }
      localObject2 = paramHashMap.values().iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = (h.d)((Iterator)localObject2).next();
        if (((h.d)localObject3).xb() == null)
        {
          x.e("MicroMsg.DBInit", "factory.getSQLs() is null: %s", new Object[] { localObject3.getClass().toString() });
          Assert.assertTrue("factory.getSQLs() is null:" + localObject3.getClass().toString(), false);
        }
        localObject3 = ((h.d)localObject3).xb();
        j = localObject3.length;
        i = 0;
        while (i < j)
        {
          ((StringBuilder)localObject1).append(localObject3[i].hashCode());
          i += 1;
        }
      }
    }
    Object localObject2 = com.tencent.mm.a.g.u(((StringBuilder)localObject1).toString().getBytes());
    Object localObject1 = localObject2;
    if (!paramBoolean2)
    {
      localObject3 = com.tencent.mm.sdk.e.a.getValue(this.tdl, "createmd5");
      localObject1 = localObject2;
      if (!bi.oW((String)localObject3))
      {
        localObject1 = localObject2;
        if (((String)localObject2).equals(localObject3))
        {
          x.i("MicroMsg.DBInit", "Create table factories not changed , no need create !  %s", new Object[] { this.tdk.getPath() });
          return true;
        }
      }
    }
    label316:
    this.tdk.execSQL("pragma auto_vacuum = 0 ");
    localObject2 = new g.a();
    this.tdk.beginTransaction();
    if (paramHashMap != null)
    {
      paramHashMap = paramHashMap.values().iterator();
      i = 0;
      String str;
      label550:
      for (;;)
      {
        j = i;
        if (!paramHashMap.hasNext()) {
          break;
        }
        localObject3 = ((h.d)paramHashMap.next()).xb();
        int k = localObject3.length;
        j = 0;
        for (;;)
        {
          if (j >= k) {
            break label550;
          }
          str = localObject3[j];
          try
          {
            this.tdk.execSQL(str);
            i += 1;
          }
          catch (Exception localException)
          {
            for (;;)
            {
              Matcher localMatcher = tdj.matcher(str);
              if ((localMatcher != null) && (localMatcher.matches())) {
                Assert.assertTrue("CreateTable failed:[" + str + "][" + localException.getMessage() + "]", false);
              } else {
                x.w("MicroMsg.DBInit", "CreateTable failed:[" + str + "][" + localException.getMessage() + "]");
              }
            }
          }
          j += 1;
        }
      }
    }
    int j = 0;
    long l = ((g.a)localObject2).Ad();
    this.tdk.endTransaction();
    x.i("MicroMsg.DBInit", "createtables end sql:%d trans:%d sqlCount:%d", new Object[] { Long.valueOf(l), Long.valueOf(((g.a)localObject2).Ad()), Integer.valueOf(j) });
    if (paramBoolean1) {
      com.tencent.mm.sdk.e.a.ap(this.tdl, "createmd5", (String)localObject1);
    }
    return true;
  }
  
  private void gc(String paramString1, String paramString2)
  {
    HashSet localHashSet = new HashSet();
    Object localObject = this.tdk.b("select * from " + paramString1 + " limit 1 ", null, 0);
    if (((Cursor)localObject).getCount() == 0)
    {
      ((Cursor)localObject).close();
      return;
    }
    ((Cursor)localObject).moveToFirst();
    int i = 0;
    while (i < ((Cursor)localObject).getColumnCount())
    {
      localHashSet.add(((Cursor)localObject).getColumnName(i));
      i += 1;
    }
    ((Cursor)localObject).close();
    Cursor localCursor = this.tdk.b("PRAGMA table_info( " + paramString2 + " )", null, 0);
    localObject = "";
    while (localCursor.moveToNext())
    {
      String str = localCursor.getString(localCursor.getColumnIndex("name"));
      if (localHashSet.contains(str))
      {
        localObject = (String)localObject + str;
        localObject = (String)localObject + ",";
      }
    }
    localCursor.close();
    localObject = ((String)localObject).substring(0, ((String)localObject).length() - 1);
    paramString1 = "insert into " + paramString2 + "(" + (String)localObject + ") select " + (String)localObject + " from " + paramString1 + ";";
    this.tdk.execSQL(paramString1);
  }
  
  private List<String> gd(String paramString1, String paramString2)
  {
    ArrayList localArrayList = new ArrayList();
    if (this.tdk == null) {
      return localArrayList;
    }
    Object localObject1 = this.tdk.b("PRAGMA table_info( " + paramString1 + " )", null, 0);
    if (localObject1 == null) {
      return localArrayList;
    }
    paramString1 = new HashMap();
    int i = ((Cursor)localObject1).getColumnIndex("name");
    int j = ((Cursor)localObject1).getColumnIndex("type");
    while (((Cursor)localObject1).moveToNext()) {
      paramString1.put(((Cursor)localObject1).getString(i), ((Cursor)localObject1).getString(j));
    }
    ((Cursor)localObject1).close();
    Object localObject2 = this.tdk.b("PRAGMA table_info( " + paramString2 + " )", null, 0);
    if (localObject2 == null) {
      return localArrayList;
    }
    localObject1 = new HashMap();
    i = ((Cursor)localObject2).getColumnIndex("name");
    j = ((Cursor)localObject2).getColumnIndex("type");
    while (((Cursor)localObject2).moveToNext()) {
      paramString1.put(((Cursor)localObject2).getString(i), ((Cursor)localObject2).getString(j));
    }
    ((Cursor)localObject2).close();
    localObject2 = new HashSet(paramString1.entrySet()).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      Object localObject3 = (Map.Entry)((Iterator)localObject2).next();
      String str1 = (String)((Map.Entry)localObject3).getKey();
      localObject3 = (String)((Map.Entry)localObject3).getValue();
      if ((localObject3 != null) && (((String)localObject3).length() > 0))
      {
        String str2 = (String)((Map)localObject1).get(str1);
        if (str2 == null)
        {
          localArrayList.add("ALTER TABLE " + paramString2 + " ADD COLUMN " + str1 + " " + (String)localObject3 + ";");
          paramString1.remove(str1);
        }
        else if (!((String)localObject3).toLowerCase().startsWith(str2.toLowerCase()))
        {
          x.e("MicroMsg.DBInit", "conflicting alter table on column: " + str1 + ", " + str2 + "<o-n>" + (String)localObject3);
          paramString1.remove(str1);
        }
      }
    }
    return localArrayList;
  }
  
  private boolean ge(String paramString1, String paramString2)
  {
    Cursor localCursor = this.tdk.b("select DISTINCT  tbl_name from sqlite_master;", null, 0);
    if (localCursor == null) {
      return false;
    }
    for (;;)
    {
      try
      {
        if (bi.oW(paramString2))
        {
          this.tdk.execSQL("ATTACH DATABASE '" + paramString1 + "' AS old KEY ''");
          if (!p(localCursor)) {
            break;
          }
          this.tdk.beginTransaction();
          int i = 0;
          if (i >= localCursor.getCount()) {
            break label412;
          }
          localCursor.moveToPosition(i);
          paramString1 = this.tdk.b("select * from old.sqlite_master where tbl_name = '" + localCursor.getString(0) + "'", null, 0);
          if (paramString1 == null) {
            break label438;
          }
          j = paramString1.getCount();
          paramString1.close();
          if (j != 0) {
            break label268;
          }
          x.w("MicroMsg.DBInit", "In old db not found :" + localCursor.getString(0));
          i += 1;
          continue;
        }
        this.tdk.execSQL("ATTACH DATABASE '" + paramString1 + "' AS old KEY '" + paramString2 + "'");
        continue;
        try
        {
          paramString1 = gd("old." + localCursor.getString(0), localCursor.getString(0)).iterator();
          while (paramString1.hasNext())
          {
            paramString2 = (String)paramString1.next();
            this.tdk.execSQL(paramString2);
          }
        }
        catch (Exception paramString1)
        {
          x.w("MicroMsg.DBInit", "Insertselect FAILED :" + localCursor.getString(0));
        }
      }
      catch (SQLiteDatabaseCorruptException paramString2)
      {
        x.e("MicroMsg.DBInit", "Attached database is corrupted: " + paramString1);
        FileOp.deleteFile(paramString1);
        throw paramString2;
      }
      label268:
      gc("old." + localCursor.getString(0), localCursor.getString(0));
      continue;
      label412:
      this.tdk.endTransaction();
      localCursor.close();
      this.tdk.execSQL("DETACH DATABASE old;");
      return true;
      label438:
      int j = 0;
    }
  }
  
  private boolean gf(String paramString1, String paramString2)
  {
    if (ge(paramString1, paramString2))
    {
      x.i("MicroMsg.DBInit", "system transfer success ,delete it path %s", new Object[] { paramString1 });
      x.i("MicroMsg.DBInit", "delete result :%b", new Object[] { Boolean.valueOf(com.tencent.mm.a.e.deleteFile(paramString1)) });
      return true;
    }
    x.i("MicroMsg.DBInit", "system transfer fail path %s", new Object[] { paramString1 });
    return false;
  }
  
  private boolean p(Cursor paramCursor)
  {
    HashSet localHashSet = new HashSet();
    Object localObject = new HashSet();
    int i = 0;
    while (i < paramCursor.getCount())
    {
      paramCursor.moveToPosition(i);
      localHashSet.add(paramCursor.getString(0));
      i += 1;
    }
    paramCursor = this.tdk.b("select DISTINCT tbl_name from old.sqlite_master;", null, 0);
    if (paramCursor == null) {
      return false;
    }
    i = 0;
    while (i < paramCursor.getCount())
    {
      paramCursor.moveToPosition(i);
      ((HashSet)localObject).add(paramCursor.getString(0));
      i += 1;
    }
    paramCursor.close();
    this.tdk.beginTransaction();
    paramCursor = ((HashSet)localObject).iterator();
    while (paramCursor.hasNext())
    {
      localObject = (String)paramCursor.next();
      if (!localHashSet.contains(localObject))
      {
        localObject = this.tdk.b("SELECT sql FROM old.sqlite_master WHERE type='table' AND tbl_name='" + (String)localObject + "'", null, 0);
        if (localObject != null)
        {
          String str = ((Cursor)localObject).getString(0);
          this.tdk.execSQL(str);
          ((Cursor)localObject).close();
        }
      }
    }
    this.tdk.endTransaction();
    return true;
  }
  
  public final boolean a(String paramString1, String paramString2, String paramString3, long paramLong, String paramString4, HashMap<Integer, h.d> paramHashMap, boolean paramBoolean)
  {
    boolean bool1;
    boolean bool3;
    boolean bool4;
    int i;
    label92:
    label125:
    int j;
    if (!bi.oW(paramString2))
    {
      bool1 = true;
      Assert.assertTrue("create SqliteDB enDbCachePath == null ", bool1);
      this.tdn = (paramString2 + ".errreport");
      if (this.tdk != null)
      {
        this.tdk.close();
        this.tdk = null;
      }
      boolean bool2 = com.tencent.mm.a.e.cn(paramString2);
      bool3 = com.tencent.mm.a.e.cn(paramString1);
      bool4 = com.tencent.mm.a.e.cn(paramString3);
      if ((bool2) || (!bool3)) {
        break label259;
      }
      i = 1;
      this.tdm = a(paramString2, paramLong, paramString4, f.cnW(), paramString3);
      boolean bool5 = this.tdm;
      if (this.tdk == null) {
        break label265;
      }
      bool1 = true;
      x.i("MicroMsg.DBInit", "initDb(en) path:%s enExist:%b oldExist:%b copyold:%b dbopenSUCC:%b db:%b thr:%s", new Object[] { paramString2, Boolean.valueOf(bool2), Boolean.valueOf(bool3), Boolean.valueOf(true), Boolean.valueOf(bool5), Boolean.valueOf(bool1), Thread.currentThread().getName() });
      if ((this.tdk == null) || (this.tdk.getPath().equals(paramString3)) || (!bool4)) {
        break label379;
      }
      j = 1;
      x.i("MicroMsg.DBInit", "backup db exsits, copy data to en db");
    }
    for (;;)
    {
      a(paramHashMap, paramBoolean, this.isNew);
      if ((!bool3) && (!bool4))
      {
        return true;
        bool1 = false;
        break;
        label259:
        i = 0;
        break label92;
        label265:
        bool1 = false;
        break label125;
      }
      if ((j != 0) || (i != 0)) {
        this.tdo = true;
      }
      if (j != 0)
      {
        this.aAL = com.tencent.mm.a.g.u((paramString4 + paramLong).getBytes()).substring(0, 7);
        gf(paramString3, this.aAL);
        com.tencent.mm.blink.a.i(201L, 1L);
      }
      if (i != 0)
      {
        paramBoolean = gf(paramString1, "");
        com.tencent.mm.blink.a.i(200L, 1L);
        return paramBoolean;
      }
      return this.tdk != null;
      label379:
      j = 0;
    }
  }
  
  public final boolean a(String paramString, HashMap<Integer, h.d> paramHashMap, boolean paramBoolean)
  {
    boolean bool1 = false;
    if (this.tdk != null)
    {
      this.tdk.close();
      this.tdk = null;
    }
    boolean bool2 = com.tencent.mm.a.e.cn(paramString);
    try
    {
      x.i("MicroMsg.DBInit", "initSysDB checkini:%b exist:%b db:%s ", new Object[] { Boolean.valueOf(true), Boolean.valueOf(bool2), paramString });
      this.tdk = f.bs(paramString, paramBoolean);
      paramBoolean = bool1;
      if (!bool2) {
        paramBoolean = true;
      }
      a(paramHashMap, true, paramBoolean);
      return true;
    }
    catch (SQLiteException paramString) {}
    return false;
  }
  
  public final String getError()
  {
    if ((bi.oW(this.Yy)) || (bi.oW(this.tdn))) {
      return "";
    }
    if (!bi.oW(com.tencent.mm.sdk.e.a.getValue(this.tdn, "Reported"))) {
      return "";
    }
    com.tencent.mm.sdk.e.a.ap(this.tdn, "Reported", "true");
    return this.Yy;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/bt/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */