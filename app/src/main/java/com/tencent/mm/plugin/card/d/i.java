package com.tencent.mm.plugin.card.d;

import android.text.TextUtils;
import com.tencent.mm.plugin.card.model.f;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONException;
import org.json.JSONObject;

public final class i
{
  public static f xT(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
    {
      x.e("MicroMsg.CardMallItemParser", "parseCardMallItem jsonContent is null");
      return null;
    }
    try
    {
      paramString = new JSONObject(paramString);
      f localf = new f();
      localf.hwk = paramString.optString("empty_tips");
      localf.hwl = paramString.optString("shoppingmall_title");
      localf.hwm = paramString.optString("shoppingmall_url");
      if (paramString.optInt("is_show") == 0) {}
      for (boolean bool = false;; bool = true)
      {
        localf.hwn = bool;
        return localf;
      }
      return null;
    }
    catch (JSONException paramString)
    {
      x.printErrStackTrace("MicroMsg.CardMallItemParser", paramString, "", new Object[0]);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/card/d/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */