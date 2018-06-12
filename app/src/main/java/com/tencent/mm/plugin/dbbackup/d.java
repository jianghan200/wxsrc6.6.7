package com.tencent.mm.plugin.dbbackup;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.os.PowerManager;
import com.tencent.mm.ak.o;
import com.tencent.mm.bt.h.d;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.model.ar;
import com.tencent.mm.model.au;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.storage.az;
import com.tencent.mm.ui.MMAppMgr;
import com.tencent.wcdb.database.SQLiteCipherSpec;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteDirectCursor;
import com.tencent.wcdb.repair.BackupKit;
import com.tencent.wcdb.repair.RecoverKit;
import com.tencent.wcdb.repair.RepairKit;
import com.tencent.wcdb.repair.RepairKit.MasterInfo;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

public final class d
  implements ar
{
  private static final SQLiteCipherSpec hZZ = new SQLiteCipherSpec().setPageSize(1024).setSQLCipherVersion(1);
  private volatile BackupKit hZL;
  private volatile RecoverKit hZM;
  private volatile RepairKit hZN;
  private volatile boolean hZO = false;
  private boolean hZP = false;
  private boolean hZQ = false;
  private long hZR = 0L;
  private long hZS = 600000L;
  private long hZT = 0L;
  private int hZU = 10;
  private boolean hZV = false;
  final SimpleDateFormat hZW = new SimpleDateFormat("HH:mm:ss.SSS");
  private j.a hZX;
  private com.tencent.mm.sdk.b.c hZY;
  private boolean hsR = false;
  private boolean hsS = true;
  private BroadcastReceiver hsT;
  private Runnable hsU;
  
  /* Error */
  private static boolean a(String paramString, long[] paramArrayOfLong)
  {
    // Byte code:
    //   0: new 108	com/tencent/mm/vfs/g
    //   3: dup
    //   4: new 110	java/lang/StringBuilder
    //   7: dup
    //   8: invokespecial 111	java/lang/StringBuilder:<init>	()V
    //   11: aload_0
    //   12: invokevirtual 115	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   15: ldc 117
    //   17: invokevirtual 115	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   20: invokevirtual 121	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   23: invokespecial 122	com/tencent/mm/vfs/g:<init>	(Ljava/lang/String;)V
    //   26: astore 7
    //   28: aload 7
    //   30: astore 6
    //   32: aload_1
    //   33: arraylength
    //   34: istore_3
    //   35: iconst_0
    //   36: istore_2
    //   37: iload_2
    //   38: iload_3
    //   39: if_icmpge +47 -> 86
    //   42: aload_1
    //   43: iload_2
    //   44: laload
    //   45: lstore 4
    //   47: aload 7
    //   49: astore 6
    //   51: aload 7
    //   53: new 110	java/lang/StringBuilder
    //   56: dup
    //   57: invokespecial 111	java/lang/StringBuilder:<init>	()V
    //   60: lload 4
    //   62: invokestatic 127	java/lang/Long:toString	(J)Ljava/lang/String;
    //   65: invokevirtual 115	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   68: ldc -127
    //   70: invokevirtual 115	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   73: invokevirtual 121	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   76: invokevirtual 132	com/tencent/mm/vfs/g:write	(Ljava/lang/String;)V
    //   79: iload_2
    //   80: iconst_1
    //   81: iadd
    //   82: istore_2
    //   83: goto -46 -> 37
    //   86: aload 7
    //   88: invokevirtual 135	com/tencent/mm/vfs/g:close	()V
    //   91: iconst_1
    //   92: ireturn
    //   93: astore 8
    //   95: aconst_null
    //   96: astore_1
    //   97: aload_1
    //   98: astore 6
    //   100: ldc -119
    //   102: aload 8
    //   104: ldc -117
    //   106: iconst_1
    //   107: anewarray 4	java/lang/Object
    //   110: dup
    //   111: iconst_0
    //   112: aload_0
    //   113: aastore
    //   114: invokestatic 145	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   117: aload_1
    //   118: ifnull +7 -> 125
    //   121: aload_1
    //   122: invokevirtual 135	com/tencent/mm/vfs/g:close	()V
    //   125: iconst_0
    //   126: ireturn
    //   127: astore_0
    //   128: aconst_null
    //   129: astore 6
    //   131: aload 6
    //   133: ifnull +8 -> 141
    //   136: aload 6
    //   138: invokevirtual 135	com/tencent/mm/vfs/g:close	()V
    //   141: aload_0
    //   142: athrow
    //   143: astore_0
    //   144: iconst_1
    //   145: ireturn
    //   146: astore_0
    //   147: goto -22 -> 125
    //   150: astore_1
    //   151: goto -10 -> 141
    //   154: astore_0
    //   155: goto -24 -> 131
    //   158: astore 8
    //   160: aload 7
    //   162: astore_1
    //   163: goto -66 -> 97
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	166	0	paramString	String
    //   0	166	1	paramArrayOfLong	long[]
    //   36	47	2	i	int
    //   34	6	3	j	int
    //   45	16	4	l	long
    //   30	107	6	localObject	Object
    //   26	135	7	localg	com.tencent.mm.vfs.g
    //   93	10	8	localIOException1	java.io.IOException
    //   158	1	8	localIOException2	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   0	28	93	java/io/IOException
    //   0	28	127	finally
    //   86	91	143	java/io/IOException
    //   121	125	146	java/io/IOException
    //   136	141	150	java/io/IOException
    //   32	35	154	finally
    //   51	79	154	finally
    //   100	117	154	finally
    //   32	35	158	java/io/IOException
    //   51	79	158	java/io/IOException
  }
  
  private static void aCE()
  {
    Object localObject = com.tencent.mm.model.c.c.Jx().fJ("100274");
    if (((com.tencent.mm.storage.c)localObject).isValid())
    {
      localObject = ((com.tencent.mm.storage.c)localObject).ckq();
      HashMap localHashMap = new HashMap();
      localHashMap.put("flags", Integer.valueOf(bi.getInt((String)((Map)localObject).get("flags"), 0)));
      localHashMap.put("acp", Integer.valueOf(bi.getInt((String)((Map)localObject).get("acp"), 100)));
      com.tencent.mm.bt.f.ax(localHashMap);
    }
  }
  
  static void aCF()
  {
    Object localObject = com.tencent.mm.model.c.FT();
    ((com.tencent.mm.plugin.messenger.foundation.a.a.f)localObject).bdd();
    ((com.tencent.mm.plugin.messenger.foundation.a.a.f)localObject).bdf();
    ((com.tencent.mm.plugin.messenger.foundation.a.a.f)localObject).bde();
    com.tencent.mm.model.c.FW().clB();
    o.Pf().OP();
    localObject = com.tencent.mm.model.c.DT();
    ((com.tencent.mm.storage.x)localObject).a(aa.a.sPi, Integer.valueOf(0));
    ((com.tencent.mm.storage.x)localObject).a(aa.a.sPj, Integer.valueOf(0));
    ((com.tencent.mm.storage.x)localObject).a(aa.a.sPk, Integer.valueOf(0));
  }
  
  public static void aCG()
  {
    MMAppMgr.lE(true);
  }
  
  public static void cY(Context paramContext)
  {
    MMAppMgr.h(paramContext, true);
  }
  
  /* Error */
  private static long[] yG(String paramString)
  {
    // Byte code:
    //   0: lconst_0
    //   1: lstore 7
    //   3: new 311	java/io/BufferedReader
    //   6: dup
    //   7: new 313	com/tencent/mm/vfs/f
    //   10: dup
    //   11: new 110	java/lang/StringBuilder
    //   14: dup
    //   15: invokespecial 111	java/lang/StringBuilder:<init>	()V
    //   18: aload_0
    //   19: invokevirtual 115	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   22: ldc 117
    //   24: invokevirtual 115	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   27: invokevirtual 121	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   30: invokespecial 314	com/tencent/mm/vfs/f:<init>	(Ljava/lang/String;)V
    //   33: invokespecial 317	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   36: astore 10
    //   38: aload 10
    //   40: astore 9
    //   42: aload 10
    //   44: invokevirtual 320	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   47: astore 11
    //   49: aload 11
    //   51: ifnull +220 -> 271
    //   54: aload 10
    //   56: astore 9
    //   58: aload 11
    //   60: invokestatic 324	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   63: lstore_1
    //   64: aload 10
    //   66: astore 9
    //   68: aload 10
    //   70: invokevirtual 320	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   73: astore 11
    //   75: aload 11
    //   77: ifnull +189 -> 266
    //   80: aload 10
    //   82: astore 9
    //   84: aload 11
    //   86: invokestatic 324	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   89: lstore_3
    //   90: aload 10
    //   92: astore 9
    //   94: aload 10
    //   96: invokevirtual 320	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   99: astore 11
    //   101: aload 11
    //   103: ifnull +157 -> 260
    //   106: aload 10
    //   108: astore 9
    //   110: aload 11
    //   112: invokestatic 324	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   115: lstore 5
    //   117: aload 10
    //   119: astore 9
    //   121: aload 10
    //   123: invokevirtual 320	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   126: astore 11
    //   128: aload 11
    //   130: ifnull +14 -> 144
    //   133: aload 10
    //   135: astore 9
    //   137: aload 11
    //   139: invokestatic 324	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   142: lstore 7
    //   144: aload 10
    //   146: astore 9
    //   148: iconst_4
    //   149: newarray <illegal type>
    //   151: astore 11
    //   153: aload 11
    //   155: iconst_0
    //   156: lload_1
    //   157: lastore
    //   158: aload 11
    //   160: iconst_1
    //   161: lload_3
    //   162: lastore
    //   163: aload 11
    //   165: iconst_2
    //   166: lload 5
    //   168: lastore
    //   169: aload 11
    //   171: iconst_3
    //   172: lload 7
    //   174: lastore
    //   175: aload 10
    //   177: invokevirtual 325	java/io/BufferedReader:close	()V
    //   180: aload 11
    //   182: areturn
    //   183: astore 11
    //   185: aconst_null
    //   186: astore 10
    //   188: aload 10
    //   190: astore 9
    //   192: ldc -119
    //   194: aload 11
    //   196: ldc_w 327
    //   199: iconst_1
    //   200: anewarray 4	java/lang/Object
    //   203: dup
    //   204: iconst_0
    //   205: aload_0
    //   206: aastore
    //   207: invokestatic 145	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   210: aload 10
    //   212: ifnull +8 -> 220
    //   215: aload 10
    //   217: invokevirtual 325	java/io/BufferedReader:close	()V
    //   220: aconst_null
    //   221: areturn
    //   222: astore_0
    //   223: aconst_null
    //   224: astore 9
    //   226: aload 9
    //   228: ifnull +8 -> 236
    //   231: aload 9
    //   233: invokevirtual 325	java/io/BufferedReader:close	()V
    //   236: aload_0
    //   237: athrow
    //   238: astore_0
    //   239: aload 11
    //   241: areturn
    //   242: astore_0
    //   243: goto -23 -> 220
    //   246: astore 9
    //   248: goto -12 -> 236
    //   251: astore_0
    //   252: goto -26 -> 226
    //   255: astore 11
    //   257: goto -69 -> 188
    //   260: lconst_0
    //   261: lstore 5
    //   263: goto -146 -> 117
    //   266: lconst_0
    //   267: lstore_3
    //   268: goto -178 -> 90
    //   271: lconst_0
    //   272: lstore_1
    //   273: goto -209 -> 64
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	276	0	paramString	String
    //   63	210	1	l1	long
    //   89	179	3	l2	long
    //   115	147	5	l3	long
    //   1	172	7	l4	long
    //   40	192	9	localBufferedReader1	java.io.BufferedReader
    //   246	1	9	localIOException	java.io.IOException
    //   36	180	10	localBufferedReader2	java.io.BufferedReader
    //   47	134	11	localObject	Object
    //   183	57	11	localException1	Exception
    //   255	1	11	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   3	38	183	java/lang/Exception
    //   3	38	222	finally
    //   175	180	238	java/io/IOException
    //   215	220	242	java/io/IOException
    //   231	236	246	java/io/IOException
    //   42	49	251	finally
    //   58	64	251	finally
    //   68	75	251	finally
    //   84	90	251	finally
    //   94	101	251	finally
    //   110	117	251	finally
    //   121	128	251	finally
    //   137	144	251	finally
    //   148	153	251	finally
    //   192	210	251	finally
    //   42	49	255	java/lang/Exception
    //   58	64	255	java/lang/Exception
    //   68	75	255	java/lang/Exception
    //   84	90	255	java/lang/Exception
    //   94	101	255	java/lang/Exception
    //   110	117	255	java/lang/Exception
    //   121	128	255	java/lang/Exception
    //   137	144	255	java/lang/Exception
    //   148	153	255	java/lang/Exception
  }
  
  public final HashMap<Integer, h.d> Ci()
  {
    return null;
  }
  
  @Deprecated
  public final int a(b paramb)
  {
    au.HU();
    Object localObject1 = com.tencent.mm.model.c.DP();
    if ((localObject1 == null) || (((String)localObject1).isEmpty())) {}
    do
    {
      return -3;
      localObject1 = new com.tencent.mm.vfs.b((String)localObject1);
    } while (!((com.tencent.mm.vfs.b)localObject1).canRead());
    Object localObject2 = new StringBuilder().append(q.zy());
    au.HU();
    localObject2 = com.tencent.mm.a.g.u(com.tencent.mm.model.c.Df().getBytes()).substring(0, 7);
    long l1 = ((com.tencent.mm.vfs.b)localObject1).length() * 2L;
    long l2 = bi.cja();
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreDBBackup", "db recover needSize : %d blockSize:%d", new Object[] { Long.valueOf(l1), Long.valueOf(l2) });
    if (l2 < l1) {
      return -2;
    }
    au.Em().uW();
    au.Em().L(new d.4(this, (com.tencent.mm.vfs.b)localObject1, (String)localObject2, paramb));
    return 0;
  }
  
  @Deprecated
  public final int a(String paramString, b paramb)
  {
    try
    {
      paramString = new d.2(this, au.HU(), paramString, bi.cja(), paramb);
      this.hZO = true;
      au.Em().uW();
      au.Em().L(paramString);
      return 0;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public final boolean a(boolean paramBoolean, b paramb)
  {
    if (this.hZO)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreDBBackup", "Backup or recover task is in progress, %s canceled", new Object[] { "backup" });
      return false;
    }
    com.tencent.mm.model.c localc = au.HU();
    String str1 = com.tencent.mm.model.c.DR();
    SQLiteDatabase localSQLiteDatabase = com.tencent.mm.model.c.FO().coa();
    String str2 = str1 + ".bak";
    String str3 = str2 + ".tmp";
    String str4 = str1 + ".sm";
    String str5 = str4 + ".tmp";
    int j = 8;
    int i = j;
    boolean bool = paramBoolean;
    long l2;
    long l3;
    long l4;
    Object localObject;
    if (paramBoolean)
    {
      if (com.tencent.mm.vfs.d.cn(str2))
      {
        i = 24;
        com.tencent.mm.vfs.d.y(str2, str3);
        bool = paramBoolean;
      }
    }
    else
    {
      l2 = -1L;
      l3 = -1L;
      l4 = -1L;
      localObject = localSQLiteDatabase.rawQueryWithFactory(SQLiteDirectCursor.FACTORY, "SELECT max(msgId) FROM message;", null, null);
      if (!((Cursor)localObject).moveToFirst()) {
        break label862;
      }
    }
    label397:
    label610:
    label689:
    label856:
    label862:
    for (long l1 = ((Cursor)localObject).getLong(0);; l1 = -1L)
    {
      ((Cursor)localObject).close();
      localObject = localSQLiteDatabase.rawQueryWithFactory(SQLiteDirectCursor.FACTORY, "SELECT max(id) FROM ImgInfo2;", null, null);
      if (((Cursor)localObject).moveToFirst()) {
        l2 = ((Cursor)localObject).getLong(0);
      }
      ((Cursor)localObject).close();
      localObject = localSQLiteDatabase.rawQueryWithFactory(SQLiteDirectCursor.FACTORY, "SELECT max(rowid) FROM videoinfo2;", null, null);
      if (((Cursor)localObject).moveToFirst()) {
        l3 = ((Cursor)localObject).getLong(0);
      }
      ((Cursor)localObject).close();
      localObject = localSQLiteDatabase.rawQueryWithFactory(SQLiteDirectCursor.FACTORY, "SELECT max(rowid) FROM EmojiInfo;", null, null);
      if (((Cursor)localObject).moveToFirst()) {
        l4 = ((Cursor)localObject).getLong(0);
      }
      ((Cursor)localObject).close();
      long[] arrayOfLong = new long[4];
      arrayOfLong[0] = l1;
      arrayOfLong[1] = l2;
      arrayOfLong[2] = l3;
      arrayOfLong[3] = l4;
      String[] arrayOfString;
      if (bool)
      {
        localObject = yG(str1);
        if ((localObject == null) || (localObject.length < 4)) {
          break label689;
        }
        arrayOfString = new String[12];
        arrayOfString[0] = "message";
        arrayOfString[1] = String.format("msgId > %d AND msgId <= %d", new Object[] { Long.valueOf(localObject[0]), Long.valueOf(arrayOfLong[0]) });
        arrayOfString[2] = "ImgInfo2";
        arrayOfString[3] = String.format("id > %d AND id <= %d", new Object[] { Long.valueOf(localObject[1]), Long.valueOf(arrayOfLong[1]) });
        arrayOfString[4] = "videoinfo2";
        arrayOfString[5] = String.format("rowid > %d AND rowid <= %d", new Object[] { Long.valueOf(localObject[2]), Long.valueOf(arrayOfLong[2]) });
        arrayOfString[6] = "EmojiInfo";
        arrayOfString[7] = String.format("rowid > %d AND rowid <= %d", new Object[] { Long.valueOf(localObject[3]), Long.valueOf(arrayOfLong[3]) });
        arrayOfString[8] = "conversation";
        arrayOfString[9] = null;
        arrayOfString[10] = "rconversation";
        arrayOfString[11] = null;
        if (localObject != null) {
          break label856;
        }
      }
      for (paramBoolean = false;; paramBoolean = bool)
      {
        if (this.hZV) {
          i |= 0x3;
        }
        for (;;)
        {
          paramb = new d.1(this, paramb, localc, str4, paramBoolean, localSQLiteDatabase, str5, str1, str3, (long[])localObject, arrayOfLong, i, arrayOfString, str2);
          this.hZO = true;
          com.tencent.mm.sdk.f.e.post(paramb, "DB Backup");
          return true;
          bool = false;
          i = j;
          break;
          localObject = null;
          break label397;
          arrayOfString = new String[12];
          arrayOfString[0] = "message";
          arrayOfString[1] = ("msgId <= " + arrayOfLong[0]);
          arrayOfString[2] = "ImgInfo2";
          arrayOfString[3] = ("id <= " + arrayOfLong[1]);
          arrayOfString[4] = "videoinfo2";
          arrayOfString[5] = ("rowid <= " + arrayOfLong[2]);
          arrayOfString[6] = "EmojiInfo";
          arrayOfString[7] = ("rowid <= " + arrayOfLong[3]);
          arrayOfString[8] = "conversation";
          arrayOfString[9] = null;
          arrayOfString[10] = "rconversation";
          arrayOfString[11] = null;
          break label610;
        }
      }
    }
  }
  
  /* Error */
  public final boolean aCD()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: aload_0
    //   3: monitorenter
    //   4: aload_0
    //   5: iconst_0
    //   6: putfield 57	com/tencent/mm/plugin/dbbackup/d:hZO	Z
    //   9: aload_0
    //   10: getfield 92	com/tencent/mm/plugin/dbbackup/d:hZL	Lcom/tencent/wcdb/repair/BackupKit;
    //   13: astore_2
    //   14: aload_2
    //   15: ifnonnull +7 -> 22
    //   18: aload_0
    //   19: monitorexit
    //   20: iload_1
    //   21: ireturn
    //   22: aload_0
    //   23: getfield 92	com/tencent/mm/plugin/dbbackup/d:hZL	Lcom/tencent/wcdb/repair/BackupKit;
    //   26: invokevirtual 538	com/tencent/wcdb/repair/BackupKit:onCancel	()V
    //   29: iconst_1
    //   30: istore_1
    //   31: goto -13 -> 18
    //   34: astore_2
    //   35: aload_0
    //   36: monitorexit
    //   37: aload_2
    //   38: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	39	0	this	d
    //   1	30	1	bool	boolean
    //   13	2	2	localBackupKit	BackupKit
    //   34	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   4	14	34	finally
    //   22	29	34	finally
  }
  
  @Deprecated
  public final int b(String paramString, b paramb)
  {
    int i = 0;
    for (;;)
    {
      com.tencent.mm.model.c localc;
      String str;
      long l;
      try
      {
        localc = au.HU();
        str = paramString;
        if (paramString == null) {
          str = com.tencent.mm.model.c.DP();
        }
        l = bi.cja();
        if (str == null)
        {
          paramString = null;
          if (paramString != null)
          {
            boolean bool = paramString.canRead();
            if (bool) {}
          }
          else
          {
            i = -3;
            return i;
          }
        }
        else
        {
          paramString = new com.tencent.mm.vfs.b(str);
          continue;
        }
      }
      finally {}
      tmp82_79[0] = Long.valueOf(paramString.length());
      Object[] tmp92_82 = tmp82_79;
      tmp92_82[1] = Long.valueOf(l);
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreDBBackup", "[Repair] inFileSize: %d, diskFreeSpace: %d", tmp92_82);
      if ((float)l < (float)paramString.length() * 1.5F)
      {
        i = -2;
      }
      else
      {
        paramString = new d.3(this, tmp92_82, str, paramb);
        this.hZO = true;
        au.Em().uW();
        au.Em().L(paramString);
      }
    }
  }
  
  public final void bn(boolean paramBoolean)
  {
    au.HU();
    Object localObject1 = com.tencent.mm.model.c.DT();
    SQLiteDatabase localSQLiteDatabase = com.tencent.mm.model.c.FO().coa();
    this.hZT = ((com.tencent.mm.storage.x)localObject1).Dj(237569);
    this.hZU = ((com.tencent.mm.storage.x)localObject1).getInt(237570, 10);
    Object localObject2;
    label112:
    label117:
    label333:
    label345:
    Object localObject3;
    if (((com.tencent.mm.storage.x)localObject1).getInt(237571, 0) != 0)
    {
      paramBoolean = true;
      this.hZV = paramBoolean;
      localObject1 = ad.getContext();
      localObject2 = ((Context)localObject1).registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
      if (localObject2 == null) {
        break label803;
      }
      int i = ((Intent)localObject2).getIntExtra("status", -1);
      if ((i != 2) && (i != 5)) {
        break label798;
      }
      paramBoolean = true;
      this.hsR = paramBoolean;
      this.hsS = ((PowerManager)((Context)localObject1).getSystemService("power")).isScreenOn();
      this.hZX = new d.7(this);
      com.tencent.mm.model.c.c.Jx().c(this.hZX);
      aCE();
      this.hZY = new d.8(this);
      a.sFg.b(this.hZY);
      this.hsT = new d.9(this);
      localObject2 = new IntentFilter();
      ((IntentFilter)localObject2).addAction("android.intent.action.SCREEN_ON");
      ((IntentFilter)localObject2).addAction("android.intent.action.SCREEN_OFF");
      ((IntentFilter)localObject2).addAction("android.intent.action.ACTION_POWER_CONNECTED");
      ((IntentFilter)localObject2).addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
      ((Context)localObject1).registerReceiver(this.hsT, (IntentFilter)localObject2);
      com.tencent.mm.pluginsdk.cmd.b.a(new c(this), new String[] { "//recover-old", "//recover", "//post-recover", "//backupdb", "//recoverdb", "//repairdb", "//corruptdb", "//iotracedb", "//recover-status" });
      if (!this.hZQ) {
        break label811;
      }
      localObject1 = "enabled";
      if (!this.hsS) {
        break label819;
      }
      localObject2 = "";
      if (!this.hsR) {
        break label827;
      }
      localObject3 = "";
      label357:
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreDBBackup", "Auto database backup %s. Device status:%s interactive,%s charging.", new Object[] { localObject1, localObject2, localObject3 });
      localObject1 = localSQLiteDatabase.getPath();
      localObject3 = (String)localObject1 + ".sm";
      localObject2 = (String)localObject3 + ".tmp";
      localObject1 = com.tencent.mm.kernel.g.Ei().DT();
      long l2 = ((com.tencent.mm.storage.x)localObject1).Dj(237569);
      l1 = System.currentTimeMillis();
      localObject3 = new com.tencent.mm.vfs.b((String)localObject3);
      if ((!((com.tencent.mm.vfs.b)localObject3).isFile()) || (l1 - l2 <= 86400000L))
      {
        l2 = System.nanoTime();
        StringBuilder localStringBuilder = new StringBuilder().append(q.zy());
        au.HU();
        paramBoolean = RepairKit.MasterInfo.save(localSQLiteDatabase, (String)localObject2, com.tencent.mm.a.g.v(com.tencent.mm.model.c.Df().getBytes()));
        localObject2 = new com.tencent.mm.vfs.b((String)localObject2);
        if (!paramBoolean) {
          break label835;
        }
        ((com.tencent.mm.vfs.b)localObject3).delete();
        paramBoolean = ((com.tencent.mm.vfs.b)localObject2).a((com.tencent.mm.vfs.b)localObject3);
        ((com.tencent.mm.storage.x)localObject1).setLong(237569, l1);
        ((com.tencent.mm.storage.x)localObject1).lm(false);
        label582:
        l1 = System.nanoTime();
        if (!paramBoolean) {
          break label844;
        }
        localObject1 = "SUCCEEDED";
        label595:
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreDBBackup", "Master table backup %s, elapsed %.3f", new Object[] { localObject1, Float.valueOf((float)(l1 - l2) / 1.0E9F) });
        localObject1 = com.tencent.mm.plugin.report.service.h.mEJ;
        if (!paramBoolean) {
          break label852;
        }
      }
    }
    label798:
    label803:
    label811:
    label819:
    label827:
    label835:
    label844:
    label852:
    for (long l1 = 24L;; l1 = 25L)
    {
      ((com.tencent.mm.plugin.report.service.h)localObject1).a(181L, l1, 1L, false);
      com.tencent.mm.vfs.d.deleteFile(com.tencent.mm.kernel.g.Ei().dqp + "dbback/EnMicroMsg.db.bak");
      com.tencent.mm.vfs.d.deleteFile(com.tencent.mm.kernel.g.Ei().dqp + "dbback/corrupted/EnMicroMsg.db.bak");
      com.tencent.mm.vfs.d.deleteFile(com.tencent.mm.kernel.g.Ei().cachePath + "EnMicroMsg.db.bak");
      com.tencent.mm.vfs.d.deleteFile(com.tencent.mm.kernel.g.Ei().cachePath + "corrupted/EnMicroMsg.db.bak");
      localObject1 = com.tencent.mm.model.c.Gp();
      au.Em().h(new d.6(this, (String)localObject1), 60000L);
      return;
      paramBoolean = false;
      break;
      paramBoolean = false;
      break label112;
      this.hsR = false;
      break label117;
      localObject1 = "disabled";
      break label333;
      localObject2 = " not";
      break label345;
      localObject3 = " not";
      break label357;
      ((com.tencent.mm.vfs.b)localObject2).delete();
      break label582;
      localObject1 = "FAILED";
      break label595;
    }
  }
  
  public final void bo(boolean paramBoolean) {}
  
  public final void gi(int paramInt) {}
  
  public final void onAccountRelease()
  {
    aCD();
    this.hZP = false;
    if (this.hsU != null)
    {
      au.Em().cil().removeCallbacks(this.hsU);
      this.hsU = null;
    }
    if (this.hZY != null)
    {
      a.sFg.c(this.hZY);
      this.hZY = null;
    }
    if (this.hsT != null)
    {
      ad.getContext().unregisterReceiver(this.hsT);
      this.hsT = null;
    }
    com.tencent.mm.pluginsdk.cmd.b.D(new String[] { "//recover-old", "//recover", "//post-recover", "//backupdb", "//recoverdb", "//repairdb", "//corruptdb", "//iotracedb", "//recover-status" });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/dbbackup/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */