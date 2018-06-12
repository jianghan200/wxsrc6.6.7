package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.content.Context;
import android.content.Intent;
import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import org.json.JSONObject;

public final class e
  extends a
{
  public static final int CTRL_BYTE = 111;
  public static final String NAME = "batchViewCard";
  
  public final void a(com.tencent.mm.plugin.game.gamewebview.ui.d paramd, JSONObject paramJSONObject, int paramInt)
  {
    x.i("MicroMsg.GameJsApiBatchViewCard", "invoke");
    Object localObject = paramJSONObject.optString("card_list");
    String str = paramJSONObject.optString("tempalate_id");
    paramJSONObject = new Intent();
    paramJSONObject.putExtra("card_list", (String)localObject);
    paramJSONObject.putExtra("key_template_id", str);
    paramJSONObject.putExtra("key_from_scene", 7);
    localObject = paramd.getPageActivity();
    ((MMActivity)localObject).geJ = new e.1(this, paramd, paramInt);
    com.tencent.mm.bg.d.a((Context)localObject, "card", ".ui.CardViewEntranceUI", paramJSONObject, hashCode() & 0xFFFF, false);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/jsapi/biz/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */