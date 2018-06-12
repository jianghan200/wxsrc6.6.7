package com.tencent.mm.plugin.game.gamewebview.model;

import android.os.Bundle;
import com.tencent.mm.plugin.game.gamewebview.ipc.a;
import com.tencent.mm.plugin.webview.model.d.a;
import com.tencent.mm.sdk.platformtools.x;

public final class d
  implements d.a
{
  public final void a(boolean paramBoolean, int paramInt1, int paramInt2, String paramString1, String paramString2)
  {
    x.i("MicroMsg.GameWebViewCdnProgressCallback", "onWebView cdn callback progress, upload : %b, mediaType : %d, percent : %d, localid : %s, mediaId : %s", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString1, paramString2 });
    if (paramBoolean)
    {
      paramString2 = new Bundle();
      paramString2.putInt("mm_to_client_notify_type", 1);
      paramString2.putString("js_event_name", "onMediaFileUploadProgress");
      paramString2.putString("webview_jssdk_file_item_local_id", paramString1);
      paramString2.putInt("webview_jssdk_file_item_progreess", paramInt2);
      a.z(paramString2);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/model/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */