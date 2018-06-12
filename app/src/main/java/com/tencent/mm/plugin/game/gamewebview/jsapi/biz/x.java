package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import com.tencent.mm.plugin.game.gamewebview.ipc.GameWebViewMainProcessService;
import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import org.json.JSONObject;

public final class x
  extends a
{
  public static final int CTRL_BYTE = 41;
  public static final String NAME = "installDownloadTask";
  
  public final void a(d paramd, JSONObject paramJSONObject, int paramInt)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.GameJsApiGetNetworkType", "invoke");
    long l;
    if (paramJSONObject != null)
    {
      l = paramJSONObject.optLong("download_id", -1L);
      if (l > 0L) {}
    }
    else
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.GameJsApiGetNetworkType", "data is null");
      paramd.E(paramInt, a.f("install_download_task:fail_invalid_data", null));
      return;
    }
    paramJSONObject = new DoDownloadTask();
    paramJSONObject.type = 5;
    paramJSONObject.bGm = l;
    GameWebViewMainProcessService.b(paramJSONObject);
    if (paramJSONObject.bJm)
    {
      paramd.E(paramInt, a.f("install_download_task:ok", null));
      return;
    }
    paramd.E(paramInt, a.f("install_download_task:fail", null));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/jsapi/biz/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */