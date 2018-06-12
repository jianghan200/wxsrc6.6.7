package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.content.Intent;
import com.tencent.mm.plugin.game.gamewebview.ui.GameWebViewUI;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONObject;

public final class j
  extends com.tencent.mm.plugin.game.gamewebview.jsapi.a
{
  public static final int CTRL_BYTE = 191;
  public static final String NAME = "chooseVideo";
  
  public static void a(com.tencent.mm.plugin.game.gamewebview.ui.d paramd, JSONObject paramJSONObject, int paramInt1, int paramInt2)
  {
    GameWebViewUI localGameWebViewUI = paramd.getPageActivity();
    if ((localGameWebViewUI == null) || (localGameWebViewUI.isFinishing()))
    {
      x.e("MicroMsg.GameJsApiChooseVideo", "activity is null");
      return;
    }
    int j = 0;
    String str1 = paramJSONObject.optString("sourceType", "");
    String str2 = paramJSONObject.optString("camera", "");
    x.i("MicroMsg.GameJsApiChooseVideo", "doChooseVideo sourceType = %s, camera = %s, isVideoType:%d", new Object[] { str1, str2, Integer.valueOf(paramInt2) });
    int k = paramJSONObject.optInt("maxDuration", 60);
    if (str1.contains("album")) {
      j = 4096;
    }
    int i = j;
    if (str1.contains("camera"))
    {
      if (k <= 0)
      {
        paramd.E(paramInt1, com.tencent.mm.plugin.game.gamewebview.a.d.f("chooseVideo:fail", null));
        return;
      }
      if (str2.equals("front")) {
        i = j | 0x10;
      }
    }
    else
    {
      if (i != 0) {
        break label549;
      }
      i = 4352;
    }
    label267:
    label489:
    label549:
    for (;;)
    {
      boolean bool;
      if ((i == 16) || (i == 256) || (i == 4352))
      {
        if (paramInt2 != 1) {
          break label489;
        }
        bool = com.tencent.mm.pluginsdk.permission.a.a(localGameWebViewUI, "android.permission.CAMERA", 117, "", "");
        x.d("MicroMsg.GameJsApiChooseVideo", " checkPermission checkcamera[%b]", new Object[] { Boolean.valueOf(bool) });
        if (!bool) {
          break;
        }
        bool = com.tencent.mm.pluginsdk.permission.a.a(localGameWebViewUI, "android.permission.RECORD_AUDIO", 118, "", "");
        x.d("MicroMsg.GameJsApiChooseVideo", " checkPermission checkMicroPhone[%b]", new Object[] { Boolean.valueOf(bool) });
        if (!bool) {
          break;
        }
      }
      j = paramJSONObject.optInt("quality", 1);
      if ((j != 0) && (j != 1)) {
        j = 1;
      }
      for (;;)
      {
        if (k > 60) {
          k = 60;
        }
        for (;;)
        {
          x.i("MicroMsg.GameJsApiChooseVideo", "doChooseVideo real scene = %d, select count = %d, video quality = %d, duration = %d", new Object[] { Integer.valueOf(i), Integer.valueOf(1), Integer.valueOf(j), Integer.valueOf(k) });
          paramJSONObject = new Intent();
          paramJSONObject.putExtra("key_pick_local_pic_capture", i);
          paramJSONObject.putExtra("key_pick_local_pic_count", 1);
          paramJSONObject.putExtra("key_pick_local_pic_query_source_type", 7);
          paramJSONObject.putExtra("key_pick_local_media_quality", j);
          paramJSONObject.putExtra("key_pick_local_media_duration", k);
          paramJSONObject.putExtra("query_media_type", 2);
          paramJSONObject.putExtra("key_pick_local_media_video_type", paramInt2);
          x.i("MicroMsg.GameJsApiChooseVideo", "doChooseVideo: realScene: %d, count: %d, querySourceType: %d", new Object[] { Integer.valueOf(i), Integer.valueOf(1), Integer.valueOf(7) });
          localGameWebViewUI.geJ = new j.1(paramd, paramInt1);
          if (paramInt2 == 1)
          {
            com.tencent.mm.bg.d.a(localGameWebViewUI, "webview", ".ui.tools.OpenFileChooserUI", paramJSONObject, 45, false);
            return;
            i = j | 0x100;
            break;
            bool = com.tencent.mm.pluginsdk.permission.a.a(localGameWebViewUI, "android.permission.CAMERA", 115, "", "");
            x.d("MicroMsg.GameJsApiChooseVideo", " checkPermission checkcamera[%b]", new Object[] { Boolean.valueOf(bool) });
            if (bool) {
              break label267;
            }
            return;
          }
          com.tencent.mm.bg.d.a(localGameWebViewUI, "webview", ".ui.tools.OpenFileChooserUI", paramJSONObject, 32, false);
          return;
        }
      }
    }
  }
  
  public final void a(com.tencent.mm.plugin.game.gamewebview.ui.d paramd, JSONObject paramJSONObject, int paramInt)
  {
    x.i("MicroMsg.GameJsApiChooseVideo", "invoke");
    if (paramJSONObject == null)
    {
      paramd.E(paramInt, com.tencent.mm.plugin.game.gamewebview.jsapi.a.f("chooseVideo:fail_invalid_data", null));
      return;
    }
    a(paramd, paramJSONObject, paramInt, 0);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/jsapi/biz/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */