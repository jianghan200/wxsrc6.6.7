package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.content.Intent;
import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity.a;
import java.util.HashMap;
import org.json.JSONObject;

public final class ad
  extends a
{
  public static final int CTRL_BYTE = 242;
  public static final String NAME = "openGameRegion";
  
  public final void a(final com.tencent.mm.plugin.game.gamewebview.ui.d paramd, JSONObject paramJSONObject, final int paramInt)
  {
    x.i("MicroMsg.GameJsApiOpenGameRegion", "invoke");
    paramJSONObject = paramd.getPageActivity();
    paramJSONObject.geJ = new MMActivity.a()
    {
      public final void b(int paramAnonymousInt1, int paramAnonymousInt2, Intent paramAnonymousIntent)
      {
        if (paramAnonymousInt1 == (ad.this.hashCode() & 0xFFFF))
        {
          if (paramAnonymousInt2 != -1) {
            break label90;
          }
          if (paramAnonymousIntent != null)
          {
            paramAnonymousIntent = bi.aG(paramAnonymousIntent.getStringExtra("gameRegionName"), "");
            HashMap localHashMap = new HashMap();
            localHashMap.put("gameRegionName", paramAnonymousIntent);
            paramd.E(paramInt, ad.f("get game region:ok", localHashMap));
          }
        }
        else
        {
          return;
        }
        paramd.E(paramInt, a.f("get game region:fail", null));
        return;
        label90:
        if (paramAnonymousInt2 == 1)
        {
          paramd.E(paramInt, a.f("get game region:fail", null));
          return;
        }
        paramd.E(paramInt, a.f("get game region:cancel", null));
      }
    };
    com.tencent.mm.bg.d.a(paramJSONObject, "game", ".ui.GameRegionSelectUI", null, hashCode() & 0xFFFF, false);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/jsapi/biz/ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */