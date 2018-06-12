package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import com.tencent.mm.R.l;
import com.tencent.mm.a.e;
import com.tencent.mm.network.ab;
import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.plugin.game.gamewebview.ui.GameWebViewUI;
import com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import org.json.JSONObject;

public final class bd
  extends a
{
  public static final int CTRL_BYTE = 237;
  public static final String NAME = "uploadMediaFile";
  private GameWebViewUI jGT;
  UploadMediaFileHelp jHA = new UploadMediaFileHelp();
  
  public final void a(com.tencent.mm.plugin.game.gamewebview.ui.d paramd, JSONObject paramJSONObject, int paramInt)
  {
    x.i("MicroMsg.GameJsApiUploadMediaFile", "invoke");
    if (paramJSONObject == null)
    {
      paramd.E(paramInt, a.f("chooseVideo:fail_invalid_data", null));
      return;
    }
    this.jGT = paramd.getPageActivity();
    String str1 = paramJSONObject.optString("appId");
    String str2 = paramJSONObject.optString("localId");
    if (paramJSONObject.optInt("isShowProgressTips", 0) == 1) {}
    for (boolean bool = true;; bool = false)
    {
      x.i("MicroMsg.GameJsApiUploadMediaFile", "uploadMediaFile, appid = %s, localid = %s, isShowProgressTips = %b", new Object[] { str1, str2, Boolean.valueOf(bool) });
      if ((!bi.oW(str1)) && (!bi.oW(str2))) {
        break;
      }
      x.e("MicroMsg.GameJsApiUploadMediaFile", "appId or localid is null or nil.");
      paramd.E(paramInt, a.f("uploadMediaFile:fail_missing arguments", null));
      return;
    }
    paramJSONObject = this.jHA;
    GameWebViewUI localGameWebViewUI = this.jGT;
    bd.1 local1 = new bd.1(this, paramd, paramInt);
    paramJSONObject.fcq = localGameWebViewUI;
    paramJSONObject.jGU = paramd;
    paramJSONObject.mAppId = str1;
    paramJSONObject.jHD = str2;
    paramJSONObject.jHE = bool;
    paramJSONObject.jHF = local1;
    paramd = this.jHA;
    paramJSONObject = com.tencent.mm.plugin.game.gamewebview.a.d.Db(paramd.jHD);
    if (paramJSONObject == null)
    {
      x.e("MicroMsg.UploadMediaFileHelp", "item is null");
      paramd.jHF.a(false, null);
      return;
    }
    if (paramJSONObject.bMT != 1)
    {
      if ((bi.oW(paramJSONObject.fnM)) || (!e.cn(paramJSONObject.fnM)))
      {
        x.e("MicroMsg.UploadMediaFileHelp", "origFilePath is not exist");
        paramd.jHF.a(false, null);
        return;
      }
      if (!ab.bU(paramd.fcq))
      {
        paramJSONObject = bi.gc(e.cm(paramJSONObject.fnM));
        h.a(paramd.fcq, paramd.fcq.getString(R.l.webview_jssdk_upload_video_gprs_confirm, new Object[] { paramJSONObject }), paramd.fcq.getString(R.l.app_tip), false, new UploadMediaFileHelp.1(paramd), new UploadMediaFileHelp.2(paramd));
        return;
      }
      paramd.aSy();
      return;
    }
    paramd.aSz();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/jsapi/biz/bd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */