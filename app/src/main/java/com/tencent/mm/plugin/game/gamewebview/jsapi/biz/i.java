package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.content.Intent;
import com.tencent.mm.plugin.game.gamewebview.ui.GameWebViewUI;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity.a;
import com.tencent.mm.ui.tools.k;
import org.json.JSONObject;

public final class i
  extends com.tencent.mm.plugin.game.gamewebview.jsapi.a
{
  public static final int CTRL_BYTE = 254;
  public static final String NAME = "chooseMedia";
  private MMActivity.a fEk = new i.4(this);
  int fFw;
  GameWebViewUI jGT;
  com.tencent.mm.plugin.game.gamewebview.ui.d jGU;
  
  final void K(Intent paramIntent)
  {
    x.i("MicroMsg.GameJsApiChooseMedia", "chooseMediaFromAlbum");
    paramIntent.putExtra("key_pick_local_pic_capture", 4096);
    this.jGT.geJ = this.fEk;
    com.tencent.mm.bg.d.a(this.jGT, "webview", ".ui.tools.OpenFileChooserUI", paramIntent, 0xFFFF & hashCode(), false);
  }
  
  public final void a(com.tencent.mm.plugin.game.gamewebview.ui.d paramd, JSONObject paramJSONObject, int paramInt)
  {
    x.i("MicroMsg.GameJsApiChooseMedia", "invoke");
    if (paramJSONObject == null)
    {
      x.i("MicroMsg.GameJsApiChooseMedia", "data is null");
      paramd.E(paramInt, com.tencent.mm.plugin.game.gamewebview.jsapi.a.f("doChooseMedia:fail_invalid_data", null));
      return;
    }
    this.jGU = paramd;
    this.fFw = paramInt;
    this.jGT = paramd.getPageActivity();
    boolean bool1 = com.tencent.mm.pluginsdk.permission.a.a(this.jGT, "android.permission.CAMERA", 119, "", "");
    x.i("MicroMsg.GameJsApiChooseMedia", " checkPermission checkcamera[%b]", new Object[] { Boolean.valueOf(bool1) });
    boolean bool2 = com.tencent.mm.pluginsdk.permission.a.a(this.jGT, "android.permission.RECORD_AUDIO", 120, "", "");
    x.i("MicroMsg.GameJsApiChooseMedia", " checkPermission checkMicroPhone[%b]", new Object[] { Boolean.valueOf(bool2) });
    if ((!bool2) || (!bool1))
    {
      paramd.E(paramInt, com.tencent.mm.plugin.game.gamewebview.jsapi.a.f("doChooseMedia:fail_no_user_permission", null));
      return;
    }
    String str1 = bi.oV(paramJSONObject.optString("sourceType"));
    String str3 = paramJSONObject.optString("mediaType", "");
    int j = Math.min(paramJSONObject.optInt("maxDuration", 10), 10);
    String str2 = paramJSONObject.optString("camera", "");
    int i = paramJSONObject.optInt("count", 1);
    paramJSONObject = paramJSONObject.optString("sizeType", "");
    x.i("MicroMsg.GameJsApiChooseMedia", "doChooseMedia sourceType:%s, mediaType:%s, maxDuration:%d, camera:%s, count:%d, sizeType:%s", new Object[] { str1, str3, Integer.valueOf(j), str2, Integer.valueOf(i), paramJSONObject });
    Intent localIntent = new Intent();
    localIntent.putExtra("key_pick_local_pic_count", i);
    i = j;
    if (j <= 0) {
      i = 10;
    }
    localIntent.putExtra("key_pick_local_media_duration", i);
    localIntent.putExtra("query_media_type", 3);
    localIntent.putExtra("key_pick_local_media_video_type", 2);
    localIntent.putExtra("key_pick_local_media_sight_type", str3);
    if ((paramJSONObject.contains("original") ^ paramJSONObject.contains("compressed")))
    {
      i = 7;
      localIntent.putExtra("key_pick_local_pic_query_source_type", i);
      if (!paramJSONObject.contains("compressed")) {
        break label471;
      }
      bool1 = true;
      label365:
      localIntent.putExtra("key_pick_local_pic_send_raw", Boolean.valueOf(bool1));
      if (!bi.oW(str1)) {
        break label523;
      }
    }
    label471:
    label523:
    for (paramJSONObject = "album|camera";; paramJSONObject = str1)
    {
      if ((paramJSONObject.contains("album")) && (paramJSONObject.contains("camera")))
      {
        paramJSONObject = new k(this.jGT);
        paramJSONObject.b(null, new i.1(this), new i.2(this, str2, localIntent));
        paramJSONObject.d(new i.3(this, paramd, paramInt));
        paramJSONObject.bEo();
        return;
        i = 8;
        break;
        bool1 = false;
        break label365;
      }
      if (paramJSONObject.contains("album"))
      {
        K(localIntent);
        return;
      }
      if (paramJSONObject.contains("camera"))
      {
        a(str2, localIntent);
        return;
      }
      paramd.E(paramInt, com.tencent.mm.plugin.game.gamewebview.jsapi.a.f("chooseMedia:fail_sourceType_error", null));
      return;
    }
  }
  
  final void a(String paramString, Intent paramIntent)
  {
    x.i("MicroMsg.GameJsApiChooseMedia", "chooseMediaFromCamera");
    if (paramString.equals("front")) {}
    for (int i = 16;; i = 256)
    {
      paramIntent.putExtra("key_pick_local_pic_capture", i);
      this.jGT.geJ = this.fEk;
      com.tencent.mm.bg.d.a(this.jGT, "webview", ".ui.tools.OpenFileChooserUI", paramIntent, 0xFFFF & hashCode(), false);
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/jsapi/biz/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */