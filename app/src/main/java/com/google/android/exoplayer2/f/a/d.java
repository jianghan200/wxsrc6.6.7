package com.google.android.exoplayer2.f.a;

import com.google.android.exoplayer2.f.h;
import com.google.android.exoplayer2.f.i;
import com.google.android.exoplayer2.i.a;
import java.util.LinkedList;
import java.util.PriorityQueue;

abstract class d
  implements com.google.android.exoplayer2.f.e
{
  private long art;
  private final LinkedList<h> axu = new LinkedList();
  final LinkedList<i> axv;
  private final PriorityQueue<h> axw;
  private h axx;
  
  public d()
  {
    int i = 0;
    while (i < 10)
    {
      this.axu.add(new h());
      i += 1;
    }
    this.axv = new LinkedList();
    i = j;
    while (i < 2)
    {
      this.axv.add(new e(this));
      i += 1;
    }
    this.axw = new PriorityQueue();
  }
  
  private void c(h paramh)
  {
    paramh.clear();
    this.axu.add(paramh);
  }
  
  public void O(long paramLong)
  {
    this.art = paramLong;
  }
  
  protected abstract void a(h paramh);
  
  public void b(h paramh)
  {
    boolean bool;
    if (paramh == this.axx)
    {
      bool = true;
      a.ao(bool);
      if (!paramh.jx()) {
        break label37;
      }
      c(paramh);
    }
    for (;;)
    {
      this.axx = null;
      return;
      bool = false;
      break;
      label37:
      this.axw.add(paramh);
    }
  }
  
  public void flush()
  {
    this.art = 0L;
    while (!this.axw.isEmpty()) {
      c((h)this.axw.poll());
    }
    if (this.axx != null)
    {
      c(this.axx);
      this.axx = null;
    }
  }
  
  protected abstract boolean lo();
  
  protected abstract com.google.android.exoplayer2.f.d lp();
  
  public i ls()
  {
    if (this.axv.isEmpty()) {
      return null;
    }
    h localh;
    Object localObject;
    do
    {
      do
      {
        c(localh);
        if ((this.axw.isEmpty()) || (((h)this.axw.peek()).aih > this.art)) {
          break;
        }
        localh = (h)this.axw.poll();
        if (localh.jy())
        {
          localObject = (i)this.axv.pollFirst();
          ((i)localObject).cf(4);
          c(localh);
          return (i)localObject;
        }
        a(localh);
      } while (!lo());
      localObject = lp();
    } while (localh.jx());
    i locali = (i)this.axv.pollFirst();
    locali.a(localh.aih, (com.google.android.exoplayer2.f.d)localObject, Long.MAX_VALUE);
    c(localh);
    return locali;
    return null;
  }
  
  public h lt()
  {
    if (this.axx == null) {}
    for (boolean bool = true;; bool = false)
    {
      a.ap(bool);
      if (!this.axu.isEmpty()) {
        break;
      }
      return null;
    }
    this.axx = ((h)this.axu.pollFirst());
    return this.axx;
  }
  
  public void release() {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/google/android/exoplayer2/f/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */