package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import com.tencent.mm.ak.c;
import com.tencent.mm.ak.o;
import com.tencent.mm.sdk.platformtools.bi;

public final class k
{
  public static void RQ(String paramString)
  {
    if ((!bi.oW(paramString)) && (paramString.startsWith("http"))) {
      o.Pe().a(paramString, null);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/webview/ui/tools/jsapi/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */