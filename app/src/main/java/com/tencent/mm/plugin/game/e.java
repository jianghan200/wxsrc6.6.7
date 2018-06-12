package com.tencent.mm.plugin.game;

import com.tencent.mm.bt.h;
import com.tencent.mm.bt.h.d;
import com.tencent.mm.kernel.api.bucket.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.game.a.c;
import com.tencent.mm.plugin.game.model.a.f;
import com.tencent.mm.plugin.game.model.ab;
import com.tencent.mm.plugin.game.model.q;
import com.tencent.mm.plugin.game.model.w;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;

public final class e
  implements com.tencent.mm.kernel.api.bucket.a, d, c
{
  private w jFR;
  private ab jFS;
  private q jFT;
  private f jFU;
  
  public final w aSj()
  {
    g.Eg().Ds();
    if (this.jFR == null)
    {
      g.Ek();
      this.jFR = new w(g.Ei().dqq);
    }
    return this.jFR;
  }
  
  public final ab aSk()
  {
    g.Eg().Ds();
    if (this.jFS == null)
    {
      g.Ek();
      this.jFS = new ab(g.Ei().dqq);
    }
    return this.jFS;
  }
  
  public final f aSl()
  {
    g.Eg().Ds();
    if (this.jFU == null)
    {
      g.Ek();
      this.jFU = new f(g.Ei().dqq);
    }
    return this.jFU;
  }
  
  public final HashMap<Integer, h.d> collectDatabaseFactory()
  {
    x.i("MicroMsg.GameStorage", "GameStorage collectDatabaseFactory");
    HashMap localHashMap = new HashMap();
    localHashMap.put(Integer.valueOf("GAME_CENTER_MSG_INFO_TABLE".hashCode()), new e.1(this));
    localHashMap.put(Integer.valueOf("GAME_CENTER_JSON_CACHE_TABLE".hashCode()), new e.2(this));
    localHashMap.put(Integer.valueOf("GAME_CENTER_PB_CACHE_TABLE".hashCode()), new e.3(this));
    localHashMap.put(Integer.valueOf("GAME_CENTER_SILENT_DOWNLOAD_TABLE".hashCode()), new e.4(this));
    localHashMap.put(Integer.valueOf("CHECK_WEPKG_VERSION".hashCode()), new e.5(this));
    localHashMap.put(Integer.valueOf("WEPKG_PRELOAD_FILES".hashCode()), new e.6(this));
    return localHashMap;
  }
  
  public final void onDataBaseClosed(h paramh1, h paramh2) {}
  
  public final void onDataBaseOpened(h paramh1, h paramh2)
  {
    x.i("MicroMsg.GameStorage", "GameStorage onDataBaseOpened");
    this.jFR = new w(paramh1);
    this.jFS = new ab(paramh1);
    this.jFT = new q(paramh1);
    this.jFU = new f(paramh1);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/game/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */