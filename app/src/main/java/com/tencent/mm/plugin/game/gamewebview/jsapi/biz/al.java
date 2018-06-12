package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.content.Intent;
import android.text.TextUtils;
import com.tencent.mm.a.e;
import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity.a;
import org.json.JSONObject;

public final class al
  extends a
{
  public static final int CTRL_BYTE = 252;
  public static final String NAME = "previewVideo";
  
  public final void a(final com.tencent.mm.plugin.game.gamewebview.ui.d paramd, JSONObject paramJSONObject, final int paramInt)
  {
    x.i("MicroMsg.GameJsApiPreviewVideo", "invoke");
    if ((paramJSONObject == null) || (bi.oW(paramJSONObject.optString("localId"))))
    {
      x.i("MicroMsg.GameJsApiPreviewVideo", "data is invalid");
      paramd.E(paramInt, a.f("previewVideo:fail_invalid_data", null));
      return;
    }
    Object localObject = paramJSONObject.optString("localId");
    paramJSONObject = com.tencent.mm.plugin.game.gamewebview.a.d.Db((String)localObject);
    if ((paramJSONObject == null) || (TextUtils.isEmpty(paramJSONObject.fnM)) || (!e.cn(paramJSONObject.fnM)))
    {
      x.e("MicroMsg.GameJsApiPreviewVideo", "the item is null or the File item not exist for localId: %s", new Object[] { localObject });
      paramd.E(paramInt, a.f("previewVideo:fail", null));
      return;
    }
    localObject = new Intent();
    ((Intent)localObject).putExtra("key_video_path", paramJSONObject.fnM);
    paramJSONObject = paramd.getPageActivity();
    paramJSONObject.geJ = new MMActivity.a()
    {
      public final void b(int paramAnonymousInt1, int paramAnonymousInt2, Intent paramAnonymousIntent)
      {
        if (paramAnonymousInt1 == (al.this.hashCode() & 0xFFFF)) {}
        switch (paramAnonymousInt2)
        {
        default: 
          paramd.E(paramInt, a.f("previewVideo:fail", null));
          return;
        case 0: 
          paramd.E(paramInt, a.f("previewVideo:cancel", null));
          return;
        }
        paramd.E(paramInt, a.f("previewVideo:ok", null));
      }
    };
    com.tencent.mm.bg.d.b(paramJSONObject, "card", ".ui.CardGiftVideoUI", (Intent)localObject, hashCode() & 0xFFFF);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/jsapi/biz/al.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */