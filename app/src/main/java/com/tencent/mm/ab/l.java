package com.tencent.mm.ab;

import com.tencent.mm.model.bh;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import junit.framework.Assert;

public abstract class l
{
  public boolean aBS = false;
  public com.tencent.mm.network.e dIX;
  public long dIY = bi.VG();
  public int dIZ = -1;
  private r dJa;
  e dJb;
  public boolean dJc;
  public q dJd;
  private int limit = -99;
  int priority = 0;
  
  public int Cc()
  {
    return 1;
  }
  
  public boolean KX()
  {
    return false;
  }
  
  public boolean KY()
  {
    return this.limit <= 0;
  }
  
  public boolean KZ()
  {
    return false;
  }
  
  public boolean La()
  {
    return Cc() == 1;
  }
  
  public final int Lb()
  {
    if (this.dJd == null) {
      return 0;
    }
    return this.dJd.hashCode();
  }
  
  public abstract int a(com.tencent.mm.network.e parame, e parame1);
  
  public int a(com.tencent.mm.network.e parame, final q paramq, final k paramk)
  {
    c(parame);
    this.dJd = paramq;
    paramk = bh.a(paramk);
    if (this.limit == -99)
    {
      this.limit = Cc();
      x.i("MicroMsg.NetSceneBase", "initilized security limit count to " + this.limit);
    }
    if (Cc() > 1) {
      switch (2.dJh[(a(paramq) - 1)])
      {
      default: 
        Assert.assertTrue("invalid security verification status", false);
      }
    }
    while (KY())
    {
      x.e("MicroMsg.NetSceneBase", "dispatch failed, scene limited for security, current limit=" + Cc());
      a(a.dJj);
      this.dIZ = -1;
      return this.dIZ;
      Assert.assertTrue("scene security verification not passed, type=" + paramq.getType() + ", uri=" + paramq.getUri() + ", CHECK NOW", false);
      continue;
      x.e("MicroMsg.NetSceneBase", "scene security verification not passed, type=" + paramq.getType() + ", uri=" + paramq.getUri());
      this.limit -= 1;
      a(a.dJi);
      this.dIZ = -1;
      return this.dIZ;
    }
    this.limit -= 1;
    t localt = new t(paramq);
    if ((this.dJa != null) && (!KZ())) {
      this.dJa.cancel();
    }
    this.dJa = new r(paramq, paramk, this, this.dJb, parame);
    this.dIZ = parame.a(localt, this.dJa);
    x.i("MicroMsg.NetSceneBase", "dispatcher send, %s", new Object[] { Integer.valueOf(this.dIZ) });
    if (this.dIZ < 0)
    {
      x.i("MicroMsg.NetSceneBase", "dispatcher send, %s, ThreadID:%s, getType:%s", new Object[] { Integer.valueOf(this.dIZ), Long.valueOf(Thread.currentThread().getId()), Integer.valueOf(paramq.getType()) });
      new ag().post(new Runnable()
      {
        public final void run()
        {
          x.i("MicroMsg.NetSceneBase", "dispatcher send, %s, ThreadID:%s, getType:%s", new Object[] { Integer.valueOf(l.this.dIZ), Long.valueOf(Thread.currentThread().getId()), Integer.valueOf(paramq.getType()) });
          paramk.a(-1, 3, -1, "send to network failed", paramq, null);
          x.i("MicroMsg.NetSceneBase", "dispatcher send, %s, ThreadID:%s, getType:%s", new Object[] { Integer.valueOf(l.this.dIZ), Long.valueOf(Thread.currentThread().getId()), Integer.valueOf(paramq.getType()) });
        }
      });
      return 99999999;
    }
    parame = this.dJa;
    parame.handler.postDelayed(parame.dJQ, 330000L);
    return this.dIZ;
  }
  
  public int a(q paramq)
  {
    return b.dJl;
  }
  
  public void a(a parama) {}
  
  public boolean a(l paraml)
  {
    return false;
  }
  
  public boolean b(l paraml)
  {
    return false;
  }
  
  public final void c(com.tencent.mm.network.e parame)
  {
    this.dIY = bi.VG();
    this.dIX = parame;
  }
  
  public void cancel()
  {
    x.i("MicroMsg.NetSceneBase", "cancel: %d, hash:%d, type:%d", new Object[] { Integer.valueOf(this.dIZ), Integer.valueOf(hashCode()), Integer.valueOf(getType()) });
    this.aBS = true;
    if (this.dJa != null) {
      this.dJa.cancel();
    }
    if ((this.dIZ != -1) && (this.dIX != null))
    {
      int i = this.dIZ;
      this.dIZ = -1;
      this.dIX.cancel(i);
    }
  }
  
  public String getInfo()
  {
    return "";
  }
  
  public abstract int getType();
  
  public final void reset()
  {
    this.dIY = bi.VG();
    this.dIZ = -1;
    this.limit = -99;
  }
  
  protected static enum a
  {
    private a() {}
  }
  
  protected static enum b
  {
    public static int[] Lc()
    {
      return (int[])dJo.clone();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/ab/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */