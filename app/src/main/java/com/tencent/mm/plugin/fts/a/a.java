package com.tencent.mm.plugin.fts.a;

import android.database.Cursor;
import com.tencent.mm.a.f;
import com.tencent.mm.plugin.fts.a.a.b;
import com.tencent.mm.plugin.fts.a.a.g;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.wcdb.database.SQLiteException;
import com.tencent.wcdb.database.SQLiteStatement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

public abstract class a
  implements i
{
  private volatile boolean isCreated;
  private boolean jpR;
  private f<String, String> jpS;
  public volatile h jpT;
  public SQLiteStatement jpU;
  private SQLiteStatement jpV;
  private SQLiteStatement jpW;
  private SQLiteStatement jpX;
  private SQLiteStatement jpY;
  public SQLiteStatement jpZ;
  private SQLiteStatement jqa;
  public SQLiteStatement jqb;
  
  public a()
  {
    x.i("MicroMsg.FTS.BaseFTS5NativeStorage", "Create %s", new Object[] { getName() });
  }
  
  private static String bq(String paramString, int paramInt)
  {
    return paramString + "​" + paramInt;
  }
  
  public abstract void BR();
  
  public boolean BS()
  {
    return false;
  }
  
  public boolean BT()
  {
    this.jpT = null;
    this.jpU.close();
    this.jpV.close();
    this.jpW.close();
    this.jpX.close();
    this.jpY.close();
    this.jqb.close();
    if (this.jpS != null) {
      this.jpS.clear();
    }
    return true;
  }
  
  public final void Cs(String paramString)
  {
    Object localObject = new HashSet();
    Iterator localIterator = this.jpS.map.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (str.startsWith(paramString)) {
        ((HashSet)localObject).add(str);
      }
    }
    paramString = ((HashSet)localObject).iterator();
    while (paramString.hasNext())
    {
      localObject = (String)paramString.next();
      this.jpS.remove(localObject);
    }
  }
  
  public final void D(String paramString, long paramLong)
  {
    this.jqa.bindLong(1, paramLong);
    this.jqa.bindString(2, paramString);
    this.jqa.execute();
  }
  
  public final Cursor a(g paramg, int[] paramArrayOfInt1, int[] paramArrayOfInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    String str2 = paramg.aQa();
    label72:
    label101:
    StringBuilder localStringBuilder;
    if (paramBoolean1)
    {
      paramg = String.format(", MMHighlight(%s, %d, type, subtype)", new Object[] { aPV(), Integer.valueOf(paramg.jrZ.size()) });
      if ((paramArrayOfInt2 == null) || (paramArrayOfInt2.length <= 0)) {
        break label238;
      }
      paramArrayOfInt2 = " AND subtype IN " + d.l(paramArrayOfInt2);
      if ((paramArrayOfInt1 == null) || (paramArrayOfInt1.length <= 0)) {
        break label244;
      }
      paramArrayOfInt1 = " AND type IN " + d.l(paramArrayOfInt1);
      localStringBuilder = new StringBuilder("SELECT %s.docid, type, subtype, entity_id, aux_index, timestamp");
      if (!paramBoolean2) {
        break label250;
      }
    }
    label238:
    label244:
    label250:
    for (String str1 = ", content";; str1 = "")
    {
      paramg = String.format(str1 + paramg + " FROM %s NOT INDEXED JOIN %s ON (%s.docid = %s.rowid) WHERE %s MATCH '%s'" + paramArrayOfInt1 + "" + " AND status >= 0" + paramArrayOfInt2 + ";", new Object[] { aPU(), aPU(), aPV(), aPU(), aPV(), aPV(), str2 });
      return this.jpT.rawQuery(paramg, null);
      paramg = "";
      break;
      paramArrayOfInt2 = "";
      break label72;
      paramArrayOfInt1 = "";
      break label101;
    }
  }
  
  public final Cursor a(int[] paramArrayOfInt, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5)
  {
    if ((!paramBoolean1) && (!paramBoolean2) && (!paramBoolean3) && (!paramBoolean4) && (!paramBoolean5)) {
      return com.tencent.mm.bt.d.cnR();
    }
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length == 0)) {
      return com.tencent.mm.bt.d.cnR();
    }
    Object localObject = new StringBuilder(64);
    if (paramBoolean1) {
      ((StringBuilder)localObject).append("docid,");
    }
    if (paramBoolean2) {
      ((StringBuilder)localObject).append("entity_id,");
    }
    if (paramBoolean3) {
      ((StringBuilder)localObject).append("aux_index,");
    }
    if (paramBoolean4) {
      ((StringBuilder)localObject).append("timestamp,");
    }
    if (paramBoolean5) {
      ((StringBuilder)localObject).append("status,");
    }
    ((StringBuilder)localObject).setLength(((StringBuilder)localObject).length() - 1);
    localObject = ((StringBuilder)localObject).toString();
    paramArrayOfInt = String.format("SELECT %s FROM %s WHERE type IN " + d.l(paramArrayOfInt) + ";", new Object[] { localObject, aPU() });
    return this.jpT.rawQuery(paramArrayOfInt, null);
  }
  
  public final void a(int paramInt1, int paramInt2, long paramLong1, String paramString1, long paramLong2, String paramString2)
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
        this.jpV.bindLong(1, paramInt1);
        this.jpV.bindLong(2, paramInt2);
        this.jpV.bindLong(3, paramLong1);
        this.jpV.bindString(4, paramString1);
        this.jpV.bindLong(5, paramLong2);
        this.jpV.execute();
        if (!bool) {
          this.jpT.commit();
        }
        if (!aPW()) {
          continue;
        }
        this.jpS.put(bq(paramString1, paramInt2), paramString2);
        return;
      }
      catch (SQLiteException paramString2)
      {
        x.e("MicroMsg.FTS.BaseFTS5NativeStorage", String.format("Failed inserting index: 0x%x, %d, %d, %s, %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Long.valueOf(paramLong1), paramString1, Long.valueOf(paramLong2) }));
        paramString1 = this.jqb.simpleQueryForString();
        if ((paramString1 != null) && (paramString1.length() > 0)) {
          x.e("MicroMsg.FTS.BaseFTS5NativeStorage", ">> " + paramString1);
        }
        throw paramString2;
      }
    }
  }
  
  public String aLZ()
  {
    return String.format("CREATE TABLE IF NOT EXISTS %s (docid INTEGER PRIMARY KEY, type INT, subtype INT DEFAULT 0, entity_id INTEGER, aux_index TEXT, timestamp INTEGER, status INT DEFAULT 0);", new Object[] { aPU() });
  }
  
  public final String aPU()
  {
    return "FTS5Meta" + getTableName();
  }
  
  public final String aPV()
  {
    return "FTS5Index" + getTableName();
  }
  
  public boolean aPW()
  {
    return false;
  }
  
  public final void b(int[] paramArrayOfInt, long paramLong)
  {
    ArrayList localArrayList = new ArrayList(16);
    paramArrayOfInt = String.format("SELECT docid FROM %s WHERE type IN " + d.l(paramArrayOfInt) + " AND entity_id=?;", new Object[] { aPU() });
    paramArrayOfInt = this.jpT.rawQuery(paramArrayOfInt, new String[] { Long.toString(paramLong) });
    while (paramArrayOfInt.moveToNext()) {
      localArrayList.add(Long.valueOf(paramArrayOfInt.getLong(0)));
    }
    paramArrayOfInt.close();
    bi(localArrayList);
  }
  
  public final void b(int[] paramArrayOfInt, String paramString)
  {
    ArrayList localArrayList = new ArrayList(16);
    paramArrayOfInt = String.format("SELECT docid FROM %s WHERE type IN " + d.l(paramArrayOfInt) + " AND aux_index=?;", new Object[] { aPU() });
    paramArrayOfInt = this.jpT.rawQuery(paramArrayOfInt, new String[] { paramString });
    while (paramArrayOfInt.moveToNext()) {
      localArrayList.add(Long.valueOf(paramArrayOfInt.getLong(0)));
    }
    paramArrayOfInt.close();
    bi(localArrayList);
  }
  
  public final void beginTransaction()
  {
    this.jpT.beginTransaction();
  }
  
  public final void bi(List<Long> paramList)
  {
    boolean bool = this.jpT.inTransaction();
    if (!bool) {
      this.jpT.beginTransaction();
    }
    Iterator localIterator = paramList.iterator();
    long l;
    while (localIterator.hasNext())
    {
      l = ((Long)localIterator.next()).longValue();
      this.jpW.bindLong(1, l);
      this.jpW.execute();
    }
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      l = ((Long)paramList.next()).longValue();
      this.jpX.bindLong(1, l);
      this.jpX.execute();
    }
    if (!bool) {
      commit();
    }
  }
  
  public final String br(String paramString, int paramInt)
  {
    if (aPW())
    {
      localObject = bq(paramString, paramInt);
      if (this.jpS.bb(localObject))
      {
        x.i("MicroMsg.FTS.BaseFTS5NativeStorage", "hit lru insert content map");
        return (String)this.jpS.get(localObject);
      }
    }
    Object localObject = String.format("SELECT content FROM %s JOIN %s ON (%s.docid = %s.rowid) WHERE aux_index=? AND subtype=?", new Object[] { aPU(), aPV(), aPU(), aPV() });
    localObject = this.jpT.rawQuery((String)localObject, new String[] { paramString, String.valueOf(paramInt) });
    paramString = null;
    if (((Cursor)localObject).moveToFirst()) {
      paramString = ((Cursor)localObject).getString(0);
    }
    ((Cursor)localObject).close();
    return paramString;
  }
  
  public final List<Long> c(int[] paramArrayOfInt, String paramString)
  {
    paramArrayOfInt = String.format("SELECT docid FROM %s WHERE aux_index=? AND type IN " + d.l(paramArrayOfInt) + ";", new Object[] { aPU() });
    paramArrayOfInt = this.jpT.rawQuery(paramArrayOfInt, new String[] { paramString });
    paramString = new ArrayList();
    while (paramArrayOfInt.moveToNext()) {
      paramString.add(Long.valueOf(paramArrayOfInt.getLong(0)));
    }
    paramArrayOfInt.close();
    g(paramString, 1);
    return paramString;
  }
  
  public final boolean cE(int paramInt1, int paramInt2)
  {
    return this.jpT.cE(paramInt1, paramInt2);
  }
  
  public final void commit()
  {
    this.jpT.commit();
  }
  
  /* Error */
  public final void create()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc 29
    //   4: ldc_w 385
    //   7: iconst_2
    //   8: anewarray 4	java/lang/Object
    //   11: dup
    //   12: iconst_0
    //   13: aload_0
    //   14: invokevirtual 35	com/tencent/mm/plugin/fts/a/a:getName	()Ljava/lang/String;
    //   17: aastore
    //   18: dup
    //   19: iconst_1
    //   20: aload_0
    //   21: getfield 387	com/tencent/mm/plugin/fts/a/a:isCreated	Z
    //   24: invokestatic 392	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   27: aastore
    //   28: invokestatic 41	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   31: aload_0
    //   32: getfield 387	com/tencent/mm/plugin/fts/a/a:isCreated	Z
    //   35: ifne +47 -> 82
    //   38: ldc_w 394
    //   41: invokestatic 400	com/tencent/mm/kernel/g:n	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/b/a;
    //   44: checkcast 394	com/tencent/mm/plugin/fts/a/n
    //   47: invokeinterface 403 1 0
    //   52: ifne +33 -> 85
    //   55: ldc 29
    //   57: ldc_w 405
    //   60: invokestatic 347	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   63: iconst_0
    //   64: istore_1
    //   65: iload_1
    //   66: ifeq +16 -> 82
    //   69: ldc 29
    //   71: ldc_w 407
    //   74: invokestatic 347	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   77: aload_0
    //   78: iconst_1
    //   79: putfield 387	com/tencent/mm/plugin/fts/a/a:isCreated	Z
    //   82: aload_0
    //   83: monitorexit
    //   84: return
    //   85: aload_0
    //   86: ldc_w 394
    //   89: invokestatic 400	com/tencent/mm/kernel/g:n	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/b/a;
    //   92: checkcast 394	com/tencent/mm/plugin/fts/a/n
    //   95: invokeinterface 411 1 0
    //   100: putfield 65	com/tencent/mm/plugin/fts/a/a:jpT	Lcom/tencent/mm/plugin/fts/a/h;
    //   103: ldc 29
    //   105: ldc_w 413
    //   108: invokestatic 347	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   111: aload_0
    //   112: invokevirtual 163	com/tencent/mm/plugin/fts/a/a:aPV	()Ljava/lang/String;
    //   115: astore_3
    //   116: aload_0
    //   117: invokevirtual 210	com/tencent/mm/plugin/fts/a/a:aPU	()Ljava/lang/String;
    //   120: astore_2
    //   121: ldc 29
    //   123: ldc_w 415
    //   126: iconst_3
    //   127: anewarray 4	java/lang/Object
    //   130: dup
    //   131: iconst_0
    //   132: aload_3
    //   133: aastore
    //   134: dup
    //   135: iconst_1
    //   136: aload_2
    //   137: aastore
    //   138: dup
    //   139: iconst_2
    //   140: aload_0
    //   141: invokevirtual 299	com/tencent/mm/plugin/fts/a/a:getTableName	()Ljava/lang/String;
    //   144: aastore
    //   145: invokestatic 41	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   148: aload_0
    //   149: getfield 65	com/tencent/mm/plugin/fts/a/a:jpT	Lcom/tencent/mm/plugin/fts/a/h;
    //   152: aload_3
    //   153: invokeinterface 418 2 0
    //   158: ifeq +276 -> 434
    //   161: aload_0
    //   162: getfield 65	com/tencent/mm/plugin/fts/a/a:jpT	Lcom/tencent/mm/plugin/fts/a/h;
    //   165: aload_2
    //   166: invokeinterface 418 2 0
    //   171: ifeq +263 -> 434
    //   174: aload_0
    //   175: invokevirtual 420	com/tencent/mm/plugin/fts/a/a:BS	()Z
    //   178: ifne +256 -> 434
    //   181: ldc 29
    //   183: ldc_w 422
    //   186: invokestatic 347	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   189: ldc_w 424
    //   192: iconst_1
    //   193: anewarray 4	java/lang/Object
    //   196: dup
    //   197: iconst_0
    //   198: aload_3
    //   199: aastore
    //   200: invokestatic 183	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   203: astore 4
    //   205: aload_0
    //   206: aload_0
    //   207: getfield 65	com/tencent/mm/plugin/fts/a/a:jpT	Lcom/tencent/mm/plugin/fts/a/h;
    //   210: aload 4
    //   212: invokeinterface 428 2 0
    //   217: putfield 67	com/tencent/mm/plugin/fts/a/a:jpU	Lcom/tencent/wcdb/database/SQLiteStatement;
    //   220: ldc_w 430
    //   223: iconst_1
    //   224: anewarray 4	java/lang/Object
    //   227: dup
    //   228: iconst_0
    //   229: aload_2
    //   230: aastore
    //   231: invokestatic 183	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   234: astore 4
    //   236: aload_0
    //   237: aload_0
    //   238: getfield 65	com/tencent/mm/plugin/fts/a/a:jpT	Lcom/tencent/mm/plugin/fts/a/h;
    //   241: aload 4
    //   243: invokeinterface 428 2 0
    //   248: putfield 74	com/tencent/mm/plugin/fts/a/a:jpV	Lcom/tencent/wcdb/database/SQLiteStatement;
    //   251: ldc_w 432
    //   254: iconst_1
    //   255: anewarray 4	java/lang/Object
    //   258: dup
    //   259: iconst_0
    //   260: aload_3
    //   261: aastore
    //   262: invokestatic 183	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   265: astore_3
    //   266: aload_0
    //   267: aload_0
    //   268: getfield 65	com/tencent/mm/plugin/fts/a/a:jpT	Lcom/tencent/mm/plugin/fts/a/h;
    //   271: aload_3
    //   272: invokeinterface 428 2 0
    //   277: putfield 76	com/tencent/mm/plugin/fts/a/a:jpW	Lcom/tencent/wcdb/database/SQLiteStatement;
    //   280: ldc_w 434
    //   283: iconst_1
    //   284: anewarray 4	java/lang/Object
    //   287: dup
    //   288: iconst_0
    //   289: aload_2
    //   290: aastore
    //   291: invokestatic 183	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   294: astore_3
    //   295: aload_0
    //   296: aload_0
    //   297: getfield 65	com/tencent/mm/plugin/fts/a/a:jpT	Lcom/tencent/mm/plugin/fts/a/h;
    //   300: aload_3
    //   301: invokeinterface 428 2 0
    //   306: putfield 78	com/tencent/mm/plugin/fts/a/a:jpX	Lcom/tencent/wcdb/database/SQLiteStatement;
    //   309: ldc_w 436
    //   312: iconst_1
    //   313: anewarray 4	java/lang/Object
    //   316: dup
    //   317: iconst_0
    //   318: aload_2
    //   319: aastore
    //   320: invokestatic 183	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   323: astore_3
    //   324: aload_0
    //   325: aload_0
    //   326: getfield 65	com/tencent/mm/plugin/fts/a/a:jpT	Lcom/tencent/mm/plugin/fts/a/h;
    //   329: aload_3
    //   330: invokeinterface 428 2 0
    //   335: putfield 80	com/tencent/mm/plugin/fts/a/a:jpY	Lcom/tencent/wcdb/database/SQLiteStatement;
    //   338: ldc_w 438
    //   341: iconst_1
    //   342: anewarray 4	java/lang/Object
    //   345: dup
    //   346: iconst_0
    //   347: aload_2
    //   348: aastore
    //   349: invokestatic 183	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   352: astore_3
    //   353: aload_0
    //   354: aload_0
    //   355: getfield 65	com/tencent/mm/plugin/fts/a/a:jpT	Lcom/tencent/mm/plugin/fts/a/h;
    //   358: aload_3
    //   359: invokeinterface 428 2 0
    //   364: putfield 440	com/tencent/mm/plugin/fts/a/a:jpZ	Lcom/tencent/wcdb/database/SQLiteStatement;
    //   367: ldc_w 442
    //   370: iconst_1
    //   371: anewarray 4	java/lang/Object
    //   374: dup
    //   375: iconst_0
    //   376: aload_2
    //   377: aastore
    //   378: invokestatic 183	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   381: astore_2
    //   382: aload_0
    //   383: aload_0
    //   384: getfield 65	com/tencent/mm/plugin/fts/a/a:jpT	Lcom/tencent/mm/plugin/fts/a/h;
    //   387: aload_2
    //   388: invokeinterface 428 2 0
    //   393: putfield 140	com/tencent/mm/plugin/fts/a/a:jqa	Lcom/tencent/wcdb/database/SQLiteStatement;
    //   396: aload_0
    //   397: aload_0
    //   398: getfield 65	com/tencent/mm/plugin/fts/a/a:jpT	Lcom/tencent/mm/plugin/fts/a/h;
    //   401: ldc_w 444
    //   404: invokeinterface 428 2 0
    //   409: putfield 82	com/tencent/mm/plugin/fts/a/a:jqb	Lcom/tencent/wcdb/database/SQLiteStatement;
    //   412: aload_0
    //   413: new 86	com/tencent/mm/a/f
    //   416: dup
    //   417: bipush 100
    //   419: invokespecial 445	com/tencent/mm/a/f:<init>	(I)V
    //   422: putfield 84	com/tencent/mm/plugin/fts/a/a:jpS	Lcom/tencent/mm/a/f;
    //   425: aload_0
    //   426: invokevirtual 447	com/tencent/mm/plugin/fts/a/a:BR	()V
    //   429: iconst_1
    //   430: istore_1
    //   431: goto -366 -> 65
    //   434: ldc 29
    //   436: ldc_w 449
    //   439: invokestatic 347	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   442: ldc_w 451
    //   445: iconst_1
    //   446: anewarray 4	java/lang/Object
    //   449: dup
    //   450: iconst_0
    //   451: aload_3
    //   452: aastore
    //   453: invokestatic 183	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   456: astore 4
    //   458: ldc_w 451
    //   461: iconst_1
    //   462: anewarray 4	java/lang/Object
    //   465: dup
    //   466: iconst_0
    //   467: aload_2
    //   468: aastore
    //   469: invokestatic 183	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   472: astore 5
    //   474: aload_0
    //   475: getfield 65	com/tencent/mm/plugin/fts/a/a:jpT	Lcom/tencent/mm/plugin/fts/a/h;
    //   478: aload 4
    //   480: invokeinterface 454 2 0
    //   485: aload_0
    //   486: getfield 65	com/tencent/mm/plugin/fts/a/a:jpT	Lcom/tencent/mm/plugin/fts/a/h;
    //   489: aload 5
    //   491: invokeinterface 454 2 0
    //   496: ldc_w 456
    //   499: iconst_1
    //   500: anewarray 4	java/lang/Object
    //   503: dup
    //   504: iconst_0
    //   505: aload_0
    //   506: invokevirtual 163	com/tencent/mm/plugin/fts/a/a:aPV	()Ljava/lang/String;
    //   509: aastore
    //   510: invokestatic 183	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   513: astore 4
    //   515: aload_0
    //   516: getfield 65	com/tencent/mm/plugin/fts/a/a:jpT	Lcom/tencent/mm/plugin/fts/a/h;
    //   519: aload 4
    //   521: invokeinterface 454 2 0
    //   526: aload_0
    //   527: invokevirtual 458	com/tencent/mm/plugin/fts/a/a:aLZ	()Ljava/lang/String;
    //   530: astore 4
    //   532: aload_0
    //   533: getfield 65	com/tencent/mm/plugin/fts/a/a:jpT	Lcom/tencent/mm/plugin/fts/a/h;
    //   536: aload 4
    //   538: invokeinterface 454 2 0
    //   543: ldc_w 460
    //   546: iconst_2
    //   547: anewarray 4	java/lang/Object
    //   550: dup
    //   551: iconst_0
    //   552: aload_2
    //   553: aastore
    //   554: dup
    //   555: iconst_1
    //   556: aload_2
    //   557: aastore
    //   558: invokestatic 183	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   561: astore 4
    //   563: aload_0
    //   564: getfield 65	com/tencent/mm/plugin/fts/a/a:jpT	Lcom/tencent/mm/plugin/fts/a/h;
    //   567: aload 4
    //   569: invokeinterface 454 2 0
    //   574: ldc_w 462
    //   577: iconst_2
    //   578: anewarray 4	java/lang/Object
    //   581: dup
    //   582: iconst_0
    //   583: aload_2
    //   584: aastore
    //   585: dup
    //   586: iconst_1
    //   587: aload_2
    //   588: aastore
    //   589: invokestatic 183	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   592: astore 4
    //   594: aload_0
    //   595: getfield 65	com/tencent/mm/plugin/fts/a/a:jpT	Lcom/tencent/mm/plugin/fts/a/h;
    //   598: aload 4
    //   600: invokeinterface 454 2 0
    //   605: ldc_w 464
    //   608: iconst_2
    //   609: anewarray 4	java/lang/Object
    //   612: dup
    //   613: iconst_0
    //   614: aload_2
    //   615: aastore
    //   616: dup
    //   617: iconst_1
    //   618: aload_2
    //   619: aastore
    //   620: invokestatic 183	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   623: astore 4
    //   625: aload_0
    //   626: getfield 65	com/tencent/mm/plugin/fts/a/a:jpT	Lcom/tencent/mm/plugin/fts/a/h;
    //   629: aload 4
    //   631: invokeinterface 454 2 0
    //   636: ldc_w 466
    //   639: iconst_2
    //   640: anewarray 4	java/lang/Object
    //   643: dup
    //   644: iconst_0
    //   645: aload_2
    //   646: aastore
    //   647: dup
    //   648: iconst_1
    //   649: aload_2
    //   650: aastore
    //   651: invokestatic 183	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   654: astore 4
    //   656: aload_0
    //   657: getfield 65	com/tencent/mm/plugin/fts/a/a:jpT	Lcom/tencent/mm/plugin/fts/a/h;
    //   660: aload 4
    //   662: invokeinterface 454 2 0
    //   667: goto -478 -> 189
    //   670: astore_2
    //   671: aload_0
    //   672: monitorexit
    //   673: aload_2
    //   674: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	675	0	this	a
    //   64	367	1	i	int
    //   120	530	2	str1	String
    //   670	4	2	localObject	Object
    //   115	337	3	str2	String
    //   203	458	4	str3	String
    //   472	18	5	str4	String
    // Exception table:
    //   from	to	target	type
    //   2	63	670	finally
    //   69	82	670	finally
    //   85	189	670	finally
    //   189	429	670	finally
    //   434	667	670	finally
  }
  
  public final void destroy()
  {
    x.i("MicroMsg.FTS.BaseFTS5NativeStorage", "OnDestroy %s | isDestroyed %b | isCreated %b", new Object[] { getName(), Boolean.valueOf(this.jpR), Boolean.valueOf(this.isCreated) });
    if ((!this.jpR) && (this.isCreated) && (BT()))
    {
      x.i("MicroMsg.FTS.BaseFTS5NativeStorage", "SetDestroyed");
      this.jpR = true;
    }
  }
  
  public final List<b> e(int[] paramArrayOfInt, int paramInt)
  {
    paramArrayOfInt = String.format("SELECT docid, type, subtype, aux_index FROM %s WHERE type IN " + d.l(paramArrayOfInt) + ";", new Object[] { aPU() });
    paramArrayOfInt = this.jpT.rawQuery(paramArrayOfInt, null);
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    while (paramArrayOfInt.moveToNext())
    {
      b localb = new b();
      localb.jrt = paramArrayOfInt.getLong(0);
      localb.type = paramArrayOfInt.getInt(1);
      localb.jru = paramArrayOfInt.getInt(2);
      localb.jrv = paramArrayOfInt.getString(3);
      localArrayList1.add(localb);
      localArrayList2.add(Long.valueOf(localb.jrt));
    }
    paramArrayOfInt.close();
    g(localArrayList2, paramInt);
    return localArrayList1;
  }
  
  public final void g(Long paramLong)
  {
    boolean bool = this.jpT.inTransaction();
    if (!bool) {
      this.jpT.beginTransaction();
    }
    this.jpW.bindLong(1, paramLong.longValue());
    this.jpW.execute();
    this.jpX.bindLong(1, paramLong.longValue());
    this.jpX.execute();
    if (!bool) {
      commit();
    }
  }
  
  public final void g(List<Long> paramList, int paramInt)
  {
    boolean bool = this.jpT.inTransaction();
    if (!bool) {
      this.jpT.beginTransaction();
    }
    this.jpY.bindLong(1, paramInt);
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      long l = ((Long)paramList.next()).longValue();
      this.jpY.bindLong(2, l);
      this.jpY.execute();
    }
    if (!bool) {
      this.jpT.commit();
    }
  }
  
  public String getTableName()
  {
    return "Common";
  }
  
  public final void k(int[] paramArrayOfInt)
  {
    ArrayList localArrayList = new ArrayList(2048);
    paramArrayOfInt = String.format("SELECT docid FROM %s WHERE type IN " + d.l(paramArrayOfInt) + ";", new Object[] { aPU() });
    paramArrayOfInt = this.jpT.rawQuery(paramArrayOfInt, null);
    while (paramArrayOfInt.moveToNext()) {
      localArrayList.add(Long.valueOf(paramArrayOfInt.getLong(0)));
    }
    paramArrayOfInt.close();
    bi(localArrayList);
  }
  
  public final void t(long paramLong1, long paramLong2)
  {
    this.jpT.t(paramLong1, paramLong2);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/fts/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */