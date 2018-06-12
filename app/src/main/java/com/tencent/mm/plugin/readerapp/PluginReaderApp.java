package com.tencent.mm.plugin.readerapp;

import com.tencent.mm.kernel.b.f;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.model.p;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.readerapp.a.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.storage.x;

public class PluginReaderApp
  extends f
  implements com.tencent.mm.kernel.api.c, a
{
  private com.tencent.mm.ab.e mno = new PluginReaderApp.2(this);
  
  private boolean checkInstall()
  {
    return (q.GQ() & 0x80000) == 0;
  }
  
  private boolean checkRecvNews()
  {
    return (q.GL() & 0x400) == 0;
  }
  
  private void reportPluginStatus()
  {
    int i;
    if (checkInstall())
    {
      i = 1;
      if (!checkRecvNews()) {
        break label74;
      }
    }
    label74:
    for (int j = 1;; j = 0)
    {
      h.mEJ.h(15416, new Object[] { "newsapp", Integer.valueOf(i), Integer.valueOf(j) });
      com.tencent.mm.kernel.g.Ei().DT().a(aa.a.sZU, Long.valueOf(System.currentTimeMillis()));
      return;
      i = 0;
      break;
    }
  }
  
  public void configure(com.tencent.mm.kernel.b.g paramg)
  {
    if (paramg.ES()) {
      pin(new p(com.tencent.mm.plugin.readerapp.c.g.class));
    }
  }
  
  public void dependency()
  {
    dependsOn(com.tencent.mm.plugin.messenger.foundation.a.o.class);
  }
  
  public void execute(com.tencent.mm.kernel.b.g paramg)
  {
    if (paramg.ES()) {
      com.tencent.mm.bg.c.Um("readerapp");
    }
  }
  
  public void installed()
  {
    alias(a.class);
  }
  
  public void onAccountInitialized(e.c paramc)
  {
    com.tencent.mm.sdk.f.e.post(new PluginReaderApp.1(this), "ReaderAppReport");
  }
  
  public void onAccountRelease()
  {
    com.tencent.mm.kernel.g.DF().b(138, this.mno);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/readerapp/PluginReaderApp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */