package com.tencent.mm.plugin.fts.c;

import android.database.Cursor;
import com.tencent.mm.plugin.fts.a.a;
import com.tencent.mm.plugin.fts.a.a.g;
import com.tencent.mm.plugin.fts.a.d;
import com.tencent.mm.plugin.fts.a.h;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.wcdb.database.SQLiteException;
import com.tencent.wcdb.database.SQLiteStatement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class c
  extends a
{
  public SQLiteStatement jvj;
  private SQLiteStatement jvk;
  
  protected final void BR()
  {
    if (BS())
    {
      this.jpT.t(-105L, 3L);
      this.jpT.t(-200L, Long.MAX_VALUE);
    }
    this.jpT.execSQL(String.format("CREATE INDEX IF NOT EXISTS %s_timestamp ON %s(timestamp);", new Object[] { aPU(), aPU() }));
    this.jpT.execSQL(String.format("CREATE INDEX IF NOT EXISTS %s_talker ON %s(talker);", new Object[] { aPU(), aPU() }));
    String str = String.format("UPDATE %s SET status = ? WHERE aux_index = ? AND status <> ?", new Object[] { aPU() });
    this.jvj = this.jpT.compileStatement(str);
    str = String.format("INSERT INTO %s (docid, type, subtype, entity_id, aux_index, timestamp, talker) VALUES (last_insert_rowid(), ?, ?, ?, ?, ?, ?);", new Object[] { aPU() });
    this.jvk = this.jpT.compileStatement(str);
  }
  
  protected final boolean BS()
  {
    return !cE(-105, 3);
  }
  
  protected final boolean BT()
  {
    this.jvj.close();
    this.jvk.close();
    return super.BT();
  }
  
  public final Cursor a(g paramg, String paramString, Set<String> paramSet)
  {
    String str1 = paramg.aQa();
    if (!bi.oW(paramString)) {}
    for (paramg = String.format(" AND aux_index = '%s'", new Object[] { paramString });; paramg = "")
    {
      paramString = new StringBuffer();
      paramSet = paramSet.iterator();
      while (paramSet.hasNext())
      {
        String str2 = (String)paramSet.next();
        paramString.append("'");
        paramString.append(str2);
        paramString.append("'");
        paramString.append(",");
      }
      if (paramString.length() > 0) {}
      for (paramString = " AND talker IN (" + paramString.substring(0, paramString.length() - 1) + ")";; paramString = "")
      {
        paramg = String.format("SELECT %s.docid, type, subtype, entity_id, aux_index, timestamp, talker FROM %s JOIN %s ON (%s.docid = %s.rowid) WHERE %s MATCH '%s'" + paramString + paramg + " AND status >= 0;", new Object[] { aPU(), aPU(), aPV(), aPU(), aPV(), aPV(), str1 });
        return this.jpT.rawQuery(paramg, null);
      }
    }
  }
  
  public final Cursor a(g paramg, List<String> paramList)
  {
    paramg = paramg.aQa();
    Object localObject = new StringBuffer();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      ((StringBuffer)localObject).append("'");
      ((StringBuffer)localObject).append(str);
      ((StringBuffer)localObject).append("',");
    }
    localObject = ((StringBuffer)localObject).substring(0, ((StringBuffer)localObject).length() - 1);
    paramg = String.format("SELECT MessageCount(%d, aux_index) FROM %s NOT INDEXED JOIN %s ON (%s.docid = %s.rowid) WHERE %s MATCH '%s' AND aux_index IN (%s) AND status >= 0;", new Object[] { Integer.valueOf(paramList.size()), aPU(), aPV(), aPU(), aPV(), aPV(), paramg, localObject });
    return this.jpT.rawQuery(paramg, null);
  }
  
  public final void a(int paramInt, long paramLong1, String paramString1, long paramLong2, String paramString2, String paramString3)
  {
    try
    {
      this.jpU.bindString(1, paramString2);
      this.jpU.execute();
      this.jvk.bindLong(1, 65536L);
      this.jvk.bindLong(2, paramInt);
      this.jvk.bindLong(3, paramLong1);
      this.jvk.bindString(4, paramString1);
      this.jvk.bindLong(5, paramLong2);
      this.jvk.bindString(6, paramString3);
      this.jvk.execute();
      return;
    }
    catch (SQLiteException paramString2)
    {
      x.e("MicroMsg.FTS.FTS5MessageStorage", String.format("Failed inserting index: 0x%x, %d, %d, %s, %d", new Object[] { Integer.valueOf(65536), Integer.valueOf(paramInt), Long.valueOf(paramLong1), paramString1, Long.valueOf(paramLong2) }));
      paramString1 = this.jqb.simpleQueryForString();
      if ((paramString1 != null) && (paramString1.length() > 0)) {
        x.e("MicroMsg.FTS.FTS5MessageStorage", ">> " + paramString1);
      }
      throw paramString2;
    }
  }
  
  public final void a(int[] paramArrayOfInt, long paramLong1, long paramLong2)
  {
    ArrayList localArrayList = new ArrayList(4);
    paramArrayOfInt = String.format("SELECT docid FROM %s WHERE type IN " + d.l(paramArrayOfInt) + " AND entity_id=? AND timestamp=?;", new Object[] { aPU() });
    paramArrayOfInt = this.jpT.rawQuery(paramArrayOfInt, new String[] { Long.toString(paramLong1), Long.toString(paramLong2) });
    while (paramArrayOfInt.moveToNext()) {
      localArrayList.add(Long.valueOf(paramArrayOfInt.getLong(0)));
    }
    paramArrayOfInt.close();
    bi(localArrayList);
  }
  
  protected final String aLZ()
  {
    return String.format("CREATE TABLE IF NOT EXISTS %s (docid INTEGER PRIMARY KEY, type INT, subtype INT DEFAULT 0, entity_id INTEGER, aux_index TEXT, timestamp INTEGER, status INT DEFAULT 0, talker TEXT);", new Object[] { aPU() });
  }
  
  public final String getName()
  {
    return "FTS5MessageStorage";
  }
  
  public final int getPriority()
  {
    return 4;
  }
  
  protected final String getTableName()
  {
    return "Message";
  }
  
  public final int getType()
  {
    return 4;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/fts/c/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */