package com.tencent.mm.plugin.fts.a.a;

import com.tencent.mm.plugin.fts.a.l;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;

public abstract class h
  extends a
{
  private WeakReference<l> joI;
  public i jsj;
  public j jsk;
  
  public h(i parami)
  {
    this.jsj = parami;
    this.joI = new WeakReference(parami.jsv);
    this.jsj.jsv = null;
  }
  
  public void a(j paramj)
  {
    paramj.jrx = g.ax(this.jsj.bWm, false);
    paramj.bjW = -5;
  }
  
  public final boolean execute()
  {
    Object localObject1 = this.jsj;
    if (!bi.oW(((i)localObject1).bWm)) {}
    try
    {
      ((i)localObject1).bWm = new String(((i)localObject1).bWm.getBytes("UTF8"), "UTF8");
      this.jsk = new j(this.jsj);
      try
      {
        this.jsk.jsw = this;
        a(this.jsk);
        this.jsk.bjW = 0;
        if (this.jsj.handler == null)
        {
          localObject1 = (l)this.joI.get();
          if (localObject1 != null) {
            ((l)localObject1).b(this.jsk);
          }
          return true;
        }
        this.jsj.handler.post(new h.1(this));
        return true;
      }
      catch (Exception localException)
      {
        if ((localException instanceof InterruptedException))
        {
          this.jsk.bjW = 1;
          throw localException;
        }
      }
      finally
      {
        if (this.jsj.handler == null)
        {
          l locall = (l)this.joI.get();
          if (locall != null) {
            locall.b(this.jsk);
          }
        }
        for (;;)
        {
          throw ((Throwable)localObject2);
          this.jsk.bjW = -1;
          break;
          this.jsj.handler.post(new h.1(this));
        }
      }
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      for (;;) {}
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/fts/a/a/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */