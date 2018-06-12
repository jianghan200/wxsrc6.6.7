package com.tencent.mm.plugin.notification.c;

import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;

public final class b
{
  int currentIndex = 0;
  public ArrayList<Long> lHE = new ArrayList();
  
  public final long bks()
  {
    long l2 = -1L;
    long l1 = l2;
    if (this.lHE.size() > 0)
    {
      l1 = l2;
      if (this.currentIndex < this.lHE.size()) {
        l1 = ((Long)this.lHE.get(this.currentIndex)).longValue();
      }
    }
    x.d("MicroMsg.FailMsglist", "getNextSendMsgId:%d, currentIndex:%d, msgIdList.size:%d", new Object[] { Long.valueOf(l1), Integer.valueOf(this.currentIndex), Integer.valueOf(this.lHE.size()) });
    this.currentIndex += 1;
    return l1;
  }
  
  public final void clear()
  {
    this.lHE.clear();
    this.currentIndex = 0;
  }
  
  public final void ej(long paramLong)
  {
    x.d("MicroMsg.FailMsglist", "addMsgId:%d, currentIndex:%d, size:%d", new Object[] { Long.valueOf(paramLong), Integer.valueOf(this.currentIndex), Integer.valueOf(this.lHE.size()) });
    this.lHE.add(Long.valueOf(paramLong));
  }
  
  public final boolean ek(long paramLong)
  {
    return this.lHE.contains(Long.valueOf(paramLong));
  }
  
  public final long get(int paramInt)
  {
    return ((Long)this.lHE.get(paramInt)).longValue();
  }
  
  public final void remove(long paramLong)
  {
    this.lHE.remove(Long.valueOf(paramLong));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/notification/c/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */