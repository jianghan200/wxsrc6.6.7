package com.tencent.mm.storage;

import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.report.f;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;
import java.util.List;

final class al
{
  protected final long taQ = 86400L;
  private ak taR = new ak();
  
  public al()
  {
    Object localObject = new StringBuilder();
    g.Ek();
    localObject = com.tencent.mm.a.e.f(g.Ei().cachePath + "checkmsgid.ini", 0, -1);
    if (!bi.bC((byte[])localObject)) {}
    try
    {
      this.taR.aG((byte[])localObject);
      if (clM()) {
        clL();
      }
      return;
    }
    catch (Exception localException)
    {
      x.w("MicroMsg.DelSvrIdMgr", "DelSvrIDs parse Error");
      x.e("MicroMsg.DelSvrIdMgr", "exception:%s", new Object[] { bi.i(localException) });
    }
  }
  
  private void clL()
  {
    x.i("MicroMsg.DelSvrIdMgr", "summerdel toFile tid[%d] [%d, %d ,%d] stack[%s]", new Object[] { Long.valueOf(Thread.currentThread().getId()), Integer.valueOf(this.taR.taN.size()), Integer.valueOf(this.taR.taO.size()), Integer.valueOf(this.taR.taP.size()), bi.cjd() });
    try
    {
      this.taR.taM.clear();
      this.taR.taL.clear();
      this.taR.taK.clear();
      ak localak = new ak();
      localak.taN.addAll(this.taR.taN);
      localak.taO.addAll(this.taR.taO);
      localak.taP.addAll(this.taR.taP);
      byte[] arrayOfByte = localak.toByteArray();
      StringBuilder localStringBuilder = new StringBuilder();
      g.Ek();
      com.tencent.mm.a.e.b(g.Ei().cachePath + "checkmsgid.ini", arrayOfByte, arrayOfByte.length);
      int j = localak.taN.size();
      int k = localak.taO.size();
      int m = localak.taP.size();
      if (arrayOfByte == null) {}
      for (int i = -1;; i = arrayOfByte.length)
      {
        x.i("MicroMsg.DelSvrIdMgr", "summerdel toFile done [%d, %d, %d] data len[%d]", new Object[] { Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(i) });
        return;
      }
      return;
    }
    catch (Exception localException)
    {
      f.mDy.a(111L, 168L, 1L, false);
      x.printErrStackTrace("MicroMsg.DelSvrIdMgr", localException, "summerdel ", new Object[0]);
    }
  }
  
  private boolean clM()
  {
    boolean bool = false;
    x.v("MicroMsg.DelSvrIdMgr", "checkOldData todayIndex:%d, t0Size:%d, t1Size:%d, t2Size:%d", new Object[] { Integer.valueOf(this.taR.taJ), Integer.valueOf(this.taR.taN.size()), Integer.valueOf(this.taR.taO.size()), Integer.valueOf(this.taR.taP.size()) });
    int i = (int)(bi.VE() / 86400L);
    int j = this.taR.taJ;
    this.taR.taJ = i;
    switch (i - j)
    {
    default: 
      this.taR.taP.clear();
      this.taR.taO.clear();
      this.taR.taN.clear();
      bool = true;
    case 0: 
      return bool;
    case 1: 
      this.taR.taP = this.taR.taO;
      this.taR.taO = this.taR.taN;
      this.taR.taN.clear();
      return true;
    }
    this.taR.taP = this.taR.taN;
    this.taR.taO.clear();
    this.taR.taN.clear();
    return true;
  }
  
  protected final void a(int paramInt, long paramLong1, long paramLong2, boolean paramBoolean)
  {
    if (paramLong1 == 0L) {
      return;
    }
    if (paramBoolean) {
      clM();
    }
    paramInt -= (int)(paramLong2 / 86400L);
    switch (paramInt)
    {
    default: 
      x.e("MicroMsg.DelSvrIdMgr", "should not add to thease lists, dayIndex:%d", new Object[] { Integer.valueOf(paramInt) });
    }
    while (paramBoolean)
    {
      clL();
      return;
      this.taR.taN.add(Long.valueOf(paramLong1));
      continue;
      this.taR.taO.add(Long.valueOf(paramLong1));
      continue;
      this.taR.taP.add(Long.valueOf(paramLong1));
    }
  }
  
  protected final boolean gm(long paramLong)
  {
    if (clM()) {
      clL();
    }
    return (this.taR.taN.contains(Long.valueOf(paramLong))) || (this.taR.taO.contains(Long.valueOf(paramLong))) || (this.taR.taP.contains(Long.valueOf(paramLong)));
  }
  
  protected final void h(List<Integer> paramList, List<Long> paramList1)
  {
    x.i("MicroMsg.DelSvrIdMgr", "add size:%d", new Object[] { Integer.valueOf(paramList.size()) });
    clM();
    int j = (int)(bi.VE() / 86400L);
    int i = 0;
    while (i < paramList.size())
    {
      a(j, ((Integer)paramList.get(i)).intValue(), ((Long)paramList1.get(i)).longValue(), false);
      i += 1;
    }
    clL();
  }
  
  protected final void j(int paramInt, long paramLong1, long paramLong2)
  {
    a(paramInt, paramLong1, paramLong2, true);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/storage/al.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */