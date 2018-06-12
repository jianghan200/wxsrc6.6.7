package com.tencent.mm.plugin.fav.b.a;

import com.tencent.mm.plugin.fts.a.d;
import com.tencent.mm.plugin.fts.a.h;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.wcdb.database.SQLiteException;
import com.tencent.wcdb.database.SQLiteStatement;

public final class a
  extends com.tencent.mm.plugin.fts.a.a
{
  private SQLiteStatement iXn;
  
  protected final void BR()
  {
    if (BS()) {
      this.jpT.t(-106L, 4L);
    }
    String str = String.format("INSERT INTO %s (docid, type, subtype, entity_id, aux_index, timestamp, fav_type) VALUES (last_insert_rowid(), ?, ?, ?, ?, ?, ?);", new Object[] { aPU() });
    this.iXn = this.jpT.compileStatement(str);
  }
  
  protected final boolean BS()
  {
    return !cE(-106, 4);
  }
  
  public final void a(int paramInt1, long paramLong1, String paramString1, long paramLong2, String paramString2, int paramInt2)
  {
    paramString2 = d.Cu(paramString2);
    if (bi.oW(paramString2)) {}
    for (;;)
    {
      return;
      boolean bool = this.jpT.inTransaction();
      if (!bool) {
        this.jpT.beginTransaction();
      }
      try
      {
        this.jpU.bindString(1, paramString2);
        this.jpU.execute();
        this.iXn.bindLong(1, 196608L);
        this.iXn.bindLong(2, paramInt1);
        this.iXn.bindLong(3, paramLong1);
        this.iXn.bindString(4, paramString1);
        this.iXn.bindLong(5, paramLong2);
        this.iXn.bindLong(6, paramInt2);
        this.iXn.execute();
        if (bool) {
          continue;
        }
        this.jpT.commit();
        return;
      }
      catch (SQLiteException paramString2)
      {
        x.e("MicroMsg.FTS.FTS5FavoriteStorage", String.format("Failed inserting index: 0x%x, %d, %d, %s, %d", new Object[] { Integer.valueOf(196608), Integer.valueOf(paramInt1), Long.valueOf(paramLong1), paramString1, Long.valueOf(paramLong2) }));
        paramString1 = this.jqb.simpleQueryForString();
        if ((paramString1 != null) && (paramString1.length() > 0)) {
          x.e("MicroMsg.FTS.FTS5FavoriteStorage", ">> " + paramString1);
        }
        throw paramString2;
      }
    }
  }
  
  protected final String aLZ()
  {
    return String.format("CREATE TABLE IF NOT EXISTS %s (docid INTEGER PRIMARY KEY, type INT, subtype INT DEFAULT 0, entity_id INTEGER, aux_index TEXT, timestamp INTEGER, status INT DEFAULT 0, fav_type INT DEFAULT 0);", new Object[] { aPU() });
  }
  
  public final String getName()
  {
    return "FTS5FavoriteStorage";
  }
  
  public final int getPriority()
  {
    return 256;
  }
  
  protected final String getTableName()
  {
    return "Favorite";
  }
  
  public final int getType()
  {
    return 256;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/fav/b/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */