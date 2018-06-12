package com.tencent.mm.plugin.game.gamewebview.b.a;

import android.os.Bundle;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONObject;

public final class b
  extends com.tencent.mm.plugin.game.gamewebview.b.a
{
  public static final int CTRL_BYTE = 0;
  public static final String NAME = "wxdownload:progress_change";
  
  public final void m(int paramInt, Bundle paramBundle)
  {
    if (paramBundle == null) {}
    String str;
    long l1;
    long l2;
    do
    {
      return;
      str = paramBundle.getString("appid");
      l1 = paramBundle.getLong("download_id");
      l2 = paramBundle.getInt("progress");
      paramBundle = com.tencent.mm.plugin.game.gamewebview.model.a.qL(paramInt);
    } while (paramBundle == null);
    try
    {
      JSONObject localJSONObject = new JSONObject();
      localJSONObject.put("appid", str);
      localJSONObject.put("download_id", l1);
      localJSONObject.put("progress", l2);
      paramBundle.cW(getName(), localJSONObject.toString());
      return;
    }
    catch (Exception paramBundle)
    {
      x.e("MicroMsg.GameJsEventDownloadProgressChange", "ex : " + paramBundle.getMessage());
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/b/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */