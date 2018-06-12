package com.tencent.mm.hardcoder;

import com.tencent.mm.sdk.platformtools.x;
import java.util.Deque;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;

public final class f
  implements Runnable
{
  private boolean dkz;
  Queue<c.b> dlb;
  private b dlc;
  private Deque<b> dld;
  private Thread thread;
  
  protected final void finalize()
  {
    super.finalize();
    this.dlb = null;
    this.dlc = null;
    this.dld = null;
  }
  
  public final void run()
  {
    for (;;)
    {
      if (!Thread.currentThread().isInterrupted()) {}
      try
      {
        if (this.dlb.isEmpty()) {
          break label389;
        }
        localObject3 = (c.b)this.dlb.poll();
        if (localObject3 == null) {
          continue;
        }
        l = ((c.b)localObject3).time;
        localObject1 = ((c.b)localObject3).dkR;
        localObject3 = ((c.b)localObject3).dkS;
        if (this.dlc != null) {
          break label217;
        }
        this.dlc = new b(l, (Map)localObject1, (Map)localObject3);
      }
      catch (InterruptedException localInterruptedException)
      {
        for (;;)
        {
          Object localObject3;
          long l;
          Object localObject1;
          x.e("MicroMsg.HardCoderStatThread", "Stat thread need to interrupt:" + localInterruptedException.getMessage());
          Thread.currentThread().interrupt();
          return;
          b localb = this.dlc;
          int[] arrayOfInt = b.k(localInterruptedException);
          localb.dlj = l;
          localb.dkt.k(((c.a)localInterruptedException.get(Integer.valueOf(arrayOfInt[0]))).dkP, ((c.a)localInterruptedException.get(Integer.valueOf(arrayOfInt[0]))).dkQ);
          if (localb.dku != null) {
            localb.dku.k(((c.a)localInterruptedException.get(Integer.valueOf(arrayOfInt[1]))).dkP, ((c.a)localInterruptedException.get(Integer.valueOf(arrayOfInt[1]))).dkQ);
          }
          localb.l((Map)localObject3);
        }
      }
      catch (Exception localException)
      {
        x.e("MicroMsg.HardCoderStatThread", "exception:" + localException.getMessage());
      }
      x.i("MicroMsg.HardCoderStatThread", this.dlc.toString());
      localObject1 = new b(l, (Map)localObject1, (Map)localObject3);
      localObject3 = (b)this.dld.peekFirst();
      localb = (b)this.dld.peekLast();
      if ((localObject3 != null) && (localb != null))
      {
        if (localb.startTime - ((b)localObject3).startTime >= 30000L) {
          this.dld.removeFirst();
        }
        this.dld.add(localObject1);
        continue;
        label217:
        continue;
      }
      this.dld.add(localException);
      continue;
      try
      {
        label389:
        if (this.dkz)
        {
          x.i("MicroMsg.HardCoderStatThread", "snapshotStatDeque size:" + this.dld.size());
          if (this.thread != null)
          {
            this.thread.interrupt();
            this.thread = null;
            this.dkz = false;
          }
        }
        wait();
      }
      finally {}
    }
  }
  
  public static final class a
  {
    public final long dle;
    public final long dlf;
    public long dlg = 0L;
    public long dlh = 0L;
    
    public a(long paramLong1, long paramLong2)
    {
      this.dle = paramLong1;
      this.dlf = paramLong2;
      this.dlg = this.dle;
      this.dlh = this.dlf;
    }
    
    public final void k(long paramLong1, long paramLong2)
    {
      this.dlg = ((this.dlg + paramLong1) / 2L);
      this.dlh = ((this.dlh + paramLong2) / 2L);
    }
    
    public final String toString()
    {
      return String.format("startFreq:%s,startPower:%s,averageFreq:%s,averagePower:%s", new Object[] { Long.valueOf(this.dle), Long.valueOf(this.dlf), Long.valueOf(this.dlg), Long.valueOf(this.dlh) });
    }
  }
  
  public static final class b
  {
    public final Map<Integer, c.a> dkR;
    public final f.a dkt;
    public final f.a dku;
    public final Map<Integer, c.c> dli = new TreeMap();
    public long dlj = 0L;
    public final long startTime;
    
    public b(long paramLong, Map<Integer, c.a> paramMap, Map<Integer, c.c> paramMap1)
    {
      int[] arrayOfInt = k(paramMap);
      this.dkR = paramMap;
      this.dkt = new f.a(((c.a)paramMap.get(Integer.valueOf(arrayOfInt[0]))).dkP, ((c.a)paramMap.get(Integer.valueOf(arrayOfInt[0]))).dkQ);
      if (arrayOfInt[1] < 0) {
        x.e("MicroMsg.HardCoderStatThread", "cluster one is unused?may be possible.");
      }
      for (this.dku = null;; this.dku = new f.a(((c.a)paramMap.get(Integer.valueOf(arrayOfInt[1]))).dkP, ((c.a)paramMap.get(Integer.valueOf(arrayOfInt[1]))).dkQ))
      {
        this.startTime = paramLong;
        this.dlj = this.startTime;
        l(paramMap1);
        return;
      }
    }
    
    public static int[] k(Map<Integer, c.a> paramMap)
    {
      if (paramMap == null) {
        throw new NullPointerException("cpuStatusMap can not be null");
      }
      int i = h.dlm;
      if (i >= 0) {
        if (!paramMap.containsKey(Integer.valueOf(i))) {}
      }
      for (int j = i;; j = -1)
      {
        if (j < 0)
        {
          throw new NullPointerException("cluster zero is unused?impossible.");
          i -= 1;
          break;
        }
        i = h.dln;
        if (i > h.dlm) {
          if (!paramMap.containsKey(Integer.valueOf(i))) {}
        }
        for (;;)
        {
          return new int[] { j, i };
          i -= 1;
          break;
          i = -1;
        }
      }
    }
    
    final void l(Map<Integer, c.c> paramMap)
    {
      if (paramMap == null) {
        throw new NullPointerException("threadStatusMap can not be null");
      }
      Iterator localIterator = paramMap.keySet().iterator();
      if (localIterator.hasNext())
      {
        Integer localInteger = (Integer)localIterator.next();
        Object localObject = (c.c)paramMap.get(localInteger);
        c.c localc;
        if (this.dli.containsKey(localInteger)) {
          localc = (c.c)this.dli.get(localInteger);
        }
        for (;;)
        {
          long l = ((c.c)localObject).dkV;
          localObject = ((c.c)localObject).dko;
          localc.dkq = ((l + localc.dkq) / 2L);
          if (localObject == null) {
            break;
          }
          localc.dkW = (localObject[0] - localc.dko[0] + (localObject[1] - localc.dko[1]));
          if (!HardCoderJNI.hcDebug) {
            break;
          }
          x.d("MicroMsg.HardCoderMonitor", "thread id:" + localc.dkT + ",start jiffies:[" + localc.dko[0] + "," + localc.dko[1] + "], end jiffies:[" + localObject[0] + "," + localObject[1] + "]");
          break;
          localc = new c.c(((c.c)localObject).dkT, ((c.c)localObject).startTime, ((c.c)localObject).dkU, ((c.c)localObject).dkV, ((c.c)localObject).dko);
          this.dli.put(localInteger, localc);
        }
      }
    }
    
    public final String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(String.format("startTime:%s,updateTime:%s", new Object[] { Long.valueOf(this.startTime), Long.valueOf(this.dlj) }));
      localStringBuilder.append(",");
      localStringBuilder.append(this.dkt);
      if (this.dku != null)
      {
        localStringBuilder.append(",");
        localStringBuilder.append(this.dku);
      }
      localStringBuilder.append(",");
      localStringBuilder.append(this.dli.toString());
      return localStringBuilder.toString();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/hardcoder/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */