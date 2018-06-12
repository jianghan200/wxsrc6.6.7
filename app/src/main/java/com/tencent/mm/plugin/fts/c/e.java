package com.tencent.mm.plugin.fts.c;

import android.database.Cursor;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fts.a.a;
import com.tencent.mm.plugin.fts.a.a.k;
import com.tencent.mm.plugin.fts.a.c.a;
import com.tencent.mm.plugin.fts.a.h;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.wcdb.database.SQLiteStatement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

public final class e
  extends a
{
  public SQLiteStatement jvm;
  public SQLiteStatement jvn;
  public SQLiteStatement jvo;
  
  public static boolean CL(String paramString)
  {
    long l = System.currentTimeMillis();
    return ((com.tencent.mm.plugin.messenger.foundation.a.i)g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).bcY().GZ(paramString) < l - 5184000000L;
  }
  
  protected final void BR()
  {
    if (BS()) {
      this.jpT.t(-100L, 3L);
    }
    this.jpT.execSQL(String.format("CREATE INDEX IF NOT EXISTS %s_query ON %s(query);", new Object[] { aPU(), aPU() }));
    this.jpT.execSQL(String.format("CREATE INDEX IF NOT EXISTS %s_score ON %s(score);", new Object[] { aPU(), aPU() }));
    String str = String.format("INSERT INTO %s (content) VALUES (?);", new Object[] { aPV() });
    this.jvm = this.jpT.compileStatement(str);
    str = String.format("INSERT INTO %s (docid, type, subtype, entity_id, aux_index, timestamp, query, score, scene, meta_content) VALUES (last_insert_rowid(), ?, ?, ?, ?, ?, ?, ?, ?, ?);", new Object[] { aPU() });
    this.jvn = this.jpT.compileStatement(str);
    str = String.format("UPDATE %s SET status=? WHERE aux_index=?", new Object[] { aPU() });
    this.jvo = this.jpT.compileStatement(str);
  }
  
  protected final boolean BS()
  {
    return !cE(-100, 3);
  }
  
  protected final boolean BT()
  {
    super.BT();
    this.jvm.close();
    this.jvn.close();
    this.jvo.close();
    return true;
  }
  
  protected final String aLZ()
  {
    return String.format("CREATE TABLE IF NOT EXISTS %s (docid INTEGER PRIMARY KEY, type INT, subtype INT DEFAULT 0, entity_id INTEGER, aux_index TEXT, timestamp INTEGER, status INT DEFAULT 0, query TEXT COLLATE NOCASE, score INT, scene INT, meta_content TEXT);", new Object[] { aPU() });
  }
  
  public final int aQv()
  {
    Object localObject1 = String.format("SELECT docid, query, score, scene, aux_index, entity_id, type, subtype, timestamp, meta_content FROM %s WHERE status > 0;", new Object[] { aPU() });
    Object localObject2 = this.jpT.rawQuery((String)localObject1, null);
    localObject1 = new ArrayList();
    Object localObject3;
    while (((Cursor)localObject2).moveToNext())
    {
      localObject3 = new k();
      ((k)localObject3).d((Cursor)localObject2);
      ((List)localObject1).add(localObject3);
    }
    ((Cursor)localObject2).close();
    LinkedList localLinkedList1 = new LinkedList();
    LinkedList localLinkedList2 = new LinkedList();
    LinkedList localLinkedList3 = new LinkedList();
    Iterator localIterator = ((List)localObject1).iterator();
    boolean bool;
    while (localIterator.hasNext())
    {
      k localk = (k)localIterator.next();
      bool = false;
      if (localk.type == 262144) {
        localObject2 = ((n)g.n(n.class)).getFTSIndexStorage(17);
      }
      for (;;)
      {
        localObject1 = null;
        if (!bool) {
          localObject1 = ((com.tencent.mm.plugin.fts.a.i)localObject2).br(localk.jrv, localk.jru);
        }
        if (bi.oW((String)localObject1)) {
          break label459;
        }
        if (!localk.bWm.equals("​chatroom_tophits")) {
          break label397;
        }
        String[] arrayOfString = c.a.jqA.split(localk.jsB);
        localObject2 = "";
        int j = arrayOfString.length;
        int i = 0;
        while (i < j)
        {
          String str = arrayOfString[i];
          localObject3 = localObject2;
          if (((String)localObject1).indexOf(str) >= 0) {
            localObject3 = (String)localObject2 + str + "​";
          }
          i += 1;
          localObject2 = localObject3;
        }
        localObject2 = ((n)g.n(n.class)).getFTSIndexStorage(3);
        bool = CL(localk.jrv);
      }
      if (!localk.jsB.equals(localObject2))
      {
        localk.jsB = ((String)localObject2);
        localLinkedList2.add(Long.valueOf(localk.jsy));
        localLinkedList3.add(localk);
      }
      else
      {
        localLinkedList1.add(Long.valueOf(localk.jsy));
        continue;
        label397:
        if (!localk.jsB.equals(localObject1))
        {
          localk.jsB = ((String)localObject1);
          localLinkedList2.add(Long.valueOf(localk.jsy));
          localLinkedList3.add(localk);
        }
        else
        {
          localLinkedList1.add(Long.valueOf(localk.jsy));
          continue;
          label459:
          localLinkedList2.add(Long.valueOf(localk.jsy));
        }
      }
    }
    x.i("MicroMsg.FTS.FTS5TopHitsStorage", "updateTopHitsDirty deleteDocIdList=%d needToInsertTopHitListSize=%d normalDocIdList=%d", new Object[] { Integer.valueOf(localLinkedList2.size()), Integer.valueOf(localLinkedList3.size()), Integer.valueOf(localLinkedList1.size()) });
    if (localLinkedList2.size() > 0) {
      bi(localLinkedList2);
    }
    if (localLinkedList3.size() > 0)
    {
      bool = this.jpT.inTransaction();
      if (!bool) {
        this.jpT.beginTransaction();
      }
      localObject1 = localLinkedList3.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (k)((Iterator)localObject1).next();
        if (!bi.oW(((k)localObject2).jsB))
        {
          this.jvm.bindString(1, ((k)localObject2).jsB);
          this.jvm.execute();
          this.jvn.bindLong(1, ((k)localObject2).type);
          this.jvn.bindLong(2, ((k)localObject2).jru);
          this.jvn.bindLong(3, ((k)localObject2).jsA);
          this.jvn.bindString(4, ((k)localObject2).jrv);
          this.jvn.bindLong(5, ((k)localObject2).timestamp);
          this.jvn.bindString(6, ((k)localObject2).bWm);
          this.jvn.bindLong(7, ((k)localObject2).jsz);
          this.jvn.bindLong(8, ((k)localObject2).dDS);
          this.jvn.bindString(9, ((k)localObject2).jsB);
          this.jvn.execute();
        }
      }
      if (!bool) {
        commit();
      }
    }
    if (localLinkedList1.size() > 0) {
      g(localLinkedList1, 0);
    }
    return localLinkedList2.size();
  }
  
  public final String getName()
  {
    return "FTS5TopHitsStorage";
  }
  
  public final int getPriority()
  {
    return 768;
  }
  
  protected final String getTableName()
  {
    return "TopHits";
  }
  
  public final int getType()
  {
    return 1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/fts/c/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */