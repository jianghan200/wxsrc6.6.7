package com.tencent.mm.plugin.appbrand.dynamic.e;

import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.e;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.xweb.WebView;
import com.tencent.xweb.r;
import com.tencent.xweb.x5.sdk.d;
import java.util.LinkedList;
import java.util.List;

public final class c
{
  private static volatile boolean dpg;
  private static final List<a> fwO = new LinkedList();
  
  public static boolean a(a parama)
  {
    if (fwO.contains(parama)) {
      return false;
    }
    if (dpg)
    {
      parama.aaS();
      return true;
    }
    return fwO.add(parama);
  }
  
  public static void initialize()
  {
    if (dpg) {
      return;
    }
    c.1 local1 = new c.1();
    c.2 local2 = new c.2();
    c.3 local3 = new c.3();
    r.a(ad.getContext(), local1, local2, local3);
    if (e.chv()) {
      d.forceSysWebView();
    }
    WebView.initWebviewCore(ad.getContext(), MMWebView.uHn, "support", new c.4());
  }
  
  public static abstract interface a
  {
    public abstract void aaS();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/e/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */