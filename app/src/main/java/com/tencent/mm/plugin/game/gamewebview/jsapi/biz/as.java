package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.os.Bundle;
import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import com.tencent.mm.plugin.game.gamewebview.ui.e;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONObject;

public final class as
  extends a
{
  public static final int CTRL_BYTE = 77;
  public static final String NAME = "setCloseWindowConfirmDialogInfo";
  
  public final void a(d paramd, JSONObject paramJSONObject, int paramInt)
  {
    x.i("MicroMsg.GameJsApiSetCloseWindowConfirmDialogInfo", "invoke");
    if (paramJSONObject == null)
    {
      x.e("MicroMsg.GameJsApiSetCloseWindowConfirmDialogInfo", "data is null");
      paramd.E(paramInt, a.f("setCloseWindowConfirmDialogInfo:fail_invalid_data", null));
    }
    boolean bool;
    String str1;
    String str2;
    String str3;
    String str4;
    String str5;
    e locale;
    do
    {
      return;
      bool = paramJSONObject.optBoolean("switch");
      str1 = paramJSONObject.optString("title_cn");
      str2 = paramJSONObject.optString("title_eng");
      str3 = paramJSONObject.optString("ok_cn");
      str4 = paramJSONObject.optString("ok_eng");
      str5 = paramJSONObject.optString("cancel_cn");
      paramJSONObject = paramJSONObject.optString("cancel_eng");
      locale = paramd.getActionBar();
    } while (locale == null);
    Bundle localBundle = new Bundle();
    localBundle.putBoolean("close_window_confirm_dialog_switch", Boolean.valueOf(bool).booleanValue());
    localBundle.putString("close_window_confirm_dialog_title_cn", str1);
    localBundle.putString("close_window_confirm_dialog_title_eng", str2);
    localBundle.putString("close_window_confirm_dialog_ok_cn", str3);
    localBundle.putString("close_window_confirm_dialog_ok_eng", str4);
    localBundle.putString("close_window_confirm_dialog_cancel_cn", str5);
    localBundle.putString("close_window_confirm_dialog_cancel_eng", paramJSONObject);
    locale.setCloseWindowConfirmInfo(localBundle);
    paramd.E(paramInt, a.f("setCloseWindowConfirmDialogInfo:ok", null));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/jsapi/biz/as.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */