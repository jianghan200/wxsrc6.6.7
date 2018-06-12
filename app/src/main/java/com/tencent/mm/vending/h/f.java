package com.tencent.mm.vending.h;

import com.tencent.mm.vending.c.a;

public final class f
{
  private volatile d uQQ;
  volatile a uRb;
  
  public f(d paramd, a parama)
  {
    b(paramd);
    this.uRb = parama;
  }
  
  private void c(d paramd)
  {
    try
    {
      this.uQQ = paramd;
      return;
    }
    finally
    {
      paramd = finally;
      throw paramd;
    }
  }
  
  public void a(final a parama, final Object paramObject, boolean paramBoolean)
  {
    label149:
    label161:
    for (;;)
    {
      d locald;
      try
      {
        locald = this.uQQ;
        if (!(parama instanceof e)) {
          break label161;
        }
        e locale = (e)parama;
        if ("Vending.ANY".equals(locale.xr())) {
          break label161;
        }
        locald = g.abG(locale.xr());
        if (locald == null)
        {
          if (this.uRb != null) {
            this.uRb.interrupt();
          }
          return;
        }
        parama = new Runnable()
        {
          public final void run()
          {
            if (f.this.uRb != null) {
              f.this.uRb.cBI();
            }
            try
            {
              Object localObject = parama.call(paramObject);
              if (f.this.uRb != null) {
                f.this.uRb.cw(localObject);
              }
              return;
            }
            catch (ClassCastException localClassCastException)
            {
              this.uRn.initCause(localClassCastException);
              throw this.uRn;
            }
          }
        };
        if (-1L >= 0L) {
          break label149;
        }
        if ((paramBoolean) && (g.cBM() == locald))
        {
          parama.run();
          continue;
        }
        locald.g(parama);
      }
      finally {}
      continue;
      locald.g(parama, -1L);
    }
  }
  
  public final void b(d paramd)
  {
    try
    {
      c(paramd);
      return;
    }
    finally
    {
      paramd = finally;
      throw paramd;
    }
  }
  
  public static abstract interface a
  {
    public abstract void cBI();
    
    public abstract void cw(Object paramObject);
    
    public abstract void interrupt();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/vending/h/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */