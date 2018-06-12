package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import com.tencent.mm.plugin.game.gamewebview.ui.e;
import com.tencent.mm.plugin.game.gamewebview.ui.i;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashSet;
import org.json.JSONObject;

public final class bb
  extends a
{
  public static final int CTRL_BYTE = 14;
  public static final String NAME = "showOptionMenu";
  
  public final void a(d paramd, JSONObject paramJSONObject, int paramInt)
  {
    x.i("MicroMsg.GameJsApiShowOptionMenu", "invoke");
    paramJSONObject = paramd.getActionBar();
    if (paramJSONObject == null)
    {
      x.i("MicroMsg.GameJsApiShowOptionMenu", "actionBar is null");
      return;
    }
    if (paramJSONObject.jKe != null) {
      paramJSONObject.jKe.jKr.clear();
    }
    paramd.E(paramInt, a.f("showOptionMenu:ok", null));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/jsapi/biz/bb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */