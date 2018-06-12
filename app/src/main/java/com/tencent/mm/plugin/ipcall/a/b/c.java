package com.tencent.mm.plugin.ipcall.a.b;

import com.tencent.mm.sdk.platformtools.x;

public final class c
{
  public boolean bTv = false;
  public boolean hEj = false;
  public com.tencent.mm.e.b.c kql = null;
  public final Object kqm = new Object();
  int kqn = 92;
  boolean kqo = true;
  int kqp = 0;
  boolean kqq = true;
  com.tencent.mm.e.b.c.a kqr = new c.1(this);
  
  public final void setMute(boolean paramBoolean)
  {
    x.i("MicroMsg.IPCallRecorder", "setMute: %b", new Object[] { Boolean.valueOf(paramBoolean) });
    if ((this.bTv) && (this.kql != null)) {
      this.kql.aO(paramBoolean);
    }
    this.hEj = paramBoolean;
  }
  
  private final class a
    implements Runnable
  {
    private com.tencent.mm.e.b.c kqt = null;
    
    public a(com.tencent.mm.e.b.c paramc)
    {
      this.kqt = paramc;
    }
    
    public final void run()
    {
      x.d("MicroMsg.IPCallRecorder", "do stopRecord");
      if (this.kqt != null)
      {
        this.kqt.we();
        this.kqt = null;
        c localc = c.this;
        localc.kqn = 92;
        localc.kqo = true;
        localc.kqp = 0;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */