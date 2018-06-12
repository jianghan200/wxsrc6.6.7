package com.tencent.mm.plugin.topstory.ui.home;

import com.tencent.mm.plugin.topstory.ui.webview.TopStoryWebView;
import com.tencent.mm.plugin.topstory.ui.webview.a;
import com.tencent.mm.plugin.topstory.ui.webview.b.a;
import com.tencent.mm.plugin.topstory.ui.webview.c;
import com.tencent.mm.protocal.c.bte;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.ad;

public final class d
{
  private bte ozF;
  private com.tencent.mm.plugin.topstory.ui.webview.b ozG;
  private TopStoryWebView ozH;
  private com.tencent.mm.plugin.topstory.ui.webview.d ozI;
  boolean ozJ = false;
  
  public final void a(b paramb)
  {
    paramb.a(this.ozG, this.ozH, this.ozI, this.ozF);
    this.ozG = null;
    this.ozH = null;
    this.ozI = null;
    this.ozF = null;
    this.ozJ = false;
  }
  
  public final void a(bte parambte)
  {
    if (!this.ozJ)
    {
      this.ozJ = true;
      com.tencent.mm.plugin.topstory.ui.d.c(parambte, "startCreateWB", System.currentTimeMillis());
      this.ozF = parambte;
      this.ozG = new com.tencent.mm.plugin.topstory.ui.webview.b();
      Object localObject = new b.a(this.ozG, (byte)0);
      ((b.a)localObject).oCx = "";
      e.post((Runnable)localObject, "TopStory.LoadHtmlDataFromSdcardTask");
      this.ozG.a(parambte, false);
      this.ozH = new TopStoryWebView(ad.getContext());
      localObject = new a();
      c localc = new c(parambte, this.ozG);
      this.ozI = new com.tencent.mm.plugin.topstory.ui.webview.d(this.ozH, parambte, this.ozG);
      this.ozH.a((a)localObject, localc);
      this.ozH.addJavascriptInterface(this.ozI, "topStoryJSApi");
      localObject = this.ozG.oCt;
      if (localObject != null)
      {
        this.ozH.loadDataWithBaseURL(parambte.url, new String((byte[])localObject), "text/html", "utf-8", null);
        this.ozG.oCt = null;
        com.tencent.mm.plugin.topstory.ui.d.c(parambte, "endCreateWBWithLoadData", System.currentTimeMillis());
      }
    }
    else
    {
      return;
    }
    this.ozH.loadUrl(parambte.url);
    com.tencent.mm.plugin.topstory.ui.d.c(parambte, "endCreateWBWithLoadURL", System.currentTimeMillis());
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/topstory/ui/home/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */