package com.tencent.mm.bs;

import java.util.concurrent.atomic.AtomicInteger;

public final class c
{
  private static final class a
    extends c.b<Boolean, Boolean, Boolean>
  {
    public a(b.b<Boolean> paramb1, b.b<Boolean> paramb2) {}
  }
  
  public static abstract class b<Out, In1, In2>
    extends a<Out>
    implements b.a<In1>
  {
    b.b<In1> sNF;
    private b.b<In2> sNG;
    private b.a<In2> sNH = new b.a()
    {
      public final void aZ(In2 paramAnonymousIn2)
      {
        c.b.this.set(c.b.this.u(c.b.this.sNF.get(), paramAnonymousIn2));
      }
    };
    private final AtomicInteger sNI = new AtomicInteger(0);
    
    protected b(String paramString, b.b<In1> paramb, b.b<In2> paramb1, Out paramOut)
    {
      super(paramOut);
      this.sNF = paramb;
      this.sNG = paramb1;
    }
    
    public final void aZ(In1 paramIn1)
    {
      set(u(paramIn1, this.sNG.get()));
    }
    
    protected final void c(b.a<Out> parama)
    {
      super.c(parama);
      if (this.sNI.getAndIncrement() == 0)
      {
        this.sNF.a(this);
        this.sNG.a(this.sNH);
      }
    }
    
    protected final void d(b.a<Out> parama)
    {
      super.b(parama);
      if (this.sNI.decrementAndGet() == 0)
      {
        this.sNF.b(this);
        this.sNG.b(this.sNH);
      }
    }
    
    protected abstract Out u(In1 paramIn1, In2 paramIn2);
  }
  
  private static final class c
    extends c.d<Boolean, Boolean>
  {
    public c(b.b<Boolean> paramb) {}
  }
  
  public static abstract class d<Out, In>
    extends a<Out>
    implements b.a<In>
  {
    private final AtomicInteger sNI = new AtomicInteger(0);
    private b.b<In> sNK;
    
    protected d(String paramString, b.b<In> paramb, Out paramOut)
    {
      super(paramOut);
      this.sNK = paramb;
    }
    
    public final void aZ(In paramIn)
    {
      set(cj(paramIn));
    }
    
    protected final void c(b.a<Out> parama)
    {
      super.c(parama);
      if (this.sNI.getAndIncrement() == 0) {
        this.sNK.a(this);
      }
    }
    
    protected abstract Out cj(In paramIn);
    
    protected final void d(b.a<Out> parama)
    {
      super.d(parama);
      if (this.sNI.decrementAndGet() == 0) {
        this.sNK.b(this);
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/bs/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */