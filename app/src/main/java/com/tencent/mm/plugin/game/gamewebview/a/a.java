package com.tencent.mm.plugin.game.gamewebview.a;

import com.tencent.mm.plugin.game.gamewebview.ui.d;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONObject;

public final class a
{
  public static void a(d paramd, int paramInt)
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("height", paramInt);
      paramd.cW("onGetKeyboardHeight", localJSONObject.toString());
      return;
    }
    catch (Exception paramd)
    {
      x.e("MicroMsg.GameWebviewJsLoader", "onGetA8Key, e:" + paramd.getMessage());
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */