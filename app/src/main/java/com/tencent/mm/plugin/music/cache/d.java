package com.tencent.mm.plugin.music.cache;

import com.tencent.mm.kernel.g;
import com.tencent.mm.storage.aa.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class d
  implements b
{
  private List<String> git = new ArrayList(10);
  
  public d(List<String> paramList)
  {
    if (!paramList.isEmpty()) {
      this.git.addAll(paramList);
    }
  }
  
  private boolean uw(String paramString)
  {
    Iterator localIterator = this.git.iterator();
    while (localIterator.hasNext()) {
      if (paramString.contains((String)localIterator.next())) {
        return true;
      }
    }
    return false;
  }
  
  public final void bhJ()
  {
    long l1 = ((Long)g.Ei().DT().get(aa.a.sWo, Long.valueOf(0L))).longValue();
    long l2 = System.currentTimeMillis();
    if (l2 - l1 <= lxu.longValue())
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.PieceCacheCleanController", "startClean the last clean time is in MUSIC_NO_SCAN_TIME time");
      return;
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.PieceCacheCleanController", "start clean music file");
    g.Ei().DT().a(aa.a.sWo, Long.valueOf(l2));
    com.tencent.mm.sdk.f.e.post(new d.1(this), "PieceCacheCleanController");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/music/cache/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */