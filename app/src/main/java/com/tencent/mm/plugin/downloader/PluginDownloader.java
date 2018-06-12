package com.tencent.mm.plugin.downloader;

import com.tencent.mm.kernel.b.f;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.plugin.downloader.a.d;
import com.tencent.mm.sdk.platformtools.x;

public class PluginDownloader
  extends f
  implements com.tencent.mm.kernel.api.c, d
{
  public void execute(com.tencent.mm.kernel.b.g paramg)
  {
    x.d("MicroMsg.PluginDownloader", "execute");
    if (paramg.ES()) {
      com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.downloader.a.c.class, new a());
    }
  }
  
  public void onAccountInitialized(e.c paramc)
  {
    com.tencent.mm.plugin.downloader.b.a.aDb();
    new Thread(new PluginDownloader.1(this)).start();
  }
  
  public void onAccountRelease() {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/downloader/PluginDownloader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */