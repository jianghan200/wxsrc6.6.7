package com.tencent.mm.jni.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.util.SparseArray;
import com.tencent.mars.comm.WakerLock;
import com.tencent.mm.g.a.nm;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public final class a
{
  private static SparseArray<b> dok = new SparseArray();
  private static final byte[] dol = new byte[0];
  private static ag mHandler = new ag(Looper.getMainLooper());
  
  public static void CM() {}
  
  public static void CN() {}
  
  public static void a(WakerLock paramWakerLock, String paramString)
  {
    synchronized (dol)
    {
      b localb2 = (b)dok.get(paramWakerLock.hashCode());
      b localb1 = localb2;
      if (localb2 == null)
      {
        localb1 = new b(paramWakerLock);
        dok.put(paramWakerLock.hashCode(), localb1);
      }
      if (!localb1.dop.containsKey(paramString)) {
        localb1.dop.put(paramString, new a.b.a(paramString, SystemClock.elapsedRealtime()));
      }
      c.fK(paramString);
      paramWakerLock = mHandler;
      if (!localb1.don)
      {
        localb1.don = true;
        paramWakerLock.postDelayed(localb1.doo, 60000L);
      }
      return;
    }
  }
  
  public static void c(WakerLock paramWakerLock)
  {
    synchronized (dol)
    {
      paramWakerLock = (b)dok.get(paramWakerLock.hashCode());
      if (paramWakerLock == null) {
        break label104;
      }
      Object localObject = mHandler;
      if (paramWakerLock.don)
      {
        paramWakerLock.don = false;
        ((ag)localObject).removeCallbacks(paramWakerLock.doo);
      }
      localObject = paramWakerLock.dop.values().iterator();
      if (((Iterator)localObject).hasNext()) {
        c.fL(((a.b.a)((Iterator)localObject).next()).doq);
      }
    }
    paramWakerLock.dop.clear();
    label104:
  }
  
  private static final class a
    implements Runnable
  {
    private WakerLock dom = null;
    
    public a(WakerLock paramWakerLock)
    {
      this.dom = paramWakerLock;
    }
    
    public final void run()
    {
      Object localObject2;
      int k;
      int m;
      for (;;)
      {
        int i;
        synchronized ()
        {
          localObject2 = (a.b)a.CP().get(this.dom.hashCode());
          if (localObject2 == null) {
            break label259;
          }
          k = this.dom.hashCode();
          m = this.dom.innerWakeLockHashCode();
          String str = this.dom.getCreatePosStackLine();
          Object localObject3 = ((a.b)localObject2).dop.values();
          localObject2 = new StringBuilder();
          i = 1;
          localObject3 = ((Collection)localObject3).iterator();
          if (!((Iterator)localObject3).hasNext()) {
            break;
          }
          a.b.a locala = (a.b.a)((Iterator)localObject3).next();
          if (i != 0)
          {
            j = 0;
            i = j;
            if (locala.dor == 0L) {
              continue;
            }
            ((StringBuilder)localObject2).append('{').append(locala.doq).append(',').append(SystemClock.elapsedRealtime() - locala.dor).append('}');
            i = j;
          }
        }
        ((StringBuilder)localObject2).append(',');
        int j = i;
      }
      if (((StringBuilder)localObject2).length() == 0) {
        ((StringBuilder)localObject2).append("<empty>");
      }
      x.w("MicroMsg.WakeLockManager", "wakerlock held too long: [%d,%d] @[%s] force to unlock it. state: %s", new Object[] { Integer.valueOf(k), Integer.valueOf(m), localObject1, ((StringBuilder)localObject2).toString() });
      for (;;)
      {
        this.dom.unLock();
        return;
        label259:
        x.w("MicroMsg.WakeLockManager", "wakerlock held too long: [%d,%d] @[%s] force to unlock it. state: %s", new Object[] { Integer.valueOf(this.dom.hashCode()), Integer.valueOf(this.dom.innerWakeLockHashCode()), this.dom.getCreatePosStackLine(), "#lost-trace-state#" });
      }
    }
  }
  
  private static final class b
  {
    volatile boolean don = false;
    a.a doo = null;
    Map<String, a> dop = new HashMap();
    
    public b(WakerLock paramWakerLock)
    {
      this.doo = new a.a(paramWakerLock);
    }
    
    private static final class a
    {
      public String doq = null;
      public long dor = 0L;
      
      public a(String paramString, long paramLong)
      {
        this.doq = paramString;
        this.dor = paramLong;
      }
    }
  }
  
  private static final class c
  {
    private static long bzV = 0L;
    private static int dos = 0;
    private static long dot = 0L;
    private static HashMap<String, a> dou = null;
    private static final byte[] dov = new byte[0];
    private static BroadcastReceiver dow = null;
    
    /* Error */
    public static void CQ()
    {
      // Byte code:
      //   0: aconst_null
      //   1: astore_2
      //   2: getstatic 28	com/tencent/mm/jni/a/a$c:dos	I
      //   5: ifne +129 -> 134
      //   8: invokestatic 48	android/os/Process:myPid	()I
      //   11: putstatic 28	com/tencent/mm/jni/a/a$c:dos	I
      //   14: new 9	com/tencent/mm/jni/a/a$c$1
      //   17: dup
      //   18: invokespecial 51	com/tencent/mm/jni/a/a$c$1:<init>	()V
      //   21: putstatic 38	com/tencent/mm/jni/a/a$c:dow	Landroid/content/BroadcastReceiver;
      //   24: getstatic 36	com/tencent/mm/jni/a/a$c:dov	[B
      //   27: astore_3
      //   28: aload_3
      //   29: monitorenter
      //   30: new 53	java/io/ObjectInputStream
      //   33: dup
      //   34: new 55	java/io/FileInputStream
      //   37: dup
      //   38: new 57	java/io/File
      //   41: dup
      //   42: invokestatic 63	com/tencent/mm/sdk/platformtools/ad:getContext	()Landroid/content/Context;
      //   45: invokevirtual 69	android/content/Context:getCacheDir	()Ljava/io/File;
      //   48: ldc 71
      //   50: invokespecial 74	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
      //   53: invokespecial 77	java/io/FileInputStream:<init>	(Ljava/io/File;)V
      //   56: invokespecial 80	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
      //   59: astore_0
      //   60: aload_0
      //   61: invokevirtual 84	java/io/ObjectInputStream:readLong	()J
      //   64: putstatic 30	com/tencent/mm/jni/a/a$c:bzV	J
      //   67: aload_0
      //   68: invokevirtual 88	java/io/ObjectInputStream:readObject	()Ljava/lang/Object;
      //   71: checkcast 90	java/util/HashMap
      //   74: putstatic 34	com/tencent/mm/jni/a/a$c:dou	Ljava/util/HashMap;
      //   77: aload_0
      //   78: invokevirtual 93	java/io/ObjectInputStream:close	()V
      //   81: aload_3
      //   82: monitorexit
      //   83: new 95	android/content/IntentFilter
      //   86: dup
      //   87: invokespecial 96	android/content/IntentFilter:<init>	()V
      //   90: astore_0
      //   91: aload_0
      //   92: ldc 98
      //   94: invokevirtual 102	android/content/IntentFilter:addAction	(Ljava/lang/String;)V
      //   97: aload_0
      //   98: ldc 104
      //   100: invokevirtual 102	android/content/IntentFilter:addAction	(Ljava/lang/String;)V
      //   103: invokestatic 63	com/tencent/mm/sdk/platformtools/ad:getContext	()Landroid/content/Context;
      //   106: getstatic 38	com/tencent/mm/jni/a/a$c:dow	Landroid/content/BroadcastReceiver;
      //   109: aload_0
      //   110: ldc 106
      //   112: aconst_null
      //   113: invokevirtual 110	android/content/Context:registerReceiver	(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;
      //   116: pop
      //   117: ldc 112
      //   119: ldc 114
      //   121: iconst_1
      //   122: anewarray 4	java/lang/Object
      //   125: dup
      //   126: iconst_0
      //   127: invokestatic 118	com/tencent/mm/sdk/platformtools/ad:getProcessName	()Ljava/lang/String;
      //   130: aastore
      //   131: invokestatic 124	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   134: return
      //   135: astore_0
      //   136: aconst_null
      //   137: astore_0
      //   138: ldc 112
      //   140: ldc 126
      //   142: invokestatic 130	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
      //   145: invokestatic 135	android/os/SystemClock:elapsedRealtime	()J
      //   148: putstatic 30	com/tencent/mm/jni/a/a$c:bzV	J
      //   151: new 90	java/util/HashMap
      //   154: dup
      //   155: invokespecial 136	java/util/HashMap:<init>	()V
      //   158: putstatic 34	com/tencent/mm/jni/a/a$c:dou	Ljava/util/HashMap;
      //   161: aload_0
      //   162: ifnull -81 -> 81
      //   165: aload_0
      //   166: invokevirtual 93	java/io/ObjectInputStream:close	()V
      //   169: goto -88 -> 81
      //   172: astore_0
      //   173: goto -92 -> 81
      //   176: astore_1
      //   177: aload_2
      //   178: astore_0
      //   179: aload_0
      //   180: ifnull +7 -> 187
      //   183: aload_0
      //   184: invokevirtual 93	java/io/ObjectInputStream:close	()V
      //   187: aload_1
      //   188: athrow
      //   189: astore_0
      //   190: aload_3
      //   191: monitorexit
      //   192: aload_0
      //   193: athrow
      //   194: astore_0
      //   195: goto -114 -> 81
      //   198: astore_0
      //   199: goto -12 -> 187
      //   202: astore_1
      //   203: goto -24 -> 179
      //   206: astore_1
      //   207: goto -28 -> 179
      //   210: astore_1
      //   211: goto -73 -> 138
      // Local variable table:
      //   start	length	slot	name	signature
      //   59	51	0	localObject1	Object
      //   135	1	0	localException1	Exception
      //   137	29	0	localObject2	Object
      //   172	1	0	localException2	Exception
      //   178	6	0	localObject3	Object
      //   189	4	0	localObject4	Object
      //   194	1	0	localException3	Exception
      //   198	1	0	localException4	Exception
      //   176	12	1	localObject5	Object
      //   202	1	1	localObject6	Object
      //   206	1	1	localObject7	Object
      //   210	1	1	localException5	Exception
      //   1	177	2	localObject8	Object
      //   27	164	3	arrayOfByte	byte[]
      // Exception table:
      //   from	to	target	type
      //   30	60	135	java/lang/Exception
      //   165	169	172	java/lang/Exception
      //   30	60	176	finally
      //   77	81	189	finally
      //   81	83	189	finally
      //   165	169	189	finally
      //   183	187	189	finally
      //   187	189	189	finally
      //   190	192	189	finally
      //   77	81	194	java/lang/Exception
      //   183	187	198	java/lang/Exception
      //   60	77	202	finally
      //   138	161	206	finally
      //   60	77	210	java/lang/Exception
    }
    
    private static void CR()
    {
      long l;
      for (;;)
      {
        synchronized (dov)
        {
          l = SystemClock.elapsedRealtime();
          if (l - bzV < 21600000L) {
            break label282;
          }
          if (dou.isEmpty()) {
            break label278;
          }
          StringBuilder localStringBuilder = new StringBuilder();
          Iterator localIterator = dou.entrySet().iterator();
          if (!localIterator.hasNext()) {
            break;
          }
          Object localObject2 = (a)((Map.Entry)localIterator.next()).getValue();
          if (((a)localObject2).doB <= 0) {
            continue;
          }
          localStringBuilder.setLength(0);
          Object localObject3 = localStringBuilder.append(((a)localObject2).dox).append(',').append(((a)localObject2).doq.replace(",", "##")).append(',').append(((a)localObject2).doB).append(',').append(((a)localObject2).doA).append(',').append(((a)localObject2).doC).append(',');
          if (((a)localObject2).doz)
          {
            i = 1;
            ((StringBuilder)localObject3).append(i).append(',').append(((a)localObject2).doy);
            localObject2 = localStringBuilder.toString();
            localObject3 = new nm();
            ((nm)localObject3).bYy.bYz = ((String)localObject2);
            com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject3);
            x.d("MicroMsg.WakeLockStatsManager", "kvstat-str: %s", new Object[] { localStringBuilder.toString() });
          }
        }
        int i = 0;
      }
      dou.clear();
      label278:
      bzV = l;
      label282:
    }
    
    /* Error */
    private static void CS()
    {
      // Byte code:
      //   0: getstatic 36	com/tencent/mm/jni/a/a$c:dov	[B
      //   3: astore_3
      //   4: aload_3
      //   5: monitorenter
      //   6: aconst_null
      //   7: astore_1
      //   8: aconst_null
      //   9: astore_2
      //   10: aload_1
      //   11: astore_0
      //   12: new 57	java/io/File
      //   15: dup
      //   16: invokestatic 63	com/tencent/mm/sdk/platformtools/ad:getContext	()Landroid/content/Context;
      //   19: invokevirtual 69	android/content/Context:getCacheDir	()Ljava/io/File;
      //   22: ldc_w 257
      //   25: invokespecial 74	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
      //   28: astore 4
      //   30: aload_1
      //   31: astore_0
      //   32: aload 4
      //   34: invokevirtual 260	java/io/File:getAbsolutePath	()Ljava/lang/String;
      //   37: invokestatic 266	com/tencent/mm/modelsfs/FileOp:mL	(Ljava/lang/String;)Z
      //   40: ifne +71 -> 111
      //   43: aload_1
      //   44: astore_0
      //   45: new 255	java/io/IOException
      //   48: dup
      //   49: new 145	java/lang/StringBuilder
      //   52: dup
      //   53: ldc_w 268
      //   56: invokespecial 270	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   59: aload 4
      //   61: invokevirtual 260	java/io/File:getAbsolutePath	()Ljava/lang/String;
      //   64: invokevirtual 184	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   67: ldc_w 272
      //   70: invokevirtual 184	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   73: invokevirtual 222	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   76: invokespecial 273	java/io/IOException:<init>	(Ljava/lang/String;)V
      //   79: athrow
      //   80: astore_0
      //   81: aload_2
      //   82: astore_1
      //   83: aload_0
      //   84: astore_2
      //   85: aload_1
      //   86: astore_0
      //   87: ldc 112
      //   89: aload_2
      //   90: ldc_w 275
      //   93: iconst_0
      //   94: anewarray 4	java/lang/Object
      //   97: invokestatic 279	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   100: aload_1
      //   101: ifnull +7 -> 108
      //   104: aload_1
      //   105: invokevirtual 282	java/io/ObjectOutputStream:close	()V
      //   108: aload_3
      //   109: monitorexit
      //   110: return
      //   111: aload_1
      //   112: astore_0
      //   113: new 281	java/io/ObjectOutputStream
      //   116: dup
      //   117: new 284	java/io/FileOutputStream
      //   120: dup
      //   121: new 57	java/io/File
      //   124: dup
      //   125: aload 4
      //   127: ldc_w 286
      //   130: invokespecial 74	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
      //   133: invokespecial 287	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
      //   136: invokespecial 290	java/io/ObjectOutputStream:<init>	(Ljava/io/OutputStream;)V
      //   139: astore_1
      //   140: aload_1
      //   141: getstatic 30	com/tencent/mm/jni/a/a$c:bzV	J
      //   144: invokevirtual 294	java/io/ObjectOutputStream:writeLong	(J)V
      //   147: aload_1
      //   148: getstatic 34	com/tencent/mm/jni/a/a$c:dou	Ljava/util/HashMap;
      //   151: invokevirtual 298	java/io/ObjectOutputStream:writeObject	(Ljava/lang/Object;)V
      //   154: aload_1
      //   155: invokevirtual 282	java/io/ObjectOutputStream:close	()V
      //   158: goto -50 -> 108
      //   161: astore_0
      //   162: goto -54 -> 108
      //   165: astore_2
      //   166: aload_0
      //   167: astore_1
      //   168: aload_2
      //   169: astore_0
      //   170: aload_1
      //   171: ifnull +7 -> 178
      //   174: aload_1
      //   175: invokevirtual 282	java/io/ObjectOutputStream:close	()V
      //   178: aload_0
      //   179: athrow
      //   180: astore_0
      //   181: aload_3
      //   182: monitorexit
      //   183: aload_0
      //   184: athrow
      //   185: astore_0
      //   186: goto -78 -> 108
      //   189: astore_1
      //   190: goto -12 -> 178
      //   193: astore_0
      //   194: goto -24 -> 170
      //   197: astore_2
      //   198: goto -113 -> 85
      // Local variable table:
      //   start	length	slot	name	signature
      //   11	34	0	localObject1	Object
      //   80	4	0	localIOException1	java.io.IOException
      //   86	27	0	localObject2	Object
      //   161	6	0	localException1	Exception
      //   169	10	0	localObject3	Object
      //   180	4	0	localObject4	Object
      //   185	1	0	localException2	Exception
      //   193	1	0	localObject5	Object
      //   7	168	1	localObject6	Object
      //   189	1	1	localException3	Exception
      //   9	81	2	localObject7	Object
      //   165	4	2	localObject8	Object
      //   197	1	2	localIOException2	java.io.IOException
      //   3	179	3	arrayOfByte	byte[]
      //   28	98	4	localFile	java.io.File
      // Exception table:
      //   from	to	target	type
      //   12	30	80	java/io/IOException
      //   32	43	80	java/io/IOException
      //   45	80	80	java/io/IOException
      //   113	140	80	java/io/IOException
      //   154	158	161	java/lang/Exception
      //   12	30	165	finally
      //   32	43	165	finally
      //   45	80	165	finally
      //   87	100	165	finally
      //   113	140	165	finally
      //   104	108	180	finally
      //   108	110	180	finally
      //   154	158	180	finally
      //   174	178	180	finally
      //   178	180	180	finally
      //   181	183	180	finally
      //   104	108	185	java/lang/Exception
      //   174	178	189	java/lang/Exception
      //   140	154	193	finally
      //   140	154	197	java/io/IOException
    }
    
    private static void b(String paramString1, String paramString2, long paramLong)
    {
      String str = paramString1 + "_" + paramString2;
      synchronized (dov)
      {
        a locala2 = (a)dou.get(str);
        a locala1 = locala2;
        if (locala2 == null)
        {
          locala1 = new a((byte)0);
          locala1.dox = paramString1;
          locala1.doq = paramString2;
          locala1.doC = 0L;
          locala1.doA = 0;
          locala1.doB = 0;
          dou.put(str, locala1);
        }
        if (locala1.doE.getAndIncrement() == 0)
        {
          locala1.doD = paramLong;
          locala1.doy = ao.getNetTypeString(ad.getContext());
          locala1.doz = com.tencent.mm.sdk.a.b.foreground;
        }
        return;
      }
    }
    
    private static void c(String arg0, String paramString2, long paramLong)
    {
      paramString2 = ??? + "_" + paramString2;
      long l2 = 0L;
      synchronized (dov)
      {
        paramString2 = (a)dou.get(paramString2);
        long l1 = l2;
        if (paramString2 != null)
        {
          l1 = l2;
          if (paramString2.doE.get() > 0)
          {
            paramString2.doA += 1;
            l1 = l2;
            if (paramString2.doE.decrementAndGet() == 0)
            {
              l1 = paramLong - paramString2.doD;
              paramString2.doC += l1;
              paramString2.doB += 1;
            }
          }
        }
        CR();
        paramLong = SystemClock.elapsedRealtime();
        if ((l1 >= 14000L) || (paramLong - dot >= 3600000L))
        {
          x.d("MicroMsg.WakeLockStatsManager", "saveStatsToStorage triggered.");
          CS();
          dot = paramLong;
        }
        return;
      }
    }
    
    public static void detach()
    {
      if (dos > 0)
      {
        ad.getContext().unregisterReceiver(dow);
        CS();
        dos = 0;
        x.i("MicroMsg.WakeLockStatsManager", "WakeLockStatsManager is detached from process [%s]", new Object[] { ad.getProcessName() });
      }
    }
    
    public static void fK(String paramString)
    {
      o(paramString, true);
    }
    
    public static void fL(String paramString)
    {
      o(paramString, false);
    }
    
    private static void o(String paramString, boolean paramBoolean)
    {
      int i = Process.myPid();
      String str = ad.getProcessName();
      if (i == dos)
      {
        if (paramBoolean)
        {
          b(str, paramString, SystemClock.elapsedRealtime());
          return;
        }
        c(str, paramString, SystemClock.elapsedRealtime());
        return;
      }
      if (paramBoolean)
      {
        localIntent = new Intent("com.tencent.mm.ACTION.note_tracemsg_lock");
        localIntent.putExtra("pid", i);
        localIntent.putExtra("processName", str);
        localIntent.putExtra("traceMsg", paramString);
        localIntent.putExtra("tick", SystemClock.elapsedRealtime());
        ad.getContext().sendBroadcast(localIntent, "com.tencent.mm.permission.MM_MESSAGE");
        return;
      }
      Intent localIntent = new Intent("com.tencent.mm.ACTION.note_tracemsg_unlock");
      localIntent.putExtra("pid", i);
      localIntent.putExtra("processName", str);
      localIntent.putExtra("traceMsg", paramString);
      localIntent.putExtra("tick", SystemClock.elapsedRealtime());
      ad.getContext().sendBroadcast(localIntent, "com.tencent.mm.permission.MM_MESSAGE");
    }
    
    private static final class a
      implements Externalizable
    {
      public int doA = 0;
      public int doB = 0;
      public long doC = 0L;
      public long doD = 0L;
      public AtomicInteger doE = new AtomicInteger(0);
      public String doq = "";
      public String dox = "";
      public String doy = "";
      public boolean doz = false;
      
      public final void readExternal(ObjectInput paramObjectInput)
      {
        synchronized ()
        {
          this.dox = paramObjectInput.readUTF();
          this.doq = paramObjectInput.readUTF();
          this.doA = paramObjectInput.readInt();
          this.doB = paramObjectInput.readInt();
          this.doC = paramObjectInput.readLong();
          this.doy = "";
          this.doz = false;
          this.doD = 0L;
          this.doE = new AtomicInteger(0);
          return;
        }
      }
      
      public final void writeExternal(ObjectOutput paramObjectOutput)
      {
        synchronized ()
        {
          paramObjectOutput.writeUTF(this.dox);
          paramObjectOutput.writeUTF(this.doq);
          paramObjectOutput.writeInt(this.doA);
          paramObjectOutput.writeInt(this.doB);
          paramObjectOutput.writeLong(this.doC);
          return;
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/jni/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */