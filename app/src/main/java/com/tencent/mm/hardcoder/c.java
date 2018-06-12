package com.tencent.mm.hardcoder;

import android.os.Process;
import android.os.SystemClock;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;

public final class c
  implements Runnable
{
  private Set<Integer> dkG;
  private f dkH;
  private long dkI;
  private long dkJ;
  private h dky;
  
  /* Error */
  public static Map<Integer, a> a(final long paramLong, h paramh)
  {
    // Byte code:
    //   0: new 32	java/util/TreeMap
    //   3: dup
    //   4: invokespecial 36	java/util/TreeMap:<init>	()V
    //   7: astore 7
    //   9: invokestatic 42	java/lang/Runtime:getRuntime	()Ljava/lang/Runtime;
    //   12: invokevirtual 46	java/lang/Runtime:availableProcessors	()I
    //   15: istore 4
    //   17: iconst_0
    //   18: istore_3
    //   19: iload_3
    //   20: iload 4
    //   22: if_icmpge +241 -> 263
    //   25: new 48	java/io/File
    //   28: dup
    //   29: new 50	java/lang/StringBuilder
    //   32: dup
    //   33: ldc 52
    //   35: invokespecial 55	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   38: iload_3
    //   39: invokevirtual 59	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   42: ldc 61
    //   44: invokevirtual 64	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   47: invokevirtual 68	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   50: invokespecial 69	java/io/File:<init>	(Ljava/lang/String;)V
    //   53: astore 5
    //   55: aload 5
    //   57: invokevirtual 73	java/io/File:exists	()Z
    //   60: ifeq +47 -> 107
    //   63: aload 5
    //   65: invokevirtual 76	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   68: astore 5
    //   70: new 8	com/tencent/mm/hardcoder/c$1
    //   73: dup
    //   74: aload_2
    //   75: iload_3
    //   76: lload_0
    //   77: aload 7
    //   79: invokespecial 79	com/tencent/mm/hardcoder/c$1:<init>	(Lcom/tencent/mm/hardcoder/h;IJLjava/util/Map;)V
    //   82: astore 6
    //   84: new 81	java/io/FileInputStream
    //   87: dup
    //   88: aload 5
    //   90: invokespecial 82	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   93: astore 5
    //   95: aload 5
    //   97: aload 6
    //   99: invokestatic 87	com/tencent/mm/hardcoder/g:a	(Ljava/io/InputStream;Lcom/tencent/mm/hardcoder/g$a;)V
    //   102: aload 5
    //   104: invokevirtual 92	java/io/InputStream:close	()V
    //   107: iload_3
    //   108: iconst_1
    //   109: iadd
    //   110: istore_3
    //   111: goto -92 -> 19
    //   114: astore 5
    //   116: ldc 94
    //   118: new 50	java/lang/StringBuilder
    //   121: dup
    //   122: ldc 96
    //   124: invokespecial 55	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   127: aload 5
    //   129: invokevirtual 99	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   132: invokevirtual 64	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   135: invokevirtual 68	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   138: invokestatic 105	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   141: goto -34 -> 107
    //   144: astore 6
    //   146: aconst_null
    //   147: astore 5
    //   149: ldc 94
    //   151: new 50	java/lang/StringBuilder
    //   154: dup
    //   155: ldc 96
    //   157: invokespecial 55	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   160: aload 6
    //   162: invokevirtual 99	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   165: invokevirtual 64	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   168: invokevirtual 68	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   171: invokestatic 105	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   174: aload 5
    //   176: ifnull -69 -> 107
    //   179: aload 5
    //   181: invokevirtual 92	java/io/InputStream:close	()V
    //   184: goto -77 -> 107
    //   187: astore 5
    //   189: ldc 94
    //   191: new 50	java/lang/StringBuilder
    //   194: dup
    //   195: ldc 96
    //   197: invokespecial 55	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   200: aload 5
    //   202: invokevirtual 99	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   205: invokevirtual 64	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   208: invokevirtual 68	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   211: invokestatic 105	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   214: goto -107 -> 107
    //   217: astore_2
    //   218: aconst_null
    //   219: astore 5
    //   221: aload 5
    //   223: ifnull +8 -> 231
    //   226: aload 5
    //   228: invokevirtual 92	java/io/InputStream:close	()V
    //   231: aload_2
    //   232: athrow
    //   233: astore 5
    //   235: ldc 94
    //   237: new 50	java/lang/StringBuilder
    //   240: dup
    //   241: ldc 96
    //   243: invokespecial 55	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   246: aload 5
    //   248: invokevirtual 99	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   251: invokevirtual 64	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   254: invokevirtual 68	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   257: invokestatic 105	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   260: goto -29 -> 231
    //   263: aload 7
    //   265: areturn
    //   266: astore_2
    //   267: goto -46 -> 221
    //   270: astore_2
    //   271: goto -50 -> 221
    //   274: astore 6
    //   276: goto -127 -> 149
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	279	0	paramLong	long
    //   0	279	2	paramh	h
    //   18	93	3	i	int
    //   15	8	4	j	int
    //   53	50	5	localObject1	Object
    //   114	14	5	localException1	Exception
    //   147	33	5	localObject2	Object
    //   187	14	5	localException2	Exception
    //   219	8	5	localObject3	Object
    //   233	14	5	localException3	Exception
    //   82	16	6	local1	1
    //   144	17	6	localException4	Exception
    //   274	1	6	localException5	Exception
    //   7	257	7	localTreeMap	TreeMap
    // Exception table:
    //   from	to	target	type
    //   102	107	114	java/lang/Exception
    //   84	95	144	java/lang/Exception
    //   179	184	187	java/lang/Exception
    //   84	95	217	finally
    //   226	231	233	java/lang/Exception
    //   95	102	266	finally
    //   149	174	270	finally
    //   95	102	274	java/lang/Exception
  }
  
  protected final void finalize()
  {
    super.finalize();
    this.dkG = null;
    this.dky = null;
    this.dkH = null;
  }
  
  public final void run()
  {
    if (!Thread.currentThread().isInterrupted()) {}
    for (;;)
    {
      long l1;
      Object localObject6;
      try
      {
        l1 = System.currentTimeMillis();
        if ((l1 < this.dkI) || (l1 > this.dkJ)) {
          break label659;
        }
        if (HardCoderJNI.hcDebug) {
          x.d("MicroMsg.HardCoderMonitor", "get cpu current freq,begin:" + SystemClock.elapsedRealtime());
        }
        Map localMap = a(l1, this.dky);
        if (HardCoderJNI.hcDebug) {
          x.d("MicroMsg.HardCoderMonitor", "get cpu current freq,end:" + SystemClock.elapsedRealtime());
        }
        localObject6 = new HashSet();
        localObject7 = new File("/proc/" + Process.myPid() + "/task");
        if (!((File)localObject7).isDirectory()) {
          break label489;
        }
        localObject7 = ((File)localObject7).listFiles();
        if (localObject7 == null) {
          break label688;
        }
        if (localObject7.length != 0) {
          continue;
        }
      }
      catch (InterruptedException localInterruptedException)
      {
        x.e("MicroMsg.HardCoderMonitor", "Monitor thread need to interrupt:" + localInterruptedException.getMessage());
        Thread.currentThread().interrupt();
        return;
        if (!HardCoderJNI.hcDebug) {
          continue;
        }
        x.i("MicroMsg.HardCoderMonitor", "thread size:" + localObject7.length);
        j = localObject7.length;
        i = 0;
        if (i >= j) {
          break label484;
        }
        Object localObject8 = localObject7[i].getName();
        try
        {
          ((Set)localObject6).add(Integer.valueOf(bi.getInt((String)localObject8, 0)));
          i += 1;
        }
        catch (Exception localException2)
        {
          x.e("MicroMsg.HardCoderMonitor", "integer parse error:" + localException2.getMessage());
          continue;
        }
      }
      catch (Exception localException1)
      {
        x.e("MicroMsg.HardCoderMonitor", "exception:" + localException1.getMessage());
      }
      Object localObject7 = new TreeMap();
      this.dkG.addAll((Collection)localObject6);
      if (HardCoderJNI.hcDebug) {
        x.d("MicroMsg.HardCoderMonitor", "get thread current stat,end:" + SystemClock.elapsedRealtime());
      }
      if (i == 0)
      {
        if (!this.dkG.isEmpty())
        {
          localObject6 = this.dkG.iterator();
          if (((Iterator)localObject6).hasNext())
          {
            i = ((Integer)((Iterator)localObject6).next()).intValue();
            localObject8 = HardCoderJNI.getThreadCpuJiffies(i);
            int j = HardCoderJNI.getThreadCoreId(i);
            long l2 = HardCoderJNI.getCpuFreqByCoreId(j);
            if (((Map)localObject7).containsKey(Integer.valueOf(i)))
            {
              ((Map)localObject7).get(Integer.valueOf(i));
              continue;
              break;
              label484:
              i = 0;
              continue;
              label489:
              x.e("MicroMsg.HardCoderMonitor", "impossible as usual");
              i = 1;
              continue;
            }
            ((Map)localObject7).put(Integer.valueOf(i), new c(i, l1, j, l2, localException2));
            continue;
          }
          localObject6 = this.dkH;
          b localb = new b(l1, localException1, (Map)localObject7);
          if (((f)localObject6).dlb != null) {
            ((f)localObject6).dlb.add(localb);
          }
          try
          {
            localObject6.notify();
            try
            {
              wait(50L);
              break;
            }
            finally {}
          }
          finally {}
        }
        try
        {
          wait();
          break;
        }
        finally {}
      }
      try
      {
        wait(60000L);
        x.i("MicroMsg.HardCoderMonitor", "Monitor thread wait(pid/task error):60000");
        break;
      }
      finally {}
      try
      {
        label659:
        wait(60000L);
        x.i("MicroMsg.HardCoderMonitor", "Monitor thread wait(no in time):60000");
        break;
      }
      finally {}
      label688:
      int i = 1;
    }
  }
  
  public static final class a
  {
    public final int dkO;
    public final long dkP;
    public final int dkQ;
    public final long startTime;
    
    public a(long paramLong1, int paramInt1, long paramLong2, int paramInt2)
    {
      this.startTime = paramLong1;
      this.dkO = paramInt1;
      this.dkP = paramLong2;
      this.dkQ = paramInt2;
    }
    
    public final String toString()
    {
      return String.format("Cpu status,startTime:%s,coreId:%s,freq:%s,power:%s", new Object[] { Long.valueOf(this.startTime), Integer.valueOf(this.dkO), Long.valueOf(this.dkP), Integer.valueOf(this.dkQ) });
    }
  }
  
  public static final class b
  {
    public final Map<Integer, c.a> dkR;
    public final Map<Integer, c.c> dkS;
    public final long time;
    
    public b(long paramLong, Map<Integer, c.a> paramMap, Map<Integer, c.c> paramMap1)
    {
      this.time = paramLong;
      this.dkR = paramMap;
      this.dkS = paramMap1;
    }
  }
  
  public static final class c
  {
    public final int dkT;
    public final int dkU;
    public final long dkV;
    public long dkW = 0L;
    public final long[] dko;
    public long dkq = 0L;
    public final long startTime;
    
    public c(int paramInt1, long paramLong1, int paramInt2, long paramLong2, long[] paramArrayOfLong)
    {
      this.dkT = paramInt1;
      this.startTime = paramLong1;
      this.dkU = paramInt2;
      this.dkV = paramLong2;
      this.dko = paramArrayOfLong;
      this.dkq = this.dkV;
    }
    
    public final String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(String.format("Thread status,threadId:%s,startTime:%s,startCoreId:%s,startCoreFreq:%s", new Object[] { Integer.valueOf(this.dkT), Long.valueOf(this.startTime), Integer.valueOf(this.dkU), Long.valueOf(this.dkV) }));
      localStringBuilder.append(String.format(",sumJiffies:%s", new Object[] { Long.valueOf(this.dkW) }));
      return localStringBuilder.toString();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/hardcoder/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */