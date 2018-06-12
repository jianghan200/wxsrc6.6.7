package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.os.Looper;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import com.tencent.mm.plugin.game.gamewebview.ui.d.21;
import com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewInputFooter;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bd;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class bc
  extends com.tencent.mm.plugin.game.gamewebview.jsapi.a
{
  public static final int CTRL_BYTE = 238;
  public static final String NAME = "showSmileyPanel";
  
  public final void a(d paramd, JSONObject paramJSONObject, int paramInt)
  {
    int i = 0;
    x.i("MicroMsg.GameJsApiShowSmileyPanel", "invoke");
    if (paramd.jJa != null) {
      if (Thread.currentThread().getId() != paramd.mHandler.getLooper().getThread().getId()) {
        break label95;
      }
    }
    label95:
    for (i = paramd.jJa.bYA(); i > 0; i = ((Integer)new d.21(paramd, Integer.valueOf(0)).a(paramd.mHandler)).intValue())
    {
      paramJSONObject = new HashMap();
      paramJSONObject.put("height", Integer.valueOf(com.tencent.mm.bp.a.ag(paramd.getContext(), i)));
      paramd.E(paramInt, f("showSmileyPanel:ok", paramJSONObject));
      return;
    }
    paramd.E(paramInt, com.tencent.mm.plugin.game.gamewebview.jsapi.a.f("showSmileyPanel:fail", null));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/jsapi/biz/bc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */