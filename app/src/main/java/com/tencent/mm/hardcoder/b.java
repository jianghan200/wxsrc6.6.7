package com.tencent.mm.hardcoder;

import com.tencent.mm.sdk.platformtools.x;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class b
  implements Runnable
{
  private Queue<Object> dkx = new ConcurrentLinkedQueue();
  private h dky = new h();
  private boolean dkz = false;
  private Thread thread = null;
  
  public b()
  {
    this.dky.initialize();
  }
  
  public final void as(Object paramObject)
  {
    if (this.dkx != null)
    {
      this.dkx.add(paramObject);
      try
      {
        notify();
        return;
      }
      finally {}
    }
  }
  
  protected final void finalize()
  {
    super.finalize();
    this.dkx = null;
  }
  
  public final void run()
  {
    x.i("MicroMsg.HCPerfStatThread", "[oneliang]HCPerfStatThread running");
    if (!Thread.currentThread().isInterrupted()) {}
    for (;;)
    {
      int k;
      Map localMap;
      int[] arrayOfInt2;
      int i;
      try
      {
        if (this.dkx.isEmpty()) {
          break label1270;
        }
        localObject1 = this.dkx.poll();
        if (!(localObject1 instanceof c)) {
          break label1191;
        }
        localObject1 = (c)localObject1;
        l1 = ((c)localObject1).time;
        localList = ((c)localObject1).dkD;
        j = ((c)localObject1).dkE;
        k = ((c)localObject1).dkF;
        arrayOfInt1 = ((c)localObject1).dkn;
        if (HardCoderJNI.hcDebug) {
          x.d("MicroMsg.HardCoderReporter", "[oneliang]save task status,time:%s,size:%s,cpu:%s,io:%s", new Object[] { Long.valueOf(l1), Integer.valueOf(localList.size()), Integer.valueOf(j), Integer.valueOf(k) });
        }
        localMap = c.a(l1, this.dky);
        arrayOfInt2 = f.b.k(localMap);
        localObject1 = HardCoderJNI.getMyProcCpuTime();
        if (localObject1 != null) {
          break label1319;
        }
        localObject1 = new long[] { 0L, 0L };
      }
      catch (InterruptedException localInterruptedException)
      {
        Object localObject1;
        long l1;
        List localList;
        int j;
        int[] arrayOfInt1;
        long[] arrayOfLong;
        x.e("MicroMsg.HCPerfStatThread", "Performance status thread need to interrupt:" + localInterruptedException.getMessage());
        Thread.currentThread().interrupt();
        return;
        locala.dkj = 0;
        localObject3 = locala.dkl;
        m = locala.dkj;
        localObject3[m] = ((int)(localObject3[m] + l2));
        continue;
      }
      catch (Exception localException)
      {
        x.e("MicroMsg.HCPerfStatThread", "exception:" + localException.getMessage());
      }
      if (i >= localList.size()) {
        break;
      }
      a.a locala = (a.a)localList.get(i);
      if (locala.dke != 0)
      {
        long l2 = l1 - locala.lastUpdateTime;
        locala.lastUpdateTime = l1;
        if (j != -1)
        {
          if (j == -2)
          {
            localObject3 = locala.dkl;
            m = locala.dkj;
            localObject3[m] = ((int)(localObject3[m] + l2));
            if (k == -1) {
              break label980;
            }
            if (k == -2)
            {
              localObject3 = locala.dkm;
              m = locala.dkk;
              localObject3[m] = ((int)(l2 + localObject3[m]));
              if ((arrayOfInt1 != null) && (arrayOfInt1.length > 0)) {
                locala.dkn = arrayOfInt1;
              }
              arrayOfLong = HardCoderJNI.getThreadCpuJiffies(locala.dke);
              localObject3 = arrayOfLong;
              if (arrayOfLong == null)
              {
                localObject3 = new long[2];
                Object tmp356_354 = localObject3;
                tmp356_354[0] = 0L;
                Object tmp360_356 = tmp356_354;
                tmp360_356[1] = 0L;
                tmp360_356;
              }
              l2 = HardCoderJNI.getCpuFreqByCoreId(HardCoderJNI.getThreadCoreId(locala.dke));
              if (locala.dkq == 0L) {
                locala.dkq = l2;
              }
              if (locala.dko == null) {
                locala.dko = ((long[])localObject3);
              }
              if (locala.dkp == null) {
                locala.dkp = ((long[])localObject1);
              }
              locala.dkq = ((l2 + locala.dkq) / 2L);
              if ((localObject3 != null) && (locala.dke > 0))
              {
                locala.dkr = ((int)(localObject3[0] - locala.dko[0] + (localObject3[1] - locala.dko[1])));
                if (HardCoderJNI.hcDebug) {
                  x.d("MicroMsg.HardCoderReporter", "thread id:" + locala.dke + ",start jiffies:[" + locala.dko[0] + "," + locala.dko[1] + "], end jiffies:[" + localObject3[0] + "," + localObject3[1] + "],sum thread jiffies:" + locala.dkr);
                }
              }
              if ((localObject1 != null) && (locala.dke > 0) && (HardCoderJNI.hcDebug))
              {
                locala.dks = (localObject1[0] - locala.dkp[0] + (localObject1[1] - locala.dkp[1]));
                x.d("MicroMsg.HardCoderReporter", "thread id:" + locala.dke + ",process start jiffies:[" + locala.dkp[0] + "," + locala.dkp[1] + "], process end jiffies:[" + localObject1[0] + "," + localObject1[1] + "],sum process jiffies:" + locala.dks);
              }
              if ((locala.dkt != null) || (locala.dku != null)) {
                break label1074;
              }
              locala.dkt = new f.a(((c.a)localMap.get(Integer.valueOf(arrayOfInt2[0]))).dkP, ((c.a)localMap.get(Integer.valueOf(arrayOfInt2[0]))).dkQ);
              if (arrayOfInt2[1] >= 0) {
                break label1018;
              }
              x.e("MicroMsg.HCPerfStatThread", "cluster one is unused?may be possible.");
              locala.dku = null;
              break label1324;
            }
          }
          else
          {
            locala.dkj = j;
            localObject3 = locala.dkl;
            localObject3[j] = ((int)(localObject3[j] + l2));
            continue;
          }
        }
        else {
          break;
        }
        locala.dkk = k;
        Object localObject3 = locala.dkm;
        localObject3[k] = ((int)(l2 + localObject3[k]));
        continue;
        label980:
        locala.dkk = 0;
        localObject3 = locala.dkm;
        int m = locala.dkk;
        localObject3[m] = ((int)(l2 + localObject3[m]));
        continue;
        label1018:
        locala.dku = new f.a(((c.a)localMap.get(Integer.valueOf(arrayOfInt2[1]))).dkP, ((c.a)localMap.get(Integer.valueOf(arrayOfInt2[1]))).dkQ);
        break label1324;
        label1074:
        if (locala.dkt != null) {
          locala.dkt.k(((c.a)localMap.get(Integer.valueOf(arrayOfInt2[0]))).dkP, ((c.a)localMap.get(Integer.valueOf(arrayOfInt2[0]))).dkQ);
        }
        if (locala.dku != null)
        {
          locala.dku.k(((c.a)localMap.get(Integer.valueOf(arrayOfInt2[1]))).dkP, ((c.a)localMap.get(Integer.valueOf(arrayOfInt2[1]))).dkQ);
          break label1324;
          label1191:
          if ((localException instanceof a.a))
          {
            d.a((a.a)localException);
            break;
          }
          if ((localException instanceof a))
          {
            d.a((a)localException);
            break;
          }
          if (!(localException instanceof b)) {
            break;
          }
          b localb = (b)localException;
          d.reportIDKey(localb.dkC, localb.key, localb.value, localb.caO);
          break;
          try
          {
            label1270:
            if ((this.dkz) && (this.thread != null))
            {
              this.thread.interrupt();
              this.thread = null;
              this.dkz = false;
            }
            wait();
            break;
          }
          finally {}
          label1319:
          i = 0;
          continue;
        }
      }
      label1324:
      i += 1;
    }
  }
  
  public final void start()
  {
    try
    {
      if (this.thread == null)
      {
        this.thread = new Thread(this);
        this.thread.setPriority(5);
        this.thread.start();
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public static final class a
  {
    public final long dkA;
    public final long dkB;
    public final long dkf;
    public final int scene;
    public final int type;
    
    public a(int paramInt1, long paramLong1, int paramInt2, long paramLong2, long paramLong3)
    {
      this.scene = paramInt1;
      this.dkf = paramLong1;
      this.type = paramInt2;
      this.dkA = paramLong2;
      this.dkB = paramLong3;
    }
  }
  
  public static final class b
  {
    public final boolean caO;
    public final boolean dkC;
    public final int key;
    public final int value;
    
    public b(boolean paramBoolean1, int paramInt1, int paramInt2, boolean paramBoolean2)
    {
      this.dkC = paramBoolean1;
      this.key = paramInt1;
      this.value = paramInt2;
      this.caO = paramBoolean2;
    }
  }
  
  public static final class c
  {
    public final List<a.a> dkD;
    public final int dkE;
    public final int dkF;
    public final int[] dkn;
    public final long time;
    
    public c(long paramLong, List<a.a> paramList, int paramInt1, int paramInt2, int[] paramArrayOfInt)
    {
      this.time = paramLong;
      this.dkD = paramList;
      this.dkE = paramInt1;
      this.dkF = paramInt2;
      this.dkn = paramArrayOfInt;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/hardcoder/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */