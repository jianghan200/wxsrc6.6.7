package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mm.R.e;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.game.gamewebview.ipc.GameWebViewMainProcessService;
import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.plugin.game.gamewebview.ui.GameWebViewUI;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.h;
import org.json.JSONObject;

public final class aq
  extends a
{
  public static final int CTRL_BYTE = 240;
  public static final String NAME = "resumeDownloadTask";
  private long bGm;
  private int scene;
  
  public final void a(final d paramd, JSONObject paramJSONObject, final int paramInt)
  {
    x.i("MicroMsg.GameJsApiResumeDownloadTask", "GameJsApiResumeDownloadTask");
    GameWebViewUI localGameWebViewUI = paramd.getPageActivity();
    this.bGm = paramJSONObject.optLong("download_id");
    this.scene = paramJSONObject.optInt("scene", 1000);
    if (this.bGm <= 0L)
    {
      x.e("MicroMsg.GameJsApiResumeDownloadTask", "fail, invalid downloadId = " + this.bGm);
      paramd.E(paramInt, a.f("resume_download_task:fail_invalid_downloadid", null));
      return;
    }
    if (ao.isWifi(localGameWebViewUI))
    {
      b(paramd, paramInt);
      return;
    }
    h.a(localGameWebViewUI, localGameWebViewUI.getString(R.l.webview_download_ui_download_not_in_wifi_tips), localGameWebViewUI.getString(R.l.webview_download_ui_download_not_in_wifi_title), localGameWebViewUI.getString(R.l.webview_download_ui_btn_state_to_download), localGameWebViewUI.getString(R.l.app_cancel), false, new DialogInterface.OnClickListener()new aq.2
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        aq.this.b(paramd, paramInt);
        paramAnonymousDialogInterface.dismiss();
      }
    }, new aq.2(this, paramd, paramInt), R.e.wechat_green);
  }
  
  final void b(d paramd, int paramInt)
  {
    DoDownloadTask localDoDownloadTask = new DoDownloadTask();
    localDoDownloadTask.type = 3;
    localDoDownloadTask.bGm = this.bGm;
    localDoDownloadTask.scene = this.scene;
    GameWebViewMainProcessService.b(localDoDownloadTask);
    if (localDoDownloadTask.bJm)
    {
      paramd.E(paramInt, a.f("resume_download_task:ok", null));
      return;
    }
    paramd.E(paramInt, a.f("resume_download_task:fail", null));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/jsapi/biz/aq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */