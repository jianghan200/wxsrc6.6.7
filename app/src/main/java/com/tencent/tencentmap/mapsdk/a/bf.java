package com.tencent.tencentmap.mapsdk.a;

import com.qq.navi.Session;
import com.qq.sim.Millis100TimeProvider;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;

public class bf
{
  volatile Session a = new Session();
  private Semaphore b;
  private bb c;
  private String d;
  private be e;
  private by<Integer, ao> f;
  private AtomicBoolean g;
  
  public bf(be parambe, bb parambb, by<Integer, ao> paramby)
  {
    this.e = parambe;
    this.c = parambb;
    this.d = this.c.a();
    if (parambe.g.d() > 0) {
      this.b = new Semaphore(parambe.g.d());
    }
    this.g = new AtomicBoolean(false);
    this.f = paramby;
  }
  
  protected Session a(am paramam)
  {
    Session localSession = b();
    if ((localSession == null) || (!localSession.isOpen())) {
      throw new bk(this.c, paramam, localSession);
    }
    return localSession;
  }
  
  protected void a()
  {
    b();
    if (this.a.isOpen())
    {
      this.e.b(this);
      return;
    }
    this.e.a(this);
  }
  
  public void a(lb paramlb, int paramInt, long paramLong, String paramString, boolean paramBoolean)
  {
    if (!paramBoolean) {
      ak.a().b(this.e.e).a(paramlb, paramLong, paramInt);
    }
    bg.a(this.e, this.c, paramInt);
  }
  
  protected Session b()
  {
    if (this.a.isOpen()) {
      return this.a;
    }
    if (this.g.compareAndSet(false, true))
    {
      this.e.c.a(this.c, this);
      ax.a(this + " getNextEndPoint wait 500");
      synchronized (this.g)
      {
        try
        {
          this.g.wait(500L);
          return this.a;
        }
        catch (InterruptedException localInterruptedException1)
        {
          for (;;)
          {
            ax.b(this + " getNextEndPoint wait was Interrupted in " + this);
          }
        }
      }
    }
    if (this.a.isOpen()) {
      return this.a;
    }
    ax.a(this + " getNextEndPoint wait 500 for others is connecting");
    synchronized (this.g)
    {
      try
      {
        this.g.wait(500L);
        return this.a;
      }
      catch (InterruptedException localInterruptedException2)
      {
        for (;;)
        {
          ax.b(this + " getNextEndPoint wait was Interrupted in " + this);
        }
      }
    }
  }
  
  protected void b(am paramam)
  {
    paramam.e().c(this.c.b);
    paramam.e().a(this.c.b());
    paramam.e().d(d().a());
    lb locallb = bw.a(this.e.b, paramam.d().e, paramam.d().f, "", this.c.b, this.c.b(), 0, this.e.g.h(), this.e.g.g(), this.e.g.h(), this.c.h());
    ak.a().a(this.e.e);
    ak.a().a(this.e.e, this.c.b, this.e.b, paramam);
    try
    {
      Session localSession = a(paramam);
      Object localObject = new me(0);
      paramam.d().writeTo((me)localObject);
      localObject = mg.a(((me)localObject).a());
      localObject = az.a(true, paramam.e().h(), (byte[])localObject);
      if (paramam.f()) {
        bc.a(paramam.e().h(), paramam.e(), this.f);
      }
      paramam.e().a(localSession.getID());
      localSession.write(localObject);
      if (!paramam.f()) {
        a(locallb, 0, Millis100TimeProvider.INSTANCE.currentTimeMillis() - paramam.e().i(), "sendMsg", true);
      }
      return;
    }
    catch (bk localbk)
    {
      a(locallb, 3, Millis100TimeProvider.INSTANCE.currentTimeMillis() - paramam.e().i(), "sendMsg", true);
      throw localbk;
    }
  }
  
  public void c()
  {
    try
    {
      ax.a(this + " call close all, try to close conn ");
      if (this.a.isOpen()) {
        this.a.close(true);
      }
      return;
    }
    catch (Exception localException)
    {
      ax.b(this + " closeAll session error", localException);
    }
  }
  
  public bb d()
  {
    return this.c;
  }
  
  public String e()
  {
    return this.d;
  }
  
  public String toString()
  {
    return "EndPoint(ID=" + this.a.getID() + " " + this.c + ") ";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/bf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */