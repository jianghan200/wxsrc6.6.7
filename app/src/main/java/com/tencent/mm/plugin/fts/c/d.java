package com.tencent.mm.plugin.fts.c;

import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fts.a.h;
import com.tencent.mm.plugin.fts.a.i;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.wcdb.database.SQLiteStatement;

public final class d
  implements i
{
  private boolean isCreated;
  private boolean jpR;
  public h jpT;
  public SQLiteStatement jpU;
  public SQLiteStatement jpV;
  public SQLiteStatement jvl;
  
  public d()
  {
    x.i("MicroMsg.FTS.FTS5SOSHistoryStorage", "Create %s", new Object[] { "FTS5SOSHistoryStorage" });
  }
  
  public final String br(String paramString, int paramInt)
  {
    return null;
  }
  
  public final void create()
  {
    x.i("MicroMsg.FTS.FTS5SOSHistoryStorage", "OnCreate %s | isCreated =%b", new Object[] { "FTS5SOSHistoryStorage", Boolean.valueOf(this.isCreated) });
    int i;
    if (!this.isCreated)
    {
      if (((n)g.n(n.class)).isFTSContextReady()) {
        break label75;
      }
      x.i("MicroMsg.FTS.FTS5SOSHistoryStorage", "Create Fail!");
      i = 0;
      if (i != 0)
      {
        x.i("MicroMsg.FTS.FTS5SOSHistoryStorage", "SetCreated");
        this.isCreated = true;
      }
    }
    return;
    label75:
    this.jpT = ((n)g.n(n.class)).getFTSIndexDB();
    x.i("MicroMsg.FTS.FTS5SOSHistoryStorage", "Create Success!");
    if ((this.jpT.Cn("FTS5IndexSOSHistory")) && (this.jpT.Cn("FTS5MetaSOSHistory"))) {
      x.d("MicroMsg.FTS.FTS5SOSHistoryStorage", "Table Exist, Not Need To Create");
    }
    for (;;)
    {
      String str1 = String.format("INSERT INTO %s (content) VALUES (?);", new Object[] { "FTS5IndexSOSHistory" });
      this.jpU = this.jpT.compileStatement(str1);
      str1 = String.format("INSERT INTO %s (docid, history, timestamp) VALUES (last_insert_rowid(), ?, ?);", new Object[] { "FTS5MetaSOSHistory" });
      this.jpV = this.jpT.compileStatement(str1);
      str1 = String.format("UPDATE %s SET timestamp=? WHERE docid = ?", new Object[] { "FTS5MetaSOSHistory" });
      this.jvl = this.jpT.compileStatement(str1);
      i = 1;
      break;
      x.d("MicroMsg.FTS.FTS5SOSHistoryStorage", "Table Not Exist, Need To Create");
      str1 = String.format("DROP TABLE IF EXISTS %s;", new Object[] { "FTS5IndexSOSHistory" });
      String str2 = String.format("DROP TABLE IF EXISTS %s;", new Object[] { "FTS5MetaSOSHistory" });
      this.jpT.execSQL(str1);
      this.jpT.execSQL(str2);
      str1 = String.format("CREATE VIRTUAL TABLE %s USING fts5(content, tokenize='mmSimple', prefix='1 2 3 4 5');", new Object[] { "FTS5IndexSOSHistory" });
      this.jpT.execSQL(str1);
      str1 = String.format("CREATE TABLE IF NOT EXISTS %s (docid INTEGER PRIMARY KEY, history TEXT, timestamp INTEGER);", new Object[] { "FTS5MetaSOSHistory" });
      this.jpT.execSQL(str1);
      this.jpT.execSQL(String.format("CREATE INDEX IF NOT EXISTS SOSHistory_history ON %s(history);", new Object[] { "FTS5MetaSOSHistory" }));
      this.jpT.execSQL(String.format("CREATE INDEX IF NOT EXISTS SOSHistory_timestamp ON %s(timestamp);", new Object[] { "FTS5MetaSOSHistory" }));
    }
  }
  
  public final void destroy()
  {
    x.i("MicroMsg.FTS.FTS5SOSHistoryStorage", "OnDestroy %s | isDestroyed %b | isCreated %b", new Object[] { "FTS5SOSHistoryStorage", Boolean.valueOf(this.jpR), Boolean.valueOf(this.isCreated) });
    if ((!this.jpR) && (this.isCreated))
    {
      this.jpU.close();
      this.jvl.close();
      this.jpV.close();
      x.i("MicroMsg.FTS.FTS5SOSHistoryStorage", "SetDestroyed");
      this.jpR = true;
    }
  }
  
  public final String getName()
  {
    return "FTS5SOSHistoryStorage";
  }
  
  public final int getPriority()
  {
    return 1024;
  }
  
  public final int getType()
  {
    return 1024;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/fts/c/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */