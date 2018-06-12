package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.g.a.pz;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.game.gamewebview.model.h;
import com.tencent.mm.plugin.game.gamewebview.ui.GameWebViewUI;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONObject;

public final class ay
  extends com.tencent.mm.plugin.game.gamewebview.jsapi.a
{
  public static final int CTRL_BYTE = 4;
  public static final String NAME = "shareTimeline";
  
  public final void a(com.tencent.mm.plugin.game.gamewebview.ui.d paramd, JSONObject paramJSONObject, int paramInt)
  {
    x.i("MicroMsg.GameJsApiSendAppMessage", "invoke");
    GameWebViewUI localGameWebViewUI = paramd.getPageActivity();
    if (paramJSONObject == null)
    {
      x.e("MicroMsg.GameJsApiSendAppMessage", "sendAppMessage fail, appmsg is null");
      paramd.E(paramInt, com.tencent.mm.plugin.game.gamewebview.jsapi.a.f("share_timeline:fail_null_params", null));
      return;
    }
    Object localObject = paramJSONObject.optString("link");
    if (bi.oW((String)localObject))
    {
      x.e("MicroMsg.GameJsApiSendAppMessage", "link is null");
      paramd.E(paramInt, com.tencent.mm.plugin.game.gamewebview.jsapi.a.f("share_timeline:fail_invalid_params", null));
      return;
    }
    h.a(paramd, paramJSONObject);
    String str1 = paramJSONObject.optString("desc");
    if (str1 != null)
    {
      if (!str1.startsWith("http://")) {
        break label810;
      }
      str1.substring(7);
    }
    for (;;)
    {
      int k = 1;
      str1 = "";
      int j = 0;
      if (this.jGp != null)
      {
        this.jGp.setClassLoader(getClass().getClassLoader());
        k = this.jGp.getInt("snsWebSource", 1);
        str1 = this.jGp.getString("jsapi_args_appid");
        j = bi.getInt(this.jGp.getString("urlAttribute"), 0);
        this.jGp.remove("urlAttribute");
      }
      String str2 = str1;
      if (bi.oW(str1)) {
        str2 = paramJSONObject.optString("appid");
      }
      String str8 = paramJSONObject.optString("img_width");
      String str9 = paramJSONObject.optString("img_height");
      str1 = paramd.Dp((String)localObject);
      x.i("MicroMsg.GameJsApiSendAppMessage", "doTimeline, rawUrl:[%s], shareUrl:[%s]", new Object[] { localObject, str1 });
      String str3 = paramJSONObject.optString("type");
      String str4 = paramJSONObject.optString("title");
      String str5 = paramJSONObject.optString("img_url");
      String str6 = paramJSONObject.optString("src_username");
      String str7 = paramJSONObject.optString("src_displayname");
      i = -1;
      try
      {
        m = Integer.valueOf(str8).intValue();
        i = m;
        Integer.valueOf(str9);
      }
      catch (Exception paramJSONObject)
      {
        for (;;)
        {
          int m = i;
          continue;
          boolean bool = false;
        }
      }
      paramJSONObject = new Intent();
      paramJSONObject.putExtra("Ksnsupload_width", m);
      paramJSONObject.putExtra("Ksnsupload_height", m);
      paramJSONObject.putExtra("Ksnsupload_link", str1);
      paramJSONObject.putExtra("Ksnsupload_title", str4);
      paramJSONObject.putExtra("Ksnsupload_imgurl", str5);
      paramJSONObject.putExtra("Ksnsupload_contentattribute", j);
      if (s.hf(str6))
      {
        paramJSONObject.putExtra("src_username", str6);
        paramJSONObject.putExtra("src_displayname", str7);
      }
      paramJSONObject.putExtra("Ksnsupload_source", k);
      paramJSONObject.putExtra("Ksnsupload_type", 1);
      if ((!bi.oW(str3)) && (str3.equals("music"))) {
        paramJSONObject.putExtra("ksnsis_music", true);
      }
      if ((!bi.oW(str3)) && (str3.equals("video"))) {
        paramJSONObject.putExtra("ksnsis_video", true);
      }
      if ((str2 != null) && (str2.length() > 0)) {
        paramJSONObject.putExtra("Ksnsupload_appid", str2);
      }
      if (this.jGp != null) {
        break;
      }
      bool = true;
      x.i("MicroMsg.GameJsApiSendAppMessage", "doTimeline, init intent, jsapiArgs == null ? %b", new Object[] { Boolean.valueOf(bool) });
      if (this.jGp != null)
      {
        str3 = this.jGp.getString("K_sns_thumb_url");
        str4 = this.jGp.getString("K_sns_raw_url");
        str1 = bi.aG(this.jGp.getString("KSnsStrId"), "");
        str2 = bi.aG(this.jGp.getString("KSnsLocalId"), "");
        paramJSONObject.putExtra("key_snsad_statextstr", this.jGp.getString("key_snsad_statextstr"));
        x.i("MicroMsg.GameJsApiSendAppMessage", "currentUrl %s contentUrl %s thumbUrl %s", new Object[] { localObject, str4, str3 });
        if ((str4 != null) && (localObject != null) && (str4.equals(localObject))) {
          paramJSONObject.putExtra("KlinkThumb_url", str3);
        }
        paramJSONObject.putExtra("KSnsStrId", str1);
        paramJSONObject.putExtra("KSnsLocalId", str2);
        if ((str1 != null) && (this.jGp.getBoolean("KFromTimeline", false)))
        {
          localObject = new pz();
          ((pz)localObject).caF.bSZ = str1;
          ((pz)localObject).caF.bKW = str2;
          com.tencent.mm.sdk.b.a.sFg.m((b)localObject);
        }
      }
      paramJSONObject.putExtra("ShareUrlOriginal", paramd.getRawUrl());
      paramJSONObject.putExtra("ShareUrlOpen", paramd.getCurrentURL());
      paramJSONObject.putExtra("JsAppId", paramd.getCacheAppId());
      paramJSONObject.putExtra("need_result", true);
      x.i("MicroMsg.GameJsApiSendAppMessage", "doTimeline, start activity");
      localGameWebViewUI.geJ = new ay.1(this, paramd, paramInt);
      com.tencent.mm.bg.d.a(localGameWebViewUI, "sns", ".ui.SnsUploadUI", paramJSONObject, 2, false);
      return;
      label810:
      if (str1.startsWith("https://")) {
        str1.substring(8);
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/jsapi/biz/ay.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */