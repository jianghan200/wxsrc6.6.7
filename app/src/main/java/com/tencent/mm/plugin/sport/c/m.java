package com.tencent.mm.plugin.sport.c;

import android.database.Cursor;
import com.tencent.mm.bt.h;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.e.i;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteStatement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class m
  extends i<com.tencent.mm.plugin.sport.b.e>
{
  public static final String[] opo = { i.a(com.tencent.mm.plugin.sport.b.e.dhO, "SportStepItem") };
  private static final String[] opp = { String.format("CREATE INDEX IF NOT EXISTS %s_date ON %s(date);", new Object[] { "SportStepItem", "SportStepItem" }), String.format("CREATE INDEX IF NOT EXISTS %s_timestamp ON %s(timestamp);", new Object[] { "SportStepItem", "SportStepItem" }) };
  
  public m()
  {
    super(g.Ei().dqq, com.tencent.mm.plugin.sport.b.e.dhO, "SportStepItem", opp);
  }
  
  public static List<com.tencent.mm.plugin.sport.b.e> C(long paramLong1, long paramLong2)
  {
    ArrayList localArrayList = new ArrayList();
    Object localObject = String.format("SELECT * FROM %s WHERE timestamp >= ? AND timestamp <= ?;", new Object[] { "SportStepItem" });
    localObject = g.Ei().dqq.b((String)localObject, new String[] { String.valueOf(paramLong1), String.valueOf(paramLong2) }, 0);
    while (((Cursor)localObject).moveToNext())
    {
      com.tencent.mm.plugin.sport.b.e locale = new com.tencent.mm.plugin.sport.b.e();
      locale.d((Cursor)localObject);
      localArrayList.add(locale);
    }
    ((Cursor)localObject).close();
    return localArrayList;
  }
  
  public static void D(long paramLong1, long paramLong2)
  {
    String str = String.format("DELETE FROM %s WHERE timestamp >= %d AND timestamp <= endTime", new Object[] { "SportStepItem", Long.valueOf(paramLong1), Long.valueOf(paramLong2) });
    g.Ei().dqq.fV(null, str);
  }
  
  public static com.tencent.mm.plugin.sport.b.e bFy()
  {
    Object localObject1 = String.format("SELECT * FROM %s ORDER BY timestamp desc LIMIT 1;", new Object[] { "SportStepItem" });
    localObject1 = g.Ei().dqq.b((String)localObject1, null, 0);
    try
    {
      if (((Cursor)localObject1).moveToNext())
      {
        com.tencent.mm.plugin.sport.b.e locale = new com.tencent.mm.plugin.sport.b.e();
        locale.d((Cursor)localObject1);
        return locale;
      }
      return null;
    }
    finally
    {
      ((Cursor)localObject1).close();
    }
  }
  
  public static void cx(List<com.tencent.mm.plugin.sport.b.e> paramList)
  {
    SQLiteDatabase localSQLiteDatabase = g.Ei().dqq.coa();
    if (!localSQLiteDatabase.inTransaction()) {
      localSQLiteDatabase.beginTransaction();
    }
    SQLiteStatement localSQLiteStatement = localSQLiteDatabase.compileStatement(String.format("INSERT INTO %s (date, step, timestamp) VALUES (?,?,?)", new Object[] { "SportStepItem" }));
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      com.tencent.mm.plugin.sport.b.e locale = (com.tencent.mm.plugin.sport.b.e)paramList.next();
      localSQLiteStatement.bindString(1, locale.field_date);
      localSQLiteStatement.bindLong(2, locale.field_step);
      localSQLiteStatement.bindLong(3, locale.field_timestamp);
      localSQLiteStatement.execute();
    }
    if (localSQLiteDatabase.inTransaction())
    {
      localSQLiteDatabase.setTransactionSuccessful();
      localSQLiteDatabase.endTransaction();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/sport/c/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */