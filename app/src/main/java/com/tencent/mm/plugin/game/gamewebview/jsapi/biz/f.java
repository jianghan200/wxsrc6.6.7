package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import com.tencent.mm.plugin.game.gamewebview.ipc.GameWebViewMainProcessService;
import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONObject;

public final class f
  extends a
{
  public static final int CTRL_BYTE = 39;
  public static final String NAME = "cancelDownloadTask";
  
  public final void a(d paramd, JSONObject paramJSONObject, int paramInt)
  {
    x.i("MicroMsg.GameJsApiCancelDownloadTask", "GameJsApiCancelDownloadTask");
    long l = paramJSONObject.optLong("download_id");
    if (l <= 0L)
    {
      x.e("MicroMsg.GameJsApiCancelDownloadTask", "fail, invalid downloadId = " + l);
      paramd.E(paramInt, a.f("cancel_download_task:fail_invalid_downloadid", null));
      return;
    }
    paramJSONObject = new DoDownloadTask();
    paramJSONObject.type = 4;
    paramJSONObject.bGm = l;
    GameWebViewMainProcessService.b(paramJSONObject);
    if (paramJSONObject.bJm)
    {
      paramd.E(paramInt, a.f("cancel_download_task:ok", null));
      return;
    }
    paramd.E(paramInt, a.f("cancel_download_task:fail", null));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/jsapi/biz/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */