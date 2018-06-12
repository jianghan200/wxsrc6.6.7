package com.tencent.mm.plugin.report;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public final class b
{
  private long mDv;
  private HashMap<Integer, Long> mDw = new HashMap();
  private int mID = 463;
  private long mInterval = 300000L;
  
  private void E(int paramInt, long paramLong)
  {
    Long localLong = (Long)this.mDw.get(Integer.valueOf(paramInt));
    long l = paramLong;
    if (localLong != null) {
      l = paramLong + localLong.longValue();
    }
    this.mDw.put(Integer.valueOf(paramInt), Long.valueOf(l));
  }
  
  public final void g(int paramInt1, int paramInt2, long paramLong)
  {
    try
    {
      E(paramInt1, paramLong);
      E(paramInt2, 1L);
      paramLong = System.currentTimeMillis();
      if (paramLong - this.mDv > this.mInterval)
      {
        Iterator localIterator = this.mDw.entrySet().iterator();
        while (localIterator.hasNext())
        {
          Map.Entry localEntry = (Map.Entry)localIterator.next();
          f.mDy.a(this.mID, ((Integer)localEntry.getKey()).intValue(), ((Long)localEntry.getValue()).longValue(), false);
        }
        this.mDv = paramLong;
      }
    }
    finally {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/report/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */