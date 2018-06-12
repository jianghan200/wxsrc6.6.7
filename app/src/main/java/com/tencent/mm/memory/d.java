package com.tencent.mm.memory;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public abstract class d<T, S>
{
  protected Queue<T> duU = new ConcurrentLinkedQueue();
  protected S duV;
  
  public d(S paramS)
  {
    this.duV = paramS;
  }
  
  public final S Fn()
  {
    return (S)this.duV;
  }
  
  public final T pop()
  {
    return (T)this.duU.poll();
  }
  
  public final void put(T paramT)
  {
    this.duU.add(paramT);
  }
  
  public final int size()
  {
    return this.duU.size();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/memory/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */