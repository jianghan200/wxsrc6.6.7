package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.graphics.Color;
import com.tencent.mm.R.e;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONObject;

public final class au
  extends com.tencent.mm.plugin.game.gamewebview.jsapi.a
{
  public static final int CTRL_BYTE = 182;
  public static final String NAME = "setNavigationBarColor";
  
  public final void a(d paramd, JSONObject paramJSONObject, int paramInt)
  {
    x.i("MicroMsg.GameJsApiSetNavigationBarColor", "invoke");
    int i;
    if (paramJSONObject.optInt("actionCode") == 1) {
      i = 1;
    }
    for (;;)
    {
      int j = -1;
      try
      {
        k = Color.parseColor(paramJSONObject.optString("color"));
        k |= 0xFF000000;
        j = i;
        i = k;
      }
      catch (Exception localException)
      {
        try
        {
          for (;;)
          {
            bi.getFloat(paramJSONObject.optString("alpha"), 1.0F);
            if (j == 0) {
              break label146;
            }
            paramd.gnw = android.support.v4.content.a.g(paramd.jIJ, R.e.action_bar_color);
            paramd.gny = "";
            paramd.aSS();
            paramd.E(paramInt, com.tencent.mm.plugin.game.gamewebview.jsapi.a.f("setNavigationBarColor:ok", null));
            return;
            i = 0;
            break;
            localException = localException;
            x.e("MicroMsg.GameJsApiSetNavigationBarColor", localException.getMessage());
            int k = 1;
            i = j;
            j = k;
          }
        }
        catch (Exception paramJSONObject)
        {
          for (;;)
          {
            x.e("MicroMsg.GameJsApiSetNavigationBarColor", paramJSONObject.getMessage());
            continue;
            label146:
            paramd.setStatusBarColor(i);
          }
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/jsapi/biz/au.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */