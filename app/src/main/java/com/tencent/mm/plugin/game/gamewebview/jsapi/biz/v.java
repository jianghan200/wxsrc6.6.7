package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import com.tencent.mm.plugin.game.gamewebview.ui.e;
import com.tencent.mm.plugin.game.gamewebview.ui.i;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONObject;

public final class v
  extends a
{
  public static final int CTRL_BYTE = 14;
  public static final String NAME = "hideOptionMenu";
  
  public final void a(d paramd, JSONObject paramJSONObject, int paramInt)
  {
    x.i("MicroMsg.GameJsApiHideOptionMenu", "invoke");
    paramJSONObject = paramd.getActionBar();
    if (paramJSONObject == null)
    {
      x.e("MicroMsg.GameJsApiHideOptionMenu", "actionBar is null");
      return;
    }
    if (paramJSONObject.jKe != null)
    {
      paramJSONObject = paramJSONObject.jKe;
      paramJSONObject.jKr.clear();
      paramJSONObject.jKr.addAll(paramJSONObject.jKs.values());
      paramJSONObject.jKr.removeAll(paramJSONObject.jKt);
    }
    paramd.E(paramInt, a.f("hideOptionMenu:ok", null));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/jsapi/biz/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */