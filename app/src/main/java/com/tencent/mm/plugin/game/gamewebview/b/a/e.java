package com.tencent.mm.plugin.game.gamewebview.b.a;

import android.os.Bundle;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONObject;

public final class e
  extends com.tencent.mm.plugin.game.gamewebview.b.a
{
  public static final int CTRL_BYTE = 0;
  public static final String NAME = "onMediaFileUploadProgress";
  
  public final void m(int paramInt, Bundle paramBundle)
  {
    x.i("MicroMsg.GameJsEventUploadMediaFileProgess", "invoke");
    if (paramBundle == null) {}
    String str;
    int i;
    do
    {
      return;
      str = paramBundle.getString("webview_jssdk_file_item_local_id");
      i = paramBundle.getInt("webview_jssdk_file_item_progreess");
      paramBundle = com.tencent.mm.plugin.game.gamewebview.model.a.qL(paramInt);
    } while (paramBundle == null);
    try
    {
      JSONObject localJSONObject = new JSONObject();
      localJSONObject.put("localId", str);
      localJSONObject.put("percent", i);
      paramBundle.cW(getName(), localJSONObject.toString());
      return;
    }
    catch (Exception paramBundle)
    {
      x.e("MicroMsg.GameJsEventUploadMediaFileProgess", "ex : " + paramBundle.getMessage());
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/b/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */