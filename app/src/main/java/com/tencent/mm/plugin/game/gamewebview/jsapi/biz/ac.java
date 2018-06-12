package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.content.Intent;
import com.tencent.mm.plugin.game.gamewebview.a.c;
import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.plugin.game.gamewebview.ui.GameWebViewUI;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import com.tencent.mm.plugin.game.ui.GameCenterUI;
import com.tencent.mm.plugin.game.ui.GameDetailUI;
import com.tencent.mm.plugin.game.ui.GameLibraryUI;
import com.tencent.mm.plugin.game.ui.GameMessageUI;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONObject;

public final class ac
  extends a
{
  public static final int CTRL_BYTE = 175;
  public static final String NAME = "openGameCenter";
  
  public final void a(d paramd, JSONObject paramJSONObject, int paramInt)
  {
    int i = 0;
    x.i("MicroMsg.GameJsApiShowMenuItems", "invoke");
    GameWebViewUI localGameWebViewUI = paramd.getPageActivity();
    if ((localGameWebViewUI == null) || (localGameWebViewUI.isFinishing()))
    {
      x.e("MicroMsg.GameJsApiShowMenuItems", "activity is finish");
      return;
    }
    if (paramJSONObject == null)
    {
      x.i("MicroMsg.GameJsApiShowMenuItems", "data is null");
      paramd.E(paramInt, a.f("gameCenterJump:fail_invalid_data", null));
      return;
    }
    int j = paramJSONObject.optInt("jumpView");
    int k = paramJSONObject.optInt("jumpType");
    x.i("MicroMsg.GameJsApiShowMenuItems", "jumpView = %d, jumpType = %d", new Object[] { Integer.valueOf(j), Integer.valueOf(k) });
    Object localObject = paramJSONObject.optJSONObject("extInfo");
    if (localObject != null) {
      i = ((JSONObject)localObject).optInt("ssid");
    }
    paramJSONObject = new Intent();
    switch (j)
    {
    default: 
      return;
    case 0: 
      paramJSONObject.setClass(localGameWebViewUI, GameCenterUI.class);
      if (k == 1) {
        paramJSONObject.putExtra("jump_find_more_friends", "jump_find_more_friends");
      }
      paramJSONObject.putExtra("game_report_from_scene", 5);
      localGameWebViewUI.startActivity(paramJSONObject);
      paramd.E(paramInt, a.f("gameCenterJump:ok", null));
      c.E(localGameWebViewUI, i);
      return;
    case 1: 
      paramJSONObject.setClass(localGameWebViewUI, GameLibraryUI.class);
      if (k == 1) {
        paramJSONObject.putExtra("jump_game_center", "jump_game_center");
      }
      paramJSONObject.putExtra("game_report_from_scene", 5);
      localGameWebViewUI.startActivity(paramJSONObject);
      c.E(localGameWebViewUI, i);
      return;
    case 2: 
      if (localObject != null)
      {
        localObject = ((JSONObject)localObject).optString("appId");
        if (!bi.oW((String)localObject)) {}
      }
      else
      {
        paramd.E(paramInt, a.f("gameCenterJump:fail_invalid_data", null));
        return;
      }
      paramJSONObject.setClass(localGameWebViewUI, GameDetailUI.class);
      paramJSONObject.putExtra("game_app_id", (String)localObject);
      if (k == 1) {
        paramJSONObject.putExtra("jump_game_center", "jump_game_center");
      }
      paramJSONObject.putExtra("game_report_from_scene", 5);
      localGameWebViewUI.startActivity(paramJSONObject);
      c.E(localGameWebViewUI, i);
      return;
    }
    paramJSONObject.setClass(localGameWebViewUI, GameMessageUI.class);
    paramJSONObject.putExtra("game_report_from_scene", 5);
    localGameWebViewUI.startActivity(paramJSONObject);
    c.E(localGameWebViewUI, i);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/jsapi/biz/ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */