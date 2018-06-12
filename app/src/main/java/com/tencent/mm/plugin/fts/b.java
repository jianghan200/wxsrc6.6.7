package com.tencent.mm.plugin.fts;

import com.tencent.mm.plugin.fts.a.a.a;
import com.tencent.mm.plugin.fts.a.a.g;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.a.j;
import com.tencent.mm.plugin.fts.a.l;
import com.tencent.mm.sdk.platformtools.ag;
import java.lang.ref.WeakReference;
import java.util.LinkedList;

public final class b
  extends a
  implements Runnable
{
  private int errorCode;
  private i joH;
  private WeakReference<l> joI;
  
  public b(int paramInt, i parami)
  {
    this.errorCode = paramInt;
    this.joH = parami;
    this.joI = new WeakReference(parami.jsv);
    this.joH.jsv = null;
  }
  
  public final boolean execute()
  {
    j localj;
    if ((this.errorCode == -2) || (this.errorCode == -3))
    {
      localj = new j(this.joH);
      localj.jsw = this;
      localj.bjW = this.errorCode;
      localj.jsx = new LinkedList();
      localj.jrx = g.ax(this.joH.bWm, false);
      if (this.joH.handler != null) {
        break label103;
      }
      l locall = (l)this.joI.get();
      if (locall != null) {
        locall.b(localj);
      }
    }
    for (;;)
    {
      return true;
      label103:
      this.joH.handler.post(new b.1(this, localj));
    }
  }
  
  public final int getId()
  {
    return -1;
  }
  
  public final int getPriority()
  {
    return 0;
  }
  
  public final boolean isCancelled()
  {
    return false;
  }
  
  public final void run()
  {
    try
    {
      execute();
      return;
    }
    catch (Exception localException) {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/fts/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */