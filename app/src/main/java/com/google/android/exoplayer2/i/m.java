package com.google.android.exoplayer2.i;

import java.util.PriorityQueue;

public final class m
{
  public final PriorityQueue<Integer> aCs;
  public int aCt;
  public final Object lock;
  
  public final void mo()
  {
    synchronized (this.lock)
    {
      this.aCs.remove(Integer.valueOf(0));
      if (this.aCs.isEmpty())
      {
        i = Integer.MIN_VALUE;
        this.aCt = i;
        this.lock.notifyAll();
        return;
      }
      int i = ((Integer)this.aCs.peek()).intValue();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/google/android/exoplayer2/i/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */