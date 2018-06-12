package com.tencent.mm.plugin.music.model.a;

import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.music.cache.b;
import com.tencent.mm.storage.aa.a;

public final class a
  implements b
{
  public final void bhJ()
  {
    long l1 = ((Long)g.Ei().DT().get(aa.a.sWp, Long.valueOf(0L))).longValue();
    long l2 = System.currentTimeMillis();
    if (l2 - l1 < gio.longValue())
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.PieceCacheCleanController", "don't scanMusic because the time is in one day");
      return;
    }
    g.Ei().DT().a(aa.a.sWp, Long.valueOf(l2));
    com.tencent.mm.sdk.f.e.b(new a.1(this), "ScanMusicThread", 1);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/music/model/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */