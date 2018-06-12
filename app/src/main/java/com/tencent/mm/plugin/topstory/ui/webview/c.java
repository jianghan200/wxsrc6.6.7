package com.tencent.mm.plugin.topstory.ui.webview;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.mm.plugin.topstory.ui.d;
import com.tencent.mm.protocal.c.bte;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.xweb.WebView;
import com.tencent.xweb.l;
import com.tencent.xweb.m;
import com.tencent.xweb.p;
import java.io.ByteArrayInputStream;

public final class c
  extends p
{
  private bte ccA;
  private b oCA;
  
  public c(bte parambte, b paramb)
  {
    this.ccA = parambte;
    this.oCA = paramb;
  }
  
  private m Ow(String paramString)
  {
    m localm = null;
    byte[] arrayOfByte;
    boolean bool;
    if (paramString.startsWith("file:///data/data/com.tencent.mm/files/public/fts_browse/res/app.html"))
    {
      arrayOfByte = this.oCA.oCt;
      this.oCA.oCt = null;
      if (arrayOfByte == null) {
        break label198;
      }
      localm = new m("text/html", "utf8", new ByteArrayInputStream(arrayOfByte));
      bool = true;
    }
    for (;;)
    {
      if (bool) {
        x.i("MicroMsg.TopStory.TopStoryWebViewClient", "tryToGetResourceFromCache useMemoryCache: %b url: %s", new Object[] { Boolean.valueOf(bool), paramString });
      }
      return localm;
      if (paramString.startsWith("file:///data/data/com.tencent.mm/files/public/fts_browse/res/dist/style.css"))
      {
        arrayOfByte = this.oCA.oCv;
        this.oCA.oCv = null;
        if (arrayOfByte != null)
        {
          localm = new m("text/css", "utf8", new ByteArrayInputStream(arrayOfByte));
          bool = true;
        }
      }
      else if (paramString.startsWith("file:///data/data/com.tencent.mm/files/public/fts_browse/res/dist/build.js"))
      {
        arrayOfByte = this.oCA.oCu;
        this.oCA.oCu = null;
        if (arrayOfByte != null)
        {
          localm = new m("application/x-javascript", "utf8", new ByteArrayInputStream(arrayOfByte));
          bool = true;
          continue;
        }
      }
      label198:
      bool = false;
    }
  }
  
  public final m a(WebView paramWebView, l paraml)
  {
    m localm2 = Ow(paraml.getUrl().toString());
    m localm1 = localm2;
    if (localm2 == null) {
      localm1 = super.a(paramWebView, paraml);
    }
    return localm1;
  }
  
  public final m a(WebView paramWebView, l paraml, Bundle paramBundle)
  {
    m localm2 = Ow(paraml.getUrl().toString());
    m localm1 = localm2;
    if (localm2 == null) {
      localm1 = super.a(paramWebView, paraml, paramBundle);
    }
    return localm1;
  }
  
  public final void a(WebView paramWebView, String paramString)
  {
    x.i("MicroMsg.TopStory.TopStoryWebViewClient", "onPageFinished %s  %d", new Object[] { paramString, Long.valueOf(Thread.currentThread().getId()) });
    super.a(paramWebView, paramString);
    d.c(this.ccA, "pageFinish", System.currentTimeMillis());
  }
  
  public final void b(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    d.c(this.ccA, "pageStart", System.currentTimeMillis());
    x.i("MicroMsg.TopStory.TopStoryWebViewClient", "onPageStarted %s %d", new Object[] { paramString, Long.valueOf(Thread.currentThread().getId()) });
    super.b(paramWebView, paramString, paramBitmap);
  }
  
  public final boolean b(WebView paramWebView, String paramString)
  {
    x.i("MicroMsg.TopStory.TopStoryWebViewClient", "shouldOverrideUrlLoading %s", new Object[] { paramString });
    return super.b(paramWebView, paramString);
  }
  
  public final m c(WebView paramWebView, String paramString)
  {
    m localm2 = Ow(paramString);
    m localm1 = localm2;
    if (localm2 == null) {
      localm1 = super.c(paramWebView, paramString);
    }
    return localm1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/topstory/ui/webview/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */