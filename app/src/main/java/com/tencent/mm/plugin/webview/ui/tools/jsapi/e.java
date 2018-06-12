package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.util.Base64;
import com.tencent.mm.pluginsdk.ui.tools.s;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.widget.MMWebView;

public final class e
  implements b
{
  private MMWebView dEn;
  private d qfM;
  
  public e(MMWebView paramMMWebView, d paramd)
  {
    this.dEn = paramMMWebView;
    this.qfM = paramd;
  }
  
  public final boolean Dt(String paramString)
  {
    if (bi.oW(paramString)) {
      return false;
    }
    return s.fj(paramString, "weixin://private/setresult/");
  }
  
  public final boolean Du(String paramString)
  {
    Object localObject = null;
    if (this.dEn != null) {
      this.dEn.evaluateJavascript("javascript:WeixinJSBridge._continueSetResult()", null);
    }
    paramString = paramString.substring(27);
    if (bi.oW(paramString))
    {
      x.e("MicroMsg.JsApiResultHandler", "SetResultHandler handleUrl fail, value is null");
      return false;
    }
    int i = paramString.indexOf("&");
    if (i <= 0)
    {
      x.e("MicroMsg.JsApiResultHandler", "SetResultHandler, handleUrl fail, invalid splitorIdx = %d", new Object[] { Integer.valueOf(i) });
      return false;
    }
    String str = paramString.substring(0, i);
    try
    {
      paramString = Base64.decode(paramString.substring(i + 1), 0);
      if (paramString == null)
      {
        paramString = (String)localObject;
        x.i("MicroMsg.JsApiResultHandler", "SetResultHandler, scene = %s, result = %s", new Object[] { str, paramString });
        this.qfM.keep_setReturnValue(str, paramString);
        return true;
      }
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        x.e("MicroMsg.JsApiResultHandler", "SetResultHandler decodeBase64 failed");
        paramString = null;
        continue;
        paramString = new String(paramString);
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/webview/ui/tools/jsapi/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */