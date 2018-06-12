package com.tencent.mm.plugin.game.gamewebview.ui;

import android.os.Bundle;
import com.tencent.mm.plugin.game.gamewebview.ipc.CommonLogicTask;
import com.tencent.mm.plugin.game.gamewebview.ipc.GWMainProcessTask;
import com.tencent.mm.plugin.game.gamewebview.ipc.GameWebViewMainProcessService;
import com.tencent.mm.plugin.webview.ui.tools.game.menu.a;
import com.tencent.mm.plugin.webview.ui.tools.game.menu.c;
import com.tencent.mm.plugin.webview.ui.tools.widget.WebViewSearchContentInputFooter;
import com.tencent.mm.protocal.c.alt;
import com.tencent.mm.protocal.c.atl;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.l;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class g
  extends i
{
  private Map<Integer, atl> jKi = new HashMap();
  
  public g(b paramb)
  {
    super(paramb);
  }
  
  private l aTf()
  {
    label196:
    for (;;)
    {
      try
      {
        Object localObject1 = a.qgo;
        Object localObject2 = new CommonLogicTask();
        ((CommonLogicTask)localObject2).type = 9;
        ((CommonLogicTask)localObject2).jfZ.putString("game_hv_menu_appid", getBundle().getString("game_hv_menu_appid"));
        GameWebViewMainProcessService.b((GWMainProcessTask)localObject2);
        localObject2 = ((CommonLogicTask)localObject2).jfZ.getString("game_hv_menu_pbcache");
        if (bi.oW((String)localObject2)) {
          break label196;
        }
        localObject2 = ((String)localObject2).getBytes("ISO-8859-1");
        Object localObject3 = new alt();
        ((alt)localObject3).aG((byte[])localObject2);
        if (bi.cX(((alt)localObject3).rOg)) {
          break label196;
        }
        localObject1 = ((alt)localObject3).rOg;
        x.i("MicroMsg.GameWebViewMenuHelp", "use net menu data");
        this.jKi.clear();
        localObject2 = ((List)localObject1).iterator();
        if (((Iterator)localObject2).hasNext())
        {
          localObject3 = (atl)((Iterator)localObject2).next();
          this.jKi.put(Integer.valueOf(((atl)localObject3).rWO), localObject3);
          continue;
        }
        c.bXN();
      }
      catch (Exception localException)
      {
        x.e("MicroMsg.GameWebViewMenuHelp", "get cache hv game menu fail! exception:%s", new Object[] { localException.getMessage() });
        return null;
      }
      l locall = c.c(this.jKc.getContext(), localException);
      return locall;
    }
  }
  
  public final void aTe()
  {
    if (bi.oW(getBundle().getString("game_hv_menu_appid")))
    {
      super.aTe();
      return;
    }
    com.tencent.mm.plugin.webview.ui.tools.game.menu.d locald = new com.tencent.mm.plugin.webview.ui.tools.game.menu.d(this.jIJ);
    locald.a(new g.1(this));
    locald.qgF = new g.2(this);
    if (this.jKc.isFullScreen()) {
      locald.qgK = true;
    }
    for (locald.qgL = true; this.jKc.getPageView().jJb.isShown(); locald.qgL = false)
    {
      this.jKc.getPageView().fq(false);
      ah.i(new g.3(this, locald), 100L);
      return;
      locald.qgK = false;
    }
    this.jIJ.YC();
    ah.i(new g.4(this, locald), 100L);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/ui/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */