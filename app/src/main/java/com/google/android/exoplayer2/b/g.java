package com.google.android.exoplayer2.b;

import com.google.android.exoplayer2.i.a;
import java.util.LinkedList;

public abstract class g<I extends e, O extends f, E extends Exception>
  implements c<I, O, E>
{
  private int aic;
  private final Thread aij;
  private final LinkedList<I> aik = new LinkedList();
  private final LinkedList<O> ail = new LinkedList();
  public final I[] aim;
  private final O[] ain;
  public int aio;
  private int aip;
  private I aiq;
  private boolean air;
  private E exception;
  private final Object lock = new Object();
  private boolean released;
  
  public g(I[] paramArrayOfI, O[] paramArrayOfO)
  {
    this.aim = paramArrayOfI;
    this.aio = 2;
    int i = 0;
    while (i < this.aio)
    {
      this.aim[i] = jL();
      i += 1;
    }
    this.ain = paramArrayOfO;
    this.aip = 2;
    i = j;
    while (i < this.aip)
    {
      this.ain[i] = jM();
      i += 1;
    }
    this.aij = new g.1(this);
    this.aij.start();
  }
  
  private void a(I paramI)
  {
    paramI.clear();
    e[] arrayOfe = this.aim;
    int i = this.aio;
    this.aio = (i + 1);
    arrayOfe[i] = paramI;
  }
  
  private void b(O paramO)
  {
    paramO.clear();
    f[] arrayOff = this.ain;
    int i = this.aip;
    this.aip = (i + 1);
    arrayOff[i] = paramO;
  }
  
  private I jF()
  {
    for (;;)
    {
      synchronized (this.lock)
      {
        jH();
        if (this.aiq == null)
        {
          bool = true;
          a.ap(bool);
          if (this.aio == 0)
          {
            localObject1 = null;
            this.aiq = ((e)localObject1);
            localObject1 = this.aiq;
            return (I)localObject1;
          }
          Object localObject1 = this.aim;
          int i = this.aio - 1;
          this.aio = i;
          localObject1 = localObject1[i];
        }
      }
      boolean bool = false;
    }
  }
  
  private O jG()
  {
    synchronized (this.lock)
    {
      jH();
      if (this.ail.isEmpty()) {
        return null;
      }
      f localf = (f)this.ail.removeFirst();
      return localf;
    }
  }
  
  private void jH()
  {
    if (this.exception != null) {
      throw this.exception;
    }
  }
  
  private void jI()
  {
    if (jK()) {
      this.lock.notify();
    }
  }
  
  private boolean jK()
  {
    return (!this.aik.isEmpty()) && (this.aip > 0);
  }
  
  public abstract E a(I paramI, O paramO, boolean paramBoolean);
  
  public void a(O paramO)
  {
    synchronized (this.lock)
    {
      b(paramO);
      jI();
      return;
    }
  }
  
  public final void flush()
  {
    synchronized (this.lock)
    {
      this.air = true;
      this.aic = 0;
      if (this.aiq != null)
      {
        a(this.aiq);
        this.aiq = null;
      }
      if (!this.aik.isEmpty()) {
        a((e)this.aik.removeFirst());
      }
    }
    while (!this.ail.isEmpty()) {
      b((f)this.ail.removeFirst());
    }
  }
  
  final boolean jJ()
  {
    synchronized (this.lock)
    {
      if ((!this.released) && (!jK())) {
        this.lock.wait();
      }
    }
    if (this.released) {
      return false;
    }
    e locale = (e)this.aik.removeFirst();
    Object localObject5 = this.ain;
    int i = this.aip - 1;
    this.aip = i;
    localObject5 = localObject5[i];
    boolean bool = this.air;
    this.air = false;
    if (locale.jy()) {
      ((f)localObject5).cf(4);
    }
    for (;;)
    {
      synchronized (this.lock)
      {
        if (this.air)
        {
          b((f)localObject5);
          a(locale);
          return true;
          if (locale.jx()) {
            ((f)localObject5).cf(Integer.MIN_VALUE);
          }
          this.exception = a(locale, (f)localObject5, bool);
          if (this.exception == null) {
            continue;
          }
          synchronized (this.lock)
          {
            return false;
          }
        }
        if (((f)localObject5).jx())
        {
          this.aic += 1;
          b((f)localObject5);
        }
      }
      ((f)localObject5).aic = this.aic;
      this.aic = 0;
      this.ail.addLast(localObject5);
    }
  }
  
  public abstract I jL();
  
  public abstract O jM();
  
  public final void release()
  {
    synchronized (this.lock)
    {
      this.released = true;
      this.lock.notify();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/exoplayer2/b/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */