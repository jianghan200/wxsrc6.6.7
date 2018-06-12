package com.tencent.mm.hardcoder;

import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;

public final class a
{
  public static boolean djU = false;
  private static final int[] djV = { 0, 1, 2, 3 };
  private static final int[] djW = { 0, 1, 2, 3 };
  private static final Map<Integer, Integer> djX;
  private boolean bFi = false;
  b djY = new b();
  LinkedBlockingQueue<Object> djZ = new LinkedBlockingQueue();
  
  static
  {
    HashMap localHashMap = new HashMap();
    djX = localHashMap;
    localHashMap.clear();
    djX.put(Integer.valueOf(101), Integer.valueOf(1));
    djX.put(Integer.valueOf(201), Integer.valueOf(2));
    djX.put(Integer.valueOf(202), Integer.valueOf(3));
    djX.put(Integer.valueOf(203), Integer.valueOf(4));
    djX.put(Integer.valueOf(301), Integer.valueOf(5));
    djX.put(Integer.valueOf(302), Integer.valueOf(6));
    djX.put(Integer.valueOf(401), Integer.valueOf(7));
    djX.put(Integer.valueOf(501), Integer.valueOf(8));
    djX.put(Integer.valueOf(601), Integer.valueOf(9));
    djX.put(Integer.valueOf(602), Integer.valueOf(10));
    djX.put(Integer.valueOf(603), Integer.valueOf(11));
    djX.put(Integer.valueOf(701), Integer.valueOf(12));
    djX.put(Integer.valueOf(702), Integer.valueOf(13));
    djX.put(Integer.valueOf(703), Integer.valueOf(14));
    djX.put(Integer.valueOf(704), Integer.valueOf(15));
    djX.put(Integer.valueOf(705), Integer.valueOf(16));
  }
  
  public a()
  {
    Thread localThread = e.d(new Runnable()
    {
      public final void run()
      {
        x.i("MicroMsg.HardCoder.HCPerfManager", "HCPerfManager thread run start[%d, %s]", new Object[] { Long.valueOf(Thread.currentThread().getId()), Thread.currentThread().getName() });
        a.a(a.this);
        x.i("MicroMsg.HardCoder.HCPerfManager", "HCPerfManager thread run end");
      }
    }, "HCPerfManager", 10);
    localThread.start();
    x.i("MicroMsg.HardCoder.HCPerfManager", "hardcoder HCPerfManager new thread[%s]", new Object[] { localThread });
    this.djY.start();
  }
  
  private void a(long paramLong, List<a> paramList, int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    this.djY.as(new b.c(paramLong, new ArrayList(paramList), paramInt1, paramInt2, paramArrayOfInt));
  }
  
  final void reportIDKey(boolean paramBoolean1, int paramInt1, int paramInt2, boolean paramBoolean2)
  {
    this.djY.as(new b.b(paramBoolean1, paramInt1, paramInt2, paramBoolean2));
  }
  
  static final class a
  {
    public int delay = 0;
    public int dkb = 0;
    public int dkc = 0;
    public int dkd = 0;
    public int dke = 0;
    public long dkf = 0L;
    public long dkg = 0L;
    public long dkh = 0L;
    public int dki = 0;
    int dkj = 0;
    int dkk = 0;
    public int[] dkl = new int[a.aW().length];
    public int[] dkm = new int[a.Cn().length];
    public int[] dkn = null;
    public long[] dko = null;
    public long[] dkp = null;
    public long dkq = 0L;
    public int dkr = 0;
    public long dks = 0L;
    public f.a dkt = null;
    public f.a dku = null;
    public long dkv = 0L;
    public long dkw = 0L;
    long lastUpdateTime = 0L;
    public int scene = 0;
    public long startTime = 0L;
    public String tag;
    
    public final String toString(long paramLong)
    {
      return String.format("h:%x[%d,%d,%d][%d,%d][%d,%d,%d][%d,%d,%d][%s]", new Object[] { Integer.valueOf(hashCode()), Long.valueOf(this.dkg - paramLong), Long.valueOf(this.startTime - paramLong), Long.valueOf(this.dkh - paramLong), Integer.valueOf(this.delay), Integer.valueOf(this.dkb), Integer.valueOf(this.scene), Long.valueOf(this.dkf), Integer.valueOf(this.dki), Integer.valueOf(this.dkc), Integer.valueOf(this.dkd), Integer.valueOf(this.dke), this.tag });
    }
  }
  
  static final class b
  {
    public int aeo = 0;
    public long dkw = 0L;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/hardcoder/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */