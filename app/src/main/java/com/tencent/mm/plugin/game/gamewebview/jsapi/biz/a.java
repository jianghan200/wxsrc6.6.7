package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.content.Context;
import android.widget.Toast;
import com.tencent.mm.R.e;
import com.tencent.mm.R.l;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.plugin.game.gamewebview.ipc.GameWebViewMainProcessService;
import com.tencent.mm.plugin.game.gamewebview.ui.GameWebViewUI;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.h;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class a
  extends com.tencent.mm.plugin.game.gamewebview.jsapi.a
{
  public static final int CTRL_BYTE = 269;
  public static final String NAME = "addDownloadTaskStraight";
  
  static void b(com.tencent.mm.plugin.game.gamewebview.ui.d paramd, JSONObject paramJSONObject, int paramInt)
  {
    Object localObject = paramJSONObject.optString("task_name");
    String str1 = paramJSONObject.optString("task_url");
    String str2 = paramJSONObject.optString("alternative_url");
    long l = paramJSONObject.optLong("task_size");
    String str3 = paramJSONObject.optString("file_md5");
    String str4 = paramJSONObject.optString("extInfo");
    String str5 = paramJSONObject.optString("fileType");
    String str6 = paramJSONObject.optString("appid");
    String str7 = paramJSONObject.optString("packageName");
    int i = paramJSONObject.optInt("scene", 1000);
    paramJSONObject = new DoDownloadTask();
    paramJSONObject.type = 1;
    paramJSONObject.jGC = ((String)localObject);
    paramJSONObject.url = str1;
    paramJSONObject.jGD = str2;
    paramJSONObject.bKg = str3;
    paramJSONObject.extInfo = str4;
    paramJSONObject.jGE = str5;
    paramJSONObject.appId = str6;
    paramJSONObject.packageName = str7;
    paramJSONObject.fHs = l;
    paramJSONObject.scene = i;
    GameWebViewMainProcessService.b(paramJSONObject);
    if (paramJSONObject.bGm <= 0L)
    {
      x.e("MicroMsg.GameJsApiAddDownloadTaskStraight", "fail, downloadId = " + paramJSONObject.bGm);
      paramd.E(paramInt, com.tencent.mm.plugin.game.gamewebview.jsapi.a.f("add_download_task:fail", null));
      return;
    }
    localObject = new HashMap();
    ((Map)localObject).put("download_id", Long.valueOf(paramJSONObject.bGm));
    paramd.E(paramInt, f("add_download_task:ok", (Map)localObject));
  }
  
  public final void a(final com.tencent.mm.plugin.game.gamewebview.ui.d paramd, JSONObject paramJSONObject, int paramInt)
  {
    x.i("MicroMsg.GameJsApiAddDownloadTaskStraight", "invoke");
    GameWebViewUI localGameWebViewUI = paramd.getPageActivity();
    String str = paramJSONObject.optString("task_url");
    long l = paramJSONObject.optLong("task_size");
    if (bi.oW(str))
    {
      x.e("MicroMsg.GameJsApiAddDownloadTaskStraight", "url is null");
      paramd.E(paramInt, com.tencent.mm.plugin.game.gamewebview.jsapi.a.f("add_download_task:fail", null));
      return;
    }
    if (!ao.isNetworkConnected(paramd.getContext()))
    {
      paramd.E(paramInt, com.tencent.mm.plugin.game.gamewebview.jsapi.a.f("add_download_task:fail_network_not_connected", null));
      com.tencent.mm.plugin.game.gamewebview.a.d.runOnUiThread(new a.1(this, paramd));
      x.i("MicroMsg.GameJsApiAddDownloadTaskStraight", " fail, network not ready");
      return;
    }
    if (!f.zZ())
    {
      paramd.E(paramInt, com.tencent.mm.plugin.game.gamewebview.jsapi.a.f("add_download_task:fail_sdcard_not_ready", null));
      com.tencent.mm.plugin.game.gamewebview.a.d.runOnUiThread(new a.2(this, paramd));
      x.i("MicroMsg.GameJsApiAddDownloadTaskStraight", " fail, sdcard not ready");
      return;
    }
    if ((l > 0L) && (!f.aM(l)))
    {
      paramd.E(paramInt, com.tencent.mm.plugin.game.gamewebview.jsapi.a.f("add_download_task:fail_has_not_enough_space", null));
      com.tencent.mm.plugin.game.gamewebview.a.d.runOnUiThread(new Runnable()
      {
        public final void run()
        {
          Toast.makeText(paramd.getContext(), paramd.getContext().getString(R.l.game_download_not_enough_space), 0).show();
        }
      });
      x.i("MicroMsg.GameJsApiAddDownloadTaskStraight", "fail, not enough space, require size = " + l);
      return;
    }
    if (ao.isWifi(localGameWebViewUI))
    {
      b(paramd, paramJSONObject, paramInt);
      return;
    }
    h.a(localGameWebViewUI, localGameWebViewUI.getString(R.l.webview_download_ui_download_not_in_wifi_tips), localGameWebViewUI.getString(R.l.webview_download_ui_download_not_in_wifi_title), localGameWebViewUI.getString(R.l.webview_download_ui_btn_state_to_download), localGameWebViewUI.getString(R.l.app_cancel), false, new a.4(this, paramd, paramJSONObject, paramInt), new a.5(this, paramd, paramInt), R.e.wechat_green);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/jsapi/biz/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */