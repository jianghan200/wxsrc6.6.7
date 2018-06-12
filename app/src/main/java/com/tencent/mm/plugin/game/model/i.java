package com.tencent.mm.plugin.game.model;

import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;

public class i
  implements com.tencent.mm.ab.e
{
  private static i jLP;
  private boolean dFt = false;
  
  public static i aTO()
  {
    if (jLP == null) {}
    try
    {
      if (jLP == null) {
        jLP = new i();
      }
      return jLP;
    }
    finally {}
  }
  
  private void release()
  {
    this.dFt = false;
    g.DF().b(1311, this);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if (paraml.getType() == 1311)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.GameConfigUpdater", "getGameCenterGlobalSetting sceneEnd, %s, %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      g.Ei().DT().a(aa.a.sOO, Long.valueOf(bi.VE()));
      release();
    }
  }
  
  public final void ft(boolean paramBoolean)
  {
    int i;
    if (paramBoolean) {
      i = 1;
    }
    for (;;)
    {
      if (i != 0) {}
      try
      {
        if (!this.dFt)
        {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.GameConfigUpdater", "Game config start update. force update(%b)", new Object[] { Boolean.valueOf(paramBoolean) });
          release();
          this.dFt = true;
          g.DF().a(1311, this);
          au localau = new au();
          g.DF().a(localau, 0);
        }
        return;
      }
      finally {}
      long l = bi.bG(Long.valueOf(bi.c((Long)g.Ei().DT().get(aa.a.sOO, Long.valueOf(0L)))).longValue());
      if (l > 86400L) {
        i = 1;
      } else {
        i = 0;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/game/model/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */