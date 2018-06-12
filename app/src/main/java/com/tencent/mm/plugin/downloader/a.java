package com.tencent.mm.plugin.downloader;

import com.tencent.mm.bt.h;
import com.tencent.mm.bt.h.d;
import com.tencent.mm.kernel.api.bucket.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.downloader.a.c;
import com.tencent.mm.plugin.downloader.c.b;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;

public final class a
  implements com.tencent.mm.kernel.api.bucket.a, d, c
{
  private b iaZ;
  
  public final b FX()
  {
    g.Ek();
    g.Eg().Ds();
    return this.iaZ;
  }
  
  public final HashMap<Integer, h.d> collectDatabaseFactory()
  {
    x.d("MicroMsg.FileDownloaderService", "collectDatabaseFactory");
    HashMap localHashMap = new HashMap();
    localHashMap.put(Integer.valueOf("FILEDOWNLOAD_TABLE".hashCode()), new a.1(this));
    return localHashMap;
  }
  
  public final void onDataBaseClosed(h paramh1, h paramh2) {}
  
  public final void onDataBaseOpened(h paramh1, h paramh2)
  {
    this.iaZ = new b(paramh1);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/downloader/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */