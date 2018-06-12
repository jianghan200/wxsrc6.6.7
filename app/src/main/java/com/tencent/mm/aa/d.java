package com.tencent.mm.aa;

import android.content.Context;
import android.os.Environment;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.os.StatFs;
import android.os.SystemClock;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.report.f;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import com.tencent.wcdb.Cursor;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteDirectCursor;
import com.tencent.wcdb.database.SQLiteStatement;
import com.tencent.wcdb.support.CancellationSignal;
import com.tencent.wcdb.support.OperationCanceledException;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class d
  implements Runnable
{
  private static final long dGF = 1L;
  private SQLiteDatabase dGG = new b().getWritableDatabase();
  final Object dGH = new Object();
  HashMap<String, Long> dGI = new HashMap();
  private final Runnable dGJ = new Runnable()
  {
    /* Error */
    public final void run()
    {
      // Byte code:
      //   0: aload_0
      //   1: getfield 14	com/tencent/mm/aa/d$1:dGL	Lcom/tencent/mm/aa/d;
      //   4: invokestatic 25	com/tencent/mm/aa/d:a	(Lcom/tencent/mm/aa/d;)Ljava/lang/Object;
      //   7: astore_1
      //   8: aload_1
      //   9: monitorenter
      //   10: aload_0
      //   11: getfield 14	com/tencent/mm/aa/d$1:dGL	Lcom/tencent/mm/aa/d;
      //   14: invokestatic 29	com/tencent/mm/aa/d:b	(Lcom/tencent/mm/aa/d;)Ljava/util/HashMap;
      //   17: astore_2
      //   18: aload_0
      //   19: getfield 14	com/tencent/mm/aa/d$1:dGL	Lcom/tencent/mm/aa/d;
      //   22: new 31	java/util/HashMap
      //   25: dup
      //   26: invokespecial 32	java/util/HashMap:<init>	()V
      //   29: invokestatic 35	com/tencent/mm/aa/d:a	(Lcom/tencent/mm/aa/d;Ljava/util/HashMap;)Ljava/util/HashMap;
      //   32: pop
      //   33: aload_1
      //   34: monitorexit
      //   35: ldc 37
      //   37: new 39	java/lang/StringBuilder
      //   40: dup
      //   41: ldc 41
      //   43: invokespecial 44	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   46: aload_2
      //   47: invokevirtual 48	java/util/HashMap:size	()I
      //   50: invokevirtual 52	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
      //   53: invokevirtual 56	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   56: invokestatic 62	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
      //   59: aload_0
      //   60: getfield 14	com/tencent/mm/aa/d$1:dGL	Lcom/tencent/mm/aa/d;
      //   63: invokestatic 66	com/tencent/mm/aa/d:c	(Lcom/tencent/mm/aa/d;)Lcom/tencent/wcdb/database/SQLiteDatabase;
      //   66: ldc 68
      //   68: invokevirtual 74	com/tencent/wcdb/database/SQLiteDatabase:compileStatement	(Ljava/lang/String;)Lcom/tencent/wcdb/database/SQLiteStatement;
      //   71: astore_1
      //   72: aload_0
      //   73: getfield 14	com/tencent/mm/aa/d$1:dGL	Lcom/tencent/mm/aa/d;
      //   76: invokestatic 66	com/tencent/mm/aa/d:c	(Lcom/tencent/mm/aa/d;)Lcom/tencent/wcdb/database/SQLiteDatabase;
      //   79: invokevirtual 77	com/tencent/wcdb/database/SQLiteDatabase:beginTransaction	()V
      //   82: aload_2
      //   83: invokevirtual 81	java/util/HashMap:entrySet	()Ljava/util/Set;
      //   86: invokeinterface 87 1 0
      //   91: astore_2
      //   92: aload_2
      //   93: invokeinterface 93 1 0
      //   98: ifeq +84 -> 182
      //   101: aload_2
      //   102: invokeinterface 97 1 0
      //   107: checkcast 99	java/util/Map$Entry
      //   110: astore_3
      //   111: aload_1
      //   112: iconst_1
      //   113: aload_3
      //   114: invokeinterface 102 1 0
      //   119: checkcast 104	java/lang/String
      //   122: invokevirtual 110	com/tencent/wcdb/database/SQLiteStatement:bindString	(ILjava/lang/String;)V
      //   125: aload_1
      //   126: iconst_2
      //   127: aload_3
      //   128: invokeinterface 113 1 0
      //   133: checkcast 115	java/lang/Long
      //   136: invokevirtual 119	java/lang/Long:longValue	()J
      //   139: invokevirtual 123	com/tencent/wcdb/database/SQLiteStatement:bindLong	(IJ)V
      //   142: aload_1
      //   143: invokevirtual 126	com/tencent/wcdb/database/SQLiteStatement:execute	()V
      //   146: goto -54 -> 92
      //   149: astore_2
      //   150: ldc 37
      //   152: aload_2
      //   153: ldc -128
      //   155: iconst_0
      //   156: anewarray 4	java/lang/Object
      //   159: invokestatic 132	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   162: aload_0
      //   163: getfield 14	com/tencent/mm/aa/d$1:dGL	Lcom/tencent/mm/aa/d;
      //   166: invokestatic 66	com/tencent/mm/aa/d:c	(Lcom/tencent/mm/aa/d;)Lcom/tencent/wcdb/database/SQLiteDatabase;
      //   169: invokevirtual 135	com/tencent/wcdb/database/SQLiteDatabase:endTransaction	()V
      //   172: aload_1
      //   173: invokevirtual 138	com/tencent/wcdb/database/SQLiteStatement:close	()V
      //   176: return
      //   177: astore_2
      //   178: aload_1
      //   179: monitorexit
      //   180: aload_2
      //   181: athrow
      //   182: aload_0
      //   183: getfield 14	com/tencent/mm/aa/d$1:dGL	Lcom/tencent/mm/aa/d;
      //   186: invokestatic 66	com/tencent/mm/aa/d:c	(Lcom/tencent/mm/aa/d;)Lcom/tencent/wcdb/database/SQLiteDatabase;
      //   189: invokevirtual 141	com/tencent/wcdb/database/SQLiteDatabase:setTransactionSuccessful	()V
      //   192: aload_0
      //   193: getfield 14	com/tencent/mm/aa/d$1:dGL	Lcom/tencent/mm/aa/d;
      //   196: invokestatic 66	com/tencent/mm/aa/d:c	(Lcom/tencent/mm/aa/d;)Lcom/tencent/wcdb/database/SQLiteDatabase;
      //   199: invokevirtual 135	com/tencent/wcdb/database/SQLiteDatabase:endTransaction	()V
      //   202: aload_1
      //   203: invokevirtual 138	com/tencent/wcdb/database/SQLiteStatement:close	()V
      //   206: return
      //   207: astore_2
      //   208: aload_0
      //   209: getfield 14	com/tencent/mm/aa/d$1:dGL	Lcom/tencent/mm/aa/d;
      //   212: invokestatic 66	com/tencent/mm/aa/d:c	(Lcom/tencent/mm/aa/d;)Lcom/tencent/wcdb/database/SQLiteDatabase;
      //   215: invokevirtual 135	com/tencent/wcdb/database/SQLiteDatabase:endTransaction	()V
      //   218: aload_1
      //   219: invokevirtual 138	com/tencent/wcdb/database/SQLiteStatement:close	()V
      //   222: aload_2
      //   223: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	224	0	this	1
      //   7	212	1	localObject1	Object
      //   17	85	2	localObject2	Object
      //   149	4	2	localSQLiteException	com.tencent.wcdb.database.SQLiteException
      //   177	4	2	localObject3	Object
      //   207	16	2	localObject4	Object
      //   110	18	3	localEntry	java.util.Map.Entry
      // Exception table:
      //   from	to	target	type
      //   82	92	149	com/tencent/wcdb/database/SQLiteException
      //   92	146	149	com/tencent/wcdb/database/SQLiteException
      //   182	192	149	com/tencent/wcdb/database/SQLiteException
      //   10	35	177	finally
      //   178	180	177	finally
      //   82	92	207	finally
      //   92	146	207	finally
      //   150	162	207	finally
      //   182	192	207	finally
    }
  };
  final Runnable dGK = new Runnable()
  {
    public final void run()
    {
      com.tencent.mm.sdk.f.e.b(d.d(d.this), "Avatar Access Time Flusher", 4);
    }
  };
  CancellationSignal mCancellationSignal;
  
  static
  {
    int i = new StatFs(g.Ei().cachePath).getBlockSize();
    if ((i - 1 & i) == 0)
    {
      dGF = i;
      return;
    }
  }
  
  private HashMap<String, Long> Ko()
  {
    HashMap localHashMap = new HashMap();
    Cursor localCursor = this.dGG.rawQueryWithFactory(SQLiteDirectCursor.FACTORY, "SELECT * FROM AvatarFile", null, "AvatarFile", this.mCancellationSignal);
    try
    {
      while (localCursor.moveToNext()) {
        localHashMap.put(localCursor.getString(0), Long.valueOf(localCursor.getLong(1)));
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AvatarMigration", "Loaded access time from database, entries: " + localHashMap1.size());
    }
    finally
    {
      localCursor.close();
    }
    return localHashMap1;
  }
  
  private long a(File paramFile, int paramInt, List<b> paramList, List<a> paramList1, boolean paramBoolean, HashMap<String, Long> paramHashMap)
  {
    throwIfCanceled();
    long l1 = 0L;
    int i;
    a locala;
    if (paramInt > 0)
    {
      i = paramList1.size() - 1;
      locala = (a)paramList1.get(i);
    }
    for (;;)
    {
      Object localObject1;
      Object localObject2;
      if (paramInt < 2)
      {
        paramFile = paramFile.listFiles(new FileFilter()
        {
          public final boolean accept(File paramAnonymousFile)
          {
            return (paramAnonymousFile.isDirectory()) && (paramAnonymousFile.getName().length() == 2);
          }
        });
        if (paramFile == null) {
          return 0L;
        }
        int k = paramFile.length;
        j = 0;
        l1 = 0L;
        if (j < k)
        {
          localObject1 = paramFile[j];
          localObject2 = new a((byte)0);
          ((a)localObject2).dGN = i;
          ((a)localObject2).dGP = paramBoolean;
          if (locala != null) {
            locala.dGO += 1;
          }
          for (((a)localObject2).name = (locala.name + '/' + ((File)localObject1).getName());; ((a)localObject2).name = ((File)localObject1).getName())
          {
            paramList1.add(localObject2);
            l1 += a((File)localObject1, paramInt + 1, paramList, paramList1, paramBoolean, paramHashMap);
            j += 1;
            break;
          }
        }
        return l1;
      }
      paramFile = paramFile.listFiles(new FileFilter()
      {
        public final boolean accept(File paramAnonymousFile)
        {
          return (paramAnonymousFile.isFile()) && (paramAnonymousFile.getName().startsWith("user_"));
        }
      });
      if (paramFile == null) {
        return 0L;
      }
      int j = paramFile.length;
      paramInt = 0;
      if (paramInt < j)
      {
        paramList1 = paramFile[paramInt];
        localObject1 = new b((byte)0);
        ((b)localObject1).name = paramList1.getName();
        ((b)localObject1).size = (paramList1.length() + dGF - 1L & (dGF - 1L ^ 0xFFFFFFFFFFFFFFFF));
        ((b)localObject1).dGR = ((b)localObject1).name.startsWith("user_hd_");
        ((b)localObject1).dGP = paramBoolean;
        ((b)localObject1).dGN = i;
        if (locala != null) {
          locala.dGO += 1;
        }
        localObject2 = (Long)paramHashMap.remove(((b)localObject1).name);
        if (localObject2 != null) {}
        for (long l2 = ((Long)localObject2).longValue();; l2 = paramList1.lastModified())
        {
          ((b)localObject1).dGQ = l2;
          paramList.add(localObject1);
          l1 += ((b)localObject1).size;
          paramInt += 1;
          break;
        }
      }
      return l1;
      locala = null;
      i = -1;
    }
  }
  
  private static String a(a parama)
  {
    StringBuilder localStringBuilder = new StringBuilder(256);
    if (parama.dGP) {}
    for (String str = g.Ei().dqp;; str = g.Ei().cachePath)
    {
      localStringBuilder.append(str);
      localStringBuilder.append("avatar/").append(parama.name);
      return localStringBuilder.toString();
    }
  }
  
  private static String a(b paramb)
  {
    int i;
    String str2;
    String str3;
    StringBuilder localStringBuilder;
    if (paramb.dGR)
    {
      i = 8;
      str2 = paramb.name.substring(i, i + 2);
      str3 = paramb.name.substring(i + 2, i + 4);
      localStringBuilder = new StringBuilder(256);
      if (!paramb.dGP) {
        break label116;
      }
    }
    label116:
    for (String str1 = g.Ei().dqp;; str1 = g.Ei().cachePath)
    {
      localStringBuilder.append(str1);
      localStringBuilder.append("avatar/").append(str2).append('/').append(str3).append('/').append(paramb.name);
      return localStringBuilder.toString();
      i = 5;
      break;
    }
  }
  
  private static void be(int paramInt1, int paramInt2)
  {
    if (paramInt2 <= 0) {
      return;
    }
    f.mDy.a(857L, paramInt1, paramInt2, false);
  }
  
  private void i(HashMap<String, Long> paramHashMap)
  {
    if ((paramHashMap == null) || (paramHashMap.isEmpty())) {
      return;
    }
    SQLiteStatement localSQLiteStatement = this.dGG.compileStatement("DELETE FROM AvatarFile WHERE fileName = ?");
    this.dGG.beginTransaction();
    try
    {
      Iterator localIterator = paramHashMap.keySet().iterator();
      while (localIterator.hasNext())
      {
        localSQLiteStatement.bindString(1, (String)localIterator.next());
        localSQLiteStatement.execute(this.mCancellationSignal);
      }
      this.dGG.setTransactionSuccessful();
    }
    finally
    {
      this.dGG.endTransaction();
      localSQLiteStatement.close();
    }
    this.dGG.endTransaction();
    localSQLiteStatement.close();
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AvatarMigration", "Removed unused access time from database, entries: " + paramHashMap.size());
  }
  
  private void throwIfCanceled()
  {
    if (this.mCancellationSignal != null) {
      this.mCancellationSignal.throwIfCanceled();
    }
  }
  
  public final void run()
  {
    long l1 = g.Ei().DT().i(aa.a.sUP);
    if (System.currentTimeMillis() - l1 < 259200000L)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AvatarMigration", "Migration interval not reached, just return");
      return;
    }
    PowerManager.WakeLock localWakeLock = ((PowerManager)ad.getContext().getSystemService("power")).newWakeLock(1, "MicroMsg.AvatarMigration");
    for (;;)
    {
      long l2;
      int j;
      try
      {
        long l5 = SystemClock.uptimeMillis();
        localWakeLock.acquire(600000L);
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AvatarMigration", "Avatar migration task started.");
        be(0, 1);
        g.Em().cil().removeCallbacks(this.dGK);
        this.dGJ.run();
        throwIfCanceled();
        Object localObject3 = Ko();
        Object localObject2 = new ArrayList(2048);
        ArrayList localArrayList = new ArrayList(1024);
        Object localObject4 = new File(g.Ei().cachePath, "avatar");
        if (!((File)localObject4).isDirectory())
        {
          ((File)localObject4).delete();
          ((File)localObject4).mkdirs();
        }
        long l3 = a((File)localObject4, 0, (List)localObject2, localArrayList, false, (HashMap)localObject3);
        int m = ((ArrayList)localObject2).size();
        int n = localArrayList.size();
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AvatarMigration", "Listed all files in DATA, count: %d, totalSize: %d", new Object[] { Integer.valueOf(m), Long.valueOf(l3) });
        long l4 = a(new File(g.Ei().dqp, "avatar"), 0, (List)localObject2, localArrayList, true, (HashMap)localObject3);
        int i1 = ((ArrayList)localObject2).size() - m;
        int i2 = localArrayList.size();
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AvatarMigration", "Listed all files in STORAGE, count: %d, totalSize: %d", new Object[] { Integer.valueOf(i1), Long.valueOf(l4) });
        long l6 = dGF * localArrayList.size() + (l3 + l4);
        i((HashMap)localObject3);
        int k = 0;
        if (l6 > 536870912L)
        {
          i = 1;
          if (i != 0)
          {
            localObject3 = Environment.getDataDirectory();
            l1 = ((File)localObject3).getTotalSpace();
            l2 = ((File)localObject3).getFreeSpace() + l6 - Math.min(1073741824L, (l1 * 0.04D));
            if (l2 <= 402653184L) {
              break label1143;
            }
            l1 = 402653184L;
            l1 = l6 - l1;
            if (l1 <= 0L) {
              break label1171;
            }
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AvatarMigration", "Avatar cleanup threshold reached, size to remove: %.2f MB", new Object[] { Double.valueOf(l1 / 1048576.0D) });
            Collections.sort((List)localObject2, new Comparator()
            {
              private final long dGM = System.currentTimeMillis() - 7776000000L;
            });
            i = ((ArrayList)localObject2).size() - 1;
            if ((l1 <= 0L) || (i < 0)) {
              break label1171;
            }
            throwIfCanceled();
            localObject3 = (b)((ArrayList)localObject2).get(i);
            l2 = l1;
            if (FileOp.deleteFile(a((b)localObject3))) {
              l2 = l1 - ((b)localObject3).size;
            }
            j = ((b)localObject3).dGN;
            l1 = l2;
            if (j < 0) {
              break label1164;
            }
            localObject3 = (a)localArrayList.get(j);
            j = ((a)localObject3).dGO - 1;
            ((a)localObject3).dGO = j;
            if ((j != 0) || (!new File(a((a)localObject3)).delete())) {
              break label1164;
            }
            l1 -= dGF;
            j = ((a)localObject3).dGN;
            continue;
          }
        }
        else
        {
          localObject3 = Environment.getDataDirectory();
          l1 = ((File)localObject3).getTotalSpace();
          l2 = ((File)localObject3).getFreeSpace();
          if (l1 == 0L)
          {
            i = 1;
            continue;
          }
          if (l2 >= Math.min(786432000L, (l1 * 0.03D))) {
            break label1138;
          }
          i = 1;
          continue;
          j = k;
          if (i1 > 0)
          {
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AvatarMigration", "Migrate from STORAGE to DATA.");
            k = g.Ei().dqp.length();
            localObject3 = g.Ei().cachePath;
            localObject2 = ((ArrayList)localObject2).iterator();
            if (!((Iterator)localObject2).hasNext()) {
              break label1176;
            }
            localObject4 = (b)((Iterator)localObject2).next();
            throwIfCanceled();
            if (!((b)localObject4).dGP) {
              continue;
            }
            String str1 = a((b)localObject4);
            String str2 = (String)localObject3 + str1.substring(k);
            boolean bool = false;
            if (!FileOp.cn(str2))
            {
              new File(str2).getParentFile().mkdirs();
              if (FileOp.y(str1, str2) < 0L) {}
            }
            else
            {
              bool = FileOp.deleteFile(str1);
            }
            if (!bool) {
              continue;
            }
            j = ((b)localObject4).dGN;
            if (j >= 0)
            {
              localObject4 = (a)localArrayList.get(j);
              j = ((a)localObject4).dGO - 1;
              ((a)localObject4).dGO = j;
              if ((j != 0) || (!new File(a((a)localObject4)).delete())) {
                continue;
              }
              j = ((a)localObject4).dGN;
              continue;
            }
            continue;
          }
          g.Ei().DT().a(aa.a.sUP, Long.valueOf(System.currentTimeMillis()));
          l1 = (SystemClock.uptimeMillis() - l5) / 1000L;
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AvatarMigration", "Avatar migration finished, elapsed %d seconds.", new Object[] { Long.valueOf(l1) });
          be(3, 1);
          be(5, (int)l1);
          if (i != 0)
          {
            i = 1;
            be(6, i);
            if (j != 0)
            {
              i = 1;
              be(7, i);
              be(9, m);
              be(11, (int)((dGF * n + l3) / 1048576L));
              be(13, i1);
              be(15, (int)((dGF * (i2 - n) + l4) / 1048576L));
            }
          }
          else
          {
            i = 0;
            continue;
          }
          i = 0;
          continue;
        }
      }
      catch (OperationCanceledException localOperationCanceledException)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AvatarMigration", "Avatar migration task cancelled.");
        be(1, 1);
        return;
      }
      catch (Exception localException)
      {
        com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.AvatarMigration", localException, "Avatar migration failed.", new Object[0]);
        be(2, 1);
        f.mDy.c("MicroMsg.AvatarMigration", bi.i(localException), null);
        return;
      }
      finally
      {
        if (localWakeLock.isHeld()) {
          localWakeLock.release();
        }
      }
      int i = 0;
      continue;
      label1138:
      i = 0;
      continue;
      label1143:
      l1 = l2;
      if (l2 < 25165824L)
      {
        l1 = 25165824L;
        continue;
        label1164:
        i -= 1;
        continue;
        label1171:
        i = 1;
        continue;
        label1176:
        j = 1;
      }
    }
  }
  
  private static final class a
  {
    int dGN;
    int dGO;
    boolean dGP;
    String name;
  }
  
  private static final class b
  {
    int dGN;
    boolean dGP;
    long dGQ;
    boolean dGR;
    String name;
    long size;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/aa/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */