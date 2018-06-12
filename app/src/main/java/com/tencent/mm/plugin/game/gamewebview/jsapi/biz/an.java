package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONObject;

public final class an
  extends a
{
  public static final int CTRL_BYTE = 251;
  public static final String NAME = "recordVideo";
  
  public final void a(d paramd, JSONObject paramJSONObject, int paramInt)
  {
    x.i("MicroMsg.GameJsApiRecordVideo", "invoke");
    if (paramJSONObject == null)
    {
      paramd.E(paramInt, a.f("chooseVideo:fail_invalid_data", null));
      return;
    }
    j.a(paramd, paramJSONObject, paramInt, 1);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/jsapi/biz/an.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */