package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.plugin.game.gamewebview.ui.GameWebViewUI;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import com.tencent.mm.plugin.game.gamewebview.ui.e;
import com.tencent.mm.plugin.game.gamewebview.ui.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class ba
  extends a
{
  public static final int CTRL_BYTE = 86;
  public static final String NAME = "showMenuItems";
  
  public final void a(d paramd, JSONObject paramJSONObject, int paramInt)
  {
    x.i("MicroMsg.GameJsApiShowMenuItems", "invoke");
    Object localObject = paramd.getPageActivity();
    if ((localObject == null) || (((GameWebViewUI)localObject).isFinishing()))
    {
      x.e("MicroMsg.GameJsApiShowMenuItems", "activity is finish");
      return;
    }
    if (paramJSONObject != null)
    {
      paramJSONObject = paramJSONObject.optJSONArray("menuList");
      if (paramJSONObject != null) {}
    }
    else
    {
      x.i("MicroMsg.GameJsApiShowMenuItems", "data is null");
      paramd.E(paramInt, a.f("showMenuItems:fail_invalid_data", null));
      return;
    }
    localObject = paramd.getActionBar();
    if ((localObject != null) && (((e)localObject).jKe != null))
    {
      localObject = ((e)localObject).jKe;
      if (paramJSONObject != null)
      {
        int i = 0;
        while (i < paramJSONObject.length())
        {
          int j = bi.f((Integer)((i)localObject).jKs.get(paramJSONObject.optString(i)));
          if (j > 0) {
            ((i)localObject).jKr.remove(Integer.valueOf(j));
          }
          i += 1;
        }
      }
    }
    paramd.E(paramInt, a.f("showMenuItems:ok", null));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/jsapi/biz/ba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */