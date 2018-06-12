package com.tencent.mm.plugin.webview.model;

import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;

public final class ae
{
  private static ae pRO = new ae();
  HashMap<String, WebViewJSSDKFileItem> pRP = new HashMap();
  
  public static final ae bUk()
  {
    return pRO;
  }
  
  public final WebViewJSSDKFileItem Qq(String paramString)
  {
    if (bi.oW(paramString))
    {
      x.e("MicroMsg.WebViewJSSDKFileItemManager", "get by local id error, local id is null or nil");
      return null;
    }
    return (WebViewJSSDKFileItem)this.pRP.get(paramString);
  }
  
  public final void b(WebViewJSSDKFileItem paramWebViewJSSDKFileItem)
  {
    if ((paramWebViewJSSDKFileItem == null) || (bi.oW(paramWebViewJSSDKFileItem.bNH)))
    {
      x.e("MicroMsg.WebViewJSSDKFileItemManager", "item is null or local id is null, ignore this add");
      return;
    }
    x.i("MicroMsg.WebViewJSSDKFileItemManager", "add jssdk file item, local id : %s, file path : %s", new Object[] { paramWebViewJSSDKFileItem.bNH, paramWebViewJSSDKFileItem.fnM });
    this.pRP.put(paramWebViewJSSDKFileItem.bNH, paramWebViewJSSDKFileItem);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/webview/model/ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */