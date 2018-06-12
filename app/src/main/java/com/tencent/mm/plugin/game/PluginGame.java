package com.tencent.mm.plugin.game;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.mm.kernel.b.f;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.model.bv;
import com.tencent.mm.plugin.game.a.a.a;
import com.tencent.mm.plugin.game.model.h;
import com.tencent.mm.plugin.game.model.m;
import com.tencent.mm.plugin.messenger.foundation.a.o;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;

public class PluginGame
  extends f
  implements com.tencent.mm.kernel.api.bucket.c, com.tencent.mm.plugin.game.a.d
{
  c jFW;
  
  public void configure(com.tencent.mm.kernel.b.g paramg)
  {
    if (paramg.ES())
    {
      x.i("MicroMsg.PluginGame", "PluginGame configure");
      a.a.a(new b());
      if (this.jFW == null) {
        this.jFW = new c();
      }
    }
  }
  
  public void execute(com.tencent.mm.kernel.b.g paramg)
  {
    if (paramg.ES())
    {
      x.i("MicroMsg.PluginGame", "PluginGame execute");
      com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.game.a.c.class, new e());
      com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.game.a.b.class, new d());
    }
  }
  
  public void onAccountInitialized(e.c paramc)
  {
    x.i("MicroMsg.PluginGame", "onAccountInitialized");
    if (this.jFW != null)
    {
      paramc = this.jFW;
      ((o)com.tencent.mm.kernel.g.n(o.class)).getSysCmdMsgExtension().a("gamecenter", paramc.iwx, true);
      com.tencent.mm.sdk.b.a.sFg.b(paramc.jFw);
      com.tencent.mm.sdk.b.a.sFg.b(paramc.jFx);
      com.tencent.mm.sdk.b.a.sFg.b(paramc.hKG);
      com.tencent.mm.sdk.b.a.sFg.b(paramc.jFy);
      com.tencent.mm.sdk.b.a.sFg.b(paramc.jFz);
      com.tencent.mm.sdk.b.a.sFg.b(paramc.jFA);
      com.tencent.mm.sdk.b.a.sFg.b(paramc.jFB);
      com.tencent.mm.sdk.b.a.sFg.b(paramc.jFC);
      com.tencent.mm.sdk.b.a.sFg.b(paramc.jFF);
      com.tencent.mm.sdk.b.a.sFg.b(paramc.jFG);
      com.tencent.mm.sdk.b.a.sFg.b(paramc.jFD);
      com.tencent.mm.sdk.b.a.sFg.b(paramc.jFH);
      com.tencent.mm.sdk.b.a.sFg.b(paramc.jFI);
      com.tencent.mm.sdk.b.a.sFg.b(paramc.jFJ);
      com.tencent.mm.sdk.b.a.sFg.b(paramc.jFK);
      com.tencent.mm.sdk.b.a.sFg.b(paramc.jFL);
      m.aDb();
      com.tencent.mm.plugin.game.model.a.d.aDb();
      paramc = paramc.jFv;
      x.i("MicroMsg.Wepkg.WepkgListener", "wepkg start listen");
      com.tencent.mm.sdk.b.a.sFg.b(paramc.kgn);
      com.tencent.mm.sdk.b.a.sFg.b(paramc.kgp);
      com.tencent.mm.sdk.b.a.sFg.b(paramc.kgo);
      com.tencent.mm.plugin.game.wepkg.b.a.aDb();
      paramc = ad.getContext();
      if (paramc == null) {}
    }
    for (;;)
    {
      try
      {
        paramc = paramc.getSharedPreferences("we_pkg_sp", 4);
        if (paramc != null) {
          continue;
        }
        x.e("MicroMsg.Wepkg.WepkgListener", "sp is null");
      }
      catch (Exception paramc)
      {
        x.e("MicroMsg.Wepkg.WepkgListener", paramc.getMessage());
        continue;
      }
      h.aTL().Zy();
      return;
      if (paramc.getBoolean("disable_we_pkg", false))
      {
        x.i("MicroMsg.Wepkg.WepkgListener", "enable wepkg");
        paramc.edit().putBoolean("disable_we_pkg", false).commit();
      }
      paramc.edit().putInt("white_screen_times", 0).commit();
    }
  }
  
  public void onAccountRelease()
  {
    x.i("MicroMsg.PluginGame", "onAccountRelease");
    if (this.jFW != null)
    {
      Object localObject = this.jFW;
      ((o)com.tencent.mm.kernel.g.n(o.class)).getSysCmdMsgExtension().b("gamecenter", ((c)localObject).iwx, true);
      com.tencent.mm.sdk.b.a.sFg.c(((c)localObject).jFw);
      com.tencent.mm.sdk.b.a.sFg.c(((c)localObject).jFx);
      com.tencent.mm.sdk.b.a.sFg.c(((c)localObject).hKG);
      com.tencent.mm.sdk.b.a.sFg.c(((c)localObject).jFy);
      com.tencent.mm.sdk.b.a.sFg.c(((c)localObject).jFz);
      com.tencent.mm.sdk.b.a.sFg.c(((c)localObject).jFA);
      com.tencent.mm.sdk.b.a.sFg.c(((c)localObject).jFB);
      com.tencent.mm.sdk.b.a.sFg.c(((c)localObject).jFC);
      com.tencent.mm.sdk.b.a.sFg.c(((c)localObject).jFF);
      com.tencent.mm.sdk.b.a.sFg.c(((c)localObject).jFG);
      com.tencent.mm.sdk.b.a.sFg.c(((c)localObject).jFD);
      com.tencent.mm.sdk.b.a.sFg.c(((c)localObject).jFH);
      com.tencent.mm.sdk.b.a.sFg.c(((c)localObject).jFI);
      com.tencent.mm.sdk.b.a.sFg.c(((c)localObject).jFJ);
      com.tencent.mm.sdk.b.a.sFg.c(((c)localObject).jFK);
      com.tencent.mm.sdk.b.a.sFg.c(((c)localObject).jFL);
      m.aDc();
      com.tencent.mm.plugin.game.model.a.d.aDc();
      localObject = ((c)localObject).jFv;
      x.i("MicroMsg.Wepkg.WepkgListener", "wepkg stop listen");
      com.tencent.mm.sdk.b.a.sFg.c(((com.tencent.mm.plugin.game.wepkg.utils.c)localObject).kgn);
      com.tencent.mm.sdk.b.a.sFg.c(((com.tencent.mm.plugin.game.wepkg.utils.c)localObject).kgp);
      com.tencent.mm.sdk.b.a.sFg.c(((com.tencent.mm.plugin.game.wepkg.utils.c)localObject).kgo);
      com.tencent.mm.plugin.game.wepkg.b.a.aDc();
      com.tencent.mm.plugin.game.wepkg.utils.d.aox();
    }
    com.tencent.mm.plugin.game.e.c.aox();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/game/PluginGame.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */