package com.tencent.mm.plugin.game.gamewebview.b.a;

import android.os.Bundle;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONObject;

public final class d
  extends com.tencent.mm.plugin.game.gamewebview.b.a
{
  public static final int CTRL_BYTE = 0;
  public static final String NAME = "onNetWorkChange";
  
  public final void m(int paramInt, Bundle paramBundle)
  {
    x.i("MicroMsg.GameJsEventNetworkChange", "dispatch");
    if (paramBundle == null) {}
    com.tencent.mm.plugin.game.gamewebview.ui.d locald;
    do
    {
      return;
      paramBundle = paramBundle.getString("netType", "");
      locald = com.tencent.mm.plugin.game.gamewebview.model.a.qL(paramInt);
    } while (locald == null);
    try
    {
      JSONObject localJSONObject = new JSONObject();
      localJSONObject.put("netType", paramBundle);
      locald.cW(getName(), localJSONObject.toString());
      return;
    }
    catch (Exception paramBundle)
    {
      x.e("MicroMsg.GameJsEventNetworkChange", "ex : " + paramBundle.getMessage());
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/b/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */